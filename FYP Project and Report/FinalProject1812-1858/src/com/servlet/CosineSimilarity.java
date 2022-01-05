package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.LinkedList;
import java.sql.DriverManager;

public class CosineSimilarity 
{
	
	Tokenization token=new Tokenization();
	String UploadDocument=token.CharRemoval;
	String cate1="aesthet  alien  anarch  anthropolog  behaviour  bourgeoi  bureaucraci  critic  cultur  democraci  determin  develop  dialect  dialect  doctrinair  dramat  ecolog  capit  career  chariti  citi  civil  class  collect  commerci  common  commun  commun  commun  consensu  consum  convent  countri  creativ  educ  elit  empir  equal  ethnic  evolut  existenti  experi  expert  exploit  famili  fiction  folk  formalist  140  gener  genet  geniu  hegemoni  histori  human  ideal  ideolog  imag  imperi  improv  individu  industri  institut  intellectu  interest  ism  manag  mass  materi  mechan  mediat  mediev  modern  monopoli  myth  nationalist  nativ  natur  natur  ordinari  organ  origin  racial  radic  ration  reactionari  realism  reform  region  repres  revolut  romant  scienc  sensibl  sex  socialist  societi  sociolog  standard  statu  structur  subject  tast  technolog  theori  tradit  unconsci  underprivileg  unemploy  utilitarian  violenc  wealth  welfar  western  work  jargon  labour  liber  liber  literatur  peasant  person  philosophi  popular  positivist  pragmat  privat  progress  psycholog  aesthet  alien  anarch  anthropolog  behaviour  bourgeoi  bureaucraci  critic  cultur  democraci  determin  develop  dialect  dialect  doctrinair  dramat  ecolog  capit  career  chariti  citi  civil  class  collect  commerci  common  commun  commun  commun  consensu  consum  convent  countri  creativ  educ  elit  empir  equal  ethnic  evolut  existenti  experi  expert  exploit  famili  fiction  folk  formalist  140  gener  genet  geniu  hegemoni  histori  human  ideal  ideolog  imag  imperi  improv  individu  industri  institut  intellectu  interest  ism  manag  mass  materi  mechan  mediat  mediev  modern  monopoli  myth  nationalist  nativ  natur  natur  ordinari  organ  origin  racial  radic  ration  reactionari  realism  reform  region  repres  revolut  romant  scienc  sensibl  sex  socialist  societi  sociolog  standard  statu  structur  subject  tast  technolog  theori  tradit  unconsci  underprivileg  unemploy  utilitarian  violenc  wealth  welfar  western  work  jargon  labour  liber  liber  literatur  peasant  person  philosophi  popular  positivist  pragmat  privat  progress  psychologicalaesthet  alien  anarch  anthropolog  behaviour  bourgeoi  bureaucraci  critic  cultur  democraci  determin  develop  dialect  dialect  doctrinair  dramat  ecolog  capit  career  chariti  citi  civil  class  collect  commerci  common  commun  commun  commun  consensu  consum  convent  countri  creativ  educ  elit  empir  equal  ethnic  evolut  existenti  experi  expert  exploit  famili  fiction  folk  formalist  140  gener  genet  geniu  hegemoni  histori  human  ideal  ideolog  imag  imperi  improv  individu  industri  institut  intellectu  interest  ism  manag  mass  materi  mechan  mediat  mediev  modern  monopoli  myth  nationalist  nativ  natur  natur  ordinari  organ  origin  racial  radic  ration  reactionari  realism  reform  region  repres  revolut  romant  scienc  sensibl  sex  socialist  societi  sociolog  standard  statu  structur  subject  tast  technolog  theori  tradit  unconsci  underprivileg  unemploy  utilitarian  violenc  wealth  welfar  western  work  jargon  labour  liber  liber  literatur  peasant  person  philosophi  popular  positivist  pragmat  privat  progress  psycholog";
	String cate2="comput adob  acrobat  address  algorithm  data  databas  debian  decompress  desktop  dialer  document  disk  oper  system  download  electron  numer  integr  electr  email  attach  web  browser  user  licens  agreement  explor  ext2  filesystem  type  ext3  filesystem  type  fat16  filesystem  fat32  filesystem  fedora  file  type  fileshar  filesystem  firewal  folder  footnot  format  freebsd  freewar  ftp  facebook  gigabyt  gimp  gmail  gnome  googl  gnu  gnupg  hacker  disk  hardwar  hash  function  home  page  html  http  cooki  java  javascript  kernel  keyboard  kei  keyword  laptop  link  linux  lavasoft  live  cd  macintosh  mac  mac  malwar  mandrak  linux  martu  md5  megabyt  microsoft  modifi  monitor  motherboard  mous  mozilla  web  browser  mozilla  firefox  web  browser  modem  ntf  filesystem  type  netscap  netscap  navig  web  browser  network  commerci  notebook  comput  ogg  openofficeorg  open  site  open  sourc  open  sourc  comput  program  open  sourc  comput  program  opera  web  browseoper  system  page  perl  person  comput  pdf  peer  peer  pgp  php  proprietari  piraci  pirat  plug  pop  printer  privaci  program  program  releas  python  qnx  quickbas  quicktim  random  access  memori  ram  reacto  memori  redhat  reiser  fs  filesystem  type  root  rsa  recycl  bin  boot  scan  search  engin  secur  server  share  sourc  sharewar  softwar  spam  spam  spreadsheet  spywar  super  comput  super  user  surf  internet  suse  sdk  trojan  hors  ubuntu  undo  unix  updat  upload  user  usb  version  virtual  commun  visual  basic  viru  vulner  window  xine  xml  x32  x64  yahoo  zip comput adob  acrobat  address  algorithm  data  databas  debian  decompress  desktop  dialer  document  disk  oper  system  download  electron  numer  integr  electr  email  attach  web  browser  user  licens  agreement  explor  ext2  filesystem  type  ext3  filesystem  type  fat16  filesystem  fat32  filesystem  fedora  file  type  fileshar  filesystem  firewal  folder  footnot  format  freebsd  freewar  ftp  facebook  gigabyt  gimp  gmail  gnome  googl  gnu  gnupg  hacker  disk  hardwar  hash  function  home  page  html  http  cooki  java  javascript  kernel  keyboard  kei  keyword  laptop  link  linux  lavasoft  live  cd  macintosh  mac  mac  malwar  mandrak  linux  martu  md5  megabyt  microsoft  modifi  monitor  motherboard  mous  mozilla  web  browser  mozilla  firefox  web  browser  modem  ntf  filesystem  type  netscap  netscap  navig  web  browser  network  commerci  notebook  comput  ogg  openofficeorg  open  site  open  sourc  open  sourc  comput  program  open  sourc  comput  program  opera  web  browseoper  system  page  perl  person  comput  pdf  peer  peer  pgp  php  proprietari  piraci  pirat  plug  pop  printer  privaci  program  program  releas  python  qnx  quickbas  quicktim  random  access  memori  ram  reacto  memori  redhat  reiser  fs  filesystem  type  root  rsa  recycl  bin  boot  scan  search  engin  secur  server  share  sourc  sharewar  softwar  spam  spam  spreadsheet  spywar  super  comput  super  user  surf  internet  suse  sdk  trojan  hors  ubuntu  undo  unix  updat  upload  user  usb  version  virtual  commun  visual  basic  viru  vulner  window  xine  xml  x32  x64  yahoo  zip comput adob  acrobat  address  algorithm  data  databas  debian  decompress  desktop  dialer  document  disk  oper  system  download  electron  numer  integr  electr  email  attach  web  browser  user  licens  agreement  explor  ext2  filesystem  type  ext3  filesystem  type  fat16  filesystem  fat32  filesystem  fedora  file  type  fileshar  filesystem  firewal  folder  footnot  format  freebsd  freewar  ftp  facebook  gigabyt  gimp  gmail  gnome  googl  gnu  gnupg  hacker  disk  hardwar  hash  function  home  page  html  http  cooki  java  javascript  kernel  keyboard  kei  keyword  laptop  link  linux  lavasoft  live  cd  macintosh  mac  mac  malwar  mandrak  linux  martu  md5  megabyt  microsoft  modifi  monitor  motherboard  mous  mozilla  web  browser  mozilla  firefox  web  browser  modem  ntf  filesystem  type  netscap  netscap  navig  web  browser  network  commerci  notebook  comput  ogg  openofficeorg  open  site  open  sourc  open  sourc  comput  program  open  sourc  comput  program  opera  web  browseoper  system  page  perl  person  comput  pdf  peer  peer  pgp  php  proprietari  piraci  pirat  plug  pop  printer  privaci  program  program  releas  python  qnx  quickbas  quicktim  random  access  memori  ram  reacto  memori  redhat  reiser  fs  filesystem  type  root  rsa  recycl  bin  boot  scan  search  engin  secur  server  share  sourc  sharewar  softwar  spam  spam  spreadsheet  spywar  super  comput  super  user  surf  internet  suse  sdk  trojan  hors  ubuntu  undo  unix  updat  upload  user  usb  version  virtual  commun  visual  basic  viru  vulner  window  xine  xml  x32  x64  yahoo  zip";
	String cate3="math acut  angl  adjac  algebra  angl  approxim  arc  area  asymmetr  averag  axi  bear  bidma  bisect  bracket  calcul  centilitr  centimetr  circumference	coeffici  congruent  constant  credit  section  cube  number  cuboid  cumul  frequenc  dai  debit  decagon	  decim  decreas  denomin  diamet  differ  distanc  equal  equat  equilater  triangl  estim  number  expand  express  factor  factoris  figur  formula  frequenc  frequenc  densiti  gradient  gram  hcf  heptagon  hexagon  histogram  hypotenus  increas  indic  integ  interquartil  rang  irrat  justifi  kilogram  kilometr  lcm  litr  loci  locu  lower  rang  median  metr  millilitr  millimetr  modal  mode  month  multipl  natur  number  neg  nonagon  numer  obtus  angl  octagon  odd  number  oper  parallel  parallelogram  pentagon  perimet  perpendicular	pi  polygon	  posit  number	  prime  prism  probabl  product  quadrat  equat  quadrilater  radiu  random  sampl  rationalrang  reciproc  recur  reflex  angl  regular  remaind  angl  rotat  scale  scale  factor  segment  sequenc  simplifi  solid  solv  speed  squar  number  surfac  area  symmetr  tally	tang  term  transform  translat  trapezium  tree  diagram  triangl  triangular  number  unit  upper  rang  variabl  volum  week  wide  width  xaxi  yaxi  yintercept  year  zaxi math acut  angl  adjac  algebra  angl  approxim  arc  area  asymmetr  averag  axi  bear  bidma  bisect  bracket  calcul  centilitr  centimetr  circumference	coeffici  congruent  constant  credit  section  cube  number  cuboid  cumul  frequenc  dai  debit  decagon	  decim  decreas  denomin  diamet  differ  distanc  equal  equat  equilater  triangl  estim  number  expand  express  factor  factoris  figur  formula  frequenc  frequenc  densiti  gradient  gram  hcf  heptagon  hexagon  histogram  hypotenus  increas  indic  integ  interquartil  rang  irrat  justifi  kilogram  kilometr  lcm  litr  loci  locu  lower  rang  median  metr  millilitr  millimetr  modal  mode  month  multipl  natur  number  neg  nonagon  numer  obtus  angl  octagon  odd  number  oper  parallel  parallelogram  pentagon  perimet  perpendicular	pi  polygon	  posit  number	  prime  prism  probabl  product  quadrat  equat  quadrilater  radiu  random  sampl  rationalrang  reciproc  recur  reflex  angl  regular  remaind  angl  rotat  scale  scale  factor  segment  sequenc  simplifi  solid  solv  speed  squar  number  surfac  area  symmetr  tally	tang  term  transform  translat  trapezium  tree  diagram  triangl  triangular  number  unit  upper  rang  variabl  volum  week  wide  width  xaxi  yaxi  yintercept  year  zaxi math acut  angl  adjac  algebra  angl  approxim  arc  area  asymmetr  averag  axi  bear  bidma  bisect  bracket  calcul  centilitr  centimetr  circumference	coeffici  congruent  constant  credit  section  cube  number  cuboid  cumul  frequenc  dai  debit  decagon	  decim  decreas  denomin  diamet  differ  distanc  equal  equat  equilater  triangl  estim  number  expand  express  factor  factoris  figur  formula  frequenc  frequenc  densiti  gradient  gram  hcf  heptagon  hexagon  histogram  hypotenus  increas  indic  integ  interquartil  rang  irrat  justifi  kilogram  kilometr  lcm  litr  loci  locu  lower  rang  median  metr  millilitr  millimetr  modal  mode  month  multipl  natur  number  neg  nonagon  numer  obtus  angl  octagon  odd  number  oper  parallel  parallelogram  pentagon  perimet  perpendicular	pi  polygon	  posit  number	  prime  prism  probabl  product  quadrat  equat  quadrilater  radiu  random  sampl  rationalrang  reciproc  recur  reflex  angl  regular  remaind  angl  rotat  scale  scale  factor  segment  sequenc  simplifi  solid  solv  speed  squar  number  surfac  area  symmetr  tally	tang  term  transform  translat  trapezium  tree  diagram  triangl  triangular  number  unit  upper  rang  variabl  volum  week  wide  width  xaxi  yaxi  yintercept  year  zaxi";
	String cate4="physic absolut  humid  absolut  absorpt  acceler  acceler  graviti  achromat  acoust  acoust  shield  adiabat  afoc  len  albedo  alpha  particl  altern  amorph  amper  amplitud  angl  contact  angl  incid  angl  reflect  angl  refract  angl  repos  angstrom  angular  momentum  angular  veloc  annihil  antineutrino  archimed  principl  atom  mass  unit  atom  number  avogadro  number  avogadro  law  balmer  line  beat	bernoulli  theorem  beta  particl  bind  energi  black  black  boyl  law  brewster  law  brownian  motion  bulk  modulu  elast  buoyant  forc  calori  candel  capacit  capacitor  capillar  carnot  theorem  centrifug  forc  centripet  forc  charl  law  chromat  aberr  clausiu  statement  law  thermodynam  closedsystem  coeffici  linear  expans  coeffici  superfici  expans  coeffici  volumetr  expans  coher  sourc  condens  point  conduct  convect  coulomb  law  critic  angl  cyclotron  decibel  densiti  diffract  dioptr  direct  dispers  displac  distanc  doppler  effect  einstein  mass  energi  relat  electr  electr  field  line	electr  potenti  energi  electr  insul  electromagnet  induct  electron  volt  endotherm  process  exotherm  process  farad  faradai  fluid  focu  fraunhoff  line  free  fall  frequenc  fundament  frequencygamma  rai  gravit  constant  gravit  potenti  point  gravit  potenti  energi  graviti  ground  state  halflif  heisenberg  uncertainti  principl  hertz  hook  law  horsepow  huygensprincipl  icepoint  ideal  ga  equat  impuls  inertia  infrason  insul  interfer  intern  energi  isobar  process  isochor  process  isotherm  process  isotop  joul  joul  law  heat  kelvin  statement  law  thermodynam  kinet  energi  kepler  law  planetari  motion  kepler  law  planetari  motion  kepler  law  planetari  motion  kilocalori  laser  latent  heat  fusion  latent  heat  sublim  latent  heat  vapor  law  conserv  energi  law  conserv  mass  law  conserv  momentum  lightyear  longitudin  strain  longitudin  wave  luminos  lyman  seri  magnet  wave  mass  number  mole  newton  law  nuclear  fission  nuclear  forc  nucleu  ohm  optic  fiber  oscillatori  motion  pascal  period  plasma  polar  quantum  power  pressur  projectil  quantum  radiat  reflect  refract  refract  index  densiti  reson  reverber  rigid  shear  stress  snell  law  speed  superconductor  thermal  ultrason  sound  uniform  circular  motion  unpolar  light  vector  quantiti  veloc  vibrat  virtual  imag  volt  voltag  drop  watt  wavelength  wave  motion  wave  period  wave  veloc  weight  work  elast  thermodynam physic absolut  humid  absolut  absorpt  acceler  acceler  graviti  achromat  acoust  acoust  shield  adiabat  afoc  len  albedo  alpha  particl  altern  amorph  amper  amplitud  angl  contact  angl  incid  angl  reflect  angl  refract  angl  repos  angstrom  angular  momentum  angular  veloc  annihil  antineutrino  archimed  principl  atom  mass  unit  atom  number  avogadro  number  avogadro  law  balmer  line  beat	bernoulli  theorem  beta  particl  bind  energi  black  black  boyl  law  brewster  law  brownian  motion  bulk  modulu  elast  buoyant  forc  calori  candel  capacit  capacitor  capillar  carnot  theorem  centrifug  forc  centripet  forc  charl  law  chromat  aberr  clausiu  statement  law  thermodynam  closedsystem  coeffici  linear  expans  coeffici  superfici  expans  coeffici  volumetr  expans  coher  sourc  condens  point  conduct  convect  coulomb  law  critic  angl  cyclotron  decibel  densiti  diffract  dioptr  direct  dispers  displac  distanc  doppler  effect  einstein  mass  energi  relat  electr  electr  field  line	electr  potenti  energi  electr  insul  electromagnet  induct  electron  volt  endotherm  process  exotherm  process  farad  faradai  fluid  focu  fraunhoff  line  free  fall  frequenc  fundament  frequencygamma  rai  gravit  constant  gravit  potenti  point  gravit  potenti  energi  graviti  ground  state  halflif  heisenberg  uncertainti  principl  hertz  hook  law  horsepow  huygensprincipl  icepoint  ideal  ga  equat  impuls  inertia  infrason  insul  interfer  intern  energi  isobar  process  isochor  process  isotherm  process  isotop  joul  joul  law  heat  kelvin  statement  law  thermodynam  kinet  energi  kepler  law  planetari  motion  kepler  law  planetari  motion  kepler  law  planetari  motion  kilocalori  laser  latent  heat  fusion  latent  heat  sublim  latent  heat  vapor  law  conserv  energi  law  conserv  mass  law  conserv  momentum  lightyear  longitudin  strain  longitudin  wave  luminos  lyman  seri  magnet  wave  mass  number  mole  newton  law  nuclear  fission  nuclear  forc  nucleu  ohm  optic  fiber  oscillatori  motion  pascal  period  plasma  polar  quantum  power  pressur  projectil  quantum  radiat  reflect  refract  refract  index  densiti  reson  reverber  rigid  shear  stress  snell  law  speed  superconductor  thermal  ultrason  sound  uniform  circular  motion  unpolar  light  vector  quantiti  veloc  vibrat  virtual  imag  volt  voltag  drop  watt  wavelength  wave  motion  wave  period  wave  veloc  weight  work  elast  thermodynam physic absolut  humid  absolut  absorpt  acceler  acceler  graviti  achromat  acoust  acoust  shield  adiabat  afoc  len  albedo  alpha  particl  altern  amorph  amper  amplitud  angl  contact  angl  incid  angl  reflect  angl  refract  angl  repos  angstrom  angular  momentum  angular  veloc  annihil  antineutrino  archimed  principl  atom  mass  unit  atom  number  avogadro  number  avogadro  law  balmer  line  beat	bernoulli  theorem  beta  particl  bind  energi  black  black  boyl  law  brewster  law  brownian  motion  bulk  modulu  elast  buoyant  forc  calori  candel  capacit  capacitor  capillar  carnot  theorem  centrifug  forc  centripet  forc  charl  law  chromat  aberr  clausiu  statement  law  thermodynam  closedsystem  coeffici  linear  expans  coeffici  superfici  expans  coeffici  volumetr  expans  coher  sourc  condens  point  conduct  convect  coulomb  law  critic  angl  cyclotron  decibel  densiti  diffract  dioptr  direct  dispers  displac  distanc  doppler  effect  einstein  mass  energi  relat  electr  electr  field  line	electr  potenti  energi  electr  insul  electromagnet  induct  electron  volt  endotherm  process  exotherm  process  farad  faradai  fluid  focu  fraunhoff  line  free  fall  frequenc  fundament  frequencygamma  rai  gravit  constant  gravit  potenti  point  gravit  potenti  energi  graviti  ground  state  halflif  heisenberg  uncertainti  principl  hertz  hook  law  horsepow  huygensprincipl  icepoint  ideal  ga  equat  impuls  inertia  infrason  insul  interfer  intern  energi  isobar  process  isochor  process  isotherm  process  isotop  joul  joul  law  heat  kelvin  statement  law  thermodynam  kinet  energi  kepler  law  planetari  motion  kepler  law  planetari  motion  kepler  law  planetari  motion  kilocalori  laser  latent  heat  fusion  latent  heat  sublim  latent  heat  vapor  law  conserv  energi  law  conserv  mass  law  conserv  momentum  lightyear  longitudin  strain  longitudin  wave  luminos  lyman  seri  magnet  wave  mass  number  mole  newton  law  nuclear  fission  nuclear  forc  nucleu  ohm  optic  fiber  oscillatori  motion  pascal  period  plasma  polar  quantum  power  pressur  projectil  quantum  radiat  reflect  refract  refract  index  densiti  reson  reverber  rigid  shear  stress  snell  law  speed  superconductor  thermal  ultrason  sound  uniform  circular  motion  unpolar  light  vector  quantiti  veloc  vibrat  virtual  imag  volt  voltag  drop  watt  wavelength  wave  motion  wave  period  wave  veloc  weight  work  elast  thermodynam";
	
