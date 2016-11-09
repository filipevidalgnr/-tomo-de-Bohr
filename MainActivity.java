package leod7k.atomo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.OnTouch;

/*As informações abaixo são a respeito dos efeitos que o programa realiza na tela do programa.
  Em base nosso programa funciona com ViewFlippers e efeitos Onclick's.
  Cada parte em específico será comentada em código para melhor compreensão.

  Atualização 04/11/16: O programa passa a ser executado com os efeitos de hide/show de ImageViews,
  no intuito de realizar um número maior de inserção de imagens e o desuso em alocar informação
  diretamente na memória RAM, como o método ViewFlipper anteriormente realizava.
 */

public class MainActivity extends AppCompatActivity {

    //Elementos baseados em prótons em neutrons.

    ImageView flipperHidrogenio;
    ImageView flipperDeuterio;
    ImageView flipperTritio;
    ImageView flipperHelio;
    ImageView flipperLitio;
    ImageView flipperBerilio;
    ImageView flipperBoro;
    ImageView flipperCarbono;
    ImageView flipperNitrogenio;
    ImageView flipperOxigenio;
    ImageView flipperFluor;
    ImageView flipperNeonio;
    ImageView flipperSodio;
    ImageView flipperMagnesio;
    ImageView flipperAluminio;
    ImageView flipperSicilio;
    ImageView flipperFosforo;
    ImageView flipperEnxofre;
    ImageView flipperCloro;
    ImageView flipperArgonio;
    ImageView flipperPotassio;
    ImageView flipperCalcio;
    ImageView flipperEscandio;
    ImageView flipperTitanio;
    ImageView flipperVanadio;
    ImageView flipperCromio;
    ImageView flipperManganes;
    ImageView flipperFerro;
    ImageView flipperCobalto;
    ImageView flipperNiquel;
    ImageView flipperCobre;
    ImageView flipperZinco;
    ImageView flipperGalio;
    ImageView flipperGermanio;
    ImageView flipperArsenio;
    ImageView flipperSelenio;
    ImageView flipperBromo;
    ImageView flipperCriptonio;

    //Imagem dos isótopos

    ImageView nucleo_1_3; ImageView nucleo_1_4; ImageView nucleo_1_5; ImageView nucleo_1_6; ImageView nucleo_1_7; ImageView nucleo_1_8;
    ImageView nucleo_1_9; ImageView nucleo_1_10; ImageView nucleo_1_11; ImageView nucleo_2_1; ImageView nucleo_2_3; ImageView nucleo_2_4;
    ImageView nucleo_2_5; ImageView nucleo_2_6; ImageView nucleo_2_7; ImageView nucleo_2_8; ImageView nucleo_2_9; ImageView nucleo_2_10;
    ImageView nucleo_2_11; /*ImageView nucleo_3_1; ImageView nucleo_3_2; ImageView nucleo_3_3; ImageView nucleo_3_5; ImageView nucleo_3_6;
    ImageView nucleo_3_7; ImageView nucleo_3_8; ImageView nucleo_3_9; ImageView nucleo_3_10; ImageView nucleo_3_11;*/

    //Primeira camada de elétrons.

    ImageView flipperC101;
    ImageView flipperC102;

    //Segunda camada de elétrons.

    ImageView flipperC201;
    ImageView flipperC202;
    ImageView flipperC203;
    ImageView flipperC204;
    ImageView flipperC205;
    ImageView flipperC206;
    ImageView flipperC207;
    ImageView flipperC208;

    //Terceira camada de elétrons.

    ImageView flipperC301;
    ImageView flipperC302;
    ImageView flipperC303;
    ImageView flipperC304;
    ImageView flipperC305;
    ImageView flipperC306;
    ImageView flipperC307;
    ImageView flipperC308;
    ImageView flipperC309;
    ImageView flipperC310;
    ImageView flipperC311;
    ImageView flipperC312;
    ImageView flipperC313;
    ImageView flipperC314;
    ImageView flipperC315;
    ImageView flipperC316;
    ImageView flipperC317;
    ImageView flipperC318;

    //Quarta camada de elétrons.

    ImageView flipperC401;
    ImageView flipperC402;
    ImageView flipperC403;
    ImageView flipperC404;
    ImageView flipperC405;
    ImageView flipperC406;
    ImageView flipperC407;
    ImageView flipperC408;

