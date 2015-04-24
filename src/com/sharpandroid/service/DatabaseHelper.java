package com.sharpandroid.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	public DatabaseHelper(Context context,String name,CursorFactory factory,int version){
		super(context,name,factory,version);
	}
	private static final String NAME="jnjh.db";
	private static final int version=1;
	public DatabaseHelper(Context context){
		super(context,NAME,null,version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE sort1(id integer primary key autoincrement,name varchar(20))");
		db.execSQL("CREATE TABLE sort2(id integer primary key autoincrement,name varchar(20),inSort_1 int)");
		db.execSQL("CREATE TABLE sort3(id varchar(10),name varchar(20),jianjie varchar(400),inSort_2 varchar(20))");
		db.execSQL("CREATE TABLE shetuan(id integer primary key autoincrement,name varchar(20),jianjie varchar(400),inSort_3 varchar(20))");
		db.execSQL("CREATE TABLE shetuanbiao(id varchar(10),name varchar(20),jianjie varchar(400))");
		
		db.execSQL("insert into sort1(name) values('语言类')");
		db.execSQL("insert into sort1(name) values('体育类')");
		db.execSQL("insert into sort1(name) values('艺术类')");
		db.execSQL("insert into sort1(name) values('生活类')");
		db.execSQL("insert into sort1(name) values('IT互联网类')");
		
		db.execSQL("insert into sort2(name,inSort_1) values('英语',1)");//1
		db.execSQL("insert into sort2(name,inSort_1) values('日语',1)");//2
		db.execSQL("insert into sort2(name,inSort_1) values('法语',1)");//3
		db.execSQL("insert into sort2(name,inSort_1) values('德语',1)");//4
		db.execSQL("insert into sort2(name,inSort_1) values('俄语',1)");//5
		db.execSQL("insert into sort2(name,inSort_1) values('韩语',1)");//6
		db.execSQL("insert into sort2(name,inSort_1) values('球类',2)");//7
		db.execSQL("insert into sort2(name,inSort_1) values('健美武术',2)");//8
		db.execSQL("insert into sort2(name,inSort_1) values('棋牌',2)");//9
		db.execSQL("insert into sort2(name,inSort_1) values('运动轮滑',2)");//10
		db.execSQL("insert into sort2(name,inSort_1) values('歌唱演讲',3)");//11
		db.execSQL("insert into sort2(name,inSort_1) values('舞蹈',3)");//12
		db.execSQL("insert into sort2(name,inSort_1) values('书画摄影',3)");//13
		db.execSQL("insert into sort2(name,inSort_1) values('戏曲乐器',3)");//14
		db.execSQL("insert into sort2(name,inSort_1) values('表演',3)");//15
		db.execSQL("insert into sort2(name,inSort_1) values('动漫',3)");//16
		db.execSQL("insert into sort2(name,inSort_1) values('烹饪',4)");//17
		db.execSQL("insert into sort2(name,inSort_1) values('手工',4)");//18
		db.execSQL("insert into sort2(name,inSort_1) values('维修',4)");//19
		db.execSQL("insert into sort2(name,inSort_1) values('电子娱乐',4)");//20
		db.execSQL("insert into sort2(name,inSort_1) values('时尚搭配',4)");//21
		db.execSQL("insert into sort2(name,inSort_1) values('化妆美容',4)");//22
		db.execSQL("insert into sort2(name,inSort_1) values('心理',4)");//23
		db.execSQL("insert into sort2(name,inSort_1) values('编程语言',5)");//24
		db.execSQL("insert into sort2(name,inSort_1) values('视频制作',5)");//25
		db.execSQL("insert into sort2(name,inSort_1) values('图像处理',5)");//26
		db.execSQL("insert into sort2(name,inSort_1) values('软件系统',5)");//27
		db.execSQL("insert into sort2(name,inSort_1) values('数据库',5)");//28
		db.execSQL("insert into sort2(name,inSort_1) values('web技术',5)");//29
		db.execSQL("insert into sort2(name,inSort_1) values('电子维修',5)");//30
		
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn01','英语','英语是世界上最被广泛使用的第二语言，是欧盟和许多国际组织与英联邦国家的官方语言之一，也是联合国的工作语言之一。英语的母语使用者数量位居世界第三，少于标准汉语和西班牙语，但上两个世纪英国和美国在文化、经济、军事、政治和科学上的领先地位使得英语成为一种国际语言，如今许多国际场合都使用英语作为沟通的媒介。英语也是与电脑联系最密切的语言，大多数编程语言都与英语有联系，而且随着网络使用，使英文使用更为普及。英语的音节结构是三个辅音、一个元音和四个辅音。','英语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn02','日语','日语、日文，是一种主要为日本列岛上大和民族所使用的语言，是日本的官方语言和最常用的语言。日语属于黏着语，通过在词语上粘贴语法成分来构成句子，称为活用，其间的结合并不紧密、不改变原来词汇的含义只表语法功能。语言系属至今未定，有学者认为属于阿尔泰语系，也有学者认为是扶余语系、南岛语系，也有日本学者认为是孤立语言（有些日本学者继而提出韩日-琉球语族的概念、并认为日语从属之）或日本语系。','日语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn03','法语','法文（又称法语）属于印欧语系罗曼语族，罗曼语族包括中部罗曼语（法语、意大利语、萨丁岛（Sardinia）方言、加泰罗尼亚（Catalunya）语等）、西部罗曼语（西班牙语、葡萄牙语等）与东部罗曼语（罗马尼亚语等）。是继西班牙文之后，使用者人数最多的罗曼语言之一。现时全世界有8700万人把它作为母语，以及其他2.85亿人使用它（包括把它作为第二语言的人）。法文是很多地区或组织的官方语言（例如联合国、欧洲联盟）。法国法语和加拿大法语是世界上两大法语分支，它们之间有很大区别。','法语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn04','德语','德语，印欧语系日耳曼语族西日耳曼语支下的一门语言。德语共同标准语的形成可以追溯到马丁•路德的圣经翻译。德语是三亿多人使用的母语，被誉为世界最严谨的语言之一。它最初在德国、奥地利、瑞士北部、列支敦士登、卢森堡、意大利南提洛尔，比利时的一小部分地区，部分波兰地区和部分法国阿尔萨斯、洛林、斯特拉斯堡地区内使用。另外，在德国的前殖民地内，例如纳米比亚拥有大量的说德语的人口，在东欧的一些国家中，仍有少量的说德语的少数民族。','德语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn05','俄语','俄语是联合国和俄罗斯联邦的官方语言之一，也是中华人民共和国承认的少数民族正式语言之一。属于斯拉夫语族的东斯拉夫语支。主要在俄罗斯和前苏联的其它成员国中使用，在华沙条约的成员国里曾经被学校广泛作为第一外语教学。在苏联时期，俄语在其加盟共和国中被大大的强调。虽然很多前苏联的国家现在开始强调当地语言的重要性，但是俄语仍然是这些地区最广泛使用的语言，并且也是这些国家进行交流时使用的语言。挪威俄语是俄语和挪威语的混合语。','俄语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn06','韩语','韩语，韩国的官方语言，而在朝鲜称为朝鲜语，二者是同一语言。朝鲜王朝直至世宗时期之前没有自己的文字，而将中国的汉字作为自己民族的文字，世宗大王认为有自己的民族文字，会对以后朝鲜王朝的发展，甚至对其后代都会有极大的影响，而自己创造一种简单易学的文字。','韩语')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn07','排球','这项运动源于美国。1895年，美国马萨诸塞州（旧称麻省）霍利约克市，一位叫威廉•摩根的体育工作人员发明的。[1] 初期，排球被称为Mintonette（小网子之意）。1896年，霍尔斯泰德教授根据比赛特点，提议改为Volleyball（空中击球），即现代国际通用名称Volleyball（排球）。当时的正式用球圆周为25~27英寸（约63.5~68.8厘米），重量为9~12盎司（约255~346克）。现代国际比赛用球的材料和制作工艺有很大改变，但球的规格还和以前差不多。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn08','足球','足球 ，是世界第一运动，是全球体育界最具影响力的单项体育运动。标准的足球比赛由两队各派11名队员参与，包括10名球员及1名守门员，互相在长方形的草地球场上互相对抗、互相进攻。比赛目的是尽量将足球射入对方的球门内，每射入一球就可以得到一分，当比赛完毕后，得分最多的一队则代表胜出。如果在比赛规定时间内得分相同，则须看比赛章则而定，可以抽签、加时再赛或互射点球（十二码）等形式比赛分高下。足球比赛中除了守门员可以在己方禁区内利用手部接触足球外，球场上每名球员只可以利用手以外的身体其他部分控制足球（开界外球例外）。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn09','篮球','篮球运动是以投篮、上篮和扣篮为中心的对抗性体育运动之一，两队参与，每队出场5名队员，目的是将球投入对方球篮框中得分，并阻止对方获得球权和得分。篮球比赛的形式多种多样，其中包括最流行的街头三人篮球赛。当今世界篮球水平最高的联赛是美国篮球职业联盟（NBA）比赛。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn10','网球','网球是一项优美而激烈的体育运动，网球运动的由来和发展可以用四句话来概括：孕育在法国，诞生在英国，开始普及和形成高潮在美国，现在盛行全世界，被称为世界第二大球类运动。网球通常在两个单打球员(haobc)或两对双打组合之间进行。球员在网球场上隔着球网用网球拍击打空心橡胶球。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn11','羽毛球','羽毛球是一项隔着球网，使用长柄网状球拍击打平口端扎有一圈羽毛的半球状软木的室内运动。依据参与的人数，可以分为单打与双打。相较于性质相近的网球运动，羽毛球运动对选手的体格要求并不很高，却比较讲究耐力，极适合东方人发展。自1992年起，羽毛球成为奥运会的正式比赛项目。 早在两千多年前，一种类似羽毛球运动的游戏就在中国，印度等国出现。中国叫打手毽，印度叫浦那，西欧等国则叫做毽子板球。十九世纪七十年代，英国军人将在印度学到的浦那游戏带回国，作为茶余饭后的消遣娱乐活动。14-15世纪时的日本，当时的球拍为木质，球是樱桃核插上羽毛做成。据传，在14世纪末，日本出现了把樱桃插上美丽的羽毛当球，两人用木板来回对打的运动。这便是羽毛球运动的原形。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn12','乒乓球','乒乓球，是一种世界流行的球类体育项目，中华人民共和国国球。乒乓球起源于英国。它的英语官方名称是“Table tennis”，意即“桌上网球”。“乒乓球”一名起源于1900年，因其打击时发出“ping pang”的声音而得名，在中国大陆、香港及澳门等地区以“乒乓球”作为它的官方名称。然而，台湾地区和日本则称之为“桌球”，意指球桌上的球类运动。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn13','台球','台球是一项在国际上广泛流行的高雅室内体育运动，是一种用球杆在台上击球、依靠计算得分确定比赛胜负的室内娱乐体育项目。','球类')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn14','健美操','健美操是一项深受广大群众喜爱的、普及性极强，集体操、舞蹈、音乐、健身、娱乐于一体的体育项目。 健美操竞赛项目包括男子单人、女子单人、混合双人、三人（性别不限）、集体操（五人,性别不限）、有氧舞蹈、有氧踏板、啦啦操等。比赛按性质分锦标赛和冠军赛两类。','健美武术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn15','武术','武术，打拳和使用兵器的技术，是汉族民间历史悠久的传统体育项目，中国一些少数民族如回族，苗族等也有各自特色的武术流派。武术的起源源远流长，在民间的影响也是根深蒂固的。','健美武术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn16','棋牌','棋牌是棋类和牌类娱乐项目的总称，包括中国象棋、围棋、国际象棋、蒙古象棋、五子棋、跳棋、国际跳棋（已列入首届世界智力运动会项目）、军棋、桥牌、扑克、麻将等等诸多传统或新兴娱乐项目。棋牌是十分有趣味的娱乐活动，很多人为此废寝忘食，这种过度沉迷于其中的做法是极不健康的。要使下棋打牌完全为养生所用，先了解其中的禁忌是十分必要的。','棋牌')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn17','轮滑','Roller skating,曾经有很多汉化版本，旱冰 溜冰 滑冰 滚轴溜冰，但是今天，我们统一叫他轮滑，但是并不是否定之前的叫法，因为这些都是正确的。轮滑鞋分为双排轮滑（QUAD Roller Skating）和单排轮滑（Inline Roller Skating），两种类型的轮滑鞋又有着各自的项目，由于文革等原因，国内轮滑领域发展较晚，没有经过系统发展的后果导致了项目不完善，以至于国内玩家偏向于直排轮滑，认识不完整导致认为双排轮滑的落伍，而国内有不少说法是有双排基础想练单排，或双排转单排之类的都是片面的，非常外行的说法，双排轮滑和单排轮滑作为运动器材都有着很高的国际地位，因为这是两种不同的运动器材！','运动轮滑')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn18','校园定向','定向运动就是利用地图和指南针到访地图上所指示的各个点标，以最短时间到达所有点标者为胜。定向运动通常设在森林，郊外和城市公园里进行，也可在大学校园里进行。 定向运动起源于瑞典，最初只是一项军事体育活动。“定向”这二个字在1886年首次使用，意思是：在地图和指南针的帮助下，越过不被人所知的地带。真正的定向比赛于1895年在瑞典 斯德哥尔摩和挪威 奥斯陆的军营区举行，标志着定向运动作为一种体育比赛项目的诞生。距今已有百年历史。','运动轮滑')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn19','声乐','声乐是以人的声带为主，配合口腔、舌头、鼻腔作用于气息，发出的悦耳的、连续性、有节奏的声音。按音域的高低和音色的差异，可以分为女高音、女中音、女低音和男高音、男中音、男低音。每一种人声的音域，大约为二个八度。','歌唱演讲')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn20','演讲','演讲又叫讲演或演说，是指在公众场所，以有声语言为主要手段，以体态语言为辅助手段，针对某个具体问题，鲜明、完整地发表自己的见解和主张，阐明事理或抒发情感，进行宣传鼓动的一种语言交际活动。','歌唱演讲')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn21','舞蹈','舞蹈是一种表演艺术，是于三度空间中以身体为语言作“心智交流”现象之人体的运动表达艺术，一般有音乐伴奏，以有节奏的动作为主要表现手段的艺术形式。它一般借助音乐，也借助其他的道具。舞蹈本身有多元的社会意义及作用，包括运动、社交/求偶、祭祀、礼仪等。在人类文明起源前，舞蹈在仪式，礼仪，庆典和娱乐方面都十分重要。中国在五千年以前就已经出现了舞蹈，产生于奴隶社会，发展到秦汉之际已形成一定特色。','舞蹈')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn22','书法','书法是世界上少数几种文字所有的艺术形式，包括汉字书法、蒙古文书法、阿拉伯文书法等。其中“中国书法”，是中国汉字特有的一种传统艺术。从广义讲，书法是指语言符号的书写法则。换言之，书法是指按照文字特点及其涵义，以其书体笔法、结构和章法写字，使之成为富有美感的艺术作品。汉字书法为汉族独创的表现艺术，被誉为：无言的诗，无行的舞；无图的画，无声的乐。','书画摄影')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn23','绘画','绘画是一种在平面上以手工方式临摹自然或非自然，以其达到二维（平面或三维）效果的艺术，在中世纪的欧洲，常把绘画称作“猴子的艺术”，因为如同猴子喜欢模仿人类活动一样，绘画也是模仿场景。','书画摄影')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn24','摄影','摄影一词是源于希腊语 φω phos（光线）和 γραφι graphis（绘画、绘图）或γραφη graphê，两字一起的意思是“以光线绘图”。摄影是指使用某种专门设备进行影像记录的过程，一般我们使用机械照相机或者数码照相机进行摄影。有时摄影也会被称为照相，也就是通过物体所反射的光线使感光介质曝光的过程。有人说过的一句精辟的语言：摄影家的能力是把日常生活中稍纵即逝的平凡事物转化为不朽的视觉图像。','书画摄影')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn25','戏曲','中国戏曲主要是由民间歌舞、说唱和滑稽戏三种不同艺术形式综合而成。它起源于原始歌舞，是一种历史悠久的综合舞台艺术样式。经过汉、唐到宋、金才形成比较完整的戏曲艺术，它由文学、音乐、舞蹈、美术、武术、杂技以及表演艺术综合而成，约有三百六十多个种类。它的特点是将众多艺术形式以一种标准聚合在一起，在共同具有的性质中体现其各自的个性。[1] 中国的戏曲与希腊悲剧和喜剧、印度梵剧并称为世界三大古老的戏剧文化，经过长期的发展演变，逐步形成了以“京剧、越剧、黄梅戏、评剧、豫剧”五大戏曲剧种为核心的中华戏曲百花苑。[2-5]     中国戏曲剧种种类繁多，据不完全统计，中国各民族地区地戏曲剧种约有三百六十多种，传统剧目数以万计。其它比较著名的戏曲种类有：昆曲、粤剧、淮剧、川剧、秦腔、晋剧、汉剧、河北梆子、河南坠子、湘剧、黄梅戏、湖南花鼓戏等。','戏曲乐器')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn26','京剧','京剧，中国五大戏曲剧种之一，腔调以西皮、二黄为主，用胡琴和锣鼓等伴奏，被视为中国国粹。','戏曲乐器')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn27','皮影','皮影戏，又称“影子戏”或“灯影戏”，是一种以兽皮或纸板做成的人物剪影，在蜡烛或燃烧的酒精等光源的照射下用隔亮布进行演戏，是中国汉族民间广为流传的傀儡戏之一。表演时，艺人们在白色幕布后面，一边用手操纵戏曲人物，一边用当地流行的曲调唱述故事，同时配以打击乐器和弦乐，有浓厚的乡土气息。皮影戏是中国民间古老的传统艺术，老北京人都叫它“驴皮影”。据史书记载，皮影戏始于战国，兴于汉朝，盛于宋代，元代时期传至西亚和欧洲，可谓历史悠久，源远流长。','戏曲乐器')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn28','古筝','古筝是中国非常古老的汉民族弦乐，属弹拨乐器。在中国传统乐器中，古筝的音色优美，音域宽广、演奏技巧丰富，具有相当的表现力，深受广大人民的喜爱。结构由面板、雁柱、琴弦、前岳山、弦钉、调音盒、琴足、后岳山、侧板、出音口、底板、穿弦孔组成。筝的形制为长方形木质音箱，弦架“筝柱”（即雁柱）可以自由移动，一弦一音，按五声音阶排列，最早以25弦筝为最多（分瑟为筝），唐宋时有弦十三根，后增至十六根、十八弦、二十一弦等，目前最常用的规格为二十一弦；通常古筝的型号前用S163-21，S代表S形岳山，是王巽之与缪金林共同发明，163代表古筝长度是163厘米左右，21代表古筝弦数21根。','戏曲乐器')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn29','古琴','古琴，又称琴、瑶琴、玉琴、丝桐和七弦琴，是中国的拨弦乐器，有3千年以上历史，属于八音中的丝。古琴音域宽广，音色深沉，余音悠远。自古“琴”为其特指，19世纪20年代起为了与钢琴区别而改称古琴。初为5弦，汉朝起定制为7弦，且有标志音律的13个徽，亦为礼器和乐律法器。','戏曲乐器')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn30','表演','表演，著作权法术语，指演奏乐曲、上演剧本、朗诵诗词等直接或者借助技术设备以声音、表情、动作公开再现作品。','表演')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn31','话剧','话剧指以对话方式为主的戏剧形式。话剧虽然可以使用少量音乐、歌唱等，但主要叙述手段为演员在台上无伴奏的对白或独白。话剧本是一门综合性艺术，剧作、导演、表演、舞美、灯光、评论缺一不可。中国传统戏剧均不属于话剧，一些西方传统戏剧如古希腊戏剧因为大量使用歌队，也不被认为是严格的话剧。现代西方舞台剧如不注为音乐剧、歌剧等的一般都是话剧。','表演')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn32','相声','相声（Crosstalk）一种民间说唱曲艺。中国相声有三大发源地：北京天桥、天津劝业场和奉天（今沈阳）北市场，相声艺术源于华北，流行于京津冀，普及于全国及海内外，始于明清，盛于当代。主要采用口头方式表演。表演形式有单口相声、对口相声、群口相声等。是扎根于民间、源于生活、又深受群众欢迎的曲艺表演艺术形式。相声鼻祖为张三禄，著名流派有“侯（宝林）派”、“马（三立）派”、“常（宝堃）派”、“苏（文茂）派”、“马（季）派”等。著名表演大师有侯宝林、马三立、常宝堃、苏文茂、马季等多人。二十世纪晚期，以侯宝林为首的一代相声大师相继陨落，相声事业陷入低谷。','表演')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn33','动漫','“动漫”是指动画和漫画的合称与的缩写，用于泛指所有的动画、漫画作品。随着现代传媒技术的发展，动画和漫画之间联系日趋紧密，两者常被合而为“动漫”。在中国（大陆最为常见）以外的地区相当少用。','动漫')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn34','烹饪','烹饪指的是膳食的艺术。对食品作加工处理，使食物更可口，更好看，更好闻。一个好的料理，色香味形俱佳，不但让人在食用时感到满足，而且能让食物的营养更容易被人体吸收。另外日语中有烹饪一义的“料理”一词也常在台湾被使用。','烹饪')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn35','折纸','折纸又称“工艺折纸”，是一种以纸张折成各种不同形状的艺术活动。在大部分的折纸比赛中，要求参赛者以一张无损伤的完整正方形纸张折出作品。折纸发源于中国，在日本得到发展。欧洲也有自成一体的折纸艺术。19世纪，西方人开始将折纸与自然科学结合在一起。折纸不仅成为建筑学院的教具，还发展为现代几何学的一个分支。折纸慢慢发展为一项不仅是儿童的玩具，也是一种有益身心、开发智力和思维的活动。','手工')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn36','插花','插花就是把花插在瓶、盘、盆等容器里，而不是栽在这些容器中。所插的花材，或枝、或花、或叶，均不带根，只是植物体上的一部分，并且不是随便乱插的，而是根据一定的构思来选材，遵循一定的创作法则，插成一个优美的形体（造型），借此表达一种主题，传递一种感情和情趣，使人看后赏心悦目，获得精神上的美感和愉快。','手工')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn37','剪纸','剪纸，又叫刻纸，是中国汉族最古老的民间艺术之一，剪纸是一种镂空艺术，其在视觉上给人以透空的感觉和艺术享受。其载体可以是纸张、金银箔、树皮、树叶、布、皮革等片状材料。','手工')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn38','编织','中国编织工艺品按原料划分，主要有竹编、藤编、草编、棕编、柳编、麻编等 6大类。编织工艺品的品种主要有日用品、欣赏品、家具、玩具、鞋帽等 5类。其中日用品有席（地席、卧席）、坐垫、靠垫、各式提篮（花篮、菜篮、水果篮）、盆套（花盆套）、箱、旅游吊床、盘（水果盘、面包盘）、门帘、筐、灯罩等；欣赏品有挂屏、屏风及人物、动物造型的编织工艺品。','手工')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn39','维修','维修常识包括 手机维修，电脑维修，家电维修汽车维修。对于手机而言，软件更新升级也纳入了维修项目之内，对于汽车而言撬铆喷漆也属于维修范围。','维修')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn40','单机游戏','单机游戏（Singe-Player Game），也称单人游戏，是相对于网络游戏而言的。一般指游戏的主要玩法只需要一台电脑就能完成的电子游戏，不能进行互联网对战。但随着网络的普及，为适应防盗版、后续内容下载服务、多人联机对战的目的，更多单机游戏也开始需要互联网支持。单机游戏也包括一机多人、IP直连和局域网对战三种“多人游戏”方式。随着互联网对战功能的普遍应用，目前单机游戏逐渐加强了网络元素和多人模式。','电子娱乐')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn41','网络游戏','网络游戏：英文名称为Online Game，又称 “在线游戏”，简称“网游”。指以互联网为传输媒介，以游戏运营商服务器和用户计算机为处理终端，以游戏客户端软件为信息交互窗口的旨在实现娱乐、休闲、交流和取得虚拟成就的具有可持续性的个体性多人在线游戏。','电子娱乐')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn42','时尚搭配','时尚搭配就是服装、配饰、发型搭配的技巧。','时尚搭配')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn43','化妆','化妆，是运用化妆品和工具，采取合乎规则的步骤和技巧，对人体的面部、五官及其他部位进行渲染、描画、整理，增强立体印象，调整形色，掩饰缺陷，表现神采，从而达到美化视觉感受的目的。化妆，能表现出人物独有自然美；能改善人物原有的”形“”色“”质“，增添美感和魅力；能作为一种艺术形式，呈现一场视觉盛宴，表达一种感受。化妆是一种美的理念。','化妆美容')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn44','美容美发','美容美发，通过保养，按摩手法，化妆，造型装饰等手段使容貌，头发变得美丽的一种技术。在当今社会颇为流行。','化妆美容')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn45','心理','心理是指生物对客观物质变态世界的主观反应，心理现象包括心理过程和人格，人的心理活动都有一个发生，发展，消失的过程。人们在活动的时候，通过各种感官认识外部世界事物，通过头脑的活动思考着事物的因果关系，并伴随着喜、怒、哀、惧等情感体验。这折射着一系列心理现象的整个过程就是心理过程。按其性质可分为三个方面，即认识过程、情感过程和意志过程，简称知、情、意。','心理')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn46','C语言','C语言是一种计算机程序设计语言，它既具有高级语言的特点，又具有汇编语言的特点。它由美国贝尔实验室的Dennis M. Ritchie于1972年推出，1978年后，C语言已先后被移植到大、中、小及微型机上，它可以作为工作系统设计语言，编写系统应用程序，也可以作为应用程序设计语言，编写不依赖计算机硬件的应用程序。它的应用范围广泛，具备很强的数据处理能力，不仅仅是在软件开发上，而且各类科研都需要用到C语言，适于编写系统软件、三维、二维图形和动画，具体应用例如单片机以及嵌入式系统开发 。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn47','C++','C++是在C语言的基础上开发的一种集面向对象编程、泛型编程和过程化编程于一体的编程语言[1] 。应用较为广泛，是一种静态数据类型检查的，支持多重编程的通用程序设计语言。它支持过程化程序设计，数据抽象，面向对象设计，制作图标等多种程序设计风格。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn48','Java','java[1] 是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于1995年5月推出的Java程序设计语言和Java平台（即JavaEE, JavaME, JavaSE）的总称。Java自面世后就非常流行，发展迅速，对C++语言形成了有力冲击。Java 技术具有卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科学超级计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互联网的产业环境下，Java更具备了显著优势和广阔前景。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn49','Asp','ASP是动态服务器页面(Active Server Page)外语缩写。[1] 是微软公司开发的代替CGI脚本程序的一种应用，它可以与数据库和其它程序进行交互，是一种简单、方便的编程工具。ASP的网页文件的格式是 .asp。现在常用于各种动态网站中。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn50','Php','PHP（PHP: Hypertext Preprocessor的缩写，中文名：“超文本预处理器”）是一种通用开源脚本语言。语法吸收了C语言、Java和Perl的特点，入门门槛较低，易于学习，使用广泛，主要适用于Web开发领域。PHP的文件后缀名为php。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn51','Jsp','java服务器页面[1] 是由Sun Microsystems公司倡导、许多公司参与一起建立的一种动态网页技术标准。JSP技术有点类似ASP技术，它是在传统的网页HTML（标准通用标记语言的子集）文件(*.htm,*.html)中插入Java程序段(Scriptlet)和JSP标记(tag)，从而形成JSP文件，后缀名为(*.jsp)。 用JSP开发的Web应用是跨平台的，既能在Linux下运行，也能在其他操作系统上运行。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn52','Javascript','Javascript[1] 是一种由Netscape的LiveScript发展而来的原型化继承的基于对象的动态类型的区分大小写的客户端脚本语言，主要目的是为了解决服务器端语言，比如Perl，遗留的速度问题，为客户提供更流畅的浏览效果。当时服务端需要对数据进行验证，由于网络速度相当缓慢，只有28.8kbps，验证步骤浪费的时间太多。于是Netscape的浏览器Navigator加入了Javascript，提供了数据验证的基本功能，js的作用也主要在实现网页的一些特效，css难以实现的特效，通常和Jquery，Ajax,联合使用.','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn53','Python','Python, 是一种面向对象、解释型计算机程序设计语言，由Guido van Rossum于1989年底发明，第一个公开发行版发行于1991年。Python语法简洁而清晰，具有丰富和强大的类库。它常被昵称为胶水语言，它能够很轻松的把用其他语言制作的各种模块（尤其是C/C++）轻松地联结在一起。常见的一种应用情形是，使用Python快速生成程序的原型（有时甚至是程序的最终界面），然后对其中有特别要求的部分，用更合适的语言改写，比如3D游戏中的图形渲染模块，性能要求特别高，就可以用C++重写。','编程语言')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn54','视频制作','视频制作是将图片、背景音乐、视频等素材经过非线性编辑后，通过二次编码，从而生成视频，除了简单的将各种素材合成视频，视频制作通常还包括添加转场特效、MTV字幕特效、添加文字注释的过程。','视频制作')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn55','ps','“PS”，是由Adobe Systems开发和发行的图像处理软件。Photoshop主要处理以像素所构成的数字图像。使用其众多的编修与绘图工具，可以有效地进行图片编辑工作。ps有很多功能，在图像、图形、文字、视频、出版等各方面都有涉及。','图像处理')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn56','CoreIDRAW','CorelDRAW Graphics Suite是一款由世界顶尖软件公司之一的加拿大的Corel公司开发的图形图像软件。其非凡的设计能力广泛地应用于商标设计、标志制作、模型绘制、插图描画、排版及分色输出等等诸多领域。其被喜爱的程度可用事实说明，用于商业设计和美术设计的PC电脑上几乎都安装了CorelDRAW。','图像处理')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn57','软件工程','软件工程是一门研究用工程化方法构建和维护有效的、实用的和高质量的软件的学科。它涉及到程序设计语言、数据库、软件开发工具、系统平台、标准、设计模式等方面。在现代社会中，软件应用于多个方面。典型的软件有电子邮件、嵌入式系统、人机界面、办公套件、操作系统、编译器、数据库、游戏等。同时，各个行业几乎都有计算机软件的应用，如工业、农业、银行、航空、政府部门等。这些应用都促进了经济和社会的发展，也提高了工作和生活效率。','软件系统')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn58','操作系统','操作系统（英语：Operating System，简称OS）是管理和控制计算机硬件与软件资源的计算机程序，是直接运行在“裸机”上的最基本的系统软件，任何其他软件都必须在操作系统的支持下才能运行。','软件系统')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn59','Mysql','MySQL[1] 是一个关系型数据库管理系统，由瑞典MySQL AB公司开发，目前属于Oracle公司。Mysql是最流行的关系型数据库管理系统，在WEB应用方面MySQL是最好的RDBMS(Relational Database Management System：关系数据库管理系统)应用软件之一。MySQL是一种关联数据库管理系统，关联数据库将数据保存在不同的表中，而不是将所有数据放在一个大仓库内，这样就增加了速度并提高了灵活性。MySQL所使用的SQL语言是用于访问数据库的最常用标准化语言。MySQL软件采用了双授权政策（本词条“授权政策”），它分为社区版和商业版，由于其体积小、速度快、总体拥有成本低，尤其是开放源码这一特点，一般中小型网站的开发都选择MySQL作为网站数据库。由于其社区版的性能卓越，搭配PHP和Apache可组成良好的开发环境。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn60','Oracle','ORACLE数据库系统是美国ORACLE公司（甲骨文）提供的以分布式数据库为核心的一组软件产品，是目前最流行的客户/服务器(CLIENT/SERVER)或B/S体系结构的数据库之一。比如SilverStream就是基于数据库的一种中间件。ORACLE数据库是目前世界上使用最为广泛的数据库管理系统，作为一个通用的数据库系统，它具有完整的数据管理功能；作为一个关系数据库，它是一个完备关系的产品；作为分布式数据库它实现了分布式处理功能。但它的所有知识，只要在一种机型上学习了ORACLE知识，便能在各种类型的机器上使用它。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn61','SQLServer','SQL Server 是一个关系数据库管理系统。它最初是由Microsoft、Sybase 和Ashton-Tate三家公司共同开发的，于1988 年推出了第一个OS/2版本。在Windows NT 推出后，Microsoft与Sybase 在SQL Server 的开发上就分道扬镳了，Microsoft 将SQL Server移植到Windows NT系统上，专注于开发推广SQL Server 的Windows NT 版本。Sybase 则较专注于SQL Server在UNⅨ操作系统上的应用。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn62','DB2','DB2是IBM出品的一系列关系型数据库管理系统，分别在不同的操作系统平台上服务。虽然DB2产品是基于UNIX的系统和个人计算机操作系统，但在基于UNIX系统和微软在windows系统下的Access方面，DB2追寻了ORACLE的数据库产品。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn63','Sybase','美国Sybase公司研制的一种关系型数据库系统，是一种典型的UNIX或WindowsNT平台上客户机/服务器环境下的大型数据库系统。 Sybase提供了一套应用程序编程接口和库，可以与非Sybase数据源及服务器集成，允许在多个数据库之间复制数据，适于创建多层应用。系统具有完备的触发器、存储过程、规则以及完整性定义，支持优化查询，具有较好的数据安全性。Sybase通常与SybaseSQLAnywhere用于客户机/服务器环境，前者作为服务器数据库，后者为客户机数据库，采用该公司研制的PowerBuilder为开发工具，在我国大中型系统中具有广泛的应用。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn64','Sqlite','SQLite，是一款轻型的数据库，是遵守ACID的关系型数据库管理系统，它的设计目标是嵌入式的，而且目前已经在很多嵌入式产品中使用了它，它占用资源非常的低，在嵌入式设备中，可能只需要几百K的内存就够了。它能够支持Windows/Linux/Unix等等主流的操作系统，同时能够跟很多程序语言相结合，比如 Tcl、C#、PHP、Java等，还有ODBC接口，同样比起Mysql、PostgreSQL这两款开源世界著名的数据库管理系统来讲，它的处理速度比他们都快。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn65','Access','Access是由微软发布的关系数据库管理系统。它结合了 Microsoft Jet Database Engine 和 图形用户界面两项特点，是 Microsoft Office 的系统程式之一。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn66','Nosql','NoSQL，泛指非关系型的数据库。随着互联网web2.0网站的兴起，传统的关系数据库在应付web2.0网站，特别是超大规模和高并发的SNS类型的web2.0纯动态网站已经显得力不从心，暴露了很多难以克服的问题，而非关系型的数据库则由于其本身的特点得到了非常迅速的发展。','数据库')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn67','html','超级文本标记语言是标准通用标记语言下的一个应用，也是一种规范，一种标准， 它通过标记符号来标记要显示的网页中的各个部分。','web技术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn68','html5','万维网的核心语言、标准通用标记语言下的一个应用超文本标记语言（HTML）的第五重大修改。','web技术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn69','css','它是一种用来表现HTML（标准通用标记语言的一个应用）或XML（标准通用标记语言的一个子集）等文件样式的计算机语言。','web技术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn70','ajax','AJAX 是一种用于创建快速动态网页的技术。通过在后台与服务器进行少量数据交换，AJAX 可以使网页实现异步更新。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。','web技术')");
		db.execSQL("insert into sort3(id,name,jianjie,inSort_2) values('jn71','电子维修','电子仪器设备日常维护和维修的基础知识，电子设备故障检查基本方法，电子路调试技术、抗干抗扰技术。除常见的电路外，还编入单片开关电源、微机系统调试及抗干等。在维修实例中，均根据电路原理进行故障分析、运用故障检查方法检查故障。除常见的示波器、数字电压表（DVM）、频谱分析仪的维修外，还有大规模IC构成的DVM、智能型DVM原理与维修，以及目前维修量大的VCD及微机显示器维修等。','电子维修')");

		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('排球协会','四川大学排球俱乐部成立于2003年，俱乐部自成长之初便云集了川大第一流的排球精英。俱乐部指导老师唐成教授，现为四川大学体育学院院长、四川省体育学术学科带头人。协会成立至今，一直相当重视排球运动在大学校园里的普及工作，长期以来义务进行排球知识宣传以及排球技战术指导。近年来，我们同成都许多高校的兄弟协会开展了各种交流性质的活动，如川大交大、川大科大对抗赛等。俱乐部还单独组织参加各种成都的业余排球比赛，并取得优异成绩。2010年5月，在第三届全国高校校园社团评比中，荣获“全国百强社团”称号。 ','排球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('足球协会','足球协会旨在推广校园足球，宣传足球运动。为提高校园足球人口，丰富同学们的课余文化生活，促进校园足球文化的发展做出了极大的贡献。','足球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('篮球协会',' 篮球协会是目前川大规模较大、创办时间较长的社团之一，有着广泛的群众基础及巨大的影响力，是体育类社团中的佼佼者。如今的篮协，经过不断的探索、拼搏和磨练，已经发展成为一个具有完备严谨的规章制度、协调合作的六大部门、几百余名会员的大型综合性体育社团。经过几代篮协人的不懈努力，篮协屡次获得“十佳学生社团”荣誉称号，于2010年获得了社团联颁发的“十佳学生社团”、“最具活力社团”两大荣誉称号。在如此良好的发展前景下，篮协正以昂扬的激情、蓬勃的活力、无限的创新精神、有力的宣传手段，逐步走向鼎盛。','篮球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('武术协会','四川大学武术协会是四川大学历史悠久、极具影响力的校级学生社团之一。于1997年由华西临床医学院陈玉成、易成教授以及广大热爱武术的同学自发组织成立，前身为“华西太极拳协会”，而后更名为“华西武术协会”，2002年三校区合并后，再次更名为“四川大学武术协会”。','武术')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('体育舞蹈协会','四川大学体育舞蹈（国标舞）协会 四川大学体育舞蹈协会（Ballroom Dance Association of SiChuan University）是成立于2002年的校级学生社团，协会的指导思想是“营造四川大学校园文化艺术氛围，丰富大学生的课余文化生活，提高学生的综合素质”。协会奉行“拼搏进取、奋发向上、勤奋乐观、坚韧顽强”的准则，坚持“精简、高效、务实、创新”的理念，志在培养更多体育舞蹈爱好者，全面提高川大学生的素质修养。','舞蹈')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('网球协会','网球凝聚着速度、力量、优美与爆发。因为热爱，我们聚在这里——网球协会，一起享受网球给我们带来的快乐。在这里，你可以享受阳光下的挥汗如雨；在这里，你可以收获运动之后身心的放松；在这里，你可以得到观众的惊呼和鼓掌。阳光帅气学长会让柔弱小女子成为美貌和力量并存的莎拉波娃；运动达人会教体育白痴成为网球大师。不要怀疑我们的团结性，我们是个凝聚的集体。“网聚你我，追‘球’快乐”是我们的目标，网球教会我们团结、谦逊、更让我们懂得集体的重要。四川大学网球协会，运动的乌托邦。','网球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('风越翎翔滑轮协会','“轮滑”以它独特的吸引力在社会上迅速普及，尤其深受广大大学生的喜爱，轮滑协会是由学院轮滑爱好者发起，是集健身、竞技、娱乐、趣味、技巧、艺术、休闲于一体的学生社团，也是发展与深化校园文化的生力军。','轮滑')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('定向运动协会','从事定向运动普及和提高，开展定向运动培训、考核、竞赛、评比等相关工作的组织。为促进校园健身运动的广泛开展，发挥体育的综合功能和社会效应，丰富社会体育文化生活。','校园定向')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('棋牌协会','棋牌协会成立于1986年，经过16年的发展，已包含了中国象棋，国际象棋，围棋，三国杀，五子棋，跳棋，军棋，桥牌等多种棋牌。协会每周都会有例行活动:新手教学，高手对弈… 还有校级大赛，高校联赛等各种大型比赛…加入我们，还有机会进入协会的四大部门(技术部，宣传部，交流部，文秘部)锻炼。无论你是新手还是高手，只要有兴趣，就赶紧加入棋协吧，在这里你将会认识更多的朋友，得到更多的乐趣！','棋牌')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('台球协会','你了解台球么？你还在埋怨为什么小小的台球不听你使唤么？你想在球场上随心所欲么？你还在为找不到适合的球友而烦恼么？想在你的朋友面前大展身手么？来吧，台球协会在这里等着你。不用担心你现在的技术是怎样，不用担心你对台球知识一无所知，只要怀揣着那一份热情，我相信一切皆有可能。','台球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','电子维修')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','ajax')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','css')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','html5')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','html')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Nosql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Access')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Sqlite')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','DB2')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','SQLServer')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Oracle')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Mysql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','操作系统')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','软件工程')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','CoreIDRAW')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','ps')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','视频制作')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Python')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Javascript')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Php')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Jsp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Asp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','Java')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','C++')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','C语言')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('飞扬俱乐部','川大学·飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学·艺术学院·飞扬工作室，并于2007学年更名为 四川大学·艺术学院·飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。','维修')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('皮影协会','四川大学皮影协会，可以说是最年轻的校级协会之一，从08年10月成立，到10年皮影协会迎来的里程碑：成功晋升为校级学生社团。短短三年时间，他们完成了精彩的蜕变。共青团四川省委员会“让爱动起来”灾后重建百万计划活动获奖项目，四川大学轻纺与食品学院2008、2009年迎新晚会优秀节目，2009年10月《华西都市报》对四川大学轻纺与食品学院皮影协会进行专题采访，2009年11月四川电视台科教频道《记录》栏目对四川大学轻纺与食品学院皮影协会进行专题采访。一项项荣誉，是对他们最好的加冕。几代皮影协会人用自己的毅力，用自己的坚持，创造了一个又一个神话，完成了自己的魅力梦想，破茧成蝶。','皮影')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('BOBO街舞协会','四川大学BOBO街舞协会成立于2005年，经过七年的不断努力，成为了一个囊括popping、breaking、jazz、hip-hop、locking等不同街舞舞种的艺术类社团。','舞蹈')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('戏曲社','四川大学戏曲社，又名梨园雅韵戏曲协会，成立于2005年。 四川大学戏曲社是由爱好戏曲，致力于推广戏曲的多位同学在2005年发起成立的融艺术性、社会性和实践性为一体的学生团体组织。本协会的宗旨是发展戏曲艺术，弘扬中国传统文化，丰富校园生活，培养和锻炼大学生的戏曲艺术感，全面提升校园的曲艺艺术水平。 ','戏曲')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('青年摇滚社','青年摇滚社致力于为所有喜欢摇滚乐的人提供一个交流学习的平台和展示自己的舞台。 我们相信摇滚不死。 我们相信信仰不死。 我们相信理想不死。','声乐')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('欧美音乐协会','主要举办音乐沙龙 草地音乐主题交流 ，小型演唱会等。','声乐')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('古筝协会','四川大学古筝协会主要活动， 古筝零基础小班教学（有无基础不重要，有兴趣就别拒绝） ，会员校内免费练琴 ， 拥有多学院、各晚会表演展示机会 ， 享受定期古筝知识讲座、音乐会席位 ♩同其他优秀协会交流合作，碰撞火花 。在温馨的聚会中寻找你志同道合的小伙伴。只要喜欢古筝，就来吧！','古筝')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('古琴协会','四川大学古琴社是由四川大学团委主管的以琴学研究为主的四川大学学生文艺团体。本社的中文全称为：四川大学古琴社。本社的宗旨和任务是深入研究和弘扬中国传统古琴文化，努力探讨琴学的理论、实践及其在现代社会的积极意义，通过组织讲座、研讨、座谈、演奏和学术交流等方式在四川大学开展琴学文化研究，提高社员的琴学修养，丰富和繁荣校园文化，以便更好地继承中国传统文化精髓，发扬琴道，净化人心。','古琴')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('雷雨话剧社','四川大学“雷雨”话剧社成立于20世纪70年代末80年代初，原名“青鸟”话剧社。剧社公演《雷雨》，在全国引起巨大轰动。当时病重的曹禺先生也获知此事，特意嘱托妻子向话剧社表示祝贺，并且建议易名为“雷雨”。雷雨话剧社由此得名。雷雨话剧社一直秉承着“将经典演绎到底”的宗旨，演出了大大小小无数场经典话剧和原创剧目，广受媒体关注，在西南地区获得不少奖项，一度被誉为“西南高校话剧三驾马车”之一，不断为高校话剧的发展贡献自己微薄的力量。','话剧')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('雷雨话剧社','四川大学“雷雨”话剧社成立于20世纪70年代末80年代初，原名“青鸟”话剧社。剧社公演《雷雨》，在全国引起巨大轰动。当时病重的曹禺先生也获知此事，特意嘱托妻子向话剧社表示祝贺，并且建议易名为“雷雨”。雷雨话剧社由此得名。雷雨话剧社一直秉承着“将经典演绎到底”的宗旨，演出了大大小小无数场经典话剧和原创剧目，广受媒体关注，在西南地区获得不少奖项，一度被誉为“西南高校话剧三驾马车”之一，不断为高校话剧的发展贡献自己微薄的力量。','表演')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('数字娱乐与电子竞技协会','在校团委社团联直接领导下，并由校团委及社团管理部门监管的校级协会，主要是为丰富同学的课余文化生活，并为对数字娱乐与电子竞技感兴趣的同学提供一个展示自我才艺的平台。电子竞技运动就是利用高科技软硬件设备作为运动器械进行的、人与人之间的智力对抗运动。通过运动，可以锻炼和提高参与者的思维能力、反应能力、心眼四肢协调能力和意志力，培养团队精神。本协会旨在为川大广大热爱电子竞技的同学提供一个正规的、安全的、方便的交流平台，提供一个公平的、公正的比赛平台。引导同学们正确对待电子竞技游戏，把电子竞技游戏作为学习工作之余的娱乐活动，而不是沉迷其中，以至于影响正常的生活。我们在过去的几年中，成功的举办了“川大杯”DOTA大赛，承办了世界知名品牌举办的电子竞技大赛。曾邀请到世界著名的电子竞技玩家来我校进行表演交流。','单机游戏')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('数字娱乐与电子竞技协会','在校团委社团联直接领导下，并由校团委及社团管理部门监管的校级协会，主要是为丰富同学的课余文化生活，并为对数字娱乐与电子竞技感兴趣的同学提供一个展示自我才艺的平台。电子竞技运动就是利用高科技软硬件设备作为运动器械进行的、人与人之间的智力对抗运动。通过运动，可以锻炼和提高参与者的思维能力、反应能力、心眼四肢协调能力和意志力，培养团队精神。本协会旨在为川大广大热爱电子竞技的同学提供一个正规的、安全的、方便的交流平台，提供一个公平的、公正的比赛平台。引导同学们正确对待电子竞技游戏，把电子竞技游戏作为学习工作之余的娱乐活动，而不是沉迷其中，以至于影响正常的生活。我们在过去的几年中，成功的举办了“川大杯”DOTA大赛，承办了世界知名品牌举办的电子竞技大赛。曾邀请到世界著名的电子竞技玩家来我校进行表演交流。','网络游戏')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('笑笑相声社','笑笑相声社是四川大学校级社团，建立于2009年，社团以弘扬传统艺术为己任，目前会员113人，先后举办相声专场达18场，演出相声段子80余段，在校园颇具影响力深受广大同学、观众喜爱。','相声')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('英语协会','四川大学英语协会简称川大英协，正式成立于1994年，现有会员2000余人，是四川大学历史最悠久、规模最大的社团之一。川大英协是“四川大学十佳学生社团”、“四川大学五星级社团”。','英语')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('法语协会','法语协会是在四川大学校团委领导下，外国语学院法语老师指导下，以法语系学生为基础，并由广大法语爱好者自发组织起来的进行法语学习与交流的非营利性学生组织。','法语')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('日语协会','四川大学日语协会创建于2004年，旨在为四川大学的同学们介绍日本的风土人情和科技文化，致力于为广大日语爱好者提供一个学习和交流的平台。','日语')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('摄影协会','四川大学摄影协会，由一批摄影爱好者自发组建，成立于1982年, 是川大历史最久的学生社团之一。同时它也是四川大学最活跃、最有影响力的一个社团之一，连续多年被授予“四川大学优秀社团”的荣誉称号。 本着着“普及摄影知识，丰富校园文化生活”的宗旨，组织会员学习摄影知识，探索摄影艺术，开展摄影活动，进行摄影创作。 以提高个人的摄影技术和艺术修养和普及摄影艺术的中心，以照片展览、摄影比赛、外出采风、摄影讲座等方式和途径，在校内外开展活动。','摄影')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('心理协会','四川大学心理协会，在2001年由原望江东区心理协会、望江西区心理学社和华西区心理协会强强合并成。协会隶属校团委，长期得到了四川大学心理健康中心的辅导与支持。凭借每学期丰富多彩而又富于特色的活动受到广大同学和老师的好评，连续7年被校团委评为校十佳社团。 心理协会在华西，以做专业化、有特色的心理类社团，组建一流团队，打造卓越培训队为发展目标。我们坚持学术性，以多样的形式普及心理知识，营造爱好心理学的氛围。同时，我们以培训为特色，面向校内外社团组织，打造专业化培训品牌，根据受众需要组织团队培训。 贴心团队因你而生，专业团队为你而建。 ','心理')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('演讲与交际协会','四川大学演讲与交际协会成立于 1997年，是川大最早最大的社团之一。她以提高大学生演讲水平与人际交往能力，增强大学生的综合素质为宗旨，时刻保持着龙的传人的精神——人生留迹于天地之间，理应有惊人之局 。 “跳跃你的心，活动你的嘴，美丽新生活，全由你主张”是协会一致推崇的口号，也是协会永恒不变的目标。人人都可以精于演讲，长于交际，人人都可以“舍弃平庸，追求卓越。”','演讲')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('跆拳道协会','四川大学跆拳道协会成立于2008年初，隶属于四川大学制造学院团委学生会，现由世界跆拳道联盟黑带四段师范赵翼担任协会总教练，有权颁发中跆协级别证书的跆拳道组织。是全四川唯一正统韩式教学的跆拳道组织。','武术')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('合唱团','四川大学合唱团是党委学工部下属四川大学学生艺术团的一部分，目前有约60名成员组成，几乎每周都在望江校区组织排练，每学期都会有学校或更高等级的艺术演出或比赛。','声乐')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('舞蹈队','四川大学学生艺术团舞蹈队，是隶属于学工部的校级组织。欢迎有舞蹈基础的同学加入！男女不限。','舞蹈')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('美术社','四川大学美术社,由四川大学学工部艺术教育中心于2006年创建，是一个非营利文化艺术机构，是一个高校艺术交流的平台，具有展览、推广、教育、实践、交流五大功能。我们的希望透过推广当代艺术和艺术教育,令美术社成为一个最重要的文化机构,致力推动川大成为充满创造力,艺术文化活跃的高校','绘画')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('书法研究协会','书法艺术交流的 平台，弘扬传统文化，复兴书法艺术。','书法')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('书画协会','四川大学书画协会是为传承、发扬与传播中国书画艺术，以“弘扬民族文化，活跃校园生活”为宗旨, 努力营造墨韵书香的深厚校园文化底蕴而设立的校级艺术性社团。','书法')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('书画协会','四川大学书画协会是为传承、发扬与传播中国书画艺术，以“弘扬民族文化，活跃校园生活”为宗旨, 努力营造墨韵书香的深厚校园文化底蕴而设立的校级艺术性社团。','绘画')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('兵乓球协会','四川大学乒乓球协会是受校团委、学工部直接领导的学生组织。1992年，组建了乒乓球协会。1998年，协会在校团委注册成立。','乒乓球')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('京剧研习社','四川大学京剧研习社，成立于2010年4月，挂靠于四川大学公共管理学院，受四川大学共青团团委的领导，属于校级（2011年晋升）艺术类社团。社团设有表演部、组织策划部、文宣部等部门。2013年6月，被评为2012-2013学年度校级十佳社团。','京剧')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('B-Box协会','B-BOX全称Human Beat-box，即用嘴模仿各种声响来做节奏音乐，大约是在十年前左右才兴起的一种独立的文化。我们没有任何要求，只需要你对B BOX的热情！','声乐')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('红动漫协会','四川大学红动漫社是为川大内ACG众同好提供交流、展示以及分享平台的服务性兴趣活动社团。','动漫')");
		
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','电子维修')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','ajax')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','css')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','html5')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','html')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Nosql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Access')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Sqlite')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','DB2')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','SQLServer')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Oracle')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Mysql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','操作系统')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','软件工程')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','CoreIDRAW')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','ps')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','视频制作')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Python')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Javascript')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Php')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Jsp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Asp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','Java')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','C++')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','C语言')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。','维修')");
		
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','电子维修')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','ajax')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','css')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','html5')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','html')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Nosql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Access')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Sqlite')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','DB2')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','SQLServer')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Oracle')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Mysql')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','操作系统')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','软件工程')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','CoreIDRAW')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','ps')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','视频制作')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Python')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Javascript')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Php')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Jsp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Asp')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','Java')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','C++')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','C语言')");
		db.execSQL("insert into shetuan(name,jianjie,inSort_3) values('电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。','维修')");
		
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st01','排球协会','四川大学排球俱乐部成立于2003年，俱乐部自成长之初便云集了川大第一流的排球精英。俱乐部指导老师唐成教授，现为四川大学体育学院院长、四川省体育学术学科带头人。协会成立至今，一直相当重视排球运动在大学校园里的普及工作，长期以来义务进行排球知识宣传以及排球技战术指导。近年来，我们同成都许多高校的兄弟协会开展了各种交流性质的活动，如川大交大、川大科大对抗赛等。俱乐部还单独组织参加各种成都的业余排球比赛，并取得优异成绩。2010年5月，在第三届全国高校校园社团评比中，荣获“全国百强社团”称号。 ')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st02','足球协会','足球协会旨在推广校园足球，宣传足球运动。为提高校园足球人口，丰富同学们的课余文化生活，促进校园足球文化的发展做出了极大的贡献。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st03','篮球协会',' 篮球协会是目前川大规模较大、创办时间较长的社团之一，有着广泛的群众基础及巨大的影响力，是体育类社团中的佼佼者。如今的篮协，经过不断的探索、拼搏和磨练，已经发展成为一个具有完备严谨的规章制度、协调合作的六大部门、几百余名会员的大型综合性体育社团。经过几代篮协人的不懈努力，篮协屡次获得“十佳学生社团”荣誉称号，于2010年获得了社团联颁发的“十佳学生社团”、“最具活力社团”两大荣誉称号。在如此良好的发展前景下，篮协正以昂扬的激情、蓬勃的活力、无限的创新精神、有力的宣传手段，逐步走向鼎盛。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st04','武术协会','四川大学武术协会是四川大学历史悠久、极具影响力的校级学生社团之一。于1997年由华西临床医学院陈玉成、易成教授以及广大热爱武术的同学自发组织成立，前身为“华西太极拳协会”，而后更名为“华西武术协会”，2002年三校区合并后，再次更名为“四川大学武术协会”。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st05','体育舞蹈协会','四川大学体育舞蹈（国标舞）协会 四川大学体育舞蹈协会（Ballroom Dance Association of SiChuan University）是成立于2002年的校级学生社团，协会的指导思想是“营造四川大学校园文化艺术氛围，丰富大学生的课余文化生活，提高学生的综合素质”。协会奉行“拼搏进取、奋发向上、勤奋乐观、坚韧顽强”的准则，坚持“精简、高效、务实、创新”的理念，志在培养更多体育舞蹈爱好者，全面提高川大学生的素质修养。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st06','网球协会','网球凝聚着速度、力量、优美与爆发。因为热爱，我们聚在这里——网球协会，一起享受网球给我们带来的快乐。在这里，你可以享受阳光下的挥汗如雨；在这里，你可以收获运动之后身心的放松；在这里，你可以得到观众的惊呼和鼓掌。阳光帅气学长会让柔弱小女子成为美貌和力量并存的莎拉波娃；运动达人会教体育白痴成为网球大师。不要怀疑我们的团结性，我们是个凝聚的集体。“网聚你我，追‘球’快乐”是我们的目标，网球教会我们团结、谦逊、更让我们懂得集体的重要。四川大学网球协会，运动的乌托邦。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st07','风越翎翔滑轮协会','“轮滑”以它独特的吸引力在社会上迅速普及，尤其深受广大大学生的喜爱，轮滑协会是由学院轮滑爱好者发起，是集健身、竞技、娱乐、趣味、技巧、艺术、休闲于一体的学生社团，也是发展与深化校园文化的生力军。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st08','定向运动协会','从事定向运动普及和提高，开展定向运动培训、考核、竞赛、评比等相关工作的组织。为促进校园健身运动的广泛开展，发挥体育的综合功能和社会效应，丰富社会体育文化生活。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st09','棋牌协会','棋牌协会成立于1986年，经过16年的发展，已包含了中国象棋，国际象棋，围棋，三国杀，五子棋，跳棋，军棋，桥牌等多种棋牌。协会每周都会有例行活动:新手教学，高手对弈… 还有校级大赛，高校联赛等各种大型比赛…加入我们，还有机会进入协会的四大部门(技术部，宣传部，交流部，文秘部)锻炼。无论你是新手还是高手，只要有兴趣，就赶紧加入棋协吧，在这里你将会认识更多的朋友，得到更多的乐趣！')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st10','台球协会','你了解台球么？你还在埋怨为什么小小的台球不听你使唤么？你想在球场上随心所欲么？你还在为找不到适合的球友而烦恼么？想在你的朋友面前大展身手么？来吧，台球协会在这里等着你。不用担心你现在的技术是怎样，不用担心你对台球知识一无所知，只要怀揣着那一份热情，我相信一切皆有可能。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st11','飞扬俱乐部','川大学•飞扬俱乐部 是 2003年9月由 四川大学在校生 自主创建的“公益性、服务型”IT社团。创建时名为 四川大学•艺术学院•飞扬工作室，并于2007学年更名为 四川大学•艺术学院•飞扬俱乐部。2010年5月升为校级社团后，沿用“飞扬俱乐部”品牌至今。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st12','皮影协会','四川大学皮影协会，可以说是最年轻的校级协会之一，从08年10月成立，到10年皮影协会迎来的里程碑：成功晋升为校级学生社团。短短三年时间，他们完成了精彩的蜕变。共青团四川省委员会“让爱动起来”灾后重建百万计划活动获奖项目，四川大学轻纺与食品学院2008、2009年迎新晚会优秀节目，2009年10月《华西都市报》对四川大学轻纺与食品学院皮影协会进行专题采访，2009年11月四川电视台科教频道《记录》栏目对四川大学轻纺与食品学院皮影协会进行专题采访。一项项荣誉，是对他们最好的加冕。几代皮影协会人用自己的毅力，用自己的坚持，创造了一个又一个神话，完成了自己的魅力梦想，破茧成蝶。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st13','BOBO街舞协会','四川大学BOBO街舞协会成立于2005年，经过七年的不断努力，成为了一个囊括popping、breaking、jazz、hip-hop、locking等不同街舞舞种的艺术类社团。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st14','戏曲社','四川大学戏曲社，又名梨园雅韵戏曲协会，成立于2005年。 四川大学戏曲社是由爱好戏曲，致力于推广戏曲的多位同学在2005年发起成立的融艺术性、社会性和实践性为一体的学生团体组织。本协会的宗旨是发展戏曲艺术，弘扬中国传统文化，丰富校园生活，培养和锻炼大学生的戏曲艺术感，全面提升校园的曲艺艺术水平。 ')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st15','青年摇滚社','青年摇滚社致力于为所有喜欢摇滚乐的人提供一个交流学习的平台和展示自己的舞台。 我们相信摇滚不死。 我们相信信仰不死。 我们相信理想不死。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st16','欧美音乐协会','主要举办音乐沙龙 草地音乐主题交流 ，小型演唱会等。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st17','古筝协会','四川大学古筝协会主要活动， 古筝零基础小班教学（有无基础不重要，有兴趣就别拒绝） ，会员校内免费练琴 ， 拥有多学院、各晚会表演展示机会 ， 享受定期古筝知识讲座、音乐会席位 ♩同其他优秀协会交流合作，碰撞火花 。在温馨的聚会中寻找你志同道合的小伙伴。只要喜欢古筝，就来吧！')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st18','古琴协会','四川大学古琴社是由四川大学团委主管的以琴学研究为主的四川大学学生文艺团体。本社的中文全称为：四川大学古琴社。本社的宗旨和任务是深入研究和弘扬中国传统古琴文化，努力探讨琴学的理论、实践及其在现代社会的积极意义，通过组织讲座、研讨、座谈、演奏和学术交流等方式在四川大学开展琴学文化研究，提高社员的琴学修养，丰富和繁荣校园文化，以便更好地继承中国传统文化精髓，发扬琴道，净化人心。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st19','雷雨话剧社','四川大学“雷雨”话剧社成立于20世纪70年代末80年代初，原名“青鸟”话剧社。剧社公演《雷雨》，在全国引起巨大轰动。当时病重的曹禺先生也获知此事，特意嘱托妻子向话剧社表示祝贺，并且建议易名为“雷雨”。雷雨话剧社由此得名。雷雨话剧社一直秉承着“将经典演绎到底”的宗旨，演出了大大小小无数场经典话剧和原创剧目，广受媒体关注，在西南地区获得不少奖项，一度被誉为“西南高校话剧三驾马车”之一，不断为高校话剧的发展贡献自己微薄的力量。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st20','数字娱乐与电子竞技协会','在校团委社团联直接领导下，并由校团委及社团管理部门监管的校级协会，主要是为丰富同学的课余文化生活，并为对数字娱乐与电子竞技感兴趣的同学提供一个展示自我才艺的平台。电子竞技运动就是利用高科技软硬件设备作为运动器械进行的、人与人之间的智力对抗运动。通过运动，可以锻炼和提高参与者的思维能力、反应能力、心眼四肢协调能力和意志力，培养团队精神。本协会旨在为川大广大热爱电子竞技的同学提供一个正规的、安全的、方便的交流平台，提供一个公平的、公正的比赛平台。引导同学们正确对待电子竞技游戏，把电子竞技游戏作为学习工作之余的娱乐活动，而不是沉迷其中，以至于影响正常的生活。我们在过去的几年中，成功的举办了“川大杯”DOTA大赛，承办了世界知名品牌举办的电子竞技大赛。曾邀请到世界著名的电子竞技玩家来我校进行表演交流。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st21','笑笑相声社','笑笑相声社是四川大学校级社团，建立于2009年，社团以弘扬传统艺术为己任，目前会员113人，先后举办相声专场达18场，演出相声段子80余段，在校园颇具影响力深受广大同学、观众喜爱。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st22','英语协会','四川大学英语协会简称川大英协，正式成立于1994年，现有会员2000余人，是四川大学历史最悠久、规模最大的社团之一。川大英协是“四川大学十佳学生社团”、“四川大学五星级社团”。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st23','法语协会','法语协会是在四川大学校团委领导下，外国语学院法语老师指导下，以法语系学生为基础，并由广大法语爱好者自发组织起来的进行法语学习与交流的非营利性学生组织。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st24','日语协会','四川大学日语协会创建于2004年，旨在为四川大学的同学们介绍日本的风土人情和科技文化，致力于为广大日语爱好者提供一个学习和交流的平台。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st25','摄影协会','四川大学摄影协会，由一批摄影爱好者自发组建，成立于1982年, 是川大历史最久的学生社团之一。同时它也是四川大学最活跃、最有影响力的一个社团之一，连续多年被授予“四川大学优秀社团”的荣誉称号。 本着着“普及摄影知识，丰富校园文化生活”的宗旨，组织会员学习摄影知识，探索摄影艺术，开展摄影活动，进行摄影创作。 以提高个人的摄影技术和艺术修养和普及摄影艺术的中心，以照片展览、摄影比赛、外出采风、摄影讲座等方式和途径，在校内外开展活动。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st26','心理协会','四川大学心理协会，在2001年由原望江东区心理协会、望江西区心理学社和华西区心理协会强强合并成。协会隶属校团委，长期得到了四川大学心理健康中心的辅导与支持。凭借每学期丰富多彩而又富于特色的活动受到广大同学和老师的好评，连续7年被校团委评为校十佳社团。 心理协会在华西，以做专业化、有特色的心理类社团，组建一流团队，打造卓越培训队为发展目标。我们坚持学术性，以多样的形式普及心理知识，营造爱好心理学的氛围。同时，我们以培训为特色，面向校内外社团组织，打造专业化培训品牌，根据受众需要组织团队培训。 贴心团队因你而生，专业团队为你而建。 ')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st27','演讲与交际协会','四川大学演讲与交际协会成立于 1997年，是川大最早最大的社团之一。她以提高大学生演讲水平与人际交往能力，增强大学生的综合素质为宗旨，时刻保持着龙的传人的精神——人生留迹于天地之间，理应有惊人之局 。 “跳跃你的心，活动你的嘴，美丽新生活，全由你主张”是协会一致推崇的口号，也是协会永恒不变的目标。人人都可以精于演讲，长于交际，人人都可以“舍弃平庸，追求卓越。”')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st28','跆拳道协会','四川大学跆拳道协会成立于2008年初，隶属于四川大学制造学院团委学生会，现由世界跆拳道联盟黑带四段师范赵翼担任协会总教练，有权颁发中跆协级别证书的跆拳道组织。是全四川唯一正统韩式教学的跆拳道组织。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st29','合唱团','四川大学合唱团是党委学工部下属四川大学学生艺术团的一部分，目前有约60名成员组成，几乎每周都在望江校区组织排练，每学期都会有学校或更高等级的艺术演出或比赛。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st30','舞蹈队','四川大学学生艺术团舞蹈队，是隶属于学工部的校级组织。欢迎有舞蹈基础的同学加入！男女不限。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st31','美术社','四川大学美术社,由四川大学学工部艺术教育中心于2006年创建，是一个非营利文化艺术机构，是一个高校艺术交流的平台，具有展览、推广、教育、实践、交流五大功能。我们的希望透过推广当代艺术和艺术教育,令美术社成为一个最重要的文化机构,致力推动川大成为充满创造力,艺术文化活跃的高校')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st32','书法研究协会','书法艺术交流的 平台，弘扬传统文化，复兴书法艺术。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st33','书画协会','四川大学书画协会是为传承、发扬与传播中国书画艺术，以“弘扬民族文化，活跃校园生活”为宗旨, 努力营造墨韵书香的深厚校园文化底蕴而设立的校级艺术性社团。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st34','兵乓球协会','四川大学乒乓球协会是受校团委、学工部直接领导的学生组织。1992年，组建了乒乓球协会。1998年，协会在校团委注册成立。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st35','京剧研习社','四川大学京剧研习社，成立于2010年4月，挂靠于四川大学公共管理学院，受四川大学共青团团委的领导，属于校级（2011年晋升）艺术类社团。社团设有表演部、组织策划部、文宣部等部门。2013年6月，被评为2012-2013学年度校级十佳社团。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st36','B-Box协会','B-BOX全称Human Beat-box，即用嘴模仿各种声响来做节奏音乐，大约是在十年前左右才兴起的一种独立的文化。我们没有任何要求，只需要你对B BOX的热情！')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st37','红动漫协会','四川大学红动漫社是为川大内ACG众同好提供交流、展示以及分享平台的服务性兴趣活动社团。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st38','微软技术俱乐部','四川大学微软技术俱乐部是微软在高校成立的第一个俱乐部,是由微软亚洲研究院在全国27所高校创办的下属组织之一。')");
		db.execSQL("insert into shetuanbiao(id,name,jianjie) values('st39','电脑协会','四川大学电脑协会成立于1981年，电脑协会在百年名校四川大学孕育而生，并成为川大校内成立最早的协会之一，是唯一一个校级 IT学生社团，也是国内27所名校共同组成的“升技大学生俱乐部”成员之一。')");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS person");
		onCreate(db);

	}

}