	 public class values
	 {
	  int val1;
	  int val2;
	  values(int v1, int v2)
	  {
	   this.val1=v1;
	   this.val2=v2;
	  }
	  public void Update_VAl(int v1, int v2)
	  {
	   this.val1=v1;
	   this.val2=v2;
	  }
	 }
	 
	 double temp1,temp2,temp3,temp4;
	 
	 String temp;
	 
	
	 
	 public void Cosine_Similarity_Score(String Text1, String Text2, String titleName) throws IOException
	 {
		 switch (Text2) {
		case "categoryOne":
			
			double sim_score=0.0000000;
			  //1. Identify distinct words from both documents
			  String [] word_seq_text1 = Text1.split(" ");
			  String [] word_seq_db1 = cate1.split(" ");
			  
			  Hashtable<String, values> word_freq_vector = new Hashtable<String, CosineSimilarity.values>();                                  //new Hashtable<String, Cosine_Similarity.values>();
			  LinkedList<String> Distinct_words_text_1_2 = new LinkedList<String>();
			  
			//prepare word frequency vector by using Text1
			  for(int i=0;i<word_seq_text1.length;i++)
			  {
			   String tmp_wd = word_seq_text1[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector.get(tmp_wd);
			     int freq1 = vals1.val1+1;
			     int freq2 = vals1.val2;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(1, 0);
			     word_freq_vector.put(tmp_wd, vals1);
			     Distinct_words_text_1_2.add(tmp_wd);
			    }
			   }
			  }
			  
			  
			  //prepare word frequency vector by using Text2
			  for(int i=0;i<word_seq_db1.length;i++)
			  {
			   String tmp_wd = word_seq_db1[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector.get(tmp_wd);
			     int freq1 = vals1.val1;
			     int freq2 = vals1.val2+1;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(0, 1);
			     word_freq_vector.put(tmp_wd, vals1);
			     Distinct_words_text_1_2.add(tmp_wd);
			    }
			   }
			  }
			  