    Button eletron_btn;


    @Bind(R.id.text_tv)
    TextView text_tv;
    @Bind(R.id.pnCount_tv)
    TextView pnCount_tv;
    @Bind(R.id.elemento_tv)
    TextView elemento_tv;
    @Bind(R.id.atomico_tv)
    TextView atomico_tv;
    @Bind(R.id.massa_tv)
    TextView massa_tv;
    @Bind(R.id.distribuicao_tv)
    TextView distribuicao_tv;
    @Bind(R.id.motivacao_tv)
    TextView motivacao_tv;
    @Bind(R.id.eletrons_tv)
    TextView eletrons_tv;
    @Bind(R.id.carga_tv)
    TextView carga_tv;

    int Count, pCount, nCount, eCount, iCount;
    List<Element> tab;
    private boolean pPressed, nPressed, ePressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Identificação dos flippers de prótons e nêutrons.

        flipperHidrogenio = (ImageView) findViewById(R.id.flipperHidrogenio);
        flipperDeuterio = (ImageView) findViewById(R.id.flipperDeuterio);
        flipperTritio = (ImageView) findViewById(R.id.flipperTritio);
        flipperHelio = (ImageView) findViewById(R.id.flipperHelio);
        flipperLitio = (ImageView) findViewById(R.id.flipperLitio);
        flipperBerilio = (ImageView) findViewById(R.id.flipperBerilio);
        flipperBoro = (ImageView) findViewById(R.id.flipperBoro);
        flipperCarbono = (ImageView) findViewById(R.id.flipperCarbono);
        flipperNitrogenio = (ImageView) findViewById(R.id.flipperNitrogenio);
        flipperOxigenio = (ImageView) findViewById(R.id.flipperOxigenio);
        flipperFluor = (ImageView) findViewById(R.id.flipperFluor);
        flipperNeonio = (ImageView) findViewById(R.id.flipperNeonio);
        flipperSodio = (ImageView) findViewById(R.id.flipperSodio);
        flipperMagnesio = (ImageView) findViewById(R.id.flipperMagnesio);
        flipperAluminio = (ImageView) findViewById(R.id.flipperAluminio);
        flipperSicilio = (ImageView) findViewById(R.id.flipperSilicio);
        flipperFosforo = (ImageView) findViewById(R.id.flipperFosforo);
        flipperEnxofre = (ImageView) findViewById(R.id.flipperEnxofre);
        flipperCloro = (ImageView) findViewById(R.id.flipperCloro);
        flipperArgonio = (ImageView) findViewById(R.id.flipperArgonio);
        flipperPotassio = (ImageView) findViewById(R.id.flipperPotassio);
        flipperCalcio = (ImageView) findViewById(R.id.flipperCalcio);
        flipperEscandio = (ImageView) findViewById(R.id.flipperEscandio);
        flipperTitanio = (ImageView) findViewById(R.id.flipperTitanio);
        flipperVanadio = (ImageView) findViewById(R.id.flipperVanadio);
        flipperCromio = (ImageView) findViewById(R.id.flipperCromio);
        flipperManganes = (ImageView) findViewById(R.id.flipperManganes);
        flipperFerro = (ImageView) findViewById(R.id.flipperFerro);
        flipperCobalto = (ImageView) findViewById(R.id.flipperCobalto);
        flipperNiquel = (ImageView) findViewById(R.id.flipperNiquel);
        flipperCobre = (ImageView) findViewById(R.id.flipperCobre);
        flipperZinco = (ImageView) findViewById(R.id.flipperZinco);
        flipperGalio = (ImageView) findViewById(R.id.flipperGalio);
        flipperGermanio = (ImageView) findViewById(R.id.flipperGermanio);
        flipperArsenio = (ImageView) findViewById(R.id.flipperArsenio);
        flipperSelenio = (ImageView) findViewById(R.id.flipperSelenio);
        flipperBromo = (ImageView) findViewById(R.id.flipperBromo);
        flipperCriptonio = (ImageView) findViewById(R.id.flipperCriptonio);

        //Identificação dos isótopos

