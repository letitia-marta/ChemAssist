package com.example.chemassist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        GridLayout gridLayout = findViewById(R.id.table_grid);

        for (int i = 0; i < gridLayout.getChildCount(); i++)
        {
            View child = gridLayout.getChildAt(i);
            if (child instanceof Button)
            {
                Button button = (Button) child;
                final String elementName = button.getText().toString();
                button.setOnClickListener (new View.OnClickListener()
                {
                    @Override
                    public void onClick (View v)
                    {
                        showElementDetails(elementName);
                    }
                });
            }
        }
    }

    private void showElementDetails (String elementName)
    {
        String detalii = "";
        if (elementName.equals("H"))
            detalii = "hidrogen   Z = 1   A = 1";
        else if (elementName.equals("He"))
            detalii = "heliu   Z = 2   A = 4";
        else if (elementName.equals("Li"))
            detalii = "litiu   Z = 3   A = 6";
        else if (elementName.equals("Be"))
            detalii = "beriliu   Z = 4   A = 10";
        else if (elementName.equals("B"))
            detalii = "bor   Z = 5   A = 11";
        else if (elementName.equals("C"))
            detalii = "carbon   Z = 6   A = 12";
        else if (elementName.equals("N"))
            detalii = "azot   Z = 7   A = 14";
        else if (elementName.equals("O"))
            detalii = "oxigen   Z = 8   A = 16";
        else if (elementName.equals("F"))
            detalii = "fluor   Z = 9   A = 19";
        else if (elementName.equals("Ne"))
            detalii = "neon   Z = 10   A = 20";
        else if (elementName.equals("Na"))
            detalii = "sodiu   Z = 11   A = 23";
        else if (elementName.equals("Mg"))
            detalii = "magneziu   Z = 12   A = 24";
        else if (elementName.equals("Al"))
            detalii = "aluminiu   Z = 13   A = 27";
        else if (elementName.equals("Si"))
            detalii = "siliciu   Z = 14   A = 28";
        else if (elementName.equals("P"))
            detalii = "fosfor   Z = 15   A = 31";
        else if (elementName.equals("S"))
            detalii = "sulf   Z = 16   A = 32";
        else if (elementName.equals("Cl"))
            detalii = "clor   Z = 17   A = 35.5";
        else if (elementName.equals("Ar"))
            detalii = "argon   Z = 18   A = 40";
        else if (elementName.equals("K"))
            detalii = "potasiu   Z = 19   A = 39";
        else if (elementName.equals("Ca"))
            detalii = "calciu   Z = 20   A = 40";
        else if (elementName.equals("Sc"))
            detalii = "scandiu   Z = 21   A = 45";
        else if (elementName.equals("Ti"))
            detalii = "titan   Z = 22   A = 48";
        else if (elementName.equals("V"))
            detalii = "vanadiu   Z = 23   A = 51";
        else if (elementName.equals("Cr"))
            detalii = "crom   Z = 24   A = 52";
        else if (elementName.equals("Mn"))
            detalii = "mangan   Z = 25   A = 55";
        else if (elementName.equals("Fe"))
            detalii = "fier   Z = 26   A = 56";
        else if (elementName.equals("Co"))
            detalii = "cobalt   Z = 27   A = 59";
        else if (elementName.equals("Ni"))
            detalii = "nichel   Z = 28   A = 59";
        else if (elementName.equals("Cu"))
            detalii = "cupru   Z = 29   A = 63.5";
        else if (elementName.equals("Zn"))
            detalii = "zinc   Z = 30   A = 65";
        else if (elementName.equals("Ga"))
            detalii = "galiu   Z = 31   A = 70";
        else if (elementName.equals("Ge"))
            detalii = "germaniu   Z = 32   A = 73";
        else if (elementName.equals("As"))
            detalii = "arsenic   Z = 33   A = 75";
        else if (elementName.equals("Se"))
            detalii = "seleniu   Z = 34   A = 79";
        else if (elementName.equals("Br"))
            detalii = "brom   Z = 35   A = 80";
        else if (elementName.equals("Kr"))
            detalii = "krypton   Z = 36   A = 84";
        else if (elementName.equals("Rb"))
            detalii = "rubidiu   Z = 37   A = 85.5";
        else if (elementName.equals("Sr"))
            detalii = "stronțiu   Z = 38   A = 88";
        else if (elementName.equals("Y"))
            detalii = "ytriu   Z = 39   A = 89";
        else if (elementName.equals("Zr"))
            detalii = "zirconiu   Z = 40   A = 91";
        else if (elementName.equals("Nb"))
            detalii = "niobiu   Z = 41   A = 93";
        else if (elementName.equals("Mo"))
            detalii = "molibden   Z = 42   A = 96";
        else if (elementName.equals("Tc"))
            detalii = "tecnețiu   Z = 43   A = 97";
        else if (elementName.equals("Ru"))
            detalii = "ruteniu   Z = 44   A = 101";
        else if (elementName.equals("Rh"))
            detalii = "rodiu   Z = 45   A = 103";
        else if (elementName.equals("Pd"))
            detalii = "paladiu   Z = 46   A = 106";
        else if (elementName.equals("Ag"))
            detalii = "argint   Z = 47   A = 108";
        else if (elementName.equals("Cd"))
            detalii = "cadmiu   Z = 48   A = 112";
        else if (elementName.equals("In"))
            detalii = "indiu    Z = 49   A = 115";
        else if (elementName.equals("Sn"))
            detalii = "staniu   Z = 50   A = 119";
        else if (elementName.equals("Sb"))
            detalii = "stibiu   Z = 51   A = 122";
        else if (elementName.equals("Te"))
            detalii = "telur   Z = 52   A = 128";
        else if (elementName.equals("I"))
            detalii = "iod   Z = 53   A = 127";
        else if (elementName.equals("Xe"))
            detalii = "xenon   Z = 54   A = 131";
        else if (elementName.equals("Cs"))
            detalii = "cesiu   Z = 55   A = 133";
        else if (elementName.equals("Ba"))
            detalii = "bariu   Z = 56   A = 137";
        else if (elementName.equals("La"))
            detalii = "lantan   Z = 57   A = 139";
        else if (elementName.equals("Hf"))
            detalii = "hafniu   Z = 72   A = 178.5";
        else if (elementName.equals("Ta"))
            detalii = "tantal   Z = 73   A = 181";
        else if (elementName.equals("W"))
            detalii = "wolfram   Z = 74   A = 184";
        else if (elementName.equals("Re"))
            detalii = "reniu   Z = 75   A = 186";
        else if (elementName.equals("Os"))
            detalii = "osmiu   Z = 76   A = 190";
        else if (elementName.equals("Ir"))
            detalii = "iridiu   Z = 77   A = 192";
        else if (elementName.equals("Pt"))
            detalii = "platină   Z = 78   A = 195";
        else if (elementName.equals("Au"))
            detalii = "aur   Z = 79   A = 197";
        else if (elementName.equals("Hg"))
            detalii = "mercur   Z = 80   A = 201";
        else if (elementName.equals("Tl"))
            detalii = "taliu   Z = 81   A = 204";
        else if (elementName.equals("Pb"))
            detalii = "plumb   Z = 82   A = 207";
        else if (elementName.equals("Bi"))
            detalii = "bismut   Z = 83   A = 209";
        else if (elementName.equals("Po"))
            detalii = "poloniu   Z = 84   A = 209";
        else if (elementName.equals("At"))
            detalii = "astatin   Z = 85   A = 210";
        else if (elementName.equals("Rn"))
            detalii = "radon   Z = 86   A = 222";
        else if (elementName.equals("Fr"))
            detalii = "franciu   Z = 87   A = 223";
        else if (elementName.equals("Ra"))
            detalii = "radiu   Z = 88   A = 226";
        else if (elementName.equals("Ac"))
            detalii = "actiniu   Z = 89   A = 227";
        else if (elementName.equals("Rf"))
            detalii = "rutherfordiu   Z = 104   A = 261";
        else if (elementName.equals("Db"))
            detalii = "dubniu   Z = 105   A = 262";
        else if (elementName.equals("Sg"))
            detalii = "seaborgiu   Z = 106   A = 263";
        else if (elementName.equals("Bh"))
            detalii = "bohriu   Z = 107   A = 262";
        else if (elementName.equals("Hs"))
            detalii = "hassiu   Z = 108   A = 265";
        else if (elementName.equals("Mt"))
            detalii = "meitneriu   Z = 109   A = 266";
        else if (elementName.equals("Ds"))
            detalii = "darmstadtiu   Z = 110";
        else if (elementName.equals("Rg"))
            detalii = "roentgeniu   Z = 111";
        else if (elementName.equals("Cn"))
            detalii = "coperniciu   Z = 112";
        else if (elementName.equals("Nh"))
            detalii = "nihoniu   Z = 113";
        else if (elementName.equals("Fl"))
            detalii = "fleroviu   Z = 114";
        else if (elementName.equals("Mc"))
            detalii = "moscoviu   Z = 115";
        else if (elementName.equals("Lv"))
            detalii = "livermoriu   Z = 116";
        else if (elementName.equals("Ts"))
            detalii = "tenessin   Z = 117";
        else if (elementName.equals("Og"))
            detalii = "oganesson   Z = 118";
        else if (elementName.equals("Ce"))
            detalii = "ceriu   Z = 58   A = 140";
        else if (elementName.equals("Pr"))
            detalii = "praseodmiu   Z = 59   A = 141";
        else if (elementName.equals("Nd"))
            detalii = "neodimiu   Z = 60   A = 144";
        else if (elementName.equals("Pm"))
            detalii = "prometiu   Z = 61   A = 145";
        else if (elementName.equals("Sm"))
            detalii = "samariu   Z = 62   A = 150";
        else if (elementName.equals("Eu"))
            detalii = "europiu   Z = 63   A = 152";
        else if (elementName.equals("Gd"))
            detalii = "gadoliniu   Z = 64   A = 157";
        else if (elementName.equals("Tb"))
            detalii = "terbiu   Z = 65   A = 159";
        else if (elementName.equals("Dy"))
            detalii = "dyprosiu   Z = 66   A = 162.5";
        else if (elementName.equals("Ho"))
            detalii = "holmiu   Z = 67   A = 165";
        else if (elementName.equals("Er"))
            detalii = "erbiu   Z = 68   A = 167";
        else if (elementName.equals("Tm"))
            detalii = "thuliu   Z = 69   A = 169";
        else if (elementName.equals("Yb"))
            detalii = "ytterbiu   Z = 70   A = 173";
        else if (elementName.equals("Lu"))
            detalii = "lutețiu   Z = 71   A = 175";
        else if (elementName.equals("Th"))
            detalii = "thoriu   Z = 90   A = 232";
        else if (elementName.equals("Pa"))
            detalii = "protactiniu   Z = 91   A = 231";
        else if (elementName.equals("U"))
            detalii = "uraniu   Z = 92   A = 238";
        else if (elementName.equals("Np"))
            detalii = "neptuniu   Z = 93   A = 237";
        else if (elementName.equals("Pu"))
            detalii = "plutoniu   Z = 94   A = 244";
        else if (elementName.equals("Am"))
            detalii = "americiu   Z = 95   A = 243";
        else if (elementName.equals("Cm"))
            detalii = "curiu   Z = 96   A = 247";
        else if (elementName.equals("Bk"))
            detalii = "berkeliu   Z = 97   A = 247";
        else if (elementName.equals("Cf"))
            detalii = "californiu   Z = 98   A = 251";
        else if (elementName.equals("Es"))
            detalii = "einsteiniu   Z = 99   A = 254";
        else if (elementName.equals("Fm"))
            detalii = "fermiu   Z = 100   A = 257";
        else if (elementName.equals("Md"))
            detalii = "mendeleeviu   Z = 101   A = 256";
        else if (elementName.equals("No"))
            detalii = "nobeliu   Z = 102   A = 254";
        else if (elementName.equals("Lr"))
            detalii = "lawrenciu   Z = 103   A = 256";
        Toast.makeText(this, detalii, Toast.LENGTH_SHORT).show();
    }
}