			  //calculate the cosine similarity score.
			  double VectAB = 0.0000000;
			  double VectA_Sq = 0.0000000;
			  double VectB_Sq = 0.0000000;
			   
			  for(int i=0;i<Distinct_words_text_1_2.size();i++)
			  {
			   values vals12 = word_freq_vector.get(Distinct_words_text_1_2.get(i));
			   
			   double freq1 = (double)vals12.val1;
			   double freq2 = (double)vals12.val2;
			   System.out.println(Distinct_words_text_1_2.get(i)+"#"+freq1+"#"+freq2);
			    
			   VectAB=VectAB+(freq1*freq2);
			    
			   VectA_Sq = VectA_Sq + freq1*freq1;
			   VectB_Sq = VectB_Sq + freq2*freq2;
			  }
			  System.out.println("VectAB "+VectAB+" VectA_Sq "+VectA_Sq+" VectB_Sq "+VectB_Sq);
			  sim_score = ((VectAB)/(Math.sqrt(VectA_Sq)*Math.sqrt(VectB_Sq)));
			   
			  
			 // return(sim_score);
			temp1 = sim_score;
			break;
			
		case "categoryTwo":
			double sim_score1=0.0000000;
			  //1. Identify distinct words from both documents
			  
			  
			  
			  double VectAB1 = 0.0000000;
			  double VectA_Sq1 = 0.0000000;
			  double VectB_Sq1 = 0.0000000;
			  //1. Identify distinct words from both documents
			  String [] word_seq_text11 = Text1.split(" ");
			  String [] word_seq_text2 = cate2.split(" ");
			  
