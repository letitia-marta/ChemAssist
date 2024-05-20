package com.example.chemassist;

import java.util.HashMap;
import java.util.Map;

public class ChemicalBalancer
{
    public static String balanceChemicalEquation (String reactants, String products)
    {
        try
        {
            String[] reactantArray = reactants.split("\\+");
            String[] productArray = products.split("\\+");

            for (int i = 0; i < reactantArray.length; i++)
                reactantArray[i] = reactantArray[i].trim();

            for (int i = 0; i < productArray.length; i++)
                productArray[i] = productArray[i].trim();

            Map<String, Integer> reactantCountMap = new HashMap<>();
            Map<String, Integer> productCountMap = new HashMap<>();

            for (String reactant : reactantArray)
                countAtoms(reactant, reactantCountMap);

            for (String product : productArray)
                countAtoms(product, productCountMap);

            Map<String, Integer> elementIndexMap = new HashMap<>();
            int index = 0;
            for (String element : reactantCountMap.keySet())
                if (!elementIndexMap.containsKey(element))
                    elementIndexMap.put(element, index++);

            for (String element : productCountMap.keySet())
                if (!elementIndexMap.containsKey(element))
                    elementIndexMap.put(element, index++);

            int elementCount = elementIndexMap.size();
            int reactantCount = reactantArray.length;
            int productCount = productArray.length;

            double[][] matrix = new double[elementCount][reactantCount + productCount];

            for (int i = 0; i < reactantCount; i++)
            {
                String reactant = reactantArray[i];
                Map<String, Integer> atomCounts = new HashMap<>();
                countAtoms(reactant, atomCounts);
                for (Map.Entry<String, Integer> entry : atomCounts.entrySet())
                    matrix[elementIndexMap.get(entry.getKey())][i] = entry.getValue();
            }

            for (int i = 0; i < productCount; i++)
            {
                String product = productArray[i];
                Map<String, Integer> atomCounts = new HashMap<>();
                countAtoms(product, atomCounts);
                for (Map.Entry<String, Integer> entry : atomCounts.entrySet())
                    matrix[elementIndexMap.get(entry.getKey())][reactantCount + i] = -entry.getValue();
            }

            double[] coefficients = solveGaussian(matrix);

            if (coefficients == null)
                return "Unable to balance the equation.";

            StringBuilder balancedEquation = new StringBuilder();

            for (int i = 0; i < reactantCount; i++)
            {
                if (coefficients[i] != 1)
                    balancedEquation.append((int) coefficients[i]);
                balancedEquation.append(reactantArray[i]);
                if (i < reactantCount - 1)
                    balancedEquation.append(" + ");
            }

            balancedEquation.append(" -> ");

            for (int i = 0; i < productCount; i++)
            {
                if (coefficients[reactantCount + i] != 1)
                    balancedEquation.append((int) coefficients[reactantCount + i]);
                balancedEquation.append(productArray[i]);
                if (i < productCount - 1)
                    balancedEquation.append(" + ");
            }

            return balancedEquation.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    private static void countAtoms (String molecule, Map<String, Integer> countMap)
    {
        int n = molecule.length();
        for (int i = 0; i < n; )
        {
            StringBuilder element = new StringBuilder();
            element.append(molecule.charAt(i));
            i++;
            if (i < n && Character.isLowerCase(molecule.charAt(i)))
            {
                element.append(molecule.charAt(i));
                i++;
            }

            StringBuilder number = new StringBuilder();
            while (i < n && Character.isDigit(molecule.charAt(i)))
            {
                number.append(molecule.charAt(i));
                i++;
            }

            int count = number.length() > 0 ? Integer.parseInt(number.toString()) : 1;
            String elementStr = element.toString();

            countMap.put(elementStr, countMap.getOrDefault(elementStr, 0) + count);

            for (Map.Entry<String, Integer> entry : countMap.entrySet())
            {
                String el = entry.getKey();
                int ct = entry.getValue();
                System.out.println(el + ": " + ct);
            }
        }
    }

    private static double[] solveGaussian (double[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        double[] solution = new double[m];

        // eliminare Gaussiana
        for (int i = 0; i < n; i++)
        {
            int maxRow = i;
            for (int k = i + 1; k < n; k++)
                if (Math.abs(matrix[k][i]) > Math.abs(matrix[maxRow][i]))
                    maxRow = k;

            double[] temp = matrix[i];
            matrix[i] = matrix[maxRow];
            matrix[maxRow] = temp;

            for (int k = i + 1; k < n; k++)
            {
                double factor = matrix[k][i] / matrix[i][i];
                for (int j = i; j < m; j++)
                    matrix[k][j] -= factor * matrix[i][j];
            }
        }

        // Back-substitution
        for (int i = n - 1; i >= 0; i--)
        {
            double sum = 0;
            for (int j = i + 1; j < m - 1; j++)
                sum += matrix[i][j] * solution[j];
            solution[i] = (matrix[i][m - 1] - sum) / matrix[i][i];
        }

        double cmmmc = 1.0;

        for (double coeff : solution)
            if (coeff != 0)
                cmmmc = cmmmc(cmmmc, Math.abs(1 / coeff));

        for (int i = 0; i < solution.length; i++)
        {
            if (solution[i] != 0)
            {
                solution[i] = Math.round(solution[i] * cmmmc);
                if (solution[i] < 0)
                    solution[i] = -solution[i];
            }
            else
            {
                solution[i] = 1;
                solution[i] = Math.round(solution[i] * cmmmc);
            }
        }

        return solution;
    }

    private static double cmmmc (double a, double b)
    {
        return a * (b / cmmdc(a, b));
    }

    private static double cmmdc (double a, double b)
    {
        while (b > 0) {
            double temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
