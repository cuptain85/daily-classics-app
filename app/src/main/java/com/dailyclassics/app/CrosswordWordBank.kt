package com.dailyclassics.app

/**
 * Curated English crossword entries imported from Open Crossword Bank.
 * Data license: CC0-1.0. Source: https://github.com/tamino-martinius/node-open-crossword-bank
 */
data class CrosswordWord(val answer: String, val clue: String, val difficulty: Int)

object CrosswordWordBank {
    val entries: List<CrosswordWord> by lazy {
        DATA.lineSequence().filter { it.isNotBlank() }.mapNotNull { line ->
            val parts = line.split("|", limit = 3)
            if (parts.size != 3) null else CrosswordWord(parts[0], parts[2], parts[1].toIntOrNull() ?: 3)
        }.toList()
    }

    private const val DATA = """
AAA|2|Common abbreviation for a roadside assistance organization
AAP|3|Abbreviation for Australia's national news agency
ABC|3|The simplest basics or first rudiments of a subject
ABE|2|Common nickname for a former US president named Abraham
ABS|2|Short for the abdominal muscles
ABU|4|A common name in Arabic-speaking cultures.
ACA|3|Abbreviation for a US healthcare reform law
ACC|3|A major US college athletic conference including Duke and North Carolina
ACE|1|A playing card bearing a single pip
ACL|3|Abbreviation for a key knee ligament often injured in sports
ACT|2|A thing done; a deed.
ADA|2|First name of computing pioneer Lovelace
ADD|1|To combine numbers into a sum, or to include something more
ADS|2|Short commercial messages, informally
AFC|3|Abbreviation for one of the two conferences in the NFL
AFL|3|Abbreviation for a major Australian sports league
AFP|3|Initialism for 'Agence France-Presse'.
AFT|3|Sternward
AGE|2|The length of time someone or something has existed
AGO|3|In the past, counting back from the present time
AHA|1|An expression of realization.
AHH|2|An exclamation of relief, surprise, or pleasure
AID|2|Help or assistance, especially to those in need
AIM|2|Point a weapon toward a target
AIN|4|A river in eastern France that lends its name to a department
AIR|2|The invisible mixture of gases that we breathe
AKA|3|Abbreviation meaning 'also known as'
ALA|4|A wing-shaped anatomical structure, as of the nose or hip bone
ALE|2|A type of beer brewed with top-fermenting yeast
ALI|3|Surname of boxing great Muhammad, 'The Greatest'
ALL|2|The whole quantity or every one of
ALS|4|Abbreviation for Amyotrophic Lateral Sclerosis
ALT|3|A modifier key on a computer keyboard, often used with other keys for shortcuts.
AMA|3|Online Q&A session, for short
AMC|3|A major American movie theater chain
AMD|3|American chipmaker known for its Ryzen processors
AMP|2|A device that boosts electrical sound signals
AMY|3|A common female given name, as borne by the late singer Winehouse
ANA|5|A collection of memorable sayings or anecdotes about a particular person.
ANC|3|South African political party once led by Nelson Mandela
AND|1|Conjunction that links two items together
ANG|4|First name of the director who made 'Life of Pi'
ANN|2|A short feminine given name
ANT|1|A small insect that lives in organized colonies
ANY|3|One or some, regardless of which
APE|1|A large tailless primate such as a gorilla or chimpanzee
API|3|A set of rules that lets separate software programs communicate
APP|2|A small software program run on a phone or computer
APR|1|Abbreviation for the fourth month of the year
APT|1|Suitable or fitting for the situation.
ARC|3|A curved line forming part of a circle
ARE|2|Present-tense plural form of 'to be'
ARI|3|A short given name, often used as a nickname, of Hebrew origin meaning 'lion'
ARK|2|A large boat, especially the one built by Noah in the Bible
ARM|1|The upper body limb between shoulder and hand
ART|1|Creative work such as painting or sculpture
ASA|4|Abbreviation for an old film-speed rating standard, now largely replaced by ISO
ASH|2|Powdery grey residue left after burning
ASK|1|Put a query to someone
ASS|2|A hoofed animal related to the horse, known for stubbornness
ATE|2|Consumed food, in the past tense
ATM|1|A machine that dispenses cash to bank customers.
ATP|2|Abbreviation for the governing body of men's professional tennis
AUG|3|Abbreviation for the eighth month
AUS|2|Short form for a country down under.
AUX|2|Short for an additional, back-up connection, as found on a stereo
AVA|3|A short, popular girl's given name
AVE|2|Short form used at the end of many street names
AVG|1|Common abbreviation for the arithmetic mean.
AWE|2|A feeling of great wonder or admiration
AWW|1|An exclamation of sympathy or affection, often at something cute
AXE|1|A tool with a sharp blade used for chopping wood
AYE|2|An affirmative vote or a way of saying yes.
BAD|1|Of poor quality or low standard
BAE|2|A term of endearment for a significant other.
BAG|1|A flexible container for carrying things
BAM|2|An exclamation imitating a sudden loud impact
BAN|1|To officially forbid or prohibit
BAR|2|A counter or establishment where drinks are served
BAT|2|A wooden or metal stick used to strike a ball in sport
BAY|2|A broad curved recess of the sea into the land
BBC|2|Britain's national public broadcaster (abbr.)
BBQ|1|Common abbreviation for an outdoor grilling event.
BEA|5|Bureau of Economic Analysis
BED|1|Piece of furniture you sleep on
BEE|1|A buzzing, pollinating insect that makes honey
BEG|2|To ask earnestly or humbly for something
BEL|5|A logarithmic unit for expressing ratios of sound intensity
BEN|4|A mountain or high hill, in Scottish usage.
BET|2|To stake money on an outcome
BID|2|An offer of a price, as at an auction
BIG|1|Large in size
BIN|1|Container for waste or for storing loose goods
BIO|2|A short account of a person's life
BIS|2|Twice, in music
BIT|1|A small piece or amount of something
BJP|3|A major political party in India.
BLM|2|Abbreviation for a social justice movement against racial injustice
BLU|4|Trendy short spelling of a primary colour, common in brand names
BMI|2|Abbreviation for a measure of body fat based on height and weight
BMW|2|German luxury car and motorcycle manufacturer
BOB|3|To move quickly up and down, as on water
BOG|2|Wet, spongy area of land with peat
BOI|4|An informal, playful spelling used for a young male friend.
BOM|3|Airport code for Mumbai
BON|3|French word for 'good' often borrowed into English phrases
BOO|1|An exclamation used to express disapproval or to startle someone
BOP|4|A style of jazz popular in the 1940s
BOT|2|An automated program that performs tasks online without human input.
BOW|3|A curved weapon used for shooting arrows
BOX|1|Square container with flat sides for storing things
BOY|1|A young male child
BRA|1|An undergarment that supports and covers a woman's chest.
BRO|2|Mate
BTC|2|Common abbreviation for a well-known cryptocurrency
BTW|1|An abbreviation for 'by the way'.
BUD|2|A small growth on a plant that develops into a leaf or flower
BUG|1|A small insect, or a flaw in a computer program
BUM|2|Informal British term for the buttocks
BUN|1|A small, round bread.
BUS|1|Large road vehicle that carries many passengers
BUT|2|Conjunction introducing a contrast
BUY|1|To obtain something in exchange for money
BYE|3|A free pass directly into the next round of a tournament
CAB|1|A car for hire, complete with driver
CAD|3|A man who behaves dishonorably, especially towards women
CAL|3|Informal short unit for measuring the energy content of food
CAM|3|A rotating machine part that converts circular motion into linear movement
CAN|2|To be able to do something
CAP|1|A soft, brimmed covering for the head
CAR|1|An engine-powered road vehicle for a few passengers
CAS|3|Abbreviation for the international body that arbitrates sports disputes
CAT|1|A small furry pet that purrs and meows
CBC|3|Initials of Canada's national public broadcaster
CBD|3|Abbreviation for a city's central business district
CBS|3|American television network with an eye logo
CDC|3|the U.S. agency focused on public health
CDS|2|Plural of a shiny disc used to store music or data
CEO|1|Chief executive officer, in short
CGI|2|Computer-generated imagery used in films, games, and animation.
CHA|3|An informal British word for a hot beverage made from steeped leaves.
CHE|3|Nickname of the Argentine revolutionary Guevara
CHI|3|Vital life energy in traditional Eastern medicine
CHO|4|A common Korean family name
CHU|4|A common Chinese and Korean surname
CIA|2|US foreign intelligence service (abbr.)
CIS|3|a term for individuals whose gender identity matches their sex assigned at birth
CMS|4|Abbreviated term for software used to publish and manage website content
CNN|2|American round-the-clock cable news network
COD|3|A common edible fish found in cold northern waters.
COL|4|A low pass between two mountain summits
COM|4|Prefix meaning 'together' or 'with'
CON|2|A trick used to cheat someone out of money
COP|2|An informal word for a police officer
COS|4|A crisp variety of lettuce, also called romaine
COW|1|A female farm animal kept for its milk
COX|2|A common English surname
CPR|2|Life-saving technique of chest compressions and rescue breathing
CPS|4|Abbreviation for a rate of transmission measured in cycles or characters per second
CPU|2|The central processing unit of a computer
CRY|1|To shed tears
CSS|2|Language used to style the layout of web pages
CUB|1|The young of a lion, bear, or wolf
CUE|1|A signal for an action to begin
CUM|4|A Latin term meaning 'with'.
CUP|1|A small container used for drinking
CUT|1|To divide or wound with a sharp blade
CUZ|2|Informal short form of 'because'
CVS|2|A well-known American drugstore and retail pharmacy chain
DAD|1|An informal word for one's male parent
DAM|1|A barrier built to hold back flowing water
DAN|3|A grade of black-belt rank in martial arts such as judo or karate
DAS|3|German definite article used before neuter singular nouns
DAT|5|A digital audio tape format.
DAY|1|A period of 24 hours.
DEA|3|US federal agency that enforces laws against narcotics
DEC|2|Abbreviation for the last month of the year
DEE|2|Common short form of the name Diana
DEF|3|cool
DEL|2|Keyboard key that erases the character to the right of the cursor
DEM|3|Short form used in US news for a member of one major political party
DEN|2|A wild animal's lair.
DER|4|German masculine form of 'the'
DES|3|First word in the name of Iowa's capital city
DET|3|Police slang shorthand for an investigating officer
DEV|1|informal term for a person who writes computer programs
DEW|1|Tiny drops of water that form on cool surfaces overnight
DIA|3|Airport code for Denver International Airport
DID|1|Past tense of do.
DIE|1|Stop living
DIG|1|Break up and turn over earth, as with a spade
DIM|1|Not bright or clearly visible
DIN|2|a loud, unpleasant noise
DIP|2|A brief swim, or a quick downward movement
DIR|4|Common abbreviation for the person in charge of a department, seen on org charts
DIS|3|Slang for showing contempt toward or insulting someone
DIV|3|An HTML tag that defines a section of a webpage
DIY|2|Abbreviation for making or repairing things yourself
DJS|2|People who play recorded music at clubs or on the radio
DLC|3|Extra paid content added to a video game after release, for short
DNA|2|Molecule that carries genetic information
DNC|3|A major political party in the United States.
DOC|2|Casual term for a physician
DOD|3|Abbreviation for the United States military department
DOE|1|A female deer
DOG|1|A domesticated canine kept as a pet
DOM|3|In web development, the programming interface representing a page's structure
DON|2|To put on, as a coat or hat
DOO|3|Informal short form of 'hairdo'
DOS|3|Command-line operating system that preceded Windows, briefly
DOT|1|A small round mark or point
DOW|3|Short name for a well-known U.S. stock market index
DRE|3|Grammy-winning rapper and producer who founded Beats Electronics
DRY|2|Free from moisture or wetness
DUB|3|To give someone or something a nickname or title
DUE|2|Expected to arrive or be paid at a set time
DUG|1|Excavated the earth with a tool
DUH|1|An expression of obviousness.
DUI|2|Abbreviation for the offense of operating a vehicle while intoxicated
DUN|3|A dull grayish-brown color
DUO|1|A pair of people working or performing together
DVD|1|Optical disc that replaced the VHS tape
DYE|1|A substance used to change the color of cloth or hair
EAR|4|A spike of grain, as found on a stalk of corn
EAT|2|Take in food through the mouth
ECO|2|Relating to or concerned with protecting the environment
EDS|3|Common abbreviation for 'editors', as used in a bibliography
EDT|3|Abbreviation for a North American summer time zone, four hours behind UTC
EFF|4|To curse or swear, informally
EGG|1|Oval object laid by a hen
EGO|3|A person's sense of self-esteem.
ELF|2|A small mythical being from folklore, often depicted with pointed ears
ELI|3|A short male first name, also a high priest in the Book of Samuel
ELK|1|A large deer species with broad antlers, found in North America and Europe
ELM|2|A type of tree often planted along streets for shade
EMS|2|Abbreviation for emergency medical services
END|2|The final part of something
ENG|3|Timetable abbreviation for the subject covering grammar, essays, and literature
EPA|3|U.S. federal agency responsible for protecting the environment (abbr.)
EPS|4|A file format used for vector graphics.
ERA|1|A distinct and notable period of history
ERR|1|To make a mistake
ESP|5|The ability to perceive information beyond normal sensory contact.
EST|3|Time-zone abbreviation for the US East Coast in winter
ETA|2|Estimated time of a plane's or vehicle's arrival, abbreviated
ETC|2|Abbreviation showing that a list continues in the same way
EUR|3|Three-letter ISO code for the currency shared by most EU member states
EVA|1|A popular female first name of biblical origin
EVE|3|The first woman, in the Book of Genesis
EXP|3|Abbreviated label for the points a game character earns to level up
EYE|1|The organ of the body used for seeing
FAA|3|US agency responsible for regulating civil aviation (abbr.)
FAB|2|Excellent or wonderful, informally
FAM|1|Folks
FAN|2|A device that stirs the air to keep you cool
FAR|2|At a great distance
FAT|1|Carrying an excess of body weight
FAX|2|A document sent electronically over a phone line and printed at the receiving end
FBI|2|U.S. agency that investigates federal crimes
FCC|3|US agency that regulates radio, TV, and telecom
FDA|2|US agency that regulates food and drugs (abbr.)
FEB|2|Short form for the second month of the year
FED|2|Gave food to a person or animal
FEE|2|A sum of money charged for a service or privilege
FEW|2|Amounting to a small number
FFS|3|Text-speak abbreviation expressing frustration or exasperation
FIG|2|A soft, sweet fruit full of tiny seeds
FIN|1|A flat body part that helps a fish swim
FIR|1|An evergreen tree with needle-like leaves, common at Christmas
FIT|1|In good physical condition
FIX|1|To repair or set right
FLA|3|An abbreviation for a state in the USA.
FLU|1|Common contagious viral illness
FLY|1|To move through the air on wings
FOE|1|An enemy or opponent
FOG|1|A thick cloud of tiny water droplets near the ground
FOO|3|Placeholder name used in programming examples
FOR|2|Preposition indicating purpose or intended recipient
FOX|1|A wild bushy-tailed animal related to the dog
FPS|2|Abbreviation for 'frames per second'
FRI|2|Common abbreviation for the fifth day of the working week
FRY|1|To cook something in hot fat or oil
FUN|2|Light-hearted enjoyment or amusement.
FUR|2|The short, fine hair covering the skin of animals.
FYI|2|An abbreviation used to preface something worth noting
GAG|2|A joke or funny remark, especially in a comedy routine
GAL|2|Informal word for a girl or young woman
GAO|4|US federal agency that audits how government funds are spent
GAP|2|An empty space or break between two things
GAS|2|A state of matter that is neither solid nor liquid
GAY|2|Sexually attracted to people of one's own sex
GDP|3|Gross Domestic Product.
GEE|3|An exclamation of surprise or mild enthusiasm
GEL|1|A thick, clear substance used to style hair
GEM|1|A precious stone, cut and polished
GEN|4|Informal British term for information or facts
GEO|3|Prefix relating to the Earth.
GET|3|To receive or come to have
GIF|1|Common web image format that can display simple animation
GIG|2|A job or performance, especially for musicians.
GIL|5|A thin membrane on the side of a fish's head.
GIN|1|A clear spirit flavored with juniper berries
GIT|2|A popular distributed version control system
GMT|2|Abbreviation for the time zone based at Greenwich Observatory
GOA|2|A small coastal state in western India famous for its beaches
GOD|1|A supreme being or object of worship
GON|4|Suffix meaning 'angle' in geometry
GOO|1|A soft, thick, sticky substance
GOP|3|Nickname for the U.S. Republican Party, the 'Grand Old' one
GOT|2|Past tense of get.
GOV|2|Informal short title for the elected leader of a US state
GPA|2|A measure of a student's academic performance.
GPS|3|A system for determining precise location.
GST|4|A value-added tax abbreviation commonly shown on retail receipts
GTA|4|A popular video game series.
GUM|1|A sticky substance chewed for flavor, not swallowed
GUN|1|A weapon that fires bullets through a barrel
GUS|2|A short, informal nickname for a boy, often shortened from a longer traditional name
GUT|2|The digestive tract.
GUY|2|An informal word for a man or fellow
GYM|1|Place equipped for physical exercise
HAD|2|Past tense of the verb meaning to own or hold
HAH|1|An expression of amusement.
HAI|1|A greeting in Japanese.
HAL|3|Short form of the given name Harold
HAM|1|Cured meat from a pig's thigh
HAN|2|Dominant ethnic group of China
HAS|2|Possesses; third-person form of a verb of ownership
HAT|1|A covering worn on the head
HAY|1|grass that has been cut and dried for use as animal feed
HBO|2|American premium cable and streaming television network known for prestige drama series
HEE|3|An exclamation used to represent a stifled giggle
HEH|3|An informal interjection expressing mild amusement
HEN|1|A female bird, especially a domestic chicken.
HER|2|Objective or possessive form referring to a female
HES|4|A colloquial contraction for 'he is'.
HEY|2|Casual exclamation used to get someone's attention
HID|1|Concealed something from view
HIM|2|That male person or animal as the object of a verb
HIP|2|The joint connecting the leg to the pelvis
HIS|2|Belonging to a male person already mentioned
HIT|1|To strike forcefully with the hand or an object
HIV|2|Retrovirus that attacks the body's immune system and can lead to AIDS
HMM|2|A murmured sound made while pausing to think
HMS|3|Abbreviation used before the name of a British Royal Navy ship
HOC|4|Latin word meaning 'this', used in phrases about improvised solutions
HOG|2|A domesticated pig.
HON|2|An informal term of endearment for a loved one
HOO|4|An interjection expressing surprise or excitement, as in a familiar phrase before 'boy'
HOP|2|To move in short springy jumps, often on one foot
HOT|1|Having a high temperature
HOW|2|In what way or by what means
HRS|2|Abbreviation for units of time, 60 minutes each
HTC|4|Taiwanese electronics company once famous for its Android smartphones
HUB|2|The central point of an activity, region, or network
HUD|3|Abbreviation for an on-screen display showing game or flight information
HUE|2|A shade or variety of color
HUG|1|To hold someone tightly in your arms as a sign of affection
HUH|2|Utterance signaling confusion or that you didn't understand
HUM|2|To make a low continuous sound.
HUN|3|A member of an ancient nomadic people who invaded Europe under leaders such as Attila
HUT|1|A small, simple shelter or cabin
IAN|3|Scottish form of the name John
IBM|2|American tech corporation nicknamed 'Big Blue'
IBN|4|Arabic word for 'son of', used in traditional names
ICC|3|Abbr. for the international court that prosecutes war crimes
ICE|1|Frozen water
ICY|1|Covered with ice.
IDA|3|A mountain in Crete famed in Greek mythology, or a common girl's name
IDK|2|Texting shorthand meaning 'I don't know'
IDS|1|Cards or documents that prove who someone is
III|2|Roman numeral for three
IKE|3|Affectionate nickname for the 34th U.S. president, Dwight Eisenhower
ILL|1|Suffering from poor health
IMF|3|Abbreviation for the international body that lends to countries in financial crisis.
IMO|2|Common text-speak abbreviation meaning 'in my opinion'
INC|4|Short form marking a registered corporation, often after a name
IND|4|Three-letter abbreviation for a populous South Asian nation, seen on vehicle plates
ING|3|A grammatical suffix that turns a verb into its participle or gerund form
INK|2|The colored fluid used for writing or printing
INN|2|A small establishment offering lodging and meals to travelers
INS|3|Those in power, contrasted with 'outs' politically
INT|3|Screenplay abbreviation marking an indoor scene
ION|3|An atom or molecule carrying a net electric charge
IOS|2|Apple's mobile operating system for iPhones
IOT|3|Abbreviation for a network of interconnected smart devices
IPO|3|Abbreviation for a company's first sale of stock to the public
IRA|3|A U.S. retirement savings account with tax advantages, for short
IRL|3|Internet abbreviation meaning 'in real life'
IRS|2|US government agency responsible for collecting federal taxes
ISA|2|A type of tax-advantaged savings account.
ISH|3|Somewhat, or close to but not exactly, used informally on its own
ISO|3|International Organization for Standardization
ISS|3|Abbreviation for a space station orbiting Earth
IST|2|Suffix denoting a person who practices a certain skill or belief
ITS|2|Belonging to or associated with a thing previously mentioned
ITV|2|Initials of the UK's oldest commercial broadcaster, a rival to the BBC.
IVE|4|A suffix indicating a tendency.
IVY|2|A climbing evergreen plant with glossy, lobed leaves
JAB|2|A quick, sharp punch
JAE|4|A common syllable used in many Korean given names
JAI|4|Hindi word meaning victory, as in a patriotic slogan
JAM|1|Sweet fruit preserve spread on toast
JAN|2|Abbreviated name of the year's opening month
JAR|1|A cylindrical glass or ceramic container with a wide mouth
JAW|1|The lower part of the face.
JAY|3|A noisy crow-family bird with blue plumage
JEN|3|A common short form of a longer feminine name ending in '-nifer'
JET|1|A fast aircraft driven by reaction engines
JEW|2|A person who practices or was born into Judaism
JFK|2|Airport code for a major New York international airport
JIM|1|Familiar short form of the name James
JIN|3|A type of distilled alcoholic beverage.
JOB|1|Paid work or employment
JOE|3|An ordinary man, as in the phrase 'average ___'
JON|3|Former "Daily Show" host Stewart, by his first name
JOY|1|A feeling of great happiness
JUL|2|Abbreviated summer month, between Jun and Aug
JUN|2|Three-letter abbreviation for the sixth month of the year
KAI|3|Māori and Hawaiian word meaning food
KAN|4|Scottish dialect term for a drinking vessel
KAT|2|Short form of a common girl's name starting with K
KAY|3|A short feminine first name, also the sound of the letter K
KEN|4|The range of one's knowledge or understanding
KEY|1|Metal object used to open a lock
KIA|2|South Korean car manufacturer
KID|3|A young goat
KIM|3|Short given name, and the title of a Rudyard Kipling novel
KIN|2|One's relatives or family members, collectively
KIT|1|A set of tools or equipment for a particular purpose
LAB|1|A room equipped for scientific experiments, for short
LAD|1|A boy or young man, especially in informal British usage
LAG|2|A period of delay between two related events
LAM|4|A hasty escape from the law or custody
LAN|2|Abbr. for a network confined to a small area, like an office
LAP|2|One full circuit around a race track
LAS|3|Spanish feminine plural word for 'the'
LAW|2|A rule made and enforced by a government
LAX|2|Not strict or tight.
LAY|2|To set or put down gently
LBS|2|Abbreviation for units of weight, pounds
LCD|2|Abbreviation for a display technology using liquid crystals, common in watches and calculators
LEA|3|A grassy open area; meadow.
LED|2|Guided a group from the front
LEE|4|The side sheltered from the wind
LEG|1|A limb used for standing and walking
LEN|3|A common short form of the given name Leonard
LEO|2|The fifth sign of the zodiac, symbolized by a lion
LET|2|Allow or give permission to do something
LEX|4|Law (as a Latin root)
LIB|3|Short informal term for a social freedom movement, as in a 1970s slogan
LID|1|A cover that fits on top of a container
LIE|1|An intentionally false statement
LIL|2|Informal shortening of 'little', often used in nicknames
LIN|3|A common Chinese and Taiwanese surname
LIP|2|Either of the two soft fleshy edges of the mouth
LIT|2|Set aflame, or brightly illuminated
LIU|2|A common Chinese surname
LIV|2|Popular short form of a common feminine given name
LLC|3|Abbreviation for a business structure that limits owners' personal liability
LOG|2|Running record of events kept over time
LOL|3|Texting acronym signalling laughter
LOS|4|Spanish masculine plural article meaning 'the'
LOT|2|A large amount or number of something
LOU|3|Homophone of a British term for a toilet
LOW|2|Not high in position, amount, or level
LSU|2|Abbreviation for a major university in Baton Rouge, home of the Tigers
LTD|3|British abbreviation following an incorporated company's name
LTE|3|A wireless broadband standard for mobile devices, often marketed as 4G
LUC|2|A short, common French or Belgian male first name
MAC|2|A personal computer made by Apple
MAD|2|Filled with anger; or mentally unsound
MAE|2|Nickname for Mary
MAG|2|An informal, shortened term for a printed periodical with articles and photos.
MAI|3|French word for the month of May
MAJ|3|Military rank abbreviation, one step above captain
MAL|3|A prefix meaning bad or evil.
MAN|2|Fellow
MAO|2|Chinese communist revolutionary leader.
MAP|1|A flat drawing showing roads, countries or terrain
MAR|3|To spoil or disfigure the appearance of
MAS|3|Informal plural term for mothers
MAT|1|A flat piece of woven fiber for wiping feet or covering a floor
MAX|2|Informal shortening for the greatest possible amount
MAY|3|Used to express possibility or to ask permission
MBA|2|A graduate degree in business administration.
MED|3|Abbreviation often paired with 'school' or 'pre-' in student slang
MEG|1|A unit of measurement equal to one million.
MEH|2|An expression of indifference or boredom
MEI|3|Chinese given name often translated as 'plum blossom'
MEL|3|A short, informal first name often used on its own
MEN|1|Adult human males
MET|2|Came face to face with
MHZ|3|Abbreviation for a unit of frequency equal to one million cycles per second
MIA|2|A common short female first name
MIC|1|A device that captures sound for amplification or recording
MID|3|Central
MIL|2|Slang term for one thousand thousand, used in finance
MIN|3|Short form for the 60-second time unit
MIR|3|A Soviet/Russian space station that orbited Earth from 1986 to 2001
MIS|4|A prefix meaning wrong or bad.
MIT|2|Prestigious Cambridge, Massachusetts tech university, briefly
MIX|1|Combine ingredients into one mass
MLB|2|Abbreviation for the top professional baseball league in the United States
MLS|2|Abbreviation for the top professional soccer league in the United States and Canada
MMA|3|A full-contact combat sport.
MMM|1|An expression of pleasure or satisfaction.
MOB|2|A large crowd of people.
MOD|2|a user-created change to a video game or piece of software
MOE|2|One of the Three Stooges, known for his bowl-cut hairstyle
MOM|2|Informal word for one's female parent
MOP|1|A tool with a bundle of strings or a sponge head for washing floors
MOS|3|Informal shorthand for a plural unit of time, each about 30 days
MPH|1|A unit of speed equal to miles per hour.
MPS|2|Elected members of the British House of Commons, for short
MRI|4|A medical imaging technique used to visualize internal structures.
MRS|2|Courtesy title placed before a married woman's name
MTV|2|An American cable channel originally dedicated to music videos
MUD|1|Soft, wet earth
MUG|1|A large cup with a handle, used for hot drinks.
MUM|1|British informal word for one's mother
MVP|2|Abbreviation for the best-performing player in a competition
NAH|2|Casual spoken expression of refusal
NAM|3|Informal American shorthand for the Southeast Asian war of the 1960s-70s
NAN|2|Informal British term for one's grandmother
NAP|1|A short sleep, usually during the day
NAS|3|Common abbreviation for a network-attached storage device
NAT|3|A short, familiar form of a common given name
NAY|2|A negative vote, as opposed to 'yea'
NBA|2|North America's top professional basketball league (abbr.)
NBC|2|An American television network.
NDP|3|Initialism for a Canadian federal political party founded in 1961
NED|3|A nickname short for the name Edward.
NEO|3|A character from a popular sci-fi film.
NET|2|A meshed material used to catch fish or score in tennis
NEW|1|Recently made, created, or brought into existence
NFC|3|Short-range wireless tech used for contactless payments, for short.
NFL|2|Abbreviation for America's professional gridiron football league
NGO|2|Abbreviation for a nonprofit group that operates independently of government
NHL|3|A professional ice hockey league.
NHS|3|National Health Service in the UK.
NIC|4|Abbr. for Network Interface Card
NIH|3|US medical research agency, for short
NOD|1|To lower and raise the head in agreement
NON|3|Prefix meaning 'not'
NOR|3|Conjunction used after 'neither' to add a second negative
NOS|3|Plural of a short word meaning negative answers, as at a ballot count.
NOT|2|Word used to express negation or denial
NOV|2|Eleventh month, for short
NOW|1|At the present moment or time
NPR|3|American public radio broadcaster known for shows like 'Morning Edition'
NRA|3|U.S. organization advocating for gun owners' rights
NRL|4|Abbreviation for Australia's premier rugby league competition
NSA|3|US federal agency in charge of signals intelligence and cybersecurity
NSW|2|Abbreviation for the Australian state containing Sydney
NUN|1|A woman belonging to a religious order who lives by vows
NUT|1|A hard-shelled fruit.
NYC|2|The Big Apple, in brief
OAK|1|Sturdy tree that bears acorns
OBI|3|A wide sash worn with a kimono
OCT|2|Tenth month of the year, in short
ODD|1|Not divisible by two, as a number.
OFF|2|Away from a place.
OHH|1|An expression of surprise or realization.
OIL|2|A viscous liquid used as a fuel or lubricant
OLD|1|Having lived for many years.
OLE|2|A shout of approval or triumph, especially at a bullfight.
OMG|2|Texting exclamation of shock or amazement
ONE|1|The first counting number
ONS|1|Short for online services.
OOH|2|An exclamation expressing surprise, delight, or pain
OOO|2|Common email auto-reply abbreviation for being away from work
OPS|2|Short informal term for military or business operations
OPT|2|To make a choice from a range of possibilities
ORE|2|Naturally occurring rock from which metal can be extracted
ORG|2|Short informal form of a word for a group formed for a shared purpose
OUR|2|Belonging to or associated with the speaker and others
OUT|3|Away from the inside, or no longer in play
OWE|2|To be under obligation to pay or repay
OWL|1|A nocturnal bird known for its large eyes and hooting call
OWN|2|To possess something.
PAC|3|Abbreviation for a group that raises money to support political candidates
PAD|2|A soft cushion or mat.
PAK|3|Three-letter Olympic country code for a South Asian nation bordering India
PAL|1|A close friend.
PAM|1|A short, informal form of a common female given name
PAN|2|A shallow metal container used for cooking
PAR|3|The standard number of strokes set for a golf hole
PAS|4|A document granting permission.
PAT|2|Tap gently with the flat of the hand
PAW|1|The foot of an animal with claws
PAY|2|To give money in exchange for goods or work
PBS|3|American public television network known for educational programming
PCS|3|Abbreviation for personal computers, or a short way to say pieces.
PDF|1|Common digital file type that preserves layout across devices
PEA|1|A small round green vegetable that grows in a pod
PEE|1|Wee
PEG|1|A small clip used to fasten washing to a line
PEN|1|A handheld instrument for writing in ink
PEP|2|Lively energy or enthusiasm
PER|2|For each; for every
PET|1|A tame animal kept at home for companionship
PEW|2|A long bench for sitting, especially in a church
PGA|3|Golf organization for professional players
PHD|3|The highest academic degree, awarded after a doctoral thesis
PHI|2|The 21st letter of the Greek alphabet.
PHP|2|A popular scripting language used for server-side web development
PIC|2|Informal word for a photograph
PIE|1|Baked dish with a pastry crust and a filling
PIG|1|A farmyard animal with a snout and a curly tail
PIN|1|A thin pointed piece of metal used to fasten fabric
PIP|2|A small hard seed found in a fruit such as an apple
PIT|1|A deep hole dug in the ground
PLC|4|A type of industrial control system
PLS|2|Informal texting abbreviation meaning 'please'
PNG|3|Three-letter abbreviation for a Pacific island nation whose capital is Port Moresby.
POD|2|A seed case of a plant such as a pea or bean.
POE|3|An American writer known for his macabre tales.
POL|2|Informal, shortened term for an elected official
POO|1|Solid bodily waste (informal term)
POP|2|To make a small, sharp explosive sound
POR|3|'For' or 'by,' in Spanish
POS|3|Abbreviation for the checkout terminal at a store
POT|1|Round, deep vessel used for cooking
POW|2|Abbreviation for a soldier captured by the enemy
PPL|2|Text-speak abbreviation for 'people'.
PRE|4|before
PRO|2|Someone who does an activity for a living
PSA|3|Abbreviation for a short message broadcast for the public good, often about health or safety.
PSI|3|Unit of pressure equal to pounds per square inch
PTS|2|Common scoreboard abbreviation for scoring units
PUB|2|A British establishment serving beer, ale, and meals
PUN|2|A form of wordplay that exploits multiple meanings.
PUP|1|A young dog
PUT|2|To move something into a particular position
QUE|4|Signal for a performer to start speaking or acting; also a rod used in billiards
QUO|3|The second word in the Latin phrase for 'the existing state of affairs'
RAD|2|Totally excellent, in surfer slang
RAE|2|A Scottish surname, also used as a first name.
RAF|3|Britain's military aviation force, for short
RAG|1|A piece of old cloth.
RAJ|4|The period of British rule in India.
RAM|1|An adult male sheep
RAN|2|Moved swiftly on foot, in the past
RAP|2|A quick, sharp blow or knock
RAT|1|A large rodent with a long, hairless tail
RAW|2|Not yet cooked or processed
RAY|2|A narrow line of light from the sun or a lamp
RBI|2|Baseball stat: a run driven in by a batter
REC|3|A short informal term for a facility used for games, sports, and leisure
RED|1|Of the color of blood or a ripe tomato
REF|1|Informal name for the official who oversees a game and enforces its rules
REG|3|British informal term for a vehicle's number plate.
REN|3|Surname of the Star Wars villain also known as Kylo
REP|2|A person who sells a company's goods, informally
RES|4|Abbreviation sometimes seen on a booking confirmation
REV|3|To increase the running speed of an engine
REX|2|Latin word meaning 'king'
REY|3|Spanish word for 'king'
RIB|1|a bone in the chest.
RID|3|To free or clear of something unwanted
RIG|3|Equipment or apparatus set up for a particular purpose, such as drilling
RIM|1|The outer edge of something round, like a wheel or cup.
RIO|3|Brazilian coastal city famed for its Carnival
RIP|1|To tear roughly apart
RNA|3|A molecule similar to DNA, involved in coding and expressing genes.
ROB|2|To take property unlawfully, often by force or threat
ROD|1|A thin straight bar of metal or wood
ROE|2|The eggs of a fish, often eaten as a delicacy
ROI|3|Abbreviation for a measure of investment profitability
RON|1|A male given name.
ROT|1|Gradual decay of organic matter
ROW|2|A line of things arranged side by side
ROY|5|Male given name derived from a word for 'king'
RPG|2|Abbreviation for a game genre in which players take on a fictional character's role
RPM|3|Abbreviation for a unit measuring rotational speed
RSS|3|A web feed format used to publish frequently updated online content
RUB|1|To apply pressure and friction to a surface.
RUE|4|To feel regret or remorse.
RUG|1|A piece of thick fabric used to cover a floor
RUM|1|A spirit distilled from sugarcane or molasses
RUN|1|To move quickly on foot, faster than walking
RYE|1|A cereal grass used to make bread and whiskey
SAC|3|A pouch-like structure in a plant or animal, often containing fluid.
SAD|1|Feeling sorrow or unhappiness
SAL|1|Female given name (short for Sarah)
SAM|2|Common male nickname
SAN|4|Spanish word for 'saint,' often before a city name
SAO|3|Abbreviation that precedes 'Paulo' in a major Brazilian city's name
SAP|2|The fluid that circulates in a plant.
SAS|3|British special forces regiment (abbr.)
SAT|2|Rested on a chair or seat (past tense)
SAW|2|A toothed tool for cutting wood
SAY|1|To express in words.
SBS|4|Abbreviation for the UK's elite Special Boat Service
SCI|3|Abbreviated term for the genre exploring futuristic technology and space travel
SEA|1|A large body of salt water
SEC|3|Informal short form for a very brief moment of time
SEE|1|To perceive something with the eyes
SEN|4|A member of the legislative body in the U.S.
SEO|3|The practice of optimizing web content for search engines.
SEP|2|Common abbreviation for the ninth month of the year
SER|5|An archaic Italian courtesy title, akin to 'Sir'
SET|2|Put or place in a particular position
SEW|1|To join fabric together using a needle and thread.
SEX|2|Either of the two main categories, male or female.
SGT|2|Abbreviation for sergeant.
SHA|3|Cryptographic hash function family abbreviation, as in ___-256
SHE|1|Female subject pronoun
SHI|3|A common surname in China
SHY|2|Nervous or reserved in the company of others
SIC|3|To urge an animal, especially a dog, to attack
SID|3|A short, informal form of a traditional English first name
SIM|2|Card that gives a phone its network identity
SIN|2|An immoral act that breaks a religious or moral law
SIP|1|To drink slowly, taking small amounts
SIR|1|Respectful term of address for a man
SIS|1|Casual term for a female sibling
SIT|2|To rest with the body supported on a seat
SIX|1|The number that follows five
SKI|1|A long narrow runner strapped to a boot for gliding over snow
SKY|1|The expanse of atmosphere seen overhead from the ground
SLY|1|Having or showing a cunning and deceitful nature
SMH|2|Internet slang abbreviation for 'shaking my head,' expressing disapproval or disbelief
SMS|2|Abbreviation for a mobile phone text-messaging service
SNP|3|Abbreviation for a Scottish political party that advocates independence
SOL|2|Word for 'sun' in Spanish and Italian
SON|3|Heir
SOO|4|Informal short name for the twin cities of Sault Ste. Marie
SOS|1|An international distress signal, often sent in Morse code
SOW|1|To scatter seeds over land for growing
SOX|2|An informal spelling of foot coverings worn inside shoes
SOY|1|Bean used to make tofu and a salty sauce
SPA|2|A resort offering therapeutic baths and treatments
SPY|1|A person who secretly gathers information for a government or rival
SQL|2|A programming language used to manage relational databases
SRI|4|South Asian honorific title placed before a man's name
STD|2|Common abbreviation for a sexually transmitted infection
SUB|3|A replacement player brought into a game
SUE|3|To bring a legal claim against someone in court
SUM|1|The total obtained by adding numbers
SUN|1|The star at the center of our solar system
SUP|2|To eat or drink something.
SUR|4|French word meaning 'on' or 'over'
SUV|2|A large vehicle designed for passenger transport and off-road capability.
TAB|3|A small projecting flap or label, or a running bill at a bar
TAD|1|A small amount or degree
TAE|4|Scots dialect word meaning 'to'
TAG|2|A small label attached to an item, often showing its price
TAI|4|A language family spoken in Thailand, Laos, and parts of southern China
TAN|2|To make leather from animal hides.
TAO|3|A guiding principle or path in Chinese philosophy
TAP|2|A device controlling the flow of liquid from a pipe
TAR|1|A thick black substance used to surface roads
TAT|4|Cheap, tacky merchandise (informal, chiefly British)
TAX|2|A compulsory charge imposed by a government
TBH|3|Texting shorthand introducing a frank admission
TEA|1|A hot drink made by infusing dried leaves in water
TED|1|Short form of the name Theodore
TEE|1|Small peg used to support a golf ball before a stroke
TEL|2|Common abbreviation used before a contact number in ads
TEN|1|The number that comes right after nine
TEX|2|Informal nickname for someone from the Lone Star State
THA|3|Informal or stylized spelling of the definite article
THE|1|Definite article in English
THO|4|Texting shorthand for the conjunction meaning 'in spite of that'
THY|2|Archaic possessive meaning 'belonging to you'
TIE|2|An equal score between contestants
TIL|2|Internet abbreviation meaning 'Today I Learned'
TIM|3|Apple CEO Cook, by his first name
TIN|1|a silvery-white metal.
TIP|2|A small sum of money given to someone for a service
TIS|2|It is, often used in poetry.
TIT|2|A small, active woodland bird often seen at feeders
TOE|1|One of the digits of the foot.
TOM|3|A male cat
TON|1|Unit of weight equal to 2,000 pounds
TOO|2|Excessively.
TOP|1|The highest point or uppermost part of something
TOR|4|A high rocky hill or a pile of rocks.
TOW|1|Pull a vehicle or boat using a rope or chain
TOY|1|An object for children to play with
TRI|2|Prefix meaning three, as in a shape with three sides
TRY|1|To make an attempt
TSA|2|US agency responsible for airport security screening
TUB|1|A wide, open container used for bathing or storage.
TUG|1|A sudden strong pull
TVS|2|Abbreviation for devices that display broadcast programmes
TWO|1|The number equal to one plus one
UAE|2|Gulf nation that includes Dubai and Abu Dhabi (abbr.)
UFC|2|Promotion at the forefront of mixed martial arts competition
UFO|1|An unidentified flying object, often linked to aliens
UGH|2|An exclamation expressing disgust or dismay
UHH|1|A hesitant sound made while pausing to think
UMM|1|An expression of hesitation.
UNA|3|A short feminine given name
UND|3|German word meaning 'and'
UNE|3|French word for 'a' or 'one' used before a feminine noun
UNI|2|Informal short form for a place of higher learning after school
UPS|3|Favorable periods, as opposed to the downs
URL|1|A web address
USA|2|Abbreviation for a large North American country
USB|2|a standard for connecting devices
USC|2|Abbreviation for the University of Southern California
USD|1|The currency of the United States.
USE|1|To employ for a purpose.
USS|2|Abbreviation placed before the name of an American naval vessel
UTC|1|Abbreviation for Coordinated Universal Time
VAL|3|A common short given name, often for a boy or girl
VAN|2|A covered road vehicle for carrying goods or people
VAR|3|Video technology used in football to review contentious refereeing calls (abbr.)
VAT|2|A large container used for storing or processing liquids
VER|3|Spanish word meaning 'to see'
VET|1|Animal doctor, for short
VIA|3|By way of; passing through a place
VIC|2|A short form of a male given name derived from the Latin word for 'conqueror.'
VID|1|Clip
VIE|2|To compete eagerly for something
VII|1|The Roman numeral representing the number seven.
VIN|3|French word for wine
VIP|1|A very important person given special treatment
VIS|4|A Latin word for force or power, used in older physics terms
VOL|4|Spine abbreviation marking a book's number within a set
VON|3|German particle meaning 'of' or 'from,' often seen in noble surnames
VOW|2|To make a solemn promise.
VPN|2|A service that encrypts your connection and hides your online activity
WAH|2|An exclamation imitating a child's crying
WAL|4|Informal short form of a common male first name
WAN|3|Pale and looking ill or tired
WAR|1|Armed conflict between nations or groups
WAS|2|Past tense of 'to be' for a single subject
WAT|4|A Buddhist temple complex in Thailand or Cambodia
WAX|1|A soft, moldable substance used to make candles
WAY|2|A route, path, or manner of doing something
WEB|2|A spider's silken trap for catching prey
WED|1|To formally marry someone
WEE|2|Very small in size
WEI|4|Ancient Chinese dynasty during the Three Kingdoms era
WEN|4|A harmless cyst on the skin, especially the scalp
WES|1|A short, informal form of a common male given name
WET|1|Covered or soaked with liquid
WHO|2|Asking which person
WHY|2|For what reason.
WIG|1|An artificial covering of hair worn on the head
WII|2|A Nintendo video game console known for motion-sensing controllers
WIN|1|To be victorious in a contest
WIT|2|The ability to say clever, amusing things
WON|2|Came first in a contest, in the past
WOO|3|To try to win someone's affection or support
WOW|2|An exclamation of surprise or admiration
WTF|3|Texting shorthand expressing shock or disbelief
WWE|2|An entertainment company known for professional wrestling.
WWW|1|Abbreviation for the World Wide Web
XII|1|Roman numeral for twelve
XIV|2|The Roman numeral for fourteen
XVI|3|Roman numeral representing the number sixteen
XXX|2|Symbol representing kisses at the end of a letter
YAH|2|An informal way of saying yes
YAN|4|A common East Asian surname
YAY|1|An exclamation of joy or triumph
YEA|3|An affirmative vote or answer
YEN|1|The official currency of Japan
YEP|2|An informal, casual way of saying yes
YER|2|Dialectal or informal spelling of 'your', often used to mimic casual speech.
YES|1|An affirmative reply
YET|3|Up until the present time; so far
YIN|3|The passive, dark, feminine principle in Chinese philosophy
YOO|3|A common Korean surname
YOU|1|Second-person pronoun
YRS|2|Common abbreviation for a plural unit of time equal to twelve months
YUM|1|Exclamation showing that food tastes delicious
YUN|4|A common East Asian surname
YUP|2|Casual, informal way of saying yes
ZAC|4|A common diminutive for a biblical Hebrew name meaning 'remembered by God'
ZEN|3|A school of Mahayana Buddhism emphasizing meditation and intuition
ZIP|2|To fasten with a sliding tab closure
ZOE|1|A common first name for a woman
ZOO|1|Place where wild animals are kept for public viewing
ABA|3|A loose sleeveless outer garment worn in some Arab countries
ABI|4|A term often used in technology and computing contexts.
ABT|4|Common shorthand used in casual notes for 'approximately'
ADM|3|Abbreviation for a high-ranking naval officer's title
ADO|2|Fuss or bother, especially over something trivial
AMI|2|A friend or companion.
ANI|4|Tropical black bird related to the cuckoo
ANS|3|Abbr. for a reply given on a test or quiz sheet
AOL|3|Early internet service provider known for its dial-up CDs
APA|3|Abbreviation for a common academic citation and formatting style
APC|4|Military vehicle abbreviation for an armored troop transport
ARA|4|A term often used in relation to a specific culture or language.
ARS|4|Latin noun meaning 'art' or 'skill'.
ATL|3|Airport code for Georgia's capital city
ATT|3|An abbreviation for a telecommunications company.
AUD|3|Currency abbreviation for the Australian dollar
AVI|3|A common file extension for video files on Windows
AWS|3|Abbreviation for Amazon's cloud computing division.
BAI|4|Informal internet spelling of a casual farewell
BAS|5|Abbreviation for a bachelor's degree focused on applied science
BBW|4|Slang abbreviation describing a large, curvy woman
BCS|3|Former U.S. college football ranking system used to select bowl matchups
BEY|3|Title for a ruler in the Ottoman Empire
BIZ|1|Informal word for commercial trade or a company
BOA|2|A large snake that squeezes its prey to death
BST|3|Abbreviation for the clock time used in Britain during the summer months
BTS|2|Globally popular South Korean boy band
BYU|3|Abbreviation for a private university in Provo, Utah
CAO|4|Abbreviation for the chief executive who oversees an organization's day-to-day administration
CBA|3|Abbreviation for a formal agreement between an employer and a union
CBI|3|Abbreviation for Britain's leading business lobbying organization
CCC|2|Roman numeral representing 300
CCP|1|Chinese Communist Party
CES|3|Major annual consumer tech trade show held in Las Vegas each January
CFA|3|Abbreviation for a globally recognized investment credential (Chartered Financial Analyst).
CID|3|the UK's Criminal Investigation Department, abbreviated
CIO|3|Acronym for Chief Information Officer
CIR|3|Address abbreviation for a road that loops back on itself
CIV|3|Informal abbreviation for a non-military person
COE|3|certificate required to legally own a car in Singapore, for short
COO|2|To make a soft murmuring sound.
COR|3|British exclamation of surprise or amazement
COT|1|A small bed, often for infants.
COZ|2|informal shortening of 'because'
CPA|3|Abbreviation for a licensed professional who audits accounts and prepares tax returns in the US
CPC|3|Advertising metric measuring cost per click
CPI|3|Abbreviation for a widely used measure of inflation in consumer prices
CSA|3|abbreviation for the seceded Southern nation of the American Civil War
CSI|2|Abbreviation for the investigation of physical evidence at a crime scene
CSR|2|Term for a firm's effort to act as a responsible corporate citizen
DAB|2|A small quantity of something applied with a light touch
DAE|4|Internet forum abbreviation used to ask if others share an experience
DAI|3|Welsh nickname for the name David
DAL|3|A spiced lentil dish popular in South Asian cooking
DAR|4|Abbreviation for a US patriotic society of female descendants of Revolutionary War soldiers
DEB|2|Informal term for a young woman introduced formally into society.
DEI|3|Abbreviation for Diversity, Equity, and Inclusion.
DEX|2|Abbreviation for a character's agility-related attribute in role-playing games.
DHS|3|U.S. federal department responsible for border, transportation and cyber security (abbr.).
DMV|2|US agency that issues driver's licenses and vehicle registrations
DNS|3|Internet system that translates domain names into numerical addresses
DOI|3|Abbreviation for a unique identifier assigned to academic papers
DOJ|3|Abbreviation for the Department of Justice.
DRS|2|Abbreviation for doctors.
DUM|4|Latin word meaning 'while,' as found in a well-known motto about hope
EAU|2|the French word for water
EDM|3|A genre of electronic music.
EDO|4|A historical period in Japan.
EEL|1|A long, slender fish
EID|2|A major festival in the Islamic calendar
EIN|5|An identification number for businesses in the U.S.
ELY|3|Small English cathedral city built on a hill amid the Fens
EMO|3|angsty
ENT|3|Medical abbreviation for the ear, nose, and throat specialty
EOS|3|Greek goddess of the dawn
ERM|1|A sound made to express hesitation.
ERS|5|A leguminous plant, also called bitter vetch, grown as animal feed.
ESA|3|Abbreviation for the European organization that runs space missions like Rosetta
ESQ|3|abbreviation placed after a lawyer's name
ETH|3|A letter in Old English and Icelandic representing a voiced 'th' sound.
EUN|4|a common syllable in Korean given names, often meaning grace or kindness
EVO|3|Nickname for Bolivia's first indigenous president, Morales
FAD|1|A trend that is popular only briefly.
FAG|2|British slang for a cigarette
FAQ|1|A list of common questions with their answers, often found on a website.
FAV|1|Informal word for someone's top pick or most-liked thing.
FAY|5|A fairy or mythical being.
FEI|4|Abbreviation for the international governing body of equestrian sports
FFA|3|A competition or contest with no limits on who may enter or how they may act
FIL|4|Internet forum abbreviation for a spouse's father
FLO|1|A common name for a female character in a popular song.
FOL|4|Abbreviation for a numbered leaf or page in an old manuscript or book.
FRO|3|Backward, in the traditional phrase paired with 'to'
FTC|1|Federal Trade Commission
GHZ|3|Abbreviation for a unit of frequency equal to one billion cycles per second.
GIS|3|Abbreviation for a computer system that captures, stores, and analyzes geographic data
GMA|3|Texting abbreviation for a grandmother
GMO|1|A crop or organism whose DNA has been altered by scientists
GPU|3|A hardware component for rendering graphics.
GSM|3|abbreviation for a widely used mobile phone network standard
GUI|3|Graphical User Interface.
HAR|3|An exclamation representing a mocking or hearty laugh
HEM|2|The edge of a piece of cloth folded and sewn to prevent fraying
HEX|2|A magic spell intended to cause harm; a curse.
HOE|1|A long-handled garden tool used to break up soil and remove weeds
HUA|4|US Army slang shout of enthusiastic acknowledgment
HUI|2|A Māori social gathering or meeting
HWY|2|Common road-sign abbreviation for a major route between towns
HYE|5|A term used in Armenian for 'yes'.
ICH|4|Archaic dialect form of the English pronoun 'I'.
ICO|4|A cryptocurrency fundraising method in which new tokens are sold to early backers
ICT|2|Abbreviation for the field covering computers, networks, and telecommunications
ICU|1|Hospital department for patients requiring the highest level of monitoring and care
IDF|2|Abbreviation for Israel's military organization
IFS|3|Conditional possibilities or doubts raised in an argument
IGN|2|Popular video game news and review website, for short
IMP|2|A mischievous sprite
INA|3|A common female name.
IOC|2|Organization that oversees the modern Olympic Games
IPA|2|Abbreviation for a hoppy, bitter style of beer originally brewed for export.
IPL|2|Indian cricket league, for short
IPS|3|Numerical addresses (abbr., plural) that identify devices on a network.
IRE|2|Intense anger.
ISP|1|A company that provides individuals and businesses with internet access
ITO|5|Abbreviation meaning 'in terms of'
JAX|2|A shortened, informal form of the given name Jackson.
JEB|3|Nickname of a famous Confederate cavalry commander, J. E. B. Stuart.
JOG|1|To run at a steady, gentle pace.
JOS|3|City in central Nigeria, capital of Plateau State
JUG|2|A container for liquids, typically with a handle.
JUS|3|a light sauce made from meat juices
KEV|3|A unit of energy equal to a thousand electronvolts, common in nuclear physics
KFC|2|Initials of a famous fried-chicken fast-food chain founded by a colonel
KGB|4|The main security agency for the Soviet Union.
KKK|1|Ku Klux Klan
KOH|4|Chemical formula for potassium hydroxide, a strong alkaline compound.
KUN|4|A Japanese honorific suffix typically used for boys or junior males.
LAC|3|A resinous substance secreted by certain insects, used in making varnish.
LAI|4|A short narrative or lyric poem from medieval French literature
LAO|3|Relating to a Southeast Asian nation whose capital is Vientiane, or its people.
LAU|4|A surname common among people of Cantonese or Hong Kong Chinese descent.
LDS|2|A religious group known as the Church of Jesus Christ of Latter-day Saints.
LEI|1|A garland of flowers traditionally worn in Hawaii.
LEV|3|the basic monetary unit of Bulgaria
LEW|4|An old dialect word meaning lukewarm or tepid.
LIM|2|East Asian surname
LLP|1|Abbreviation often seen after a law or accounting firm's name
LNG|3|Abbreviation for natural gas cooled into liquid form for shipping
LOC|3|Abbreviation for the largest library in the United States
LON|3|airport code abbreviation often used for the UK capital
LOO|1|A British term for a toilet.
LSD|2|A powerful mind-altering drug known for causing hallucinations
LUX|3|Latin for 'light'
LVL|3|Common text-speak abbreviation for a stage of progress, as in a video game
MAH|1|An expression of disbelief or annoyance.
MAM|1|A term of endearment for mother.
MER|3|French for 'sea'
MGM|2|A famous Hollywood film studio known for its roaring lion logo.
MLA|3|Citation style commonly used in humanities papers, for short
MOI|3|A playful way of saying 'me', borrowed from French.
MOL|4|The SI base unit for amount of substance, for short
MOO|1|The low sound a cow makes
MOR|4|Abbreviation describing bland, easy-listening popular music.
MSC|3|A major shipping company.
MSG|2|A flavor-enhancing food additive, for short
MSM|3|Initials commonly used for large, established news outlets collectively
MSU|4|Abbreviation for a well-known land-grant university in Michigan
NAG|1|To pester someone repeatedly with complaints or requests
NAV|2|Short, informal term for a car's GPS guidance system.
NAW|1|A colloquial way to say no.
NEC|3|Abbreviation for a major Japanese electronics and computing corporation.
NEE|3|Used before a woman's maiden name
NES|2|Nintendo's classic 8-bit home video game console, for short
NEV|4|Abbreviation for the U.S. state whose capital is Carson City
NIL|1|Zero; nothing
NIP|2|A small sharp bite or pinch
NOM|1|An informal term for eating or consuming.
NXT|3|Text-speak abbreviation meaning 'next'
NYE|2|Common abbreviation for the night before January 1st
NYT|2|A prominent American newspaper.
NYU|3|Abbreviation for a well-known Manhattan university
OCD|2|A mental health condition involving intrusive thoughts and repetitive behaviors, for short
ODE|2|A lyric poem expressing praise or celebration of a person or thing.
ODI|3|Abbreviation for a limited-overs cricket match completed in a single day
OEM|3|Abbreviation for a firm that makes components sold under another brand's name.
OFC|2|An abbreviation for 'of course'.
OFT|3|A literary word meaning many times or repeatedly
ONO|3|British classified-ad abbreviation meaning the seller will accept a lower offer
OOF|2|Exclamation of discomfort or exertion
ORB|1|A spherical object, especially one used as a symbol of royal power.
ORR|2|A short surname of Scottish origin
OST|4|A term often used for a soundtrack.
OSU|1|A public university located in Ohio.
OTC|2|Available without a prescription, for short
OVA|2|Female reproductive cells, more than one egg cell.
PAP|4|Soft, bland food suitable for infants or invalids
PAX|3|A term used for peace.
PCB|3|Abbreviation for the board holding electronic components
PCI|4|Abbreviation for a standard computer expansion bus for hardware cards.
PCR|3|Lab technique used to amplify DNA, for short
PCT|2|Abbreviation for a hundredth part of something
PLA|3|A biodegradable filament material widely used in 3D printers, made from corn starch.
PLY|2|A layer of thickness in fabric, wood, or paper
PLZ|2|Text-message abbreviation meaning 'please'.
POM|3|Informal Australian or New Zealand term for an English person.
POV|3|An abbreviation for point of view.
PPM|3|Unit measuring pollutant concentration, for short
PPP|4|Common economics abbreviation standing for 'purchasing power parity'
PSG|3|Abbreviated name of a famous Paris football club
PSP|3|A handheld gaming console.
PST|2|Abbreviation for Pacific Standard Time
PTY|3|Abbreviation for a type of company structure.
PVC|2|Durable plastic used in pipes and flooring
PVT|3|Abbreviation for the lowest rank of enlisted soldier
QLD|4|Abbreviation for the Australian state whose capital is Brisbane
QUI|3|French word for 'who'
RAI|4|A genre of Algerian popular music blending folk and Western styles
RAO|5|A surname of Indian origin.
RAS|4|Traditional Ethiopian title for a prince or chieftain
RBS|4|Abbreviation for a major Scottish banking group headquartered in Edinburgh
RCA|3|Abbreviation for a method used to identify the underlying cause of a problem
REA|3|A unit of measurement in the field of economics.
REM|2|The sleep stage associated with vivid dreaming and rapid eye movement
RET|5|To soak flax or hemp stalks to loosen their fibers
RIN|4|A small bell struck in Japanese Buddhist ceremonies
ROC|5|A mythical bird of prey in Middle Eastern folklore.
ROS|3|Acronym for Robot Operating System
RTS|3|Abbreviation for a video game genre involving live tactical unit commands, like StarCraft
RYU|3|A character from a popular fighting game.
SAG|1|To droop or sink down from weakness or pressure
SAI|3|A short given name of Indian or Japanese origin
SAR|3|Abbreviation for a self-governing territory such as Hong Kong or Macau
SEM|4|Abbreviation for paid search advertising, often paired with SEO
SES|4|Abbreviation for socioeconomic status
SHU|4|Abbreviation for the scale unit that measures chili pepper heat
SIG|3|Short block of text automatically appended to outgoing emails
SNL|2|An American television show known for its comedy sketches.
SOB|2|A convulsive gasp made while crying
SOC|3|Abbr. for a chip that integrates all electronic components on a single circuit
SOD|2|A layer of earth held together by grass and its roots
SOM|4|The basic monetary unit of Kyrgyzstan and Uzbekistan
SPD|3|Abbreviation often seen on a car dashboard, short for how fast it's going.
SSD|2|Fast storage device with no moving parts, for short
SSR|4|Abbreviation for a constituent republic of the former Soviet Union
STA|4|Common abbreviation seen on transit maps and signs
STE|2|Abbreviation often used for 'street'.
STR|3|Common abbreviation for a road, as used in postal addresses
STS|3|Common abbreviation for 'streets' used in addresses.
STU|3|Casual short form of a common male first name, often used among friends.
TAC|5|A one-time code used to authorize an online bank transaction
TAJ|3|Famous mausoleum in Agra
TAK|4|A dialect word meaning a liking or fondness for something.
TAL|4|German word meaning 'valley', often found as a suffix in Central European place names.
TAM|3|A soft, round Scottish cap with a bobble on top
TAU|2|Greek letter shaped like a capital T
TDS|4|Abbreviation for total dissolved solids, a measure of water quality
TER|4|Common abbreviation seen in British street addresses for a row of connected houses.
THC|3|The main psychoactive compound found in cannabis.
THI|4|A common syllable found in Vietnamese female given names
TIA|4|Mini-stroke (abbr.)
TIC|2|A sudden, repetitive muscle twitch
TLC|3|Acronym for tender loving care
TNT|2|A highly explosive compound used in military applications.
TOD|3|British slang for being entirely by oneself
TOS|3|Acronym for Terms of Service
TOT|1|a very young child
TPP|3|A trade agreement involving multiple countries.
TSP|2|Common recipe abbreviation for a small unit of volume
TUE|1|The second day of the week.
UNC|3|Abbreviated name for the North Carolina university whose team is the Tar Heels
UNO|2|A popular card game where players match colors and numbers
URI|3|A string of characters that identifies a resource, often on the web
URN|2|A container for holding ashes after cremation.
VEG|2|greens
VHS|3|Acronym for Video Home System
VIZ|4|Latin abbreviation meaning 'namely' or 'that is to say'
VOX|3|A term often related to voice.
WHA|3|Acronym for World Health Assembly
WIL|2|Casual texting shorthand meaning 'going to' or 'shall'
WIS|5|An archaic term meaning to know or be aware.
WOE|2|Great sorrow or distress.
WTO|3|An international trade organization.
XML|3|Markup language used to store and transport structured data
YEE|2|Old West interjection of excitement, often paired with 'haw'
YEH|2|Informal spelling of the word for 'yes'
ZEE|2|the American name for the alphabet's final letter
ABBY|1|A common female name.
ABEL|2|In the Bible, the second son of Adam and Eve
ABLE|2|Having the skill or power needed to do something
ACID|3|A sour chemical substance with a pH below seven
ACNE|2|A skin condition causing spots and pimples, common in teenagers
ACRE|2|A unit of land area equal to 4,840 square yards
ACTS|2|Performs on a stage, or takes action
ADAM|2|The first man in the biblical creation story
ADDS|2|Combines numbers together to find a total
ADHD|3|A neurodevelopmental condition marked by inattention and hyperactivity (abbr.)
AGED|2|Having grown old over the years
AGES|3|Very long periods of time
AHHH|2|An exclamation expressing sudden realization or relief
AIDE|2|A person who acts as an assistant to someone important.
AIDS|2|Gives help or assistance to
AIMS|2|Goals or objectives one hopes to achieve
AIRS|2|Pretentious, affected manners meant to impress others
AJAX|3|Web technique for exchanging data with a server without reloading the page
AKIN|2|Of similar nature or character
ALAN|2|A masculine given name of Breton origin
ALAS|1|An exclamation expressing grief or regret
ALEC|2|A short, informal form of the name Alexander
ALEX|3|Longtime game-show host Trebek, by his first name
ALLY|2|Partner
ALMA|2|A common female name.
ALOT|3|Considerably.
ALPS|3|A major mountain range in Europe.
ALSO|2|In addition; as well
ALTO|2|A low female or high male singing voice
AMEN|1|Word spoken to express agreement at the end of a prayer.
AMID|2|Surrounded by; in the middle of
AMMO|1|Bullets or shells for a weapon, informally
AMOS|2|A common male given name
ANAL|2|Relating to the anus
ANDY|2|A familiar short form of the name Andrew
ANNA|5|Former monetary unit of India, one-sixteenth of a rupee
ANNE|3|Queen who reigned over Britain in the early 18th century
ANTI|3|Prefix meaning against or in opposition
ANTS|1|Small insects that live in highly organized colonies
APEX|2|The highest point or peak of something
APPS|2|Small software programs run on a phone or tablet
ARAB|3|Member of a Semitic people of the Middle East
ARCH|2|a curved structure spanning an opening.
AREA|2|A particular region or extent of space
ARMS|2|Weapons collectively
ARMY|1|A nation's organized land military force
ARSE|2|A colloquial term for the buttocks.
ARTS|2|Creative pursuits such as painting, music, and theater
ASAP|2|An abbreviation meaning 'as soon as possible'.
ASIA|1|The world's largest continent
ASKS|2|Requests information or a favor
ATOM|2|The smallest unit of matter that retains an element's properties
ATOP|2|Located above or upon something
AUDI|2|German luxury car brand with a four-ring emblem.
AUNT|1|Your mother's or father's sister
AURA|2|A distinctive atmosphere surrounding a person or place
AUTO|2|A motor vehicle, informally
AVID|2|Showing great enthusiasm or eagerness for something
AVIV|3|Israel's largest metropolitan city, second only to Jerusalem in population
AWAY|2|To or at a distance from a place
AXIS|3|an imaginary line around which an object rotates.
AXLE|2|A rod on which a wheel rotates
BABA|4|A term of endearment for a father
BABE|2|A very young child; an infant
BABY|1|A very young child who cannot yet walk or talk
BACH|2|a Baroque composer known for organ and choral masterworks
BACK|2|The rear part of the human body, behind the chest
BAGS|1|Containers of paper, plastic, or cloth for carrying things
BAIL|3|To release someone from custody.
BAIT|2|Food used to attract fish or animals for capture.
BAKE|1|To cook food using dry heat in an oven
BALD|1|Having no hair on the head
BALE|2|A large bundle of material bound tightly together
BALI|2|An Indonesian island famous for its beaches and temples.
BALL|1|Round object used in many sports
BAND|2|A group of musicians who play together
BANG|1|A sudden loud noise
BANK|1|An institution that holds and lends money
BANS|2|Officially forbids something by law or rule.
BARE|2|Not covered, clothed, or concealed
BARK|2|The sharp, loud cry made by a dog.
BARN|1|A large building for storing farm animals.
BARR|3|Surname of former U.S. Attorney General William ___
BARS|2|Long rigid pieces of metal, or places that serve drinks
BART|3|San Francisco's rail transit system, familiarly
BASE|2|The lowest part on which something rests
BASH|2|To strike something with a heavy, forceful blow.
BASS|2|The lowest range of musical pitch
BATH|1|A tub for washing the body, or the act of washing in it
BATS|2|Nocturnal flying mammals that navigate using echolocation.
BEAM|2|A long, sturdy length of timber or metal used to bear weight
BEAN|1|A seed used as food.
BEAR|2|A large heavy mammal with thick fur and claws
BEAT|2|To strike repeatedly, or a steady rhythmic pulse
BEAU|3|A man who is the romantic partner of a woman.
BECK|3|A summoning gesture, as in a common idiom with 'call'
BEDS|1|Pieces of furniture for sleeping (plural)
BEEF|1|The meat of a cow
BEEN|3|Past participle of 'to be'
BEER|1|An alcoholic drink brewed from malt and hops
BEES|1|Insects known for producing honey.
BELL|1|A hollow metal object that rings when struck
BELT|1|Strap worn around the waist
BEND|2|To force something into a curved or angled shape
BENT|2|Not straight; curved.
BENZ|2|a well-known German car manufacturer
BERT|3|Ernie's grumpy, unibrowed roommate on a classic children's TV show
BEST|2|Of the highest quality.
BETA|2|The second letter of the Greek alphabet
BETH|1|A common short form of a longer feminine given name
BETS|2|Sums of money staked on the outcome of an uncertain event.
BIAS|2|Unfair leaning for or against a person or thing
BIDS|2|Formal offers of a price one will pay or accept
BIKE|1|A two-wheeled vehicle driven by pedals
BILL|2|A statement of money owed for goods or services
BIND|1|To tie or fasten tightly together
BING|2|Microsoft's web search engine
BIRD|1|A feathered animal that usually flies
BITE|2|A small mouthful, or a wound made by teeth
BITS|1|Small pieces or fragments of something
BLAH|2|Word used to express boredom or dismissiveness
BLEW|2|Past tense of the verb meaning to move air
BLOC|4|A group of countries or parties with common interests.
BLOG|2|A regularly updated personal website of posts
BLOW|2|To send out a current of air from the mouth
BLUE|1|The color of a clear daytime sky
BLUR|3|To make unclear or indistinct.
BLVD|2|An abbreviation for boulevard.
BOAT|1|A small vessel for travelling on water
BODY|2|The whole physical structure of a person or animal
BOIL|1|To heat a liquid until it bubbles
BOLD|2|Showing a willingness to take risks; confident and daring
BOLT|2|A metal pin used for fastening.
BOMB|2|A device designed to detonate and cause damage
BOND|3|A close connection between people
BONE|1|A hard part making up the skeleton
BONG|2|A deep, resonant ringing sound, like a large bell
BOOK|1|A set of printed pages bound together for reading
BOOM|2|A deep, resonant sound
BOOT|1|A sturdy shoe covering the foot and ankle
BORE|2|To make someone feel weary and uninterested.
BORN|2|Brought into existence through birth
BOSS|1|The person in charge who gives the orders at work
BOTH|1|The two together.
BOUT|3|A short spell of illness or activity; a boxing match
BOWL|1|A round, deep dish for food or liquid
BOWS|1|Decorative knots with two loops, often used on gifts
BOYD|3|A surname of Scottish origin, also used as a male first name
BOYS|1|Young males, not yet grown to adulthood
BRAD|3|A thin nail with a small head, used in finishing carpentry
BRAG|2|To speak with excessive pride about oneself
BRED|2|Raised animals or plants to produce offspring with particular traits
BREW|2|To make a drink such as tea or beer by soaking or boiling
BRIT|1|Informal term for a person from the United Kingdom
BROS|2|Informal term for close male friends or brothers
BROW|1|The forehead or area above the eyes.
BRUH|2|Informal slang term for a close friend, used to express disbelief or emphasis
BUCK|2|A male deer.
BUDS|2|Small swellings on a plant that develop into leaves or flowers
BUFF|3|a person who is very interested in a particular subject
BUGS|1|Insects or small creepy-crawlies.
BULB|2|The glass part of a lamp that glows when electric current passes through it.
BULK|3|The large size or mass of something
BULL|1|Adult male of domestic cattle
BUMP|2|To hit or knock against something.
BURN|2|To be consumed or damaged by fire
BURY|1|To place a body or object in the ground and cover it.
BUSH|1|A low woody plant smaller than a tree
BUST|3|To break open or apart.
BUSY|2|Having a great deal to do; fully occupied
BUTT|3|The thicker, blunt end of a tool or weapon
BUYS|1|Obtains something in exchange for money.
BUZZ|2|A low, continuous humming sound
CAFE|1|Small establishment serving coffee and light meals
CAGE|2|An enclosure of bars or wire for keeping animals or birds
CAIN|3|A biblical figure known for committing the first murder.
CAKE|1|A sweet baked dessert made from flour and sugar
CALF|1|The young of a cow
CALL|2|To telephone someone
CALM|2|Free from agitation, nervousness, or strong emotion
CAME|2|Past tense of moving toward a place
CAMP|2|A temporary site for outdoor lodging in tents
CANE|1|A stick used for support while walking
CANS|1|Metal containers used to store food or drinks
CANT|4|Hypocritical or insincere talk, often of a pious kind
CAPE|3|A sleeveless garment draped over the shoulders
CAPS|2|Soft flat head coverings, often with a peak
CAPT|2|Abbreviated title for a ship's or army company's commanding officer
CARD|1|One of fifty-two in a standard playing deck
CARE|2|The provision of what is needed for someone's health, welfare, or protection
CARL|2|Common male given name, the English cognate of Charles
CARR|3|A common English and Irish surname.
CARS|1|Road vehicles powered by an engine
CART|2|A vehicle for carrying goods.
CASA|1|Spanish word for house.
CASE|2|An instance or example of a particular situation
CASH|1|Money in the form of coins and banknotes
CASS|2|Common nickname for a Greek mythological seer whose prophecies went unheeded
CAST|2|The group of actors in a play or film
CATS|1|Small domesticated feline pets
CAVE|1|A natural underground hollow large enough to enter
CCTV|1|A network of cameras used to monitor a public or private space
CELL|3|The basic structural unit of all living organisms
CENT|2|One hundredth of a dollar
CHAD|2|A landlocked country in north-central Africa, capital N'Djamena.
CHAN|3|Common Cantonese surname
CHAP|1|A boy or young man.
CHAR|3|To burn something so its surface turns black
CHAT|1|An informal, friendly conversation
CHEF|2|A professional in charge of a kitchen
CHEM|2|Informal short form of the school subject involving elements and reactions
CHEN|3|A common surname of Chinese origin.
CHEW|1|To crush food repeatedly with the teeth before swallowing.
CHIC|2|Stylish and fashionable in appearance
CHIN|1|The lowermost part of the face.
CHIP|3|A small fragment, or a tiny silicon circuit in a computer
CHOI|2|A common Korean family name
CHOP|1|To cut something into pieces with a sharp blow.
CITE|2|To quote or refer to as evidence or example.
CITY|1|A large and important town
CLAD|3|Dressed or covered.
CLAN|2|A group of related families.
CLAP|1|To strike hands together
CLAW|2|A sharp, curved appendage found on the feet of animals.
CLAY|1|Stiff, sticky earth used to make pottery and bricks
CLIP|2|A short extracted portion of a film or video
CLUB|2|An association of people united by a shared interest or activity
CLUE|1|Hint that helps solve a mystery or puzzle
COAL|1|A black mineral burned to produce heat
COAT|1|An outer garment worn for warmth
COBB|2|___ salad, a dish of chopped chicken, bacon, egg, and blue cheese
COCA|4|A South American shrub whose leaves are chewed as a mild stimulant
COCO|3|Nickname of the legendary designer behind a famous perfume house
CODE|2|A system of symbols used to represent information secretly
CODY|2|Common American male first name, also a city in Wyoming.
COIL|2|A series of loops, as in a spring or wire
COIN|1|A small, flat, round piece of metal used as money
COKE|4|A solid carbon fuel produced by heating coal without air
COLA|1|A sweet, dark, carbonated soft drink.
COLD|1|Having a low temperature
COLE|4|A plant of the cabbage family, such as rape or kale
COLT|2|A young male horse.
COMA|2|A prolonged state of deep unconsciousness.
COMB|1|A toothed tool used to arrange or untangle hair
COME|2|To move toward a place.
COMP|3|A free ticket or service given as a courtesy
CONE|2|A solid shape that tapers from a circular base to a point
CONS|1|disadvantages weighed against the benefits of something
COOK|1|To prepare food by heating it
COOL|1|Moderately cold
COPE|2|To deal effectively with something difficult.
COPS|2|Slang for officers of the law
COPY|1|A reproduction made to match an original
CORD|1|A long, thin piece of material.
CORE|2|The central or innermost part of something
CORK|1|A lightweight material used to stopper bottles
CORN|1|A tall cereal plant bearing yellow kernels on a cob
CORP|4|Inc.
CORY|3|A common name, often used as a given name.
COST|1|The amount of money needed to buy something
COUP|3|A sudden, violent, and illegal seizure of power.
COVE|2|A small, sheltered bay along a coastline
COWS|1|Adult female cattle kept mainly for milk.
COZY|1|Warm, comfortable, and snug
CRAB|1|a shelled sea creature that walks sideways and has pincers
CRAP|3|Worthless or low-quality material
CREW|2|A group of people who work together, as on a ship or plane
CRIB|1|A small bed with barred sides for an infant
CROP|2|Plants grown and gathered as produce for food or profit
CROW|1|A large black bird known for its harsh cawing call
CRUZ|3|Spanish surname meaning 'cross,' borne by an Oscar-winning Madrid-born actress
CUBA|3|The largest Caribbean island nation, famed for cigars and salsa
CUBE|1|A three-dimensional shape with six equal square faces
CUBS|1|Young offspring of bears, lions, or wolves
CUES|2|Signals prompting an actor or performer to act
CUFF|2|The end of a sleeve that fits around the wrist
CULT|2|A group bound by intense, often unorthodox religious devotion
CUPS|1|Small vessels used for drinking
CURB|2|To restrain or keep something in check
CURE|1|A remedy that restores health
CURL|2|A spiral twist of hair or another material
CUTE|2|Charmingly attractive or pretty
CUTS|2|Reductions, as in budget or spending
DADS|1|Informal term for fathers
DALE|4|A valley, often in a rural area.
DAME|3|A title of respect for a woman, equivalent to 'Sir' for a man.
DAMN|3|To condemn to eternal punishment, or a mild oath of frustration
DAMP|1|Slightly wet
DAMS|2|Barriers built across rivers to hold back water
DANA|2|A common first name, often short for Danielle
DANE|1|A person from Denmark
DANG|2|A mild exclamation of surprise or annoyance
DARE|2|To have the boldness to attempt something risky
DARK|1|Having little or no light
DARN|2|To mend a hole in fabric.
DART|2|To move suddenly and quickly in a particular direction
DASH|2|To run or move quickly.
DATA|2|Facts and figures gathered for analysis
DATE|1|A particular day of the month or year.
DAVE|2|A common English male given name
DAWN|2|The first appearance of light in the morning sky
DAYS|2|Several twenty-four-hour periods, in the plural
DEAD|1|No longer alive
DEAF|2|Unable to hear.
DEAL|2|An agreement or bargain between parties
DEAN|2|The head of a university faculty or college
DEAR|3|Greatly loved or cherished; also meaning costly
DEBT|2|A sum of money owed to another
DECK|2|The flat floor area of a ship where one can walk
DEED|1|An action that is performed intentionally
DEEP|2|Extending far down from the top or surface
DEER|1|Hoofed woodland animal, the male of which grows antlers
DELL|3|A small wooded valley.
DEMO|2|A short trial version of a product or piece of software
DEMS|2|Informal short form for members of a major US political party
DENT|1|A small hollow left in a surface after a blow or impact.
DENY|2|To declare untrue, or to refuse to grant
DEPT|1|Abbreviated term for a division of a company, government, or university
DESK|1|A table designed for writing or working at
DIAL|1|To call a telephone number
DIAZ|5|A common surname of Spanish origin.
DICE|1|small cubes marked with numbers, used in games of chance
DIED|2|Ceased to live; passed away
DIES|1|Stops living
DIET|2|The kinds of food a person habitually eats
DIME|1|A small silver-colored American coin worth ten cents
DINE|1|To eat dinner
DING|1|A short ringing sound, like a bell
DIRE|2|Extremely serious or urgent
DIRT|2|Loose earth or ground-in grime
DISC|1|A flat, thin, round object such as a CD
DISH|2|Shallow container used for serving or cooking food
DISK|2|A flat, circular object.
DIVE|2|To plunge headfirst into water
DOCK|2|A structure where ships are loaded and unloaded.
DOCS|1|Informal short word for documents, or for physicians
DOES|2|To perform an action.
DOGS|1|Domestic canine companions
DOIN|4|Informal, clipped form of a present-participle verb meaning performing an action
DOLL|1|A child's toy modeled on a human figure
DOME|1|A rounded roof or ceiling shaped like half a sphere
DONE|2|Brought to completion; finished
DONG|3|The basic monetary unit of Vietnam
DONT|3|Short form of 'do not'
DOOM|2|Death, destruction, or some other terrible fate
DOOR|1|A hinged barrier at the entrance to a room or building
DOPE|2|Informal word for an illegal drug
DORM|1|A building where students live.
DOSE|2|A measured quantity of medicine taken at one time
DOTS|1|small round marks or points
DOUG|4|A common male first name.
DOVE|1|A bird often seen as a symbol of peace
DOWN|2|Toward a lower place.
DRAG|1|To pull something along the ground with effort
DRAW|1|To make a picture with a pen or pencil
DREW|2|Made a picture with a pencil, in the past
DRIP|2|To fall in drops.
DROP|2|To let something fall from your grasp
DRUG|2|A medicine or substance that affects the body
DRUM|1|A percussion instrument struck with sticks or hands
DUAL|3|Made up of two parts or having two aspects
DUCK|1|Web-footed waterbird with a broad, flat bill
DUCT|2|A tube or channel for conveying something.
DUDE|2|An informal word for a man or fellow
DUEL|2|A formal combat between two people, often with pistols or swords
DUKE|2|A nobleman of the highest hereditary rank
DULL|1|Lacking sharpness, brightness, or interest
DUMB|2|Lacking intelligence; foolish or silly
DUMP|2|To drop or discard something carelessly
DUNK|3|Basketball shot through the hoop
DUNN|4|A surname of Gaelic origin meaning 'brown' or 'dark'
DUST|2|Fine dry particles that settle on surfaces
DUTY|2|A moral or legal obligation
DVDS|2|Disc-shaped storage media once common for storing movies
EACH|2|Every one of a group
EARL|3|A British nobleman ranking below a marquess
EARN|2|To receive in return for work or service
EARS|1|The pair of organs used for hearing
EASE|2|Freedom from difficulty or great effort
EAST|1|The direction in which the sun rises
EASY|1|Achieved without great effort
EATS|1|Consumes food.
EBAY|2|An online auction and shopping website.
ECHO|2|A sound that is reflected off a surface.
EDDY|2|A small circular current that forms a whirlpool
EDEN|2|The biblical paradise garden of Adam and Eve
EDGE|2|The outer boundary or rim of a surface
EDIT|2|To correct and prepare text for publication
EGGS|1|Oval objects laid by birds that hold developing young
ELLA|1|A short, popular female first name
ELSE|3|In addition; besides what has been mentioned
EMMA|2|A common female first name, and the title of a Jane Austen novel
EMMY|2|An award given for excellence in television
ENDS|2|Brings to a conclusion
ENVY|2|A feeling of discontented longing for another's advantages
EPIC|2|A long poem recounting heroic deeds and adventures
ERIC|1|A common man's first name
ERIE|3|A large lake in North America.
ERIK|2|A common Scandinavian male given name
ERIN|2|A common female given name of Irish origin
ESPN|2|American sports television network, by its initials
EURO|2|Money spent in France, Germany, and Spain alike
EVAN|2|A male given name of Welsh origin
EVEN|3|Flat and smooth; or divisible by two
EVER|2|At any time at all
EVIL|2|Profoundly immoral and wicked
EXAM|1|A formal test of knowledge or ability
EXIT|1|A way out of a building or space
EXPO|1|A large public exhibition, often of trade or technology
EYED|2|To look at someone or something in a particular way.
EYES|1|The organs of sight, considered as a pair
EZRA|3|Male first name shared by a modernist poet Pound and a biblical scribe
FACE|1|The front part of a person's head
FACT|2|Something known to be true or to have actually happened
FADE|1|To gradually lose color or brightness
FAIL|1|To be unsuccessful in an attempt
FAIR|2|Treating everyone equally and without bias
FAKE|2|Not genuine; made to deceive
FALL|2|To drop suddenly toward the ground
FAME|2|The condition of being widely known and celebrated
FANS|2|Enthusiastic admirers of a person, team, or pastime
FARE|1|The price charged for a journey on public transport
FARM|1|Land used for growing crops or raising animals
FART|1|A release of gas from the digestive system.
FAST|1|Moving or able to move at high speed
FATE|3|The course of events held to be beyond human control
FATS|2|Substances that provide energy and are found in food.
FAUX|2|Not genuine; imitation.
FEAR|1|An unpleasant emotion caused by the threat of danger
FEAT|3|An achievement that requires great courage, skill, or strength.
FEDS|2|Informal term for federal law enforcement agents
FEED|1|To give food to a person or animal
FEEL|2|To perceive by touch
FEES|2|Amounts of money paid for services or membership
FEET|1|The body parts at the ends of your legs
FELL|2|Dropped suddenly to the ground, in the past
FELT|2|Experienced a sensation or emotion (past tense)
FEST|2|An informal, lively gathering or celebration
FEUD|2|A prolonged, bitter quarrel between two parties
FIAT|3|An official order given by someone in authority
FIFA|2|The international governing body of association football
FIJI|2|An island country in the South Pacific.
FILE|2|Folder or collection of related documents
FILL|1|To make completely full
FILM|1|A story told through moving pictures shown at a cinema
FIND|2|To discover something.
FINE|2|Of high quality; very good
FINN|2|A native or inhabitant of a Nordic country whose capital is Helsinki
FIRE|2|Combustion that produces heat, light, and flames.
FIRM|2|Solid and resistant to pressure
FISH|1|A cold-blooded water animal that breathes through gills
FIST|1|A hand with fingers tightly curled into the palm
FITS|3|Sudden short bursts of activity or emotion
FIVE|1|The number that comes after four
FLAG|1|A piece of cloth used as a national or signaling emblem
FLAP|2|A flat piece attached at one edge, that hinges or hangs loosely
FLAT|1|Having a level, even surface
FLAW|2|A defect or imperfection.
FLED|3|Ran away from danger, in the past
FLEE|1|To run away from danger
FLEW|2|Traveled through the air, in the past
FLEX|2|To bend a limb or joint, or to show off assertively (slang)
FLIP|2|To turn over quickly with a sudden movement
FLOP|2|To fail completely.
FLOW|2|The steady, continuous movement of a liquid
FLUX|2|A state of continuous change.
FOAM|1|A mass of tiny bubbles formed on a liquid's surface
FOIL|1|Thin, flexible sheet of metal used for wrapping food
FOLD|2|To bend something over on itself
FOLK|2|Ordinary people, especially of a community
FOND|2|Having strong affection or liking for something
FONT|2|A particular style or set of printed or displayed type
FOOD|1|Anything eaten to provide nourishment
FOOL|1|A silly or unwise person
FOOT|1|The body part at the end of the leg
FORD|3|A shallow spot where a river can be waded across
FORE|3|Situated at or toward the front part of something
FORK|1|A utensil with prongs used for eating.
FORM|2|The shape or structure of something.
FORT|3|Stronghold
FOUL|2|Offensive to the senses; disgusting
FOUR|1|The whole number that comes after three
FREE|1|Available without any charge
FROG|1|A small tailless amphibian known for jumping and croaking
FROM|2|Preposition indicating origin or a starting point
FUEL|2|Material burned to produce heat or power
FULL|1|Containing as much as possible; holding no more space
FUND|2|A sum of money set aside for a purpose
FUNK|2|A rhythmic dance-music style built on strong bass grooves and syncopation
FURY|2|Wild or fierce anger
FUSE|2|A safety device that breaks an electrical circuit when overloaded
FUSS|1|Unnecessary or excessive excitement or worry over a trivial matter
GAGA|3|Extremely enthusiastic or excited.
GAIL|2|A female first name, a homophone of a strong windstorm
GAIN|2|To obtain or acquire something of value
GALA|1|A festive public celebration or entertainment event
GALE|2|A very strong wind, more powerful than an ordinary storm
GAME|2|An activity with rules for play
GANG|2|An organized group of criminals
GAPS|1|Empty spaces or breaks between things
GARY|2|A traditional masculine given name
GATE|2|A hinged barrier set in a fence or wall
GAVE|2|Handed something over to another in the past
GAYS|2|People who are attracted to others of the same sex
GAZA|2|A Palestinian territory on the Mediterranean coast
GAZE|1|To look steadily and intently at something
GEAR|2|The equipment needed for a particular activity
GEEK|1|A person with an excessive enthusiasm for a particular subject.
GEMS|1|Precious or semi-precious stones, cut and polished
GENE|3|A unit of heredity passed from parent to offspring
GETS|2|Obtains or receives, in the third person
GIFT|1|Something given freely to another, often to celebrate an occasion
GIGS|2|Short-term jobs or performances.
GILL|2|The respiratory organ of a fish
GINA|2|A common feminine given name, sometimes short for Virginia
GIRL|1|A female child
GIVE|2|To present something to someone
GLAD|1|Feeling pleased and contented
GLEE|1|Great joy or delight, often at someone else's misfortune
GLEN|3|A narrow valley, especially in Scotland
GLOW|1|a soft, steady light given off by something warm
GLUE|1|A sticky substance used for joining things together
GOAL|1|An aim or desired result
GOAT|2|A domesticated animal often raised for its milk.
GODS|3|Supernatural beings worshipped as ruling over nature
GOES|2|Moves or travels, in the third-person singular.
GOIN|3|Casual, dropped-g way to say someone is currently traveling or departing
GOLD|1|A precious yellow metal prized for jewelry and coins
GOLF|2|A sport played with clubs and a small ball on a course of holes
GONE|2|No longer present or available
GOOD|1|Of a high standard or quality
GORE|2|Blood that has been shed, especially from a violent wound
GOSH|1|Mild exclamation of surprise or amazement
GOVT|2|Common abbreviation for the authority that governs a state or country
GOWN|1|A long, flowing garment, especially worn on formal occasions
GRAB|2|Seize suddenly with the hand
GRAD|2|A person who has completed a degree.
GRAM|1|A small metric unit of mass, roughly the weight of a paperclip
GRAY|1|The color between black and white
GREG|2|A common short first name for a man
GREW|2|Increased in size or amount over time
GREY|1|A colour midway between black and white
GRID|2|A network of evenly spaced horizontal and vertical lines
GRIM|1|Bleak, harsh, or forbidding
GRIN|2|To smile broadly.
GRIP|2|A firm hold or grasp on something
GROW|1|To increase in size or amount over time
GULF|2|Large coastal inlet of an ocean reaching into the land
GUNS|1|Weapons that fire bullets
GURU|2|A spiritual teacher, especially in Hinduism or Sikhism
GUTS|2|Courage and determination in a difficult situation
GUYS|2|An informal way to address a group of people
GWEN|2|A short, common Welsh female first name
HACK|3|Break into a computer system illegally
HAHA|2|Written representation of laughter
HAIL|2|Small pellets of ice that fall as precipitation during storms
HAIR|1|Strands that grow from the scalp
HALE|4|Strong and healthy.
HALF|1|One of two equal parts of something
HALL|2|A large room or building used for public gatherings
HALO|2|A ring of light depicted around the head of a holy figure
HALT|1|A stop or pause in movement or activity
HAND|1|The body part at the end of the arm, with four fingers and a thumb
HANG|2|To suspend so as to hold from above
HANK|2|A common nickname for the name Henry
HANS|2|A common male given name of German origin
HARD|2|Solid and firm to the touch; not soft
HARE|2|A fast, long-eared mammal larger than a rabbit
HARM|2|Physical injury or other hurt caused to someone
HART|3|A male deer, especially a stag.
HASH|2|A dish made of chopped meat, potatoes, and onions fried together
HATE|2|To dislike intensely
HATH|2|Archaic third-person singular form of 'have'
HATS|2|Items worn on the head.
HAUL|2|A quantity of something obtained, especially by illicit means.
HAVE|2|To own or possess
HAWK|1|A bird of prey with sharp talons
HEAD|2|The part of the body that contains the brain
HEAL|2|Cure
HEAP|2|A collection of things piled up.
HEAR|1|To perceive sound with the ears
HEAT|2|The quality of being hot; high temperature
HECK|1|A mild exclamation of surprise or annoyance.
HEEL|1|The back part of the human foot
HEIR|2|A person entitled to inherit property or a title
HELD|2|Kept or grasped firmly in the past
HELL|2|A place of punishment for the wicked in the afterlife
HELM|2|The wheel or tiller used to steer a ship
HELP|2|To assist someone.
HERB|1|A plant used for flavoring, medicine, or scent
HERD|1|A large group of animals that live and feed together
HERE|1|In this place.
HERO|2|A person admired for brave or noble deeds
HERS|1|Belonging to her.
HIDE|1|To put or keep something out of sight
HIGH|2|At a great vertical distance.
HIKE|1|A long walk, especially in the countryside or mountains
HILL|1|A raised area of land, lower than a mountain
HIND|2|Situated at the back, especially of an animal's legs
HINT|2|A slight, indirect indication or helpful pointer
HIPS|2|Bony protrusions on either side of the waist
HIRE|2|To take someone on for paid work
HITS|1|Strikes something with force
HIVE|1|A structure in which a colony of bees lives and stores honey
HMMM|2|An expression of thinking or pondering.
HOAX|2|A deception designed to trick people into believing something false.
HOLD|2|To grasp and keep in one's hand
HOLE|1|A hollow opening in a solid surface
HOLT|4|The den or lair of an otter
HOLY|1|Regarded as divine or set apart for religion
HOME|1|The place where one lives.
HOMO|4|Prefix meaning 'same' in scientific terms.
HONG|4|A foreign trading house or warehouse in old China
HOOD|1|A covering for the head attached to a coat or jacket
HOOK|2|A curved piece of metal for catching or hanging things
HOPE|2|A feeling of expectation that something desired will happen
HORN|1|A hard, pointed growth on an animal's head
HOSE|1|A flexible tube used to convey water
HOST|2|One who entertains guests or presents a show
HOUR|1|A period of sixty minutes
HOWE|3|Surname of the Canadian ice hockey legend nicknamed 'Mr. Hockey'
HTML|1|The standard markup language for creating web pages
HTTP|2|The prefix that begins most website addresses
HUGE|1|Extremely large in size or amount
HUGH|5|A common male first name.
HUGO|2|A common male first name of French origin
HUGS|1|Warm, affectionate embraces
HULK|2|A large, bulky person, animal, or object
HULL|2|The main body or frame of a ship
HUNG|2|Suspended something from above; the past tense of hang
HUNT|2|To chase and kill wild animals for food or sport
HURT|2|To cause physical pain or damage to someone
HUSH|2|A state of complete silence or calm
HYDE|3|London park famous for its Speaker's Corner
HYMN|2|A religious song or poem of praise.
HYPE|2|Exaggerated publicity or promotion.
ICED|2|Made very cold by chilling, as a drink
ICON|2|A small clickable image on a computer screen
IDEA|1|A thought or plan formed in the mind
IDLE|1|Not active or in use; lazy
IDOL|2|An object of extreme devotion or worship
IEEE|3|Abbreviation for a major professional association of electrical engineers
IKEA|3|A Swedish company famous for flat-pack furniture
IMAM|2|A Muslim worship leader who leads prayers in a mosque
INCH|2|A small unit of length, one twelfth of a foot
INDY|2|A term often used to describe independent films.
INFO|2|Casual word for facts and details about something
INTO|2|Expressing movement toward the inside of something
IONS|3|Charged particles created when atoms gain or lose electrons
IOWA|3|Midwestern U.S. state famous for its cornfields, capital Des Moines
IPAD|2|A popular tablet computer made by Apple
IPOD|3|A now-discontinued Apple portable music player
IRAN|2|Middle Eastern country with Tehran as its capital
IRAQ|2|Middle Eastern nation whose capital is Baghdad
IRIS|2|The colored part of the eye surrounding the pupil
IRON|2|A strong magnetic metal used to make steel
ISIS|3|Ancient Egyptian goddess of motherhood and magic
ISLE|2|A small island, often used in poetic or literary contexts
ISNT|1|Contraction meaning 'is not'
ITEM|1|A single article or unit on a list
IVAN|2|A Russian equivalent of the name John
JACK|2|A device used to lift a heavy object such as a car
JADE|2|A hard, often green gemstone used in carvings and jewelry
JAIL|1|A place where people are confined as punishment
JAKE|2|A familiar short form of the name Jacob
JANE|2|A common female first name; the heroine of an Eyre novel
JAVA|2|A type of coffee.
JAWS|1|The lower and upper bony structures in the mouth.
JAYS|2|Colorful, noisy birds related to crows and magpies
JAZZ|2|An improvisational music genre born in New Orleans
JEAN|4|A durable twilled cotton fabric used for casual trousers
JEDI|2|A guardian of peace wielding a lightsaber in a famous sci-fi saga
JEEP|1|A rugged four-wheel-drive vehicle often used off-road
JEEZ|1|An exclamation of surprise, frustration, or mild annoyance
JEFF|2|A common informal male first name
JERK|3|To move suddenly.
JESS|4|A short strap fastened around a trained hawk's leg
JETS|2|Fast aircraft driven by turbine engines
JEWS|2|People who practice Judaism, considered collectively
JILL|2|A common female first name, often paired with 'Jack' in rhymes
JOAN|2|A common female given name.
JOBS|2|Paid positions of regular employment
JOEL|1|A male given name.
JOEY|2|A baby kangaroo
JOHN|4|Informal term for a toilet or lavatory
JOIN|1|To link or fasten two things together
JOKE|1|Something said to make people laugh
JONG|4|Surname of the American author who wrote 'Fear of Flying'.
JOSE|2|Common Spanish male given name
JOSH|3|To tease someone in a playful way
JUAN|4|Spanish given name equivalent to the English John
JUDE|2|A short male given name, also a brief New Testament epistle
JUDY|1|A popular female given name
JULY|1|The seventh month of the year
JUMP|1|To push oneself off the ground with the legs
JUNE|1|The sixth month of the year
JUNG|3|Swiss psychiatrist who founded analytical psychology
JUNK|1|Old or discarded items.
JURY|2|A group sworn to deliver a verdict in a court case
JUST|3|Exactly, or only a moment ago
KANE|2|A common Irish surname, also used as a given name
KANG|3|A surname of Korean origin.
KARA|2|A female given name.
KARL|5|A common male given name.
KATE|2|Familiar short form of the name Katherine
KATY|2|A female given name, a diminutive of Katherine
KEEN|2|Eager and full of enthusiasm
KEEP|2|To retain possession of something
KENT|2|Surname of Superman's earthly family
KEPT|2|Retained possession of; did not give away
KERR|3|Surname of NBA coach Steve, or actress Deborah
KEYS|2|Small shaped metal objects used to open locks
KHAN|3|Historic title for a Mongol or Central Asian ruler
KICK|1|To strike out with the foot
KIDS|1|Young children, informally
KIEV|2|The capital city of Ukraine
KILL|1|To put to death
KIND|2|Considerate, generous, and friendly toward others
KING|1|A male ruler of a country, usually by inheritance
KIRK|2|A Scottish word for church
KISS|1|To touch with the lips as a sign of love or greeting
KITE|1|A lightweight object flown in the wind.
KITS|1|Sets of parts, tools, or equipment for assembly or use
KNEE|1|The joint connecting the thigh and the lower leg
KNEW|2|Had awareness or understanding of, in the past
KNIT|1|To make fabric by looping yarn together with needles
KNOB|1|A rounded handle used to open a door or drawer
KNOT|2|A fastening made by looping and tightening rope or string
KNOW|2|To be aware of something through observation or information
KNOX|3|US Army installation in Kentucky famous for storing gold reserves
KOBE|2|A Japanese port city famed for its premium marbled beef
KOCH|3|Surname of a famous NYC mayor, Ed
KONG|4|Legendary colossal movie ape, paired with the title 'King'
KRIS|2|A short male first name, sometimes shortened from Christopher
KUNG|4|A style of martial arts originating from China.
KURT|3|First name shared by author Vonnegut and singer Cobain
KYLE|3|A common masculine first name
LABS|1|Rooms or buildings equipped for scientific research
LACE|2|A delicate fabric made of a patterned, open weave of thread
LACK|2|A deficiency or absence of something needed
LADS|2|Informal British term for boys or young men
LADY|1|A polite or formal term for a woman
LAID|3|Set down gently; past tense of a verb meaning to place
LAKE|1|Large body of water surrounded by land
LAMA|2|A Tibetan Buddhist spiritual teacher or monk
LAMB|2|A young sheep.
LAME|2|Unable to walk normally due to an injury to the leg or foot
LAMP|1|Device that gives out light
LANA|3|First name of a popular American singer known for melancholic pop ballads.
LAND|1|The solid part of the earth's surface.
LANE|2|Narrow road or marked division of a track
LANG|3|A common German and Scandinavian surname meaning 'long'
LAPS|2|Circuits of a racetrack completed during a race
LARA|1|A female given name.
LAST|2|Coming after all others in time or order.
LATE|1|Arriving after the expected time
LAVA|1|Molten rock ejected by an erupting volcano.
LAWN|1|An area of grass in a yard.
LAWS|2|Rules created and enforced by a government
LAYS|3|Puts something down in a flat position (third person singular)
LAZY|1|Unwilling to work or exert energy
LEAD|2|To guide others or be out in front
LEAF|1|A flat green part growing from the stem of a plant
LEAH|1|A popular English female first name of biblical origin
LEAK|2|An unintended escape of liquid or gas through a gap
LEAN|2|To bend or incline from an upright position
LEAP|1|To jump or spring a long distance, up, or over something
LEFT|2|On the side opposite to the right
LEGO|1|A Danish brand of interlocking plastic building bricks
LEGS|1|The limbs used for standing and walking
LENA|3|A major river flowing through eastern Siberia into the Arctic Ocean
LEND|1|To give something temporarily, expecting it back
LENS|2|A curved piece of glass that focuses light
LENT|1|Gave something to someone for temporary use
LEON|3|A city in north-central Spain, or a common male first name
LESS|2|A smaller amount
LEST|4|For fear that.
LETS|2|Allows or gives permission for something to happen
LEVI|1|A common male given name.
LEVY|2|A tax or other charge imposed by authority
LGBT|2|An acronym for lesbian, gay, bisexual, and transgender.
LIAM|1|Common given name in Ireland
LIAR|3|One who tells falsehoods.
LICK|1|To pass the tongue over something
LIED|2|Told a deliberate untruth
LIES|2|Deliberate untrue statements
LIFE|1|The condition that distinguishes animals and plants.
LIFT|1|To raise something to a higher position
LIGA|3|Spain's premier professional football division
LIKE|3|To find agreeable, or having a similar quality to
LILY|1|A tall flowering plant with large, often trumpet-shaped blooms
LIMA|2|The capital city of Peru.
LIMB|1|An arm, leg, or tree branch
LIME|1|A small green citrus fruit
LINE|1|A long thin mark
LING|4|A long-bodied edible fish related to cod
LINK|2|A single ring forming part of a chain
LION|1|Large African big cat known as the king of beasts
LIPS|2|The two fleshy edges of the mouth
LISA|1|A common female given name
LIST|2|A number of items written down one after another
LITE|2|Describing a version of a product with fewer calories or reduced features.
LIVE|3|Reside
LMAO|3|Internet abbreviation expressing helpless laughter
LOAD|2|A heavy weight or quantity carried or supported
LOAF|1|A single shaped and baked mass of bread
LOAN|2|A sum of money borrowed and repaid, often with interest
LOCK|2|A device for keeping a door or container securely closed
LOFT|2|A room or space under a roof, used for storage or living
LOGO|2|Symbol or design that identifies a company or brand
LOGS|1|Sections of a felled tree trunk
LOIS|3|A female first name associated with a famous comic-book reporter
LONE|1|without others; solitary
LONG|2|Measuring a great distance from end to end.
LOOK|1|To direct one's gaze in a specified direction.
LOOP|2|A shape made by a line or curve that crosses itself
LOOT|2|Valuables seized by force, especially during war or crime
LORD|2|A titled nobleman, master, or ruler
LORE|3|Traditional knowledge or beliefs.
LOSE|2|To fail to keep or be deprived of something
LOSS|2|The state of no longer having something
LOST|2|Unable to find one's way
LOTS|2|Great amounts or large numbers
LOUD|2|Producing a great amount of sound
LOVE|1|An intense feeling of deep affection.
LOWE|5|A surname that may refer to various notable individuals.
LUCK|2|Success or failure brought by chance rather than effort
LUCY|3|Female given name; also the nickname of a famous 3.2-million-year-old fossil
LUIS|2|A common male name in Spanish-speaking countries.
LUKE|3|A male given name; also one of the four Gospel authors
LUMP|2|A compact mass of material with no definite shape.
LUNA|2|Latin word for the moon, often used as a given name
LUNG|2|One of the pair of organs used for breathing
LURE|2|Bait or something designed to tempt a person or animal
LUSH|2|Rich and abundant, often in reference to vegetation.
LUST|2|A strong feeling of desire, especially sexual desire
LYNN|2|A short female given name derived from Linda or Carolyn
LYON|3|A major city in east-central France on the Rhone River
MACK|3|British slang for a raincoat
MADE|1|Past tense of make.
MAID|1|A female domestic servant
MAIL|1|Letters and parcels sent through the post
MAIN|1|Chief in size or importance
MAKE|2|To build, form, or bring into being
MALE|2|Of the sex that fathers offspring
MALI|3|Landlocked West African country whose capital is Bamako
MALL|1|A large enclosed shopping centre
MAMA|1|Affectionate term for one's mother
MANN|3|German Nobel-winning novelist who wrote 'Death in Venice'.
MANS|3|Staffs or operates, as a post or station
MANY|1|A large number.
MAPS|1|Diagrams representing geographic areas
MARC|4|A term used in wine making to describe the solid remains after pressing.
MARE|2|An adult female horse.
MARK|2|A visible spot or impression on a surface
MARS|1|The red planet, fourth from the sun
MART|2|A place where goods are bought and sold
MARX|3|Surname of the philosopher who co-wrote The Communist Manifesto
MARY|3|Common female given name; in the Bible, the mother of Jesus
MASH|2|To crush something into a soft, pulpy mixture
MASK|1|A covering worn over part or all of the face
MASS|3|A large body of matter with no definite shape
MAST|2|A tall upright pole that supports a ship's sails
MATA|2|A Spanish and Filipino surname
MATE|2|A friend or partner
MATH|1|The study of numbers, quantities, and shapes
MATS|1|Flat pieces of material used on floors.
MATT|3|Having a dull, non-glossy finish
MAYA|1|A common female first name
MAYO|1|A creamy condiment made from egg yolk and oil, often shortened this way
MAZE|1|A complex network of paths designed to confuse those inside it
MEAL|1|Food eaten at one sitting, such as breakfast or dinner
MEAN|3|To intend to convey or refer to
MEAT|1|Animal flesh used as food
MEDS|2|Informal term for medications.
MEET|2|To come together with someone by arrangement or chance
MEGA|2|Extremely large or great.
MELT|1|To change from solid to liquid due to heat
MEME|2|an image, video, or idea that spreads rapidly online
MEMO|1|A short written note circulated in an office
MENU|1|A list of the dishes available in a restaurant
MERE|3|Nothing more than; only
MESA|1|An isolated flat-topped hill with steep sides
MESH|2|A material of woven or knitted strands with open spaces
MESS|2|A state of untidy disorder
META|2|Parent company of Facebook and Instagram
METH|2|A highly addictive stimulant drug used illegally as a street drug
METS|2|New York's National League baseball team
MICE|2|Small rodents with pointed snouts and long tails
MICK|2|An informal short form of the given name Michael
MIKE|1|a common male given name
MILD|2|Not severe, harsh, or extreme
MILE|1|A unit of distance equal to 5,280 feet
MILK|1|White liquid produced by cows and other mammals
MILL|2|A building or device for grinding grain into flour
MILO|5|A popular chocolate malt beverage.
MIND|2|The seat of thought, memory, and imagination
MINE|2|Underground excavation for extracting coal or ore
MING|3|Chinese dynasty famous for its blue-and-white porcelain
MINI|3|A very short skirt, informally
MINS|3|Unit of time equal to 60 seconds, abbreviated for short
MINT|1|An aromatic herb used in flavoring, or a place where coins are made
MISS|2|To fail to hit, reach, or catch something.
MIST|1|A thin fog formed by tiny water droplets in the air
MOCK|2|To tease or ridicule someone
MODE|2|A particular way or manner of doing something
MODI|3|Indian political leader who heads the BJP party
MOLD|3|A hollow container used to give shape to a molten or set material
MOLE|1|A small burrowing mammal with velvety fur
MOMS|1|Informal, plural term for mothers
MONA|3|First name of Leonardo da Vinci's famous painted lady
MONK|1|A man who lives in a religious community under vows
MONO|3|Common short name for the glandular fever illness
MOOD|2|A temporary state of mind or feeling
MOON|1|Earth's natural satellite, seen at night
MORE|3|A greater amount or degree
MOSS|1|A small, green, flowerless plant that grows in damp habitats
MOST|2|The greatest in number, amount, or degree
MOTH|1|A nocturnal flying insect related to the butterfly, often drawn to light
MOVE|1|Change position or location
MUCH|3|A large amount; to a great extent
MUSE|3|To ponder or think deeply.
MUSK|2|A strong, earthy scent used as a base note in many perfumes
MUST|2|Be obliged to
MUTE|2|Refraining from speech; silent
MYTH|2|A traditional story explaining natural or social phenomena
NAIL|1|A thin metal spike driven in to fasten wood
NAME|2|The word by which a person or thing is known
NANA|1|Informal term for one's grandmother
NANO|3|Prefix meaning one billionth
NASA|1|US agency responsible for space exploration
NASH|3|Mathematician known for his equilibrium concept in game theory, portrayed in 'A Beautiful Mind'
NATE|2|A short form of the name Nathan or Nathaniel
NATO|3|An intergovernmental military alliance.
NAVY|2|A nation's seagoing armed force
NAZI|2|Member of Hitler's fascist German party
NCAA|3|US governing body overseeing college sports championships
NEAL|3|A male given name, an alternate spelling of Neil
NEAR|2|At only a short distance away
NEAT|1|Clean and orderly.
NECK|1|The part of the body joining the head to the shoulders
NEED|1|Require something.
NEIL|3|First name of the astronaut who took a giant leap for mankind
NEON|2|A chemical element used in glowing signs
NERD|2|A person single-mindedly devoted to intellectual or technical pursuits
NESS|3|A headland or promontory.
NEST|1|A structure a bird builds to lay and hatch its eggs
NETS|1|Meshed devices used to catch fish or trap a ball
NEWS|1|Newly received information about recent events
NEXT|2|Following in time or order
NGOS|1|Non-governmental organizations
NICE|1|Pleasant, agreeable, or kind
NICK|2|A small cut or chip in a surface
NICO|3|A short male given name, often a diminutive of Nicholas
NIKE|2|Sportswear brand known for its swoosh logo
NILE|2|The longest river in Africa
NINA|2|A common girl's name of Spanish and Slavic origin
NINE|1|The number one more than eight
NOAH|1|Biblical figure who built an ark to survive the great flood
NODE|3|A point in a network where lines or paths intersect
NOEL|2|A word for Christmas, often sung in carols
NOIR|3|A dark, cynical style of crime fiction or film
NONE|2|Not any at all
NOON|1|Twelve o'clock in the daytime
NOPE|2|Casual, blunt word of refusal
NORA|3|A common female first name of Scandinavian origin.
NORM|2|A standard or pattern regarded as typical
NOSE|1|The facial feature used for smelling and breathing
NOTE|1|A short written record or message
NOUN|1|A part of speech that represents a person, place, or thing.
NOVA|3|A star that suddenly increases greatly in brightness
NSFW|4|Not safe for work; contains inappropriate content.
NUDE|2|Without clothing.
NULL|3|Having no legal or binding force; invalid.
NUMB|1|Lacking the ability to feel physical sensation
NUNS|2|Women belonging to a religious order, often living in a convent
NUTS|1|Hard-shelled seeds eaten as snacks
OAKS|2|Trees known for their strength and acorns.
OATH|2|A solemn formal promise, often sworn on something sacred
OBEY|1|To comply with an order or instruction
ODDS|2|The likelihood of an outcome, often given as a ratio
ODOR|1|A distinctive smell, especially an unpleasant one
OFFS|3|Slang: kills someone, third-person singular
OHIO|2|A Midwestern U.S. state with capital Columbus
OILS|1|Slippery liquids used for cooking or lubrication
OKAY|1|All right; satisfactory or acceptable
OLDS|3|A brand of automobiles.
OMAR|3|A common Arabic male given name meaning 'flourishing' or 'long-living'
ONCE|2|On a single occasion; one time only
ONES|3|Single units, as opposed to tens or hundreds
ONLY|2|And no one or nothing more besides
ONTO|3|Moving to a position on the top or surface of
OOPS|1|An exclamation of surprise or mild apology after a small mistake.
OPEN|1|Not closed, shut, or blocked off
ORAL|2|Spoken rather than written
OSLO|2|The capital city of Norway
OTTO|3|A German first name, as borne by several Holy Roman Emperors
OUCH|1|An exclamation of pain.
OURS|2|That which belongs to us
OUTS|2|In baseball, the retirements of a batter or base runner
OVAL|2|Having an elongated circular shape.
OVEN|1|Kitchen appliance for baking and roasting
OVER|3|Finished; at an end
OWED|2|Was under obligation to pay back
OWEN|3|A masculine given name of Welsh origin
OWES|1|Is under obligation to pay or repay someone
OWNS|2|Holds as personal property
PACE|3|The rate at which someone moves or things progress
PACK|2|To fill a bag or case with belongings for a trip
PACT|1|A formal agreement between two or more parties.
PADS|2|Cushioned protective coverings worn for support
PAGE|1|One side of a sheet in a book
PAID|2|Settled a bill or debt (past tense)
PAIN|2|An unpleasant physical sensation caused by injury or illness
PAIR|1|A set of two things used together
PALE|2|Lacking strong colour; light in shade
PALM|2|The inner surface of the hand between wrist and fingers
PALS|1|Close friends.
PANS|1|Shallow metal containers used for cooking
PAPA|1|An informal word for father
PARA|4|A prefix meaning 'beside' or 'beyond', found in many technical terms
PARK|1|A public green space kept for recreation
PART|2|A portion of a whole.
PASO|3|Spanish dance, often meaning 'step'
PASS|2|To move ahead of or go by something
PAST|2|The time that has gone before the present
PATH|1|A narrow track for walking
PAUL|2|A common male given name shared by a famous Beatle
PAWN|2|The least valuable piece in chess
PAYS|2|Hands over money for goods or work
PEAK|2|The pointed top of a mountain
PEAR|1|Round fruit with a sweet flavor
PEAS|1|Small round green seeds eaten as a vegetable
PEEK|1|To look quickly and often secretly
PEEL|1|To strip off the outer skin of a fruit or vegetable
PEER|2|To look closely or intently at something
PENN|2|Ivy League school located in Philadelphia, familiarly
PENS|1|Instruments used for writing with ink
PERU|1|A South American country home to Machu Picchu
PEST|2|A destructive insect or animal that damages crops or spreads disease
PETE|4|A familiar boy's name; think tennis's Sampras or basketball's Maravich
PETS|1|Tame animals kept at home for company
PHIL|3|Daytime TV personality McGraw, familiarly
PICK|1|To choose from a number of options
PICS|2|Informal word for photographs
PIER|1|A structure extending into the water for docking boats
PIES|1|Baked dishes typically filled with fruit or meat.
PIGS|1|Farm animals known for their snouts.
PIKE|3|A long-bodied predatory freshwater fish
PILE|1|A heap of things laid one on top of another
PILL|1|A small round mass of solid medicine.
PINE|2|Evergreen coniferous tree with needle-like leaves
PING|2|A short, high-pitched ringing sound
PINK|1|Pale red color
PINS|1|Small sharp metal fasteners used to hold fabric together
PINT|1|A unit of volume for beer or milk, half a quart.
PIPE|1|A tube for conveying water or gas
PITS|1|Holes or hollows in the ground or a surface
PITT|3|Surname of the actor who played Tyler Durden in Fight Club
PITY|2|A feeling of sorrow for someone else's misfortune.
PLAN|2|A detailed proposal for doing something
PLAY|2|Engage in an activity for enjoyment or recreation
PLEA|2|An urgent and emotional request
PLOT|2|The main sequence of events in a novel, film, or play
PLUG|2|The fitting on the end of a cable that joins to a socket
PLUM|1|A round, smooth-skinned fruit.
PLUS|2|The symbol indicating addition
POEM|1|A composition written in verse
POET|1|Writer of verse
POKE|2|To jab or prod with a finger.
POLE|2|A long, slender, rounded rod or post
POLL|3|A canvassing of opinions from a sample of people
POLO|2|A team sport played on horseback using mallets and a ball
POLY|3|A word-forming prefix meaning 'many' or 'much'
POND|1|A small body of still water.
PONY|1|A small breed of horse, often ridden by children
POOL|1|Tank of water built for swimming
POOP|1|Informal word for animal or human excrement.
POOR|1|Having little money
POPE|2|The head of the Roman Catholic Church
POPS|1|Bursts suddenly with a sharp sound
PORK|2|Meat from a pig.
PORN|3|Sexually explicit material intended to arouse
PORT|2|A coastal place where ships load and unload
POSE|2|To hold a particular position, as for a photograph
POST|3|An upright stake set firmly in the ground as a support
POTS|1|Round containers used for cooking, storage, or growing plants
POUR|1|To make a liquid flow from a container
PRAY|2|To address a deity in worship or supplication
PREP|1|To make ready in advance of something
PRES|2|Common abbreviation for the head of a country or company
PREY|2|An animal hunted for food.
PRIX|3|French word for 'price', familiar from motor racing and set-menu terms
PROF|2|A university teacher, informally
PROM|1|A formal high school dance
PROP|2|An object used to support something, or an item used on stage
PROS|2|The favorable points in an argument, or skilled professionals
PTSD|3|A psychological condition caused by exposure to a traumatic event
PUBS|1|Establishments serving alcoholic beverages.
PUCK|2|A hard rubber disc used in ice hockey
PUFF|1|To blow air into something.
PULL|2|To draw something toward oneself using force
PULP|1|The soft, fleshy part of a fruit or vegetable.
PUMP|2|A device for forcing liquid or gas through pipes
PUNK|2|A loud, fast, rebellious style of rock music from the mid-1970s
PUNT|2|To kick a dropped football before it touches the ground.
PURE|2|Free from contamination or mixture
PUSH|2|To press against something to move it away
PUTS|2|Moves something into a particular position
QUAD|2|Open square courtyard at a school or college
QUIT|1|To stop doing something or leave a job
QUIZ|1|A short test of knowledge, often given informally
RACE|1|A contest to see who is fastest
RACK|1|A framework used for holding, storing, or displaying objects
RAGE|2|Violent, uncontrollable anger
RAID|2|Sudden surprise attack by police or soldiers
RAIL|2|A bar fixed to give support or form a barrier
RAIN|1|Water falling from the clouds
RAMP|1|A sloped surface connecting two different levels
RAMS|3|Forcefully pushes or strikes something (third-person)
RAND|3|South Africa's official currency unit
RANG|2|Produced a clear resonant sound, in the past
RANK|2|A position within a hierarchy or scale of seniority
RANT|2|To speak or complain loudly and at length, often angrily.
RAPE|4|A bright-yellow Brassica grown for its oil-rich seed
RARE|2|Seldom occurring; not often found
RASH|2|Acting with excessive haste and without careful thought.
RATE|3|A measured quantity or frequency per unit of time
RATS|1|Long-tailed rodents commonly found in cities and sewers
RAVE|2|To talk with wild enthusiasm about something
RAYS|2|Lines of light or energy.
READ|2|To look at and take in the meaning of written words
REAL|2|Actually existing, not imagined or invented
REAP|2|To cut and gather a crop, or to receive a reward for effort
REAR|2|The hindmost part of something
REDS|4|Informal term for communists or communist sympathizers
REED|3|A tall grass with hollow stems that grows in wet ground
REEF|2|A ridge of rock, coral, or sand near the ocean's surface
REEL|2|A cylindrical device used to wind thread, film, or fishing line.
REFS|2|Officials who enforce the rules in a sports match.
REID|3|A common surname.
RELY|2|Depend on with confidence
RENO|3|A Nevada city nicknamed 'The Biggest Little City in the World'
RENT|2|A regular payment made for the use of property or land
REPS|2|Short for repetitions in exercise.
REST|2|A period of relaxation or freedom from activity.
RIBS|2|Curved bones forming the chest cage
RICE|1|A staple cereal grain eaten across much of the world
RICH|1|Having a great deal of wealth
RICK|4|A built-up stack of hay or straw in a field
RICO|4|A federal law aimed at combating organized crime.
RIDE|1|A journey in a vehicle or on an animal
RIFT|2|A crack or split, especially in the earth or in a relationship
RING|1|A circular band worn on the finger
RIOT|2|A violent public disturbance by an unruly crowd
RIPE|1|Fully developed and ready to be harvested or eaten.
RISE|2|To move upward or increase in level
RISK|2|Exposure to the chance of danger or loss
RITA|1|A short, common female first name
RITE|2|A ceremonial act, especially one of religious character
ROAD|1|A wide paved path for vehicles to travel on
ROAR|1|Loud, deep sound made by a lion
ROBE|1|A long loose garment, often worn after bathing or for ceremonies
ROCK|1|A hard solid mass of mineral matter
RODE|1|Traveled on a horse, bike, or bus (past tense)
RODS|2|long, thin, straight pieces.
ROLE|2|A character portrayed by an actor
ROLL|2|To move along by turning over and over
ROMA|2|The Italian name for the capital city of Italy
ROME|1|The capital city of Italy
ROOF|1|The structure forming the upper covering of a building
ROOM|2|An area within a building enclosed by walls
ROOT|2|The part of a plant that grows underground
ROPE|2|A strong, thick line made of twisted fibers or strands
RORY|3|An Irish and Scottish male given name
ROSA|2|A common Spanish and Italian female name meaning 'rose'
ROSE|1|A thorny flower often given on Valentine's Day
ROSS|4|A common surname; also the largest ice shelf in Antarctica
ROTH|5|a common surname; also a type of IRA.
ROWS|1|Lines of things or people arranged side by side
RUBY|2|A red gemstone.
RUDE|2|Showing a lack of good manners or respect
RUDY|2|Common nickname short for Rudolph
RUIN|2|To damage something so badly it cannot be repaired
RULE|1|A statement of what is allowed or required
RUNS|1|Moves swiftly on foot
RUSH|1|To move or act with urgent haste
RUSS|3|A short, informal version of a common English male first name
RUST|1|The reddish-brown coating that forms on iron exposed to moisture
RUTH|3|A book of the Hebrew Bible, also used as a woman's name
RYAN|3|Common given name shared by actors Gosling and Reynolds
SACK|1|A large bag made of cloth or paper
SAFE|1|Protected from harm or risk
SAGA|2|A long, involved story or series of events, often recounting heroic deeds.
SAGE|3|Having or showing wisdom from experience
SAID|2|Past tense of 'say'; uttered aloud
SAIL|1|To travel on water using a boat.
SAKE|3|Purpose or benefit of someone or something
SALE|2|The exchange of goods or services for money
SALT|2|White crystalline seasoning used to flavor food
SAME|2|Identical; not different.
SAND|1|Fine loose grains of rock found on beaches and in deserts
SANE|1|Having a healthy, rational mind
SANG|2|Produced musical sounds with the voice, in the past
SANK|1|Past tense meaning went down below the surface of water
SANS|3|Without; lacking.
SAUL|3|The first king of Israel in the Hebrew Bible
SAVE|2|To set aside money for future use
SAYS|3|Utters in words, in the third-person singular
SCAM|1|A fraudulent scheme to trick people out of money
SCAN|2|To look over quickly, or to examine with a device
SCAR|1|A mark left on skin after a wound heals
SCUM|2|A layer of dirt or froth on the surface of a liquid
SEAL|2|A sleek marine mammal that lives near coasts
SEAN|3|An Irish male given name, equivalent to John
SEAS|1|Large bodies of salt water smaller than oceans
SEAT|2|A place provided for a person to sit
SECT|3|A group with distinct religious or philosophical beliefs, often a subdivision of a larger faith
SEED|1|The small part of a plant from which a new one grows
SEEK|2|Try to find or obtain
SEEM|2|To give the impression of being
SEEN|3|Past participle of perceiving with the eyes
SEES|1|Perceives with the eyes
SELF|3|A person's own essential identity or being
SELL|2|Exchange goods for money
SEMI|2|Prefix meaning half or partly
SEND|2|Cause to go or be delivered to a destination
SENT|2|Caused to go or be delivered, in the past tense
SEPT|3|The ninth month, in abbreviated form
SETH|2|In the Bible, the third son of Adam and Eve.
SETS|3|Groups of matching things; or sinks below the horizon
SEXY|1|Sexually attractive or exciting.
SHAH|3|A former title for the monarch of Iran.
SHAW|5|A small wood or thicket, in dialect use
SHED|2|A small storage building in a garden
SHES|1|informal contraction for 'she is'.
SHIA|3|A major branch of Islam, distinct from Sunni
SHIN|1|Front part of the lower leg, below the knee
SHIP|1|A large seagoing vessel
SHOE|1|An outer covering worn on the foot
SHOP|1|A place where goods are sold
SHOT|2|An attempt to score by kicking, throwing, or striking a ball
SHOW|2|To display or present
SHRI|5|A title of respect in India.
SHUT|2|To move something into a closed position
SICK|1|Affected by illness; unwell
SIDE|2|One of the surfaces or edges of an object
SIGH|1|To breathe out slowly and audibly, often from sadness or relief
SIGN|2|A board displaying information or directions
SILK|2|A soft, smooth fabric spun by a certain caterpillar
SIMS|2|A popular life-simulation video game series
SING|1|To make musical sounds with the voice
SINK|1|Go down beneath the surface of water
SINS|2|Acts considered wrong or immoral.
SITE|2|A particular place where something is located or takes place
SITS|1|Rests on a seat with the body upright
SIZE|2|The overall dimensions or magnitude of something
SKIN|1|The outer covering of the body
SKIP|2|Pass over or leave out
SLAB|2|A flat, thick piece of stone or concrete
SLAM|2|To shut something forcefully.
SLAP|2|To hit with an open hand.
SLID|2|Moved smoothly along a surface.
SLIM|2|Gracefully thin in build
SLIP|2|To slide accidentally and lose one's footing
SLIT|1|A narrow, straight cut or opening
SLOT|2|A narrow opening for inserting something
SLOW|1|Moving or operating at low speed
SNAP|2|Break suddenly with a sharp cracking sound
SNOW|1|Frozen precipitation that falls from the sky as white flakes
SOAK|2|To immerse in liquid.
SOAP|1|A cleansing substance lathered with water for washing
SOCK|1|A piece of clothing worn on the foot.
SODA|1|A sweet carbonated beverage.
SOFA|1|A long upholstered seat for more than one person.
SOFT|1|Yielding easily to the touch; not hard
SOIL|1|The top layer of earth in which plants grow.
SOLD|2|Exchanged for money, in the past
SOLE|3|Being the only one; single
SOLO|2|Done by one person alone
SOME|3|Several
SONG|1|A short piece of music with words to sing
SONS|1|Male children of a parent
SONY|2|Japanese electronics giant behind the PlayStation
SOON|2|In or after a short time from now
SOOO|2|An informal, drawn-out way of writing 'so' for emphasis
SORE|2|Painful or tender.
SORT|2|To arrange items in groups according to type
SOUL|2|The spiritual or immaterial part of a person
SOUP|1|A liquid dish made by boiling ingredients in stock or water
SOUR|1|Having a sharp, acidic taste
SPAM|2|Unwanted junk messages sent in bulk over email
SPAN|3|The full extent of something from end to end.
SPEC|2|A detailed description of a design or requirement.
SPIN|2|To turn quickly around a central point
SPIT|1|To forcefully eject saliva from the mouth.
SPOT|2|A small round mark or stain
SPUN|2|Rotated rapidly around an axis
SPUR|2|A spiked device worn on a rider's boot heel to urge a horse forward
STAB|1|To wound someone with a pointed weapon
STAN|3|Slang for an obsessive, devoted fan; also a man's nickname
STAR|1|A luminous ball of gas in the night sky
STAT|3|Immediately, without any delay (used especially in hospitals)
STAY|2|To remain in one place
STEM|1|The main upright stalk of a plant
STEP|2|A single movement of the foot in walking
STEW|1|A dish of meat and vegetables cooked slowly in liquid.
STIR|1|To mix a substance by moving a spoon or utensil round
STOP|1|To cease moving or to bring to a halt
STUD|3|A small decorative piece of metal fixed to a surface or garment
SUBS|2|Short for underwater warships
SUCH|2|Of the type previously mentioned.
SUCK|2|To draw liquid into the mouth using the lips and tongue
SUED|2|Took legal action against someone
SUIT|2|A matching jacket and trousers worn together
SUMS|2|Totals obtained by adding numbers together
SUNG|2|Performed vocally, past participle of a musical verb
SUNK|2|Gone down below the surface of water; past participle of sink
SUNS|1|Stars at the center of solar systems.
SURE|2|Confident and free from doubt
SURF|1|Foam and spray of breaking ocean waves
SWAN|1|A large, graceful waterbird known for its long curved neck, often white.
SWAP|1|To exchange one thing for another
SWAY|2|To move slowly and rhythmically back and forth
SWIM|1|Move through water using the arms and legs
SYNC|2|To coordinate so events happen at the same time
TABS|2|Small labels or markers for identification or organization.
TACO|1|Folded tortilla filled with meat, cheese, and vegetables
TAGS|1|Small labels attached to items for identification or pricing
TAIL|1|The rear appendage of an animal
TAKE|1|To grasp or seize.
TALE|1|A story, especially an imaginative one
TALK|1|To express thoughts and ideas using spoken words
TALL|1|Of great or above-average height
TAME|2|To domesticate or subdue.
TANG|2|A sharp taste or smell.
TANK|1|A large container for holding liquid or gas
TAPE|2|A long narrow strip used for binding, sealing, or recording
TAPS|2|A device for controlling the flow of liquid.
TARA|3|The O'Hara family's plantation home in a famous Civil War novel
TASK|1|A piece of work to be done
TATE|3|London gallery network famous for modern and British art
TAXI|1|Hired car with a driver for short trips
TEAM|2|A group working together toward a common goal
TEAR|2|A drop of salty liquid that falls from the eye
TECH|2|Informal word for advanced electronic gadgets and methods
TEEN|3|Adolescent
TELL|2|To make known to someone with words
TEMP|2|A worker hired for a limited period
TEND|3|To care for or look after; also, to be inclined toward something
TENS|1|The digit position representing groups of ten in a number system
TENT|1|A portable shelter made of fabric.
TERM|3|A fixed period of time, as in a school year.
TEST|1|An examination of knowledge or ability
TEXT|2|The written words of a book or document
THAI|2|Of or relating to a Southeast Asian kingdom once called Siam
THAN|3|Word used to introduce the second element in a comparison
THAT|2|Demonstrative pointing to something more distant
THEE|4|An archaic form of 'you'.
THEM|2|Those people or things as the object of a verb
THEN|3|At that time; next in order
THEO|4|Pet form of a Greek-derived boy's name meaning 'gift of god'
THEY|2|Third-person plural pronoun
THIN|1|Having little thickness or width
THIS|2|Demonstrative for something near at hand
THOR|1|Norse god associated with thunder, lightning, and strength
THOU|3|Archaic pronoun once used to address a single person
THRU|1|Casual way of writing it, often seen on diner signs
THUG|1|A violent person, especially a criminal.
THUS|3|As a result of what has just been said
TICK|2|A small blood-feeding arachnid found on animals
TIDE|2|The rise and fall of sea levels.
TIDY|1|Arranged in an orderly, clean manner
TIED|2|Fastened or knotted securely
TIER|3|One layer in a series of ranked rows
TIES|2|Strips of neckwear worn with formal shirts
TILE|1|A flat, hard piece used to cover floors, walls, or roofs
TILL|2|Up to the time of; a cash drawer in a shop
TILT|1|To move or lean into a sloping position
TIME|3|The ongoing progression of events; hours and minutes
TINA|3|A woman's given name, often used as a diminutive
TINY|2|Extremely small in size
TIPS|2|Small pieces of practical or helpful advice
TIRE|2|To exhaust or weary.
TOBY|2|A common short form of the name Tobias
TODD|2|A common English given name for a boy
TOES|1|The digits at the end of the foot
TOLD|3|Past tense of passing information to someone in speech
TOLL|3|A charge paid for using a road or bridge
TOMB|1|A grave or vault for the dead
TONE|2|A particular quality or pitch of a sound
TONI|3|A common female given name.
TONS|3|Large units of weight, or informally a great many
TONY|4|Fashionable and expensive; stylishly upscale
TOOK|2|Past tense of grasp or seize
TOOL|1|A handheld implement used to carry out a task
TOPS|2|The uppermost parts or surfaces.
TORE|1|Ripped forcefully, past tense
TORN|2|Ripped or pulled apart
TORY|3|Member or supporter of Britain's Conservative Party
TOSS|1|To throw something lightly or carelessly
TOUR|2|A journey visiting several places in turn
TOWN|1|A settlement larger than a village but smaller than a city
TOYS|1|Playthings for children
TRAP|2|A device for catching animals
TRAY|1|A flat container used for carrying items
TREE|1|Tall perennial plant with a woody trunk and branches
TREK|2|A long, arduous journey, especially on foot
TRIM|1|To cut away excess material to neaten something
TRIO|2|A group of three, especially musicians
TRIP|2|A short excursion to a place and back
TROY|3|Ancient city in Anatolia famed for a legendary ten-year siege
TRUE|2|In accordance with fact or reality
TUBE|1|A long, hollow cylinder for carrying liquids or gases
TUCK|2|To fold something neatly.
TUNA|1|A large marine fish often used for food
TUNE|2|A pleasing succession of musical notes
TURF|1|Grass and the soil beneath it, forming a surface layer
TURN|2|To rotate or change direction.
TWIN|2|One of two children born at the same birth
TYPE|2|A category of things sharing common characteristics
TYRE|2|A rubber covering fitted around the rim of a wheel
UBER|4|An informal intensifier meaning 'supremely' or 'to an extreme degree'
UCLA|3|Prominent public research university in Los Angeles (abbr.)
UEFA|3|European governing body for football
UGLY|1|Unpleasant or repulsive in appearance
UKIP|3|A political party in the United Kingdom.
UNDO|2|To reverse an action.
UNIT|3|A single standard quantity used in measurement
UNTO|3|An archaic or poetic word meaning 'to' or 'towards'
UPON|3|Formal word meaning on top of
URGE|3|A strong desire or compulsion to act
USED|2|No longer new.
USER|2|A person who operates a device or program
USES|2|Employs something for a purpose
USSR|3|Former Communist superpower dissolved in 1991
UTAH|2|Beehive State of the American West, home to Salt Lake City
VAIN|2|Having excessive pride in one's appearance or achievements
VALE|3|A valley, especially in poetic or literary usage
VANS|2|Vehicles used for transporting goods or people.
VARY|2|To change or be different from one case to another
VASE|1|A decorative container used to hold cut flowers
VAST|1|Extremely large in extent or quantity
VEIL|1|A piece of fine fabric worn to cover the face or head
VEIN|2|A blood vessel that carries blood back toward the heart.
VENT|2|An opening that allows air or gas to escape
VERA|3|A common female first name
VERB|2|A word that describes an action, state, or occurrence
VERY|2|To a high degree; greatly
VEST|1|A sleeveless garment worn over a shirt
VETO|2|The power to reject a decision or proposal made by others
VETS|2|Professionals who treat animals.
VIBE|2|The general atmosphere or feeling of a place
VICE|3|An immoral or wicked personal habit
VIEW|1|A scene visible from a particular spot
VIII|2|Roman numeral representing the number eight
VILE|2|Extremely unpleasant or morally repugnant
VINE|1|A climbing or trailing plant with a woody stem
VISA|2|Official passport endorsement permitting entry to a country
VITA|3|A short written summary of one's education and career
VOID|2|A completely empty space.
VOTE|2|A formal expression of choice in an election
VOWS|2|Solemn promises, especially those made during a wedding ceremony
WADE|3|to walk through water
WAGE|2|Regular payment received for work, often calculated by the hour
WAIT|1|Stay where you are until something happens
WAKE|2|To stop sleeping and become conscious
WALK|1|To move on foot at a steady pace
WALL|2|A vertical structure forming the side of a room or enclosing an area
WALT|2|First name of the man behind Mickey Mouse
WAND|1|A slender rod used by a magician or fairy
WANG|2|A common Chinese surname
WANT|2|To wish or long for something
WARD|3|A separate section of a hospital for a group of patients
WARE|2|Articles or goods for sale.
WARM|1|Having a fairly high but comfortable temperature
WARN|2|To inform someone of a danger.
WARP|2|To bend or twist out of the original shape
WARS|2|Armed struggles between nations or groups
WARY|2|Cautious and alert to danger.
WASH|1|Clean with water and usually soap
WATT|2|The SI unit used to measure electrical power
WAVE|2|A moving ridge on the surface of water
WAYS|2|Methods or manners of doing things
WEAK|1|Lacking strength or power
WEAR|2|To have clothing on one's body
WEBB|3|NASA's large infrared space observatory launched in 2021, named after a former administrator.
WEED|2|A wild plant growing where it is not wanted
WEEK|1|A period of seven consecutive days
WEIR|2|A low dam built across a river to raise the water level or control its flow
WELL|3|A deep hole dug to reach underground water
WENT|2|Past tense of travel or depart
WERE|2|Past tense of 'to be', used with plural subjects
WEST|1|The compass direction where the sun sets
WHAT|3|Asking for particular information about something
WHEN|2|At what time
WHIP|2|To strike with a flexible instrument.
WHOA|1|An exclamation used to express surprise or to tell someone to stop
WHOM|3|Objective form of the relative pronoun 'who'
WIDE|2|Measuring a large distance from one side to the other
WIFE|1|A married woman in relation to her spouse.
WIFI|1|Wireless technology for connecting devices to the internet
WIKI|1|A website that allows collaborative editing.
WILD|2|Living in nature; untamed
WILL|3|Auxiliary marking the future tense; also a legal document for an estate
WIND|1|A natural movement of air across the land
WINE|1|An alcoholic drink made from fermented grapes
WING|2|The limb a bird uses to fly
WINK|1|A quick closing and opening of one eye, often as a signal
WINS|2|Achieves victory in a contest (third person)
WIPE|1|To clean or dry by rubbing.
WIRE|2|A thin, flexible strand of metal
WISE|2|Showing good judgment born of experience
WISH|2|A strong longing for something to happen
WITH|2|Accompanied by
WOAH|1|An expression of surprise.
WOKE|2|Stopped sleeping; became conscious again
WOLF|1|Wild canine that hunts in a pack
WOMB|2|The organ in which a fetus develops before birth
WONG|2|A common Chinese and Cantonese surname
WONT|4|A person's customary habit or usual practice
WOOD|1|The hard fibrous material that forms a tree's trunk
WOOL|1|The soft, curly hair forming a sheep's coat
WORD|1|A single unit of language with meaning
WORE|2|Had a garment on the body, in the past
WORK|1|To perform a task.
WORM|1|A long, thin, legless invertebrate that burrows in soil.
WORN|2|Damaged or made thin by long use
WRAP|2|Cover an object by folding material around it
WWII|1|Global conflict fought from 1939 to 1945.
XBOX|2|Microsoft's line of home video game consoles
YALE|3|An Ivy League university located in Connecticut
YANG|3|The active, bright principle in Chinese philosophy, paired with a passive counterpart
YARD|2|A ground area beside a building, or a unit of length of three feet
YARN|2|A long strand of fiber used for knitting.
YEAH|1|An informal word for yes
YEAR|1|A period of twelve months.
YELL|1|To shout loudly
YOGA|1|A discipline of postures and breathing for body and mind
YORK|3|A walled cathedral city in northern England
YOUR|2|Belonging to the person being addressed
YUAN|2|The basic unit of currency in China
YURI|3|A common Russian male given name, often linked to the first cosmonaut
ZACH|2|A short, casual form of a common boy's given name
ZACK|4|A common male name.
ZERO|1|The figure standing for nothing
ZEUS|2|The king of the gods in ancient Greek mythology
ZINC|2|A bluish-white metallic element used to coat steel against rust
ZONE|2|A region marked off for a particular purpose
ZOOM|1|To move somewhere extremely fast
AARON|3|Brother of Moses and first high priest in the Bible
ABBEY|2|A building occupied by a community of monks or nuns
ABDUL|2|A common Arabic male given name meaning 'servant of'
ABIDE|3|To accept or act in accordance with.
ABOUT|3|Concerning a topic, or roughly so many
ABOVE|2|In or to a higher position than something else
ABUSE|2|Cruel or violent treatment of a person
ACIDS|2|Substances with a sour taste that react with bases
ACRES|2|Units of land area, each about 4,047 square metres
ACTED|2|Took steps to deal with a situation
ACTOR|1|Person who performs in plays or films
ACUTE|2|Having a sharp angle.
ADAMS|2|John or John Quincy, of early American politics
ADAPT|2|To adjust to new conditions.
ADDED|2|Included as an extra amount
ADELE|2|British singer known for the album '25'
ADMIN|1|Routine office paperwork and organizational tasks, informally
ADMIT|2|To acknowledge that something is true or that one is at fault
ADOBE|2|A sun-dried brick made of clay and straw
ADOPT|2|Take on as one's own, such as a child or an idea
ADORE|1|To love and admire deeply
ADULT|1|a fully grown person
AFTER|2|Following in time or place; later than
AGAIN|3|Once more; in addition
AGENT|2|A person who acts on behalf of another
AGING|2|The process of becoming older.
AGNES|2|A female given name.
AGONY|2|Extreme physical or mental suffering.
AGREE|2|Share the same opinion
AHEAD|2|In or toward the front; further on
AHMAD|3|A widely used Arabic male given name meaning 'most praised'
AHMED|2|A common male given name in Arabic-speaking cultures
AIDED|1|Helped someone achieve something
AIMED|2|Pointed a weapon toward a target
AIRED|2|Broadcast on television or radio
AIRES|4|Plural of air or a city in Argentina.
AISLE|2|A passageway between rows of seats or shelves
ALARM|1|A device that warns of danger or wakes you up
ALBUM|2|A collection of musical recordings released as one item
ALERT|2|Quick to notice and respond; watchful
ALEXA|2|Amazon's voice-activated virtual assistant
ALGAE|3|Simple non-flowering plants.
ALIAS|2|A false or assumed name
ALICE|1|Common female first name
ALIEN|1|A being from another world
ALIGN|2|To arrange in a straight line or bring into agreement
ALIKE|2|Similar to one another; in the same way
ALIVE|1|Having life; not dead
ALLAH|2|The Arabic name for God, especially in Islam.
ALLAN|2|A common male first name
ALLEN|4|A common surname; also a hexagonal wrench used with socket-head screws
ALLEY|1|A narrow passage between or behind buildings
ALLOW|1|To give permission for something to happen
ALLOY|2|A blend formed by combining two or more metallic elements
ALONE|2|Without any other people present
ALONG|3|Moving forward following the length of something
ALOUD|1|Spoken so as to be heard, rather than silently
ALPHA|3|The beginning or first of something
ALTAR|2|A table used for religious ceremonies
ALTER|3|To make different without changing into something else
AMBER|3|a yellowish-brown fossilized tree resin
AMEND|2|To make changes to something.
AMINO|3|Relating to a chemical group found in the building blocks of protein
AMONG|2|Surrounded by; in the company of.
AMPLE|2|More than enough; plentiful
ANDRE|2|A male first name common in French-speaking countries.
ANGEL|2|A spiritual being acting as an attendant or messenger of God
ANGER|2|A strong feeling of annoyance or displeasure
ANGLE|2|The space between two intersecting lines, measured in degrees
ANGLO|3|A prefix meaning English, used to describe Britain's ties with other nations.
ANGRY|2|Feeling or showing strong displeasure
ANGUS|2|A common Scottish first name
ANIME|2|A style of Japanese cartoon film and television
ANITA|2|A common Spanish and Italian female first name
ANKLE|2|the joint connecting the foot and leg
ANNEX|2|An extension added onto an existing building
ANNIE|2|A common affectionate diminutive of a woman's name
ANNOY|1|To irritate or bother someone repeatedly
ANTON|2|A common male given name.
APART|2|Separated by distance, space, or time
APPLE|1|Round, crisp orchard fruit, often red or green
APPLY|2|To make a formal request, such as for a job
APRIL|1|The fourth month of the year
ARABS|3|People originating from the Middle East and North Africa
ARBOR|3|A shaded garden shelter formed by trees or climbing vines
AREAS|2|Particular spaces or zones, more than one
ARENA|2|An enclosed venue for sports or performances
ARENT|2|Short way to say 'are not' when texting quickly
ARGUE|2|To exchange opposing views, often heatedly
ARIEL|2|A character in Shakespeare's play 'The Tempest'.
ARISE|2|To come into being or start to exist.
ARMED|2|Carrying or equipped with weapons
ARMOR|3|protective clothing worn in battle
AROSE|3|Came into being; got up (past tense of 'arise')
ARRAY|3|Assortment
ARROW|1|A pointed shaft shot from a bow
ASHES|1|The grey powder that remains after something has burned.
ASIAN|2|Relating to the world's largest continent or its peoples
ASIDE|3|To or toward one side
ASKED|2|Posed a question or made a request, in the past.
ASSAD|4|Surname of a former ruling family of Syria
ASSES|2|Domesticated hoofed mammals related to horses, known for stubbornness
ASSET|2|A useful or valuable thing, person, or property that is owned
ASTON|3|A district of Birmingham, England, lending its name to a famed sports car maker.
ATLAS|2|A book of maps
ATOMS|2|The smallest units of a chemical element
ATTIC|1|A space or room just below a building's roof
AUDIO|2|Relating to recorded or transmitted sound
AUDIT|3|An official examination of accounts.
AVAIL|2|to make use of something
AVERY|5|A common surname or given name.
AVOID|2|To keep away from or prevent from happening
AWAIT|1|To anticipate the arrival of something or someone
AWAKE|1|Not asleep; alert and conscious
AWARD|2|A prize given to recognize an achievement
AWARE|2|Having knowledge or perception of something
AWFUL|1|Extremely bad or unpleasant
BACKS|3|Supports or gives approval to a person or plan
BACON|1|Cured meat from the back or sides of a pig
BADEN|3|Historic spa region in southwestern Germany
BADGE|2|a symbol of authority or membership.
BADLY|2|In a poor or unsatisfactory manner
BAKED|1|Cooked in an oven using dry heat
BAKER|1|Person whose job is to make bread and cakes
BALLS|1|Round objects used in many sports
BANDS|2|Groups of musicians who play together
BANGS|2|Hair trimmed short and combed forward over the forehead
BANKS|2|Institutions that hold and lend money (plural)
BARGE|2|A flat-bottomed vessel used to haul cargo along canals or rivers
BARON|2|A member of the lowest rank of nobility
BARRY|3|A common masculine given name, as borne by singer Manilow
BASED|3|Having a foundation or headquarters in a place
BASES|3|Foundations
BASIC|2|Forming an essential foundation; elementary
BASIL|2|An aromatic herb popular in Italian and Thai cooking
BASIN|2|A shallow open bowl for holding liquid
BASIS|3|The underlying support on which something rests
BATCH|2|A quantity of something produced at one time
BATES|3|A surname of English origin, often found in the US and UK
BATHS|1|Tubs filled with water for washing
BATON|2|A stick passed between runners in a relay, or used to lead an orchestra
BAUER|3|Brand well known for ice hockey skates and equipment
BEACH|1|Sandy shore where the land meets the sea
BEADS|1|Small decorative balls with holes, strung together to make jewelry.
BEAMS|2|Horizontal structural supports in a building
BEANS|2|Edible seeds of certain leguminous plants
BEARD|1|Hair grown on a man's chin and cheeks
BEARS|2|Large furry mammals that hibernate through winter
BEAST|1|A large or dangerous wild animal
BEATS|2|Strikes repeatedly, or defeats in a contest
BECKY|1|A common nickname for the name Rebecca
BEERS|1|Alcoholic drinks made from fermented malt and hops
BEGAN|2|Set in motion; got under way (past tense)
BEGIN|2|To set about doing something
BEGUN|3|Set in motion (past participle)
BEING|2|Existence; a living entity.
BELLA|2|An Italian and Spanish word meaning 'beautiful', often used as a feminine name
BELLE|2|A beautiful and admired woman, especially the most attractive at an event
BELLS|1|Hollow metal instruments that ring when struck
BELLY|1|The front part of the body below the chest; the stomach
BELOW|2|At or to a lower level or position
BELTS|1|Bands of leather or fabric worn around the waist
BENCH|1|A long seat for two or more people
BENNY|5|A diminutive form of Benjamin.
BERRY|2|a small, juicy fruit
BERTH|2|A fixed bunk on a ship or train
BETTY|1|A common English female first name
BIBLE|1|The sacred scriptures of Christianity
BIDEN|2|Surname of the 46th President of the United States
BIKES|1|Two-wheeled pedal-powered vehicles.
BILLS|2|Statements listing money that is owed
BILLY|3|A police officer's short wooden club
BINGE|3|To indulge excessively in an activity.
BINGO|1|A game of chance played with numbered cards
BIRCH|2|A tree with thin, pale, peeling bark
BIRDS|1|Feathered, winged creatures
BIRTH|2|The emergence of a baby from its mother
BITES|2|Small pieces of food taken in one mouthful, or wounds inflicted by teeth
BLACK|1|The darkest of colors, like coal or soot
BLADE|2|The cutting edge of a knife or sword
BLAIR|1|A common surname and also a given name.
BLAKE|4|English Romantic poet who wrote 'The Tyger'
BLAME|2|To hold responsible for a fault or wrong
BLAND|1|Lacking strong flavor, spice, or personality
BLANK|2|Without any marks, writing, or content
BLAST|2|A powerful explosion
BLAZE|1|A large, intense fire.
BLEED|1|To lose blood from a wound
BLEND|1|To combine smoothly into a single mixture
BLESS|2|To invoke divine favour upon someone
BLIND|1|Lacking the sense of sight
BLINK|1|To close and open the eyes quickly
BLISS|2|Perfect happiness; joy
BLITZ|4|A sudden, intense military attack.
BLOCK|2|A solid piece of hard material with flat sides
BLOGS|2|Frequently updated personal websites with dated entries
BLOKE|2|A man, often used informally.
BLOND|2|Having light-colored hair.
BLOOD|1|The red fluid that circulates through the body
BLOOM|1|A flower, or the state of flowering.
BLOWN|3|Carried or driven along by a current of air
BLOWS|2|To move air with force.
BLUES|3|Melancholic genre of African-American music
BLUFF|3|To deceive someone by pretending to have a stronger position.
BLUNT|1|Not sharp; having a dull edge or point
BLUSH|2|To become red in the face.
BOARD|1|A long flat piece of sawn wood
BOAST|2|To speak with excessive pride about oneself or one's achievements
BOATS|1|Small vessels for traveling on water
BOBBY|3|British slang for a police officer on the beat
BOLTS|2|Threaded metal fasteners used together with nuts
BOMBS|2|Explosive devices designed to detonate on impact or by timer
BONDS|2|Close connections or ties between people
BONES|1|The hard parts that form a skeleton
BONUS|2|An extra payment or benefit beyond what is expected
BOOBS|3|Silly mistakes or blunders (informal, British)
BOOKS|1|Bound printed works, more than one
BOOST|2|An increase, push, or helpful lift
BOOTH|2|A small enclosed compartment, as for voting or phoning
BOOTS|1|Sturdy footwear covering the ankle
BOOTY|3|treasure or valuable goods
BOOZE|1|Alcoholic drink, in informal speech
BORED|1|Feeling weary and restless through lack of interest
BORIS|1|A male given name of Slavic origin
BORNE|4|Transported or endured
BOUND|3|To move forward with great leaps
BOWEL|3|Part of the digestive system.
BOWEN|3|A common Welsh family surname
BOWIE|2|A famous British musician known for his unique style.
BOWLS|1|Round, deep dishes used for holding food
BOXER|2|An athlete who fights with fists in a ring
BOXES|1|Square containers used for storing or shipping things
BOYLE|3|Surname of the Irish scientist behind a famous gas law
BRACE|2|To prepare oneself for something difficult or unpleasant
BRADY|2|A common surname, notably associated with a famous football quarterback.
BRAIN|2|The organ within the skull that controls thought and movement
BRAKE|1|A device that slows or stops a vehicle
BRAND|2|A maker's trademark identifying a product
BRASS|3|A yellow alloy of copper and zinc
BRAVE|1|Showing courage in the face of danger
BRAVO|1|Exclamation of approval shouted after a fine performance.
BRAWL|2|a rough, disorderly fight among a group of people
BREAD|1|A staple food baked from flour and water
BREAK|1|A short rest from work
BREED|3|A distinct variety of a domesticated animal
BRENT|3|A benchmark grade of crude oil traded internationally.
BRETT|2|A common male given name, sometimes short for Brenton.
BRIAN|2|A common male given name
BRIBE|2|Money or a gift offered to influence someone dishonestly
BRICK|1|A rectangular block of baked clay used in building
BRIDE|1|A woman on the day of her wedding
BRIEF|2|Lasting only a short time
BRING|2|To carry or convey something toward a place
BRINK|2|The edge or verge of a steep place, or the point just before something happens
BRITS|1|Informal, casual term for citizens of the United Kingdom
BROAD|2|Large in extent from side to side
BROCK|4|An old dialect word for a badger
BROKE|3|Having no money at all, informally
BRONX|2|A borough of New York City located north of Manhattan
BROOK|1|A small, natural stream of fresh water
BROWN|1|The color of chocolate or rich soil
BRUCE|3|Springsteen, the rocker nicknamed 'The Boss'
BRUNO|2|A popular male given name of Italian origin.
BRUSH|2|A bristled tool used for painting or grooming
BRYAN|3|A common male first name.
BRYCE|3|a Utah national park known for its crimson hoodoos
BUCKS|2|Informal word for dollars
BUDDY|1|A close friend or companion
BUILD|1|To construct something by assembling its parts
BUILT|2|Put together from parts or materials (past tense)
BULBS|2|Round underground storage organs of plants.
BULLS|2|Male cattle.
BULLY|1|A person who habitually intimidates or mistreats weaker people
BUMPS|2|Small raised areas on a surface.
BUNCH|2|A number of things grouped or growing together
BUNNY|1|Small furry animal often associated with Easter
BURKE|2|A common Irish and Scottish surname
BURMA|3|A country in Southeast Asia, now known as Myanmar.
BURNS|2|Is on fire, or injures the skin with heat
BURNT|2|Damaged by fire or heat.
BURST|2|To break open or apart suddenly and violently
BUSES|1|Large vehicles for public transport.
BUTTS|2|the targets set up at the end of an archery or shooting range
BUYER|2|A person who purchases goods.
BYRNE|3|Surname of the Talking Heads frontman named David
BYRON|3|English Romantic poet who wrote 'Don Juan'
CABIN|2|A small wooden shelter, or the seating area of an aircraft
CABLE|2|A thick rope of wire, or a bundle of insulated electrical wires
CACHE|2|A hidden store of things, or a temporary storage area for data
CAIRO|1|Capital city of Egypt
CAKES|1|Sweet baked desserts made from flour, sugar, and eggs.
CALEB|3|Biblical spy who, with Joshua, gave a faithful report of Canaan
CALIF|3|Abbreviation used for a western U.S. state known for Hollywood and Silicon Valley
CALLS|2|Telephones or cries out to someone, in the present
CAMEL|1|A desert animal with one or two humps
CAMEO|2|A brief appearance by a famous performer in a film or show
CAMPS|2|Temporary outdoor lodging sites with tents
CANAL|2|Artificial waterway dug for boats or irrigation
CANDY|1|A sweet confection made mostly of sugar
CANOE|1|A narrow lightweight boat propelled with a paddle
CANON|3|An accepted body of works or an established rule
CARDS|2|Stiff rectangular pieces of paper used in games or greetings
CARED|2|Felt concern for, or looked after
CARES|2|Feels concern for, or looks after, someone
CAREY|3|Surname of singer Mariah, known for hits like "All I Want for Christmas Is You"
CARGO|2|Goods carried by a ship, plane, or truck
CARLA|3|A common feminine given name of Spanish origin
CARLO|2|Italian equivalent of the name Charles
CAROL|2|A song sung during the holiday season.
CARRY|2|To hold and move something from one place to another
CARTS|1|Small wheeled vehicles used to transport goods
CASES|2|Particular instances or situations under study
CASEY|3|A common first name, often associated with a famous baseball poem.
CASTE|4|A social class in a hierarchical system.
CASTS|2|To throw or direct something.
CATCH|2|To seize or capture something in motion
CATER|2|To provide food and service for an event.
CATHY|2|A common female given name.
CAUSE|2|The motive or grounds behind an action
CAVES|1|Natural underground hollows, often with stalactites
CEASE|3|To stop or come to an end.
CECIL|2|A traditional English male given name
CEDAR|2|An evergreen coniferous tree known for its fragrant wood
CELLS|3|The smallest structural units of living organisms
CENTS|2|Small coins each worth a hundredth of a dollar
CHAIN|1|A series of connected metal links
CHAIR|1|A seat for one person, usually with a back and legs
CHALK|1|A soft white rock, or the stick made from it for writing
CHAMP|2|Informal name for a title-holder in a competition
CHANG|3|Common surname of Chinese origin, as of chef David
CHANT|3|To sing or say repeatedly.
CHAOS|2|Complete disorder and confusion
CHARM|2|The power to delight or attract people
CHART|2|A diagram displaying data or information
CHASE|1|To pursue in order to catch
CHEAP|1|Costing very little money
CHEAT|3|To act dishonestly to gain an advantage.
CHECK|2|To examine something for accuracy or condition.
CHEEK|1|The fleshy part of the face below the eye.
CHEER|2|To shout in joy or to encourage.
CHEFS|1|Professional cooks who lead a kitchen
CHESS|1|A strategy board game played with kings, queens, and knights
CHEST|2|The front part of the body between neck and stomach
CHEVY|2|Informal nickname for a major American car manufacturer's vehicles
CHICK|2|A young bird, especially of the domestic fowl
CHIEF|2|The head of a tribe or organization
CHILD|1|A young human being below the age of puberty.
CHILE|3|A country in South America.
CHILI|1|Spicy pepper used to add heat to dishes
CHILL|2|To make cold, as a drink in the fridge
CHINA|3|Fine porcelain tableware
CHIPS|2|Fried strips or thin slices of potato
CHLOE|2|A common girl's given name of Greek origin
CHOIR|1|Organized group of singers who perform together
CHOKE|2|To struggle to breathe because of a blocked throat
CHORD|2|A group of musical notes sounded together
CHOSE|2|Picked out from several alternatives, in the past
CHRIS|3|Coldplay frontman Martin, by his first name
CHUCK|4|The clamp that grips the bit on a drill
CHUNK|1|A thick, solid piece of something
CIDER|1|A drink made from fermented apple juice
CIGAR|2|A rolled bundle of tobacco.
CINDY|1|A common female given name.
CIRCA|4|Approximately, around a certain time.
CISCO|3|American company known for making networking hardware
CITED|3|Referred to a source as evidence or authority
CITES|3|To mention as an example.
CIVIC|3|Relating to a city or town.
CIVIL|3|Relating to ordinary citizens, not the military or clergy
CLAIM|3|To state something as true without offering proof
CLAMP|2|A tool that grips and holds objects firmly in place
CLANS|1|Large family groups, especially in Scottish Highland tradition
CLARA|2|Female first name; the young heroine of Tchaikovsky's 'The Nutcracker'
CLARE|3|A county on the west coast of Ireland
CLARK|3|Common English surname; the explorer who partnered with Lewis
CLASH|3|To come into conflict.
CLASS|1|A group of students taught together
CLAUS|1|Surname of the jolly gift-giver associated with Christmas Eve
CLAWS|2|Sharp, pointed nails of animals.
CLEAN|1|Free from dirt or stains
CLEAR|1|Easy to see through or to understand
CLERK|2|A person who handles administrative tasks.
CLICK|1|To press and release a mouse button
CLIFF|2|A steep rock face, especially at the edge of the sea
CLIMB|2|Ascend, especially using the hands and feet
CLING|2|To hold on tightly or stick closely to
CLINT|3|Common first name of the actor Eastwood
CLIPS|2|Fasteners used to hold things together.
CLIVE|3|A British male first name
CLOAK|2|A type of outer garment.
CLOCK|1|A device that measures and displays the time
CLONE|3|An organism or object that is an exact genetic copy of another
CLOSE|1|To shut something that was open
CLOTH|2|Fabric material.
CLOUD|1|A visible mass of water vapor floating in the sky
CLOWN|1|A comic entertainer known for bright makeup and silly antics.
CLUBS|2|Associations of people with shared interests
CLUES|2|Hints that help solve a puzzle or mystery
CLYDE|2|A common male first name
COACH|2|A person who trains an athlete or sports team
COAST|2|The land bordering the edge of the sea
COATS|1|Outer garments worn for warmth or protection
COBRA|2|A venomous hooded snake native to Asia and Africa
COCKS|2|Adult male chickens
COCOA|1|A powder made from roasted cacao beans, used in chocolate
CODED|2|Written in a secret or disguised form
CODES|2|Systems of symbols used for secret or compact communication
COHEN|3|A common Jewish surname.
COINS|1|Small flat pieces of metal used as money
COLIN|3|Male given name borne by actors Firth and Farrell
COLON|3|A part of the large intestine.
COLOR|2|A visual property such as red, blue, or green
COLTS|2|Young male horses.
COMBO|2|Fast-food deal that bundles a burger, fries, and a drink together
COMES|2|Moves toward or arrives at a place
COMET|2|An icy space object that develops a glowing tail near the sun
COMFY|1|Informal term for cozy and relaxing
COMIC|2|Causing laughter; humorous
COMIN|4|Dialect or informal spelling of a word meaning 'on the way', dropping the final 'g'
CONDO|2|A privately owned unit within a larger residential building
CONGO|2|African river and the country it runs through
CONOR|2|An Irish male first name
COOKS|1|People who prepare meals professionally
CORAL|2|A hard skeletal deposit produced by marine polyps, forming reefs.
CORES|1|The central or innermost parts of things
COREY|1|A common English first name for boys
CORPS|3|A branch or organized body of a military force
COSTA|4|The anatomical name for a rib
COSTS|3|Amounts of money that must be paid for goods or services
COUCH|4|To phrase or express in a particular manner
COUGH|1|A sudden, sharp release of air from the lungs
COULD|3|Past form of 'can,' expressing possibility
COUNT|1|To name numbers in order
COURT|2|A place where legal cases are heard and decided
COVER|2|To place something over in order to protect or conceal
COVID|2|A respiratory illness caused by a coronavirus, first identified in 2019.
CRACK|2|A narrow break, split, or fissure in a surface
CRAFT|3|A trade or activity that involves making things by hand
CRAIG|1|A common masculine first name
CRANE|2|A tall machine with a pulley used to hoist heavy loads
CRANK|2|To turn a handle to operate a machine.
CRASH|1|To collide violently or smash to pieces
CRATE|1|A large sturdy box used for transporting goods
CRAVE|2|To want something very badly
CRAWL|1|To move slowly with the body close to the ground
CRAZY|3|Wildly foolish or mentally unbalanced
CREAM|1|The rich fatty layer that rises to the top of milk
CREED|2|A set of beliefs or guiding principles
CREEK|2|A small, narrow stream of water
CREEP|1|To move slowly and quietly
CREST|2|The top of a hill, wave, or helmet
CREWS|2|Groups of people working together on a ship or project
CRIED|2|Shed tears, in the past
CRIES|1|Sheds tears, usually from sadness or pain.
CRIME|2|An act forbidden and punishable by law
CRISP|1|Firm, dry, and brittle in texture
CROPS|2|Plants grown by farmers for gathering
CROSS|2|To move from one side of something to the other
CROWD|1|A large number of people gathered together
CROWN|1|Ornamental headgear worn by a monarch
CROWS|2|Large black birds known for their harsh call
CRUDE|2|In a raw or unrefined state.
CRUEL|2|Willfully causing pain or suffering to others
CRUSH|2|To press or squeeze with force until broken or deformed
CRUST|1|The hard outer layer of something, such as bread or the earth
CUBAN|2|Relating to the Caribbean island nation whose capital is Havana.
CUBIC|2|Relating to the measurement of volume in three dimensions
CURED|2|Restored to health after an illness.
CURLY|1|Having tight coils or ringlets, as hair
CURRY|2|A dish of meat or vegetables cooked in a spicy sauce.
CURSE|2|A profane word, or a spell invoked to bring misfortune
CURVE|2|A smoothly bending line or arc
CYBER|3|Relating to the internet or virtual reality.
CYCLE|3|A sequence of events that repeats regularly
CYRUS|4|Ancient Persian king known as 'the Great', founder of the Achaemenid Empire
CZECH|4|Of or from the homeland of composer Antonín Dvořák.
DADDY|1|An affectionate word a child uses for their father
DAILY|1|Happening once each day
DAIRY|2|A place where milk is processed into butter and cheese
DAISY|2|A common flower with white petals around a yellow center
DAMON|2|A common male first name
DANCE|1|Move rhythmically to music
DANNY|2|Familiar form of the name Daniel
DANTE|4|An Italian poet known for 'The Divine Comedy'.
DARED|2|Had the courage to do something risky
DATED|3|No longer fashionable; old-fashioned
DATES|2|Particular days marked on a calendar
DAVID|2|Biblical shepherd-king who slew Goliath
DAVIS|3|Surname of jazz trumpeter Miles
DEALS|2|Business agreements or favorable bargains
DEALT|2|Distributed cards to the players
DEATH|2|The permanent end of life
DEBIT|2|A record of money taken out of an account
DEBTS|3|Money that is owed or due.
DEBUT|3|A first public appearance or performance
DECAY|2|The gradual decline into a worse or disintegrated state
DECKS|2|Flat surfaces for walking or standing.
DECOR|2|The furnishing and ornamental style of an interior space
DEEDS|1|Actions performed, especially notable ones
DEITY|3|A god or goddess.
DELAY|2|A period of waiting before something proceeds
DELHI|2|Capital territory of India, on the Yamuna river
DELTA|2|The fourth letter of the Greek alphabet
DEMON|1|An evil spirit or devil
DENIM|2|A sturdy cotton twill fabric used for jeans
DENIS|2|A common male given name of French origin
DENSE|3|Thick or closely packed.
DEPOT|2|A building used for storing goods or housing vehicles, often near a railway.
DEPTH|2|The measurement from top to bottom or front to back
DERBY|3|A famous horse race, or a stiff rounded felt hat
DEREK|5|A common male first name.
DETER|2|To discourage someone from an action through fear of consequences
DEVIL|2|An evil spirit, or the supreme power of wickedness
DEVON|2|English county famous for cream teas
DIANA|4|A famous British royal known for her charity work.
DIANE|3|A common feminine given name of French origin, linked to a Roman goddess of the hunt
DIARY|1|A book for recording daily events and private thoughts
DICKS|3|Informal slang term for detectives or private investigators
DIDNT|2|Did not, as a casual contraction (no apostrophe here)
DIEGO|3|Spanish given name, famously paired with 'San' for a California city
DIETS|1|Restricted eating regimens, or the food one habitually eats
DIGIT|1|A whole number from 0 to 9
DINER|1|A small, casual restaurant serving simple meals
DIRTY|2|Filthy
DISCO|2|A genre of dance music popular in the 1970s
DISCS|2|Flat, circular objects used for storage or games.
DITCH|2|To abandon or get rid of something
DIXON|2|A surname; also the name of a city in northern Illinois, USA
DOCKS|3|places where ships are loaded and unloaded
DODGE|2|To avoid by moving quickly aside
DOING|2|Carrying out or performing an action
DOLLS|1|Small models of human figures, often given to children as toys
DOLLY|3|Small handcart for moving goods
DONNA|1|A common female first name
DONOR|1|A person who gives something, such as blood or money
DOORS|1|Hinged or sliding panels that close off entrances to rooms
DORIS|1|A common female given name.
DOSES|2|Specific measured quantities of a medicine to be taken
DOUBT|2|A feeling of being unsure or unconvinced
DOUGH|1|A soft, thick mixture of flour and liquid used for baking
DOVER|2|A town in England known for its white cliffs.
DOWNS|2|Rolling grassy hills, especially in southern England
DOYLE|3|Surname of the author who created Sherlock Holmes.
DOZEN|1|A set of twelve items
DRAFT|2|A preliminary version of a written work
DRAIN|2|To cause liquid to flow away and empty out
DRAKE|1|A male duck.
DRAMA|2|A serious play, or an emotionally charged situation
DRANK|1|Swallowed a liquid, in the past tense.
DRAWN|3|Produced as a picture using a pencil or pen
DRAWS|2|Makes a picture with a pencil or pen; also pulls along
DREAD|2|Great fear or apprehension about something that may happen
DREAM|2|A series of images and feelings experienced during sleep
DRESS|1|A one-piece garment with a skirt, typically worn by women
DRIED|1|Having had moisture removed.
DRIFT|2|To move slowly, carried along by wind or water
DRILL|1|A power tool for boring holes
DRINK|1|To swallow a liquid
DRIVE|1|To operate and steer a motor vehicle
DRONE|3|An unmanned aerial vehicle.
DROPS|2|Small rounded portions of a liquid
DROVE|2|Operated a motor vehicle (past tense)
DROWN|1|To die from being unable to breathe underwater
DRUGS|2|Medicinal or narcotic substances
DRUMS|1|Cylindrical percussion instruments
DRUNK|1|Intoxicated by alcohol
DRYER|1|Appliance for drying clothes
DUBAI|3|The largest city in the United Arab Emirates
DUCKS|1|Web-footed swimming birds often found on ponds
DUDES|1|An informal, slang term for men or people.
DUMMY|2|A model of a human body, often used for display or testing
DUNNO|1|Informal contraction meaning 'I do not know'
DUSTY|1|Covered with fine particles of dirt
DUTCH|2|Relating to the Netherlands or its people
DWARF|1|A being of unusually small stature in folklore
DWELL|3|To live or reside in a place.
DYING|2|Nearing the end of life
DYLAN|3|Welsh poet Thomas's first name
EAGER|1|Having a strong desire or interest.
EAGLE|1|A large bird of prey known for sharp eyesight
EARLY|2|Happening before the usual or expected time
EARNS|2|To receive payment for work.
EARTH|1|The third planet from the sun
EATEN|2|Having been consumed as food
EBOLA|3|A severe, often fatal viral hemorrhagic fever first identified in Africa
EBOOK|1|A digital publication read on an electronic device
EDDIE|3|A short, friendly form of the name Edward
EDGAR|2|A traditional male first name, notably borne by writer Poe
EDGED|3|Having a sharp or pointed border.
EDGES|2|The outer borders or rims of things
EDITH|2|A common female given name.
EDWIN|3|A male given name of Old English origin meaning 'wealthy friend'
EGYPT|1|North African country famed for its ancient pyramids
EIGHT|1|The number that comes after seven
ELBOW|1|The joint between the forearm and upper arm
ELDER|2|A senior or respected older member of a community
ELECT|2|To choose by voting.
ELENA|3|Female first name popular across several European languages
ELIOT|3|Surname of the poet who wrote 'The Waste Land'
ELITE|3|A select group regarded as the best of its kind
ELIZA|4|Early natural language computer program from the 1960s
ELLEN|3|Comedian DeGeneres, familiarly
ELLIE|2|A common nickname for Eleanor or Elinor
ELLIS|3|A surname, and the name of a former immigration station in New York Harbor.
ELVIS|2|The American singer known as the King of Rock and Roll
EMAIL|1|An electronic message sent over the internet
EMILY|2|A popular feminine first name
EMPTY|1|Containing nothing
ENDED|2|Brought or came to a finish
ENEMY|1|A person who is hostile to or opposes another
ENJOY|1|To take pleasure in something
ENTER|1|To go into a room or place
ENTRY|2|A point of access, or an item recorded in a list
ENVOY|3|A diplomatic messenger or representative sent to a foreign government
EQUAL|2|The same in amount, value, or status
EQUIP|1|To supply someone with the items needed for a task
ERASE|1|To rub out or remove something completely
ERECT|2|To build or put up a structure
ERICA|1|A common female given name.
ERNIE|2|Bert's yellow-orange puppet friend on Sesame Street
ERNST|3|A German first name derived from a word meaning 'serious'
ERROR|2|A flaw or inaccuracy in something
ESSAY|2|A short piece of writing on a particular subject
ESSEX|3|A county on the east coast of England
ETHAN|1|A common English male first name
ETHIC|3|Moral principle guiding behavior
EUROS|2|The banknotes and coins used as currency across much of the EU
EVANS|4|Common Welsh surname, as of jazz pianist Bill ___
EVENT|1|Something notable that happens
EVERY|2|Each one without exception.
EXACT|2|Precise and accurate in every detail
EXAMS|1|Formal tests of knowledge.
EXCEL|2|Surpass
EXILE|2|Enforced removal from one's native country
EXIST|2|To have actual being; to be real
EXITS|1|Ways out of a building
EXTRA|2|More than is usual, expected, or necessary
FACED|2|Confronted or dealt with something difficult
FACES|1|The fronts of people's heads
FACTO|4|Latin term meaning 'in reality', as opposed to by law
FACTS|2|Items of information known to be true
FADED|2|Having lost brightness, color, or strength over time
FAILS|2|Is unsuccessful in achieving a desired goal
FAINT|2|Barely perceptible or lacking strength and clarity
FAIRY|1|A tiny imaginary being with magical powers
FAITH|2|Complete trust or confidence in someone or something
FALLS|1|Drops downward under gravity
FALSE|2|Not in accordance with fact or truth
FAMED|3|Known widely and unfavorably.
FANCY|2|Elaborate or decorative rather than plain
FANNY|2|A traditional feminine given name, short for Frances
FARES|2|Charges for transportation.
FARGO|4|A city in North Dakota.
FARMS|1|Areas of land used to grow crops or raise animals
FATAL|3|Causing death or ending in disaster
FATTY|1|Containing a lot of grease or oil
FAULT|2|A flaw or imperfection
FAUNA|2|The animals of a particular region or time period
FAVOR|2|A helpful act done for someone out of goodwill
FEARS|2|Feelings of dread about possible danger (plural)
FEAST|1|A large, elaborate meal, often prepared for a celebration.
FEEDS|1|Gives food to a person or animal
FEELS|2|Experiences a particular emotion or sensation
FELIX|2|A Latin-derived name meaning 'lucky', often given to cats
FELLA|2|Informal word for a man or boyfriend
FENCE|1|A barrier of posts and wire that encloses an area
FERRY|2|A boat that carries people across water.
FETCH|2|Go and bring something back
FETUS|4|An unborn offspring in the later stages of development.
FEVER|2|An abnormally high body temperature
FEWER|3|A smaller number of countable things
FIBER|2|A thin thread or filament, or roughage in one's diet
FIBRE|2|A thread-like strand, or dietary roughage
FIELD|1|An open area of land used for crops or grazing
FIERY|3|Full of intense emotion or passion.
FIFTH|2|Next in order right after the fourth
FIFTY|2|The number that is half of a century
FIGHT|1|To take part in a violent struggle
FILED|2|Submitted a document officially
FILES|2|Folders holding documents or computer data
FILLS|1|Makes something full by putting things into it
FILMS|2|Motion pictures shown in cinemas
FINAL|2|Coming at the end of a series
FINCH|2|A small songbird.
FINDS|2|Discovers or locates something
FINED|2|Made to pay a monetary penalty
FINES|2|Sums of money ordered to be paid as punishment
FIONA|2|A feminine given name of Gaelic origin meaning 'fair' or 'white'
FIRED|2|Dismissed from a job
FIRES|2|Instances of burning that give off heat and flame (plural)
FIRMS|2|Business companies, especially professional partnerships
FIRST|1|Coming before all others in order, time, or rank
FIXED|2|Firmly secured in place and not moving
FIXES|2|To repair or mend something.
FLAGS|1|National banners flown from poles
FLAIR|2|talent
FLAME|2|The glowing, flickering part of a burning fire
FLANK|2|The side of something, especially a body or a military formation
FLARE|2|A sudden burst of bright flame or light, or a signal device that produces one
FLASH|1|A sudden brief burst of bright light
FLATS|2|Apartments occupying part of a single building
FLAWS|2|Imperfections or defects in something
FLEET|2|A group of ships or vehicles under one control
FLESH|2|The soft tissue of the body between skin and bone
FLICK|2|To move something with a quick, light movement
FLIES|2|Buzzing insects, or moves swiftly through the air
FLINT|2|A hard gray stone that sparks when struck against steel
FLIRT|2|To behave playfully in a romantic or teasing way
FLOAT|1|To rest on the surface of a liquid without sinking
FLOCK|1|A group of birds or sheep
FLOOD|1|An overflow of water onto normally dry land
FLOOR|1|The lower surface of a room that one walks on
FLORA|2|The plant life of a particular region or period
FLOUR|1|A powder made from grinding grains.
FLOWN|2|Having traveled through the air, especially by aircraft.
FLOWS|2|Moves steadily and continuously, as a river does
FLOYD|3|A male first name and the surname of champion boxer Mayweather.
FLUID|2|A substance, liquid or gas, that flows freely
FLUSH|2|To cleanse by a rapid flow of water
FLUTE|2|A high-pitched woodwind instrument played by blowing across a hole
FLYER|2|A printed advertisement.
FLYNN|2|A common Irish surname and modern given name for boys
FOCAL|3|Relating to or forming a center of interest
FOCUS|3|To concentrate attention on one thing
FOLEY|4|The art of creating everyday sound effects for film and video
FOLKS|2|People in general, often of a family or community
FOODS|1|Substances eaten to provide nourishment
FOOLS|2|Simpletons
FORCE|2|Physical power or strength exerted on something
FOREX|3|Short for the global marketplace where currencies are bought and sold
FORGE|2|To shape metal by heating and hammering it
FORKS|1|Pronged utensils used for eating
FORMS|2|Printed documents with blank spaces to fill in
FORTH|4|Out from a starting point; forward in place or time
FORTY|1|The number that comes after thirty-nine
FORUM|2|A medium or venue for open public discussion
FOUND|3|To establish or create
FRAME|2|A rigid surround that holds and supports a picture
FRANK|3|Open and direct in speech
FRANZ|2|A common German and Austrian male first name
FRAUD|2|Deliberate deception carried out for unfair gain
FREAK|3|A very unusual or abnormal event or person
FREED|2|Released from captivity or restriction
FRESH|2|Newly made or obtained; not stale
FREUD|2|Austrian neurologist who founded psychoanalysis
FRIED|2|Cooked in hot oil or fat
FRIES|1|Strips of potato cooked in hot oil
FROGS|1|Amphibians known for their jumping abilities.
FRONT|2|The most forward part or surface of something
FROST|1|A thin layer of ice crystals that forms on cold surfaces overnight
FRUIT|1|Sweet, seed-bearing produce of a plant
FUCKS|3|Coarse verb for having sex, in third-person present tense
FUELS|1|Substances burned to produce heat or power
FULLY|2|To the greatest possible extent
FUNDS|2|A sum of money set aside for a purpose
FUNGI|3|Organisms such as mushrooms, molds, and yeasts that lack chlorophyll
FUNKY|2|Having a strong, rhythmic style, often used to describe music
FUNNY|2|Causing laughter or light-hearted enjoyment
FURRY|1|Covered with fur.
FUZZY|2|Covered with fine, soft, indistinct texture; blurred
GAINS|2|Increases in amount, value, or advantage
GAMER|1|A person who plays interactive video entertainment as a hobby
GAMES|2|Competitive activities played according to rules
GAMMA|2|The third letter of the Greek alphabet
GANGS|1|Organized groups of criminals
GASES|2|Substances that expand to fill their container, unlike liquids or solids
GATES|2|Hinged barriers that close openings in walls or fences
GAUGE|3|To measure or assess.
GAVIN|3|A male given name of Welsh origin, derived from the Arthurian knight Gawain
GEARS|2|Toothed wheels that transmit motion in a machine
GENES|2|Units of heredity passed from parents to offspring
GENRE|2|A category of artistic work marked by a particular style
GENUS|3|A taxonomic category ranking above species and below family
GEOFF|3|A common male given name.
GERRY|2|A common short form of the given name Gerald
GETTY|3|Brand name of a major stock-photo and imagery archive
GHANA|2|West African country whose capital is Accra
GHOST|1|The spirit of a dead person said to haunt the living
GIANT|1|An imaginary being of enormous size and strength
GIBBS|1|A common English-origin surname
GIFTS|2|Things given freely without expecting payment
GILES|4|A name often associated with historical figures.
GIMME|2|A casual request for something.
GIRLS|1|Young female children
GIVEN|3|Specified or stated as already known or agreed
GIVES|2|Hands something over to another, freely and without payment
GLASS|1|A hard, transparent material used in windows
GLENN|2|A common male given name.
GLOBE|1|Spherical model of the Earth mounted on a stand
GLORY|2|Great honour and renown won through notable achievements
GLOSS|2|A shiny smoothness on a surface
GLOVE|1|A covering for the hand with separate sections for each finger
GOALS|2|Aims or desired results one works toward
GOATS|1|Horned farm animals known for climbing and bleating
GOING|2|Moving from one place to another.
GOMEZ|4|A common surname in Spanish-speaking countries.
GONNA|3|Informal contraction meaning 'going to'
GOODS|2|Merchandise or wares offered for sale
GOOFY|2|Silly or foolish.
GOOSE|1|A large water bird, related to ducks, that honks
GOTTA|3|Informal contraction meaning 'have got to'
GRABS|2|Seizes suddenly and forcibly
GRACE|3|Elegance and smoothness of movement or manner
GRADE|1|a level of quality or rank
GRAFT|3|A piece of living tissue transplanted onto the body
GRAIL|3|A legendary object sought in Arthurian legend, symbolizing an ultimate goal
GRAIN|2|A single small seed of a cereal like wheat or rice
GRAMS|2|Small units of mass in the metric system, often used for food
GRAND|2|Impressive in size or appearance; magnificent
GRANT|2|To formally give or allow something requested
GRAPE|1|A small round fruit that grows in clusters on a vine
GRAPH|2|Diagram showing the relation between variables
GRASP|2|To seize or hold firmly.
GRASS|1|The green plant that covers lawns and fields
GRAVE|1|A burial place marked by a headstone
GRAVY|1|A sauce made from meat juices, often served with roast dinners
GREAT|2|Of an extent, amount, or intensity considerably above the normal.
GREED|2|An excessive desire for wealth or possessions
GREEK|2|Relating to the country of Athens and its ancient culture
GREEN|1|Of the color of grass and leaves
GREET|1|To welcome someone with kind words or a gesture
GRIEF|2|Deep sorrow, especially following a loss
GRILL|1|An appliance or rack used for cooking food over direct heat
GRIND|2|To crush into small particles by friction
GRIPS|2|Holds something firmly
GROOM|2|A man about to be or newly married
GROSS|4|Twelve dozen; a quantity of 144
GROUP|1|A number of people or things gathered together
GROVE|1|A small group of trees, often of one kind
GROWN|2|Having reached full size or maturity
GROWS|1|Increases in size or develops over time
GUARD|2|A person who keeps watch or defends a place
GUESS|2|To form an opinion without certain knowledge
GUEST|1|A person invited to visit or stay at someone's home
GUIDE|1|Person who leads or shows the way
GUILD|2|An association of craftsmen or merchants
GUILT|2|A troubled feeling of having done wrong
GUISE|3|An outward appearance that conceals someone's true nature
GYPSY|3|A member of a nomadic ethnic group.
HABIT|2|A settled, regular tendency that is hard to give up
HACKS|2|Clever shortcuts or tricks used to solve a problem
HAGUE|3|City famous for international peace conferences and war crimes tribunals
HAIRS|1|Thin strands that grow from the skin of most mammals
HAIRY|1|Thickly covered in fine strands growing from the skin
HAITI|2|A Caribbean nation sharing an island with the Dominican Republic
HALEY|2|A popular unisex first name, often a variant spelling of 'Hayley'
HALLS|1|Corridors or large rooms in a building
HAMAS|3|A Palestinian political and militant organization that has governed the Gaza Strip
HANDS|1|The body parts at the ends of the arms
HANDY|1|Convenient and useful
HANGS|1|Suspends or dangles from above
HANNA|5|A common given name, often female.
HAPPY|1|Feeling or showing pleasure and contentment
HARDY|2|Capable of enduring difficult conditions
HARRY|4|To persistently harass or torment
HARSH|2|Unpleasantly rough, severe, or cruel
HATCH|1|To emerge by breaking out of an egg
HATED|2|Felt an intense dislike or loathing toward
HATES|2|Feels intense dislike or hostility toward
HAUNT|2|To visit frequently.
HAVEN|2|A place of safety or shelter
HAVOC|2|Widespread destruction or disorder
HAWKS|1|Birds of prey known for keen eyesight
HAYES|2|A common English surname
HAZEL|2|A tree or shrub known for its nuts.
HEADS|2|The side of a coin opposite tails
HEARD|3|Detected a sound with the ears, in the past
HEARS|2|Becomes aware of a sound or piece of news
HEART|1|The organ that pumps blood through the body.
HEATH|2|Open, uncultivated land covered with wild shrubs and gorse
HEAVY|1|Having great weight; hard to lift or move
HEDGE|1|A boundary line of closely planted shrubs or small trees
HEELS|2|The rounded back parts of the feet
HEIRS|2|People legally entitled to inherit property or a title
HELEN|1|A traditional female given name
HELLO|1|A common word of greeting
HELPS|1|Gives assistance to someone
HENCE|4|For this reason; as a consequence
HENRI|3|The French form of a common male given name
HENRY|3|A masculine given name borne by eight English kings
HERBS|1|Plants used for flavoring food or in medicine
HICKS|3|Rural or unsophisticated people.
HIDES|2|Puts out of sight to avoid detection
HIGHS|3|The upper limits or peaks.
HILLS|2|Natural rises of land, lower than mountains
HINDI|2|The most widely spoken official language of India
HINDU|2|Relating to a major religion originating in India
HINTS|1|Small clues or suggestions
HIRED|2|Engaged someone for paid work
HIRES|2|Employs someone for wages or engages a service temporarily
HOBBY|1|An activity pursued for pleasure in one's spare time
HOGAN|4|A traditional dwelling used by the Navajo people, built of logs and earth.
HOLDS|2|Grasps and keeps in the hand
HOLES|2|Hollow openings or gaps in a surface
HOLLY|2|An evergreen shrub with spiky leaves and red berries, linked to Christmas.
HOMER|1|The bumbling patriarch of an animated TV family from Springfield
HOMES|1|Places where people live
HONDA|2|A major Japanese manufacturer of cars and motorcycles
HONEY|1|Sweet, sticky substance made by bees
HONOR|2|High respect or great esteem
HOOKS|1|Curved devices used for catching or hanging things
HOOPS|2|Circular rings, as used in basketball or worn as earrings
HOPED|2|Wished for something with expectation, in the past
HOPES|3|Expectations and desires for something to happen
HORNS|2|Hard pointed growths on the heads of cattle or goats
HORNY|3|Irritable or angry, as a bull
HORSE|1|Large four-legged animal often ridden or used to pull loads
HOSTS|3|People who receive and entertain guests
HOTEL|1|An establishment providing paid lodging for travelers
HOURS|3|Periods of sixty minutes each
HOUSE|2|A building for living in
HTTPS|3|Secure prefix at the start of many web addresses
HUMAN|2|A member of our own species
HUMID|1|Containing a high amount of moisture in the air
HUMOR|2|The quality of being amusing or comic
HURRY|2|To move or act with great haste
HURTS|2|Causes physical or emotional pain
HYDRO|3|A prefix or short word relating to water, especially as a source of power.
HYPED|2|Excited or enthusiastic.
HYPER|2|Extremely energetic or overexcited
ICING|1|A sweet sugary coating spread on a cake
ICONS|1|Small pictorial symbols representing programs or files on a screen
IDAHO|2|a northwestern US state famous for its potato farming
IDEAL|3|Most suitable; existing only as a flawless standard
IDEAS|2|Concepts or plans formed in the mind
IDIOT|1|A foolish or stupid person
IDOLS|2|Objects of worship, or people who are greatly admired
IMAGE|2|A visual representation of a person or thing
IMPLY|2|To suggest something without stating it directly
INBOX|1|The folder where incoming email messages are received
INDEX|2|Alphabetical guide at the back of a book
INDIA|1|South Asian country with capital New Delhi
INDIE|3|Independent, especially in music or film.
INLET|2|A narrow strip of water extending from a sea or lake into the land
INNER|2|Located on the inside or closer to the center
INPUT|3|Data or resources fed into a system
INTEL|3|Secret information gathered about an adversary (informal)
INTER|3|To place a dead body in the ground
INTRO|1|A short opening section of a piece of writing, music, or speech
IRAQI|2|Relating to the Middle Eastern country whose capital is Baghdad
IRENE|2|A common female first name of Greek origin, meaning 'peace'
IRISH|2|Relating to the people or culture of a certain Atlantic island nation
IRONY|3|A situation whose outcome is the opposite of what was expected
IRWIN|3|A surname associated with a famous wildlife expert.
ISAAC|1|A common English and biblical first name
ISLAM|2|A major world religion founded by the prophet Muhammad
ISLES|2|Small land masses surrounded by water.
ISSUE|2|An important topic or problem up for debate
ITALY|1|Boot-shaped country jutting into the Mediterranean Sea
ITEMS|2|Individual articles or units in a list or collection
IVORY|2|The hard white material from elephant tusks
JACOB|2|A male first name, and a biblical patriarch
JAIME|1|A common given name, often male.
JAMAL|3|A common male given name of Arabic origin meaning beauty
JAMES|2|A common English male given name
JAMIE|2|A unisex given name, a diminutive of James
JANET|1|A common female given name.
JAPAN|2|Island nation often called the Land of the Rising Sun
JARED|2|A biblical name from the Book of Genesis
JASON|3|Greek hero who sought the Golden Fleece
JEANS|1|Casual trousers made of sturdy denim
JELLY|1|A soft, semi-solid food made from fruit juice and sugar
JENNA|1|A female given name.
JENNY|1|A common English female given name
JERRY|3|A familiar short form of the names Gerald or Jerome
JESSE|3|A common first name, often male.
JESUS|1|Central figure of Christianity
JEWEL|1|A precious stone, often set in rings or necklaces
JIHAD|3|An Islamic concept of struggle, often for religious or moral ends
JIMMY|3|A short crowbar, especially one used by a burglar
JOHNS|2|Slang term for toilets, in plural form
JOINS|2|To connect or unite.
JOINT|2|Place where two bones meet
JOKER|2|A playing card that can represent any other card, often depicting a jester
JOKES|1|Things said or done to provoke laughter
JOLLY|1|Full of high spirits; cheerful.
JONAH|2|Old Testament prophet who spent three days inside a great fish.
JONAS|2|Surname of a pop trio of singing brothers, Nick, Joe, and Kevin
JONES|5|Slang for an intense craving or addiction
JORGE|3|A common male given name in Spanish-speaking countries.
JOYCE|2|A female given name meaning 'joyful', popular in the mid-20th century
JUDGE|1|An official who decides cases in a court of law
JUICE|1|The liquid extracted from fruit or vegetables
JUICY|1|Full of moisture and flavor, like ripe fruit
JULES|3|A male first name of French origin
JULIA|1|A common female first name.
JULIE|2|A common female first name
JUMPS|1|Leaps or springs suddenly into the air
KANYE|2|First name of an American rapper and producer known for albums like 'Graduation'
KAPPA|2|Tenth letter of the Greek alphabet, symbol κ
KAREN|2|A female given name, now slang for an entitled complainer
KARMA|2|The idea that one's actions determine future fortune
KATHY|1|A common female nickname
KATIE|1|A common female name.
KEEPS|2|Holds on to or continues to possess
KEITH|2|A masculine given name of Scottish origin
KELLY|3|A vivid, bright shade of green
KENNY|2|A common male given name.
KENYA|2|East African country whose capital is Nairobi
KERRY|2|An Irish county known for its rugged coastline and lakes
KEVIN|2|A male given name of Irish origin
KICKS|2|Strikes something forcefully with the foot
KILLS|2|Deprives of life
KINDA|3|Informal way of saying 'rather' or 'to some degree'
KINDS|2|Different sorts, types, or varieties of things
KINGS|1|Male sovereign rulers of nations
KIRBY|2|A pink, spherical video game hero created by Nintendo
KITTY|2|A young cat.
KLAUS|3|A common German male given name
KLEIN|3|A German surname meaning 'small'.
KNEES|2|The joints connecting the thighs to the lower legs
KNIFE|1|A cutting tool with a sharp blade and a handle
KNOCK|2|To strike a surface to attract attention
KNOTS|2|Tangled loops formed by tying rope or string together.
KNOWN|2|Recognized or established as fact by many
KNOWS|2|Is certain of as a fact (third person singular)
KOREA|2|East Asian peninsula nation, divided into North and South
KUALA|4|Malay word for the point where a river meets the sea or another river
KUDOS|2|Praise or credit for an achievement
KUMAR|3|A common South Asian surname or given name
KYLIE|1|A popular female name.
LABEL|1|Tag attached to an item giving information
LABOR|2|Hard physical or mental work
LACKS|2|Is without something needed or wanted
LADEN|2|Heavily loaded or weighed down with something
LAGOS|2|Nigeria's largest city and former capital
LAKES|1|Large inland bodies of fresh water
LAMAR|3|A surname often associated with notable figures.
LAMPS|1|Devices that produce light, often electric
LANCE|2|A long wooden spear once carried by knights on horseback
LANDS|2|Touches down after a flight
LANES|2|Narrow roads or paths.
LANKA|2|Island nation south of India, formerly known as Ceylon
LAPSE|2|A brief, temporary failure of memory, judgment, or standards
LARGE|2|Of considerable size or extent
LARRY|3|Common male given name, a short form of Lawrence
LASER|1|Focused light used in pointers and cutting tools
LASTS|2|Continues to exist or function over time
LATER|2|At a time after the present
LATIN|2|The ancient language of Rome
LAUGH|2|Make sounds and movements expressing amusement
LAURA|2|A common female given name
LAYER|2|A single thickness of material spread over a surface
LEADS|1|Guides others by going in front
LEAFS|3|Turns pages quickly while glancing at the content
LEAKS|2|Escapes through a crack or hole, as liquid or gas does
LEARN|1|To gain knowledge or skill through study or experience
LEASE|2|A contract renting property for a set period
LEASH|1|A cord or strap used to restrain and control an animal
LEAST|2|Smallest in amount, extent, or degree
LEAVE|1|Go away from a place
LEEDS|2|A city in West Yorkshire, England.
LEGAL|2|Permitted or recognized by law
LEGIT|2|Conforming to the rules; valid.
LEIGH|2|A common English given name or surname
LEMON|1|A yellow, sour citrus fruit
LEONE|3|Director famous for spaghetti Westerns, Sergio
LEVEL|2|A flat, even surface with no high or low spots
LEVER|1|A rigid bar pivoted on a fulcrum to lift or move loads
LEWIS|3|A surname shared by an author of Narnia and a boxing champion
LIARS|1|People who tell falsehoods
LIBYA|2|A North African nation bordering the Mediterranean Sea
LIFTS|1|Raises something to a higher position
LIGHT|1|Radiation that makes things visible to the eye
LIKED|2|Regarded with fondness or approval
LIKES|2|Finds agreeable or pleasant
LILLY|1|A type of flowering plant.
LIMBS|1|Arms and legs of the body
LIMIT|2|The greatest amount or extent that is allowed
LINDA|2|Common female given name meaning 'pretty' in Spanish
LINED|3|Ruled
LINEN|2|Fabric made from the flax plant.
LINER|2|A large passenger ship that travels a regular route
LINES|2|Long thin marks drawn on a surface
LINKS|2|Connections between two or more things
LINUX|2|An open-source operating system.
LIONS|1|Large African cats, the males wearing shaggy manes
LISTS|2|Series of items written one after another
LITER|1|Metric unit of volume
LITRE|1|Metric unit of volume equal to 1,000 cubic centimeters
LIVED|2|Resided in a place at some point
LIVER|2|The large internal organ that filters blood and makes bile
LIVES|3|What a cat is said to have nine of
LLOYD|2|A common male given name.
LOADS|2|Heavy burdens carried or supported
LOANS|2|Sums of money that are borrowed and must be repaid
LOBBY|2|An entrance hall or waiting area.
LOCAL|2|Relating to a particular nearby area or neighborhood
LOCKE|2|English philosopher known for ideas on natural rights and empiricism.
LOCKS|1|Devices used to fasten a door, opened with a key or combination
LODGE|2|A small house or cabin, often on an estate or in the countryside
LOGAN|2|A common given name for boys.
LOGIC|3|Reasoning conducted according to strict principles of validity
LOGIN|1|The credentials entered to access an online account
LOGOS|2|Distinctive symbols or emblems used to identify a brand.
LOOKS|2|Directs the eyes in order to see
LOOPS|2|Curved shapes that bend around and cross over themselves
LOOSE|2|Not firmly fixed in place; slack
LOPEZ|2|A common Spanish surname
LORDS|2|Men of noble rank or high office
LOSER|2|A person who is unsuccessful.
LOSES|3|Fails to win or keep something
LOTUS|2|An aquatic flowering plant symbolizing purity in many cultures
LOUIS|3|A French royal name borne by many kings
LOVED|2|Felt deep affection or fondness for
LOVER|2|A person in a romantic relationship with another
LOVES|2|Feels deep affection or strong liking for
LOWER|2|To let something down to a smaller height
LOYAL|2|Steadfastly devoted to a person or cause
LUCAS|3|A masculine given name of Latin origin
LUCIA|3|Popular Italian, Spanish, and Portuguese female name derived from the word for 'light'
LUCKY|1|Having or bringing good fortune
LUNAR|1|Relating to the moon
LUNCH|1|A meal eaten in the middle of the day
LUNGS|2|Organs used for breathing.
LYDIA|3|An ancient kingdom in western Asia Minor.
LYING|2|Resting flat, or telling deliberate untruths
LYNCH|3|To kill someone by mob action without any legal trial, typically by hanging
LYONS|2|A common Irish and English surname
LYRIC|2|A single line or verse from the words of a song.
MACRO|4|A single instruction that expands automatically into a set of instructions.
MADAM|2|A polite term of address for a woman.
MAFIA|2|An organized crime syndicate, especially one of Italian origin
MAGIC|2|The art of producing illusions or supernatural effects
MAILS|1|Sends items of correspondence through a postal system
MAINE|3|Northeasternmost U.S. state, with capital Augusta
MAINS|2|Primary pipes or cables supplying gas, water, or electricity to a building
MAJOR|2|Greater in importance, size, or rank.
MAKER|2|One who creates or manufactures something
MAKES|3|Creates or produces, in the third-person singular
MALES|3|Members of the sex that fathers offspring
MALIK|2|An Arabic given name meaning 'king'
MALTA|3|An island nation in the Mediterranean.
MANGA|2|Japanese comic books or graphic novels.
MANGO|1|A tropical fruit with a sweet taste.
MANLY|1|Having qualities traditionally associated with men, such as strength
MANNY|2|A male given name, often used as a diminutive
MANOR|2|A large house with land, historically owned by a lord
MAPLE|1|A tree known for its lobed leaves and sweet sap
MARCH|2|The third month of the year
MARCO|2|Famous Venetian explorer surnamed Polo
MARIA|2|Common female given name of Latin origin
MARIE|2|Female given name; the physicist Curie's first name
MARIO|1|Nintendo's mustachioed plumber hero
MARKS|3|Spots, stains, or scratches left on a surface
MARRY|2|To join together as husband and wife
MARSH|1|An area of low-lying land that is flooded in wet seasons
MASKS|1|Coverings worn over the face for protection, disguise, or performance
MASON|2|A worker skilled in building with stone or brick
MATCH|2|A sporting contest between two sides
MATER|3|An old-fashioned or informal British word for 'mother'
MATES|2|Friends or companions.
MATHS|1|The study of numbers, quantities, and shapes, informally
MATTE|2|Having a dull, non-shiny surface finish.
MAYBE|2|Possibly, but not certainly
MAYER|3|A surname that can refer to a notable person.
MAYOR|2|The elected head of a town or city council
MCCOY|4|An expression meaning 'the real thing'.
MCKAY|3|A Scottish surname of clan heritage
MEALS|1|Occasions of eating, such as breakfast and dinner
MEANS|3|A method or way of achieving a result
MEANT|3|Past tense of having an intention or purpose
MEATS|1|The edible flesh of animals, used as food
MEDAL|2|A metal disc given as an award for an achievement
MEDIA|2|Channels of mass communication, taken collectively
MEETS|2|Comes together with someone at a particular place or time
MEGAN|1|A popular female given name
MEMES|2|Humorous images or ideas that spread rapidly online
MERCY|2|Compassion shown toward an offender or enemy
MERGE|1|To combine or blend two or more things into one
MERIT|3|The quality of being good and deserving of praise
MERRY|1|Full of cheerfulness and high spirits
MESSI|2|Argentine footballer widely regarded as one of the greatest ever
MESSY|1|Untidy or disorganized
METAL|1|A hard, shiny material such as iron or gold
METER|2|A metric unit of length just over three feet
METRE|4|The rhythmic structure of a line of poetry
METRO|2|An urban underground railway system
MEYER|2|A surname of German origin, historically denoting a farm steward or tenant.
MIAMI|2|Coastal resort city in southeastern Florida
MICRO|3|Extremely small in scale or size
MIDST|2|The middle part or central point of something
MIGHT|3|Great physical strength or power
MILAN|3|Italian fashion capital in Lombardy
MILES|2|Units of distance, each equal to 1,760 yards
MILEY|5|A famous singer and actress known for her pop music.
MILKY|1|Resembling a pale, opaque white liquid; cloudy in color
MILLS|3|Buildings fitted with machinery for grinding grain or making cloth
MIMIC|2|To copy someone's speech or actions, often for comic effect
MINDS|3|The parts of people that think, feel, and reason
MINER|1|A person who extracts ore or coal from the ground
MINES|2|Underground excavations from which ore or coal is dug
MINOR|2|Of little importance or seriousness
MINUS|2|Indicating subtraction.
MITCH|3|a common informal short form of a boy's first name
MIXED|2|Blended together and not uniform
MIXER|2|A machine or appliance used to blend ingredients
MIXES|2|Combines different things together thoroughly.
MODEL|2|A small-scale representation of an object
MODES|2|Ways or manners of doing something
MOIST|1|Slightly wet; damp.
MOLLY|1|A common female first name, often short for Mary
MOMMY|1|An affectionate word for one's mother
MONEY|2|A medium of exchange used to buy goods and services
MONKS|2|Men who have devoted their lives to religious duties, often living in an abbey
MONTE|3|Spanish and Italian word for 'mountain', common in place names.
MONTH|1|One of the twelve parts of a year
MONTY|3|A common British nickname for men named Bernard, or a famed WWII field marshal
MOODY|2|Given to sudden, unpredictable shifts in temper
MOORE|3|Surname shared by actresses Demi and Julianne
MOOSE|1|A large deer with palmate antlers.
MORAL|3|Concerned with principles of right and wrong
MORON|1|An offensive term for a very foolish or stupid person
MORSE|2|A code of dots and dashes used to transmit letters.
MOSES|3|A biblical figure known for leading the Exodus.
MOTEL|2|A roadside hotel.
MOTOR|2|A machine that supplies power to drive a vehicle
MOTTO|2|A short sentence or phrase expressing a guiding principle
MOULD|2|Fungal growth that forms on damp or decaying matter
MOUND|2|A raised area of earth or soil.
MOUNT|3|To climb onto, or to fix something firmly in place
MOUSE|1|Small long-tailed rodent that squeaks
MOUTH|1|Facial opening used for eating and speaking
MOVED|3|Changed location, or was stirred emotionally (past tense)
MOVES|2|Changes position; also a dancer's steps
MOVIE|1|Film
MUDDY|2|Covered with or full of mud.
MULTI|3|A combining form meaning many or more than one
MUMMY|2|A preserved body from ancient Egypt.
MURAL|1|A large picture painted directly onto a wall or ceiling
MUSIC|1|Arranged sounds of melody, harmony, and rhythm
MYERS|3|Comedic actor known for playing Austin Powers and voicing Shrek.
MYTHS|2|Traditional stories, especially ones explaining natural phenomena or featuring gods and heroes
NAILS|1|Thin pointed metal pins used to fasten things.
NAIVE|2|Showing a lack of experience, wisdom, or judgment
NAKED|1|Wearing no clothes
NAMED|2|Gave a particular title or designation to
NAMES|2|Words by which people or things are known
NANCY|2|A feminine given name
NANNY|2|A person employed to care for children.
NAOMI|2|A female given name of Hebrew origin meaning 'pleasantness'
NASAL|2|Relating to or affecting the nose
NASTY|2|Highly unpleasant, spiteful, or offensive
NAVAL|2|Relating to a country's warships and fleet
NAZIS|2|Members of the fascist party that ruled Germany under Hitler
NEEDS|2|Requires something as essential
NEEDY|1|Lacking the necessities of life; poor
NEGRO|3|Dated and now offensive term once used for a Black person.
NEPAL|2|Himalayan country between India and China, home to Mount Everest
NERVE|2|Fiber that carries impulses between the brain and body
NEVER|2|Not at any time.
NEWER|2|More recently made or created, compared to another
NEWLY|2|Only just; not long ago.
NEXUS|3|A central connection linking many parts of a network
NICER|1|More pleasant or agreeable, comparative form
NICHE|3|A specialized segment of the market suited to a particular product
NICKY|3|Diminutive form of the name of a famous gift-giving saint
NIECE|1|Your sibling's daughter
NIGEL|2|A common British male first name
NIGER|2|Landlocked West African country whose capital is Niamey
NIGGA|5|Informal slang term for a person (contextually sensitive)
NIGHT|1|The period of darkness between sunset and sunrise
NIKKI|2|A common short form of the name Nicole
NINJA|2|A highly trained covert operative from feudal Japan
NINTH|2|Coming right after the eighth in a series
NIXON|3|37th President of the United States, who resigned in 1974
NOBEL|3|Swedish inventor of dynamite who endowed a famous international prize
NOBLE|2|Having high moral qualities or fine ideals
NODES|2|Points where lines, paths, or connections intersect
NOISE|1|A loud or unpleasant sound
NOISY|1|Making or characterized by a lot of sound
NOKIA|3|Finnish company famous for classic, durable mobile phones like the 3310
NOLAN|3|Surname of the director known for 'Inception' and 'Interstellar'
NORMS|2|Standard or accepted patterns of behavior within a group
NORTH|2|The direction toward the top of most maps
NOSES|1|Facial organs used for smelling and breathing
NOTCH|2|A V-shaped cut or indentation in an edge or surface
NOTED|3|Well known and widely admired
NOTES|2|Brief written records, or single musical tones
NOTRE|3|French word for 'our', as in a famous Paris cathedral's name
NOVEL|2|A long written work of fiction
NURSE|1|Person trained to care for the sick or injured
OASIS|2|A fertile spot in a desert where water is found.
OBAMA|2|The 44th President of the United States
OBESE|2|Having excessive body fat
OCCUR|2|To happen or take place
OCEAN|1|A vast expanse of salt water covering much of the globe
ODDLY|2|In a strange or unusual manner.
OFFER|2|To present something for acceptance or refusal
OFTEN|2|On many occasions; again and again
OLDER|2|Greater in age than someone or something else
OLIVE|2|A small oval fruit pressed for its oil
OMAHA|3|A city in Nebraska.
OMEGA|2|The last letter of the Greek alphabet
ONION|1|A pungent edible bulb vegetable with layered rings
ONSET|2|The beginning or start of something, especially something unpleasant
OPENS|2|Unfastens or makes accessible
OPERA|2|A dramatic work in which the words are sung to music
OPIUM|2|an addictive drug derived from poppy sap
OPRAH|2|First name of the American talk-show host and media mogul Winfrey
OPTED|2|Made a choice in favor of something
OPTIC|3|Relating to the eye or to vision
ORBIT|3|The path of a celestial body around another body.
ORDER|2|A direction or command given by someone in authority
ORGAN|2|A body part with a specific function, such as the heart
OSAKA|2|A major city in Japan.
OSCAR|2|Golden statuette awarded by the Academy for film achievement
OTHER|2|Different from or not the one already mentioned
OUGHT|3|To be morally obliged or expected to do something
OUNCE|2|A unit of weight equal to one sixteenth of a pound
OUTER|2|Situated on the outside; furthest from the center
OUTTA|4|Slangy contraction meaning 'away from' or 'lacking'
OVERS|3|In cricket, a set of six deliveries.
OWENS|3|Surname of the athlete who won four golds at the 1936 Berlin Olympics
OWING|2|Still to be paid; due as a debt.
OWNED|2|Held legal possession of something
OWNER|2|Person who holds legal title to a piece of property
OXIDE|3|A binary chemical compound formed between oxygen and another element
PABLO|2|First name of the painter Picasso
PACED|2|Moved at a steady speed.
PACKS|2|Groups of wild animals, such as wolves, that hunt together
PADDY|2|A flooded field used for growing rice
PAGAN|4|A person holding religious beliefs outside the main world religions.
PAGES|2|Sheets of a book, each side numbered
PAIGE|2|A feminine given name, a variant of Page
PAINS|1|Physical suffering or discomfort, plural form
PAINT|1|Apply colored liquid to a surface
PAIRS|2|Sets of two matching things
PALMS|1|The inner surface of the hands.
PANDA|1|A large black-and-white bear native to China that feeds mainly on bamboo
PANEL|3|A flat section forming part of a surface
PANIC|1|Sudden, overwhelming fear
PANTS|1|A garment covering each leg separately
PAPER|1|Thin material made from pulp, used for writing
PARIS|1|The capital city of France
PARKS|1|Public areas of green space set aside for recreation
PARTS|2|Separate components that make up a whole
PARTY|1|A social gathering held for fun or celebration
PASTA|1|Italian food made from dough, shaped into forms like spaghetti or penne.
PASTE|2|A soft, moist, sticky mixture
PATCH|2|A small piece of material used to cover a hole
PATEL|3|A very common Indian surname, especially prevalent in Gujarat
PATHS|2|Routes or ways to follow.
PATTY|2|A small flat cake of ground meat or vegetables.
PAULA|3|A common feminine given name
PAULO|2|Common Brazilian and Portuguese first name
PAUSE|2|To temporarily stop.
PAVED|2|Covered with a hard, smooth surface for walking or driving
PAYNE|3|Surname of the title character in a noir video game series
PEACE|1|Freedom from war or conflict
PEACH|1|A soft, fuzzy-skinned stone fruit with sweet, juicy flesh
PEAKS|1|The highest points of mountains
PEARL|1|A smooth, round gem formed inside an oyster
PEDAL|1|A foot-operated lever, as on a bicycle or piano
PEDRO|3|The Spanish version of the name Peter
PEERS|2|Individuals of similar status or age.
PEGGY|1|Common female given name
PENAL|3|relating to punishment imposed by law
PENCE|2|British coins worth one hundredth of a pound
PENIS|2|The male organ of reproduction and urination
PENNY|1|A small coin of very low value
PERCY|2|A traditional British male first name
PEREZ|2|A common Spanish-language surname meaning 'son of Pedro'.
PERKS|2|Extra benefits given with a job besides salary
PERRY|4|An alcoholic drink made from fermented pears
PERTH|2|Capital city of Western Australia
PETER|2|A common male first name
PETTY|3|Of little importance or concerned with minor matters
PHASE|2|A distinct stage in a process or cycle
PHONE|1|Handheld device for making calls
PHOTO|1|An image captured with a camera
PIANO|1|Keyboard instrument whose hammers strike strings
PICKS|2|Selects or chooses from a group
PIECE|1|A portion or part separated from a whole
PIERS|2|Structures built out over water, used for docking boats or strolling
PILES|2|A collection of things stacked together.
PILLS|1|Small tablets of medicine meant to be swallowed
PILOT|1|Person who flies an aircraft
PINCH|2|A small amount of something, especially a seasoning, taken between finger and thumb
PIPES|1|Tubes used to carry water, gas, or other fluids
PITCH|2|Throw of a ball toward the batter
PIVOT|2|The central point on which a mechanism turns
PIXEL|2|The smallest single point of color in a digital image
PIZZA|1|Italian dish of baked dough with toppings
PLACE|2|A position or location
PLAIN|1|Simple and without decoration
PLANE|1|A powered aircraft with fixed wings
PLANK|1|a long, flat piece of sawn timber
PLANS|2|Detailed proposals for achieving something
PLANT|2|A living organism that grows in soil and makes its own food
PLATE|1|A flat dish from which food is eaten or served
PLAYS|2|Takes part in a game, or performs on an instrument
PLAZA|1|An open public square in a town or city
PLEAD|1|To make an earnest and emotional appeal
PLEAS|2|Urgent and emotional requests for something
PLOTS|3|Small pieces of land marked out for building or planting
PLUGS|1|Electrical connectors for devices
POEMS|2|Pieces of writing arranged in rhythmic lines
POETS|1|Writers of verse, plural
POINT|2|A sharp tip, or a single item on a list
POKER|2|A card game often played for money.
POLAR|2|Relating to the very cold regions at the top and bottom of the Earth
POLES|2|Long, slender rods often used for support or skiing
POLLS|2|Surveys sampling public opinion
PONDS|1|small, still bodies of water
POOLS|1|Small bodies of still water
POPPY|2|A flowering plant often associated with remembrance.
PORCH|1|A covered platform attached to the entrance of a house
PORTS|2|Coastal towns where ships load and unload
POSED|2|Presented in a particular stance, especially for a picture
POSES|2|Presents or creates, as with a problem or question
POSTS|2|Upright stakes driven into the ground
POUND|3|The basic monetary unit of the United Kingdom
POWER|2|The ability to act, or the energy that runs machines
PRANK|1|A mischievous practical joke
PRATT|5|A foolish or incompetent person.
PRESS|2|To push firmly against a surface
PRICE|2|The amount of money required to buy something.
PRICK|2|To pierce or make a small hole.
PRIDE|2|A feeling of deep satisfaction in one's achievements
PRIME|2|Of the first importance or best quality
PRINT|2|To produce text or images on paper using a machine
PRIOR|3|Existing or coming before in time
PRIVY|2|Having secret or confidential knowledge of something
PRIZE|1|A reward given for victory or achievement
PROBE|3|To investigate thoroughly.
PROMO|2|A short advertisement used to publicize a product or event
PRONE|2|Lying flat, face downward
PROOF|2|Evidence that establishes the truth of something
PROPS|2|Objects used by actors on a stage or film set
PROSE|2|Ordinary written or spoken language, as opposed to verse
PROUD|2|Feeling deep satisfaction in one's own achievements
PROVE|2|To demonstrate the truth of something with evidence
PROXY|3|A person or thing authorized to act on behalf of another
PSALM|3|A sacred song or hymn.
PSYCH|2|To mentally prepare oneself for something difficult or intimidating (informal).
PULLS|2|To exert force to move something towards oneself.
PULSE|2|The rhythmic beat of the arteries as the heart pumps blood
PUMPS|2|Low, slip-on shoes with a low heel
PUNCH|2|A blow delivered with a closed fist
PUPIL|1|A student who is taught by a teacher
PUPPY|1|A young dog.
PURGE|2|Remove unwanted elements
PURSE|1|A small bag used to carry money and personal items
PUTIN|2|Long-serving Russian president (surname)
QAEDA|4|The second word in the name of a militant network founded by Osama bin Laden
QATAR|2|Gulf nation that hosted the 2022 World Cup
QUAKE|3|To shake or tremble violently, as the ground during a tremor
QUASI|3|Seemingly but not really; having some resemblance to
QUEEN|1|A female ruler of a kingdom
QUEER|2|Strange or odd in character
QUERY|2|A question, especially one expressing doubt
QUEST|2|A long and determined search for something
QUEUE|1|A line of people waiting their turn
QUICK|2|Moving or done with speed
QUIET|1|Making little or no noise
QUINN|3|Irish surname borne by film actor Anthony, star of 'Zorba the Greek'
QUITE|3|To a fairly considerable degree
QUOTA|2|A fixed minimum or maximum amount allowed or required
QUOTE|2|Repeat words taken from a text or speaker
QURAN|2|The central religious text of Islam
RABBI|2|A Jewish scholar or religious leader
RACED|2|competed in speed.
RACER|1|One who competes in a speed contest
RACES|2|Contests to determine who is fastest
RADAR|2|A system that uses radio waves to detect the position of distant objects
RADIO|2|A device for receiving broadcast sound transmissions
RAIDS|2|Sudden attacks or surprise incursions
RAILS|2|Parallel metal bars that guide a train
RAINS|1|Falls as water from the clouds
RAINY|1|Marked by frequent precipitation
RAISE|1|To lift to a higher position
RALLY|2|A mass meeting held in support of a cause
RALPH|3|Traditional English male first name
RAMOS|3|Surname of a famous Spanish footballer nicknamed 'Sergio'
RANCH|2|A large farm for raising livestock.
RANDY|3|Feeling strong sexual desire.
RANGE|2|The extent or scope between two limits
RANKS|3|Positions within a hierarchy or ordered series
RAPED|5|Subjected someone to a violent sexual assault
RAPID|2|Happening or moving with great speed
RATED|3|Assigned a level, score, or grade to something
RATES|3|Measures of frequency or amounts charged per unit
RATIO|3|Quantitative relation between two amounts
RAVEN|2|A large, glossy black bird known for its intelligence
RAZOR|2|A sharp-edged tool used for shaving hair
REACH|2|To stretch out so as to touch or grasp
REACT|2|To behave in a particular way in response to something
READS|2|Looks at and understands written words
READY|2|In a fit state for action or use
REALM|3|A domain or kingdom ruled by a monarch
REBEL|2|One who rises against established authority
RECAP|1|To summarize briefly
REESE|2|A short, unisex first name
REFER|2|To mention or allude to something
REHAB|2|A program to recover from addiction or injury
REICH|3|German word for 'empire' or 'realm', historically linked to Nazi Germany
REIGN|3|The period during which a monarch holds the throne
RELAX|1|Rest and become less tense
RELAY|2|A race in which team members take turns covering part of the distance
REMIX|3|To alter a piece of music.
RENEW|2|To extend or reactivate something for a further period
RENTS|2|Payments made periodically for the use of property.
REPAY|2|To give back money that was previously borrowed.
REPLY|2|To respond to a message or question
RESET|1|To restore something to its original condition
RESIN|3|A sticky substance produced by some trees.
RESTS|1|Stops working or sits down to relax
RETRO|2|Imitating a style or fashion from the recent past
RHINO|4|Large mammal with a horn
RHODE|3|US state name that precedes 'Island'
RHYME|2|Correspondence of sound between words.
RICKY|2|A casual nickname often short for Richard or Enrique
RIDER|1|One who travels on a horse, bike, or similar vehicle
RIDES|2|Journeys on a vehicle or animal; also fairground attractions
RIDGE|2|A long, narrow crest of a hill or mountain
RIFLE|2|A long-barrelled firearm fired from the shoulder
RIGHT|1|Correct or true.
RIGID|2|Not able to bend or be forced out of shape; stiff
RILEY|2|A popular unisex first name of Irish origin
RINGS|2|Circular bands of metal worn on the fingers
RINSE|1|To wash something with clean water to remove soap or dirt
RIOTS|2|Violent public disturbances involving crowds of people.
RISEN|2|Having moved upward or increased
RISES|2|Moves upward or gets to one's feet
RISKS|3|Possibilities of loss, harm, or danger
RISKY|1|Involving the possibility of danger or loss
RIVAL|2|A competitor striving to outdo another
RIVER|1|A large natural stream of water flowing to the sea
ROADS|1|Paved routes built for vehicles to travel between places
ROAST|1|To cook food, especially meat, using dry heat in an oven or over a fire.
ROBIN|2|A small songbird known for its red or orange breast
ROBOT|1|A machine that can carry out tasks automatically
ROCKS|2|Large stones or masses of mineral
ROCKY|2|Full of stones or boulders
RODEO|2|A competitive event featuring bronco riding and roping
ROGER|3|Radio confirmation meaning 'message received and understood'
ROGUE|2|A dishonest or unprincipled person; a scoundrel
ROLES|2|The parts actors play in a film or stage production
ROLLS|2|Moves along by turning over and over
ROMAN|2|Relating to ancient Rome or its empire
ROMEO|2|Shakespeare's tragic young lover of Juliet
ROOFS|2|The upper covering of a building.
ROOMS|1|Spaces enclosed by walls within a building
ROOTS|1|The underground parts of a plant that absorb water
ROPES|1|Thick cords used for tying, pulling, or climbing
ROSES|2|A type of flowering plant often associated with love.
ROSIE|3|A common feminine name.
ROUGE|2|A red cosmetic powder applied to the cheeks
ROUGH|1|Having an uneven or coarse surface
ROUND|1|Shaped like a circle or ball
ROUTE|2|The course taken to get from one place to another
ROVER|3|A vehicle built for travel across rough or extraterrestrial terrain
ROYAL|1|Relating to a king or queen
ROYCE|2|A surname often associated with a luxury car brand.
RUBIO|3|Surname of an American senator and former presidential candidate
RUGBY|2|Team sport played with an oval ball and scrums
RUINS|2|Remains of something destroyed or decayed.
RULED|3|Exercised authority or control over a place or people
RULER|1|A flat, marked stick used for measuring or drawing straight lines
RULES|2|Official regulations that govern conduct or play
RUMOR|2|Unverified information spread from person to person
RURAL|2|Relating to the countryside rather than the city
RUSTY|1|Covered with a reddish-brown corrosion from exposure to moisture
RYDER|3|The surname behind a famous biennial golf trophy contested by the US and Europe
SACKS|2|large bags.
SADLY|2|In a manner full of sorrow; regrettably
SAFER|3|More free from danger or risk
SAILS|1|Fabric sheets that catch the wind to propel a boat
SAINT|2|A holy person formally recognized by the church
SALAD|1|A cold dish of raw vegetables, often dressed
SALEM|2|Massachusetts city famous for 17th-century witch trials
SALES|2|Exchanges of goods or services for money
SALLY|3|A sudden charge out of a besieged place.
SALON|1|A business offering beauty treatments such as haircuts or manicures.
SALSA|1|A spicy tomato-based sauce often served with tortilla chips
SALTY|1|Having a briny, savory taste
SAMMY|1|A diminutive form of the name Samuel.
SANDS|1|Stretches of fine granular shore material.
SANDY|2|Covered with or full of fine beach grains
SANTA|1|Jolly figure in red who delivers gifts at Christmas
SARAH|3|A common female given name; the wife of Abraham in the Bible
SASHA|3|A common Russian nickname, short for Alexander or Alexandra
SATAN|2|The chief evil spirit in Christian and Jewish tradition
SAUCE|1|A liquid or thick dressing served with food
SAUDI|3|Relating to the large kingdom on the Arabian Peninsula
SAVED|1|Rescued from danger, in the past
SAVES|2|Rescues from harm, or sets money aside for later
SAVVY|3|Having practical knowledge or understanding.
SAXON|4|A member of a Germanic people.
SAYIN|3|Casual, apostrophe-dropped form of a word meaning to speak or state something
SCALE|3|Device used for measuring weight
SCALP|1|The skin covering the top of the head
SCANS|2|Examines something quickly and systematically
SCARE|2|To cause sudden fear in someone
SCARF|1|A strip of fabric worn around the neck for warmth or style.
SCARS|1|Marks left on skin after a wound heals
SCARY|1|Causing fright or alarm
SCENE|2|A single section of a play or film
SCENT|1|A distinctive smell, especially a pleasant one
SCOOP|2|A shovel-shaped utensil used for serving food
SCOPE|2|The extent or range of a subject or activity
SCORE|2|The number of points earned in a game
SCOTS|2|The people native to the northern nation famous for kilts and bagpipes
SCOTT|4|Surname of the British explorer who reached the South Pole in 1912
SCOUT|2|To explore an area to gather information.
SCRAP|1|A small piece or amount left over from something
SCREW|2|A threaded metal pin used to join materials
SCRUB|1|To clean a surface vigorously by rubbing
SEALS|1|Aquatic mammals with flippers that bark and bask on rocky shores.
SEARS|2|Burns the surface of quickly with high heat
SEATS|1|Places arranged for people to sit
SEDAN|2|A type of car with a separate trunk.
SEEDS|1|Small objects from which new plants grow
SEEKS|2|Looks for or tries to obtain
SEEMS|2|Gives the impression of being
SEIZE|2|To grab suddenly and forcibly
SELLS|2|Exchanges goods for money
SENDS|2|Causes to go or be delivered to a destination
SENSE|2|A faculty such as sight, smell, or hearing
SEOUL|2|Capital city of South Korea
SERUM|3|The clear liquid part of blood, or an antibody-rich fluid used in treatment
SERVE|2|To provide food or assistance to others
SETUP|2|The way equipment or things are arranged
SEVEN|1|The number that comes after six
SEWER|2|An underground pipe or channel that carries away wastewater
SHADE|3|A slight variation of a color
SHADY|1|Sheltered from direct sunlight
SHAFT|2|A long vertical or sloped passage inside a building or mine
SHAKE|2|To move quickly back and forth or up and down
SHAKY|1|Trembling or unsteady, likely to give way.
SHALE|3|Fine-grained sedimentary rock that splits into thin layers
SHALL|4|Modal verb expressing strong intention or future certainty
SHAME|3|A painful feeling of humiliation caused by wrong or foolish behavior
SHANE|2|A male first name of Irish origin
SHAPE|1|The external form or outline of something
SHARE|2|To divide something and give portions to others
SHARK|1|Large predatory cartilaginous fish of the sea
SHARP|1|Having a fine cutting edge or point
SHAUN|3|A common male given name.
SHAVE|1|To remove hair close to the skin with a blade
SHAWN|2|A common male first name, variant of Sean.
SHEDS|1|Small outbuildings used for storage or shelter
SHEEP|1|Woolly farm animal that bleats
SHEER|3|Complete and utter; often used to emphasize.
SHEET|1|Large rectangular piece of fabric for a bed
SHELF|1|A flat board for storing items.
SHELL|2|The hard protective outer covering of an egg, nut, or sea creature
SHIFT|3|To change the position, direction, or arrangement of something
SHINE|2|To give out or reflect bright light
SHINY|1|Reflecting light brightly; glossy
SHIPS|1|Large vessels that carry people or cargo across the sea
SHIRE|2|A British county, or a large breed of draft horse
SHIRT|1|A garment for the upper body, often with a collar and buttons
SHITS|3|A crude, vulgar term for feces or the act of defecating
SHOCK|2|A sudden upsetting or surprising event
SHOES|1|Footwear worn on the feet
SHOOK|2|Trembled or moved rapidly back and forth (past tense)
SHOOT|2|To launch a projectile from a weapon
SHOPS|2|Retail establishments where goods are sold
SHORE|2|The strip of land along the edge of a sea or lake
SHORT|1|Of small length, height, or duration
SHOTS|2|Attempts to score, or small measures of strong drink
SHOUT|2|To call out loudly with the voice
SHOVE|1|To push roughly
SHOWN|3|Presented or made visible to others
SHOWS|2|Theatrical or televised performances.
SHUTS|1|Closes something firmly
SIDED|2|Took a position in support of one party in a dispute
SIDES|2|The left and right edges or surfaces of an object
SIEGE|3|A military operation to capture a place by surrounding and blockading it
SIGHT|2|The faculty or power of seeing
SIGMA|2|The eighteenth letter of the Greek alphabet
SIGNS|2|Boards displaying information or directions
SILLY|2|Lacking good sense; absurd or ridiculous
SILVA|2|A common Portuguese-language surname
SIMON|3|A male given name; the leader in a children's imitation game
SINAI|2|A peninsula in Egypt linking the continents of Africa and Asia.
SINCE|2|From a particular time in the past.
SINGH|3|A common surname among Sikhs.
SINGS|1|Produces musical sounds with the voice
SINKS|2|Goes down below the surface, as a ship might
SIREN|1|A loud warning signal
SITES|2|Places where buildings stand or events take place
SIXTH|2|Coming after fifth in a sequence
SIXTY|1|The number equal to six times ten
SIZED|3|Made or measured to a particular dimension
SIZES|2|Measurements indicating how big or small things are
SKATE|1|To glide smoothly over ice or a surface on blades or wheels
SKIES|1|The upper atmosphere as seen from the ground, plural
SKILL|1|The ability to do something well.
SKINS|2|Outer coverings of fruits or animals
SKIRT|1|A garment that hangs from the waist down
SKULL|2|The bony framework enclosing the brain
SKYPE|2|A popular video-calling and messaging service
SLACK|2|Not tight or taut; loose
SLAIN|3|Killed, especially in battle or violently
SLAMS|2|Shuts something forcefully and loudly
SLANG|2|Informal language often used in specific groups.
SLASH|2|To cut with a sweeping stroke of a blade
SLATE|3|A fine-grained grey rock split into thin layers, used for roofing
SLAVE|2|A person owned by another and forced to work without pay
SLEEP|2|Natural state of rest with reduced consciousness
SLEPT|2|Rested in unconsciousness, as through the night
SLICE|2|To cut into thin pieces.
SLICK|2|Smooth, glossy, and often cleverly skillful
SLIDE|2|To move smoothly along a surface
SLIPS|2|To slide unintentionally.
SLOPE|1|A surface with one end higher than the other
SLOTS|2|Narrow openings for inserting something, such as coins
SMACK|2|A sharp slap delivered with the palm of the hand
SMALL|1|Of little size
SMART|2|Showing quick intelligence
SMASH|2|To break something violently into pieces
SMEAR|2|To spread a soft, sticky, or greasy substance across a surface
SMELL|1|Perceive an odor through the nose
SMILE|1|A pleased or friendly expression with upturned lips
SMITH|3|A worker who shapes metal by hammering and forging
SMOKE|1|Visible vapor rising from a fire
SNACK|1|A small amount of food eaten between main meals
SNAIL|1|A slow-moving, shelled garden mollusk
SNAKE|1|A long, legless reptile
SNAPS|2|Breaks suddenly with a sharp cracking sound
SNEAK|3|To move quietly to avoid detection.
SNOWY|2|Covered with frozen white flakes falling from the sky
SOBER|1|Not affected by alcohol; serious in manner
SOCKS|1|Items of clothing worn on the feet.
SOFIA|2|The capital city of Bulgaria
SOILS|2|The upper layer of earth.
SOLAR|2|Relating to or powered by the sun
SOLID|2|Firm and stable in form; neither liquid nor gas
SOLVE|1|To find the answer to a problem or puzzle.
SONGS|1|Short musical pieces meant to be sung
SONIA|3|A feminine first name of Slavic origin, a variant of Sophia
SONIC|3|Relating to sound waves
SONNY|2|An informal, often patronizing way to address a young man or boy
SOOOO|3|An informal way of writing a common intensifier with extra letters added for emphasis
SORRY|2|Feeling regret or remorse over something
SORTS|2|Arranges items into groups or categories
SOULS|2|The spiritual parts of people, said to outlast the body
SOUND|1|Something that is heard; a noise
SOUTH|2|The direction opposite to north
SPACE|2|The boundless region beyond Earth's atmosphere.
SPAIN|1|European nation with Madrid as its capital
SPANS|2|Extends across or covers a distance or period of time
SPARE|2|Kept in reserve for future use
SPARK|3|A small particle of fire.
SPEAK|1|To say words aloud in order to convey something
SPEAR|1|A long pointed weapon meant for throwing or thrusting
SPECS|2|Detailed technical requirements for a product, or an informal word for eyeglasses
SPEED|1|The rate at which something moves
SPELL|2|An incantation believed to have magical power
SPEND|1|To pay out money on goods or services
SPENT|3|Used up, with nothing left
SPERM|2|The male reproductive cell in animals
SPICE|1|An aromatic substance used to flavor food
SPICY|1|Having a hot, pungent flavor
SPIES|2|People who secretly gather information for a government
SPIKE|2|A sharp pointed object, or a sudden sharp increase
SPILL|1|To cause liquid to flow out of a container accidentally
SPINE|2|The column of bones running down the back
SPINS|1|Turns round and round quickly
SPITE|3|A desire to hurt, annoy, or offend.
SPLIT|2|Break or separate into parts
SPOIL|1|To ruin or damage something, or to indulge someone excessively.
SPOKE|2|Uttered words aloud, in the past
SPOON|1|A utensil with a shallow bowl for eating or serving food
SPORT|2|A competitive physical activity governed by rules
SPOTS|2|Small round marks differing in color from their surroundings
SPRAY|2|A fine mist of liquid droplets driven through the air
SPREE|3|A lively outing or celebration.
SPURS|3|Metal devices worn on boots to urge a horse forward.
SQUAD|2|A small group organized for sport or military action
SQUAT|2|To lower the body by bending the knees while keeping the back straight.
STACK|2|A pile of objects.
STAFF|2|The people employed by an organization
STAGE|2|A raised platform for performances, or a phase in a process
STAIN|1|A discolored mark that is hard to remove
STAKE|2|A pointed post driven into the ground as a support or marker
STALK|3|To follow someone secretly and persistently, often with unwanted attention
STALL|2|To delay or put off deliberately
STAMP|2|A small adhesive label showing postage has been paid
STAND|1|To be upright on one's feet
STARE|1|To look fixedly at something for a long time
STARK|3|Severe or bare in appearance.
STARS|1|Distant suns that twinkle in the night sky
START|1|To begin doing or undertaking something
STASH|2|A hidden supply of something, or to hide it away
STATE|2|A condition or situation.
STATS|3|Informal term for collected numerical data and figures
STAYS|1|Remains in one place
STEAK|1|A slice of meat, typically beef.
STEAL|2|To take something without permission or right
STEAM|1|Water vapour given off by boiling liquid
STEEL|2|Strong alloy of iron and carbon
STEEP|2|Having a sharp incline.
STEER|2|To guide the direction of a vehicle or vessel
STEIN|3|A large mug, often ceramic, traditionally used for serving beer
STEMS|1|Plant parts that support leaves and flowers
STEPS|2|A flight of stairs, or actions taken in sequence
STERN|2|Strict, serious, and uncompromising in manner
STICK|1|A thin length of wood broken from a tree
STIFF|1|Not easily bent; rigid or hard to move
STILL|2|Up to and including the present time.
STING|2|To cause a sharp, burning pain
STINK|1|A strong, unpleasant smell
STINT|3|A fixed or limited period of time spent doing something.
STOCK|3|A share of ownership in a company
STOKE|2|To feed and stir up a fire
STOLE|2|Took something without permission
STONE|1|A small piece of rock
STOOD|2|Was upright on one's feet (past tense)
STOOL|1|A simple seat without a back or armrests
STOPS|1|Brings movement or action to an end
STORE|2|A place where goods are sold to the public
STORM|1|Violent weather with strong winds and heavy rain
STORY|1|An account of real or imagined events told for entertainment
STOUT|2|Solidly built and thickset in body.
STOVE|1|An appliance used for cooking food
STRAP|1|A narrow band of leather or fabric used to fasten or secure something
STRAW|2|Dried stalks of grain.
STRAY|2|Having wandered away from home or the right path
STRIP|3|To remove an outer covering or layer
STUCK|2|Unable to move or be moved from a position
STUDY|2|To learn about a subject by reading and thinking
STUFF|2|Unspecified material, objects, or belongings
STUMP|2|The base of a tree trunk left standing after the rest is cut down
STUNT|2|A dangerous feat performed to impress or entertain
STYLE|2|A distinctive manner of doing or expressing something
SUCKS|3|Draws in liquid or air by suction
SUDAN|2|African country whose capital is Khartoum
SUGAR|1|Sweet crystalline substance used to flavor food and drinks
SUING|2|Taking legal action against someone
SUITE|2|A connected set of rooms in a hotel
SUITS|3|The four categories of cards in a deck
SUNNI|2|Relating to the largest branch of Islam.
SUNNY|1|Characterized by bright sunlight.
SUPER|2|Excellent or first-rate
SURGE|2|A sudden powerful increase or forward movement
SUSAN|3|Female given name, as in a rotating 'lazy' serving tray
SUSHI|1|A Japanese dish of vinegared rice with fish or vegetables
SWAMP|1|A low-lying wetland with soft, waterlogged ground and thick vegetation.
SWEAR|3|Make a solemn promise, or use offensive language
SWEAT|2|Moisture released through the skin when hot or anxious
SWEEP|2|To clean a surface by brushing away dirt.
SWEET|1|Having the pleasant taste of sugar
SWELL|1|To increase in size or volume
SWEPT|2|Used a broom to clean a surface
SWIFT|2|Moving or able to move at great speed
SWINE|2|A pig, or a contemptible person
SWING|2|A hanging seat that children push back and forth
SWIPE|2|To take something quickly.
SWISS|2|Of the Alpine country famed for watches and chocolate
SWORD|2|A weapon with a long metal blade and a hilt
SWORE|2|Made a solemn promise or took an oath
SWORN|2|Bound by a solemn oath
SWUNG|1|Moved back and forth or in a curve, past tense
SYRIA|3|Middle Eastern country with capital Damascus
SYRUP|1|A thick, sweet liquid, often poured on pancakes
TABLE|1|Flat-topped piece of furniture supported by legs
TABOO|2|A subject avoided due to social or cultural convention
TAILS|2|The rear, moving parts of animals used for balance or signaling
TAKEN|3|Past participle meaning grasped or seized
TAKES|3|Seizes hold of; also a word for separate film recordings
TALES|2|Imaginative stories, especially ones told aloud
TALKS|1|Speaks or converses with others
TALLY|2|A current count or score of something
TAMIL|3|A Dravidian language spoken in southern India and Sri Lanka
TAMPA|2|A major city on the Gulf Coast of Florida.
TANGO|2|A passionate dance originating from Argentina.
TANKS|2|Armored military combat vehicles that move on tracks
TAPED|2|Fastened with an adhesive strip, or recorded for later playback
TAPES|1|Strips of adhesive material, or old-fashioned magnetic recordings
TASKS|2|Pieces of work to be completed
TASTE|2|The sensation of flavour perceived on the tongue
TASTY|1|Having an appealing, pleasant flavor.
TAXED|2|Had a compulsory financial charge imposed on it
TAXES|1|Compulsory charges a government collects on income or goods
TEACH|2|To impart knowledge or skill to someone
TEAMS|2|Groups of people working or playing together (plural)
TEARS|2|Drops of salty liquid that flow from the eyes
TEASE|2|To make fun of or provoke in a playful way.
TEDDY|1|A soft stuffed toy in the shape of a bear
TEENS|2|Adolescents
TEETH|1|The hard white structures in the mouth used for biting and chewing
TELLS|2|Communicates information to someone by speaking
TEMPO|2|The speed or pace at which a piece of music is played
TENDS|3|Looks after; or is inclined toward
TENSE|2|Feeling or showing nervous strain
TENTH|1|Coming after ninth and before eleventh in a sequence.
TENTS|2|Portable shelters made of fabric.
TERMS|3|The stated conditions of an agreement
TERRY|4|Looped pile fabric used to make towels and bathrobes
TESLA|3|Serbian-American inventor famous for alternating-current electrical systems.
TESTS|2|Procedures used to assess knowledge or quality
TEXAS|2|The Lone Star State of the USA
TEXTS|2|Written works or printed documents
THANK|2|To express gratitude to a person
THEFT|1|The act of stealing another's property
THEIR|3|Belonging to them
THEME|2|The central subject of a work or discussion
THERE|2|In or at that place
THESE|3|Plural form used for nearby people or things
THICK|2|Having a large distance between opposite surfaces
THIEF|1|A person who steals from others
THIGH|1|The part of the leg between the hip and the knee
THING|2|An object or matter
THINK|2|To use the mind to reason or reflect
THIRD|2|Next in sequence after the runner-up
THORN|1|A sharp, pointed growth on the stem of a plant.
THOSE|1|Referring to specific people or things.
THREE|1|The number after two.
THREW|3|Sent something through the air with a motion of the arm
THROW|2|Hurl
THUGS|4|Violent criminals or gangsters.
THUMB|1|The short, thick digit on the hand.
TIBET|2|Mountainous region north of the Himalayas, home to the Dalai Lama
TIDAL|2|Relating to the regular rise and fall of the sea
TIDES|1|The regular rise and fall of the sea's surface, caused by the moon's gravity
TIGER|1|A large orange-and-black striped Asian cat
TIGHT|2|Firmly fixed or fastened; not loose
TILES|1|Flat pieces used to cover floors, walls, or roofs
TIMED|2|Measured how long an event took
TIMER|2|Stopwatch
TIMES|2|Multiplied by, in arithmetic
TIRED|1|In need of rest or sleep
TIRES|2|rubber coverings for wheels.
TITAN|4|One of a race of powerful deities in Greek mythology who preceded the Olympian gods
TITLE|2|The name of a book or film, or a championship held by a winner
TOAST|1|Bread that has been browned by heat
TODAY|1|On or during this present day
TOKEN|1|A coin-like object used in place of money for games or transport
TOKYO|1|Capital city of Japan
TOMMY|4|Old slang for a British private soldier
TONED|2|Having firm, well-defined muscles from exercise
TONES|1|Sounds with a particular pitch, quality, or strength
TOOLS|1|Implements used to carry out a job, such as hammers and saws
TOOTH|1|One of the hard structures in the mouth used for chewing
TOPIC|1|The subject of a discussion or text
TORCH|2|A portable light powered by a flame or battery
TOTAL|2|The whole amount reached by adding numbers together
TOUCH|2|To make physical contact with something
TOUGH|2|Hard to break, cut, or chew; durable and resilient
TOURS|3|Organised journeys visiting several places; also a city on the Loire in France
TOWEL|1|An absorbent cloth used for drying yourself
TOWER|1|A tall, narrow building or structure
TOWNS|2|Built-up places larger than villages but smaller than cities
TOXIC|2|Harmful or deadly, like a dangerous chemical
TRACE|3|To follow or discover by careful investigation
TRACK|2|A marked course for running or racing
TRACT|3|A stretch of land, or a short pamphlet on a subject
TRACY|2|A common female first name
TRADE|2|The buying and selling of goods
TRAIL|1|A rough path through the countryside
TRAIN|1|A line of linked railway carriages pulled along tracks
TRAIT|1|A distinguishing quality or characteristic of a person
TRANS|4|Prefix meaning 'across' or 'beyond'
TRAPS|1|Devices designed to catch and hold animals
TRASH|1|Discarded material; refuse or rubbish
TREAD|2|To walk or step in a particular manner
TREAT|3|To behave toward or deal with in a certain way
TREES|1|Tall woody plants with a trunk and spreading branches
TREND|2|A general direction of change or popularity
TRENT|2|A popular male first name
TRIAL|2|A formal examination of evidence before a judge
TRIBE|2|A social group sharing customs, language, and ancestry
TRICK|2|A cunning act intended to deceive
TRIED|3|Tested or proven through experience
TRIES|2|Makes an attempt to do something
TRIPS|2|Journeys to and from a place
TROLL|3|A mythical, often ugly creature from Scandinavian folklore
TROOP|2|A group of soldiers, especially a cavalry unit
TROUT|1|A freshwater fish popular with anglers
TRUCE|1|A temporary agreement to stop fighting
TRUCK|1|A large road vehicle for carrying heavy loads
TRULY|3|In a sincere or genuine way
TRUMP|3|A card of the suit that outranks all others in a game
TRUNK|2|the main stem of a tree.
TRUST|2|To rely on the honesty or ability of someone
TRUTH|2|That which is in accordance with fact or reality
TRYIN|3|An informal, dropped-g way of saying you're making an effort
TUBES|2|Hollow cylinders used to convey liquids or gases
TULSA|3|A city in northeastern Oklahoma, USA
TUMOR|3|An abnormal growth of tissue.
TUNED|2|Adjusted to the correct musical pitch or frequency.
TUNES|1|Melodies or songs
TURBO|3|A device that uses exhaust gases to boost an engine's power
TURKS|2|People native to, or descended from, Anatolia
TURNS|2|Opportunities to act taken one after another in sequence
TUTOR|1|A private teacher who helps one student
TWEET|2|A short message posted on a certain social network
TWICE|2|On two separate occasions
TWINS|1|Two children born to the same mother at the same birth
TWIST|2|To turn or bend something out of its natural shape
TYING|1|Fastening something with a knot or securing it
TYLER|4|The tenth president of the United States, by surname
TYPED|1|Entered text using a keyboard
TYPES|2|Categories or varieties of things
TYRES|2|Rubber coverings fitted around a wheel's rim
TYSON|2|Former heavyweight boxing champion nicknamed 'Iron Mike'
ULTRA|3|Going beyond the usual or extreme
UNCLE|1|The brother of one's mother or father
UNDER|2|Below or beneath
UNFIT|1|Not in suitable physical condition
UNION|2|An organized association of workers
UNITE|1|To join together as one
UNITS|3|Single complete things, or standard quantities of measurement
UNITY|3|The state of being joined together as a whole
UNTIL|2|Up to the point in time that
UPPER|2|Higher in position, rank, or place
UPSET|4|An unexpected defeat of a stronger opponent
URBAN|2|Relating to a city or town
URGED|2|To strongly encourage someone to do something.
URGES|2|Strong desires or impulses driving one to act
URINE|1|The liquid waste produced by the kidneys and expelled from the body.
USAGE|2|The way in which something is employed
USERS|2|People who operate a product or service
USHER|2|To guide someone to a place.
USING|2|Employing something to serve a purpose
USUAL|2|Happening or done most of the time
UTTER|2|Complete and total, with no exception
VAGUE|2|Not clearly expressed or defined
VALID|3|Legally or logically sound and acceptable
VALUE|2|The importance or usefulness of something
VALVE|2|Device that regulates the flow of gas or liquid through a pipe
VAPOR|2|A substance in the gaseous state.
VAULT|2|Secure room for storing valuables
VEGAN|1|A person who eats no meat, dairy, eggs, or other animal products
VEGAS|2|Nevada desert city famed for casinos and neon-lit nightlife
VEINS|2|Blood vessels that carry blood toward the heart
VENOM|3|A toxic substance produced by some animals.
VENUE|2|The place where an event is held
VENUS|2|The second planet from the Sun
VERGE|3|The point at which something is about to happen
VERSA|4|Word completing the phrase meaning 'the other way around'
VERSE|2|Writing arranged in a metrical rhythm, often rhyming
VIBES|2|Atmosphere or feeling of a place.
VIDEO|2|A recording of moving visual images
VIEWS|2|Personal opinions or attitudes about something
VILLA|3|A large and luxurious country or seaside house
VINCE|3|Familiar short form of a common boy's name ending in '-cent'
VINES|2|Climbing plants that grow along surfaces.
VINYL|2|A type of plastic used for records and flooring.
VIOLA|4|A small flowering plant closely related to the pansy
VIRAL|3|Spreading rapidly and widely, especially online
VIRUS|2|A microscopic infectious agent that replicates inside living cells
VISAS|2|Official documents permitting entry into a foreign country
VISIT|1|To go and spend time with a person or at a place
VISTA|2|A pleasing or expansive view, especially from a height
VITAL|3|Absolutely necessary or important
VIVID|1|Producing powerful feelings or clear images in the mind
VOCAL|3|Expressing opinions or feelings freely and forcefully
VODKA|1|A clear spirit often distilled from grain or potatoes
VOGUE|2|The prevailing fashion or style at a given time
VOICE|1|The sound produced when a person speaks or sings
VOLVO|2|A Swedish car manufacturer known for safety
VOMIT|1|To expel stomach contents through the mouth
VOTED|2|Cast a ballot in an election
VOTER|2|A person who casts a ballot in an election
VOTES|2|Formal expressions of choice in an election
WAGES|2|Regular money paid to someone for their work
WAGON|1|Four-wheeled vehicle for hauling loads
WAIST|1|The narrow part of the body between the ribs and hips
WAITS|1|Stays in one place until something expected happens
WAKES|1|Rouses from sleep
WALES|2|A country to the west of England in the UK
WALKS|1|Moves along on foot, or paths for strolling
WALLS|2|Upright structures that enclose or divide a space
WALLY|3|British slang term for a foolish or clumsy person
WALSH|3|Surname of Irish origin, meaning 'Welshman'
WANNA|3|Informal contraction expressing a desire to do something
WANTS|1|Has a desire for
WARDS|2|Divisions of a hospital set aside for patient care
WARNS|1|Alerts someone in advance of a danger or problem
WASNT|1|Contracted negative form of 'was', used in past tense
WASTE|2|To use carelessly or squander
WATCH|1|Look at attentively for a period of time
WATER|1|The clear liquid that fills rivers and oceans
WATTS|2|Units used to measure electrical power
WAVED|1|Moved a hand from side to side as a greeting
WAVES|1|Moving ridges of water on the surface of the sea
WAYNE|3|Surname of Batman's wealthy alter ego, Bruce ___
WEARS|2|Has clothing or an accessory on the body
WEARY|2|Feeling or showing tiredness.
WEAVE|2|To form fabric by interlacing threads
WEBER|4|A unit of magnetic flux.
WEDGE|2|A piece of something cut into a triangular shape
WEEDS|1|Unwanted wild plants growing among garden flowers or crops
WEEKS|1|Periods of seven days each
WEIGH|2|To measure the heaviness of an object.
WEIRD|2|strange or unusual
WEISS|4|A surname of notable individuals.
WELLS|2|Deep shafts dug into the ground to reach water or oil
WELSH|2|Relating to Wales, its people, or its language
WENDY|2|Girl's name associated with a famous restaurant chain and a Peter Pan character
WHALE|2|a large marine mammal
WHARF|2|A structure on a shore where ships load and unload
WHATS|4|The details of a matter, as distinct from the reasons behind it
WHEAT|1|A cereal grain used for flour.
WHEEL|1|A circular object that rotates on an axle
WHERE|2|In or to what place or position
WHICH|3|Asking for a choice among options
WHILE|2|A period of time.
WHITE|1|The color of fresh snow
WHOLE|2|Complete and entire, with no part missing
WHOSE|3|Belonging to which person
WIDER|2|More broad from one side to the other
WIDOW|2|A woman whose spouse has died
WIDTH|2|The measurement of something from side to side.
WILEY|4|A surname of notable individuals.
WILLS|2|Legal documents stating how a person's assets should be distributed after death.
WILLY|3|Cunning or sly.
WINDS|2|Currents of air moving across the land or sea
WINDY|2|Characterized by strong air currents.
WINES|1|Alcoholic beverages made from fermented grapes
WINGS|1|The limbs or surfaces that birds and planes use to fly
WIPED|2|Cleaned a surface by rubbing
WIRED|2|Connected by electrical cables
WIRES|1|Thin strands of metal used to conduct electricity
WISER|2|Showing better judgment as a result of experience
WITCH|1|A woman believed to have magical powers, often pictured on a broomstick
WITTY|2|Showing quick and inventive verbal humor.
WIVES|2|More than one married woman
WOMAN|1|An adult female person
WOMEN|2|Adult human females, more than one
WOODS|2|A dense area of trees, smaller than a forest
WOODY|1|Resembling or composed of a hard fibrous plant material
WORDS|1|More than one unit of language
WORKS|2|Functions or operates properly
WORLD|2|The earth and all its inhabitants.
WORMS|1|Small legless invertebrates that burrow in soil
WORRY|2|To feel anxious or troubled about something
WORSE|2|Of lower quality or more unpleasant than before
WORST|2|Most inferior or unpleasant of all
WORTH|3|The level of importance or usefulness of something
WOULD|3|Modal used for a conditional or a polite request
WOUND|2|An injury to the body, such as a cut or gash
WOVEN|3|Made by interlacing threads.
WRAPS|2|To cover or enclose something.
WRATH|2|Extreme or intense anger
WRECK|2|The remains of a ship or vehicle destroyed in a disaster
WRIST|1|The joint connecting the hand and forearm.
WRITE|1|To form letters or words on a surface
WRONG|1|Not in accordance with truth or fact
WROTE|2|Past tense of putting words down on paper
WYATT|4|A common male given name.
YACHT|1|A medium-sized sailing or motor vessel used for racing or pleasure cruising
YAHOO|2|An exclamation of joy or excitement
YARDS|2|Units of length each equal to three feet
YATES|2|A surname shared by a British astronomer and a TV presenter named Paula
YEARS|2|Plural of a period of twelve months.
YEAST|2|A fungus used to make bread rise and ferment beer
YELLS|1|Shouts loudly
YEMEN|2|A country located at the southern tip of the Arabian Peninsula
YIELD|3|To give way to pressure, force, or persuasion
YOUNG|1|Having lived for only a short time; not old
YOURE|2|Contraction meaning 'you are'
YOURS|3|Belonging to the person being addressed
YOUTH|2|The period of being young
YUMMY|1|Very pleasant to taste
ZELDA|3|A popular video game character.
ZHANG|2|A common Chinese surname
ZONES|2|Distinct areas set apart for a particular purpose
ABBOTT|3|A common surname borne by a former Australian prime minister
ABOARD|2|On or onto a ship, train, or plane
ABRAMS|3|Surname of the filmmaker behind 'Star Trek' (2009) and 'The Force Awakens'
ABROAD|2|In or to a foreign country
ABSENT|2|Not present in a place.
ABSORB|1|To take in or soak up a liquid or substance.
ABSURD|2|So unreasonable as to be laughable
ABUSED|3|Subjected to cruel treatment.
ABUSES|2|Instances of improper or excessive use of something, especially power
ACCENT|2|A distinctive way of pronouncing a language
ACCEPT|2|To agree to receive or take what is offered
ACCESS|2|The means or right to enter or make use of something
ACCORD|3|A formal agreement between parties, especially nations.
ACCUSE|2|To charge someone with wrongdoing
ACROSS|2|From one side to the other
ACTING|3|Serving temporarily in a position or role
ACTION|2|The process of doing something to achieve an aim
ACTIVE|3|Energetic
ACTORS|1|Performers who play roles on stage or screen
ACTUAL|3|Existing in reality rather than in imagination
ADDICT|3|A person who cannot stop using a harmful substance or habit
ADDING|2|Combining numbers or things to make a greater total
ADHERE|3|To stick fast to a surface.
ADIDAS|2|A popular sportswear brand.
ADJUST|2|To alter slightly to achieve a better fit or result
ADMIRE|2|to regard with respect or warm approval
ADMITS|2|Confesses to something
ADRIAN|3|The first name of the title character in a TV series about a germophobic detective
ADULTS|1|Fully grown people
ADVENT|2|The arrival or coming into being of something notable
ADVERT|2|A public notice promoting a product or service
ADVICE|2|Guidance offered as a recommendation about what to do
ADVISE|2|To offer guidance or recommendations to someone
AERIAL|2|Existing or happening in the air
AFFAIR|3|An event or matter of personal concern
AFFECT|3|To have an influence on something
AFFORD|2|To have enough money or means to pay for
AFGHAN|2|A knitted or crocheted blanket, often used as a throw
AFRAID|1|Feeling fear or anxiety about something
AFRICA|2|The world's second-largest continent
AGEING|1|Growing old or showing the effects of getting older
AGENCY|3|An organization that provides a particular service
AGENDA|3|A list of items to be discussed at a meeting
AGENTS|2|Representatives who act or negotiate on behalf of others
AGREED|2|Reached the same opinion as another
AGREES|2|Holds the same opinion or gives consent
AIDING|1|Giving help or support to someone
AIMING|2|Pointing a weapon or effort toward a target.
AIRING|2|The act of broadcasting something
ALARMS|2|Devices that signal danger.
ALASKA|2|The largest US state by area, bordering Canada
ALBANY|3|The capital city of New York State.
ALBEIT|4|Although; even though
ALBERT|2|A male given name, famously borne by physicist Einstein
ALBION|3|Ancient, poetic name for the island of Britain
ALBUMS|2|Collections of recorded songs released together
ALEPPO|4|A city in northern Syria.
ALERTS|2|To notify or warn someone.
ALEXIS|2|A common given name of Greek origin
ALFRED|3|A common male given name.
ALICIA|2|A female name
ALIENS|3|Beings from another planet.
ALISON|1|A common female first name of Old French origin
ALLIED|3|Joined together for a common purpose, as nations in wartime
ALLIES|2|Nations or people united for a common purpose
ALLOWS|2|Lets someone do something or have something
ALMOND|2|A pale, oval nut often used in baking and confectionery
ALMOST|2|Very nearly but not completely
ALONSO|3|Spanish Formula One driver, first name Fernando
ALPINE|2|Relating to high, snow-capped mountain ranges
ALUMNI|3|Former students or graduates of a school, collectively.
ALWAYS|2|At all times.
AMANDA|1|A common female given name.
AMAZED|1|Filled with great surprise or wonder
AMAZON|2|The world's largest river by volume, in South America
AMBUSH|3|To attack unexpectedly from a concealed position.
AMELIA|2|A female given name.
AMIDST|3|In the middle of.
AMOUNT|2|A total sum or quantity of something
AMUSED|1|Found something funny or entertaining
ANALOG|3|Relating to signals represented by continuously variable quantities, as opposed to digital
ANCHOR|2|a heavy object used to moor a vessel.
ANDERS|3|A Scandinavian male first name, equivalent to Andrew.
ANDREA|2|A common feminine given name of Greek origin
ANDREW|3|The patron saint of Scotland
ANGELA|1|a common female name.
ANGELO|3|A common male first name.
ANGELS|1|Winged heavenly messengers of religious tradition
ANGLES|2|The spaces between two intersecting lines, measured in degrees
ANIMAL|1|A living creature that is neither plant nor human
ANKLES|1|The joints connecting the foot to the leg
ANNUAL|2|Happening once every year
ANSWER|1|A response given to a question
ANTHEM|2|A rousing song of loyalty, often national
ANYHOW|1|In any case, regardless of other considerations
ANYONE|2|Any person at all
ANYWAY|3|Regardless of what has just been said
APACHE|3|A member of a Native American tribe in the southwestern United States.
APOLLO|2|NASA's program that first landed humans on the Moon.
APPEAL|3|An earnest or urgent request for something
APPEAR|2|To come into sight or become visible
APPLES|1|Round fruits that grow on trees, often red or green
APPROX|1|Abbreviation meaning 'roughly' or 'about'
ARABIA|3|Desert peninsula between the Red Sea and the Persian Gulf
ARABIC|1|The language spoken across the Middle East and North Africa
ARCADE|2|A venue with coin-operated games, or a covered passageway lined with shops
ARCHER|1|A person who shoots with a bow and arrow.
ARCHES|2|Curved structures supporting weight above an opening
ARCHIE|2|A popular male name, often associated with comics.
ARCTIC|2|Relating to the North Pole.
ARGUED|2|Exchanged opposing views in a heated way (past tense)
ARGUES|2|To present reasons for or against something.
ARISES|2|Comes about or begins to exist
ARMIES|1|Large organized bodies of soldiers trained for war
ARMOUR|1|Protective covering worn to prevent injury in combat
ARNOLD|1|A male given name, often associated with a famous actor.
AROUND|2|In a circular direction.
ARREST|2|To seize and hold by legal authority
ARRIVE|1|To reach a destination at the end of a journey
ARROWS|1|Pointed sticks shot from a bow
ARTERY|2|A vessel that carries blood away from the heart
ARTHUR|2|Legendary king of Camelot who drew a sword from a stone
ARTIST|2|a person who creates art
ASCENT|2|The act of climbing or rising upward
ASHLEY|3|A unisex given name of English origin, from a word meaning 'ash-tree meadow'
ASHORE|2|Onto or on the land, coming from the sea
ASHTON|3|A masculine given name borne by actor Kutcher
ASIANS|2|People native to the world's largest and most populous continent
ASKING|2|Putting a question to someone
ASLEEP|1|In a state of sleep
ASPECT|3|A particular part or feature of something
ASPIRE|2|To have a strong ambition to achieve something
ASSERT|2|To state a fact or belief confidently and forcefully
ASSESS|3|To evaluate or estimate the nature or value of something
ASSETS|3|Valuable property and resources owned by a person or company
ASSIGN|2|To give a specific task or duty to someone.
ASSIST|2|To give support or aid to someone
ASSUME|3|To suppose to be true without proof
ASSURE|2|To guarantee or promise.
ASTHMA|2|A chronic condition causing difficulty breathing due to narrowed airways
ASYLUM|3|Protection granted to someone in danger.
ATHENS|1|Capital city of Greece
ATOMIC|2|Relating to a nucleus and its particles
ATTACH|1|To fasten or join one thing to another
ATTACK|2|To take aggressive action against, or such an act of aggression
ATTAIN|2|To achieve or reach a goal.
ATTEND|1|To be present at an event or gathering
ATTIRE|2|Clothes, especially fine or formal ones
AUBURN|2|A reddish-brown color, often used to describe hair
AUDREY|2|A female given name, often associated with elegance.
AUGUST|1|The eighth month of the year
AURORA|2|A natural light display in the sky, typically seen near polar regions
AUSSIE|2|An informal term for an Australian.
AUSTIN|3|Live-music city that is the capital of Texas
AUTHOR|1|The person who wrote a book or article
AUTISM|3|a developmental disorder affecting communication
AUTUMN|1|The season of falling leaves between summer and winter
AVATAR|2|A digital image or icon representing a person online.
AVENUE|2|A broad street, often lined with trees
AVOIDS|1|Keeps away from or steers clear of
AWAITS|3|To be in store for; to expect.
AWARDS|2|Prizes given to recognize achievement
AWHILE|2|For a short period of time.
BABIES|1|Very young children who cannot yet walk or talk
BACKED|3|Gave support or financial help to a person or cause
BACKUP|2|A spare copy or extra source of support
BADASS|3|Tough, formidable, or impressively cool (informal)
BADGER|2|A burrowing mammal with a black-and-white striped face
BADGES|1|Emblems worn to show identity, rank, or achievement
BAILEY|1|A common surname.
BAKERY|1|A shop that makes and sells bread and cakes
BAKING|1|Cooking process used to make bread and cakes
BALLAD|2|A slow, sentimental song that often tells a story
BALLET|2|A formal dance performed on pointe to classical music
BALLOT|2|A process of voting.
BALTIC|3|Relating to the sea between Northern Europe and Eastern Europe.
BAMBOO|2|A tall, fast-growing tropical grass with hollow, woody stems
BANANA|1|A long, yellow tropical fruit.
BANGED|1|Struck something loudly and forcefully
BANKER|1|A person who manages money at a financial institution
BANNED|2|Officially prohibited or forbidden
BANNER|2|A long strip of cloth bearing a slogan or design
BANTER|1|Playful, teasing conversation between friends
BARACK|3|Former U.S. president known for his healthcare reform.
BARBER|1|A person who cuts men's hair and shaves beards for a living.
BARBIE|2|A popular fashion doll.
BARELY|2|Only just; by the smallest margin
BARKER|3|a person who calls out to attract customers
BARLEY|2|A cereal grain used in bread, animal feed, and brewing
BARNES|2|A common English surname
BARNEY|2|A popular children's television character.
BARRED|2|Prevented from entering or participating
BARREL|2|A cylindrical wooden container for wine or oil
BARREN|2|Too poor or dry to support the growth of plants.
BARTON|3|An English surname and place name traditionally meaning an outlying farm
BASICS|1|The fundamental facts or principles of a subject.
BASKET|1|A container woven from cane, wire, or other material
BATMAN|1|Caped crusader who protects Gotham City
BATTER|2|To hit repeatedly.
BATTLE|2|A sustained fight between opposing armed forces
BAXTER|3|A common surname.
BAYERN|3|German state whose capital is Munich
BAYLOR|2|A private university located in Waco, Texas
BEACON|2|A light or fire used to warn or guide travelers
BEARER|2|A person who carries or holds something
BEASTS|1|Large, often dangerous, wild animals.
BEATEN|3|Defeated in a contest or fight
BEAUTY|2|The quality of being very pleasing to the senses
BEAVER|2|A large rodent famous for building dams from wood and mud
BECAME|2|Came to be, in the past
BECKER|3|Surname of the German tennis champion who won Wimbledon at seventeen
BECOME|3|To grow or come to be over time
BEETLE|2|an insect with hardened forewings that protect its flying wings
BEFORE|2|Prior to a certain time.
BEGGED|2|To ask earnestly or desperately.
BEGINS|2|Sets out on or commences a course of action
BEHALF|3|The interest or support of a person, as when acting for them
BEHAVE|2|To act in a particular way.
BEHIND|2|At or toward the rear of something
BEHOLD|3|To see or observe, especially something impressive
BEINGS|3|Living creatures or conscious entities
BEIRUT|2|The capital city of Lebanon.
BELIEF|2|Acceptance that something is true or real
BELONG|2|To be a member of, or be the rightful property of
BENDER|3|A wild spree, especially one involving excessive drinking.
BENGAL|3|A region of South Asia, now split between India and Bangladesh
BENIGN|3|Gentle and kind; not harmful in effect
BENSON|5|A common surname or given name.
BERLIN|1|Capital city of Germany
BERNIE|4|A common male name, often associated with a politician.
BESIDE|2|At the side of; next to
BETRAY|2|To be disloyal to someone who trusts you
BETTER|2|Of superior quality.
BEWARE|1|To be cautious of potential danger.
BEYOND|3|On the far side of; further away than
BIASED|2|Showing unfair favor toward one side
BIDDER|1|A person who offers a price at an auction
BIEBER|2|Surname of the Canadian pop star known for hits like 'Baby'.
BIGGER|2|Larger in size than another
BIKING|1|Riding a two-wheeled pedal vehicle
BIKINI|1|A women's two-piece swimsuit.
BILLED|2|to send a statement of charges
BILLIE|2|First name of singer Eilish, known for 'Bad Guy'
BINARY|2|Based on just two values or states
BIRTHS|1|The events of babies being born
BISHOP|2|A senior Christian clergyman overseeing a diocese
BITING|2|Sharply critical or cutting, as in a harsh remark.
BITTEN|2|Having had teeth sunk into one's flesh
BITTER|2|Having a sharp, unpleasant taste
BLACKS|2|The darkest shades, absorbing nearly all light
BLADES|2|The flat cutting parts of knives, skates, or tools
BLAMED|2|Held responsible for a fault or wrongdoing
BLAMES|2|To assign responsibility for a fault.
BLASTS|2|Powerful explosions or sudden strong gusts of air
BLEACH|2|A chemical used to whiten fabric or disinfect surfaces
BLOCKS|2|Obstructs or stops the passage of something
BLONDE|2|Having light-colored hair.
BLOODY|1|Covered in or stained with the red fluid of veins
BOARDS|3|Flat lengths of sawn timber, or governing committees
BOASTS|2|Talks with excessive pride about one's own abilities
BODIED|3|Having a specified physical form or substance
BODIES|2|The physical structures of humans or animals
BODILY|2|Relating to the physical form of a person
BOEING|2|American aerospace and defense company that builds passenger jets
BOILED|2|Cooked in bubbling hot water until done
BOILER|2|A container that heats water to produce steam or hot water
BOLTON|3|A town in Greater Manchester, England, known for its football club
BOMBAY|3|The former name of the Indian city now known as Mumbai
BOMBED|2|Attacked a target with explosives dropped from the air
BOMBER|2|Aircraft designed to drop explosives
BONDED|2|Joined firmly together, often by an adhesive
BONNIE|3|Scottish dialect term meaning pretty or attractive.
BOOGIE|3|To dance energetically.
BOOKED|2|Arranged in advance, as a table or ticket
BOOKER|3|A person who makes reservations.
BOOSTS|2|Increases or gives a lift to something
BORDER|2|A line separating two countries or areas
BORING|2|Dull and tedious; lacking any interest
BORROW|2|To take something temporarily with the intention of returning it.
BOSNIA|3|A country in the Balkans.
BOSSES|1|People in charge of workers; supervisors
BOSTON|2|Massachusetts capital famous for a historic harbor tea protest
BOTHER|2|To trouble or annoy someone
BOTTLE|1|A narrow-necked container, often for liquids
BOTTOM|1|The lowest part of something
BOUGHT|2|Acquired in exchange for money, in the past
BOUNCE|1|To spring back after hitting a surface
BOUNDS|2|Limits that cannot be exceeded
BOUNTY|3|A reward offered for capturing, killing, or achieving something
BOWLER|2|A cricket player who delivers the ball toward the batsman
BOWMAN|2|A skilled archer who shoots arrows
BOXERS|1|Athletes who fight with their fists
BOXING|1|Combat sport fought with gloved fists
BRACES|3|Devices worn to straighten teeth or support trousers
BRAINS|2|Intellect or cleverness; the organs of thought, plural
BRAKES|1|Devices used to slow or stop a moving vehicle
BRANCH|1|A woody limb growing out from the trunk of a tree
BRANDS|2|Trademarked product names
BRANDY|2|A strong spirit distilled from wine or fermented fruit juice
BRAVES|3|To face or endure with courage.
BRAZIL|1|Largest country in South America, capital Brasília
BREACH|3|Violation
BREAKS|2|Shatters or splits into pieces
BREAST|2|The upper front part of the human torso
BREATH|2|Air drawn into and pushed out of the lungs
BREEDS|2|Distinct types of domesticated animals within a species
BREEZE|1|A light, gentle wind.
BRENDA|3|A common female first name popularized in the mid-20th century
BREWER|2|A person who makes beer.
BREXIT|2|The United Kingdom's withdrawal from the European Union
BRICKS|1|Rectangular blocks of baked clay used in building.
BRIDAL|2|Relating to a wedding or marriage ceremony
BRIDGE|2|A structure built to span a river, road, or gap
BRIGGS|3|A common surname, paired with 'Stratton' in a well-known small-engine brand
BRIGHT|2|Giving off or filled with a lot of light
BRINGS|2|Carries or conveys something to a place
BROKEN|1|No longer in working order
BROKER|3|A person who arranges deals between buyers and sellers.
BRONZE|2|An alloy of copper and tin
BROOKE|1|A common female given name
BROOKS|4|To tolerate or allow.
BROWNE|3|A surname, notably borne by a Nobel-laureate physicist and an English writer
BROWNS|2|Turns a toasty color when cooked in a pan, as meat or onions.
BROWSE|2|to look through casually
BRUINS|3|A team name associated with a bear.
BRUNCH|1|A late-morning meal combining breakfast and lunch
BRUTAL|3|Savagely violent, or harshly direct and unpleasant
BRYANT|2|Surname of a basketball legend nicknamed Black Mamba
BUBBLE|2|A thin film of liquid enclosing a pocket of air
BUCKET|1|A round open container with a handle for carrying liquids
BUCKLE|2|A clasp used to fasten a belt or strap
BUDDHA|2|The title given to Siddhartha Gautama, the sage who founded a major Eastern religion
BUDGET|2|A plan for spending money over a set period
BUENOS|3|Spanish adjective meaning 'good', used in the name of Argentina's capital
BUFFER|2|Something that reduces shock or protects against impact
BUFFET|2|A meal where guests serve themselves.
BUILDS|1|Constructs, piece by piece
BULLET|1|A small metal projectile fired from a gun
BUMPED|2|Knocked against something by accident
BUMPER|1|A protective bar at the front or back of a vehicle.
BUNDLE|1|A group of items tied or wrapped together.
BUNKER|1|An underground shelter, often for protection
BURDEN|3|A heavy weight or onerous responsibility
BUREAU|2|A chest of drawers for clothing
BURGER|2|A patty of ground meat served in a bun
BURIAL|1|The act of placing a dead body in a grave
BURIED|2|Placed underground and covered over
BURNED|2|Damaged or consumed by fire
BURNER|2|A device for producing a flame or heat.
BURSTS|2|Breaks open suddenly and violently
BURTON|2|Surname of film director Tim, known for gothic fantasy movies
BUSHES|1|Shrubs or small trees.
BUSTED|2|Informally, caught in the act of doing something wrong.
BUSTER|3|An informal, slightly challenging way to address a man or boy
BUTLER|2|The chief male servant of a large household
BUTTER|1|A dairy spread churned from cream
BUTTON|1|A small disc that fastens clothing, or a knob you press to operate something
BUYERS|3|People who acquire goods in exchange for money
BUYING|2|Obtaining something by paying money for it
BUZZER|2|A small electronic device that emits a sharp sound when triggered
BYPASS|2|A road built to let traffic avoid a town center
CABINS|1|Small, simple dwellings, often made of wood.
CABLES|2|Thick strong ropes or wires used to support or transmit something
CACTUS|1|A spiny desert plant that stores water in its stem
CAESAR|2|Title used by ancient Roman emperors, from a famous family name
CALLED|2|Gave a name to, or summoned aloud
CALLER|2|Someone who telephones another person
CALMLY|2|In a peaceful or relaxed manner.
CALVIN|1|A common male first name.
CAMDEN|3|a lively London borough famous for its market and music venues
CAMERA|1|A device for taking photographs
CAMPUS|2|The grounds of a college or university
CANADA|1|North American country bordering the U.S. to the north
CANALS|1|Man-made waterways for boats or irrigation
CANARY|1|A small yellow songbird often kept as a pet
CANCEL|2|To call off a planned event or arrangement
CANCER|2|A disease caused by uncontrolled cell growth
CANDID|2|Honest and straightforward, without holding back
CANDLE|1|Wax stick with a wick, burned for light
CANNED|1|Preserved by sealing inside an airtight metal container
CANNES|3|A resort city in southern France famous for its film festival
CANNON|3|A large mounted gun.
CANNOT|3|To be unable to do something
CANOPY|2|An overhead covering, such as over a bed or a forest's treetops
CANTON|3|A subdivision of a country.
CANVAS|2|A strong fabric used for painting or making tents.
CANYON|2|A deep gorge, typically one with a river flowing through it.
CAPITA|3|The word completing the economic phrase meaning 'per individual'.
CAPPED|2|Set an upper limit on something
CARBON|2|Chemical element with symbol C, the basis of organic life
CARDIO|2|Exercise that raises the heart rate for fitness
CAREER|3|A person's course of work over a lifetime
CARING|2|Displaying kindness and concern for others
CARLOS|3|Spanish and Portuguese form of the male name Charles
CARMEN|2|A common Spanish female first name
CARPET|1|A thick woven covering for a floor
CARRIE|2|Common female first name, also the title of a Stephen King horror novel.
CARROT|1|A long orange root vegetable
CARSON|3|Surname of the naturalist who wrote 'Silent Spring'
CARTEL|4|An association of manufacturers or suppliers.
CARTER|3|Someone whose job is hauling goods by horse-drawn wagon
CARVED|2|Cut or shaped from a solid material
CASINO|2|An establishment for gambling
CASTLE|2|A large fortified building dating from the medieval period
CASTRO|2|Surname of the Cuban revolutionary leader Fidel
CASUAL|3|Relaxed and unconcerned, not formal or planned
CATCHY|2|Easy to remember and pleasant to hear, like a tune
CATTLE|1|Domesticated bovine animals raised for milk and beef
CAUCUS|3|A meeting of members of a political party.
CAUGHT|2|Seized or grabbed, as a thrown ball in mid-air
CAUSED|3|Brought about as a result
CAUSES|2|Reasons or origins that produce an effect
CAVITY|2|An empty space within a solid object.
CEASED|2|Came to an end; stopped happening
CELLAR|2|A room below ground level used for storage.
CELTIC|2|Relating to the peoples of Ireland, Scotland, and Wales
CEMENT|1|A powdery substance mixed with water to bind building materials
CENSUS|2|An official count of the people living in a country
CENTER|1|The middle point of something
CENTRE|2|The point at the very middle of something
CEREAL|1|A grain-based food commonly eaten with milk at breakfast
CHAINS|1|Series of connected metal links
CHAIRS|1|Seats typically with four legs.
CHAMPS|2|Winners of a competition.
CHANCE|2|An opportunity to do something
CHANEL|2|Famous French fashion house known for its perfume No. 5
CHANGE|1|To make or become different
CHANTS|2|Repeated rhythmic phrases sung or shouted, often in unison
CHAPEL|3|A small place of worship.
CHARGE|2|To demand a sum of money for goods or services
CHARMS|2|Enchanting qualities
CHARTS|3|Diagrams of data; also weekly music popularity rankings
CHASED|1|Pursued quickly in order to catch
CHEATS|2|Acts dishonestly to gain an advantage
CHECKS|3|Examinations carried out to confirm accuracy or safety
CHEEKS|1|The soft, rounded parts of the face on either side of the nose and mouth.
CHEEKY|1|Showing playful disrespect or impudence
CHEERS|3|A toast said when raising glasses, or an informal British thank-you
CHEESE|1|A dairy food made from curdled milk
CHEESY|2|Of poor quality or overly sentimental.
CHEQUE|2|A written order to a bank to pay a stated sum
CHERRY|1|Small round red fruit with a central stone
CHERYL|1|A common female given name.
CHICKS|1|Baby birds, particularly of the domestic hen
CHIEFS|2|Leaders or heads of a group, plural
CHILLS|2|Sudden feelings of coldness or fear running through the body
CHILLY|1|Uncomfortably cold
CHOICE|2|An act of selecting between possibilities
CHOKED|2|struggled to breathe because of a blocked windpipe
CHOOSE|2|To pick one thing from several options
CHORDS|2|Groups of musical notes played together in harmony
CHORES|1|Daily household tasks
CHORUS|1|The repeated part of a song, sung after each verse
CHOSEN|2|Picked out from a number of options
CHRIST|3|The anointed savior figure of the New Testament
CHROME|1|A popular web browser developed by Google
CHUBBY|1|Pleasantly plump, especially describing a child
CHUNKS|1|Thick, irregular pieces of something
CHURCH|1|A building used for Christian worship
CINEMA|1|A building where films are shown
CIRCLE|1|A perfectly round closed curve
CIRCUS|2|A traveling company of performers.
CITIES|1|Large towns with many inhabitants
CITING|2|Quoting as evidence or example
CITRUS|2|Fruits like oranges and lemons.
CLAIMS|3|States to be true without offering proof
CLAIRE|3|A common female first name.
CLARKE|4|Surname of Arthur C., the author of 2001: A Space Odyssey
CLASSY|2|Having a stylish, high-quality appearance
CLAUDE|2|French male first name borne by the Impressionist painter Monet
CLAUSE|2|A group of words containing a subject and a predicate.
CLEARS|2|to make free from confusion or ambiguity
CLERGY|3|Religious officials, such as priests and ministers, considered as a group
CLEVER|1|Quick to understand, learn, or devise
CLICKS|1|Makes a short, sharp sound
CLIENT|2|A person who pays for the services of a professional
CLIFFS|2|Steep, high rock faces, often found along a coastline.
CLIMAX|3|The most intense point of a story.
CLIMBS|1|Ascends using hands and feet or effort
CLINIC|2|Place where outpatients receive medical treatment or advice
CLOCKS|1|Devices used to measure and indicate time.
CLONES|2|Genetically identical copies of a living organism
CLOSED|1|Not open for business or entry
CLOSER|2|At a smaller distance away
CLOSES|1|To shut something.
CLOSET|2|A small room or cupboard used for storing clothes
CLOUDS|2|Visible masses of condensed vapor floating in the sky
CLOUDY|1|Overcast, with the sky largely hidden by moisture in the air
CLOWNS|1|Comic performers who entertain with jokes and silly tricks, often in costume
CLUMSY|2|Prone to dropping or bumping into things due to lack of coordination
CLUTCH|3|Pedal used to change gears in a manual car
COARSE|1|Rough or harsh in texture
COATED|1|Covered with a layer of a substance
CODING|1|The activity of writing instructions for a computer
COFFEE|1|Hot drink brewed from roasted ground beans
COFFIN|1|Box in which a dead body is buried or cremated
COHORT|3|A group of people banded together or sharing a trait
COINED|2|Invented a new word or phrase.
COLDER|1|Less warm
COLLAR|2|A band around the neck of a shirt.
COLONY|2|A territory settled and controlled by a distant country
COLORS|1|Hues such as red, green, and blue
COLOUR|1|A property such as red, blue, or green
COLUMN|2|An upright pillar supporting a structure
COMBAT|2|Fighting between armed forces; also, to fight against something
COMEDY|2|Entertainment meant to make an audience laugh
COMICS|2|Stories told through sequential drawn panels
COMING|3|Approaching in time; due to arrive soon
COMMIT|3|To pledge or bind oneself to a course
COMMON|2|Occurring frequently; ordinary and widespread
COMPLY|3|To act in accordance with a wish or command.
CONDOM|2|A protective sheath used during intercourse.
CONNIE|3|A familiar short form of the female name Constance
CONNOR|2|A common Irish-origin male first name
CONRAD|2|A common male first name of Germanic origin
CONSUL|2|An official appointed to live in a foreign city and protect the citizens of their own country.
CONVEY|2|To communicate or make something known
CONVOY|2|A group of vehicles or ships traveling together for protection
CONWAY|4|A surname or a place name.
COOKED|1|Prepared food by applying heat
COOKIE|2|A small, flat, sweet baked treat, often studded with chocolate chips
COOLED|1|Became lower in temperature
COOLER|2|Lower in temperature.
COOPER|3|A craftsman who makes and repairs casks and barrels
COPIED|1|Made an identical version of something
COPIES|2|Duplicates made to match an original
COPING|2|Dealing effectively with something difficult
COPPER|2|A reddish-brown metallic element used in wiring
CORNER|1|Point where two walls or two streets meet
CORONA|3|The luminous gaseous envelope surrounding the sun, visible during an eclipse
CORPSE|1|a dead body
CORPUS|4|A large collection of written or spoken texts
CORTEX|4|The outer layer of an organ or structure.
COSMIC|3|celestial
COSMOS|2|The universe regarded as an orderly, harmonious system
COSTLY|1|Expensive; requiring a great deal of money.
COTTON|1|A soft white plant fibre used to make cloth
COUNTS|2|Adds up a total, item by item
COUNTY|3|An administrative region within a state or nation
COUPLE|2|Two people or things considered together
COUPON|1|A voucher entitling the holder to a discount.
COURSE|2|A set of classes or lessons on a particular subject
COURTS|2|Marked areas where tennis or basketball is played
COUSIN|1|The child of one's aunt or uncle
COVERS|2|Places something over so as to protect or conceal it
COVERT|1|Secret
COWARD|1|A person who lacks courage to face danger or pain.
COWBOY|1|A man who herds cattle on a ranch, often on horseback
CRACKS|2|Narrow fissures or splits in a surface
CRADLE|1|A small bed for a baby, often on rockers
CRAFTS|1|Skilled activities involving making things by hand
CRAPPY|2|Of very poor quality
CRATER|2|A bowl-shaped depression formed by volcanic activity or impact.
CREAMY|1|Having a smooth, thick, and rich texture
CREATE|2|To bring something into existence
CREDIT|3|An arrangement allowing deferred payment for goods
CREEPY|2|Causing an unpleasant feeling of fear.
CRIMEA|2|A peninsula on the northern coast of the Black Sea
CRIMES|2|Acts that are punishable by law
CRINGE|2|To feel embarrassed
CRISES|4|Times of intense difficulty or danger.
CRISIS|2|A time of intense difficulty or danger
CRITIC|2|A person who evaluates and judges the quality of books, films, or art.
CROSBY|1|Singer Bing ______
CROWDS|1|Large groups of people gathered together
CROWNS|2|Ornamental headpieces worn by monarchs
CRUISE|2|A pleasure voyage taken aboard a ship
CRUNCH|3|A tight or critical situation, especially financial
CRYING|2|Shedding tears, often from sadness
CRYPTO|2|Informal short form for digital currency
CUDDLE|1|Hold closely and affectionately
CURSED|2|Afflicted by a supposed evil spell
CURTIS|1|A common English first name and surname
CURVED|1|Having a smoothly bent shape rather than a straight line
CURVES|1|Smoothly bending lines or shapes.
CUSTOM|3|A traditional and widely accepted way of behaving
CUTTER|2|A tool or blade designed for slicing material
CYCLES|2|Repeating series of events
CYPRUS|2|An island country in the eastern Mediterranean Sea
DAGGER|1|Pointed weapon
DAKOTA|2|Either of two neighboring US states, North or South
DALLAS|2|Large city in northern Texas
DALTON|5|Surname of the chemist who proposed early atomic theory
DAMAGE|2|Physical injury that reduces value or usefulness
DAMIAN|3|A male first name of Greek origin, sometimes linked to an ominous film character
DAMIEN|3|A common first name for the ominous boy in a classic 1976 horror film
DAMMIT|2|An exclamation of anger or frustration.
DAMNED|3|Condemned to eternal punishment
DANCED|1|Moved rhythmically to music, in the past tense
DANCER|1|One who moves rhythmically to music
DANCES|1|Moves rhythmically to music
DANGER|1|Exposure to possible harm or risk
DANIEL|3|Biblical figure who survived a night in the lions' den
DANISH|2|Relating to Denmark or its people
DARING|1|Bold and willing to take risks
DARIUS|2|A common male given name of Persian origin
DARKER|1|More lacking in light
DARREN|3|A boy's given name
DARWIN|2|British naturalist who proposed the theory of evolution by natural selection
DATING|2|Being romantically involved with someone over time
DAVIES|2|A common Welsh surname
DAWSON|3|Yukon town famous for an 1890s gold rush
DAYTON|3|Ohio city considered the birthplace of aviation, home to the Wright brothers
DEACON|3|A member of the clergy ranking just below a priest
DEADLY|3|Capable of causing death
DEALER|2|A person who buys and sells particular goods
DEARLY|2|With deep affection or fondness
DEATHS|3|Instances of the end of life
DEBATE|2|A formal discussion of opposing arguments
DEBBIE|2|Informal short form of the name Deborah
DEBRIS|2|Scattered fragments of something broken or destroyed
DEBUTS|2|First public appearances or performances
DECADE|2|A span of ten years
DECENT|3|Conforming to accepted standards; reasonably good
DECIDE|2|To make a final choice after weighing the options
DECKER|3|A structure or vehicle built with a stated number of levels
DECREE|3|An official order issued by a legal authority
DEEMED|3|Regarded or judged to be, in the past
DEEPER|3|Extending further down or being more profound
DEEPLY|3|To a great degree; intensely
DEFEAT|2|To win a victory over an opponent in a contest
DEFECT|1|A flaw or imperfection in something
DEFEND|2|To protect from attack or harm
DEFINE|2|To state the exact meaning of a word or term
DEGREE|3|A unit of temperature or angle; also an academic qualification
DELAYS|2|Postpone or hold up.
DELETE|1|Remove or wipe out text or data
DELUXE|2|Of a superior and more expensive kind
DEMAND|2|To ask for forcefully or insist upon
DEMISE|3|The end or downfall of something
DEMONS|3|Evil spirits or supernatural beings.
DENIAL|3|The action of declaring something to be untrue.
DENIED|3|Refused to admit the truth of, or rejected a request
DENIES|2|States that something is not true
DENISE|1|A common female name.
DENNIS|3|A male given name; also the comic-strip 'Menace'
DENTAL|2|Relating to the teeth
DENVER|3|The Mile-High City and capital of Colorado
DEPART|1|To leave a place, especially to start a journey.
DEPEND|2|To rely on for support or to be determined by
DEPICT|2|To show or represent something in a picture or story
DEPLOY|2|To move troops or resources into position for action
DEPTHS|3|The lowest or most remote parts of something, often used of the sea
DEPUTY|2|A second-in-command or appointed substitute
DERIVE|2|To obtain something from a specified source
DESERT|2|A dry, barren region with very little rainfall
DESIGN|2|A plan or drawing showing how something is to be made
DESIRE|3|A strong feeling of wanting something
DETAIL|2|A small individual fact or feature
DETECT|2|To notice or sense the presence of something
DEVICE|1|A piece of equipment made for a particular purpose
DEVILS|1|Evil spirits or demons
DEVOID|2|Completely lacking or without
DEVOTE|2|To give one's time or resources wholly to a purpose
DEXTER|3|A character known for his dark themes and moral ambiguity.
DIALOG|1|A conversation between two or more people
DIAPER|1|Absorbent garment worn by an infant
DIESEL|2|A heavy oil fuel used in some engines
DIFFER|2|To be unlike or distinct.
DIGEST|2|To break down food in the stomach and intestines
DIGITS|1|Numerical symbols from 0 to 9
DILLON|2|A masculine given name, also a common surname
DINING|2|The activity of eating a meal, especially a formal one
DINNER|1|The main meal of the day, often eaten in the evening
DIPPED|1|Plunged briefly into liquid
DIRECT|3|To guide or aim something toward a target
DISHES|1|Plates and bowls left to be washed after a meal
DISNEY|2|Studio behind Mickey Mouse and countless animated films
DIVERS|4|Old-fashioned word meaning 'several' or 'various'
DIVERT|2|To turn something aside from its course
DIVIDE|2|To separate something into parts or shares
DIVINE|3|Relating to, or coming from, a god
DIVING|2|Jumping into water headfirst.
DOCTOR|1|A person trained and licensed to treat the sick
DOLLAR|1|The main unit of currency in the United States
DOMAIN|3|A field of activity or an area under one's control
DONALD|2|Disney's hot-tempered cartoon duck, by first name
DONATE|2|To give something, especially to charity.
DONKEY|1|A domesticated hoofed animal related to the horse, known for its long ears
DONORS|2|People who give money, blood, or organs to help others.
DONUTS|1|Ring-shaped deep-fried pastries, often glazed
DOOMED|2|Destined to fail or suffer a grim fate
DOPING|3|The use of banned substances to enhance athletic performance
DORSAL|2|Relating to the back of an animal's body
DORSET|3|A county in southwest England known for its Jurassic coastline
DOSAGE|3|The specified amount of medicine to be taken
DOTTED|2|Marked with small spots or points
DOUBLE|2|Twice the usual amount or size
DOUBTS|2|Feelings of uncertainty about whether something is true or right.
DOZENS|2|Large numbers; groups of twelve
DRAFTS|3|Preliminary versions of written work.
DRAGON|1|A mythical fire-breathing winged reptile
DRAINS|2|Pipes that carry away water or waste.
DRAMAS|2|Plays or films that deal with serious topics.
DRAWER|2|A box-like compartment that slides in and out of furniture
DREAMS|1|Images and stories the mind experiences during sleep
DRILLS|2|To perform repetitive exercises.
DRINKS|2|Beverages, especially the alcoholic kind
DRIVEN|3|Strongly motivated and determined to succeed
DRIVER|1|One who operates a motor vehicle
DRIVES|2|Operates and steers a motor vehicle
DRONES|2|Remote-controlled or autonomous flying aircraft
DRYING|1|Removing moisture from something.
DUBBED|3|Given a nickname, or had a new soundtrack added in another language
DUBLIN|2|The capital city of Ireland
DUDLEY|3|A common English surname, also a place name in the Midlands
DUMPED|2|Got rid of something in a careless or abrupt way
DUNCAN|4|A name often associated with Scottish heritage.
DUNDEE|3|A city in Scotland known for its port.
DURANT|4|Surname of an NBA forward known by the initials KD
DURHAM|3|An English cathedral city on the River Wear
DURING|3|Throughout the time that
DUSTIN|2|First name of actor Hoffman, star of 'Rain Man'
DUTIES|2|Tasks or responsibilities required by a job or role
DWIGHT|2|A common American male first name.
EAGLES|2|Large birds of prey known for keen eyesight
EARNED|3|Gained through work or merit
EASIER|2|Requiring less effort than before
EASILY|2|Without difficulty or effort
EASTER|2|Christian festival celebrating the resurrection of Jesus
EATING|1|Taking in food through the mouth
ECHOED|1|Repeated a sound by reflection
ECHOES|2|Reverberations of sound.
EDIBLE|1|Safe and suitable for eating
EDISON|3|Famous American inventor known for the light bulb.
EDITED|2|Revised and corrected text for publication
EDITOR|2|Person who prepares and corrects text for publication
EDMUND|3|A traditional English first name, also borne by a ninth-century king of East Anglia
EDWARD|4|Masculine given name borne by several English kings
EFFECT|3|A change that results from a particular action or cause
EFFORT|2|A vigorous attempt or exertion of strength
EIGHTH|2|Coming right after the seventh in a sequence
EIGHTY|2|The cardinal number that comes right after seventy-nine
EITHER|2|One or the other of two options
ELAINE|2|A common female name.
ELBOWS|1|Joints between the upper and lower arm
ELDERS|1|Older, respected members of a community or tribe
ELDEST|1|Being the oldest among siblings
ELEVEN|2|The whole number that follows ten
ELIJAH|4|Biblical prophet known for miracles
ELITES|2|Groups considered the best or most powerful in a society
ELLIOT|3|A male given name derived from the Hebrew for 'the Lord is my God'
EMAILS|2|Electronic messages sent from one computer user to another
EMBARK|1|To begin a journey or project
EMBLEM|3|A symbol or representation.
EMERGE|2|To come out from a hidden or enclosed place
EMPIRE|2|A group of nations or peoples ruled by one supreme authority
EMPLOY|2|To hire someone for work.
ENABLE|2|To make something possible or feasible
ENCORE|2|An extra performance demanded by an audience
ENDING|2|The final part of a story or event
ENDURE|2|To suffer through something difficult without giving up
ENERGY|2|The capacity to do work or stay active
ENGAGE|3|To occupy or actively involve oneself in something
ENGINE|2|Machine that converts fuel into motion
ENJOYS|1|Takes pleasure in something
ENOUGH|2|As much or as many as is required
ENROLL|1|To register officially as a member or participant
ENSURE|3|To make certain that something will happen
ENTERS|2|To go into a place.
ENTIRE|2|Whole and complete, with no part left out
ENTITY|2|A thing that exists as a single, distinct unit
ENZYME|3|A protein that speeds up chemical reactions in living things
EQUALS|2|Is the same in value or amount as
EQUITY|3|Fairness and impartiality in how people are treated
ERASED|1|Removed all trace of, as with a rubber or delete key
ERNEST|2|A traditional English male first name
EROTIC|2|Relating to or arousing sexual desire
ERRORS|1|Mistakes or inaccuracies
ESCAPE|1|To break free from confinement
ESCORT|2|To accompany someone.
ESSAYS|2|Short pieces of writing on particular subjects
ESTATE|2|A large area of land with a grand house
ESTEEM|2|Respect and admiration felt for someone
ESTHER|2|A biblical queen who saved her people from persecution
ETHICS|3|Moral principles that govern a person's behavior
ETHNIC|2|Relating to a particular cultural or population group
EUGENE|2|A city in the U.S. state of Oregon
EUROPA|3|A moon of Jupiter believed to have a subsurface ocean.
EUROPE|1|The continent lying west of Asia
EVELYN|2|A female given name.
EVENLY|2|In equal parts or amounts
EVENTS|2|Things that happen, especially notable ones
EVOLVE|2|To develop gradually over time
EXCEED|2|To go beyond a limit, expectation, or amount
EXCEPT|3|Not including; other than
EXCESS|2|An amount beyond what is needed or normal
EXCUSE|2|A reason offered to justify a fault or offense
EXEMPT|3|Free from an obligation or duty required of others
EXETER|3|A cathedral city in Devon, in southwest England
EXISTS|3|Has actual being or reality
EXODUS|2|A mass departure of people
EXOTIC|2|Strikingly unusual or foreign in appearance
EXPAND|1|To become or make larger in size or scope
EXPECT|2|To regard something as likely to happen
EXPERT|2|A person with great knowledge or skill in a field
EXPIRE|1|Come to an end
EXPORT|2|To send goods to another country for sale
EXPOSE|2|Make something visible or known.
EXTEND|2|To make longer or larger; to stretch out
EXTENT|2|The range or degree to which something reaches
EXTRAS|2|Additional items or people.
FABRIC|2|Woven or knitted cloth
FACADE|3|The front of a building, or a false outward appearance
FACIAL|3|Relating to the face; also a beauty treatment for the skin
FACING|3|Being positioned directly opposite something
FACTOR|2|One element that contributes to a result
FADING|2|Becoming less visible.
FAILED|1|Did not succeed
FAIRLY|2|In a just and reasonable way
FAKING|2|Pretending to have or feel something that isn't real
FALCON|1|A fast diving bird of prey with pointed wings, often trained for hunting
FALLEN|2|Having dropped to the ground; no longer standing
FALLON|2|Surname of the comedian who hosts NBC's Tonight Show
FAMILY|1|Parents and their children, considered as a group
FAMINE|3|Extreme scarcity of food.
FAMOUS|1|Known about by very many people
FANDOM|2|The community of enthusiastic followers of a particular thing
FARMER|1|A person who grows crops or raises animals for a living
FASTER|2|At a greater speed
FATHER|1|A male parent
FAULTS|2|Defects or mistakes
FAULTY|1|Having defects or flaws
FAVORS|2|Shows preference for one option over others
FAVOUR|2|A kind or helpful act done for someone
FEARED|1|Felt afraid of someone or something
FEEDER|2|A device that supplies food, often for birds
FELIPE|3|Spanish and Portuguese form of the name Philip
FELLAS|1|An informal word for men or friends
FELLOW|2|A man or boy; informally, a chap or companion
FELONY|2|A serious crime typically punishable by a long prison term
FEMALE|2|Of the sex that can bear offspring or lay eggs
FENCES|2|Structures that enclose an area.
FENDER|2|A protective panel covering a car's wheel arch
FERRIS|2|Surname behind the famous rotating amusement-park wheel
FETISH|4|An object of obsessive devotion.
FIANCE|2|A man who is engaged to be married
FIBERS|2|Thread-like strands that make up a natural or synthetic material
FIDDLE|1|An informal name for a violin
FIELDS|2|Open stretches of land used for crops or pasture
FIERCE|2|Having a violent, aggressive, or intense nature
FIGHTS|2|Engages in combat or struggles against something
FIGURE|2|A written symbol for a number; a digit
FILING|2|A document submitted to an official record
FILLED|2|Made full or occupied completely
FILLER|3|Material used to occupy an empty space or gap
FILMED|2|Recorded moving images with a camera
FILTER|2|Device that removes unwanted particles from a liquid or gas
FILTHY|1|Extremely dirty
FINALE|2|The last part of a performance.
FINALS|2|The last, decisive rounds of a tournament
FINELY|2|In a delicate, precise, or thin manner
FINEST|2|Of the very highest quality; the best of all
FINGER|1|One of the digits on a hand
FINISH|2|To bring a task to its end
FINITE|2|Having limits or bounds; not unlimited
FIRING|2|Discharging a gun
FIRMLY|2|In a strong or resolute manner.
FISCAL|3|Relating to government revenue, taxation, and public money
FISHER|3|A person whose job is catching aquatic creatures using a rod, net, or trap
FISHES|2|Catches aquatic creatures with a rod, net, or line
FITTED|2|Shaped to sit closely, as a tailored garment
FIXING|1|Repairing or mending something broken
FLAMES|2|Hot glowing bodies of ignited gas.
FLAVOR|2|The distinctive taste of a food or drink.
FLAWED|2|Having an imperfection or weakness
FLIGHT|2|A journey made through the air in an aircraft
FLOATS|1|Remains buoyant on the surface of a liquid
FLOODS|1|Overflows of water that submerge normally dry land
FLOORS|1|The lower surface of a room.
FLORAL|1|Relating to or decorated with flowers
FLOWER|1|The colorful reproductive part of a plant
FLUENT|2|Able to speak or write smoothly and with ease
FLUFFY|2|Light and airy in texture.
FLUIDS|2|Substances, such as liquids or gases, that can flow
FLYERS|2|Printed sheets handed out to advertise something
FLYING|1|Moving through the air
FOLDED|2|Bent something over on itself so the parts overlap
FOLDER|1|A cover used to store and organize loose sheets of paper
FOLLOW|1|To go or come after someone or something
FOOLED|3|Tricked or deceived.
FORBES|3|American business magazine famous for its rankings of the wealthiest people
FORBID|2|To officially refuse to allow something
FORCED|2|Made to do something against one's will
FORCES|3|The armed military units of a nation
FOREST|1|A large area thickly covered with trees
FORGED|3|Made a fraudulent copy of a signature or document
FORGET|1|Fail to remember
FORGOT|1|Failed to remember
FORMAL|2|Following established convention or proper etiquette
FORMAT|3|The arrangement, structure, or style of something
FORMED|3|Shaped or brought into being
FORMER|3|Belonging to or occurring in an earlier time
FORUMS|2|Places or online platforms for public discussion
FOSSIL|2|The remains of a prehistoric organism.
FOSTER|3|To encourage or promote the development of something
FOUGHT|2|Struggled against an opponent in the past
FOURTH|2|Coming after third in a sequence
FOWLER|4|A person who hunts wild birds
FRAMED|3|Falsely made someone appear guilty of a crime
FRAMES|3|Structures that support pictures.
FRANCE|2|A western European country whose capital is Paris
FRANCO|3|Surname shared by actors James and Dave
FRANCS|3|Former currency units of Switzerland and several African nations
FRASER|3|A surname associated with a Scottish clan
FREAKS|3|People with unusual or abnormal traits.
FREAKY|2|Strange or bizarre in an unsettling way
FREDDY|2|Common diminutive of a traditional English boy's first name
FREELY|3|Without restriction or restraint
FREEZE|2|To turn to ice; or to stop moving suddenly
FRENCH|2|Relating to France, its people, or the language spoken in Paris
FRENZY|2|A state of wild excitement or uncontrolled activity
FRESNO|3|A city in California's Central Valley
FRIDAY|2|The weekday that comes right before the weekend
FRIDGE|1|An appliance for keeping food cold.
FRIEND|1|A person you know well and are fond of
FRINGE|3|The outer, marginal part of an area or group
FRONTS|2|The foremost part or surface.
FROZEN|2|Turned to ice or made extremely cold
FRUITS|2|The sweet, seed-bearing parts of plants, eaten as food
FRYING|1|Cooking food in hot oil or fat
FUCKED|3|Ruined or broken beyond repair (vulgar slang)
FUCKER|3|A vulgar slang term used as an insult for a person
FUCKIN|4|Crude slang intensifier added for emphasis (informal, vulgar)
FUELED|2|Supplied with energy or power.
FULFIL|3|To complete or achieve.
FULLER|3|Comparative form of an adjective meaning holding more, or complete
FULTON|4|American engineer credited with building the first commercially successful steamboat
FUNDED|2|Provided with money to support a project
FUNGUS|2|A mushroom, mold, or yeast-like organism
FUNNEL|1|A tube wide at the top and narrow at the bottom, used for pouring liquids
FUSION|3|The process of combining two or more things.
FUTURE|1|The time that is yet to come
GADGET|1|A small mechanical or electronic device
GAINED|3|Obtained or built up gradually over time
GALAXY|2|Enormous gravitationally bound system of stars, gas, and dust
GALLON|1|A unit of liquid measure equal to about 3.8 liters in the US
GAMBLE|2|A risky action taken in hope of a desired outcome
GAMERS|2|Players
GAMING|2|The activity of playing video or computer games
GANDHI|2|Indian leader who championed nonviolent resistance for independence.
GARAGE|1|Building where a car is kept
GARCIA|2|A common Spanish and Portuguese surname
GARDEN|1|A plot where flowers or vegetables are grown
GARETH|3|A Welsh male first name, also borne by a knight of King Arthur's court
GARLIC|1|A pungent bulb used as a seasoning in cooking
GARNER|3|To gather or collect.
GATHER|2|To bring or come together in one place
GEARED|3|Designed for a specific purpose.
GENDER|2|The state of being male, female, or another identity
GENEVA|2|A city in Switzerland known for diplomacy.
GENIUS|2|Exceptional natural intellectual or creative ability
GENOME|3|The complete set of genetic material in an organism
GENRES|2|Categories of artistic work, such as types of music or film
GENTLE|1|Mild and kind in manner or touch
GENTLY|2|In a soft, careful, or mild manner
GEORGE|2|English male first name borne by several kings
GERALD|3|Male first name borne by US president Ford
GERARD|3|A common male first name of French origin
GERMAN|2|Relating to the country whose capital is Berlin
GETTIN|2|Informal spelling of 'obtaining', dropping the final letter
GHETTO|2|A part of a city occupied by a minority group, often due to poverty
GHOSTS|1|Spirits of the dead said to haunt the living.
GIANTS|2|Mythical beings of enormous size and strength
GIBSON|2|American brand of electric guitars, maker of the Les Paul
GIFTED|2|Having exceptional talent or ability
GINGER|1|Pungent spicy root used in cooking and tea
GIVING|2|Handing something over freely; generous
GLADLY|2|In a willing and happy manner
GLANCE|1|A brief or quick look
GLITCH|1|A minor malfunction or error, often in software
GLOBAL|2|Relating to or covering the whole world
GLORIA|2|A common female first name of Latin origin
GLOSSY|1|Having a smooth, shiny surface
GLOVES|1|Hand coverings made of fabric or leather.
GLUTEN|2|A protein found in wheat and other grains
GOALIE|1|The player who guards the net in hockey or soccer
GOLDEN|2|Resembling or made of a precious yellow metal
GOOGLE|2|To look something up using a web search engine
GORDON|3|A Scottish surname and first name
GOSPEL|3|The teaching or message attributed to Jesus in Christianity
GOSSIP|2|Casual talk or rumors about other people's private lives.
GOTHAM|2|The fictional, crime-plagued city protected by a caped vigilante
GOTHIC|3|Of a medieval architectural style featuring pointed arches and ribbed vaults
GOTTEN|3|Chiefly American past participle of 'get'
GOVERN|2|To rule or control the affairs of a country or organization
GRADED|2|Assessed and assigned a mark or rank
GRADES|2|Marks awarded to students for their schoolwork
GRAHAM|4|A coarse whole-wheat flour, or a common British first name
GRAINS|2|Small hard seeds of cereal plants, such as wheat or rice
GRAMMY|2|An annual award for outstanding achievement in the music industry
GRANDE|3|Large in size or extent.
GRANNY|3|Nan
GRANTS|3|Sums of money awarded for a particular purpose
GRAPES|1|Small round fruits that grow in clusters on vines
GRAPHS|2|Diagrams representing data.
GRAVEL|1|Small stones often used to cover paths or driveways
GRAVES|1|Places where the dead are buried
GREASE|2|A thick oily substance used for lubrication
GREASY|1|Covered in or containing a lot of fat or oil
GREECE|2|Mediterranean nation often called the cradle of democracy
GREEDY|1|Having an excessive desire for wealth or food
GREEKS|2|Citizens of a Mediterranean country famed for ancient philosophy and myth
GREENE|3|Surname of British novelist Graham, author of 'Our Man in Havana'
GREENS|1|Leafy vegetables eaten as food
GROOVE|2|A long, narrow channel or track cut into a surface
GROUND|1|The solid surface of the earth
GROUPS|2|Collections of people or things gathered together
GROVES|2|Small clusters of trees, often cultivated
GROWTH|2|The process of increasing in size or amount
GRUMPY|1|Easily irritated and bad-tempered
GUARDS|2|People who watch over and protect a place or person
GUESTS|1|People invited to a home or event
GUIDED|2|Led or directed along a route
GUIDES|2|To direct or influence the course of.
GUILTY|1|Responsible for a crime or wrongdoing
GUINEA|4|An obsolete English gold coin equal to twenty-one shillings
GUITAR|1|A stringed instrument played by strumming or plucking
GUTTED|2|Feeling extremely disappointed or upset
HABITS|2|Regular behaviors that become hard to give up
HACKED|3|Gained unauthorized access to a computer system
HACKER|2|Someone who breaks into computer systems without permission
HAHAHA|1|Written representation of laughter
HAILED|2|Greeted or acclaimed with great enthusiasm
HAIRED|3|hirsute
HALTED|1|Brought abruptly to a stop
HALVES|2|Two equal parts that together make a whole
HAMLET|2|A small village, especially one without its own church
HAMMER|1|Tool for driving nails into wood
HANDED|2|Passed or gave something directly to another person
HANDLE|1|The part of a door, cup, or tool you grip
HANGED|2|Suspended by the neck until dead.
HANNAH|4|A girl's name that reads the same backward
HANSEN|5|A surname of Scandinavian origin.
HANSON|4|A surname of a popular American pop band.
HAPPEN|2|To occur or take place
HARBOR|2|A sheltered stretch of water where ships anchor safely
HARDEN|2|To become or make firm and rigid
HARDER|2|More difficult to do or endure
HARDLY|3|To almost no degree at all
HARLEM|3|A neighborhood in New York City known for its African American culture.
HARLEY|3|An American motorcycle brand known for its heavy cruisers
HARMED|1|Caused injury or damage to someone or something
HAROLD|2|A common male given name.
HARPER|3|A common surname, often associated with writers.
HARRIS|3|Outer Hebrides island renowned for its woven tweed
HARVEY|3|Male first name, or the invisible rabbit in a 1950 James Stewart film
HASSAN|3|An Arabic male given name meaning 'handsome'
HASSLE|2|An annoying inconvenience.
HATERS|2|People who express excessive criticism or negativity toward someone
HATING|1|Feeling intense dislike for something
HATRED|2|Intense feeling of hostility or dislike
HAULED|2|Pulled or dragged with great effort
HAVANA|2|The capital city of Cuba
HAVENT|2|A shortened way of saying something is still not done
HAVING|2|Possessing or holding something
HAWAII|2|The fiftieth US state, a chain of Pacific islands
HAYDEN|3|A common given name and surname.
HAZARD|3|A danger or risk.
HEADED|3|Moved toward a particular destination
HEADER|3|Introductory text placed at the top of a document or webpage.
HEALED|1|Became whole and sound again after injury or illness
HEALTH|1|The state of being free from illness or injury
HEARTS|1|Red suit in a standard deck of cards
HEATED|2|Made warm, or charged with anger
HEATER|2|A device for warming air or water.
HEAVEN|2|The dwelling place of God and the blessed in many religions
HEBREW|2|the ancient Semitic language in which the Torah was written
HECTOR|4|To bully or harass.
HEIGHT|2|Measurement from base to top
HELENA|2|A feminine given name derived from the Greek word for 'light' or 'torch'
HELIUM|2|A light, inert gas often used to fill balloons
HELMET|2|A protective headgear.
HELPED|1|Gave assistance to
HELPER|1|A person who assists another with a task
HERALD|3|A person or thing that signals the approach of another
HEREBY|2|By this means or method.
HEREIN|4|In this very document, statement, or matter
HERMAN|3|A male given name of German origin meaning 'army man'
HEROES|2|People admired for courage or noble deeds
HEROIC|1|Showing great courage and bravery in the face of danger
HEROIN|2|A highly addictive opioid drug derived from morphine
HIATUS|3|A pause or interruption in continuity
HIDDEN|3|Kept out of sight
HIDING|2|Keeping out of sight or concealing oneself
HIGHER|2|Greater in elevation or amount
HIGHLY|3|To a very great degree
HIKING|1|The activity of walking long distances in the countryside
HILARY|1|A person's first name, borne by a famous Everest mountaineer.
HILTON|2|A well-known international hotel and hospitality chain
HINDUS|2|Followers of a major religion originating in the Indian subcontinent
HINTED|2|Suggested something without stating it directly
HIRING|2|Taking someone on to do a job for pay
HITLER|3|Dictator who led Nazi Germany
HITTER|2|A baseball player who is currently batting
HOBART|3|The capital city of Tasmania, Australia
HOCKEY|1|A team sport played with sticks and a puck or ball
HOLDEN|3|Australian car manufacturer that ceased production in 2020.
HOLDER|2|A device or container that keeps something in place
HOLLOW|1|Having an empty space inside; not solid
HOLMES|3|Sherlock ___, the fictional detective of Baker Street
HOMAGE|3|Special honor or respect shown publicly.
HONEST|2|Free from deceit; telling the truth
HONORS|2|Special recognitions given for achievement
HONOUR|2|High respect or great esteem
HOODIE|1|A casual sweatshirt with a fabric covering for the head
HOOKED|2|Bent like a curve, or strongly addicted to something
HOOKER|3|A rugby forward who occupies the middle position in the front row of a scrum
HOOVER|3|To vacuum clean.
HOPING|2|Wanting something to happen and expecting it might
HOPPER|3|A funnel-shaped container for loading loose material like grain or coal
HORACE|3|A renowned Roman lyric poet of the Augustan age
HORROR|2|Intense feeling of fear or disgust
HORSES|1|Large hoofed animals often ridden or used to pull carts
HOSTED|2|Acted as the organizer or entertainer for guests or an event
HOSTEL|2|A cheap, supervised lodging place, often for young travelers
HOTELS|2|Establishments offering paid lodging to travelers
HOTTER|2|Having a higher temperature.
HOURLY|1|Occurring or measured once every sixty minutes
HOUSED|2|Given a place to live or be kept
HOUSES|1|Buildings that people live in
HOWARD|2|A masculine given name, or a family surname
HOWELL|3|A surname of Welsh origin, also the name of towns in New Jersey and Michigan
HUDSON|3|A river in North America.
HUGELY|2|To a very great extent
HUGGED|1|Held closely in one's arms as a sign of affection
HUGHES|4|Surname of the British poet laureate Ted, husband of Sylvia Plath
HUMANE|2|Showing compassion or benevolence towards others
HUMANS|2|Members of the species Homo sapiens
HUMBLE|3|Having a low estimate of one's own importance
HUMOUR|1|The quality of being amusing or comic.
HUNGER|2|A strong need or craving for food
HUNGRY|1|Feeling a strong need or desire to eat
HUNTED|2|To pursue and capture animals.
HUNTER|2|A person who chases and kills wild animals
HURDLE|2|An obstacle that must be overcome.
HUSTLE|2|Energetic activity or busy movement
HYBRID|2|The offspring of two different species or varieties
ICONIC|3|Widely recognised and admired as a symbol
IDEALS|3|Principles or standards regarded as worth pursuing
IDIOTS|3|People lacking intelligence.
IGNORE|2|To deliberately take no notice of
IMAGES|2|Visual representations or pictures
IMMUNE|2|Protected against a disease; not susceptible
IMPACT|2|A forceful collision or a marked effect
IMPORT|3|To bring goods into a country from abroad
IMPOSE|2|To force something unwelcome on someone
INCHES|2|Small units of length, twelve to a foot
INCOME|2|Money received regularly from work or investments
INDEED|3|Used to emphasize a statement; in truth
INDIAN|2|Relating to a large nation in South Asia
INDIES|3|Independent producers, labels, or studios, as opposed to major ones
INDOOR|1|Situated or done inside a building
INDUCE|2|To bring about or give rise to.
INFANT|1|A very young child.
INFLUX|2|An arrival or flowing in of a large number of things or people
INFORM|2|To give someone knowledge of a fact or situation
INJECT|2|To force a liquid into something using a syringe or similar device
INJURY|2|Physical harm or damage done to the body
INLAND|2|Situated away from the coast, toward the interior
INMATE|3|A person confined in a prison.
INNATE|2|Existing in someone from birth rather than learned
INNING|2|A division of play in baseball during which each team bats once
INPUTS|2|Data or resources fed into a system or process.
INSANE|3|In a state of serious mental illness; utterly senseless
INSECT|2|A small arthropod with six legs and three body parts
INSERT|2|To put something into something else.
INSIDE|2|Within the interior of something
INSIST|2|To demand something forcefully.
INSULT|1|To speak to or treat disrespectfully.
INSURE|2|To arrange financial compensation against future loss or damage
INTACT|2|Not damaged or altered.
INTAKE|2|Amount of something consumed or absorbed
INTEND|2|To plan or mean to do something
INTENT|3|A person's aim or purpose behind an action
INTERN|2|A student or recent graduate gaining supervised work experience
INVADE|3|To enter a place in large numbers.
INVENT|1|To create or design something new.
INVEST|2|To put money into something in hope of a profit
INVITE|1|To ask someone to come to an event
IPHONE|1|Apple's flagship handset
IRONIC|4|Happening in a way that seems deliberately contrary to what was expected
IRVINE|2|A city in California known for its planned communities.
IRVING|2|A masculine given name, often used as a surname too.
ISABEL|2|A common female given name.
ISAIAH|2|A major prophet in the Hebrew Bible.
ISLAND|1|A piece of land surrounded by water
ISRAEL|2|Country on the eastern shore of the Mediterranean
ISSUED|3|Officially gave out or distributed
ISSUES|2|Problems or matters of concern
ITSELF|3|The reflexive pronoun used for a thing or animal
ITUNES|2|Apple's digital media store and player, launched in 2001
JACKET|1|A short coat worn on the upper body
JACKIE|2|A common female given name.
JACOBS|3|An English surname derived from the given name of a biblical patriarch
JAGUAR|1|A large spotted wild cat native to the Americas
JAILED|2|To confine someone in a prison.
JASPER|3|A type of opaque gemstone.
JAVIER|2|A popular first name in Spanish-speaking countries
JEANNE|2|A French female first name, as in the famous medieval heroine of Orleans.
JENSEN|2|A common surname of Scandinavian origin.
JEREMY|2|A traditional English male first name
JEROME|3|Male given name; a scholar saint who translated the Bible into Latin
JERSEY|2|A knitted pullover or sports shirt worn by a team
JESSIE|4|Dated British slang for a timid or effeminate man
JEWELS|1|Precious stones or gems, often set in fine adornments
JEWISH|2|Relating to Judaism or its people
JOANNA|3|Common English girl's name meaning 'God is gracious'
JOANNE|1|A common English female first name
JOCKEY|2|A person who rides horses in races.
JOHNNY|3|Pirate-movie actor Depp, familiarly
JOINED|2|Became a member of, or linked together
JOINTS|2|Points in the body where two bones meet
JOKING|2|Making a humorous remark.
JORDAN|3|An Arab kingdom in the Middle East whose capital is Amman
JOSEPH|2|Husband of Mary in the Nativity story
JOSHUA|2|Biblical successor to Moses who led the Israelites into Canaan
JOYFUL|2|Full of happiness and delight
JUDGED|2|Formed an opinion or conclusion about.
JUDGES|1|Officials who preside over courts of law
JUDITH|1|A common female first name
JUICES|1|Liquids extracted from fruits or vegetables
JULIAN|2|A male given name.
JULIET|2|A character from Shakespeare's play.
JULIUS|2|First name of the Roman dictator Caesar
JUMPED|2|Pushed off the ground into the air (past tense)
JUMPER|2|British term for a knitted sweater
JUNGLE|2|Dense, tangled tropical forest
JUNIOR|2|Lower in rank, age, or seniority
JURORS|2|Members of a panel who decide a legal verdict
JUSTIN|3|Male given name shared by singers Bieber and Timberlake
KAISER|3|A German emperor.
KANSAS|2|Sunflower State of the American Midwest
KARATE|2|A martial art developed in Japan.
KEEPER|2|A person who guards or protects.
KELLER|2|A surname associated with a famous author and activist.
KELLEY|3|A surname of Irish origin
KENYAN|2|East African
KERALA|2|A state on India's southwestern coast, known for its backwaters.
KERNEL|2|The edible part of a seed.
KETTLE|1|A container for boiling water.
KICKED|2|Struck something with the foot
KICKER|2|In American football, the player who attempts field goals and extra points.
KIDNAP|2|To seize and hold a person unlawfully, often for ransom
KIDNEY|3|An organ that filters blood.
KILLED|2|Caused the death of, at an earlier time.
KILLER|2|A person or thing that takes a life
KINDLE|1|To set alight or start burning
KINDLY|1|Warm-hearted and considerate
KISSED|1|Touched with the lips as a sign of affection or greeting
KISSES|1|Touches someone with the lips as a greeting or expression of love
KITTEN|1|A young cat
KNICKS|2|NBA team based at Madison Square Garden
KNIGHT|2|Medieval armored warrior who fought on horseback
KNIVES|1|Plural of a bladed cutting tool
KNOCKS|2|To strike a surface to make a sound.
KOREAN|2|Relating to the people or language of a divided East Asian peninsula
KOSOVO|3|A partially recognized country in the Balkans that declared independence from Serbia in 2008
KRAMER|3|Surname of Jerry's eccentric neighbor on Seinfeld
KUWAIT|2|Small oil-rich nation on the Persian Gulf, invaded by Iraq in 1990
LABELS|2|Small tags attached to objects to give information about them
LABOUR|2|Hard physical work or effort
LACKED|2|Did not have enough of something needed
LADDER|2|A structure for climbing up or down.
LADIES|1|Polite term for a group of women
LAGOON|2|A stretch of salt water separated from the sea by a sandbank or reef
LAHORE|3|Pakistan's cultural capital, located in Punjab province
LAKERS|2|Los Angeles's NBA basketball franchise
LANDED|2|Came down to the ground, as an aircraft
LAPTOP|2|A portable computer that folds shut for carrying
LARGER|2|Greater in size or amount
LARVAE|3|Immature forms of insects.
LASERS|3|Devices that emit focused light.
LASHES|2|The hairs that grow along the edge of the eyelid
LASTED|3|Continued in existence over a stretch of time
LASTLY|2|Used to introduce the final point
LATELY|2|In the recent past; not long ago
LATEST|2|Most recent or up to date
LATINO|3|Hispanic
LATTER|3|The second of two people or things just mentioned
LATVIA|2|Baltic country with capital Riga
LAUGHS|2|Makes sounds and movements that express amusement
LAUNCH|3|To send a rocket or vessel into motion
LAUREL|3|An evergreen shrub whose leaves have long symbolized victory or honor.
LAUREN|3|A common female given name.
LAURIE|3|A unisex given name common in English-speaking countries
LAVISH|2|Sumptuously rich, elaborate, or luxurious
LAWFUL|1|Permitted or recognized by law
LAWSON|1|A common surname.
LAWYER|1|A professional who advises clients on legal matters
LAYERS|2|Sheets or thicknesses laid one over another
LAYING|2|Placing something down flat or in position
LAYOUT|2|The way in which something is arranged or set out
LEADER|1|A person who guides or commands a group
LEAGUE|2|An organized group of sports teams that compete against one another
LEAKED|3|To allow liquid or gas to escape.
LEANED|1|Tilted or bent from an upright position.
LEARNS|1|Gains knowledge or skill through study, experience, or teaching
LEARNT|2|Gained knowledge or skill through study or experience (British past tense)
LEASED|2|Rented property for a set period under a formal contract
LEASES|2|Legal contracts granting use of property for a set period in exchange for payment.
LEAVES|1|The flat green parts that grow on tree branches
LEBRON|3|NBA superstar and forward known for his many championships
LEDGER|2|A book or digital record used for tracking financial transactions
LEGACY|2|Something handed down from a predecessor
LEGEND|3|A traditional tale popularly regarded as historical
LEGGED|3|Possessing limbs of a specified type or number for standing and walking
LEGION|3|A large organized body of soldiers, especially in ancient Rome
LENDER|1|A person or institution that provides loans
LENGTH|2|The measurement of something from end to end
LENNON|3|A famous musician and member of The Beatles.
LENSES|2|Curved pieces of glass or plastic that focus light
LESLIE|2|A first name of Scottish origin, used for both men and women
LESSER|2|Smaller in size or importance than another
LESSON|2|A period of teaching, or something learned by experience
LESTER|3|First name of Canadian PM Pearson, 1957 Nobel Peace Prize winner
LETHAL|2|Sufficient to cause death
LETTER|1|A written message sent by mail
LEVELS|3|Ranked stages, heights, or degrees
LEVINE|3|A common Jewish surname
LIABLE|3|Legally responsible for something
LIBYAN|2|Relating to the North African nation whose capital is Tripoli
LIFTED|2|Raised to a higher position
LIGHTS|1|Devices that provide illumination
LIKELY|2|Expected to happen; probable
LIKING|2|A preference or fondness.
LIMITS|2|Boundaries beyond which something may not pass
LINEAR|3|Arranged along a straight path; progressing in one direction
LINEUP|2|A list of items or people arranged in order.
LINING|2|A layer of material covering the inner surface of something
LINKED|3|Connected or joined together
LIONEL|2|First name of football legend Messi
LIQUID|2|A flowing substance that takes the shape of its container, like water
LIQUOR|3|A distilled alcoholic beverage.
LISBON|2|The capital city of Portugal
LISTED|3|Set down items one after another in order
LISTEN|1|Give attention to a sound or to someone speaking
LITTER|1|Rubbish or trash left lying around in a public place.
LITTLE|2|Small in size or amount.
LIVELY|1|Full of energy and enthusiasm
LIVING|3|The means of earning money to support oneself.
LIZARD|1|A reptile typically with four legs, a long tail, and scaly skin.
LOADED|2|Filled with cargo, ammunition, or a heavy amount
LOCALS|2|People who live in a particular area.
LOCATE|2|To discover the exact place or position of something
LOCKED|1|Secured with a key or bolt
LOCKER|1|A small compartment, often in a school or gym, secured with a key or combination
LODGED|3|Became firmly fixed or embedded in a position
LOGGED|2|Recorded formally in a book, file, or system
LONDON|1|The capital city of England and the United Kingdom
LONELY|2|Feeling sad because of isolation or lack of company
LONGER|2|Of greater length than something else
LOOKED|2|Directed one's eyes toward something
LOOKIN|3|Informal, dropped-g way of describing the act of watching or observing
LOSERS|1|People who fail to win or succeed
LOSING|2|Failing to win, as in a contest
LOSSES|3|Defeats or instances of being beaten
LOTION|1|Creamy liquid applied to soothe or moisturize skin
LOUDER|1|Producing a greater volume of sound
LOUDLY|2|Noisily
LOUISE|5|A common female given name.
LOUNGE|1|A comfortable room for relaxing or waiting
LOVELY|2|Exquisitely beautiful or delightful
LOVERS|2|Two people in a romantic or intimate relationship
LOVING|2|Feeling or showing deep tenderness toward someone
LOWELL|4|Surname of an American poet, Robert ___
LOWEST|2|Least high or smallest in amount of all
LUMBER|2|Wood that has been processed for use in construction.
LUMPUR|3|Malay word for 'mud', found in a Southeast Asian capital's name
LUTHER|3|German monk who sparked the Protestant Reformation
LUXURY|3|A state of great comfort and extravagant living
LYRICS|2|The words that make up a song
MACKAY|3|A coastal city in Queensland, Australia, known for its sugar cane industry.
MADAME|2|A French title of respect used before a married woman's name
MADDEN|2|To make someone extremely angry
MADRID|2|Capital city of Spain
MAGGIE|2|A common nickname for the name Margaret
MAGNET|1|An object that attracts iron and other metals.
MAGNUS|3|Latin word meaning 'great', also a common Scandinavian first name
MAIDEN|2|A young, unmarried woman, in older or literary usage
MAILED|2|Sent through the postal system
MAINLY|2|For the most part; chiefly
MAJORS|2|Military officers ranking above captains, in the plural
MAKERS|2|Those who create or manufacture things
MAKEUP|2|Cosmetics applied to the face
MAKING|2|The process of creating or producing something
MALIBU|2|A coastal city in California known for its beaches
MALONE|5|A surname associated with various public figures.
MANAGE|2|To be in charge of or in control of
MANILA|2|Capital and largest city of the Philippines
MANNED|2|Operated or staffed by a human crew, as opposed to automated
MANNER|3|The fashion in which something is done
MANTLE|3|A loose sleeveless cloak worn over other clothing
MANTRA|2|A word or phrase repeated during meditation
MANUAL|2|A book of instructions for using something
MANUEL|4|The bumbling waiter character in the sitcom 'Fawlty Towers'
MAPPED|2|Plotted the layout of an area on paper
MARBLE|2|A type of stone used in sculpture and architecture.
MARCEL|4|A French male given name; a famous bearer wrote 'In Search of Lost Time'
MARCOS|2|A common Spanish and Portuguese male given name
MARCUS|3|A Roman masculine first name
MARGIN|2|The blank border around the text on a page
MARIAN|3|Relating to the Virgin Mary, as in devotion or feast days
MARINA|2|A harbor specifically for small pleasure boats and yachts
MARINE|2|Relating to the sea
MARION|3|A city in Indiana, or a common given name
MARKED|3|Clearly noticeable or distinctly evident
MARKER|2|An object used to indicate a position or boundary
MARKET|1|A place where goods are bought and sold
MARLEY|3|Surname of the reggae legend Bob
MARROW|2|The soft fatty substance inside bones
MARTHA|3|A traditional female name.
MARTIN|2|A common masculine given name and surname
MARTYR|3|One who suffers or dies for a cause or belief
MARVEL|2|A wonderful or astonishing thing
MARVIN|2|First name of Motown soul legend Gaye
MASCOT|1|A person, animal, or object thought to bring good luck to a group
MASKED|2|Wearing a covering over the face for disguise or protection
MASSES|2|Large numbers of people, especially the ordinary population
MASTER|3|One who has complete skill or control
MATING|2|The pairing of animals to reproduce
MATRIX|2|A rectangular array of numbers arranged in rows and columns
MATTER|3|Physical material that occupies space and has mass
MATURE|2|Fully grown or developed
MAYHEM|2|Violent chaos or extreme disorder
MAYORS|1|Elected heads of city or town governments
MCCAIN|3|Surname of a US senator who ran for president in 2008
MCLEAN|3|Surname of the singer who wrote 'American Pie'
MEADOW|2|A field of grass and wildflowers.
MEDALS|2|Awards given for achievement.
MEDIAN|3|The middle value in a set of numbers
MEDIUM|3|Average
MELODY|1|A pleasing sequence of musical notes forming a tune
MELTED|1|Changed from a solid into a liquid through heat
MEMBER|1|One belonging to a group or club
MEMOIR|2|A written account of one's own life
MEMORY|2|The faculty of recalling past events
MENACE|3|A threat or danger.
MENTAL|3|Relating to the mind
MENTOR|2|An experienced advisor who guides a less experienced person
MERCER|3|Trader
MERELY|2|Just that and nothing more
MERGED|2|Combined or united into a single entity
MERGER|3|The combination of two companies.
MERITS|3|The qualities that deserve praise or reward
MERKEL|3|Former Chancellor of Germany, in office 2005 to 2021
MERLIN|2|The legendary wizard and advisor to King Arthur
MESSED|2|To make a mistake or create disorder.
METALS|1|Hard, shiny materials such as iron, silver, and copper
METEOR|1|A small body from space that enters the Earth's atmosphere.
METERS|2|Metric units of length, or devices that measure amounts
METHOD|2|Technique
METRES|4|Yards
METRIC|2|A standard of measurement used to assess performance or quantity
MEXICO|1|Country directly south of the United States
MICHEL|3|French given name
MICKEY|2|Beloved Disney mouse character known by this first name
MIDDLE|1|The central point or part
MIDWAY|1|At or near the halfway point of a distance, process, or period of time.
MIGHTY|2|Possessing great power, strength, or size
MIGUEL|2|A common Spanish male first name
MILDLY|2|To a moderate or gentle degree
MILLER|3|A person who grinds grain into flour
MILTON|3|English poet who wrote 'Paradise Lost'
MINDED|4|Inclined or disposed in a specified way
MINERS|2|People who work extracting ore or coal from the ground
MINING|2|The extraction of coal or minerals from the ground
MINORS|1|People who are under the legal age of adulthood.
MINUTE|1|A span of sixty seconds
MIRIAM|1|Biblical name of Moses' sister
MIRROR|1|Polished surface that reflects your image
MISERY|1|A state of great distress or unhappiness
MISSED|2|Failed to hit, catch, or reach
MISSES|2|Fails to hit, reach, or catch something
MISTER|1|A title used to address a man.
MISUSE|1|To use something improperly or incorrectly
MIXING|3|Combining two or more substances together
MOBILE|2|Able to move or be moved freely
MOCKED|1|Made fun of in a scornful or contemptuous way
MODELS|2|Small-scale representations of larger objects
MODERN|1|Relating to the present or most recent times
MODEST|3|Not boastful or arrogant.
MODIFY|2|To change something slightly, often to improve it
MODULE|2|A self-contained component of a larger system
MOMENT|1|A very brief period of time
MONACO|2|A tiny principality on the French Riviera known for its casino
MONDAY|1|the first day of the week
MONICA|1|Common female first name
MONKEY|1|A long-tailed primate that swings through the trees
MONROE|2|Surname of a famous Hollywood actress, Marilyn
MONTHS|2|The twelve divisions of the calendar year
MORALE|2|The confidence and enthusiasm of a group at a given time
MORALS|2|Principles of right and wrong behavior
MORGAN|3|A British boutique sports-car maker, or a common Welsh surname.
MORMON|3|A member of a religious movement founded by Joseph Smith
MORONS|2|Stupid or foolish people, in blunt slang.
MORRIS|4|A traditional English folk dance performed with bells and sticks
MORROW|3|The next day, especially in old or poetic English
MORTAL|2|human
MORTAR|2|A bowl in which substances are ground with a pestle
MORTON|3|A common English surname, also a well-known salt brand
MOSAIC|3|Art made by assembling small pieces of colored glass or stone.
MOSCOW|1|Russia's capital and largest city.
MOSQUE|1|A building used for Muslim worship
MOSTLY|3|For the greater part; in the main
MOTHER|1|A female parent
MOTION|2|The act or process of moving
MOTIVE|2|A reason that drives a person to act in a particular way
MOTORS|2|Machines that convert electrical energy into mechanical motion.
MOUNTS|2|Climbs up onto something, such as a horse.
MOUTHS|1|The openings through which humans and animals take in food
MOVIES|1|Motion pictures shown in cinemas
MOVING|3|Stirring deep emotion; touching
MOZART|2|Famous Austrian composer of the Classical era
MUMBAI|2|India's most populous city, formerly known as Bombay
MUNICH|2|Capital city of Bavaria, Germany
MURDER|2|The unlawful, deliberate killing of a person
MURPHY|3|Common Irish surname tied to a pessimistic 'law'
MURRAY|3|Australia's longest river
MUSCLE|2|Body tissue that contracts to produce movement
MUSEUM|1|Building where artifacts and art are displayed
MUSLIM|2|A follower of the religion of Islam
MUSTER|2|To summon up or gather together, especially with effort
MUTANT|2|A living being with an unusual genetic change
MUTUAL|2|Felt or held in common by two or more parties
MYRIAD|3|Countless or extremely great in number
MYSELF|3|The reflexive form of the first-person singular pronoun.
MYSTIC|3|Relating to spiritual or supernatural matters.
NAILED|2|Fixed something in place with a pointed metal fastener
NAMELY|3|That is to say.
NAMING|2|The act of giving something a specific title or label
NAPLES|3|Italian city near Mount Vesuvius, famed for its cuisine
NARROW|2|Of small width in relation to length
NARUTO|2|Title character of a popular Japanese ninja anime series
NASCAR|3|An American organization that sanctions stock car racing
NASDAQ|2|American stock exchange known for tech listings
NATHAN|3|A male first name borne by a biblical prophet
NATION|2|A people united under one government
NATIVE|3|Belonging to a place by birth or origin
NATURE|2|The physical world and its living things
NAUSEA|2|A feeling of sickness with an urge to vomit
NEARBY|2|A short distance away
NEARLY|2|Almost but not quite
NEATLY|1|In a tidy, orderly, or careful manner
NEEDED|2|Required or called for
NEEDLE|1|A slender tool used for sewing.
NELSON|3|British admiral who fell victorious at Trafalgar
NEPHEW|2|The son of one's sibling.
NERVES|2|Fibers that transmit signals in the body.
NEURAL|2|Relating to nerves or the nervous system
NEVADA|2|A U.S. state known for its desert landscapes.
NEWARK|2|Largest city in New Jersey
NEWEST|1|Most recent in time.
NEWMAN|3|Surname of the Hollywood actor who starred in 'Cool Hand Luke' and later founded a food brand
NEWTON|3|The SI unit of force, named after a famous English physicist
NEYMAR|1|Brazilian professional soccer player
NICELY|2|In a pleasant or satisfactory manner
NICEST|2|Most pleasant or kind, superlative form.
NICKEL|2|A silvery-white metallic element
NICOLA|3|A common European first name, feminine in English and masculine in Italian
NICOLE|2|A common female name.
NIGHTS|2|The dark hours between sunset and sunrise
NINETY|3|Fourscore-and-ten
NIPPLE|2|Small protrusion on the breast through which milk is released
NISSAN|2|A major Japanese car manufacturer founded in the 1930s.
NOBLES|2|People of aristocratic rank
NOBODY|2|Not a single person
NODDED|1|Moved the head up and down in agreement
NOISES|1|Sounds, especially loud or unpleasant ones
NOODLE|1|A long, thin strip of pasta, often served in soup
NORDIC|2|Relating to Scandinavia and its peoples.
NORMAL|2|Conforming to the usual standard or type
NORMAN|2|A masculine first name
NORRIS|3|A surname, often associated with a famous martial artist.
NORTON|3|A well-known brand of antivirus software
NORWAY|2|A Scandinavian country famous for its fjords
NOTHIN|1|zilch
NOTICE|2|To become aware of something
NOTIFY|1|To inform someone of something officially.
NOTING|3|To observe or record.
NOTION|3|A conception, belief, or vague idea about something
NOVELS|2|Book-length works of prose fiction
NOVICE|1|A person new to a skill or activity
NUMBER|2|A symbol or word used in counting
NURSES|1|People trained to care for the sick and injured
OBJECT|2|A material thing that can be seen or touched
OBTAIN|2|To get hold of or come to possess
OCCUPY|1|To take up space, time, or a position
OCCURS|2|Takes place or comes about
OCEANS|1|Vast bodies of salt water covering most of Earth's surface
OFFEND|2|To cause someone to feel upset or annoyed.
OFFERS|2|Presents something for acceptance or refusal
OFFICE|2|A room or building where business or clerical work is done
OFFSET|3|To counterbalance or compensate.
OLDEST|2|Most advanced in age
OLIVER|3|Dickens orphan who dared to ask for more gruel
OLIVIA|1|A popular girl's name that has topped birth-certificate charts in recent years
ONIONS|1|Edible bulbs with a strong smell that often bring tears when chopped
ONLINE|1|Connected to the internet
ONWARD|2|continuing to move forward in space or time
OPENED|2|Unfastened or made accessible, in the past
OPENER|2|The first item or event in a sequence
OPENLY|3|Without concealment or secrecy
OPPOSE|1|To disagree with or resist a plan, policy, or person
OPTICS|3|The branch of physics that deals with light.
OPTION|2|a choice or alternative
ORACLE|2|A person or shrine believed to deliver wise, prophetic answers
ORANGE|1|Round citrus fruit with a thick rind
ORDEAL|2|Severe trial or test
ORDERS|2|Authoritative instructions that must be obeyed
OREGON|2|Pacific Northwest U.S. state with capital Salem
ORGANS|1|Body parts such as the heart or liver
ORGASM|2|The climax of sexual excitement
ORIENT|2|To align or position oneself in relation to one's surroundings
ORIGIN|2|The point at which something begins
ORPHAN|2|A child whose parents are deceased.
OSCARS|2|Annual awards for cinematic achievements.
OSWALD|2|A male given name, also borne by an early animated rabbit character
OTHERS|2|People or things besides the ones already mentioned
OTTAWA|1|Capital city of Canada
OUNCES|2|Units of weight, sixteen of which make a pound
OUTFIT|2|A set of clothes worn together for a particular occasion
OUTING|1|A short trip or excursion, often for pleasure
OUTLAW|2|A person who has committed a crime and is evading capture
OUTLET|2|A place to sell goods.
OUTPUT|2|Amount produced by a process or machine
OUTSET|1|The very beginning or start of something
OVERLY|2|To an excessive degree; too much so
OWNERS|1|People who possess something
OWNING|2|Having legal possession of something
OXFORD|3|A lace-up shoe, or an English university city
OXYGEN|1|Gas essential for human respiration
OYSTER|1|A bivalve mollusk that can produce pearls
PACKED|2|Filled to capacity; tightly crowded
PACKET|1|A small parcel or bundle
PADDLE|1|A short oar used without a fixed support, held in both hands
PAINTS|1|Applies color to a surface using a brush or roller
PAIRED|2|Matched together in twos
PALACE|2|A large, grand residence of a monarch or ruler
PALMER|4|A pilgrim who once carried a token branch from the Holy Land
PAMELA|2|A common female given name.
PANAMA|2|Central American nation home to a famous interoceanic canal
PANELS|2|Flat rectangular sections that form part of a door, wall, or device
PAPERS|1|Written or printed documents
PARADE|1|A public procession celebrating an occasion
PARCEL|1|A package wrapped for mailing or carrying
PARDON|2|An official forgiveness for a crime
PARENT|1|A person's mother or father
PARISH|3|A small district with its own church and clergy
PARITY|3|The state of being equal, especially in status or value
PARKED|1|Brought a vehicle to a stop and left it standing
PARKER|4|A surname shared by a well-known fountain-pen brand
PARODY|2|A comic imitation of a serious work
PAROLE|3|Early release of a prisoner under supervision
PARROT|1|A brightly colored tropical bird capable of mimicking speech
PARTED|2|Separated or divided, as when two people go their own ways
PARTLY|3|To some extent but not completely
PASSED|2|Went by, or succeeded in an examination
PASSES|3|Throws or kicks of a ball to a teammate
PASTOR|2|Minister in charge of a church congregation
PASTRY|1|Dough made with flour, fat, and water, used for pies and tarts
PATENT|3|Legal right protecting an inventor's idea
PATROL|2|To keep watch by moving regularly around an area
PATRON|3|A person who supports an artist, charity, or business with money
PATTON|3|American general known for leading tank forces in World War II
PAVING|2|A hard surface material used for roads or paths
PAYDAY|2|The day when a person receives their salary
PAYING|3|Yielding profit or a financial return
PAYPAL|2|A widely used online payment service
PEAKED|2|Reached the highest point or maximum level
PEANUT|1|An edible seed that grows underground, often roasted and salted
PEARCE|3|Surname shared by actors, boxers, and other notable Britons
PEARLS|1|Hard, lustrous spheres formed inside oyster shells, often used in jewelry
PENCIL|1|A writing instrument with a graphite core encased in wood
PEOPLE|1|Human beings considered collectively
PEPPER|1|A pungent spice ground from dried berries, often paired with salt
PERIOD|2|A length or portion of time
PERMIT|2|To officially let something happen or be done
PERSON|1|An individual human being
PETALS|1|the colored leaf-like parts surrounding a flower's center
PETERS|3|A common surname shared by several notable actors and athletes
PETITE|2|Small and slim in build, typically describing a woman
PETROL|1|gasoline
PEYTON|3|A common given name, often associated with a famous football player.
PHARMA|2|Informal term for the drug-manufacturing industry
PHASES|2|Distinct stages in a process of change or development
PHELPS|2|A famous American swimmer.
PHILIP|3|A traditional male first name borne by several kings of Spain
PHILLY|3|U.S. city home to the Liberty Bell, known familiarly by this nickname
PHONES|1|Handheld devices used to make and receive calls
PHOTOS|2|Images captured with a camera
PHRASE|2|A small group of words forming a unit of meaning
PICKED|2|Chose or selected from a group
PICKUP|1|A small open-bed truck used for hauling cargo
PICNIC|1|An outdoor meal eaten on a blanket or at a park
PIECES|2|Separate parts of a whole
PIERCE|1|To make a hole in something with a sharp point
PIERRE|2|A common French male first name
PIGEON|2|A common city bird with a cooing sound
PILLAR|2|A tall vertical structure used to support a building
PILLOW|1|A soft cushion for resting the head while sleeping
PILOTS|1|Trained crew who fly aircraft
PINNED|2|Fixed something in place with a small pointed fastener.
PIPING|2|A system of tubes used to carry liquid, gas, or sound
PIRACY|2|Robbery committed at sea, or illegal copying of copyrighted material
PIRATE|2|A criminal who attacks and robs ships at sea
PISSED|3|Informal term for angry or annoyed
PISSES|3|Urinates; used informally.
PISTOL|1|A small handgun designed to be held in one hand
PISTON|2|Cylindrical part that moves in an engine
PIXELS|2|The smallest individual elements of a digital image
PLACED|2|Set in a particular position
PLACES|2|Particular spots or locations
PLAGUE|2|A contagious disease that spreads rapidly causing many deaths
PLAINS|1|Large areas of flat land with few trees
PLANES|1|Flying aircraft, informally
PLANET|2|A large body that orbits a star
PLANTS|2|Living organisms that grow in soil and photosynthesize
PLAQUE|2|A flat commemorative plate fixed to a wall
PLASMA|2|The fourth state of matter, consisting of ionized gas
PLATED|2|Coated with a thin layer of metal such as gold or silver
PLATES|1|Flat round items from which meals are eaten
PLAYED|2|Took part in a game or sport, at an earlier time.
PLAYER|1|One who takes part in a game
PLEASE|3|To give satisfaction or enjoyment to someone
PLEDGE|3|A solemn promise.
PLENTY|2|A large or more than sufficient amount
PLIGHT|2|a difficult or dangerous situation someone is in
PLUNGE|2|To dive or fall suddenly into water or another substance
PLURAL|2|Referring to more than one.
POCKET|1|A small pouch sewn into a garment
PODIUM|1|A small raised platform for a speaker or award winner
POETIC|2|Having the rhythm, imagery, or beauty of verse
POETRY|2|Literary writing arranged in metrical verse
POINTS|2|Units used to keep score in a game or contest.
POISED|2|Calm, composed, and self-assured
POISON|2|A substance that causes illness or death when taken in
POKING|2|Prodding someone or something with a finger or sharp object
POLAND|2|Central European nation with capital Warsaw
POLICE|1|The civil force responsible for enforcing the law
POLICY|3|A course of action adopted by a government or organization
POLISH|2|Make smooth and shiny by rubbing
POLITE|1|Having or showing good manners.
POLLEN|2|Fine powder produced by plants for reproduction
POORER|2|Having less wealth or resources.
POORLY|2|In an inadequate or unsatisfactory manner
POPPED|1|Made a short, sharp bursting sound
PORTAL|4|A doorway or entrance.
PORTER|2|A person employed to carry luggage.
POSING|3|Modeling
POSTAL|1|Relating to the mail delivery system
POSTED|3|Displayed publicly or sent by mail, in the past
POSTER|1|A large printed notice displayed on a wall
POTATO|2|A starchy tuber eaten as a vegetable
POTENT|2|Having great power, force, or effect
POTTER|3|A craftsman who shapes vessels from clay
POUNDS|2|Units of weight or of British currency
POURED|1|Flowed or made a liquid flow from a container
POWDER|2|A dry substance made of finely ground particles
POWELL|3|Surname of the U.S. general who became Secretary of State under George W. Bush
POWERS|3|Abilities to act or produce an effect (plural)
PRAGUE|2|The capital city of the Czech Republic
PRAISE|2|An expression of approval or admiration
PRAYED|2|Spoke to a deity in worship or petition
PRAYER|2|A solemn appeal or words addressed to a deity.
PREACH|2|To deliver a religious or moral message publicly
PREFER|2|To like one thing better than another
PRETTY|2|Pleasing to look at in a delicate way
PRICED|2|Marked with a cost.
PRICES|1|Amounts of money charged for goods
PRIEST|2|An ordained member of the clergy who performs religious rites
PRIMER|2|A basic introductory textbook on a subject
PRINCE|1|A male member of a royal family, often a monarch's son
PRINTS|3|Marks left on a surface by pressure, as from fingers
PRISON|2|a place for confinement of criminals
PRIZES|2|Awards given for achievement.
PROBES|2|Investigates or explores thoroughly
PROFIT|2|Financial gain remaining after costs are paid
PROMPT|2|Done quickly and without delay
PROPER|2|Correct
PROTON|2|Positively charged particle found in an atomic nucleus
PROVED|2|Demonstrated the truth of by evidence
PROVEN|3|Demonstrated to be true or reliable by evidence
PROVES|3|Shows something to be true using evidence or argument
PSEUDO|2|False or not genuine
PSYCHE|3|The human mind or soul
PSYCHO|2|Informal term for a mentally disturbed or dangerously unstable person
PUBLIC|2|Relating to or open to the people as a whole
PUERTO|2|Spanish term for a port or harbor.
PULLED|2|Drew something toward oneself, in the past
PUMPED|2|Filled with excitement or energy
PUNISH|1|To impose a penalty on someone for wrongdoing
PUNJAB|3|A region split between India and Pakistan, known as the land of five rivers
PUPILS|2|Children being taught at a school
PUPPET|1|A doll or figure moved by strings or a hand placed inside it
PURELY|3|Solely; in an unmixed or entirely absolute way
PURITY|2|The state of being free from contamination or moral corruption
PURPLE|2|Of a color midway between red and blue
PURSUE|2|To follow in order to catch or overtake
PUSHED|2|Pressed forward with force
PUSHES|1|Applies force to move something away
PUZZLE|1|A game or problem designed to test cleverness
PYTHON|2|A large non-venomous constricting snake
QUARRY|3|A place where stone or minerals are extracted.
QUARTZ|2|Hard crystalline mineral often used in jewelry and clocks
QUEBEC|2|A province in Canada.
QUEENS|2|Female monarchs; also a borough of New York City
QUINCY|4|A city in Massachusetts, birthplace of two U.S. presidents
QUIRKY|2|Characterized by peculiar or unusual traits
QUOTED|2|Repeated someone's exact words
QUOTES|3|Repeats another person's exact words
RABBIT|1|A long-eared burrowing mammal known for hopping
RACHEL|2|A female given name of Hebrew origin meaning 'ewe'
RACIAL|3|Relating to differences between human ethnic groups
RACING|2|The sport of competing in contests of speed
RACISM|2|Prejudice or discrimination based on ethnicity
RACIST|3|Prejudiced against people on the basis of their ethnicity.
RADIAL|3|Arranged like rays from a central point
RADIOS|1|Devices that receive broadcast sound signals
RADIUS|2|The distance from the center of a circle to its edge
RAFAEL|2|A popular male first name of Spanish and Hebrew origin, meaning 'God has healed'.
RAGING|2|Extremely violent or intense
RAIDED|2|Attacked suddenly to steal or search
RAISED|2|Lifted to a higher position
RAISES|2|Lifts something to a higher level or position
RAMSAY|3|Surname of a fiery, straight-talking Scottish celebrity chef
RAMSEY|3|A town on the Isle of Man, or a county in Minnesota
RANDOM|3|Made or chosen without method, pattern, or conscious decision
RANGED|3|Varied or extended between limits
RANGER|1|A person who patrols and protects a park or forest
RANGES|3|Chains of connected mountains, or spans between two limits
RANKED|3|Placed in order of importance, quality, or standing
RANSOM|2|A sum of money demanded for the release of a captive.
RAPIDS|2|Fast-flowing, turbulent stretches of a river
RAPING|3|Committing the crime of forcing sex on someone without consent
RAPIST|2|A person convicted of committing a serious sexual assault crime
RAPPER|2|A musician who performs rhythmic spoken lyrics
RARELY|2|Not often; on very few occasions.
RATHER|3|To a moderate degree; somewhat
RATING|2|A score or classification based on quality or popularity
RATIOS|2|Quantitative relationships between two or more amounts
RAVENS|2|Large black corvids famed for intelligence and appearing in Poe's poetry.
REACTS|2|Respond to a stimulus
READER|2|One who peruses written material
REAGAN|2|40th President of the United States
REALLY|2|In fact; truly.
REALMS|2|Kingdoms or domains
REASON|2|A cause or explanation for an action or event
REBELS|3|People who rise up in armed defiance of a ruler or authority
REBOOT|1|To turn a device off and on again to fix issues
RECALL|2|To bring a past event back to mind
RECENT|2|Having happened only a short time ago
RECESS|1|A break from work or school activities
RECIPE|1|A set of instructions for preparing a particular dish
RECKON|2|To think or believe something is true
RECORD|2|The best performance or most extreme achievement ever attained
REDDIT|2|A popular social news and discussion website organized into topic-based communities.
REDEEM|2|To exchange for something of value, or make amends for a fault
REDUCE|2|To make smaller in size, amount, or degree
REEVES|3|A common English surname
REFERS|3|Mentions or directs attention to something
REFLEX|2|An automatic, involuntary response of the body to a stimulus
REFORM|3|Make changes to an institution or practice in order to improve it
REFUGE|1|A place offering shelter or protection from danger
REFUND|1|Money returned for a purchase
REFUSE|1|To say that you will not do or accept something
REGAIN|2|To get something back after having lost it
REGARD|3|Respect or admiration felt toward someone
REGENT|3|One who rules in place of a monarch
REGGAE|2|Jamaican music genre with an offbeat rhythm
REGGIE|2|A common male given name.
REGIME|3|A government, especially an authoritarian one
REGINA|4|Capital city of Saskatchewan, Canada.
REGION|2|An area of land with particular characteristics
REGRET|2|Feel sorrow or remorse over something done
REIGNS|2|Holds royal power and rules as monarch
REJECT|3|To refuse to accept, believe, or consider.
RELATE|3|To establish a connection between things
RELICS|2|Objects surviving from an earlier time
RELIED|2|Depended on someone or something with trust
RELIEF|3|A reassuring feeling that follows the end of anxiety or distress
RELIES|2|Depends on something or someone with confidence
REMAIN|2|To continue to exist or stay in place
REMAKE|2|A new version of an existing film
REMARK|2|A comment or observation expressed in speech or writing.
REMEDY|2|A medicine or treatment for an illness or problem
REMIND|2|Cause someone to remember something
REMOTE|2|Far away; situated at a great distance
REMOVE|2|Take something away from its place
RENDER|2|To provide or give, as a service
RENTAL|2|A property or item hired for temporary use
RENTED|1|Paid to use something temporarily belonging to someone else
REOPEN|2|To begin operating again following a closure
REPAIR|2|To fix or mend something that is broken
REPEAL|2|To officially cancel a law or act.
REPEAT|2|Do or say something again
REPLAY|2|To show a recorded moment again, especially in sports
REPORT|2|An account giving information about an event or matter
REPOST|3|To share or publish something again.
RESCUE|1|To save from danger or harm
RESIDE|2|To have one's permanent home in a particular place.
RESIGN|2|To give up a position or office.
RESIST|2|To withstand or refuse to give in to something
RESORT|2|Vacation destination with hotels and amenities
RESTED|1|took a break.
RESULT|2|The consequence or effect of an action or process
RESUME|2|To begin again after an interruption
RETAIL|3|The sale of goods to the public in relatively small quantities
RETAIN|3|To keep possession of; continue to hold
RETINA|3|The light-sensitive layer at the back of the eyeball
RETIRE|2|To stop working for good, usually in later life
RETURN|1|To come back to a place
REVEAL|2|To make a secret or hidden thing known
REVIEW|2|A critical evaluation of a book or film
REVISE|2|To change or amend something, especially a piece of writing
REVIVE|2|To bring back to life, consciousness, or vigor.
REVOLT|2|To rise up in rebellion against authority
REWARD|1|Something given in recognition of service, effort, or achievement
RHODES|3|A Greek island once home to an ancient wonder, the Colossus
RHYMES|2|Matches another word in end sound
RHYTHM|2|A regular, repeated pattern of beats in music or movement
RIBBON|1|A long, narrow strip of fabric used for decoration or tying
RICHER|1|Having more wealth than another
RICHES|1|Great wealth
RICHIE|2|A casual short form of a common English first name.
RIDDEN|2|Having been traveled on, as a horse or a bicycle
RIDDLE|2|A puzzling question posed as a game, with a clever answer
RIDERS|2|People who travel on a vehicle.
RIDING|2|Sitting on and controlling a moving animal or vehicle
RIFLES|2|Long firearms fired from the shoulder
RIGGED|3|Manipulated dishonestly to produce a desired outcome
RIGHTS|2|Freedoms protected by law
RIPPED|3|Pulled apart forcefully; in slang, very muscular
RIPPLE|1|A small wave or series of waves on the surface of water
RISING|2|Moving upward or steadily increasing
RITUAL|3|A formal ceremony or act.
RIVALS|1|People or teams competing against each other
RIVERA|4|Surname of the Mexican muralist who painted large-scale political frescoes
RIVERS|1|Large natural streams of flowing water
ROBBED|2|Had property illegally taken by force or theft
ROBBIE|2|A familiar nickname for the name Robert
ROBERT|2|A common male first name, often shortened to Bob
ROBOTS|2|Machines designed to perform tasks.
ROBUST|2|Strong and healthy in constitution
ROCKED|2|Moved gently or violently back and forth
ROCKET|1|Vehicle propelled by burning fuel, used for space flight
RODNEY|2|An English male given name, also used as a surname.
ROGERS|2|A common English surname
ROLAND|2|A legendary knight and nephew of Charlemagne, hero of a medieval French epic.
ROLLED|2|Moved along by turning over and over
ROLLER|2|A cylindrical object used for smoothing.
ROMANS|2|Citizens or natives of an ancient Italian empire that once ruled much of Europe.
ROMNEY|2|Former governor of Massachusetts who later became a U.S. senator from Utah
RONALD|2|A male given name shared by an actor-turned U.S. president surnamed Reagan
RONNIE|2|Common informal nickname for someone named Ronald
ROOKIE|2|A newcomer or beginner, especially in a sport
ROONEY|3|Surname shared by a famous English footballer and an American actress
ROOTED|2|Firmly established or fixed in one place
ROSTER|3|A list of names, often of a team or those on duty
ROTARY|2|Operating by turning around a central axis
ROTATE|2|To turn around an axis.
ROTTEN|1|Decayed and foul-smelling.
ROUNDS|2|Successive stages or sessions in a contest
ROUTER|2|A device that directs data traffic between computer networks
ROUTES|2|Courses or ways taken to reach a destination
ROVERS|2|Vehicles or people that wander widely
ROYALS|2|Members of a country's reigning monarchy
RUBBED|2|Moved over a surface with friction
RUBBER|2|Elastic material made from latex
RUBBLE|2|Rough fragments of broken stone or brick from a demolished building
RUGGED|2|Having a rough or uneven surface.
RUINED|2|Damaged beyond any repair
RULERS|1|People who govern a country
RULING|3|An official decision made by a judge or court
RUMBLE|2|A deep, continuous rolling sound
RUMORS|2|Unverified information spread informally.
RUNNER|2|A person taking part in a race on foot
RUNOFF|3|Water from rain or melted snow that flows over the ground rather than soaking in
RUNWAY|1|A strip of ground where aircraft take off and land.
RUPERT|4|A male given name.
RUSHED|2|Moved quickly.
RUSSIA|2|The world's largest country by area
RWANDA|3|A landlocked country in East Africa, home to the Virunga Mountains
SACKED|2|Dismissed from a job
SACRED|2|Regarded with religious reverence
SADDAM|3|First name of the Iraqi dictator surnamed Hussein
SADDLE|1|A seat for a rider on a horse or bicycle
SAFARI|1|An expedition to observe wild animals, especially in Africa
SAFELY|2|In a way that avoids harm or danger
SAFEST|2|Most secure or least dangerous.
SAFETY|2|Freedom from danger, harm, or risk
SAHARA|1|The largest hot desert in the world, spanning North Africa
SAILED|2|Traveled on water using a wind-powered vessel
SAILOR|1|A person who works as a crew member on a ship
SAINTS|2|Holy people canonized by the church
SALARY|2|A fixed regular payment made to an employee
SALMON|2|A type of fish known for its pink flesh.
SALOON|2|A bar, especially in the old American West
SALUTE|2|To honor or greet with a formal gesture of respect
SAMPLE|2|A small part taken to show what the whole is like
SAMUEL|3|An Old Testament prophet who anointed Saul and David
SANDRA|1|A common female first name
SANITY|2|Soundness of mental health
SANTOS|2|A major port city in southeastern Brazil
SATIRE|3|The use of humor or exaggeration to criticize vice or folly
SATURN|1|The sixth planet from the sun, famous for its rings
SAVAGE|3|Fierce, violent, or wildly untamed
SAVING|2|Keeping safe, or setting money aside for later
SAVIOR|2|A person who rescues someone from danger or harm
SAWYER|4|A worker who cuts logs into planks for a living
SAYING|3|A short, well-known expression or proverb
SCALED|2|Adjusted in size according to a fixed ratio
SCALES|3|Thin, flat plates covering fish.
SCARCE|3|In short supply.
SCARED|1|Filled with fear
SCARES|2|Frightens someone suddenly
SCENES|2|Individual sections or episodes of a play or film
SCENIC|1|Providing beautiful natural views
SCHEME|3|A systematic plan or a crafty plot
SCHOOL|2|An institution for education
SCORED|2|Gained points in a game or test
SCORER|3|Marksman
SCORES|1|Points earned by teams in a game
SCOTCH|4|To put a decisive end to a rumor or plan
SCOTIA|5|Caledonia
SCOUTS|2|People sent ahead to gather information
SCRAPE|1|To drag a hard or sharp object across a surface
SCREAM|2|A loud, piercing cry of fear or pain
SCREEN|2|A flat surface on which images are displayed
SCREWS|2|Threaded metal fasteners driven in with a rotating tool
SCRIPT|2|The written text of a play, film, or broadcast
SCROLL|2|A rolled piece of paper or parchment with writing on it
SEALED|2|Closed tightly so nothing can get in or out
SEARCH|2|To look carefully and thoroughly in order to find something
SEASON|2|One of the four natural divisions of the year
SEATED|1|In a sitting position
SECOND|2|A unit of time equal to one sixtieth of a minute
SECRET|2|Information kept hidden from others
SECTOR|3|A distinct part or division of an economy, area, or industry
SECURE|3|Fixed firmly in place; not likely to fail or give way
SEEDED|3|Ranked according to ability before a tournament begins
SEEING|2|Perceiving something with the eyes
SEEKER|1|A person who is searching for something
SEEMED|3|Gave the impression of being a certain way
SEIZED|3|To take hold of suddenly and forcibly.
SELDOM|1|Not often; rarely
SELECT|1|To pick out from a larger group
SELFIE|1|A photograph someone takes of their own face, typically with a smartphone
SELLER|2|A person who offers goods for sale.
SELVES|3|More than one individual identity or personality
SENATE|2|Upper house of a legislature
SENIOR|3|Higher in rank, age, or standing
SENSES|2|The faculties of sight, hearing, smell, taste, and touch.
SENSOR|2|A device that detects or measures a physical property and responds to it.
SEQUEL|3|A continuation of a story.
SERBIA|2|A landlocked country in the Balkans whose capital is Belgrade
SERENA|3|First name of a tennis legend who has won 23 Grand Slam singles titles
SERGEI|2|A common Russian male first name
SERGIO|3|A common male given name.
SERIAL|3|Arranged in a connected sequence
SERIES|2|A number of related events or items in succession
SERMON|2|a speech given in a religious context.
SERVED|2|Provided food or attended to customers
SERVER|2|A person who brings food to diners
SERVES|2|Provides food or drink to customers or guests
SESAME|2|A plant whose seeds are used in cooking and oil production
SETTLE|2|To bring a dispute to an agreed end
SEVERE|2|Very great or intense, as of pain or weather
SEWAGE|3|Waste water and excrement.
SEWING|2|The craft of joining fabric with needle and thread
SEXISM|2|Prejudice or discrimination based on gender
SEXIST|2|Showing prejudice or discrimination based on a person's sex
SEXUAL|3|Relating to the reproductive activity of living things
SHADES|1|Dark glasses worn to protect the eyes.
SHADOW|1|A dark shape cast when an object blocks the light
SHAKEN|2|Trembled or disturbed.
SHAKES|2|Trembles or vibrates, as with fear or cold
SHAPED|3|Gave a particular form or character to
SHAPES|2|Forms or outlines of objects.
SHARED|2|Divided something and gave portions to others
SHARES|3|Equal units of ownership in a company
SHARIA|2|Islamic religious law derived from the Quran
SHARKS|4|Ruthless moneylenders, informally
SHARMA|3|A common surname of Indian origin
SHARON|2|A common female first name.
SHAVED|1|Removed facial hair closely with a blade
SHEETS|2|Bed linens that cover a mattress
SHEIKH|3|A leader in a Muslim community.
SHEILA|2|A common female name in Australia.
SHELBY|2|A common American surname.
SHELLS|1|Hard protective outer coverings of eggs, nuts, or sea creatures
SHERRY|2|A fortified wine originally from southern Spain
SHIELD|2|A broad protective barrier carried by a warrior
SHIFTS|2|Changes in position or direction.
SHINES|2|To emit light.
SHIRTS|2|Garments for the upper body, usually with a collar and sleeves
SHITTY|4|Of very poor quality.
SHOCKS|2|Sudden and unpleasant surprises or disturbances
SHOOTS|2|Fires a projectile, such as from a gun or bow
SHORES|2|Lands bordering a body of water
SHORTS|1|Casual pants that end above the knee
SHOULD|3|Used to express duty, advice, or expectation
SHOUTS|1|Cries out loudly
SHOVED|1|Pushed roughly
SHOVEL|1|A tool with a broad blade used for digging or moving loose material
SHOWED|2|Displayed or made visible, in the past
SHOWER|2|A brief fall of rain
SHRIMP|1|A small, edible crustacean
SHRINE|2|A place regarded as holy because of its associations
SHRINK|1|To become smaller in size
SICILY|1|Large Italian island off the toe of the boot
SIDING|2|Material covering the exterior of a building
SIDNEY|1|A common male first name in English
SIERRA|4|A range of mountains with a jagged, saw-toothed outline
SIGHTS|1|Places or things worth seeing
SIGNAL|3|A gesture or sound that conveys information
SIGNED|2|Wrote one's name on, as a document
SILENT|1|Making or accompanied by no sound
SILVER|1|A shiny grey precious metal
SIMONE|2|A common female first name of French origin
SIMPLE|1|Easily done or understood
SIMPLY|3|In a plain or straightforward manner
SINGER|1|Person who performs songs with their voice
SINGLE|2|Only one; not one of several
SIRENS|1|Devices that emit a loud wailing sound as a warning
SISTER|1|A female sibling
SITCOM|2|A television comedy series.
SKETCH|2|A rough drawing.
SKIING|1|Traveling downhill on snow using two long runners and poles
SKILLS|2|Practiced abilities or areas of expertise
SKINNY|2|Very thin or slender.
SKIRTS|2|A garment worn around the waist.
SLATED|3|Scheduled or planned to happen
SLATER|3|A tradesperson who lays roof tiles made of thin stone
SLAVES|2|People held as the property of others and forced to work
SLAYER|2|One who kills, especially a formidable opponent or beast.
SLEEPS|1|Rests in a state of unconsciousness
SLEEPY|1|Feeling drowsy and wanting to rest
SLEEVE|1|The part of a garment that covers the arm
SLICED|2|Cut into thin pieces.
SLICES|1|Cuts something into thin flat pieces
SLIDES|1|Playground equipment children climb up and slip down
SLIGHT|2|Small in degree or amount
SLOGAN|2|A short, memorable phrase used in advertising or politics
SLOPES|2|Inclined surfaces used for skiing
SLOPPY|2|careless or untidy.
SLOWED|1|Reduced in speed or pace
SLOWER|2|having less speed than something else
SLOWLY|1|At an unhurried pace
SMELLS|1|To perceive odors.
SMILED|1|Formed a happy expression with the mouth
SMILES|1|Expressions of happiness on a face, plural
SMILEY|1|Habitually cheerful, showing happiness on one's face
SMOKED|2|Preserved or given flavor by prolonged exposure to a wood fire's fumes.
SMOKES|1|Inhales and exhales the fumes of burning tobacco.
SMOOTH|1|Having an even surface, free from roughness
SNACKS|1|Small amounts of food eaten between meals
SNAKES|1|Long limbless reptiles that slither on the ground
SNATCH|2|To seize or grab something quickly and forcibly
SNEAKY|1|Acting in a secretive or deceitful manner
SNIPER|2|A marksman who shoots from a concealed position
SNYDER|4|A surname of German origin.
SOAKED|1|Thoroughly wet through
SOCCER|1|A team sport in which a ball is kicked into a goal
SOCIAL|4|Communal
SOCKET|1|An electrical outlet designed to receive a plug
SODIUM|2|A soft, silvery-white metal that is highly reactive and essential for nerve function.
SOFTER|1|Less firm or hard; more gentle
SOFTLY|2|In a gentle or quiet manner
SOLELY|3|Not involving anyone or anything else; entirely
SOLEMN|2|Deeply sincere and dignified in manner or expression
SOLVED|2|Found the answer to a problem or puzzle
SOMALI|3|Relating to the East African nation whose capital is Mogadishu
SOONER|3|At an earlier time than expected
SOPHIA|2|A popular girl's name of Greek origin meaning 'wisdom'
SOPHIE|2|A common female first name, French in origin, meaning wisdom
SORROW|2|A feeling of deep distress caused by loss
SORTED|2|Arranged into a particular order
SOUGHT|2|Tried to find or obtain (past tense)
SOUNDS|2|Noises perceived by the ear (plural)
SOURCE|2|The place from which something comes or begins
SOVIET|3|Relating to the former union of communist republics in Eurasia
SPACED|2|Arranged with even gaps between each item
SPACES|2|Empty areas or gaps between things
SPACEX|2|Private rocket firm founded by Elon Musk
SPARED|2|Kept safe from harm, damage, or an unpleasant fate
SPARKS|1|Small fiery particles thrown off by burning or friction
SPEAKS|2|Utters words in order to convey something
SPEARS|2|Long pointed weapons used for thrusting or throwing
SPEECH|2|A formal spoken address to an audience
SPEEDS|2|Moves quickly.
SPEEDY|1|Moving or done quickly
SPELLS|2|Sequences of words believed to have magic power
SPENDS|1|Pays out money in exchange for goods or services
SPHERE|1|A perfectly round three-dimensional shape
SPICES|2|Substances used to flavor food.
SPIDER|1|An eight-legged creature that spins webs
SPIKES|2|Sharp pointed objects fitted to athletic shoes for extra grip
SPINAL|1|Relating to the backbone.
SPIRAL|1|A curve that winds continuously around a center point.
SPIRIT|2|The non-physical part of a person; liveliness or courage
SPLASH|1|The sound or act of liquid striking a surface.
SPLITS|2|Divides or separates something into parts
SPOKEN|2|Expressed in speech rather than in writing
SPONGE|1|A porous material used for cleaning or absorbing.
SPOOKY|1|Eerie and unsettling, as if haunted
SPORTS|1|Competitive physical games and activities
SPOUSE|1|A husband or wife
SPREAD|2|To extend or distribute over a larger area
SPRING|2|The season after winter when plants begin to grow
SPRINT|1|To run at full speed over a short distance
SPRUNG|2|Moved suddenly and quickly upward or forward
SPYING|2|Secretly gathering information about someone
SQUADS|1|Small groups of people organized to work together, as in sports or the military
SQUARE|1|A shape with four equal sides and four right angles
SQUASH|1|A vegetable such as a zucchini or pumpkin
STABLE|2|A building where horses are housed
STACEY|3|A common feminine given name, sometimes a variant of Anastasia
STACKS|1|Piles of objects arranged one on top of another
STAGED|2|Organized and presented for an audience
STAGES|2|Distinct steps in a longer process
STAINS|1|Discolored marks left behind on a surface or fabric
STAIRS|1|A set of steps leading from one floor to another
STAKES|2|Points of interest or risk in a situation.
STALIN|3|Soviet leader who ruled from the 1920s to 1953
STALLS|2|Small booths where goods are sold at a market
STAMPS|1|Small adhesive labels used to pay for postage, plural
STANCE|3|A way of thinking about something.
STANDS|2|Stays upright on the feet
STAPLE|2|A small U-shaped piece of wire used to bind sheets of paper
STARED|2|To look fixedly at someone or something.
STARTS|2|Sets in motion or begins
STARVE|1|To suffer or die from lack of food
STATED|2|Expressed clearly in speech or writing
STATES|3|Territories within a federal nation, or formally declares
STATIC|2|Fixed in one place; not moving
STATUE|2|A carved or cast figure of a person or animal
STATUS|3|A person's social or professional standing
STAYED|2|Remained in the same place or condition
STEADY|2|Firmly fixed and not shaking; constant over time
STEALS|2|Takes something without permission or right
STEELE|4|A surname often associated with strength or resilience.
STEFAN|3|Swedish tennis legend Edberg's first name
STELLA|2|Star (in Latin)
STEREO|2|A sound system with two audio channels
STEVEN|3|Male given name shared by directors Spielberg and Soderbergh
STEVIE|3|Affectionate short form of a familiar first name
STICKS|3|Adheres or clings firmly to a surface
STICKY|1|Tending to adhere to surfaces
STIGMA|3|A mark of social disgrace or shame
STITCH|2|A single loop of thread made when sewing or knitting
STOCKS|2|Shares representing ownership in a company
STOKED|2|Extremely excited or enthusiastic
STOKES|3|A measure of fluid viscosity.
STOLEN|3|Having been taken unlawfully; past participle of taking by theft
STONED|2|Intoxicated, especially by cannabis.
STONES|2|Hard mineral pieces found loose on the ground
STORED|1|Put away and kept for later use
STORES|2|Shops where goods are sold to the public
STOREY|2|A level of a building.
STORMS|1|Violent disturbances of the atmosphere with strong winds and rain
STORMY|1|Characterized by strong winds, heavy rain, or turbulent weather
STRAIN|2|Force or pressure that stretches or stresses something
STRAIT|3|A narrow passage of water.
STRAND|2|A single thread or fiber twisted with others
STRAPS|2|Narrow bands of material used to fasten or carry something
STREAK|3|A long thin line or mark; also an unbroken run of events
STREAM|2|A small, narrow flow of running water
STREET|1|A public way lined with buildings in a town
STRESS|2|Mental or emotional strain caused by pressure
STRICT|2|Demanding rigid obedience to rules
STRIDE|2|A long, confident step while walking
STRIFE|3|Angry or bitter disagreement over fundamental issues
STRIKE|2|A refusal to work as a form of protest
STRING|1|Thin cord used for tying or fastening
STRIPE|1|A narrow band of colour, often one of several
STRIPS|2|Long narrow pieces cut from a larger piece of material
STRIVE|2|To make great efforts to achieve something
STROKE|3|A sudden attack caused by interrupted blood flow to the brain
STROLL|1|To walk in a slow, relaxed manner
STRONG|1|Having great physical power or force
STRUCK|2|Hit, in the past tense.
STUART|2|A male first name, or a Scottish royal house
STUDIO|1|A room where an artist or musician works
STUPID|2|Lacking intelligence or common sense
STURDY|1|Strongly built and unlikely to break
STYLED|2|Arranged or designed in a particular fashion
STYLES|3|Distinctive manners of fashion or expression
SUAREZ|3|Uruguayan football striker who played for Liverpool and Barcelona
SUBMIT|2|To present a document or form for consideration
SUBSET|2|A smaller group contained entirely within a larger collection
SUBTLE|4|So delicate or slight as to be hard to notice
SUBURB|2|A residential area on the outskirts of a city.
SUBWAY|2|An underground train system.
SUCKED|2|Drew liquid in through the mouth using suction
SUCKER|2|A person easily deceived or tricked.
SUDDEN|2|Happening quickly and without warning
SUFFER|1|To experience pain, hardship, or distress
SUGARS|2|Sweet-tasting soluble carbohydrates found in many foods
SUITED|3|Appropriate or fitting for a particular purpose.
SUITES|2|Sets of connected rooms, especially in a hotel
SULFUR|2|A yellow chemical element with a pungent smell when burned
SULTAN|2|A Muslim sovereign or ruler, especially historically
SUMMED|2|To calculate the total of.
SUMMER|1|The warmest season of the year.
SUMMIT|1|The highest point of a mountain
SUMMON|3|To call upon to appear or act.
SUNDAY|1|The weekend day traditionally set aside for rest
SUNSET|2|The time in the evening when the sun disappears.
SUPERB|2|Of the highest quality; excellent
SUPPER|1|The evening meal of the day
SUPPLY|2|A stock or amount of something available for use
SURELY|3|Without any doubt; in a way that is certain
SURREY|2|A county in southeast England
SURVEY|3|A set of questions used to gather people's opinions
SUSSEX|3|A historic county in southeast England
SUTTON|3|A common English place name and surname
SUZUKI|3|A major Japanese maker of cars, motorcycles, and outboard motors
SWEATY|2|Covered in perspiration.
SWEDEN|2|Scandinavian country whose capital is Stockholm
SWEETS|1|Small pieces of confectionery, especially in British English
SWINGS|1|Playground seats that move back and forth on chains
SWITCH|2|To change or exchange one thing for another
SWORDS|1|Bladed weapons with a hilt, used for cutting or thrusting
SYDNEY|2|The largest city in Australia, famous for its harbour
SYLVIA|1|A female given name.
SYMBOL|3|A mark or sign that stands for something else
SYNTAX|3|The set of rules governing sentence structure in a language
SYRIAN|3|Relating to a Middle Eastern country whose capital is Damascus
SYSTEM|2|A set of connected parts forming a complex whole
TABLES|2|Pieces of furniture with flat tops supported by legs
TABLET|1|A flat touchscreen computer
TACKLE|2|To take on and deal with a difficult task or problem
TACTIC|2|A planned action to achieve a specific goal
TAGGED|2|Marked with a label showing information such as price or identity
TAILOR|3|To modify or adjust something to fit a particular need.
TAIWAN|3|An island nation located in East Asia.
TAKING|3|Carrying or conveying away from a place
TALBOT|4|A discontinued British and French car manufacturer
TALENT|2|A natural ability to do something well
TALKED|2|Conversed; expressed thoughts in words aloud
TALKIN|2|Informal spelling of speaking or chatting
TALLER|1|Greater in height than another
TANDEM|3|A bicycle designed for two riders seated one behind the other
TANKER|2|A large vessel or truck built for transporting liquid in bulk
TANNER|3|A person who processes animal hides.
TAPPED|2|Struck gently and repeatedly with quick light blows
TARGET|2|An object aimed at in shooting or archery
TARIFF|2|A tax imposed on imported or exported goods
TASKED|2|Given a specific job or duty to perform
TASTED|1|Tried a small amount of food or drink to check its flavor
TASTES|2|Perceives the flavour of something with the tongue
TATTOO|2|A permanent design inked into the skin
TAUGHT|2|Gave lessons or imparted knowledge to someone
TAVERN|3|An establishment serving food and drink.
TAXING|2|Physically or mentally demanding
TAYLOR|2|Unisex given name shared by the pop singer surnamed Swift
TEAMED|2|To join together for a common purpose.
TEASER|2|A short preview intended to generate interest
TECHNO|2|A genre of fast, repetitive electronic dance music
TEHRAN|2|Capital city of Iran
TELLER|1|A bank employee who handles customer transactions
TEMPER|2|A person's tendency to become angry
TEMPLE|1|A building used for religious worship
TENANT|2|A person who pays rent to occupy property
TENDED|2|Took care of or looked after
TENDER|2|Soft and easy to chew, as of well-cooked meat
TENNIS|2|Racket sport played on a court divided by a net
TENURE|3|The period or condition of holding a job or position
TERMED|3|Called or named in a particular way
TERROR|1|Intense, overpowering fear
TESTED|2|Subjected to a trial or examination
TEXANS|2|People from the southern US state whose capital is Austin
TEXTED|1|Sent a written message using a mobile phone
THAMES|2|The river that flows through London
THANKS|2|An expression of gratitude to someone
THEIRS|2|Used to indicate something belongs to a group already mentioned
THEMED|2|Designed around a particular subject or idea
THEMES|2|Central subjects or recurring ideas in works of art
THEORY|2|A supposition meant to explain something
THERES|3|Indicates existence or presence.
THESIS|4|A statement put forward for consideration.
THEYRE|3|Short form combining a pronoun and a verb of being
THIGHS|2|The parts of the legs between the hip and the knee
THINGS|2|Various objects or matters
THINKS|2|Forms ideas or opinions in the mind
THIRDS|2|Three equal fractions of a whole, plural
THIRST|1|A feeling of needing to drink
THIRTY|2|The number equal to three times ten
THOMAS|2|First name of the inventor Edison
THOUGH|4|Despite the fact; however
THREAD|1|A thin strand of cotton or silk used in sewing
THREAT|3|A stated intention to cause harm
THRIFT|3|Careful management of money and resources
THRILL|2|A sudden feeling of excitement or a rush of adrenaline
THRIVE|2|To grow, develop, or succeed vigorously
THROAT|1|The passage at the back of the mouth leading to the stomach and lungs
THRONE|2|The ceremonial chair of a monarch
THROWN|4|Hurled
THROWS|2|Hurls
THRUST|2|Forward force produced by an engine
THUMBS|2|The short digits set opposite the other four on each hand
TICKET|2|A printed slip allowing entry or travel
TIGERS|2|Large striped wild cats native to Asia
TIMBER|3|Wood prepared for use in building.
TIMELY|2|Happening at a suitable or opportune moment.
TIMING|2|The skillful choice of the right moment to do something
TINDER|2|Dry, easily flammable material used to ignite a fire
TIPPED|1|Gave extra money to a waiter or driver for good service
TISSUE|2|A group of similar cells, or a soft paper for wiping
TITANS|2|Figures of enormous power, size, or importance
TITLED|3|Given a name or heading; also, holding a noble rank
TITLES|2|Names given to books, films, or other works
TOBAGO|3|Caribbean island forming part of a twin-island nation with Trinidad
TOILET|2|A bowl-shaped bathroom fixture used for human waste
TOKENS|2|Coin-like items used in place of money
TOLEDO|2|Historic Spanish city famed for its swords and El Greco's paintings
TOMATO|1|A red, round fruit commonly used in salads and sauces.
TONGUE|2|The muscular organ in the mouth used for tasting and speaking
TONNES|2|Metric units of mass, each equal to 1,000 kilograms
TOPICS|2|Matters dealt with in conversation or writing
TOPPED|2|Covered with something on its upper surface
TORIES|3|Members or supporters of the British Conservative Party
TORQUE|4|A twisting force that tends to cause rotation
TORRES|2|A common Spanish and Portuguese surname
TOSSED|1|Threw something lightly
TOTALS|1|Sums arrived at by adding a set of numbers
TOURED|2|Traveled through a place visiting various sights
TOWARD|2|In the direction of someone or something
TOWELS|1|Absorbent cloths used for drying the body after bathing
TOWERS|2|Tall structures that rise high.
TOXINS|2|Poisonous substances produced by living organisms
TOYOTA|2|Japanese automaker known for the Corolla and Camry
TRACED|2|Followed the course or trail of something
TRACES|2|Small amounts or signs left behind
TRACKS|2|Marks or rails left behind by something moving
TRADED|3|Exchanged one thing for another with someone
TRADER|2|A person who buys and sells goods or financial instruments.
TRADES|2|To exchange one thing for another.
TRAGIC|3|Marked by great suffering, sorrow, or disaster
TRAILS|2|Paths or tracks through the wilderness
TRAINS|1|Connected railway carriages pulled by an engine
TRAITS|2|Distinguishing qualities or characteristics of a person
TRANCE|2|A dreamlike, semi-conscious state disconnected from surroundings
TRAUMA|3|A deeply distressing or disturbing experience
TRAVEL|1|To make a journey from one place to another
TRAVIS|4|A common male given name.
TREATS|2|Special foods given as a reward or indulgence
TREATY|3|A formal written agreement between nations
TRENCH|2|A long, narrow ditch dug into the ground, often for drainage or defense
TRENDS|3|General directions in which things are developing
TRENDY|1|Fashionable or in vogue at the moment
TREVOR|1|A common male given name of Welsh origin
TRIALS|3|Formal court examinations of evidence, or testing ordeals
TRIBAL|3|relating to a group of people.
TRIBES|2|social divisions within a community.
TRICKS|2|Clever acts meant to deceive or to entertain
TRICKY|2|Requiring skill or caution to handle
TRIPLE|3|Made up of three parts or three times as much
TRIVIA|1|Unimportant facts or details, often used in quiz games
TROJAN|3|A native or inhabitant of the ancient city of Troy
TROLLS|2|Mythical creatures from Scandinavian folklore said to live under bridges
TROOPS|3|Groups of armed forces personnel
TROPHY|1|A cup or figure awarded as a prize for victory
TROUGH|2|A long open container from which farm animals eat or drink
TRUCKS|1|Large road vehicles used for carrying goods
TRUMAN|3|33rd President of the United States.
TRUMPS|3|Cards of a suit that outrank all others in a round
TRUNKS|2|Men's swimwear worn at the beach or pool
TRUSTS|2|Has confidence in the honesty of someone
TRUTHS|2|Facts or principles widely accepted as accurate
TRYING|2|Making an attempt or effort to do something
TUCKED|2|Pushed or folded neatly into a confined space
TUCKER|4|Australian and New Zealand slang for food
TUCSON|3|A desert city in southern Arizona
TUMBLE|1|To fall suddenly and awkwardly
TUMBLR|3|A popular microblogging and social networking platform
TUMORS|3|Abnormal masses of tissue that can be benign or malignant
TUNING|2|Adjusting an instrument or engine to work correctly
TUNNEL|1|Underground passage dug through a hill or beneath a river
TURKEY|1|A large bird traditionally eaten at Thanksgiving
TURNED|2|Rotated or changed direction
TURNER|3|A worker who shapes wood or metal on a lathe
TURRET|2|A small tower on a castle or building
TURTLE|1|A reptile with a hard protective shell, often living near water
TWEETS|2|Short messages posted on social media.
TWELVE|1|Number of months in a year
TWENTY|1|Two times ten
TWISTS|2|Unexpected turns or changes in a story or path
TWITCH|2|A small, sudden, involuntary movement
TYPING|1|The action of entering text using a keyboard.
UGANDA|2|East African country whose capital is Kampala
ULSTER|4|A long coat, often worn in cold weather.
UNABLE|2|Lacking the power or skill to do something
UNEASY|2|Feeling or showing anxiety, worry, or discomfort
UNESCO|3|United Nations agency for cultural and educational purposes.
UNEVEN|2|Not level or regular.
UNFAIR|1|Not based on justice or equal treatment
UNFOLD|2|To open out gradually, or to become gradually revealed
UNIONS|2|Organized associations of workers formed to protect their rights
UNIQUE|3|Being the only one of its kind
UNITED|2|Joined together in agreement or common purpose
UNJUST|2|Not fair or right
UNLESS|3|Except on the condition that
UNLIKE|3|Different from; not resembling
UNLOCK|1|To open something using a key
UNPAID|1|Without receiving any compensation
UNREAL|2|Not real; imaginary or illusory.
UNREST|3|A state of dissatisfaction or agitation in a group.
UNSAFE|1|Likely to cause harm or injury
UNSEEN|3|Not visible or not perceived.
UNSURE|1|Not certain about something
UNTRUE|1|Not in accordance with fact; false
UNUSED|2|Never having been employed for any purpose
UPBEAT|2|Cheerful and positive in outlook
UPDATE|2|To bring something into line with the latest information
UPHELD|2|Maintained or supported a decision
UPHOLD|2|To maintain or support a law, principle, or decision
UPLOAD|2|To transfer data from a local system to a remote server.
UPSIDE|3|The positive aspect of a situation.
UPWARD|1|Moving toward a higher position
URGENT|2|Requiring immediate action or attention
URGING|2|Strongly encouraging someone to do something
USABLE|2|Able to be used effectively
USEFUL|2|Able to be used for a practical purpose
UTERUS|2|The organ in which a fetus develops before birth
UTMOST|3|Of the greatest or highest degree.
VACANT|2|Not occupied or filled; empty
VACUUM|3|A space entirely devoid of matter
VAGINA|2|The muscular canal in female mammals connecting the uterus to the outside of the body
VALLEY|1|A low stretch of land lying between hills or mountains
VALUED|3|Considered to be important or beneficial.
VALUES|2|Principles or standards a person holds important
VALVES|3|Devices that control the flow of fluids
VANITY|2|Excessive pride in one's own appearance or achievements
VARIED|2|differing in kind.
VARIES|2|Changes or differs from one instance to another
VASTLY|2|To a very great degree or extent
VECTOR|3|A quantity with both direction and magnitude.
VELVET|2|A fabric with a dense, soft pile on one side.
VENDOR|1|A person or company that sells goods or services
VENICE|1|Italian city built on a lagoon, famous for its canals
VENUES|2|Places where public events take place
VERBAL|2|Relating to words or spoken language rather than writing
VERIFY|1|To check that something is true or accurate
VERNON|3|A male given name, or a town in British Columbia, Canada
VERSES|1|Lines of poetry or sections of a song or poem
VERSUS|2|Against, especially in a contest or lawsuit
VESSEL|2|A ship or large boat
VESTED|3|Having a legally secured right or a personal stake in something
VIABLE|2|Capable of working successfully; feasible
VICTIM|2|One who is harmed, injured, or killed by an event or crime
VICTOR|1|The winner of a battle or contest
VIDEOS|2|Recorded visual clips you can play back
VIENNA|2|the capital city of Austria
VIEWED|2|Looked at or regarded something in a certain way
VIEWER|1|A person who watches television or other visual media.
VIKING|3|Norse seafarers known for raiding.
VIKTOR|3|A common male first name.
VILLAS|2|Large, luxurious country houses
VIOLET|1|A small flower with purple-blue petals
VIOLIN|1|A four-stringed instrument played with a bow
VIRGIL|3|Ancient Roman poet who wrote the Aeneid
VIRGIN|3|Untouched, pure, or in its original natural state
VIRTUE|2|A trait considered morally good
VISION|2|The faculty or sense of sight
VISITS|2|Goes to see a person or place
VISUAL|2|Relating to seeing or sight
VIVIAN|2|A given name meaning 'full of life' in Latin
VOCALS|2|The singing parts of a piece of music
VOICED|2|Expressed something in words
VOICES|2|Sounds people produce when speaking or singing
VOLUME|3|The amount of space a substance or object occupies
VOODOO|2|A religion involving spirits and magic, practiced especially in Haiti
VORTEX|3|A mass of spinning air, water, or fluid pulling inward
VOTERS|2|People entitled to cast a ballot in an election
VOTING|2|The act of casting ballots
VOYAGE|1|A long journey, especially by sea or in space
VULGAR|2|Lacking refinement or good taste
WAGNER|3|German composer known for operas like 'The Ring Cycle'
WAGONS|1|Four-wheeled vehicles used for hauling goods or passengers
WAITED|2|Stayed in place until something happened
WAITER|2|A person who serves food and drinks in a restaurant.
WAIVED|3|Chose not to insist on a right or claim
WAIVER|4|A formal act of giving up a right or claim
WAKING|2|Stopping sleep and becoming alert again
WALKED|1|Moved along on foot, in the past
WALKER|2|A wheeled or framed aid that helps a person move on foot
WALLED|2|Enclosed on every side by a barrier
WALLET|1|A small folding case for carrying money and cards
WALNUT|2|A type of tree nut.
WALTER|3|A traditional masculine given name
WALTON|4|Surname of the founder of Walmart
WANDER|1|To walk around without a fixed destination
WANTED|2|Wished for or desired something
WARDEN|2|An official who oversees a prison or park
WARMED|1|Made something less cold
WARMER|2|Having a higher temperature in comparison to something else
WARMTH|2|The quality of having a moderate degree of heat
WARNED|3|Alerted someone in advance of possible danger
WARNER|3|One who gives notice of possible danger
WARREN|3|A network of underground rabbit burrows
WARSAW|1|The capital and largest city of Poland
WASHED|2|Cleaned with water and, usually, soap
WASTED|2|Used up carelessly or to no purpose
WATERS|2|The expanse of sea around a coast or country
WATSON|2|Sherlock Holmes's loyal companion and chronicler
WAVING|1|Moving a hand back and forth as a greeting or signal
WEAKEN|1|To make or become less strong or powerful
WEAKER|1|Having less strength or power; comparative form
WEALTH|2|An abundance of money or possessions
WEAPON|2|An instrument used for fighting or attack
WEAVER|2|One who makes fabric.
WEBCAM|1|A small camera used for video calls over the internet
WEEKLY|2|Happening or appearing once every seven days
WEIGHS|2|Measures the heaviness of an object using a scale
WEIGHT|1|A measure of how heavy something is
WENGER|4|Former long-serving manager of Arsenal Football Club, first name Arsène
WESLEY|2|A common English given or family name
WESTON|3|A common English surname, also a town near Bristol
WHALES|1|Large marine mammals that breathe air through a blowhole.
WHEELS|1|Round parts that turn to let a vehicle roll along
WHILST|4|During the time that; chiefly British in usage
WHISKY|1|A distilled alcoholic spirit made from fermented grain mash
WHITES|3|Light-coloured laundry washed apart from the darks
WHOLLY|3|Completely and without exception
WHOOPS|1|An exclamation made after a small blunder
WICKED|2|Morally wrong or evil.
WICKET|3|A set of three stumps in cricket
WIDELY|3|Over a large area or among many people
WILDER|2|More untamed or uncontrolled
WILDLY|2|In an uncontrolled or extreme manner
WILLIS|2|Surname of the Hollywood actor known for the Die Hard film series
WILLOW|2|A tree with slender, flexible branches, often found near water
WILSON|2|Very common English surname meaning 'son of Will'
WINDOW|1|Glass-filled opening in a wall
WINGED|2|Equipped with feathered limbs and capable of flight
WINGER|3|A player positioned on the side of a team.
WINNER|1|One who comes first in a contest
WINTER|1|The coldest season of the year
WIPING|1|Cleaning a surface by rubbing it
WIRING|2|A system of electrical wires in a building
WISDOM|2|The quality of having good judgement and deep understanding
WISELY|2|In a manner showing good sense or judgment
WISHED|2|To desire something that is not the case.
WISHES|2|Hopes or desires for something to happen
WITHIN|2|Inside the limits or bounds of something
WIZARD|1|A person who practices magic
WOLVES|2|Wild canines known for living in packs.
WOMENS|1|Relating to or intended for females
WONDER|2|A feeling of amazement and admiration
WOODEN|1|Made from timber
WORKED|2|Functioned or operated, in the past
WORKER|1|A person who is employed to do a job
WORLDS|3|Planets or separate realms of existence, taken together
WORTHY|2|Deserving of respect, attention, or support
WOUNDS|2|Injuries to the body.
WRIGHT|5|An artisan who builds or constructs things, surviving today mainly in compound job titles
WRISTS|1|The joints linking the hands to the forearms
WRITER|2|One who composes books, articles, or stories
WRITES|2|Forms letters or words to compose text
XAVIER|3|A given name of Basque origin meaning 'new house'
YANKEE|3|A term for an American, especially from the North.
YEARLY|1|Happening once every twelve months
YELLED|1|Shouted loudly
YELLOW|1|The color of lemons and sunflowers
YIELDS|2|Produces or provides as a result
YOGURT|1|A creamy food made by fermenting milk with live cultures
YORKER|4|A cricket delivery that pitches right at the batsman's feet
YOUTHS|1|Young people, especially in their teens.
ZAMBIA|3|A landlocked country in southern Africa whose capital is Lusaka
ZODIAC|2|A belt of constellations used in astrology, divided into twelve signs
ZOMBIE|1|A reanimated corpse in horror fiction
ZONING|1|Government regulation dividing land into areas for different types of use
ZURICH|2|Largest city in Switzerland
ABANDON|2|to leave behind.
ABDOMEN|3|The part of the body containing digestive organs.
ABIDING|3|Lasting for a long time; enduring
ABIGAIL|2|A female given name of Hebrew origin meaning 'father's joy'
ABILITY|2|The power or skill to do something
ABOLISH|2|To formally end a law, system, or practice
ABRAHAM|3|A significant biblical patriarch.
ABSENCE|2|State of being away or not present
ABUSING|2|Treating someone or something cruelly or improperly
ABUSIVE|2|Using cruel, insulting, or violent language or behavior
ACADEMY|3|A society or school for higher learning, art, or science
ACCENTS|2|Distinctive modes of pronunciation.
ACCEPTS|1|Agrees to receive or take something offered
ACCOUNT|2|A record of money received and paid out by a bank or business
ACCUSED|2|Charged with having done wrong
ACCUSES|2|Formally charges someone with wrongdoing
ACHIEVE|2|To bring about or reach by effort
ACQUIRE|2|To come to possess or obtain something
ACRONYM|2|A word formed from the first letters of a longer phrase
ACRYLIC|2|A synthetic resin used in paints, fibers, and plastics
ACTIONS|2|Things that are done; deeds
ACTRESS|1|A woman who performs in plays or films
ADAPTED|2|Changed to suit new conditions or a new medium
ADAPTER|2|A device that allows compatibility between different systems.
ADDICTS|3|People who are dependent on a substance.
ADDISON|2|A given or family name, also a well-known Washington D.C. street
ADDRESS|2|The details of where someone lives or works
ADMIRAL|3|A high-ranking naval officer.
ADMIRED|1|Regarded with respect or approval
ADOPTED|3|Legally took another's child as one's own
ADORNED|2|Decorated or made more beautiful
ADVANCE|2|To move forward or make progress
ADVERSE|3|Unfavorable or harmful in effect.
ADVISED|3|Recommended a course of action to someone
ADVISER|1|A person who gives expert guidance
ADVISES|2|Offers suggestions about the best course of action
ADVISOR|2|A person who gives expert guidance
AFFAIRS|3|Business or events of public or personal concern
AFFECTS|2|Has an influence on or produces a change in something
AFRICAN|2|Relating to the world's second-largest continent
AGAINST|3|In opposition to
AIRLINE|1|A company that provides air transport services.
AIRPORT|1|Place where planes take off and land
AIRWAYS|2|The passages carrying oxygen from the nose to the lungs
ALABAMA|2|Southern U.S. state with capital Montgomery
ALARMED|1|Filled with sudden fear or anxiety
ALBERTA|2|A province in western Canada, capital Edmonton
ALBERTO|3|A common Spanish and Italian male first name
ALCOHOL|2|Intoxicating ingredient in beer and wine
ALGEBRA|2|Branch of mathematics that uses letters and symbols to represent numbers in equations.
ALGERIA|3|The largest country in Africa, whose capital is Algiers
ALIGNED|2|Arranged in a straight line
ALLEGED|4|Claimed to be true without proof
ALLERGY|2|A condition in which the immune system reacts abnormally to a substance.
ALLISON|2|A common feminine first name, a variant of Alice
ALLOWED|2|Gave permission for something to happen
ALREADY|3|Before or by now; prior to a specified moment
ALRIGHT|2|Satisfactory, though not especially good
ALTERED|3|changed or modified.
ALVAREZ|3|A common surname of Spanish origin.
AMATEUR|2|One who does something for love rather than pay
AMAZING|2|Causing great surprise or wonder; astonishing
AMBIENT|3|Relating to the immediate surroundings of something
AMBROSE|3|A male given name meaning 'immortal' in Greek
AMENDED|2|Changed for the better; revised
AMERICA|2|Either continent of the Western Hemisphere, or the U.S. informally.
AMNESTY|3|An official pardon for people convicted of offenses
AMONGST|3|In the middle of; surrounded by
AMOUNTS|2|Quantities or sums of something
AMUSING|1|Causing laughter or light entertainment
ANAHEIM|2|California city that is home to Disneyland
ANALOGY|2|A comparison between two things to explain or clarify
ANALYSE|2|To examine something methodically in detail
ANALYST|3|A person who examines data.
ANALYZE|1|To examine something in detail
ANARCHY|2|A state of society with no government or law
ANATOMY|2|The bodily structure of an organism
ANCHORS|2|Heavy devices used to moor a ship to the seabed
ANCIENT|2|Belonging to the very distant past
ANDREAS|4|Famous California fault line named after this saint
ANDROID|2|A robot built to resemble a human being
ANGELES|3|The word paired with 'Los' in a Southern California city's name
ANGUISH|2|Severe mental or physical suffering.
ANGULAR|2|Having sharp corners; lean and bony in shape
ANIMALS|1|Living creatures other than plants or people
ANNEXED|3|Took control of a territory and incorporated it into one's own
ANNOYED|1|Made mildly angry
ANOMALY|2|Something that deviates from what is standard or expected
ANOTHER|2|One more; an additional.
ANSWERS|2|Responses given to questions
ANTENNA|1|Device that sends or receives radio signals.
ANTHONY|3|A male first name; the patron saint of lost things bears it
ANTIQUE|2|Valued because of its considerable age
ANTOINE|2|A traditionally French male first name
ANTONIO|3|The title merchant in a Shakespeare play set in Venice
ANXIETY|2|A feeling of worry or unease about an uncertain outcome
ANXIOUS|2|Feeling worried, nervous, or uneasy about something
ANYBODY|2|Any person at all
ANYMORE|4|Any longer; at the present time, as opposed to the past
ANYTIME|3|At whatever moment; with no restriction on when
ANYWAYS|3|In any case; regardless.
APOLOGY|2|An expression of regret for a wrong or offence
APOSTLE|2|One of the twelve original followers chosen by Jesus
APPAREL|2|Clothing, especially fine or formal wear
APPEALS|3|Makes an earnest request, or takes a case to a higher court
APPEARS|2|Comes into sight or becomes visible
APPLAUD|1|To express approval by clapping
APPLIED|2|Made a formal request, such as for a job or place
APPLIES|3|Is relevant to, or formally requests (third person singular)
APPOINT|2|To formally choose someone for a job or role
APPROVE|2|To officially accept or sanction something
AQUATIC|1|Relating to or living in water
ARABIAN|2|Relating to the Middle Eastern peninsula bordered by the Red Sea and Persian Gulf
ARCHIVE|3|A collection of historical documents.
ARGUING|2|Exchanging opposing views, often heatedly
ARISING|3|Originating or resulting from a particular situation
ARIZONA|2|Southwestern U.S. state bordering Mexico, capital Phoenix
ARMENIA|4|A country located in the South Caucasus region.
ARMORED|2|Covered or protected with defensive metal plating
ARRANGE|2|To put things in a proper order.
ARRESTS|2|Acts of officially detaining someone suspected of a crime
ARRIVAL|2|The act of reaching a destination
ARRIVED|2|Reached a destination
ARRIVES|1|Reaches a destination
ARSENAL|3|A store of weapons, or a North London football club
ARTICLE|2|A piece of writing in a newspaper, or a grammatical word like 'a' or 'the'
ARTISTS|1|People who create paintings, music, or other creative works
ARTWORK|2|Illustrations and images in a book or magazine
ASHAMED|3|Feeling guilt or embarrassment.
ASPECTS|3|Particular features or sides of a subject
ASPHALT|1|A dark, sticky substance used for surfacing roads
ASSAULT|2|A violent physical attack on a person or place
ASSERTS|3|States something confidently as a fact
ASSISTS|2|To help or aid.
ASSUMED|3|Accepted as true without proof
ASSUMES|2|Takes something to be true without proof
ASSURED|3|Confident and certain of oneself
ATHEISM|2|Disbelief in the existence of God or gods
ATHEIST|2|A person who does not believe in the existence of a god
ATHLETE|1|A person trained to compete in sports
ATLANTA|2|Capital and largest city of the U.S. state of Georgia
ATLEAST|1|Not less than a specified amount.
ATTACKS|3|Aggressive actions intended to harm or capture
ATTEMPT|2|An effort made to achieve something
ATTENDS|2|Is present at an event or place
ATTRACT|2|To draw in or pull toward by some quality or force
AUCTION|2|A public sale where goods go to the highest bidder
AUDIBLE|2|Loud enough to be heard
AUDITOR|3|A person who officially examines financial accounts
AUGUSTA|2|A city in Georgia, USA.
AUSTRIA|2|A landlocked Alpine country whose capital is Vienna
AUTHORS|1|Writers of books or articles
AUTOPSY|4|An examination to determine the cause of death.
AVENUES|2|Broad, often tree-lined city streets
AVERAGE|3|The figure found by dividing a total by the number of items
AVOCADO|2|A pear-shaped fruit with rich green flesh and a large single seed
AVOIDED|2|Kept away from or prevented from happening
AWAITED|2|To wait for something to happen
AWARDED|2|Given officially as a prize, honor, or payment
AWESOME|2|Inspiring great admiration or awe
AWFULLY|1|Very or extremely, in informal speech
AWKWARD|3|Causing embarrassment or difficulty to handle
BABYLON|3|An ancient city known for its hanging gardens.
BACKING|3|Support, especially financial or moral, given to a person or cause
BAGGAGE|1|Bags and suitcases carried by a traveler
BAGHDAD|2|The capital city of Iraq, on the banks of the Tigris
BAHAMAS|2|a chain of tropical islands in the Caribbean, once a British colony
BAHRAIN|2|a small island nation in the Persian Gulf
BALANCE|2|An even distribution that keeps something steady and upright
BALCONY|1|A platform projecting from a building's wall
BALDWIN|3|Surname of several Hollywood acting brothers, including Alec
BALLOON|1|A rubber bag inflated with air or gas, used as decoration or for flight
BALLOTS|2|Papers or tickets used to cast a vote in an election
BANANAS|1|Long curved tropical fruits with soft yellow flesh.
BANDITS|2|Armed robbers who typically operate in gangs, often in remote areas
BANGING|2|Making a series of loud, repeated knocks
BANGKOK|1|Capital city of Thailand
BANKERS|2|People who manage money, loans, and accounts for a financial institution.
BANKING|2|The industry of institutions that hold and lend money
BANNERS|2|Large pieces of cloth with a message.
BANNING|2|Officially forbidding something
BANQUET|2|a formal meal for a large number of people
BAPTISM|3|A Christian sacrament of initiation.
BAPTIST|3|A member of a Protestant denomination that immerses believers in water as a rite of initiation
BARBARA|3|A female given name, as borne by singer Streisand
BARGAIN|1|Something bought for less than its usual worth
BARKING|1|Making the sharp, loud sound a dog makes
BARNETT|3|A common English surname
BARRAGE|3|A rapid, heavy outpouring of something, such as gunfire or criticism
BARRELS|1|Large cylindrical containers for storing liquids
BARRETT|3|A surname of English origin, fairly common in the US and UK
BARRIER|2|An obstacle that blocks movement or access
BARRING|2|Except for; unless something happens
BASHING|2|Harsh, aggressive criticism of someone or something
BASKETS|1|Woven containers used for holding or carrying things
BATHING|1|Washing or soaking oneself in water
BATHTUB|2|tub
BATSMAN|2|A cricket player whose job is to hit the ball with a wooden implement.
BATTERY|2|A portable source of stored electrical power
BATTING|1|The act of striking a ball in cricket or baseball
BATTLES|2|Sustained fights between opposing armed forces
BEACHES|1|Sandy or pebbly shores by a body of water.
BEARING|3|One's manner or way of carrying oneself
BEATING|2|A severe physical thrashing or pummeling
BEATLES|2|A famous British rock band from Liverpool formed in the 1960s
BECAUSE|2|For the reason that
BECKETT|4|Irish playwright who wrote 'Waiting for Godot'
BECKHAM|2|Former Manchester United and England footballer famous for free kicks
BECOMES|3|Grows to be; turns into
BEDDING|1|Sheets, blankets, and pillows used to make up where you sleep.
BEDFORD|5|A town in England or a surname.
BEDROOM|1|A room used mainly for sleeping
BEDTIME|2|The time at which one goes to bed.
BEGGING|2|Asking urgently and humbly for something, especially money or food.
BEHAVED|2|conducting oneself in a proper manner
BEIJING|2|The capital city of China
BELARUS|2|Eastern European country bordering Poland, Russia, and Ukraine
BELFAST|2|Capital city of Northern Ireland
BELGIAN|2|Relating to a small Western European country famous for chocolate and waffles.
BELGIUM|2|Western European nation famous for waffles, chocolate and Brussels
BELIEFS|2|Things one accepts as true
BELIEVE|2|To accept something as true or real
BELONGS|2|Is owned by someone, or rightly fits in a place
BELOVED|2|Dearly loved; cherished above all others
BENCHES|1|Long seats for several people, often found in parks
BENDING|2|Curving or flexing something away from its straight form
BENEATH|2|In or to a lower position than something; under
BENEFIT|2|An advantage or profit gained from something
BENGALS|2|An NFL football team based in Cincinnati, Ohio
BENNETT|3|A common surname.
BENTLEY|3|a luxury automobile brand
BERMUDA|2|A British territory in the North Atlantic known for pink-sand beaches
BERNARD|1|a common male name.
BERRIES|2|Small, juicy fruits.
BESIDES|4|In addition to; apart from what has been mentioned
BETTING|3|The act of wagering money on an outcome.
BETWEEN|2|In the space separating two things.
BEVERLY|1|A feminine given name of English origin
BEYONCE|3|Grammy-winning singer known for 'Halo' and 'Single Ladies'
BICYCLE|1|A vehicle with two wheels powered by pedaling.
BIDDING|2|The act of offering a price, especially at an auction.
BIGGEST|2|Greatest of all in size
BIGOTRY|3|Intolerant prejudice against those who differ from oneself
BILLING|2|the process of invoicing customers
BILLION|3|A number equal to a thousand million
BINDING|3|Legally obligatory and impossible to break
BIOLOGY|1|The scientific study of living organisms
BIOMASS|3|Organic material used as fuel or energy source
BIPOLAR|2|Marked by two opposite extremes or moods
BISCUIT|1|A small, flat baked good, often eaten with tea
BISHOPS|2|Senior clergy members in a church
BITCHES|1|Female dogs
BITCOIN|3|A decentralized digital currency launched in 2009
BIZARRE|3|very strange or unusual.
BLADDER|2|The organ that stores urine before it leaves the body
BLAMING|2|Holding someone responsible for a fault
BLANCHE|3|A feminine given name derived from the French word for white
BLANKET|1|A large piece of woven fabric used for warmth in bed
BLASTED|2|Destroyed or damaged by an explosion
BLATANT|2|Completely obvious and done without any attempt at concealment
BLAZING|1|Burning fiercely and brightly
BLENDED|1|Mixed thoroughly together into a smooth combination
BLENDER|2|A kitchen appliance used to mix or puree food
BLESSED|4|Endowed with divine favor or made holy
BLINDED|1|Made unable to see
BLOCKED|2|Obstructed so nothing can pass through
BLOGGER|1|Someone who publishes regular online journal entries.
BLOSSOM|1|A flower, especially one on a fruit tree
BLOWING|2|Moving or being driven along by a current of air
BLURRED|1|Made unclear or indistinct
BOARDED|2|Got onto a vehicle such as a ship or plane
BOILING|1|Heating a liquid until it bubbles and turns to vapour
BOLIVIA|2|a landlocked country in South America with two capital cities
BOMBERS|3|Military aircraft designed to attack ground targets with explosives
BOMBING|2|An attack using explosive devices dropped or planted
BONDAGE|2|The condition of being enslaved or held captive
BONDING|3|The process of forming a close emotional connection with someone
BONUSES|1|Extra sums of money or rewards given in addition to what is expected
BOOKING|2|A reservation made in advance.
BOOKLET|1|pamphlet
BOOMERS|2|People born in the population surge after World War II
BOOMING|2|Growing rapidly and successfully, as an economy or business
BOOSTED|1|Increased or improved the level of something
BOOSTER|3|A device that increases power or effectiveness.
BORDERS|2|The dividing lines between two countries or regions
BOREDOM|1|A feeling of weariness caused by lack of interest
BOROUGH|2|An administrative district of a city, as in New York
BOTHERS|2|To disturb or annoy someone.
BOTTLED|2|Sealed a liquid inside a glass or plastic container
BOTTLES|2|Narrow-necked containers for holding liquids
BOTTOMS|2|the lower halves of a two-piece garment
BOULDER|1|A large detached rock lying on the ground
BOUNCED|2|Moved up or away abruptly after striking a surface
BOUNDED|2|Moved forward with energetic leaps or jumps
BOUQUET|1|A bunch of flowers arranged for beauty
BOURBON|3|A type of American whiskey.
BOWLING|2|A game of rolling a ball to knock down pins
BOYCOTT|2|To refuse to buy or participate in something as a form of protest.
BRACKET|2|A support projecting from a wall
BRADLEY|5|A common male first name.
BRAKING|2|Slowing or bringing a moving vehicle to a stop.
BRANDED|2|Marked with a hot iron to show ownership
BRANDON|2|A common male first name
BRAVERY|2|the quality of being courageous
BREADTH|2|The distance or extent from side to side
BREAKER|3|Something that interrupts or stops.
BREAKUP|2|The ending of a romantic relationship
BREASTS|2|The chest area of a female body
BREATHE|2|To draw air into the lungs and let it out again
BRENDAN|2|A common male first name of Irish origin.
BRENNAN|4|A surname of Irish origin, also used for a forensic anthropologist character on TV
BREWERS|2|People who make beer for a living
BREWERY|2|A facility where beer is produced.
BREWING|2|Making a drink such as beer or tea through steeping and boiling
BRIBERY|2|The crime of giving money or gifts to influence someone dishonestly
BRIDGES|2|Structures built to span rivers, roads, or valleys
BRIDGET|2|A common female first name, Irish in origin
BRIEFLY|2|For a short time; in few words
BRIGADE|2|A large military unit made up of several battalions
BRISTOL|3|A city in England.
BRITAIN|3|The island comprising England, Scotland and Wales
BRITISH|1|Relating to the United Kingdom
BRITNEY|2|First name of the pop star known for 'Toxic' and 'Baby One More Time'.
BROADER|3|Wider in extent or scope.
BROADLY|2|In a general way, without focusing on the details.
BROKERS|2|People who arrange deals between buyers and sellers
BRONCOS|2|Denver's NFL football team
BROTHER|2|A male child of the same parents
BROUGHT|3|Carried or conveyed to a place, in the past tense
BROWSER|2|An application used to navigate and view pages on the internet.
BRUISED|1|Marked with a discolored area of skin from an impact.
BRUISES|2|Discolored marks on the skin caused by an impact
BRUSHED|3|Cleaned, smoothed, or arranged using short repeated strokes
BRUSHES|1|Tools used for painting or cleaning.
BUBBLES|1|Small spheres of gas enclosed in a thin film of liquid
BUCKETS|1|Cylindrical containers with a handle, used to carry liquids
BUCKLEY|3|Surname of the singer Jeff, famous for a soulful cover of 'Hallelujah'
BUDDIES|1|Close friends or companions.
BUDGETS|2|Plans for how money will be spent over a period of time
BUFFALO|2|A large wild ox of Africa or North America
BUILDER|1|A person whose job is to construct houses and other structures.
BUILDUP|2|A gradual increase or accumulation of something over time.
BULLDOG|1|A short, stocky canine breed known for its wrinkled, jowly face
BULLETS|2|Projectiles fired from a gun.
BULLIED|2|Used strength or influence to intimidate someone weaker.
BULLIES|2|People who habitually intimidate weaker people
BULLOCK|3|A young ox raised for beef or work
BUNDLES|1|Groups of things tied, wrapped, or fastened together
BURGERS|1|Ground-meat patties served in a bun
BURGESS|4|historically, an elected representative or citizen of an English borough
BURNING|2|On fire or giving off flames
BURNLEY|3|A town in Lancashire, England, and its football club.
BUSIEST|2|Having the most activity or work of all
BUSTING|2|Breaking apart or smashing something
BUTCHER|1|A person who sells meat
BUTTONS|2|Small fasteners used to close clothing.
BUZZING|2|Making a continuous humming or vibrating sound
CABBAGE|1|A leafy green vegetable.
CABINET|2|A piece of furniture with shelves or drawers
CALCIUM|2|A chemical element essential for strong bones and teeth.
CALGARY|2|A major city in Alberta, Canada
CALIBER|3|The internal diameter of a gun's barrel
CALLING|3|A strong inner urge toward a particular vocation
CALORIE|2|a unit of energy provided by food
CAMERAS|1|Devices used to take photographs
CAMERON|4|A given name shared by a former UK prime minister and a Titanic director
CAMPING|2|The activity of staying in a tent or outdoors.
CANCERS|3|Diseases characterized by uncontrolled cell growth.
CANDLES|1|Wax cylinders with a central wick, burned to give light.
CANNONS|2|Large mounted guns that fire heavy projectiles
CANUCKS|2|Informal nickname for Canadians.
CAPABLE|3|Having the skill or power to do something
CAPITAL|2|The city that serves as the seat of a government
CAPITOL|3|A building where a legislative assembly meets.
CAPSULE|2|A small soluble shell enclosing a dose of medicine.
CAPTAIN|1|The leader of a team or commander of a ship
CAPTION|2|A brief text describing an image or illustration
CAPTIVE|2|A person or animal held prisoner or confined.
CAPTURE|2|To take prisoner or catch by force
CARAMEL|1|A chewy, golden-brown confection made from heated sugar
CARAVAN|2|A group of vehicles, or travelers, journeying together
CARDIAC|2|Relating to the heart
CARDIFF|2|Capital city of Wales
CAREERS|3|Long-term professional occupations one pursues for life
CAREFUL|2|Taking pains to avoid mistakes or harm
CARLSON|2|A surname of Scandinavian origin, common in the American Midwest
CARLTON|3|Fresh Prince of Bel-Air's dancing cousin
CAROLYN|3|Female given name derived from the French for 'free man'
CARPETS|1|Thick fabric coverings for floors.
CARRIED|3|Transported or held while moving from place to place
CARRIER|2|A person or thing that transports something
CARRIES|3|Holds and moves something from one place to another
CARROLL|2|Surname of the mathematician who wrote 'Alice in Wonderland' under a pen name
CARROTS|1|Orange root vegetables often eaten raw or cooked
CARTOON|2|A humorous drawing or an animated film
CARVING|2|Cutting material such as wood or stone to create a design or shape
CASCADE|2|A small waterfall, often one of a series
CASHIER|1|An employee handling transactions.
CASINOS|1|Establishments where people gamble at games of chance
CASSIDY|3|Surname of the outlaw Butch, famous alongside the Sundance Kid
CASTING|2|Choosing actors to fill roles in a film or play
CASTLES|1|Large fortified buildings, often medieval residences of royalty
CATALAN|3|Relating to a region of northeastern Spain and its language
CATALOG|2|A systematic list of items, often for sale
CATCHER|2|The baseball player positioned behind home plate
CATCHES|2|Takes hold of something moving through the air, typically with the hands.
CAUSING|3|Making something happen or bringing it about
CAUTION|2|Care taken to avoid danger or mistakes.
CAVALRY|2|Soldiers who fight on horseback
CEILING|1|The overhead surface of a room
CELTICS|3|A professional basketball team based in Boston.
CENTERS|2|Middle points of circles or regions
CENTRAL|2|In the middle, or of chief importance
CENTRED|2|Placed in or aligned with the middle
CENTRES|2|Middle points of circles or areas (British spelling)
CENTRIC|2|Having a specified thing as the main focus or interest
CENTURY|2|A period of one hundred years
CERAMIC|2|Made of clay that has been hardened by heat
CERTAIN|2|Completely sure about something
CHAIRED|2|Presided over or led, as a meeting or committee
CHAMBER|2|A large room used for a particular purpose
CHANCES|2|Possibilities that something will happen
CHANGED|2|Made or became different (past tense)
CHANGER|2|A device or person that alters something
CHANGES|2|Alterations made to something
CHANNEL|3|A band of frequencies carrying one broadcast station
CHAOTIC|1|In a state of complete disorder
CHAPMAN|2|A common English surname
CHAPTER|1|A main division of a book
CHARGED|3|Formally accused of committing a crime
CHARGER|1|A device that supplies power to a battery
CHARGES|3|Fees demanded for goods or services; or rushes forward
CHARITY|2|An organization set up to help those in need
CHARLES|3|A male given name borne by several British and French kings
CHARLIE|3|Informal pet form of a boy's given name starting with C
CHARTER|4|A formal document granting rights, or the hiring of a vehicle
CHASING|2|Running after someone or something in order to catch it
CHASSIS|1|Vehicle frame structure
CHATTER|2|Rapid, informal talk about trivial matters
CHEAPER|1|Lower in price than the alternative
CHEATED|1|Acted dishonestly to gain an advantage
CHECKED|2|Examined something to confirm its accuracy or condition
CHEERED|1|Shouted encouragement or approval
CHELSEA|3|An affluent district in southwest London
CHEMIST|1|A scientist who studies the properties of substances
CHENNAI|3|Indian city on the Bay of Bengal, formerly known as Madras
CHERISH|1|To hold dear and care for tenderly
CHESTER|3|A historic walled city on the River Dee, in northwest England
CHEWING|1|Biting and grinding food repeatedly with the teeth
CHICAGO|3|Largest city in Illinois, sitting on Lake Michigan
CHICKEN|1|A common farm bird raised for eggs and meat
CHIEFLY|2|For the most part; mainly
CHILEAN|2|Relating to the long, narrow country in South America
CHILLED|2|Made cold, as a drink or dish
CHIMNEY|1|A structure for venting smoke from a fireplace.
CHINESE|2|Relating to the world's most populous nation
CHOICES|2|Options available for selection
CHOKING|3|To have difficulty breathing due to an obstruction.
CHOOSES|2|Picks one option from several available
CHOPPED|1|Cut into pieces with a sharp tool
CHRONIC|3|Persisting for a long time or constantly recurring
CHUCKLE|1|To laugh quietly or to oneself
CINEMAS|2|Places where films are shown.
CIRCLES|2|Round shapes, or groups of people with shared interests
CIRCUIT|3|A closed path through which current flows
CITIZEN|2|A legally recognized national of a country
CLAIMED|3|Asserted to be true, or took as one's own
CLARIFY|2|To make a statement or situation less confusing and more precise.
CLARITY|1|The quality of being clear and easy to understand
CLASHES|2|Violent disagreements or conflicts between opposing sides
CLASSES|2|Groups of pupils taught together, or distinct social ranks
CLASSIC|3|Judged over time to be of the highest quality
CLAUDIA|1|A common female given name.
CLAUSES|3|Grammatical units containing a subject and verb
CLAYTON|3|English place name and popular male given name
CLEANED|2|Made free of dirt.
CLEANER|1|A person employed to tidy and sanitize a building
CLEANSE|1|To rid something of dirt, germs, or impurities
CLEANUP|2|The act of tidying or removing mess
CLEARED|2|Removed obstacles from, or declared free of blame
CLEARER|2|More easily seen, heard, or understood
CLEARLY|2|In a way that is easy to see or understand
CLEMENT|4|Mild-mannered and forgiving, as of weather or a ruling
CLEMSON|3|A public university in South Carolina known for its Tigers athletic teams
CLICKED|2|made a short, sharp sound
CLIENTS|2|People who use the services of a professional or business
CLIMATE|2|The typical weather conditions of a region over time
CLIMBED|1|Ascended using hands and feet
CLINICS|2|Places where outpatients receive medical treatment or advice
CLINTON|3|Surname shared by Bill and Hillary
CLOSELY|3|In a careful or attentive manner
CLOSEST|2|Nearest in distance or relationship
CLOSING|2|Bringing to an end or shutting up
CLOSURE|3|A feeling of resolution or finality after an event
CLOTHES|1|Items worn to cover the body
CLUSTER|2|A group of similar things or people positioned closely together.
COACHED|2|Trained or instructed in a specific skill.
COACHES|2|People who train and direct athletes or teams
COASTAL|2|Located on or near the shore of the sea
COASTER|1|A small mat placed under a glass to protect a table
COATING|2|A layer of a substance spread over a surface
COCAINE|3|Illegal white powder narcotic
COCKPIT|3|The area where the pilot controls an aircraft.
COCONUT|1|Large brown tropical fruit with a hard shell and white flesh
COLBERT|2|Stephen ___, American late-night talk show host and satirist
COLEMAN|2|American brand famous for camping stoves and coolers
COLLECT|1|To gather things together in one place
COLLEGE|2|An institution for higher or professional learning
COLLINS|3|Common English surname, or a tall gin cocktail served with lemon and soda
COLOGNE|2|A scented liquid for personal fragrance.
COLONEL|3|A senior military officer ranking just below a general
COLORED|2|Having been given a particular hue or tint
COLOURS|1|Hues such as red, green and blue
COLUMNS|2|Vertical sections in a table or a series of articles.
COMBINE|2|To join or merge two or more things into one
COMCAST|3|American telecommunications conglomerate that owns NBCUniversal
COMEDIC|1|Relating to humor on stage or screen; funny in style
COMFORT|2|A state of physical ease and freedom from pain
COMMAND|2|An authoritative order to be obeyed
COMMENT|1|A spoken or written remark
COMMITS|2|Pledges or promises to do something
COMMONS|3|The lower house of the British Parliament
COMMUTE|2|to travel regularly to and from a place
COMPACT|2|Closely packed together.
COMPANY|1|A commercial business organization
COMPARE|2|To examine two things to note similarities and differences
COMPASS|1|An instrument with a magnetic needle that shows direction.
COMPETE|2|To strive against others for a prize or goal
COMPILE|2|To collect and assemble information from various sources
COMPLEX|3|Made up of many interconnected parts
COMPOSE|2|To create or write, especially music or text
COMPTON|3|City in Los Angeles County, California, known for its hip-hop scene
COMPUTE|1|To calculate a result mathematically
COMRADE|3|A companion who shares one's activities or interests.
CONCEAL|2|To hide something from sight or knowledge
CONCEDE|2|To admit that something is true, often reluctantly
CONCEPT|3|An abstract idea or general notion
CONCERN|2|A feeling of worry or anxiety
CONCERT|1|A live public performance of music
CONCISE|2|Giving information clearly in few words
CONCORD|3|A state of peaceful agreement between people or groups
CONDEMN|2|To express strong disapproval of
CONDOMS|2|Protective sheaths used during intercourse.
CONDUCT|3|To organize and carry out an activity
CONFESS|1|To admit that one has done something wrong
CONFIRM|2|To establish the truth or correctness of something
CONFORM|2|To comply with rules, standards, or expectations
CONFUSE|1|To make someone unable to think clearly.
CONNECT|1|To join or link two things together
CONQUER|2|To overcome or take control of by force
CONSENT|2|Permission for something to take place
CONSIST|2|To be made up of specified parts
CONSOLE|2|To offer comfort to someone in grief
CONSULT|2|To seek information or advice from someone
CONSUME|2|To eat, drink, or use up
CONTACT|2|To get in touch with someone
CONTAIN|2|To have or hold within itself
CONTEND|3|to assert something as a position in an argument
CONTENT|3|Satisfied
CONTEST|2|A competition in which people try to win
CONTEXT|2|The circumstances that surround an event or statement
CONTROL|2|The power to direct or manage something
CONVENT|2|A building where a community of nuns lives
CONVERT|2|To change something into a different form or use
CONVICT|3|to declare someone guilty of a crime
COOKIES|1|Small, flat, sweet baked treats
COOKING|1|The art or practice of preparing food with heat
COOLEST|3|Most impressively stylish or fashionable, superlative degree
COOLING|3|The process of lowering temperature.
COPYING|1|Reproducing something exactly
CORNELL|3|Ivy League university located in Ithaca, New York
CORNERS|1|The points where two lines meet.
CORONER|2|An official who investigates the cause of unexplained deaths
CORPSES|1|Dead bodies, especially of humans
CORRECT|2|Free from error; accurate
CORRUPT|2|Dishonest and willing to act illegally for personal gain
COSPLAY|2|The practice of dressing as a character from fiction
COSTING|3|The process of estimating and calculating expenses for a project
COSTUME|2|A set of clothes worn to look like someone or something else
COTTAGE|2|A small house, usually in the countryside.
COULDNT|2|Contracted way of saying 'was not able to'
COUNCIL|2|An assembly of people convened to advise or govern
COUNSEL|4|Guidance given formally; also a legal adviser in court
COUNTED|2|To determine the total number of.
COUNTER|2|A flat surface in a shop or kitchen where business is done or food prepared
COUNTRY|1|A nation with its own land and government
COUPLED|3|Joined together or paired.
COUPLES|2|Pairs of people joined as romantic partners
COUPONS|2|Vouchers that entitle the holder to a discount
COURAGE|2|The ability to face danger without fear
COURIER|1|A person who delivers messages or packages
COURSES|2|Programs of study at a college
COUSINS|1|Children of one's aunt or uncle.
COVERED|2|Placed something over to hide or protect
COWBOYS|2|Ranch workers known for herding cattle.
CRACKED|2|Having a break or fissure.
CRACKER|2|A thin, crisp biscuit, often eaten with cheese
CRAFTED|2|Made or built with skill
CRASHED|3|To collide violently.
CRASHES|2|Violent collisions, especially involving vehicles
CRAVING|2|a strong desire for something
CREATED|2|Brought into existence
CREATES|2|Brings something new into existence
CREATOR|2|One who brings something into existence
CREDITS|2|The list of contributors shown at the end of a film
CRICKET|2|Bat-and-ball game played between two teams of eleven
CRIMSON|2|A deep red color.
CRITICS|2|People who review films, books, or art professionally
CROATIA|2|A European country on the Adriatic Sea, capital Zagreb.
CROOKED|1|Bent or twisted out of shape; not straight
CROSSED|2|Moved from one side of something to the other
CROSSES|1|Moves from one side of something to the other.
CROWDED|2|Filled with too many people or things.
CROWNED|2|Formally invested with a royal headpiece
CRUCIAL|3|Decisive and extremely important to the outcome
CRUELTY|2|the quality of being deliberately harmful or causing suffering
CRUISER|2|A fast warship, or a car designed for relaxed long-distance travel
CRUISES|2|Travels by sea for pleasure
CRUSADE|4|A vigorous campaign for a cause.
CRUSHED|2|Pressed or squeezed with force.
CRYSTAL|4|A solid whose atoms form a regular, repeating pattern
CUISINE|2|A style or method of cooking associated with a place
CULPRIT|2|The person responsible for an offense
CULTURE|3|The customs, arts, and social institutions of a particular group
CUNNING|2|Skilled at deception or trickery
CURATED|3|Thoughtfully chosen and arranged for presentation
CURATOR|2|A person in charge of a museum or collection.
CURIOUS|2|Eager to know or learn something
CURLING|2|A winter sport in which players slide stones across ice toward a target
CURRENT|3|Belonging to the present time; happening now
CURTAIN|1|A piece of fabric hung to cover a window or stage.
CUSHION|1|A soft bag filled with material for comfort.
CUSTODY|3|Protective care or legal guardianship of someone
CUSTOMS|3|The official body that inspects goods crossing a border
CUTTING|2|Using a sharp tool to divide something
CYCLING|2|Biking
CYCLIST|2|biker
CYCLONE|2|A large storm system with winds rotating around a center of low pressure
CYNICAL|3|Believing that people are motivated by self-interest.
CYNTHIA|1|A common girl's first name
DAMAGED|2|Harmed so as to reduce value or function
DAMAGES|3|Money awarded by a court to compensate for loss or injury
DANCERS|1|People who move rhythmically to music, often performing
DANCING|1|Moving the body rhythmically to music
DANGERS|1|Possibilities of harm or injury
DANIELS|3|A common English surname derived from a biblical prophet's name
DARKEST|2|Having the least light.
DARLING|2|A dearly loved or cherished person
DAYTIME|1|The hours between sunrise and sunset
DEALERS|2|Individuals who sell goods.
DEALING|3|Handling a situation or distributing cards
DEAREST|2|Most beloved or precious
DEBATED|2|To discuss a subject in a formal manner.
DEBATES|2|Discuss opposing viewpoints.
DEBORAH|3|A female given name.
DEBUTED|2|Made a first public appearance
DECADES|2|Periods of ten years each
DECEIVE|2|To mislead someone by deliberately making them believe something false
DECENCY|2|Behavior conforming to accepted standards of morality
DECIDED|2|Reached a conclusion or resolution about something
DECIDES|3|Reaches a firm conclusion after consideration
DECLARE|2|To state openly or officially
DECLINE|3|To gradually become smaller, weaker, or worse
DEEPEST|2|Extending furthest down or inward; most profound
DEFAULT|3|Failure to meet an obligation, especially to repay a loan
DEFEATS|2|Overcomes an opponent in a contest
DEFECTS|2|Flaws or imperfections in something
DEFENCE|2|The action of protecting something against attack
DEFENDS|2|Protects someone or something from attack or criticism
DEFENSE|2|The act of protecting against attack
DEFICIT|2|The amount by which spending exceeds income
DEFINED|3|Clearly described or marked out
DEFINES|2|States the precise meaning of a word or concept.
DEGREES|2|Units used to measure temperature or angles
DELAYED|2|Made later than expected; held up
DELETED|2|Removed or erased, especially from a document or file
DELIGHT|2|A feeling of great pleasure.
DELIVER|1|To bring and hand over to a recipient
DEMANDS|3|Insists on firmly, asking for something as a right
DENMARK|2|A Scandinavian country known for its Viking history.
DENOTES|3|Is a sign or indication of something
DENSELY|3|In a tightly packed manner
DENSITY|3|A measure of mass per unit of volume
DENTIST|1|A medical professional who treats teeth and gums.
DENYING|2|Refusing to admit that something is true.
DEPENDS|3|Is determined or conditioned by something else
DEPICTS|2|Shows or represents in a picture or story
DEPOSIT|2|A sum of money paid into an account or held as security
DERIVED|3|Drawn or developed from a particular source or origin
DERIVES|3|Obtains something from a particular source
DERRICK|3|A tall framework used for drilling oil wells or hoisting loads
DESCEND|1|To move from a higher place to a lower one
DESCENT|2|A movement from a higher to a lower place
DESERVE|2|To be worthy of or entitled to
DESIGNS|2|Plans or drawings showing how something is to be made
DESIRED|3|Strongly wished for or wanted
DESIRES|3|To wish for or long for something.
DESKTOP|1|A computer designed to sit on a table, not a laptop
DESMOND|4|A male given name of Irish origin, borne by Archbishop Tutu
DESPAIR|2|A complete loss of hope
DESPISE|2|To feel intense dislike or contempt for
DESPITE|3|Without being affected by; in spite of
DESSERT|1|A sweet course eaten at the end of a meal
DESTINY|3|The events that are bound to happen to a person in the future
DESTROY|2|To ruin or wreck completely
DETAILS|2|The small individual facts or parts of something
DETROIT|2|A large Michigan city long known for car manufacturing
DEVELOP|2|To grow or bring into being gradually
DEVICES|2|Pieces of equipment built for a particular purpose
DEVISED|3|To plan or invent a complex procedure.
DEVOTED|3|Showing great loyalty and dedication
DIAGRAM|1|A simplified drawing showing the structure of something
DIALECT|2|Regional language variation
DIAMOND|2|The hardest natural gemstone
DIAPERS|1|Absorbent garments worn by babies, American term
DIARIES|2|Books for recording daily events.
DICKENS|3|Victorian author of 'A Christmas Carol'
DICTATE|3|To say or read aloud for someone else to write down.
DIETARY|2|Relating to the food and drink a person consumes
DIFFERS|2|Is not the same as another
DIGGING|2|To break up and move earth or other material.
DIGITAL|3|Relating to computer technology or numerical signals
DIGNITY|3|The state of being worthy of honor.
DILEMMA|2|A situation requiring a choice between equally undesirable options
DILUTED|2|Made less concentrated by adding a liquid
DINNERS|1|The main evening meals of the day
DIOCESE|3|A district under the pastoral care of a bishop
DIOXIDE|3|A chemical compound containing two oxygen atoms per molecule
DIPLOMA|1|a certificate awarded for completing a course of study
DIPPING|2|Putting something briefly into liquid
DIRECTS|2|To manage or guide something.
DISABLE|2|To turn off or prevent something from working
DISCORD|2|Disagreement or lack of harmony
DISCUSS|2|To talk about something in detail
DISEASE|2|A disorder of the body that impairs normal function
DISGUST|2|A strong feeling of dislike.
DISLIKE|1|To feel distaste or hostility toward something
DISMISS|2|To send away or reject from consideration
DISPLAY|2|To show something prominently for others to see
DISPOSE|2|To get rid of something no longer needed
DISPUTE|2|A disagreement or heated argument
DISRUPT|3|To interrupt the normal course or unity.
DISSENT|4|the expression of opinions that differ from those commonly held
DISTANT|2|Far away in space or time
DISTURB|2|to interfere with the normal arrangement or functioning
DIVERSE|3|Showing a great deal of variety; differing from one another
DIVIDED|2|Separated into parts or groups
DIVIDES|1|Splits something into separate parts
DIVORCE|2|The legal dissolution of a marriage
DOCTORS|1|Qualified medical practitioners
DODGERS|2|People who cleverly avoid something, like taxes or duties
DOLLARS|2|Units of U.S. currency, each worth one hundred cents
DOLPHIN|1|A highly intelligent marine mammal known for its playful behavior.
DOMAINS|3|Areas of territory or fields of activity under one's control
DOMINIC|3|Meaning 'Lord' in Latin
DONATED|2|Gave money or goods, especially to a good cause
DONOVAN|2|A common surname, often associated with a famous singer.
DOORWAY|1|An entrance to a room or building
DORMANT|3|Temporarily inactive, as if asleep
DOROTHY|2|The Kansas farm girl who travels to the magical land of Oz
DOUBLED|2|Made twice as large or numerous
DOUBLES|2|A tennis match with two players per side
DOUBTED|2|Felt uncertain about the truth of something
DOUGLAS|4|Capital and largest town of the Isle of Man
DOWNING|2|Swallowing a drink quickly and completely
DRAFTED|2|Conscripted for military service
DRAGGED|2|To pull along the ground.
DRAGONS|2|Mythical fire-breathing winged reptiles
DRAINED|2|Emptied of liquid, or extremely exhausted
DRASTIC|2|Extreme and having a sudden, serious effect
DRAWERS|2|Sliding storage compartments found in furniture
DRAWING|2|A picture made with pencil, pen, or crayon
DREAMED|1|Experienced imagery and stories while asleep
DRESSED|2|Wearing clothes; attired
DRESSES|1|Women's one-piece garments
DRIFTED|2|Moved slowly, carried along by a current of air or water
DRILLED|2|Bored a hole into something, or trained through repeated practice
DRIVERS|2|People who operate vehicles
DRIVING|2|Operating and steering a motor vehicle
DROPPED|2|Let fall, often by accident
DROUGHT|2|A long period of abnormally low rainfall
DROWNED|2|Died from being unable to breathe underwater.
DRUMMER|1|A musician who plays percussion instruments
DRUNKEN|2|Affected by or characteristic of alcohol intoxication
DUBIOUS|3|Feeling uncertain or hesitant about something
DUCHESS|2|A noblewoman who is either married to a duke or holds that rank in her own right
DUMBASS|4|A foolish or stupid person.
DUMBEST|1|Least intelligent; the most foolish (superlative)
DUMPING|2|Disposing of something in a careless or bulk manner
DUNGEON|3|A dark, underground prison.
DURABLE|2|Able to withstand wear and last a long time
DYNAMIC|3|Marked by constant change, energy, and activity
DYNASTY|2|A line of hereditary rulers
EAGERLY|2|In a way that shows enthusiasm or keen interest
EARLIER|2|At a time before the present moment
EARNEST|2|Showing sincere and serious intention
EARNING|2|Receiving money in return for work done
EASIEST|1|Requiring the least effort or difficulty
EASTERN|2|Situated in or facing the direction where the sun rises
ECLIPSE|2|An event where one celestial body blocks the light of another
ECOLOGY|2|The scientific study of organisms and their environment.
ECONOMY|3|A country's system of production and trade
ECSTASY|3|A feeling of overwhelming happiness or joy
ECUADOR|2|A South American country that straddles the equator
EDITING|3|Preparing written or recorded material for release
EDITION|2|a particular version of a publication
EDITORS|2|People who prepare written material for publication.
EDUCATE|2|To give intellectual or moral instruction to someone
EDWARDS|3|A common surname of English origin.
EFFECTS|2|Results or consequences of an action
EFFORTS|3|Vigorous attempts or exertions toward a goal
ELASTIC|2|Able to stretch and return to original shape.
ELDERLY|2|Advanced in years; rather old
ELEANOR|3|A traditional English first name borne by several medieval queens
ELECTED|2|Chosen for an office by vote
ELECTRO|3|A genre of dance music built on synthesizers and drum machines
ELEGANT|2|Graceful and stylish in appearance or manner.
ELEMENT|3|A pure substance listed on the periodic table
ELEVATE|1|To raise something to a higher position
ELLIOTT|2|A common English first name and surname
ELLISON|3|Surname of a famous American novelist and a tech billionaire
ELUSIVE|3|Difficult to find, catch, or achieve
EMAILED|1|Sent a message electronically over the internet
EMBASSY|2|The official residence and offices of an ambassador abroad
EMBRACE|3|To hold closely in the arms; also to accept willingly
EMERALD|2|A green precious stone.
EMERGED|3|Came into view or became known
EMERGES|2|To come into view.
EMERSON|3|Surname of the American essayist and poet known for the essay 'Self-Reliance'
EMINENT|2|Famous and respected within a particular sphere.
EMOTION|2|A strong feeling such as joy, fear, or anger
EMPATHY|2|The ability to understand and share the feelings of another
EMPEROR|2|Sovereign ruler of an empire
EMPIRES|2|Extensive groups of states under one supreme authority
EMPLOYS|2|Gives paid work to; makes use of
EMPOWER|2|To give someone the authority or confidence to do something
EMPRESS|1|A female ruler of an empire
EMULATE|3|To try to match or surpass something by imitation
ENABLED|2|Made something possible or gave the means to do it
ENABLES|2|Gives someone the means or authority to do something
ENACTED|3|Passed into law by a legislature
ENDINGS|2|Concluding parts of a story
ENDLESS|2|Having or seeming to have no limit or finish
ENDORSE|2|To publicly express approval or support for something
ENDOWED|3|Provided naturally or financially with a quality or asset
ENDURED|3|To suffer patiently.
ENEMIES|3|People who are actively hostile or opposed to one
ENFORCE|3|To compel observance of or obedience to.
ENGAGED|2|Having formally agreed to be married
ENGAGES|2|Occupies or attracts someone's attention
ENGINES|2|Machines that turn fuel or energy into motion
ENGLAND|2|The largest country of the United Kingdom
ENGLISH|1|The main language spoken in Britain and America
ENHANCE|2|To improve the quality or value of something.
ENJOYED|2|Took pleasure or delight in something
ENQUIRY|2|A formal request for information or an investigation
ENRIQUE|3|A Spanish male first name equivalent to Henry
ENSUING|3|subsequent
ENSURED|2|secured
ENSURES|2|To make certain that something will happen.
ENTERED|2|Came or went into a place (past tense)
ENTRIES|3|Items recorded in a log, or submissions to a contest
ENZYMES|3|Proteins that speed up chemical reactions in living organisms
EPISODE|2|A single installment of a TV or radio series
EPSTEIN|3|A surname shared by several notable public figures
EQUALLY|2|To the same degree or extent
ERECTED|2|Built or put up, especially a structure
EROSION|2|The gradual wearing away of land or rock by wind, water, or ice
ERUPTED|2|Burst out suddenly and violently
ESCAPED|2|Broke free or got away from confinement
ESCAPES|2|Break free from confinement.
ESCORTS|2|Accompanies or guards someone during travel
ESSENCE|3|The intrinsic nature or indispensable quality.
ESTATES|2|Large properties with expansive grounds, often historic mansions.
ESTONIA|2|A Baltic country whose capital is Tallinn
ETERNAL|3|Lasting forever, with no beginning or end
ETHANOL|2|A type of alcohol used in fuel and beverages
ETHICAL|2|Conforming to accepted principles of right conduct
EVASION|3|The act of avoiding something, often by cunning or deceit
EVENING|1|The period of the day between afternoon and night
EVEREST|2|The world's highest mountain above sea level
EVERETT|2|A male first name; also a port city in Washington state
EVERTON|2|An English football club based in Liverpool
EVIDENT|2|Clearly seen or understood.
EVOLVED|2|Developed gradually over a long period
EXACTLY|3|In a way that is completely accurate or correct
EXAMINE|2|To inspect closely and carefully
EXAMPLE|3|A thing taken as typical and used to illustrate a point
EXCEEDS|3|To go beyond a limit or expectation.
EXCERPT|2|A short extract taken from a piece of writing or music
EXCITED|2|Feeling great enthusiasm and eagerness
EXCLUDE|2|To leave out or keep from being included
EXCUSES|2|Reasons offered to justify a fault or explain away a mistake.
EXECUTE|2|To carry out or put a plan into effect.
EXHAUST|2|To use up all of one's energy or resources
EXHIBIT|2|An item put on public display in a gallery or museum
EXISTED|3|Had being or reality; was present in the world
EXPANDS|2|To increase in size or volume.
EXPECTS|2|Regards something as likely to happen
EXPENSE|3|An amount of money spent on something
EXPERTS|2|People with great skill or knowledge in a field
EXPIRED|2|No longer valid, having passed its end date
EXPIRES|2|Comes to an end or ceases to be valid
EXPLAIN|2|Make something clear by describing it in detail
EXPLODE|1|To burst suddenly and violently
EXPLOIT|3|To use someone or something unfairly for personal gain.
EXPLORE|2|To travel through an unfamiliar place to learn about it
EXPORTS|2|Goods sold and shipped to another country
EXPOSED|3|Left uncovered and unprotected from harm or weather
EXPOSES|2|Reveals something hidden or secret
EXPRESS|3|To convey a thought or feeling in words
EXTENDS|2|To increase in length or duration.
EXTINCT|1|No longer existing; having died out completely
EXTRACT|3|To remove or take out.
EXTREME|2|Reaching the highest or most severe degree
FABRICS|2|Materials made from fibers.
FACTION|3|A small, organized dissenting group within a larger one
FACTORS|2|Whole numbers that divide evenly into another
FACTORY|3|Plant
FACTUAL|2|Accurate
FACULTY|2|The teaching staff of a school or college
FAILING|3|A weakness or fault in a person's character
FAILURE|1|A lack of success
FAIRFAX|4|A city and county in northern Virginia, near Washington, D.C.
FALCONS|2|Birds known for their speed and hunting skills.
FALLING|2|Moving downward, typically rapidly
FALLOUT|3|Radioactive particles that settle after a nuclear blast
FALSELY|3|In a misleading manner.
FANTASY|3|An imaginative or far-fetched notion not based in reality
FARMERS|1|People who grow crops and raise livestock
FARMING|1|The activity of growing crops and raising livestock
FARRELL|3|Surname of the Irish actor Colin, known for In Bruges
FARTHER|3|At or to a greater physical distance
FASCISM|4|A political ideology characterized by dictatorial power.
FASCIST|3|Relating to a dictatorial, ultra-nationalist political system
FASHION|2|The prevailing style of clothing at a given time
FASTEST|2|Quickest of all
FASTING|3|The act of abstaining from food.
FATHERS|1|Male parents
FATIGUE|1|Extreme tiredness resulting from exertion
FAVORED|2|Preferred or given a special advantage over others
FEARFUL|2|Feeling afraid or anxious.
FEARING|2|To be afraid of something.
FEATHER|1|One of the light growths covering a bird's body
FEATURE|3|A distinctive attribute or aspect of something
FEDERAL|3|Relating to a central national government rather than its states
FEEDING|2|Giving food to a person or animal
FEELING|2|An emotional state or reaction
FELLOWS|3|Members of a learned society or group of peers
FEMALES|2|Individuals of the sex that can bear offspring
FENCING|2|A sport involving sword fighting.
FERRARI|2|Italian luxury sports car brand featuring a prancing horse emblem.
FERTILE|2|Capable of producing abundant crops or offspring
FESTIVE|1|Full of holiday cheer and celebration
FICTION|2|Literature describing imaginary events and people
FIFTEEN|1|The whole number between fourteen and sixteen
FIGHTER|2|One who takes part in combat or boxing
FIGURED|2|Worked out by reasoning or calculation
FIGURES|2|Numerical symbols or written amounts
FILLING|2|The edible mixture enclosed inside a pie or sandwich
FILMING|2|The process of recording moving images with a camera
FILTERS|2|Removes impurities or unwanted elements, as a machine does to water or air.
FINALLY|2|After a long delay; at last
FINANCE|2|The management of money and investments
FINDING|3|A conclusion reached after an investigation
FINGERS|1|The slender parts at the end of the hand
FINLAND|2|A Nordic country in Northern Europe bordered by Sweden, Norway, and Russia.
FINNISH|2|Relating to Finland or its people
FIREARM|2|A weapon that shoots bullets or shells
FIREFOX|2|A free, open-source web browser developed by Mozilla
FIRSTLY|2|Used to introduce the initial point in a list or argument
FISCHER|2|A common German surname meaning 'fisherman'
FISHING|1|The activity of catching creatures from the water
FITNESS|1|The state of being physically healthy and strong
FITTING|3|Appropriate or suitable for the occasion
FIXTURE|2|A permanent fitting, or a scheduled sporting event
FLAMING|1|On fire or blazing brightly
FLASHES|2|To appear suddenly and briefly.
FLAVORS|2|Distinct tastes.
FLAVOUR|1|The distinctive taste of a food or drink
FLEEING|2|Running away from danger or pursuit
FLEMING|4|A surname, notably associated with a famous author.
FLIGHTS|1|Journeys made through the air aboard planes
FLIPPED|2|Turned over quickly with a sudden motion
FLOATED|1|Rested or moved gently on the surface of a liquid
FLOODED|1|Covered or filled with an overflow of water
FLORIDA|2|The Sunshine State at the southeastern tip of the U.S.
FLOWERS|1|Colorful blossoms of plants
FLOWING|2|Moving smoothly and continuously.
FOCUSED|2|Concentrating intently on a single thing
FOCUSES|3|Concentrates attention or effort on one thing
FOLDING|1|Bending something over on itself
FOLIAGE|2|The leaves of plants, considered collectively
FOLLOWS|2|Comes after another in sequence or pursuit
FOOLISH|1|Lacking good sense or judgment
FOOTAGE|3|A length of recorded film or video material
FOOTING|2|A secure grip or balance while standing
FORCING|2|Compelling someone to do something against their will
FOREIGN|2|Belonging to a country other than one's own
FOREMAN|2|A person in charge of a group of workers.
FORESTS|2|Large areas densely covered with trees
FOREVER|2|For all future time, without ending
FORGETS|1|Fails to remember something
FORGIVE|2|To stop feeling resentment toward someone who has wronged you
FORMATS|2|Particular arrangements or layouts in which something is presented
FORMING|2|Bringing into being or shaping into a structure
FORMULA|2|A rule or relationship expressed in symbols
FORREST|4|A common male name, also a surname.
FORTUNE|2|A very large amount of money or wealth
FORWARD|2|Toward the front or in advance
FOSSILS|2|Preserved remains of ancient organisms
FOUNDED|2|Set up or brought into being, as an institution
FOUNDER|3|A person who sets up an organization
FRAGILE|1|Easily broken or damaged
FRAMING|3|The act of presenting facts in a way that influences interpretation
FRANCES|1|A traditional English female first name
FRANCIS|3|Assisi saint known for his love of animals
FRANKLY|3|In an open and honest manner
FREAKED|2|Reacted with sudden alarm or panic
FREDDIE|3|An affectionate nickname for boys with a common royal-sounding first name
FREEDOM|3|The power to act or speak without restraint
FREEING|2|Releasing someone or something from captivity
FREEMAN|3|A person who is not a slave or serf; also a common surname.
FREEWAY|2|A major highway.
FREEZER|1|An appliance used to keep food at a very low, frozen temperature
FREIGHT|3|Goods transported by truck, train, ship, or aircraft.
FRESHLY|3|Recently made or obtained.
FRIDAYS|1|The days of the week before Saturdays
FRIENDS|1|People you know well and like, but are not related to
FRONTAL|2|Relating to or located at the forehead or facing side
FUCKERS|3|Vulgar slang term used to insult contemptible people
FUCKING|3|Used as a vulgar intensifier to add emphasis
FULFILL|2|To carry out or achieve a duty or promise
FULLEST|2|Most complete or maximum in extent
FUNDING|2|Money supplied to support a project or program
FUNERAL|2|A ceremony held to honour a person who has died
FUNNIER|1|More amusing or comical than something else
FURIOUS|2|Extremely angry.
FURNACE|1|An enclosed structure for burning fuel to generate heat
FURTHER|3|To a greater distance or extent.
FUTURES|3|Financial contracts obligating a trade at a set price on a specified date ahead
GABRIEL|2|A common male given name of Hebrew origin, meaning 'God is my strength'
GADGETS|2|Small mechanical or electronic devices.
GAINING|3|Gradually obtaining or acquiring something
GALLERY|2|A room or building used for displaying works of art
GALLONS|1|Units of liquid volume, each equal to four quarts
GARBAGE|1|Waste material that is thrown away
GARDENS|2|Cultivated plots where flowers or vegetables grow
GARDNER|3|Surname of Hollywood actress Ava, star of 'Mogambo'
GARLAND|2|A decorative wreath of flowers or leaves
GARMENT|2|An item of clothing.
GARRETT|3|A common English surname and male given name
GATEWAY|2|An entrance or means of access to a place.
GAZETTE|2|A newspaper or official publication.
GENERAL|3|Affecting all or most; not detailed or specific
GENERIC|3|Referring to a whole class rather than a specific brand
GENESIS|3|The origin or beginning of something
GENETIC|3|Hereditary
GENITAL|2|Relating to the reproductive organs
GENUINE|2|Truly what it is said to be; not fake
GEOLOGY|1|The scientific study of the Earth's structure and rocks
GEORGES|2|The plural of a common royal male first name
GEORGIA|3|A US state whose capital is Atlanta
GERMANS|2|People native to a large country in central Europe
GERMANY|1|A central European country whose capital is Berlin
GESTURE|1|A movement of the body, especially the hands, to express meaning
GETAWAY|1|A short vacation or an escape from routine
GETTING|2|Obtaining or coming to have something
GILBERT|2|A common English male first name
GLACIAL|2|Relating to ice, or extremely cold
GLACIER|2|A large mass of ice moving slowly.
GLAMOUR|2|An alluring and exciting quality
GLASGOW|2|The largest city in Scotland
GLASSES|2|A pair of lenses worn to aid or correct vision
GLIMPSE|2|A brief or partial view of something
GLITTER|1|To shine with a bright, shimmering, reflected light.
GLOWING|2|Emitting a steady light without flame
GLUCOSE|2|A simple sugar that is a key energy source in living organisms
GODDAMN|4|An expression of anger or frustration.
GODDESS|3|A female deity.
GOLDMAN|5|A surname often associated with finance.
GOODBYE|1|A parting word said when leaving someone
GOODIES|2|Attractive or desirable items, especially treats or gifts
GOODMAN|3|Surname of the actor John, star of Roseanne
GOODWIN|3|A common English and American surname
GORILLA|1|A large ape native to the forests of central Africa
GRABBED|2|Seized suddenly and roughly with the hand
GRADERS|2|Heavy machines used to level and smooth road surfaces
GRADING|2|The process of assessing and scoring work
GRADUAL|2|Happening slowly over time, in stages
GRAMMAR|2|The system of rules governing a language
GRANDMA|2|The mother of one's mother or father, informally
GRANDPA|1|An affectionate, informal name for one's father's or mother's father
GRANITE|2|A hard, speckled igneous rock used in construction
GRANTED|2|Formally given or bestowed
GRAPHIC|3|Described in explicit, often disturbing detail
GRAVITY|1|The force that pulls objects toward the earth
GRAYSON|3|Dick ___, the birth name of Batman's sidekick Robin
GRAZING|2|Feeding on growing grass in a field
GREATER|3|Larger in size, amount, or degree
GREATLY|2|To a very large degree or extent
GREETED|1|Welcomed someone with friendly words or a gesture
GREGORY|3|A common male first name, borne by several popes
GRENADE|2|A small explosive device thrown or launched by hand
GRIFFIN|2|Mythical creature with an eagle's head and wings on a lion's body
GRILLED|1|Cooked on a metal grid over direct heat
GROCERY|2|Of or relating to a store selling food and household goods
GROUNDS|2|Solid residue left after brewing coffee
GROUPED|1|Arranged together into sets or categories
GROWERS|2|People or businesses that cultivate crops or plants
GROWING|2|Increasing in size or amount over time
GUARDED|2|Cautious and reluctant to reveal information
GUESSED|2|Estimated an answer without being certain
GUIDING|2|Showing the way or providing direction
GUITARS|2|Six-stringed musical instruments played by strumming or plucking
GUJARAT|3|A state in western India.
GUNFIRE|1|The repeated firing of guns
GUNSHOT|1|The firing of a firearm, or the loud sound it makes
HABITAT|3|The natural environment of an organism.
HACKERS|2|People who gain unauthorized access to computer systems
HACKING|2|The act of gaining unauthorized access to computer systems
HAIRCUT|1|The result of a visit to a barber or salon
HALFWAY|2|At or near the midpoint between two places
HALIFAX|3|A major city in Canada.
HALLWAY|1|A passage inside a building connecting rooms
HAMBURG|2|Germany's second-largest city, a major port
HAMMOND|3|Surname of the brand behind a famous electric organ used in gospel and jazz
HAMPTON|2|A common place name and surname in England and the United States
HANCOCK|3|A person's signature.
HANDBAG|2|A case usually carried by women for holding daily essentials
HANDFUL|2|As much as the palm can hold
HANDING|1|Passing an object to someone directly
HANDLED|2|Dealt with or managed a situation
HANDLER|2|A person who trains or manages an animal or a public figure
HANDLES|2|Deals with or manages a situation
HANGING|3|Suspended from above so as to dangle freely
HAPPENS|3|Takes place; comes about
HAPPIER|2|In a more contented or joyful state than before
HAPPILY|2|In a cheerful and contented manner
HARBOUR|2|A sheltered body of water where ships dock.
HARDEST|2|Most difficult of all
HARDING|3|Surname of Warren G., the 29th U.S. President
HARMFUL|2|Causing or capable of causing damage.
HARMONY|3|A pleasing combination of parts or a peaceful agreement
HARNESS|2|A set of straps for controlling or securing something
HARRIET|2|A feminine given name, a variant of Henrietta
HARTLEY|3|A common English surname and place name
HARVARD|2|Ivy League university in Cambridge, Massachusetts
HARVEST|2|To gather crops from the fields.
HASHTAG|2|A word or phrase preceded by the # symbol used to categorize online posts
HATEFUL|1|Showing or provoking intense dislike
HAUNTED|2|Frequented by a ghost
HAWKINS|2|A common English surname
HAZARDS|1|Dangers or risks
HEADING|2|A word or phrase set at the top of a section
HEADSET|1|A device worn on the ears, often with a microphone, for listening and speaking
HEALING|3|Mending
HEALTHY|1|In good physical condition and free from illness
HEARING|3|The faculty of perceiving sounds
HEARTED|3|Suffix describing someone's emotional nature, as in warm- or kind-
HEATHER|2|A purple-flowering shrub common on moorland
HEATING|2|System that keeps a building warm in winter
HEAVENS|2|The sky, especially as seen at night
HEAVIER|1|Of greater weight
HEAVILY|3|To a great degree or with great force
HEIGHTS|2|High places or elevated positions
HELMETS|2|Protective headgear.
HELPFUL|1|Giving useful assistance
HELPING|3|A single portion of food served at a meal
HERBERT|2|A traditional English first name
HEROINE|2|A woman admired for exceptional courage or achievements.
HERRING|2|A small silvery fish often smoked or pickled
HERSELF|3|Reflexive pronoun referring back to a female subject
HIDEOUS|2|Extremely ugly or unpleasant to look at
HIGGINS|3|Surname of the phonetics professor in George Bernard Shaw's 'Pygmalion'
HIGHEST|2|Greatest in elevation, rank, or degree
HIGHWAY|1|A main public road connecting towns and cities
HILLARY|3|A given name shared by a former U.S. Secretary of State and an Everest pioneer
HIMSELF|3|Reflexive pronoun referring back to a male subject
HISTORY|2|The study of past events, especially in human affairs
HITTING|2|Striking something with force
HOBBIES|2|Activities done for pleasure during free time.
HOFFMAN|2|Oscar-winning actor Dustin's surname
HOLDERS|2|Items used to support or contain something.
HOLDING|3|Land or assets owned by a person or company
HOLIDAY|2|A day of festivity or recreation when no work is done
HOLLAND|3|A region often used as another name for the Netherlands
HONESTY|2|The quality of being truthful.
HONORED|3|Regarded with great respect or given recognition
HONOURS|2|Special awards or recognitions given for achievement
HOPEFUL|2|Feeling or showing optimism about the future
HOPKINS|3|Surname of the actor who played Hannibal Lecter
HOPPING|1|Moving by jumping on one or both feet
HORIZON|2|The line at which the earth's surface and the sky appear to meet
HORMONE|2|A regulatory chemical released by a gland into the bloodstream
HORRORS|1|Intense feelings of shock, dread, or disgust
HOSPICE|2|A residential facility offering comfort care to the terminally ill
HOSTAGE|1|A person seized and held captive to secure demands
HOSTILE|2|Unfriendly and openly antagonistic
HOSTING|2|Acting as the one who entertains guests
HOTLINE|2|A direct telephone link for emergencies or urgent inquiries
HOTTEST|1|Having the highest temperature of all
HOUSING|3|Dwellings or accommodation considered collectively
HOUSTON|2|The largest city in Texas, home to NASA's mission control
HOWEVER|3|Used to introduce a contrasting statement
HUGGING|2|Wrapping one's arms around someone affectionately
HUNDRED|1|Ten times ten
HUNGARY|2|a landlocked Central European country whose capital is Budapest
HUNTERS|1|People who pursue and kill animals for food or sport
HUNTING|2|The activity of pursuing and killing wild animals
HURDLES|2|Obstacles in a race.
HURTING|2|Experiencing or causing physical pain
HUSBAND|2|A married man, in relation to his spouse
HUSSEIN|4|A common Arabic name, notably of a former Iraqi leader.
HYGIENE|2|The practice of maintaining health through cleanliness
HYUNDAI|3|South Korean automobile manufacturer founded in 1967
IBRAHIM|3|A common male name in Arabic-speaking countries.
ICELAND|2|A country in Northern Europe
IDEALLY|2|In a perfect or most desirable situation
IGNORED|2|Refused to take any notice of
IGNORES|2|To pay no attention to.
ILLEGAL|2|Forbidden by law
ILLICIT|3|Forbidden by law, rules, or custom
ILLNESS|1|A disease or period of being unwell
IMAGERY|3|Visually descriptive or figurative language in writing.
IMAGINE|2|Form a mental picture of something not present
IMAGING|2|The process of producing a visual representation, as in medicine
IMMENSE|2|Extremely large in size, extent, or degree.
IMMORAL|3|Not conforming to accepted standards of right and wrong
IMPACTS|3|The effects or influences of one thing on another.
IMPLANT|2|A device surgically inserted into the body
IMPLIED|3|Suggested without being directly stated
IMPLIES|3|Suggests or indicates without stating directly.
IMPORTS|2|Goods or services brought into a country from abroad for sale.
IMPOSED|3|Forced upon someone as an obligation or penalty
IMPRESS|1|To evoke admiration or respect in someone
IMPRINT|3|A lasting mark left by pressure or influence
IMPROVE|1|To make or become better
IMPULSE|2|A sudden strong urge to act without thinking
INCLUDE|2|To contain or comprise as part of a whole
INCOMES|1|Money earned or received regularly
INDIANA|3|Midwestern state nicknamed the Hoosier State
INDIANS|2|People native to the subcontinent of South Asia
INDICES|3|Numbers or ratios used to measure or compare things, such as prices over time.
INDOORS|1|Inside a building.
INDUCED|3|Caused or brought about.
INDULGE|3|To allow oneself to enjoy something.
INFANCY|1|The earliest stage of life or development
INFANTS|1|Very young children, especially babies
INFORMS|1|Gives someone facts or knowledge about something
INFUSED|3|Filled throughout with a flavor, quality, or feeling
INHERIT|2|To receive money, property, or a title from someone who has died
INITIAL|2|Occurring at the very beginning; first
INJURED|2|Having suffered physical harm or damage to the body
INMATES|2|People confined in a prison or institution
INNINGS|3|Segments of play in baseball.
INQUIRE|1|To seek information by asking
INQUIRY|2|An official investigation into a matter
INSECTS|2|Small arthropods with six legs.
INSIDER|2|A person with privileged access to private information
INSIGHT|2|A deep and accurate understanding of a person or situation
INSISTS|3|Demands something firmly, refusing to accept a refusal
INSPECT|1|To examine closely, typically to check quality or condition.
INSPIRE|2|To fill someone with the urge to do something.
INSTALL|2|To put equipment or software in place ready for use
INSTANT|2|A precise moment of time; also, happening immediately
INSTEAD|2|As an alternative or substitute
INSULIN|2|Hormone that regulates blood sugar levels
INSULTS|3|To speak to or treat with disrespect.
INSURED|2|Protected financially against loss or damage
INSURER|2|A company that provides financial protection against loss or damage.
INTEGER|2|A whole number, positive, negative, or zero
INTENDS|2|Plans or means to do something
INTENSE|2|Extreme in degree, strength, or force
INTERIM|2|A temporary arrangement or period.
INVADED|1|Entered a country or place by force with hostile intent
INVALID|3|Lacking legal or logical soundness; not binding
INVERSE|3|Opposite in effect, position, or order
INVITED|3|Requested someone's presence at an event
INVITES|2|Asks someone politely to attend an event or function
INVOLVE|3|To include something as a necessary part or result
IPHONES|1|Popular touchscreen smartphones made by a California tech giant
IPSWICH|3|A market town and port in Suffolk, England.
IRANIAN|2|Relating to a country whose capital is Tehran
IRELAND|2|An island nation west of Great Britain
ISLAMIC|3|Relating to the religion founded by Muhammad
ISLANDS|1|Bodies of land entirely surrounded by water
ISOLATE|3|To set apart from others.
ISRAELI|4|Relating to the Jewish state in the Middle East, or its citizens
ISSUING|3|Officially giving out or releasing something
ITALIAN|2|Relating to a southern European nation famed for pasta, opera, and Renaissance art
JACKETS|1|Short outer garments with sleeves
JACKPOT|1|A large cash prize in a lottery or game
JACKSON|2|Surname of the pop superstar known as the King of Pop
JACQUES|2|A common French male first name, equivalent to 'James'.
JAKARTA|2|Capital and largest city of Indonesia
JAMAICA|2|Caribbean island nation, birthplace of reggae music
JANEIRO|3|Second word in the name of Brazil's famous coastal city on Guanabara Bay
JANUARY|1|The first month of the year
JASMINE|3|A fragrant flowering plant.
JEALOUS|2|Resentful of another's success or advantages
JEFFREY|2|A common English male first name
JENKINS|3|A common English surname
JERSEYS|1|Knitted pullover garments, often worn by sports teams
JESSICA|1|A common English female first name
JEWELRY|1|Decorative items worn on the body, such as rings and necklaces
JOGGING|1|Running at an easy, steady pace for fitness
JOHNSON|3|Surname shared by US presidents and British prime ministers
JOINING|3|Linking two things together, or becoming a member
JOINTLY|2|In combination or together with another, sharing responsibility
JOURNAL|2|A daily personal record of events; a diary
JOURNEY|1|An act of travelling from one place to another
JUBILEE|2|A special anniversary celebration, often marking 25 or 50 years
JUDAISM|3|The monotheistic religion of the Jewish people.
JUDGING|2|Forming an opinion or evaluation
JUMPING|2|Pushing off the ground into the air
JUNIORS|2|People who are younger or lower in rank than others
JUPITER|2|The largest planet in our solar system
JUSTICE|2|Fair and lawful treatment of people
JUSTIFY|3|To show something to be reasonable or right
KARACHI|3|A major city in Pakistan.
KARAOKE|1|A form of entertainment where people sing along to recorded music
KASHMIR|3|A disputed region in South Asia, known for its scenic valleys
KATHRYN|2|A female first name, a variant spelling of Catherine
KATRINA|3|A major hurricane that struck the southeastern United States in 2005.
KEEPERS|2|People or things worth retaining
KEEPING|2|Retaining possession of, or continuing to have, something
KENDALL|1|A name often used for both genders.
KENNEDY|2|Surname of the 35th U.S. president, assassinated in 1963
KENNETH|2|Scottish male first name meaning 'handsome' or 'born of fire'
KETCHUP|1|Tomato-based condiment often paired with fries
KEYNOTE|2|The main theme or the principal address at a conference
KICKING|2|Striking out with the foot
KICKOFF|1|The start of a football match
KIDDING|2|Speaking in jest rather than seriously
KIDNEYS|2|Paired organs that filter waste from the bloodstream
KILLERS|2|people who unlawfully take the lives of others
KILLING|2|The act of causing death
KINETIC|3|Relating to or resulting from motion
KINGDOM|3|Realm
KISSING|2|Touching with the lips.
KITCHEN|1|Room where meals are prepared
KITTENS|1|Young domestic cats
KNIGHTS|2|Medieval mounted warriors in armor
KNOCKED|2|Struck with a sharp blow, as on a door
KNOWING|3|Suggesting secret awareness or shared understanding
KOREANS|2|Natives or citizens of a divided East Asian peninsula nation
KREMLIN|2|The fortified complex in Moscow housing the Russian government
KRISHNA|2|A Hindu god regarded as an avatar of Vishnu
KRISTEN|2|A common female first name derived from Christine
KURDISH|3|Relating to an ethnic group native to parts of the Middle East
LABELED|2|marked with a descriptive tag or name
LACKING|3|Missing or deficient in some quality
LAMBERT|4|Surname shared by singers Miranda and Adam
LANDING|3|Level platform at the top or turn of a staircase
LANGLEY|3|Virginia town synonymous with the CIA's headquarters
LANTERN|1|A portable light source.
LAPTOPS|2|Portable personal computers.
LARGELY|2|For the most part; mainly
LARGEST|2|Of the greatest size within a group
LASTING|3|Continuing or remaining in effect for a long time
LATERAL|2|Relating to the side rather than the front or back
LAUGHED|2|Showed amusement with audible sounds
LAUNDRY|1|Clothes and linens that need washing
LAURENT|3|A French male given name, also a famed fashion house's founder
LAWSUIT|2|A claim brought before a court for resolution
LAWYERS|2|Trained professionals who advise clients and argue cases in court
LAYERED|2|Arranged in overlapping levels
LEADERS|2|Those who guide or command others
LEADING|2|Most important or foremost in its field
LEAGUES|2|Organized groups of teams that compete in a sport
LEAKING|1|Allowing liquid or gas to escape through a hole
LEANING|2|A tendency or inclination toward a particular belief
LEARNED|4|Showing deep knowledge gained from study
LEASING|2|To rent something, especially property.
LEATHER|2|Durable material made from treated animal hide
LEAVING|2|Going away from a place
LEBANON|3|A country in the Middle East.
LECTURE|2|A formal spoken presentation given to teach an audience
LEFTIST|3|A person who supports socialist, progressive, or egalitarian political policies.
LEGALLY|2|In a manner permitted by law
LEGENDS|2|Traditional stories regarded as historical but unverified; also greatly admired people
LEISURE|1|Free time not occupied by work
LENDERS|2|Banks or individuals who provide loans
LENDING|2|The act of allowing someone to use something temporarily, usually money
LENGTHS|2|Measurements of distance from end to end, or extreme measures taken
LENGTHY|1|Very long in duration or extent
LEONARD|2|A male given name.
LEOPARD|2|A large wild cat known for its spotted coat.
LESBIAN|2|A woman who is romantically attracted to other women
LESIONS|3|Areas of damage or abnormal change in body tissue caused by injury or disease
LESSONS|2|Periods of teaching or things learned from experience
LETTERS|1|The individual symbols that make up the alphabet
LETTING|3|Permitting something to happen
LETTUCE|1|A leafy green vegetable often used in salads.
LIAISON|3|A person who facilitates communication between groups.
LIBERAL|3|Open to new ideas, reform, and individual freedoms
LIBERIA|2|A West African country founded by freed American slaves
LIBERTY|2|The state of being free from oppression or control
LIBRARY|1|A place where books are kept for reading or borrowing
LICENCE|2|Official permission to do something.
LICENSE|2|Official permit to do, own, or use something
LICKING|1|Passing the tongue over something
LIFTING|2|Raising something to a higher position
LIGHTER|2|A small pocket device used to produce a flame
LIGHTLY|2|In a gentle or delicate manner.
LIMITED|3|Confined within set bounds; not extensive
LINCOLN|2|Sixteenth President of the United States
LINDSAY|2|A unisex given name, also used as a surname
LINDSEY|1|A common given name.
LINEAGE|3|Ancestry
LINKING|3|Connecting or joining together.
LIQUIDS|2|Substances that flow freely and take the shape of their container
LISTENS|2|To pay attention to sound.
LISTING|2|An entry recorded in a catalogue or directory
LITERAL|3|Taken in its exact, non-figurative sense
LITHIUM|4|A soft, silvery-white metal used in batteries.
LOADING|2|The process of putting a cargo or burden onto something
LOBSTER|1|A large marine crustacean with prominent claws, prized as seafood
LOCALLY|3|Within a particular nearby area or district
LOCATED|2|Positioned in a particular place
LOCKING|1|Securing a door or object so it cannot be opened
LODGING|2|A place where one stays temporarily, such as a room or house
LOGGING|2|The industry of cutting down trees for timber
LOGICAL|2|Following sound reasoning; sensible
LONGEST|2|Greatest in length or duration
LONGING|2|A strong feeling of yearning for something
LOOKING|2|Directing one's gaze or searching for something
LOOKOUT|3|A person watching for danger.
LOOSELY|1|In a relaxed, not-tight manner
LOOTING|2|Stealing goods, especially during a riot or disaster
LORENZO|2|Italian male given name
LOTTERY|3|A game of chance for prizes.
LOWERED|1|Moved something down to a reduced height or position
LOYALTY|2|Faithful devotion to a person, group, or cause
LUCIFER|2|Another name for Satan, the fallen angel
LUCKILY|1|Fortunately, by good chance
LUGGAGE|1|Bags and suitcases used for traveling
LUNATIC|1|A person regarded as wildly foolish or insane
LUNCHES|1|Meals eaten around midday.
LURKING|2|Waiting in concealment, especially with sinister intent.
LYRICAL|2|Expressing feelings in a song-like, poetic way
MACBOOK|2|A line of laptop computers made by Apple.
MACHINE|2|A device with moving parts that performs work
MADISON|3|Capital city of the U.S. state of Wisconsin
MADNESS|3|State of being mentally ill.
MADONNA|2|A painted or sculpted image of the Virgin Mary.
MAGICAL|2|Resembling or produced by enchantment; wonderfully delightful
"""
}