			  Hashtable<String, values> word_freq_vector1 = new Hashtable<String, CosineSimilarity.values>();                                  //new Hashtable<String, Cosine_Similarity.values>();
			  LinkedList<String> Distinct_words_text_1_21 = new LinkedList<String>();
			 
			//prepare word frequency vector by using Text1
			  for(int i=0;i<word_seq_text11.length;i++)
			  {
			   String tmp_wd = word_seq_text11[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector1.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector1.get(tmp_wd);
			     int freq1 = vals1.val1+1;
			     int freq2 = vals1.val2;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector1.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(1, 0);
			     word_freq_vector1.put(tmp_wd, vals1);
			     Distinct_words_text_1_21.add(tmp_wd);
			    }
			   }
			  }
			  
			  
			  //prepare word frequency vector by using Text2
			  for(int i=0;i<word_seq_text2.length;i++)
			  {
			   String tmp_wd = word_seq_text2[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector1.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector1.get(tmp_wd);
			     int freq1 = vals1.val1;
			     int freq2 = vals1.val2+1;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector1.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(0, 1);
			     word_freq_vector1.put(tmp_wd, vals1);
			     Distinct_words_text_1_21.add(tmp_wd);
			    }
			   }
			  }
			  
			  //calculate the cosine similarity score.
			 
			   
			  for(int i=0;i<Distinct_words_text_1_21.size();i++)
			  {
			   values vals12 = word_freq_vector1.get(Distinct_words_text_1_21.get(i));
			   
			   double freq1 = (double)vals12.val1;
			   double freq2 = (double)vals12.val2;
			   System.out.println(Distinct_words_text_1_21.get(i)+"#"+freq1+"#"+freq2);
			    
			   VectAB1=VectAB1+(freq1*freq2);
			    
			   VectA_Sq1 = VectA_Sq1 + freq1*freq1;
			   VectB_Sq1 = VectB_Sq1 + freq2*freq2;
			  }
			  System.out.println("VectAB "+VectAB1+" VectA_Sq "+VectA_Sq1+" VectB_Sq "+VectB_Sq1);
			  sim_score1 = ((VectAB1)/(Math.sqrt(VectA_Sq1)*Math.sqrt(VectB_Sq1)));
			   
			  
			  //return(sim_score1);
			  temp2 =sim_score1; 
			break;
			
		case "categoryThree":
			double sim_score11=0.0000000;
			  //1. Identify distinct words from both documents
			  String [] word_seq_text111 = Text1.split(" ");
			  String [] word_seq_db11 = cate3.split(" ");
			  
			  Hashtable<String, values> word_freq_vector11 = new Hashtable<String, CosineSimilarity.values>();                                  //new Hashtable<String, Cosine_Similarity.values>();
			  LinkedList<String> Distinct_words_text_1_211 = new LinkedList<String>();
			  
			//prepare word frequency vector by using Text1
			  for(int i=0;i<word_seq_text111.length;i++)
			  {
			   String tmp_wd = word_seq_text111[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector11.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector11.get(tmp_wd);
			     int freq1 = vals1.val1+1;
			     int freq2 = vals1.val2;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector11.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(1, 0);
			     word_freq_vector11.put(tmp_wd, vals1);
			     Distinct_words_text_1_211.add(tmp_wd);
			    }
			   }
			  }
			  
			  
			  //prepare word frequency vector by using Text2
			  for(int i=0;i<word_seq_db11.length;i++)
			  {
			   String tmp_wd = word_seq_db11[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector11.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector11.get(tmp_wd);
			     int freq1 = vals1.val1;
			     int freq2 = vals1.val2+1;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector11.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(0, 1);
			     word_freq_vector11.put(tmp_wd, vals1);
			     Distinct_words_text_1_211.add(tmp_wd);
			    }
			   }
			  }
			  
			  //calculate the cosine similarity score.
			  double VectAB11 = 0.0000000;
			  double VectA_Sq11 = 0.0000000;
			  double VectB_Sq11 = 0.0000000;
			   
			  for(int i=0;i<Distinct_words_text_1_211.size();i++)
			  {
			   values vals12 = word_freq_vector11.get(Distinct_words_text_1_211.get(i));
			   
			   double freq1 = (double)vals12.val1;
			   double freq2 = (double)vals12.val2;
			   System.out.println(Distinct_words_text_1_211.get(i)+"#"+freq1+"#"+freq2);
			    
			   VectAB11=VectAB11+(freq1*freq2);
			    
			   VectA_Sq11 = VectA_Sq11 + freq1*freq1;
			   VectB_Sq11 = VectB_Sq11 + freq2*freq2;
			  }
			  System.out.println("VectAB "+VectAB11+" VectA_Sq "+VectA_Sq11+" VectB_Sq "+VectB_Sq11);
			  sim_score11 = ((VectAB11)/(Math.sqrt(VectA_Sq11)*Math.sqrt(VectB_Sq11)));
			   
		
			temp3 = sim_score11;
	
	break;
	
		case "categoryFour":
			double sim_score111=0.0000000;
			  //1. Identify distinct words from both documents
			  String [] word_seq_text1111 = Text1.split(" ");
			  String [] word_seq_db111 = cate4.split(" ");
			  
			  Hashtable<String, values> word_freq_vector111 = new Hashtable<String, CosineSimilarity.values>();                                  //new Hashtable<String, Cosine_Similarity.values>();
			  LinkedList<String> Distinct_words_text_1_2111 = new LinkedList<String>();
			  
			//prepare word frequency vector by using Text1
			  for(int i=0;i<word_seq_text1111.length;i++)
			  {
			   String tmp_wd = word_seq_text1111[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector111.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector111.get(tmp_wd);
			     int freq1 = vals1.val1+1;
			     int freq2 = vals1.val2;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector111.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(1, 0);
			     word_freq_vector111.put(tmp_wd, vals1);
			     Distinct_words_text_1_2111.add(tmp_wd);
			    }
			   }
			  }
			  
			  
			  //prepare word frequency vector by using Text2
			  for(int i=0;i<word_seq_db111.length;i++)
			  {
			   String tmp_wd = word_seq_db111[i].trim();
			   if(tmp_wd.length()>0)
			   {
			    if(word_freq_vector111.containsKey(tmp_wd))
			    {
			     values vals1 = word_freq_vector111.get(tmp_wd);
			     int freq1 = vals1.val1;
			     int freq2 = vals1.val2+1;
			     vals1.Update_VAl(freq1, freq2);
			     word_freq_vector111.put(tmp_wd, vals1);
			    }
			    else
			    {
			     values vals1 = new values(0, 1);
			     word_freq_vector111.put(tmp_wd, vals1);
			     Distinct_words_text_1_2111.add(tmp_wd);
			    }
			   }
			  }
			  
			  //calculate the cosine similarity score.
			  double VectAB111 = 0.0000000;
			  double VectA_Sq111 = 0.0000000;
			  double VectB_Sq111 = 0.0000000;
			   
			  for(int i=0;i<Distinct_words_text_1_2111.size();i++)
			  {
			   values vals12 = word_freq_vector111.get(Distinct_words_text_1_2111.get(i));
			   
			   double freq1 = (double)vals12.val1;
			   double freq2 = (double)vals12.val2;
			   System.out.println(Distinct_words_text_1_2111.get(i)+"#"+freq1+"#"+freq2);
			    
			   VectAB111=VectAB111+(freq1*freq2);
			    
			   VectA_Sq111 = VectA_Sq111 + freq1*freq1;
			   VectB_Sq111 = VectB_Sq111 + freq2*freq2;
			  }
			  System.out.println("VectAB "+VectAB111+" VectA_Sq "+VectA_Sq111+" VectB_Sq "+VectB_Sq111);
			  sim_score111 = ((VectAB111)/(Math.sqrt(VectA_Sq111)*Math.sqrt(VectB_Sq111)));
			   
		
			temp4 = sim_score111;
	
	break;

		default:
			break;
		}
		 
		 
		 System.out.println(temp1 +"  "+temp2+"   "+temp3+"   "+temp4);
		  
		 
	if (temp1>temp2 && temp1>temp3 &&temp1>temp4){
		 
		temp ="This is a category One matched file";
		
		
		InputStream source = null;
	    OutputStream os = null;
	    try {
	        source = new FileInputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + titleName);
	        os = new FileOutputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories\\category1\\" + titleName);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = source.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch(Exception e) {
	        source.close();
	        os.close();
	    }
		
	}
	else if (temp2>temp1 && temp2>temp3 &&temp2>temp4){
		
		
		temp ="This is a category Two matched file";
		
		InputStream source = null;
	    OutputStream os = null;
	    try {
	        source = new FileInputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + titleName);
	        os = new FileOutputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories\\category2\\" + titleName);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = source.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch(Exception e) {
	        source.close();
	        os.close();
	    }
	}
	else if (temp3>temp1 && temp3>temp2 &&temp3>temp4){
	
		temp ="This is a category Three matched file";
		
		InputStream source = null;
	    OutputStream os = null;
	    try {
	        source = new FileInputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + titleName);
	        os = new FileOutputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories\\category3\\" + titleName);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = source.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch(Exception e) {
	        source.close();
	        os.close();
	    }
}
	else if (temp4>temp1 && temp4>temp2 &&temp4>temp3){
		
		temp ="This is a category Four matched file";
		
		InputStream source = null;
	    OutputStream os = null;
	    try {
	        source = new FileInputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + titleName);
	        os = new FileOutputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories\\category4\\" + titleName);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = source.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch(Exception e) {
	        source.close();
	        os.close();
	    }
}
	else{
		
		temp ="Move it to other category File";
		
		InputStream source = null;
	    OutputStream os = null;
	    try {
	        source = new FileInputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + titleName);
	        os = new FileOutputStream("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories\\other category\\" + titleName);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = source.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } catch(Exception e) {
	        source.close();
	        os.close();
	    }
	}
	
		  
	 }
	 
	 
	 public void CalculateCosineSimilarity(String fileName) throws IOException
	 {
		 System.out.println("[Word # VectorA # VectorB]"); 
		
		String[] arr ={ "categoryOne","categoryTwo","categoryThree","categoryFour"}; 
		
		
		for (int i=0; i<arr.length;i++){
			
			Cosine_Similarity_Score(UploadDocument, arr[i], fileName);
			
		
		}
		
		
		System.out.println(temp);
		
		 
	 }
	 
}