        nucleo_1_3 = (ImageView) findViewById(R.id.nucleo_1_3);
        nucleo_1_4 = (ImageView) findViewById(R.id.nucleo_1_4);
        nucleo_1_5 = (ImageView) findViewById(R.id.nucleo_1_5);
        nucleo_1_6 = (ImageView) findViewById(R.id.nucleo_1_6);
        nucleo_1_7 = (ImageView) findViewById(R.id.nucleo_1_7);
        nucleo_1_8 = (ImageView) findViewById(R.id.nucleo_1_8);
        nucleo_1_9 = (ImageView) findViewById(R.id.nucleo_1_9);
        nucleo_1_10 = (ImageView) findViewById(R.id.nucleo_1_10);
        nucleo_1_11 = (ImageView) findViewById(R.id.nucleo_1_11);
        nucleo_2_1 = (ImageView) findViewById(R.id.nucleo_2_1);
        nucleo_2_3 = (ImageView) findViewById(R.id.nucleo_2_3);
        nucleo_2_4 = (ImageView) findViewById(R.id.nucleo_2_4);
        nucleo_2_5 = (ImageView) findViewById(R.id.nucleo_2_5);
        nucleo_2_6 = (ImageView) findViewById(R.id.nucleo_2_6);
        nucleo_2_7 = (ImageView) findViewById(R.id.nucleo_2_7);
        nucleo_2_8 = (ImageView) findViewById(R.id.nucleo_2_8);
        nucleo_2_9 = (ImageView) findViewById(R.id.nucleo_2_9);
        nucleo_2_10 = (ImageView) findViewById(R.id.nucleo_2_10);
        nucleo_2_11 = (ImageView) findViewById(R.id.nucleo_2_11);
        /*nucleo_3_1 = (ImageView) findViewById(R.id.nucleo_3_1);
        nucleo_3_2 = (ImageView) findViewById(R.id.nucleo_3_2);
        nucleo_3_3 = (ImageView) findViewById(R.id.nucleo_3_3);
        nucleo_3_5 = (ImageView) findViewById(R.id.nucleo_3_5);
        nucleo_3_6 = (ImageView) findViewById(R.id.nucleo_3_6);
        nucleo_3_7 = (ImageView) findViewById(R.id.nucleo_3_7);
        nucleo_3_8 = (ImageView) findViewById(R.id.nucleo_3_8);
        nucleo_3_9 = (ImageView) findViewById(R.id.nucleo_3_9);
        nucleo_3_10 = (ImageView) findViewById(R.id.nucleo_3_10);
        nucleo_3_11 = (ImageView) findViewById(R.id.nucleo_3_11);*/


        //Identificação dos flippers dos elétrons da primeira camada

        flipperC101 = (ImageView) findViewById(R.id.flipperC101);
        flipperC102 = (ImageView) findViewById(R.id.flipperC102);

        //Identificação dos flippers dos elétrons da segunda camada.
        flipperC201 = (ImageView) findViewById(R.id.flipperC201);
        flipperC202 = (ImageView) findViewById(R.id.flipperC202);
        flipperC203 = (ImageView) findViewById(R.id.flipperC203);
        flipperC204 = (ImageView) findViewById(R.id.flipperC204);
        flipperC205 = (ImageView) findViewById(R.id.flipperC205);
        flipperC206 = (ImageView) findViewById(R.id.flipperC206);
        flipperC207 = (ImageView) findViewById(R.id.flipperC207);
        flipperC208 = (ImageView) findViewById(R.id.flipperC208);

        //Identificação dos flippers dos elétrons da terceira camada.

        flipperC301 = (ImageView) findViewById(R.id.flipperC301);
        flipperC302 = (ImageView) findViewById(R.id.flipperC302);
        flipperC303 = (ImageView) findViewById(R.id.flipperC303);
        flipperC304 = (ImageView) findViewById(R.id.flipperC304);
        flipperC305 = (ImageView) findViewById(R.id.flipperC305);
        flipperC306 = (ImageView) findViewById(R.id.flipperC306);
        flipperC307 = (ImageView) findViewById(R.id.flipperC307);
        flipperC308 = (ImageView) findViewById(R.id.flipperC308);
        flipperC309 = (ImageView) findViewById(R.id.flipperC309);
        flipperC310 = (ImageView) findViewById(R.id.flipperC310);
        flipperC311 = (ImageView) findViewById(R.id.flipperC311);
        flipperC312 = (ImageView) findViewById(R.id.flipperC312);
        flipperC313 = (ImageView) findViewById(R.id.flipperC313);
        flipperC314 = (ImageView) findViewById(R.id.flipperC314);
        flipperC315 = (ImageView) findViewById(R.id.flipperC315);
        flipperC316 = (ImageView) findViewById(R.id.flipperC316);
        flipperC317 = (ImageView) findViewById(R.id.flipperC317);
        flipperC318 = (ImageView) findViewById(R.id.flipperC318);

