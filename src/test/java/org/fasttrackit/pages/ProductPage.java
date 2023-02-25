package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy(css= "li.reviews_tab a")
    private WebElementFacade reviewButton;
    @FindBy (css = "a.star-5")
    private WebElementFacade rateStars;
    @FindBy (css="textarea#comment")
    private WebElementFacade reviewField;
    @FindBy (css="input.submit")
    private WebElementFacade submitButton;
    public void clickOnReviewButton () {
        clickOn(reviewButton);
    }
    public void selectRating () {
        clickOn(rateStars);
    }
    public void writeComment (){
        typeInto(reviewField, "Luceafărul\n" +
                "\n" +
                "A fost odată ca-n poveşti,\n" +
                "A fost ca niciodată.\n" +
                "Din rude mari împărăteşti,\n" +
                "O prea frumoasă fată.\n" +
                "\n" +
                "Şi era una la părinţi\n" +
                "Şi mândră-n toate cele,\n" +
                "Cum e Fecioara între sfinţi\n" +
                "Şi luna între stele.\n" +
                "\n" +
                "Din umbra falnicelor bolţi\n" +
                "Ea pasul şi-l îndreaptă\n" +
                "Lângă fereastră, unde-n colţ\n" +
                "Luceafărul aşteaptă.\n" +
                "\n" +
                "Privea în zare cum pe mări\n" +
                "Răsare şi străluce,\n" +
                "Pe mişcătoarele cărări\n" +
                "Corăbii negre duce.\n" +
                "\n" +
                "Îl vede azi, îl vede mâini,\n" +
                "Astfel dorinţa-i gata;\n" +
                "El iar, privind de săptămâni,\n" +
                "Îi cade draga fată.\n" +
                "\n" +
                "Cum ea pe coate-şi răzima\n" +
                "Visând ale ei tâmple,\n" +
                "De dorul lui şi inima\n" +
                "Şi sufletu-i se împle.\n" +
                "\n" +
                "Şi cât de viu s-aprinde el\n" +
                "În orişicare sară,\n" +
                "Spre umbra negrului castel\n" +
                "Când ea o să-i apară.\n" +
                "\n" +
                "...\n" +
                "\n" +
                "Şi pas cu pas pe urma ei\n" +
                "Alunecă-n odaie,\n" +
                "Ţesând cu recile-i scântei\n" +
                "O mreajă de văpaie.\n" +
                "\n" +
                "Şi când în pat se-ntinde drept\n" +
                "Copila să se culce,\n" +
                "I-atinge mâinile pe piept,\n" +
                "I-nchide geana dulce;\n" +
                "\n" +
                "Şi din oglindă luminiş\n" +
                "Pe trupu-i se revarsă,\n" +
                "Pe ochii mari, bătând închişi\n" +
                "Pe faţa ei întoarsă.\n" +
                "\n" +
                "Ea îl privea cu un surâs,\n" +
                "El tremura-n oglindă,\n" +
                "Căci o urma adânc în vis\n" +
                "De suflet să se prindă.\n" +
                "\n" +
                "Iar ea vorbind cu el în somn,\n" +
                "Oftând din greu suspină:\n" +
                "- O, dulce-al nopţii mele domn,\n" +
                "De ce nu vii tu? Vină!\n" +
                "\n" +
                "Cobori în jos, luceafăr blând,\n" +
                "Alunecând pe-o rază,\n" +
                "Pătrunde-n casă şi în gând\n" +
                "Şi viaţa-mi luminează!\n" +
                "\n" +
                "El asculta tremurător,\n" +
                "Se aprindea mai tare\n" +
                "Şi s-arunca fulgerător,\n" +
                "Se cufunda în mare;\n" +
                "\n" +
                "Şi apa unde-au fost căzut\n" +
                "În cercuri se roteşte,\n" +
                "Şi din adânc necunoscut\n" +
                "Un mândru tânăr creşte.\n" +
                "\n" +
                "Uşor el trece ca pe prag\n" +
                "Pe marginea ferestei\n" +
                "Şi ţine-n mână un toiag\n" +
                "Încununat cu trestii.\n" +
                "\n" +
                "Părea un tânăr voievod\n" +
                "Cu păr de aur moale,\n" +
                "Un vânăt giulgi se-ncheie nod\n" +
                "Pe umerele goale.\n" +
                "\n" +
                "Iar umbra feţei străvezii\n" +
                "E albă ca de ceară -\n" +
                "Un mort frumos cu ochii vii\n" +
                "Ce scânteie-n afară.\n" +
                "\n" +
                "- Din sfera mea venii cu greu\n" +
                "Ca să-ţi urmez chemarea,\n" +
                "Iar cerul este tatăl meu\n" +
                "Şi mumă-mea e marea.\n" +
                "\n" +
                "Ca în cămara ta să vin,\n" +
                "Să te privesc de-aproape,\n" +
                "Am coborât cu-al meu senin\n" +
                "Şi m-am născut din ape.\n" +
                "\n" +
                "O, vin'! odorul meu nespus,\n" +
                "Şi lumea ta o lasă;\n" +
                "Eu sunt luceafărul de sus,\n" +
                "Iar tu să-mi fii mireasă.\n" +
                "\n" +
                "Colo-n palate de mărgean\n" +
                "Te-oi duce veacuri multe,\n" +
                "Şi toată lumea-n ocean\n" +
                "De tine o s-asculte.\n" +
                "\n" +
                "- O, eşti frumos, cum numa-n vis\n" +
                "Un înger se arată,\n" +
                "Dară pe calea ce-ai deschis\n" +
                "N-oi merge niciodată;\n" +
                "\n" +
                "Străin la vorbă şi la port,\n" +
                "Luceşti fără de viaţă,\n" +
                "Căci eu sunt vie, tu eşti mort,\n" +
                "Şi ochiul tău mă-ngheaţă.\n" +
                "\n" +
                "...\n" +
                "\n" +
                "Trecu o zi, trecură trei\n" +
                "Şi iarăşi, noaptea, vine\n" +
                "Luceafărul deasupra ei\n" +
                "Cu razele-i senine.\n" +
                "\n" +
                "Ea trebui de el în somn\n" +
                "Aminte să-şi aducă\n" +
                "Şi dor de-al valurilor domn\n" +
                "De inim-o apucă:\n" +
                "\n" +
                "- Cobori în jos, luceafăr blând,\n" +
                "Alunecând pe-o rază,\n" +
                "Pătrunde-n casă şi în gând\n" +
                "Şi viaţa-mi luminează!\n" +
                "\n" +
                "Cum el din cer o auzi,\n" +
                "Se stinse cu durere,\n" +
                "Iar ceru-ncepe a roti\n" +
                "În locul unde piere;\n" +
                "\n" +
                "În aer rumene văpăi\n" +
                "Se-ntind pe lumea-ntreagă,\n" +
                "Şi din a chaosului văi\n" +
                "Un mândru chip se-ncheagă;\n" +
                "\n" +
                "Pe negre viţele-i de păr\n" +
                "Coroana-i arde pare,\n" +
                "Venea plutind în adevăr\n" +
                "Scăldat în foc de soare.\n" +
                "\n" +
                "Din negru giulgi se desfăşor\n" +
                "Marmoreele braţe,\n" +
                "El vine trist şi gânditor\n" +
                "Şi palid e la faţă;\n" +
                "\n" +
                "Dar ochii mari şi minunaţi\n" +
                "Lucesc adânc himeric,\n" +
                "Ca două patimi fără saţ\n" +
                "Şi pline de-ntuneric.\n" +
                "\n" +
                "- Din sfera mea venii cu greu\n" +
                "Ca să te-ascult ş-acuma,\n" +
                "Şi soarele e tatăl meu,\n" +
                "Iar noaptea-mi este muma;\n" +
                "\n" +
                "O, vin', odorul meu nespus,\n" +
                "Şi lumea ta o lasă;\n" +
                "Eu sunt luceafărul de sus,\n" +
                "Iar tu să-mi fii mireasă.\n" +
                "\n" +
                "O, vin', în părul tău bălai\n" +
                "S-anin cununi de stele,\n" +
                "Pe-a mele ceruri să răsai\n" +
                "Mai mândră decât ele.\n" +
                "\n" +
                "- O, eşti frumos cum numa-n vis\n" +
                "Un demon se arată,\n" +
                "Dară pe calea ce-ai deschis\n" +
                "N-oi merge niciodată!\n" +
                "\n" +
                "Mă dor de crudul tău amor\n" +
                "A pieptului meu coarde,\n" +
                "Şi ochii mari şi grei mă dor,\n" +
                "Privirea ta mă arde.\n" +
                "\n" +
                "- Dar cum ai vrea să mă cobor?\n" +
                "Au nu-nţelegi tu oare,\n" +
                "Cum că eu sunt nemuritor,\n" +
                "Şi tu eşti muritoare?\n" +
                "\n" +
                "- Nu caut vorbe pe ales,\n" +
                "Nici ştiu cum aş începe -\n" +
                "Deşi vorbeşti pe înţeles,\n" +
                "Eu nu te pot pricepe;\n" +
                "\n" +
                "Dar dacă vrei cu crezământ\n" +
                "Să te-ndrăgesc pe tine,\n" +
                "Tu te coboară pe pământ,\n" +
                "Fii muritor ca mine.\n" +
                "\n" +
                "- Tu-mi cei chiar nemurirea mea\n" +
                "În schimb pe-o sărutare,\n" +
                "Dar voi să ştii asemenea\n" +
                "Cât te iubesc de tare;\n" +
                "\n" +
                "Da, mă voi naşte din păcat,\n" +
                "Primind o altă lege;\n" +
                "Cu vecinicia sunt legat,\n" +
                "Ci voi să mă dezlege.\n" +
                "\n" +
                "Şi se tot duce... S-a tot dus.\n" +
                "De dragu-unei copile,\n" +
                "S-a rupt din locul lui de sus,\n" +
                "Pierind mai multe zile.\n" +
                "\n" +
                "...\n" +
                "\n" +
                "În vremea asta Cătălin,\n" +
                "Viclean copil de casă,\n" +
                "Ce umple cupele cu vin\n" +
                "Mesenilor la masă,\n" +
                "\n" +
                "Un paj ce poartă pas cu pas\n" +
                "A-mpărătesii rochii,\n" +
                "Băiat din flori şi de pripas,\n" +
                "Dar îndrăzneţ cu ochii,\n" +
                "\n" +
                "Cu obrăjei ca doi bujori\n" +
                "De rumeni, bată-i vina,\n" +
                "Se furişează pânditor\n" +
                "Privind la Cătălina.\n" +
                "\n" +
                "Dar ce frumoasă se făcu\n" +
                "Şi mândră, arz-o focul;\n" +
                "Ei, Cătălin, acu-i acu\n" +
                "Ca să-ţi încerci norocul.\n" +
                "\n" +
                "Şi-n treacăt o cuprinse lin\n" +
                "Într-un ungher degrabă.\n" +
                "- Da' ce vrei, mări Cătălin?\n" +
                "Ia du-t' de-ţi vezi de treabă.\n" +
                "\n" +
                "- Ce voi? Aş vrea să nu mai stai\n" +
                "Pe gânduri totdeauna,\n" +
                "Să râzi mai bine şi să-mi dai\n" +
                "O gură, numai una.\n" +
                "\n" +
                "- Dar nici nu ştiu măcar ce-mi ceri,\n" +
                "Dă-mi pace, fugi departe -\n" +
                "O, de luceafărul din cer\n" +
                "M-a prins un dor de moarte.\n" +
                "\n" +
                "- Dacă nu ştii, ţi-aş arăta\n" +
                "Din bob în bob amorul,\n" +
                "Ci numai nu te mânia,\n" +
                "Ci stai cu binişorul.\n" +
                "\n" +
                "Cum vânătoru-ntinde-n crâng\n" +
                "La păsărele laţul,\n" +
                "Când ţi-oi întinde braţul stâng\n" +
                "Să mă cuprinzi cu braţul;\n" +
                "\n" +
                "Şi ochii tăi nemişcători\n" +
                "Sub ochii mei rămâie...\n" +
                "De te înalţ de subsuori\n" +
                "Te-nalţă din călcâie;\n" +
                "\n" +
                "Când faţa mea se pleacă-n jos,\n" +
                "În sus rămâi cu faţa,\n" +
                "Să ne privim nesăţios\n" +
                "Şi dulce toată viaţa;\n" +
                "\n" +
                "Şi ca să-ţi fie pe deplin\n" +
                "Iubirea cunoscută,\n" +
                "Când sărutându-te mă-nclin,\n" +
                "Tu iarăşi mă sărută.\n" +
                "\n" +
                "Ea-l asculta pe copilaş\n" +
                "Uimită şi distrasă,\n" +
                "Şi ruşinos şi drăgălaş,\n" +
                "Mai nu vrea, mai se lasă,\n" +
                "\n" +
                "Şi-i zice-ncet: - Încă de mic\n" +
                "Te cunoşteam pe tine,\n" +
                "Şi guraliv şi de nimic,\n" +
                "Te-ai potrivi cu mine...\n" +
                "\n" +
                "Dar un luceafăr, răsărit\n" +
                "Din liniştea uitării,\n" +
                "Dă orizon nemărginit\n" +
                "Singurătăţii mării;\n" +
                "\n" +
                "Şi tainic genele le plec,\n" +
                "Căci mi le umple plânsul\n" +
                "Când ale apei valuri trec\n" +
                "Călătorind spre dânsul;\n" +
                "\n" +
                "Luceşte c-un amor nespus,\n" +
                "Durerea să-mi alunge,\n" +
                "Dar se înalţă tot mai sus,\n" +
                "Ca să nu-l pot ajunge.\n" +
                "\n" +
                "Pătrunde trist cu raze reci\n" +
                "Din lumea ce-l desparte...\n" +
                "În veci îl voi iubi şi-n veci\n" +
                "Va rămânea departe...\n" +
                "\n" +
                "De-aceea zilele îmi sunt\n" +
                "Pustii ca nişte stepe,\n" +
                "Dar nopţile-s de-un farmec sfânt\n" +
                "Ce nu-l mai pot pricepe.\n" +
                "\n" +
                "- Tu eşti copilă, asta e...\n" +
                "Hai ş-om fugi în lume,\n" +
                "Doar ni s-or pierde urmele\n" +
                "Şi nu ne-or şti de nume,\n" +
                "\n" +
                "Căci amândoi vom fi cuminţi,\n" +
                "Vom fi voioşi şi teferi,\n" +
                "Vei pierde dorul de părinţi\n" +
                "Şi visul de luceferi.\n" +
                "\n" +
                "...\n" +
                "\n" +
                "Porni luceafărul. Creşteau\n" +
                "În cer a lui aripe,\n" +
                "Şi căi de mii de ani treceau\n" +
                "În tot atâtea clipe.\n" +
                "\n" +
                "Un cer de stele dedesubt,\n" +
                "Deasupra-i cer de stele -\n" +
                "Părea un fulger ne'ntrerupt\n" +
                "Rătăcitor prin ele.\n" +
                "\n" +
                "Şi din a chaosului văi,\n" +
                "Jur împrejur de sine,\n" +
                "Vedea, ca-n ziua cea dentâi,\n" +
                "Cum izvorau lumine;\n" +
                "\n" +
                "Cum izvorând îl înconjor\n" +
                "Ca nişte mări, de-a-notul...\n" +
                "El zboară, gând purtat de dor,\n" +
                "Pân' piere totul, totul;\n" +
                "\n" +
                "Căci unde-ajunge nu-i hotar,\n" +
                "Nici ochi spre a cunoaşte,\n" +
                "Şi vremea-ncearcă în zadar\n" +
                "Din goluri a se naşte.\n" +
                "\n" +
                "Nu e nimic şi totuşi e\n" +
                "O sete care-l soarbe,\n" +
                "E un adânc asemene\n" +
                "Uitării celei oarbe.\n" +
                "\n" +
                "- De greul negrei vecinicii,\n" +
                "Părinte, mă dezleagă\n" +
                "Şi lăudat pe veci să fii\n" +
                "Pe-a lumii scară-ntreagă;\n" +
                "\n" +
                "O, cere-mi, Doamne, orice preţ\n" +
                "Dar dă-mi o altă soarte,\n" +
                "Căci tu izvor eşti de vieţi\n" +
                "Şi dătător de moarte;\n" +
                "\n" +
                "Reia-mi al nemuririi nimb\n" +
                "Şi focul din privire,\n" +
                "Şi pentru toate dă-mi în schimb\n" +
                "O oră de iubire...\n" +
                "\n" +
                "Din chaos, Doamne,-am apărut\n" +
                "Şi m-aş întoarce-n chaos...\n" +
                "Şi din repaos m-am născut,\n" +
                "Mi-e sete de repaos.\n" +
                "\n" +
                "- Hyperion, ce din genuni\n" +
                "Răsai c-o-ntreagă lume,\n" +
                "Nu cere semne şi minuni\n" +
                "Care n-au chip şi nume;\n" +
                "\n" +
                "Tu vrei un om să te socoţi\n" +
                "Cu ei să te asameni?\n" +
                "Dar piară oamenii cu toţi,\n" +
                "S-ar naşte iarăşi oameni.\n" +
                "\n" +
                "Ei numai doar durează-n vânt\n" +
                "Deşerte idealuri -\n" +
                "Când valuri află un mormânt,\n" +
                "Răsar în urmă valuri;\n" +
                "\n" +
                "Ei doar au stele cu noroc\n" +
                "Şi prigoniri de soarte,\n" +
                "Noi nu avem nici timp, nici loc\n" +
                "Şi nu cunoaştem moarte.\n" +
                "\n" +
                "Din sânul vecinicului ieri\n" +
                "Trăieşte azi ce moare,\n" +
                "Un soare de s-ar stinge-n cer\n" +
                "S-aprinde iarăşi soare;\n" +
                "\n" +
                "Părând pe veci a răsări,\n" +
                "Din urmă moartea-l paşte,\n" +
                "Căci toţi se nasc spre a muri\n" +
                "Şi mor spre a se naşte.\n" +
                "\n" +
                "Iar tu, Hyperion, rămâi\n" +
                "Oriunde ai apune...\n" +
                "Cere-mi cuvântul meu dentâi -\n" +
                "Să-ţi dau înţelepciune?\n" +
                "\n" +
                "Vrei să dau glas acelei guri,\n" +
                "Ca dup-a ei cântare\n" +
                "Să se ia munţii cu păduri\n" +
                "Şi insulele-n mare?\n" +
                "\n" +
                "Vrei poate-n faptă să arăţi\n" +
                "Dreptate şi tărie?\n" +
                "Ţi-aş da pământul în bucăţi\n" +
                "Să-l faci împărăţie.\n" +
                "\n" +
                "Îţi dau catarg lângă catarg,\n" +
                "Oştiri spre a străbate\n" +
                "Pământu-n lung şi marea-n larg,\n" +
                "Dar moartea nu se poate...\n" +
                "\n" +
                "Şi pentru cine vrei să mori?\n" +
                "Întoarce-te, te-ndreaptă\n" +
                "Spre-acel pământ rătăcitor\n" +
                "Şi vezi ce te aşteaptă.\n" +
                "\n" +
                "...\n" +
                "\n" +
                "În locul lui menit din cer\n" +
                "Hyperion se-ntoarse\n" +
                "Şi, ca şi-n ziua cea de ieri,\n" +
                "Lumina şi-o revarsă.\n" +
                "\n" +
                "Căci este sara-n asfinţit\n" +
                "Şi noaptea o să-nceapă;\n" +
                "Răsare luna liniştit\n" +
                "Şi tremurând din apă\n" +
                "\n" +
                "Şi umple cu-ale ei scântei\n" +
                "Cărările din crânguri.\n" +
                "Sub şirul lung de mândri tei\n" +
                "Şedeau doi tineri singuri:\n" +
                "\n" +
                "- O, lasă-mi capul meu pe sân,\n" +
                "Iubito, să se culce\n" +
                "Sub raza ochiului senin\n" +
                "Şi negrăit de dulce;\n" +
                "\n" +
                "Cu farmecul luminii reci\n" +
                "Gândirile străbate-mi,\n" +
                "Revarsă linişte de veci\n" +
                "Pe noaptea mea de patimi.\n" +
                "\n" +
                "Şi de asupra mea rămâi\n" +
                "Durerea mea de-o curmă,\n" +
                "Căci eşti iubirea mea dentâi\n" +
                "Şi visul meu din urmă.\n" +
                "\n" +
                "Hyperion vedea de sus\n" +
                "Uimirea-n a lor faţă:\n" +
                "Abia un braţ pe gât i-a pus\n" +
                "Şi ea l-a prins în braţe...\n" +
                "\n" +
                "Miroase florile-argintii\n" +
                "Şi cad, o dulce ploaie,\n" +
                "Pe creştetele-a doi copii\n" +
                "Cu plete lungi, bălaie.\n" +
                "\n" +
                "Ea, îmbătată de amor,\n" +
                "Ridică ochii. Vede\n" +
                "Luceafărul. Şi-ncetişor\n" +
                "Dorinţele-i încrede:\n" +
                "\n" +
                "- Cobori în jos, luceafăr blând,\n" +
                "Alunecând pe-o rază,\n" +
                "Pătrunde-n codru şi în gând,\n" +
                "Norocu-mi luminează!\n" +
                "\n" +
                "El tremură ca alte dăţi\n" +
                "În codri şi pe dealuri,\n" +
                "Călăuzind singurătăţi\n" +
                "De mişcătoare valuri;\n" +
                "\n" +
                "Dar nu mai cade ca-n trecut\n" +
                "În mări din tot înaltul:\n" +
                "- Ce-ţi pasă ţie, chip de lut,\n" +
                "Dac-oi fi eu sau altul?\n" +
                "\n" +
                "Trăind în cercul vostru strâmt\n" +
                "Norocul vă petrece,\n" +
                "Ci eu în lumea mea mă simt\n" +
                "Nemuritor şi rece.\n" +
                "\n" +
                                  "Eminescu"); }
    public void clickOnSubmitButton () {
        clickOn(submitButton);
    }
}
