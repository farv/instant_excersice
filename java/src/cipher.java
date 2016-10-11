import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class cipher {
    
    private final static List<String> vocabulary = Arrays.asList("the","and","in","is","it","you","that","was","for","on",
	"with","as","his","they","one","have","this","from","had","by","hot","word",
	"but","what","some","can","out","other","were","all","there","when","up",
	"use","your","how","said","an","each","she","which","do","their","time","if",
	"will","way","about","many","then","them","write","would","like","so","these",
	"her","long","make","thing","him","two","has","look","more","day","could",
	"go","come","did","number","sound","no","most","people","my","over","know",
	"water","than","call","first","who","may","down","side","been","now","find",
	"any","new","work","part","take","get","place","made","live","where","after",
	"back","little","only","round","man","year","came","show","every","good","give",
	"our","under","name","very","through","just","form","sentence","great","think",
	"say","help","low","line","differ","turn","cause","much","mean","before","move",
	"right","boy","old","too","same","tell","does","set","three","want","air",
	"well","also","play","small","end","put","home","read","hand","port","large",
	"spell","add","even","land","here","must","big","high","such","follow","act",
	"why","ask","men","change","went","light","kind","off","need","house","picture",
	"try","us","again","animal","point","mother","world","near","build","self",
	"earth","father","stand","page","should","country","found","answer","school",
	"grow","study","still","learn","plant","cover","food","sun","four","between",
	"state","keep","eye","never","last","let","thought","city","cross","farm","hard",
	"start","might","story","saw","far","draw","left","late","run","don't","while",
	"press","close","night","real","life","few","north","open","together","next",
	"white","children","begin","got","walk","example","ease","paper","group",
	"always","music","those","both","mark","often","letter","until","mile","river",
	"car","feet","care","second","book","carry","took","science","eat","room",
	"friend","began","idea","fish","mountain","stop","once","base","hear","horse",
	"cut","sure","watch","color","face","wood","main","enough","plain","girl",
	"usual","young","ready","above","ever","red","list","though","feel","talk",
	"bird","soon","body","dog","family","direct","pose","leave","song","measure",
	"door","product","black","short","numeral","class","wind","question","happen",
	"complete","ship","area","half","rock","order","fire","south","problem","piece",
	"told","knew","pass","since","top","whole","king","space","heard","best","hour",
	"better","during","hundred","five","remember","step","early","hold","west",
	"ground","interest","reach","fast","verb","sing","listen","six","table",
	"travel","less","morning","simple","several","vowel","toward","war","lay",
	"against","pattern","slow","center","love","person","money","smith","serve",
	"appear","road","map","rain","rule","govern","pull","cold","notice","voice",
	"unit","power","town","fine","certain","fly","fall","lead","cry","dark",
	"machine","note","wait","plan","figure","star","box","noun","field","rest",
	"correct","able","pound","done","beauty","drive","stood","contain","front",
	"teach","week","final","gave","green","quick","develop","ocean","warm","free",
	"minute","strong","special","mind","behind","clear","tail","produce","fact",
	"street","inch","multiply","nothing","course","stay","wheel","full","force",
	"blue","object","decide","surface","deep","moon","island","foot","system",
	"busy","record","boat","common","gold","possible","plane","stead","dry",
	"wonder","laugh","thousand","ago","ran","check","game","shape","equate","hot",
	"miss","brought","snow","tire","bring","yes","distant","fill","east","paint",
	"language","among","grand","ball","yet","wave","drop","heart","present",
	"heavy","dance","engine","position","arm","wide","sail","material","size",
	"vary","settle","speak","weight","general","ice","matter","circle","killer",
	"pair","include","divide","syllable","felt","perhaps","pick","sudden","count",
	"square","reason","length","represent","art","subject","region","energy",
	"hunt","probable","bed","brother","egg","ride","believe","fraction","forest",
	"race","window","store","summer","train","sleep","prove","lone","leg",
	"exercise","wall","catch","mount","wish","sky","board","joy","winter","sat",
	"written","wild","instrument","kept","glass","grass","cow","job","edge","sign",
	"visit","past","soft","fun","bright","police","gas","weather","month","million",
	"bear","finish","happy","hope","flower","clothe","strange","gone","jump","baby",
	"eight","village","meet","root","buy","raise","solve","metal","whether","push",
	"seven","paragraph","third","shall","held","hair","describe","cook","floor",
	"either","result","burn","hill","safe","cat","century","consider","type","law",
	"bit","coast","copy","phrase","silent","tall","sand","soil","roll","temperature",
	"finger","industry","value","fight","lie","beat","excite","natural","view",
	"sense","ear","else","quite","broke","case","middle","son","lake","moment",
	"scale","loud","spring","observe","child","straight","consonant","nation",
	"dictionary","milk","speed","method","organ","pay","age","section","dress",
	"cloud","surprise","quiet","stone","tiny","climb","cool","design","poor","lot",
	"experiment","bottom","key","iron","single","stick","flat","twenty","skin",
	"smile","crease","hole","trade","melody","trip","office","receive","row",
	"mouth","exact","symbol","least","trouble","shout","except","wrote","seed",
	"tone","join","suggest","clean","break","lady","yard","rise","bad","blow",
	"oil","blood","touch","grew","cent","mix","team","wire","cost","lost","brown",
	"wear","garden","equal","sent","choose","fell","fit","flow","fair","bank",
	"collect","save","control","decimal","gentle","woman","captain","practice",
	"separate","difficult","doctor","please","protect","noon","whose","locate",
	"ring","character","insect","caught","period","indicate","radio","spoke",
	"atom","human","history","effect","electric","expect","crop","modern",
	"element","hit","student","corner","party","john","supply","bone","rail",
	"imagine","provide","agree","thus","capital","won't","chair","danger","fruit",
	"rich","thick","soldier","process","operate","guess","necessary","sharp",
	"wing","create","neighbor","wash","bat","rather","crowd","corn","compare",
	"poem","string","bell","depend","meat","rub","tube","famous","dollar","stream",
	"fear","sight","thin","triangle","planet","hurry","chief","colony","clock",
	"mine","tie","enter","major","fresh","search","send","yellow","gun","allow",
	"print","dead","spot","desert","suit","current","lift","rose","continue",
	"block","chart","sell","success","company","subtract","event","particular",
	"deal","swim","term","opposite","wife","shoe","shoulder","spread","arrange",
	"camp","invent","cotton","born","determine","quart","nine","truck","noise",
	"level","chance","gather","shop","stretch","throw","shine","property","column",
	"molecule","select","wrong","gray","repeat","require","broad","prepare","salt",
	"nose","plural","anger","claim","continent","oxygen","sugar","death","pretty",
	"skill","women","season","solution","magnet","silver","thank","branch","match",
	"suffix","especially","fig","afraid","huge","sister","steel","discuss",
	"forward","similar","guide","experience","score","apple","bought","led",
	"pitch","coat","mass","card","band","rope","slip","win","dream","evening",
	"condition","feed","tool","total","basic","smell","valley","nor","double",
	"arrive","master","track","parent","shore","division","sheet","substance",
	"favor","connect","post","spend","chord","fat","glad","original","share",
	"station","dad","bread","charge","proper","bar","offer","segment","slave",
	"duck","instant","market","degree","populate","chick","dear","enemy","reply",
	"drink","occur","support","speech","nature","range","steam","motion","path",
	"liquid","log","meant","quotient","teeth","shell","neck");
    private final static Map<String, String> encodeDictionary = new HashMap<String, String>();
    static {
        encodeDictionary.put("A", "⍢⍙");
        encodeDictionary.put("N", "⍙⍢");
	    encodeDictionary.put("B", "⍙⍢⍢⍢");
		encodeDictionary.put("O", "⍙⍙⍙");
		encodeDictionary.put("C", "⍙⍢⍙⍢");
		encodeDictionary.put("P", "⍢⍙⍙⍢");
		encodeDictionary.put("D", "⍙⍢⍢");
		encodeDictionary.put("Q", "⍙⍙⍢⍙");
		encodeDictionary.put("E", "⍢");
		encodeDictionary.put("R", "⍢⍙⍢");
		encodeDictionary.put("F", "⍢⍢⍙⍢");
		encodeDictionary.put("S", "⍢⍢⍢");
		encodeDictionary.put("G", "⍙⍙⍢");
		encodeDictionary.put("T", "⍙");
		encodeDictionary.put("H", "⍢⍢⍢⍢");
		encodeDictionary.put("U", "⍢⍢⍙");
		encodeDictionary.put("I", "⍢⍢");
		encodeDictionary.put("V", "⍢⍢⍢⍙");
		encodeDictionary.put("J", "⍢⍙⍙⍙");
		encodeDictionary.put("W", "⍢⍙⍙");
		encodeDictionary.put("K", "⍙⍢⍙");
		encodeDictionary.put("X", "⍙⍢⍢⍙");
		encodeDictionary.put("L", "⍢⍙⍢⍢");
		encodeDictionary.put("Y", "⍙⍢⍙⍙");
		encodeDictionary.put("M", "⍙⍙");
		encodeDictionary.put("Z", "⍙⍙⍢⍢");
    }
    
    public static String encode(String s){
        String sol = "";
        for (String item : s.split(" ")){
            sol += encodeWord(item);
        }
        return sol;
    }
    
    public static String decode(String s){
        if(s.isEmpty()){
            return "\n";
        }
        for(String word : vocabulary){
            String codeWord = encodeWord(word);
            if(s.startsWith(codeWord)){
                String newSequence = s.substring(codeWord.length());
                String subSolution = decode(newSequence);
                if(!subSolution.isEmpty()){
                    return word + " " + subSolution;
                }
            }
        }
        return "";
    }
    
    
    private static String encodeWord(String word){
        String codeWord = "";
        
        for (int i = 0; i < word.length(); i++){
            String c = word.charAt(i) + "";
            codeWord += encodeDictionary.get(c.toUpperCase());
        }
    	return codeWord;
    }

}