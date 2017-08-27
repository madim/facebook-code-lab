import java.nio.CharBuffer;
import java.util.*;

/**
 * Created by madi on 5/30/17.
 */
public class LeetCode {
    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        String[] list1 = {"cy", "fmdvnjchbgyvqxhltp", "mfphkluynqdcpyeslkqvtqvdmfy", "vtpfbct", "wnjpfyeudhwnhjswjw", "yrtdzdksbylvzsp", "pvwsivpywsaotcodxskm", "mzujuirodcyrdggislv", "orpjcxbpiqblcnbmvklpt", "qhpwrzdgemowtmhuqaprnx", "s", "qujzkylumzofhvgsdfwrmfilemocwx", "fovhvrfagque", "bbbpmg", "sqzusqazdnkvmypojj", "nrgrsmlfjh", "gq", "oujhqcafneqbugktdgjvsymxezt", "fkbzzojlyjfvzcubpdghspjjhg", "ckjhd", "scfrplcghsvjtvczbbufhempnniomi", "tetkvgymmc", "cwiraaifayvjuts", "adlwyjjcevxiyhhztujxibhnetzcr", "cgcpmuilfbtznzcjwigjiza", "dwvqvvuoluejglzomug", "rencyfevyryyh", "ni", "vdsxlogmojpfbzzgzqbeszhcybie", "akfxusmcbcu", "bxdkymdetnmiqjfuyiaurrzcbf", "lc", "pdptgnsfgge", "yfvckhcxbbvhcmlssiniprrxdekqvq", "utmztmj", "fjyvjdquymjockocbulmdwkhgtkeu", "ibinxaguabruqrxdjvnpieh", "lhtvmcjdvosiz", "dbpjuhmrwaux", "yfyvlzmgegivwct", "sz", "ixwsfqwqsohvujzooing", "byxmsyh", "txfhutapniccctvmstomcztziuj", "eqpamslernvggwshjilspa", "bvyzugvmxeinxe", "vdoauessqmfzhdmcudxriteuekvq", "ypzesaecqtwdaqsknxtvax", "vyqvsqfwjhvxtecl", "fvaifxqwwgqatwrowjwgdhutrp", "yatffdwfcdmgyiidarlywnbz", "dazlsgvred", "hswwvbvlojkabobetohr", "wnsjwd", "kfkkodbhxumaqwsbxxwvbkwdo", "kxnnhcddhkpdmgzvzvcgxxui", "rxibw", "prfaupijpjlfumjz", "vezfxnfixeqpsksxzaggmoaplssaf", "zhgoss", "ouqqhhttedrrcfjpjrsugzqe", "jepasojvjxjs", "ggonhcxpwg", "gi", "xxaiudiooentluxnzqzdlyizkbja", "lllxfvlp", "ypgvxqzk", "ifoqtwqtqkewzhsz", "gntkmllhzlqlcf", "ahfixzgfxhwuzcrrtywdl", "mqf", "tqh", "kkxzt", "scyj", "dzpcfnnqfpkqwz", "jafvvkfcqexibmrtlq", "ykaduoxyrovotpersuem", "ghcpmxhnjdnht", "xkxh", "ymmkqrpfglapuncml", "sqevvkwxfenxilszdmndvxqrqaoqim", "uknxgxvyav", "lqycqftakpkkibxh", "sithpyvkgofiikoxyvvqquhpnmevx", "xzbryxnvfubixb", "thozna", "vxzualmrywz", "ekrjbfunjfncj", "ligurjkvvozlmsyg", "trt", "msnkcpmjdcsdwljurfzzds", "t", "uiestbomlafzfhiwyfwtylhpuq", "r", "vaocnnyvpvukpqnbddnllex", "ybtolssruxleswhatcylthwyja", "zldopwygfasheullxt", "ssnqpnjqtabdniplkxyvdbava", "qnyogjmy", "zkunnmwkphkhkjfze", "onbsunlmaliuekisrnjs", "bawieyjxqg", "ehbudtdgirmaexrsplgwqqoezqooft", "vxtzpejqzpumisbapyxjw", "tzqpu", "kzdxdoruesblyqv", "axbaaxbopmovaqwjczril", "hdffxomnfma", "arzhouzpsohkl", "iarmgtdi", "gwxlccjorsdctk", "xvxdosmtlrhfxefleovy", "gisgzcirgnvupstemtnalghgxfwn", "siypxsnkwlccguldsdfhe", "vvjbqzmmutisiaqijyihnrjymue", "lutzfawfakzdmnwqdhqdkjwkjt", "tmdgraie", "qinushvdfgwvrvafctlqnrdo", "mbettzruhc", "vrjowx", "hkaawlafgs", "szeg", "lxwnha", "hdoipyzvgbvgytrtwrztunsfjd", "uofxsrxlmbwpcsqgnnunnziaiazxlg", "mtahkojepybudxzmrhmcpemdijnqy", "wfuwztdpwomilpwzidsimhn", "bxuhguvpylqshoiarerkeaztku", "rzbvsxylhhndlwvytkxkjgpakqlafx", "qqswf", "enbhyptwwfrssl", "okacdbvyilmq", "yifqtjjfelbcedsmmtv", "tsllhzaulmoyiuaeiieuqe", "lguceiczeqifsd", "uojgmcaibsmasm", "gixfxtsxezpphlvgqaijzhruxnzre", "jjhpwb", "pvknsuhwnaj", "kwcrdbkorbkrzdnqurixnywt", "uvzxjorqqt", "iuscgqjcwowwqkd", "mjhzoqvegt", "tpktxhelxoybjtsoemb", "lwrtn", "xaxpcecc", "pcntfn", "zjjsekschaopu", "lwbwletcaofpppysizfrytnsovogc", "gwiqnehdugpwitajq", "aehg", "goankikwndnbhxvzarqhy", "pyuohhbyomephsyujo", "eavspnbrcznq", "lhnhpl", "hcakswhdreq", "l", "iwmqtdz", "qraniffczgrmppqgm", "yvmbiqmjcrujsfzdvtlwqaomf", "gaszfiw", "wzoamfptpshoz", "exnqfp", "zvxlbexlqjvyedizyxtkjwotj", "uakzgikzobbtuveftw", "yaczlo", "vc", "vsjepkutyblkcpxs", "trqmqshekezcciknpdnchqhzyqzs", "jzzvfephyyiotsyxnsashhy", "jhzgwfc", "kfezvhkn", "fxuf", "tcmgpfjiqugpqilyfmrgrpgyklorb", "inycairmcqpsznyixzpotxkkgszqfu", "izyawcmcrf", "sbxuo", "bzktihfecg", "svnpwfcvzqjqlzuptbbxffrrqu", "kautwocniofvvtgbgdgpsz", "cn", "rgjvuygqhncsw", "yszsgtavqthlqpbuyuqrjfoisymce", "gt", "mzbam", "xkxyslrurtpjpepnqalygbgvnm", "kzaoyr", "pjdza", "uxjaiml", "jt", "bpbuvfnusch", "snpbufgfqsjqfdks", "qoaofevvzz", "bhgjzbnzu", "uacxmxnyggwpfvnbkleixiffuewb", "qd", "dthldbbywrpey", "cpvjefz", "kchoweyyxubavnlsmuyhdys", "gqpybei", "lrjvyhinrcsfukexoorx", "urfzzkcntxreoam", "ivjxkcjujxeobngolyiefyfpqvvqc", "cglahzfunybaiynytqepobsxcatj", "wfiixreqssshuqqijtwjqbs", "acgrriscrkjvqimfarwq", "xqlwccuvpxlvos", "deyilwygcil", "ew", "huninssldzabvzm", "kpfsmxwybembvlzhwnzuhbb", "lzbvuexdabhemguqbbhojyyaylkoqp", "rhjo", "ylykrkizp", "lsfrzpmnetijxrjjcgkvhlghvbnaxn", "lreieilsqzlbxh", "yyamqstnr", "vrznbkcbgludfxkymk", "youswyapajovveqd", "uclleafuqfgq", "mujkqzbjsrubvimi", "lphzonfnhgpabmmkgkqxjgjvli", "mvhiftizdxghuasoqgfwhwnplj", "ghpxcavbujpbhzwacizn", "nubkluchstwyx", "rcrhbqhnlykl", "pwpcvnbdvugh", "ugqxdkmgvbcdiyrtwq", "nxnfoqueixaonrrbmrvwromgndyxlj", "zuyyovrnpnhy", "smrgvdizqkeqlor", "hqpptndkehljnhkqneyhobynydj", "sgrscxaohtrlji", "zexmwwtdafzxjgeltewcjqolbon", "vhgwizeefdffyfskquvczcrjcila", "tqexcfpdsvpwgdukrisv", "qhvkrrqpopziwsaizzytcz", "wswmpoboblzz", "jqcnokncgcotbsfjtjmmni", "skvzwmvact", "wrwvef", "omqafalbkdvdeixispoalqoaapo", "lyijfvliamtxivrt", "ijhytnzfjuahopfsw", "vgtmezjziufoizhm", "dldus", "daxidqyrbthqdmmqocdvpvw", "kxzkobleovyfhs", "aqgnsjjcicfvwwlfqsxqjkexczgcx", "hclbezakrykutoqae", "qmekpk", "mnijheomifjjqhaory", "lw", "tuqsudhjhiiinaaarq", "ozkvqeacrrxb", "dgep", "nvcftrakncstqwkhidxjb", "xymaslqskizfoebmhxoqqalnumgln", "qkjrjh", "xgqgytwdmbzhfvdyycq", "gdtvcgqeuxnny", "tzarpdbf", "odlphyrmiaxkenglxyc", "ej", "nvu", "jshalcnkuflhisyavuqmyqmplwyxj", "ypvliwbozhwrapbjmkfzhxvnwdyovu", "hrxdirkylcdxjnqkhoscekcqf", "kyyujdlucfbxna", "ahdkdnnlafcllfgjunvww", "gkjwyyleduetm", "escyqxdjjnew", "sebbsiocwsgrt", "gyjkikkduezecyetfknaiqaftra", "pzvfmaximwb", "ndavhonszjrwlje", "igqrmjykhriva", "ddknhucoxcgonbtzmfcoy", "qguaoomdxeccpgnutslodeiidn", "kyfnv", "gqjassccrsay", "lrpirnm", "bmwwszseacvrxrhzwswjekkrnbvzj", "tnetxtrqlmyc", "enqhbehmehyfxkhlunxszmfrjyz", "qe", "uya", "lbvddysslsffhjyedpbsdjgcfvxrby", "ovnkmefspiwvnraqebm", "mqukdqkenicmqnunwdyh", "fmeopjhysxpkrrq", "rxybzggji", "gluqzqm", "eupkjxmdxoktcikqtjtfmf", "wbqzahmon", "talyonyoiqzwqzfmwdko", "fmq", "zl", "ggzpajmkpueoqeood", "ci", "rowfip", "tyxawcxofumlkmxvjw", "ajxbkbsfrhtgeyzrvsrfvqczka", "huawdq", "njqehygnvxqdivdxrrvaoffgtr", "tooxursriygrbtmrwggbrwb", "axzmktqbhevspntsjffvehsxozdc", "iidyb", "mgimmvyceitswfhocaykwsnvngzx", "uafxncjjxahzkmuzactfpakvqno", "fvzgcbeenubkofwo", "rliyvcqlujdll", "uw", "KFC"};
        String[] list2 = {"qvylmompfxmc", "bdcafsyhozpniqfekzdhfblbyqncl", "db", "vtpfbct", "jxsoaiqdfelqtox", "mzujuirodcyrdggislv", "xfhdfjcqlkkttxtncnmxwcqmyxt", "gg", "jbtwumtquimvglsvzvcfkbnblvxkp", "qhpwrzdgemowtmhuqaprnx", "xvptewzgksdjbxpperujz", "npeplgkfszzwuewaskbnmobuk", "qujzkylumzofhvgsdfwrmfilemocwx", "fovhvrfagque", "nrgrsmlfjh", "gq", "hvua", "fkbzzojlyjfvzcubpdghspjjhg", "scfrplcghsvjtvczbbufhempnniomi", "qljhwrf", "tetkvgymmc", "sdxjwstqbsxniffisbtkpqtzjukdfd", "cwiraaifayvjuts", "a", "ni", "ptpljyjfhrm", "vdsxlogmojpfbzzgzqbeszhcybie", "odcxwbfmqjdhyespr", "akfxusmcbcu", "pdptgnsfgge", "wnycienzwklxxjhhhnnsgcu", "mbzmtdrpxjxzqgqhralferroodpmi", "mwdbqfikkcfzs", "glrapztasmymbc", "mgwafzldmtnoszxsxftt", "lhtvmcjdvosiz", "yfyvlzmgegivwct", "sz", "ixwsfqwqsohvujzooing", "fyayljzogupbhcugalsunpo", "sxqwxzqgeesgdlrk", "yjibhdsmdknuzem", "byxmsyh", "txfhutapniccctvmstomcztziuj", "eqpamslernvggwshjilspa", "bvyzugvmxeinxe", "xv", "imryg", "ypzesaecqtwdaqsknxtvax", "jcoxdvufaueduwwqg", "ydsccchlsxyvtroqvtzpenolszl", "kdo", "yatffdwfcdmgyiidarlywnbz", "dazlsgvred", "kfkkodbhxumaqwsbxxwvbkwdo", "bgoosv", "jkqkggcrsmovqgsjcnufj", "qwbkfqvjyoeuvkzqmuvzkzjqxwsity", "ymujuphrrzareuotau", "zhgoss", "fkhubgkqpi", "lsvzh", "qejsvrluymkedfvquxpsmfgzmtcr", "ffbfvnonipxawp", "uqhdwnombjiyl", "ifoqtwqtqkewzhsz", "jrhxymo", "yxhsbpmhzhwtjvrrp", "ahfixzgfxhwuzcrrtywdl", "mqf", "tqh", "scyj", "dzpcfnnqfpkqwz", "fxzsgkrrrrpdxsxkytgtzwnmowjus", "jvnw", "lynbhhqoxw", "ykaduoxyrovotpersuem", "ghcpmxhnjdnht", "jqfnbuxxokdhejnsfkqrnubnod", "kkchdg", "ahltpbg", "xzbryxnvfubixb", "thozna", "t", "jk", "uiestbomlafzfhiwyfwtylhpuq", "xvdeza", "r", "vaocnnyvpvukpqnbddnllex", "ybtolssruxleswhatcylthwyja", "zldopwygfasheullxt", "leqadctfx", "bawieyjxqg", "z", "tzqpu", "axbaaxbopmovaqwjczril", "plcvunb", "hdffxomnfma", "dljtbtyvwt", "atpcjzynsgrrucmxgyvmbwknxueg", "arzhouzpsohkl", "iarmgtdi", "jfesqbykvtzfxqzkzwpcgqoo", "rxjzbavvpjpjzstpoojbdmst", "axvxahk", "xvxdosmtlrhfxefleovy", "cwaylkutgjeboxwezgicnnq", "dgsxmgepbfbmse", "siypxsnkwlccguldsdfhe", "cwckw", "lutzfawfakzdmnwqdhqdkjwkjt", "tmdgraie", "mbettzruhc", "hptvrbmmvehmdgyplluticqvzklkj", "vrjowx", "ymkltetnvieybea", "lxwnha", "uofxsrxlmbwpcsqgnnunnziaiazxlg", "hypqjhzevneaot", "wfuwztdpwomilpwzidsimhn", "dftjwzrxywyjdvhypiqolfkgrs", "tlwxthvbvnizygg", "vjaxsjjkt", "fgkbfkphurlsbqovtudqkzcblfstyp", "tsllhzaulmoyiuaeiieuqe", "pzjhzrydpvqtqco", "gskbfbpixiqxovbmmgsnsgmkcyq", "pvknsuhwnaj", "kwcrdbkorbkrzdnqurixnywt", "mjhzoqvegt", "tpktxhelxoybjtsoemb", "aehg", "goankikwndnbhxvzarqhy", "fg", "lhnhpl", "hcakswhdreq", "ahqzd", "yvmbiqmjcrujsfzdvtlwqaomf", "gaszfiw", "efwibtyaka", "wzoamfptpshoz", "dt", "lnkbqtvr", "dqxhkyjtbnnduryams", "vc", "wslrhymuzpwdmkayvd", "xmmnlvnhcwcnjblkcgglcuhgawh", "trqmqshekezcciknpdnchqhzyqzs", "rwghxgjubcgi", "jhzgwfc", "ezogaqtmtzs", "fxuf", "tcmgpfjiqugpqilyfmrgrpgyklorb", "inycairmcqpsznyixzpotxkkgszqfu", "nkwtpxjmbdqayfm", "wicabsdxufytxpteo", "al", "sbxuo", "atkshzntrrnunvjlcjhfwtbsb", "kautwocniofvvtgbgdgpsz", "srqhqoxseolexcnrmllczphdpmea", "cn", "rgjvuygqhncsw", "zayjjfkzgdqphcwvwbxfglrwpnv", "iiie", "mzbam", "kzaoyr", "pjdza", "ygrttygzqlvmcrfyoffdsveqnagml", "jt", "gehmqnkvzjwsirjrghaz", "wmtutepdywlczjxj", "snpbufgfqsjqfdks", "qoaofevvzz", "dthldbbywrpey", "cpvjefz", "qwrckigucnxdtrd", "gqpybei", "qynudxvmvsskakhxhssgvqlibnbt", "lrjvyhinrcsfukexoorx", "urfzzkcntxreoam", "vzfolaqedvujmtar", "ivjxkcjujxeobngolyiefyfpqvvqc", "domvppawjpxoypbmdfmqvxttvcd", "doxbhrdchpghcnarqjsnuxsqa", "deyilwygcil", "ew", "kpfsmxwybembvlzhwnzuhbb", "lzbvuexdabhemguqbbhojyyaylkoqp", "ehc", "rhjo", "lsfrzpmnetijxrjjcgkvhlghvbnaxn", "jsacqzurl", "lreieilsqzlbxh", "yyamqstnr", "ujayq", "xechlrlhxm", "uclleafuqfgq", "nhp", "mvhiftizdxghuasoqgfwhwnplj", "d", "nubkluchstwyx", "hzwbzdtrjtbgzkkewqoetyewyki", "umfprfpqcjqq", "rcrhbqhnlykl", "pwpcvnbdvugh", "ugqxdkmgvbcdiyrtwq", "zuyyovrnpnhy", "smrgvdizqkeqlor", "lenewcr", "lauwjyuspjgukfdlfkddnwnvxtuz", "hqpptndkehljnhkqneyhobynydj", "sgrscxaohtrlji", "tvvemzljlsipevwawjhtbofejgknz", "vhgwizeefdffyfskquvczcrjcila", "tqexcfpdsvpwgdukrisv", "tiejzsbbwrucyipytbqxic", "vruwihem", "qhvkrrqpopziwsaizzytcz", "iouhkckkchibq", "jqcnokncgcotbsfjtjmmni", "fecrcudrkqhamllvdpfupo", "reqjrszqncmmhhizbyjn", "vdqhuz", "apdljtxawqqqhfpgshmywfwqizl", "pfpkfcurweisqjmonfmvbpbwvwvj", "kcwirvcuslqhsibpr", "ijhytnzfjuahopfsw", "ghfsszqvayr", "zscuwwnuvbadbgqclsfstcourf", "spazdtqlhugrykirkgpayrdi", "dldus", "cxazqaullipeiliiobhntfqk", "daxidqyrbthqdmmqocdvpvw", "vvbfxxyxl", "karrttmvicolmfcrhdahvaiu", "aqgnsjjcicfvwwlfqsxqjkexczgcx", "ctnhasva", "rylxvysmmrhczp", "qmekpk", "ijjceyn", "zogodcgwhtpixuqryjesetfizn", "oixkquosrvjzpwnyjyptg", "ozkvqeacrrxb", "dgep", "xymaslqskizfoebmhxoqqalnumgln", "zxesorjanecpimdrczzvlhvxymdcs", "zcpeykrsqsvqylglhghfzj", "tzarpdbf", "dixhtxbuulh", "odlphyrmiaxkenglxyc", "ej", "toehrkvtzzmmkuhthnxn", "gzphqvv", "ypvliwbozhwrapbjmkfzhxvnwdyovu", "hrxdirkylcdxjnqkhoscekcqf", "ahdkdnnlafcllfgjunvww", "gkjwyyleduetm", "zjaoxirwcwnjdxedhw", "sebbsiocwsgrt", "gyjkikkduezecyetfknaiqaftra", "mpckxxgmkstbvsnubkqdezlbh", "ndavhonszjrwlje", "ddknhucoxcgonbtzmfcoy", "qguaoomdxeccpgnutslodeiidn", "kyfnv", "pxrkuc", "esq", "ioeyfrxeqwqqbmlbsunzdaqcol", "tkbhjhalybtakkoce", "tnetxtrqlmyc", "fqlbgywoltdiiykvbswlycy", "mnalljgsabtzwafemkoxr", "qe", "uya", "dirlyeeabnqahqnwozwmrvsrnfi", "icmjtaekiuhkitklk", "ovnkmefspiwvnraqebm", "crymoulugdudxdpsinjcucp", "gluqzqm", "wbqzahmon", "aklvbpzryqmu", "wnjjatiwaxmkpaoni", "hyzrqkqmt", "nvszewiautrwmzpatvbjiqzbi", "zl", "ggzpajmkpueoqeood", "ci", "njqehygnvxqdivdxrrvaoffgtr", "cspgf", "wtqjvoxrkqujromjlcyjubvbpnsi", "gpsbvtskfw", "uafxncjjxahzkmuzactfpakvqno", "rliyvcqlujdll", "uw", "juevbgslcfqhagqfxilopyqnnea", "upfaqmlgldygptrnrvydakljgxjw", "KFC"};