        //Identificação dos flippers dos elétrons da quarta camada.

        flipperC401 = (ImageView) findViewById(R.id.flipperC401);
        flipperC402 = (ImageView) findViewById(R.id.flipperC402);
        flipperC403 = (ImageView) findViewById(R.id.flipperC403);
        flipperC404 = (ImageView) findViewById(R.id.flipperC404);
        flipperC405 = (ImageView) findViewById(R.id.flipperC405);
        flipperC406 = (ImageView) findViewById(R.id.flipperC406);
        flipperC407 = (ImageView) findViewById(R.id.flipperC407);
        flipperC408 = (ImageView) findViewById(R.id.flipperC408);

        Count = pCount = nCount = eCount = iCount = 0;
        pPressed = nPressed = ePressed = false;
        tab = new ArrayList<>();

        try {
            InputStreamReader is = new InputStreamReader(getAssets()
                    .open("Tabela_v2.csv"), "UTF-8");

            BufferedReader reader = new BufferedReader(is);
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String cols[] = line.split(";");
                try {
                    tab.add(new Element(cols[0], cols[1], cols[2], cols[3], cols[4], cols[5], cols[6]));
                } catch (Exception e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.proton_btn)
    public void protonBtn() {
        pPressed = true;
        Log.i("protonBtn", "pPressed");
    }

    @OnClick(R.id.neutron_btn)
    public void neutronBtn() {
        nPressed = true;
        Log.i("neutronBtn", "pPressed");
    }

    @OnClick(R.id.eletron_btn)
    public void eletronBtn() {
        ePressed = true;
        Log.i("eletronBtn", "ePressed");
    }

    /*
    Por ser responsável pela imagem central do núcleo, aqui se passa as condicionais para retonarmos as camadas dos elétrons,
    além das imagens correspondentes aos prótons e neutrons. Os cálculos são baseados na "Tabela_v1.csv" e os eventos aqui
    utilizados serão ".setDisplayChild("numero da página");" para exibição do átomo e ".stopFlipping();" para travar a animação anterior.

    Atualizaão 04/11/16: A partir de agora, a imagem central do núcleo terá as condicionais baseadas no evento
    .setVisibility(View.VISIBLE/INVISIBLE); para a aparição e desaparecimento das imagens.
     */

    @OnClick(R.id.nucleo_iv)
    public void nucleoIv() {

        eletron_btn = (Button) findViewById(R.id.eletron_btn);

        if (pPressed) {
            pCount++;
            pPressed = false;
        }

        if (nPressed) {
            nCount++;
            nPressed = false;
        }

        if (ePressed) {
            eCount++;
            ePressed = false;
        }

        if (pCount == 0 && nCount == 1 && eCount == 0) {
            nCount--;
            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
            alerta.setTitle("Aviso");
            alerta.setMessage("Você deve iniciar pelo Próton!");
            alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick (DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "Você deve iniciar pelo Próton!", Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
        }

        if (pCount == 0 && nCount == 0 && eCount == 1) {
            eCount--;
            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
            alerta.setTitle("Aviso");
            alerta.setMessage("Você deve iniciar pelo Próton!");
            alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick (DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "Você deve iniciar pelo Próton!", Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
        }

        if (pCount == 1 && nCount == 0) {
            flipperHidrogenio.setVisibility(View.VISIBLE);

        }

        if (pCount == 1 && nCount == 1) {
            flipperHidrogenio.setVisibility(View.INVISIBLE);
            flipperDeuterio.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 2) {
            flipperDeuterio.setVisibility(View.INVISIBLE);
            flipperTritio.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 3) {
            flipperTritio.setVisibility(View.INVISIBLE);
            nucleo_1_3.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 4) {
            nucleo_1_3.setVisibility(View.INVISIBLE);
            nucleo_1_4.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 5) {
            nucleo_1_4.setVisibility(View.INVISIBLE);
            nucleo_1_5.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 6) {
            nucleo_1_5.setVisibility(View.INVISIBLE);
            nucleo_1_6.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 7) {
            nucleo_1_6.setVisibility(View.INVISIBLE);
            nucleo_1_7.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 8) {
            nucleo_1_7.setVisibility(View.INVISIBLE);
            nucleo_1_8.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 9) {
            nucleo_1_8.setVisibility(View.INVISIBLE);
            nucleo_1_9.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 10) {
            nucleo_1_9.setVisibility(View.INVISIBLE);
            nucleo_1_10.setVisibility(View.VISIBLE);
        }

        if (pCount == 1 && nCount == 11) {
            nucleo_1_10.setVisibility(View.INVISIBLE);
            nucleo_1_11.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 1) {
            flipperDeuterio.setVisibility(View.INVISIBLE);
            nucleo_2_1.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 2) {
            flipperTritio.setVisibility(View.INVISIBLE);
            flipperHelio.setVisibility(View.VISIBLE);
            nucleo_2_1.setVisibility(View.INVISIBLE);
        }

        if (pCount == 2 && nCount == 3) {
            nucleo_2_3.setVisibility(View.VISIBLE);
            flipperHelio.setVisibility(View.INVISIBLE);
        }

        if (pCount == 2 && nCount == 4) {
            nucleo_2_3.setVisibility(View.INVISIBLE);
            nucleo_2_4.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 5) {
            nucleo_2_4.setVisibility(View.INVISIBLE);
            nucleo_2_5.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 6) {
            nucleo_2_5.setVisibility(View.INVISIBLE);
            nucleo_2_6.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 7) {
            nucleo_2_6.setVisibility(View.INVISIBLE);
            nucleo_2_7.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 8) {
            nucleo_2_7.setVisibility(View.INVISIBLE);
            nucleo_2_8.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 9) {
            nucleo_2_8.setVisibility(View.INVISIBLE);
            nucleo_2_9.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 10) {
            nucleo_2_9.setVisibility(View.INVISIBLE);
            nucleo_2_10.setVisibility(View.VISIBLE);
        }

        if (pCount == 2 && nCount == 11) {
            nucleo_2_10.setVisibility(View.INVISIBLE);
            nucleo_2_11.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 1) {
            nucleo_2_1.setVisibility(View.INVISIBLE);
            //nucleo_3_1.setVisibility(View.VISIBLE);
            flipperDeuterio.setVisibility(View.INVISIBLE);
        }

        /*if (pCount == 3 && nCount == 2) {
            nucleo_3_1.setVisibility(View.INVISIBLE);
            nucleo_3_2.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 3) {
            nucleo_3_2.setVisibility(View.INVISIBLE);
            nucleo_3_3.setVisibility(View.VISIBLE);
        }*/

        if (pCount == 3 && nCount == 4) {
            flipperLitio.setVisibility(View.VISIBLE);
            //nucleo_3_3.setVisibility(View.INVISIBLE);
        }

        /*if (pCount == 3 && nCount == 5) {
            nucleo_3_5.setVisibility(View.VISIBLE);
            flipperLitio.setVisibility(View.INVISIBLE);
        }

        if (pCount == 3 && nCount == 6) {
            nucleo_3_5.setVisibility(View.INVISIBLE);
            nucleo_3_6.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 7) {
            nucleo_3_6.setVisibility(View.INVISIBLE);
            nucleo_3_7.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 8) {
            nucleo_3_7.setVisibility(View.INVISIBLE);
            nucleo_3_8.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 9) {
            nucleo_3_8.setVisibility(View.INVISIBLE);
            nucleo_3_9.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 10) {
            nucleo_3_9.setVisibility(View.INVISIBLE);
            nucleo_3_10.setVisibility(View.VISIBLE);
        }

        if (pCount == 3 && nCount == 11) {
            nucleo_3_10.setVisibility(View.INVISIBLE);
            nucleo_3_11.setVisibility(View.VISIBLE);
        }*/

        if (pCount == 4 && nCount == 5) {
            flipperLitio.setVisibility(View.INVISIBLE);
            flipperBerilio.setVisibility(View.VISIBLE);
            nucleo_1_5.setVisibility(View.INVISIBLE);
            nucleo_2_1.setVisibility(View.INVISIBLE);
            nucleo_2_3.setVisibility(View.INVISIBLE);
            nucleo_2_4.setVisibility(View.INVISIBLE);
            nucleo_2_5.setVisibility(View.INVISIBLE);
        }

        if (pCount == 5 && nCount == 6) {
            flipperBerilio.setVisibility(View.INVISIBLE);
            flipperBoro.setVisibility(View.VISIBLE);
            nucleo_1_6.setVisibility(View.INVISIBLE);
            nucleo_2_6.setVisibility(View.INVISIBLE);
            //nucleo_3_6.setVisibility(View.INVISIBLE);
        }

        if (pCount == 6 && nCount == 6) {
            flipperBoro.setVisibility(View.INVISIBLE);
            flipperCarbono.setVisibility(View.VISIBLE);
            nucleo_1_6.setVisibility(View.INVISIBLE);
            nucleo_2_6.setVisibility(View.INVISIBLE);
            //nucleo_3_6.setVisibility(View.INVISIBLE);
        }

        if (pCount == 7 && nCount == 7) {
            flipperCarbono.setVisibility(View.INVISIBLE);
            flipperNitrogenio.setVisibility(View.VISIBLE);
        }

        if (pCount == 8 && nCount == 8) {
            flipperNitrogenio.setVisibility(View.INVISIBLE);
            flipperOxigenio.setVisibility(View.VISIBLE);
        }

        if (pCount == 9 && nCount == 10) {
            flipperOxigenio.setVisibility(View.INVISIBLE);
            flipperFluor.setVisibility(View.VISIBLE);
        }

        if (pCount == 10 && nCount == 10) {
            flipperFluor.setVisibility(View.INVISIBLE);
            flipperNeonio.setVisibility(View.VISIBLE);
        }

        if (pCount == 11 && nCount == 12) {
            flipperNeonio.setVisibility(View.INVISIBLE);
            flipperSodio.setVisibility(View.VISIBLE);
        }

        if (pCount == 12 && nCount == 12) {
            flipperSodio.setVisibility(View.INVISIBLE);
            flipperMagnesio.setVisibility(View.VISIBLE);
        }

        if (pCount == 13 && nCount == 14) {
            flipperMagnesio.setVisibility(View.INVISIBLE);
            flipperAluminio.setVisibility(View.VISIBLE);
        }

        if (pCount == 14 && nCount == 14) {
            flipperAluminio.setVisibility(View.INVISIBLE);
            flipperSicilio.setVisibility(View.VISIBLE);
        }

        if (pCount == 15 && nCount == 16) {
            flipperSicilio.setVisibility(View.INVISIBLE);
            flipperFosforo.setVisibility(View.VISIBLE);
        }

        if (pCount == 16 && nCount == 16) {
            flipperFosforo.setVisibility(View.INVISIBLE);
            flipperEnxofre.setVisibility(View.VISIBLE);
        }

        if (pCount == 17 && nCount == 18) {
            flipperEnxofre.setVisibility(View.INVISIBLE);
            flipperCloro.setVisibility(View.VISIBLE);
        }

        if (pCount == 18 && nCount == 22) {
            flipperCloro.setVisibility(View.INVISIBLE);
            flipperArgonio.setVisibility(View.VISIBLE);
        }

        if (pCount == 19 && nCount == 20) {
            flipperArgonio.setVisibility(View.INVISIBLE);
            flipperPotassio.setVisibility(View.VISIBLE);
        }

        if (pCount == 20 && nCount == 20) {
            flipperPotassio.setVisibility(View.INVISIBLE);
            flipperCalcio.setVisibility(View.VISIBLE);
        }

        if (pCount == 21 && nCount == 24) {
            flipperCalcio.setVisibility(View.INVISIBLE);
            flipperEscandio.setVisibility(View.VISIBLE);
        }

        if (pCount == 22 && nCount == 26) {
            flipperEscandio.setVisibility(View.INVISIBLE);
            flipperTitanio.setVisibility(View.VISIBLE);
        }

        if (pCount == 23 && nCount == 28) {
            flipperTitanio.setVisibility(View.INVISIBLE);
            flipperVanadio.setVisibility(View.VISIBLE);
        }

        if (pCount == 24 && nCount == 28) {
            flipperVanadio.setVisibility(View.INVISIBLE);
            flipperCromio.setVisibility(View.VISIBLE);
        }

        if (pCount == 25 && nCount == 30) {
            flipperCromio.setVisibility(View.INVISIBLE);
            flipperManganes.setVisibility(View.VISIBLE);
        }

        if (pCount == 26 && nCount == 30) {
            flipperManganes.setVisibility(View.INVISIBLE);
            flipperFerro.setVisibility(View.VISIBLE);
        }

        if (pCount == 27 && nCount == 32) {
            flipperFerro.setVisibility(View.INVISIBLE);
            flipperCobalto.setVisibility(View.VISIBLE);
        }

        if (pCount == 28 && nCount == 30) {
            flipperCobalto.setVisibility(View.INVISIBLE);
            flipperNiquel.setVisibility(View.VISIBLE);
        }

        if (pCount == 29 && nCount == 34) {
            flipperNiquel.setVisibility(View.INVISIBLE);
            flipperCobre.setVisibility(View.VISIBLE);
        }


        if (pCount == 30 && nCount == 34) {
            flipperCobre.setVisibility(View.INVISIBLE);
            flipperZinco.setVisibility(View.VISIBLE);
        }
        if (pCount == 31 && nCount == 38) {
            flipperZinco.setVisibility(View.INVISIBLE);
            flipperGalio.setVisibility(View.VISIBLE);
        }

        if (pCount == 32 && nCount == 42) {
            flipperGalio.setVisibility(View.INVISIBLE);
            flipperGermanio.setVisibility(View.VISIBLE);
        }

        if (pCount == 33 && nCount == 42) {
            flipperGermanio.setVisibility(View.INVISIBLE);
            flipperArsenio.setVisibility(View.VISIBLE);
        }

        if (pCount == 34 && nCount == 46) {
            flipperArsenio.setVisibility(View.INVISIBLE);
            flipperSelenio.setVisibility(View.VISIBLE);
        }

        if (pCount == 35 && nCount == 44) {
            flipperSelenio.setVisibility(View.INVISIBLE);
            flipperBromo.setVisibility(View.VISIBLE);
        }

        if (pCount == 36 && nCount == 48) {
            flipperBromo.setVisibility(View.INVISIBLE);
            flipperCriptonio.setVisibility(View.VISIBLE);
        }

        if (pCount > 36 && nCount > 48) {
            flipperCriptonio.setVisibility(View.INVISIBLE);
        }

        //Condicionais dos elétrons

        if (eCount == 1) {
            flipperC101.setVisibility(View.VISIBLE);
            flipperC102.setVisibility(View.INVISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s1");
            //motivacao_tv.setText(" ");
        }

        if (eCount == 2) {
            flipperC101.setVisibility(View.INVISIBLE);
            flipperC102.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2");
        }

        if (eCount == 3) {
            flipperC102.setVisibility(View.INVISIBLE);
            flipperC201.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s1");
        }

        if (eCount == 4) {
            flipperC201.setVisibility(View.INVISIBLE);
            flipperC202.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2");
        }

        if (eCount == 5) {
            flipperC202.setVisibility(View.INVISIBLE);
            flipperC203.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p1");
        }

        if (eCount == 6) {
            flipperC203.setVisibility(View.INVISIBLE);
            flipperC204.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p2");
        }

        if (eCount == 7) {
            flipperC204.setVisibility(View.INVISIBLE);
            flipperC205.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p3");
        }

        if (eCount == 8) {
            flipperC205.setVisibility(View.INVISIBLE);
            flipperC206.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p4");
        }

        if (eCount == 9) {
            flipperC206.setVisibility(View.INVISIBLE);
            flipperC207.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p5");
        }

        if (eCount == 10) {
            flipperC207.setVisibility(View.INVISIBLE);
            flipperC208.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6");
        }

        if (eCount == 11) {
            flipperC208.setVisibility(View.INVISIBLE);
            flipperC301.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s1");
        }

        if (eCount == 12) {
            flipperC301.setVisibility(View.INVISIBLE);
            flipperC302.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2");
        }

        if (eCount == 13) {
            flipperC302.setVisibility(View.INVISIBLE);
            flipperC303.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p1");
        }

        if (eCount == 14) {
            flipperC303.setVisibility(View.INVISIBLE);
            flipperC304.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p2");
        }

        if (eCount == 15) {
            flipperC304.setVisibility(View.INVISIBLE);
            flipperC305.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p3");
        }

        if (eCount == 16) {
            flipperC305.setVisibility(View.INVISIBLE);
            flipperC306.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p4");
        }

        if (eCount == 17) {
            flipperC306.setVisibility(View.INVISIBLE);
            flipperC307.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p5");
        }

        if (eCount == 18) {
            flipperC307.setVisibility(View.INVISIBLE);
            flipperC308.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6");
        }

        if (eCount == 19) {
            flipperC308.setVisibility(View.INVISIBLE);
            flipperC309.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s1");
        }

        if (eCount == 20) {
            flipperC309.setVisibility(View.INVISIBLE);
            flipperC310.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2");
        }

        if (eCount == 21) {
            flipperC310.setVisibility(View.INVISIBLE);
            flipperC311.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d1");
        }

        if (eCount == 22) {
            flipperC311.setVisibility(View.INVISIBLE);
            flipperC312.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d2");
        }

        if (eCount == 23) {
            flipperC312.setVisibility(View.INVISIBLE);
            flipperC313.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d3");
        }

        if (eCount == 24) {
            flipperC313.setVisibility(View.INVISIBLE);
            flipperC314.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d4");
        }

        if (eCount == 25) {
            flipperC314.setVisibility(View.INVISIBLE);
            flipperC315.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d5");
        }

        if (eCount == 26) {
            flipperC315.setVisibility(View.INVISIBLE);
            flipperC316.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d6");
        }

        if (eCount == 27) {
            flipperC316.setVisibility(View.INVISIBLE);
            flipperC317.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d7");
        }

        if (eCount == 28) {
            flipperC317.setVisibility(View.INVISIBLE);
            flipperC318.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d8");
        }

        if (eCount == 29) {
            flipperC318.setVisibility(View.INVISIBLE);
            flipperC401.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d9");
        }

        if (eCount == 30) {
            flipperC401.setVisibility(View.INVISIBLE);
            flipperC402.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10");
        }

        if (eCount == 31) {
            flipperC402.setVisibility(View.INVISIBLE);
            flipperC403.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p1");
        }

        if (eCount == 32) {
            flipperC403.setVisibility(View.INVISIBLE);
            flipperC404.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p2");
        }

        if (eCount == 33) {
            flipperC404.setVisibility(View.INVISIBLE);
            flipperC405.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p3");
        }

        if (eCount == 34) {
            flipperC405.setVisibility(View.INVISIBLE);
            flipperC406.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p4");
        }

        if (eCount == 35) {
            flipperC406.setVisibility(View.INVISIBLE);
            flipperC407.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p5");
        }

        if (eCount == 36) {
            flipperC407.setVisibility(View.INVISIBLE);
            flipperC408.setVisibility(View.VISIBLE);
            distribuicao_tv.setText("Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6");
        }

        if (pCount == 0 && nCount == 0 && eCount == 0){
            motivacao_tv.setText(" ");
        }

        pnCount_tv.setText("Prótons = " + pCount + "\nNeutrons = " + nCount + "\n");
        eletrons_tv.setText("Elétrons = " + eCount);
        carga_tv.setText("" + (pCount - eCount));


        for (Element e : tab) {
            if (e.getP().equals(pCount + "") && e.getN().equals(nCount + "")) {
                text_tv.setText(e.getName());
                elemento_tv.setText(e.getSymbol());
                atomico_tv.setText(e.getP());
                massa_tv.setText(e.getA());
                motivacao_tv.setText(e.getM());
                return;
            }

            text_tv.setText(" ");
            elemento_tv.setText("X");
            atomico_tv.setText("Z");
            massa_tv.setText("A");
            motivacao_tv.setText("");
        }

    }
}