        int[][] arr = {
                {1, 2},
                {3, 4}
        };

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        leetCode.intersection(nums1, nums2);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer val : nums1) {
            map.put(val, 0);
        }

        for (Integer val : nums2) {
            if (map.get(val) != null) map.put(val, 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            int key = entry.getKey();
            if (val == 1) {
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    private int firstUniqChar2(String s) {
        int[] chars = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len; i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    // 387. First Unique Character in a String
    public int firstUniqChar(String s) {
        if (s.length() == 0) return -1;

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character character : chars) {
            map.put(character, 0);
        }

        for (Character character : chars) {
            map.put(character, map.get(character) + 1);
        }

        char ch = '0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            char key = entry.getKey();
            if (val == 1) {
                ch = key;
                break;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }


    // 530. Minimum Absolute Difference in BST
    private int rootVal = 0;
    private int min = Integer.MAX_VALUE;
    private int val = 0;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;

        int diff = Math.abs(root.val - val);

        if (diff < min) {
            min = diff;
        }

        return min;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
//        visit(node);
        inorder(node.right);
    }

    // 226. Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        TreeNode tree = root;

        if (root == null) return tree;

        TreeNode temp = root.left;
        tree.left = root.right;
        tree.right = temp;

        invertTree(tree.left);
        invertTree(tree.right);

        return tree;
    }

    // 492. Construct the Rectangle
    public int[] constructRectangle(int area) {
        int[] rect = new int[2];

        // height >= width
        int min = Integer.MAX_VALUE;
        int width = 0;
        for (int length = 1; length < area + 1; length++) {
            width = area / length;
            if (area % length == 0 && length >= width) {
                if (length - width < min) {
                    min = length - width;
                    rect[0] = length;
                    rect[1] = width;
                }
            }
        }

        System.out.print(Arrays.toString(rect));


        return rect;
    }

    // 566. Reshape the Matrix
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int col = nums.length, row = nums[0].length;

        if (r * c != col * row) return nums;

        int[][] result = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            result[i / col][i % col] = nums[i / row][i % row];
        }

        return result;
    }

    private int xyTo1D(int N, int row, int col) {
        return N * row + col;
    }

    // 476. Number Complement
    public int findComplement(int num) {
        // x ^ (1 << k) invert kth bit of x
        String bits = Integer.toBinaryString(num);
        StringBuilder nBits = new StringBuilder(bits);
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '0') {
                nBits.setCharAt(i, '1');
            } else {
                nBits.setCharAt(i, '0');
            }
        }

        return Integer.parseInt(nBits.toString(), 2);
    }

    // 167. Two Sum II - Input array is sorted
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;
        int sum = numbers[i] + numbers[j];
        while (sum < target || sum > target) {
            if (numbers[i + 1] + numbers[j] <= target) {
                i++;
            } else {
                j--;
            }
            sum = numbers[i] + numbers[j];
        }

        int[] ans;
        if (sum == target) {
            ans = new int[2];
            ans[0] = i + 1;
            ans[1] = j + 1;
        } else {
            ans = new int[1];
            ans[0] = 0;
        }

        return ans;
    }

    // 283. Move Zeroes
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (nums[i] == 0 && j <= nums.length - 1) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }

    // 258. Add Digits
    public int addDigits(int num) {
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        return 1 + ((num - 1) % 9);
    }

    // 599. Minimum Index Sum of Two Lists
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.get(list2[i]) != null) {
                map2.put(map.get(list2[i]), i);
            }
        }

        List<String> restaurants = new ArrayList<>();

        int sum = list1.length + list2.length - 2;

        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            int index1 = entry.getKey();
            int index2 = entry.getValue();
            if (map2.size() == 1) {
                restaurants.add(list1[index1]);
                break;
            }
            if ((index1 + index2) <= sum) {
                if (index1 + index2 < sum) {
                    restaurants = new ArrayList<>();
                    sum = index1 + index2;
                }
                restaurants.add(list1[index1]);
            }
        }

        String[] common = new String[restaurants.size()];
        for (int j = 0; j < restaurants.size(); j++) {
            common[j] = restaurants.get(j);
        }

        return common;
    }

    //371. Sum of Two Integers
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // 389. Find the Difference
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);


        for (int i = 0; i < ss.length; i++) {
            if (ts[i] != ss[i]) {
                return ts[i];
            }
        }


        return ts[ts.length - 1];
    }

    // 111. Minimum Depth of Binary Tree
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return Math.min(left, right) + 1;
    }

    // 104. Maximum Depth of Binary Tree
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    // 448. Find All Numbers Disappeared in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]) - 1;
            if (nums[a] > 0) {
                nums[a] = -nums[a];
            } else {
                nums[a] = nums[a];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }

    // 520. Detect Capital
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (isCap(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
    }

    private boolean isCap(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    // 521. Longest Uncommon Subsequence I
    public int findLUSlength(String a, String b) {
        // TODO: 6/1/17
        int len = 0;

        return len == 0 ? -1 : len;
    }

    // 485. Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == 1) {
                map.put(i, ++count);
            } else {
                i++;
                count = 0;
            }
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > max) {
                max = entry.getValue();
            }
        }

        return max;
    }

    // 292. Nim Game
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    // 463. Island Perimeter
    public int islandPerimeter(int[][] grid) {
        int is = 0;
        int n = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    is++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) n++;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) n++;
                }
            }
        }

        return 4 * is - 2 * n;
    }

    // 496. Next Greater Element I
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            while (!stack.isEmpty()
                    && val > stack.peek()) {
                map.put(stack.pop(), val);
            }
            stack.push(val);
        }
        for (int i = 0; i < findNums.length; i++) {
            findNums[i] = map.getOrDefault(findNums[i], -1);
        }
        return findNums;
    }

    // 561. Array Partition I
    public int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }

    // 557. Reverse Words in a String III
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            answer.append(new StringBuilder(word).reverse()).append(" ");
        }

        return answer.toString().substring(0, answer.length() - 1);
    }

    // 575. Distribute Candies
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> sisters = new HashMap<>();
        for (int val : candies) {
            sisters.put(val, 0);
        }

        int upperBound = candies.length / 2;
        int size = sisters.size();

        if (size > upperBound) {
            size = upperBound;
        }
        return size;
    }

    // 500. Keyboard Row
    public String[] findWords(String[] words) {
        char[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        CharSequence r1 = CharBuffer.wrap(row1);
        CharSequence r2 = CharBuffer.wrap(row2);
        CharSequence r3 = CharBuffer.wrap(row3);

        String[] ans = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(r1)) {
                ans[i] = words[i];
            } else if (words[i].toLowerCase().contains(r2)) {
                ans[i] = words[i];
            } else if (words[i].toLowerCase().contains(r3)) {
                ans[i] = words[i];
            }
        }

        return ans;

    }

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(i));
            }
        }
        return fizzBuzz;
    }

    // 344. Reverse String
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 496. Next Greater Element I
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] ans = new int[findNums.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : findNums) {
            map.put(val, -1);
        }

        for (int i = 0; i < nums.length; i++) {
            int next;
            int cur = nums[i];
            if (i == nums.length - 1) {
                break;
            }
            next = nums[i + 1];

            if (map.get(nums[i]) != null
                    && map.get(nums[i]) == -1) {
                map.put(cur, next);
            }
        }

        for (int i = 0; i < findNums.length; i++) {
            ans[i] = map.get(findNums[i]);
        }

        return ans;
    }
}
