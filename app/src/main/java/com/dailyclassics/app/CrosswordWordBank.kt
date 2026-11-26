package com.dailyclassics.app

/**
 * Curated English crossword entries imported from Open Crossword Bank.
 * The source data is dedicated to the public domain under CC0 1.0 Universal.
 * Source: https://github.com/tamino-martinius/node-open-crossword-bank
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
ACE|1|A playing card bearing a single pip
ADD|1|To combine numbers into a sum, or to include something more
ANT|1|A small insect that lives in organized colonies
APE|1|A large tailless primate such as a gorilla or chimpanzee
APT|1|Suitable or fitting for the situation.
ARM|1|The upper body limb between shoulder and hand
ART|1|Creative work such as painting or sculpture
ASK|1|Put a query to someone
AXE|1|A tool with a sharp blade used for chopping wood
BAD|1|Of poor quality or low standard
BAG|1|A flexible container for carrying things
BAN|1|To officially forbid or prohibit
BED|1|Piece of furniture you sleep on
BEE|1|A buzzing, pollinating insect that makes honey
BIG|1|Large in size
BIN|1|Container for waste or for storing loose goods
BIT|1|A small piece or amount of something
BOX|1|Square container with flat sides for storing things
BOY|1|A young male child
BRA|1|An undergarment that supports and covers a woman's chest.
BUG|1|A small insect, or a flaw in a computer program
BUN|1|A small, round bread.
BUS|1|Large road vehicle that carries many passengers
BUY|1|To obtain something in exchange for money
CAB|1|A car for hire, complete with driver
CAP|1|A soft, brimmed covering for the head
CAR|1|An engine-powered road vehicle for a few passengers
CAT|1|A small furry pet that purrs and meows
COW|1|A female farm animal kept for its milk
CRY|1|To shed tears
CUB|1|The young of a lion, bear, or wolf
CUE|1|A signal for an action to begin
CUP|1|A small container used for drinking
CUT|1|To divide or wound with a sharp blade
DAD|1|An informal word for one's male parent
DAM|1|A barrier built to hold back flowing water
DAY|1|A period of 24 hours.
DEV|1|informal term for a person who writes computer programs
DEW|1|Tiny drops of water that form on cool surfaces overnight
DID|1|Past tense of do.
DIE|1|Stop living
DIG|1|Break up and turn over earth, as with a spade
DIM|1|Not bright or clearly visible
DOE|1|A female deer
DOG|1|A domesticated canine kept as a pet
DOT|1|A small round mark or point
DUG|1|Excavated the earth with a tool
DUO|1|A pair of people working or performing together
DYE|1|A substance used to change the color of cloth or hair
EGG|1|Oval object laid by a hen
ELK|1|A large deer species with broad antlers, found in North America and Europe
ERA|1|A distinct and notable period of history
ERR|1|To make a mistake
EYE|1|The organ of the body used for seeing
FAM|1|Folks
FAT|1|Carrying an excess of body weight
FIN|1|A flat body part that helps a fish swim
FIR|1|An evergreen tree with needle-like leaves, common at Christmas
FIT|1|In good physical condition
FIX|1|To repair or set right
FLU|1|Common contagious viral illness
FLY|1|To move through the air on wings
FOE|1|An enemy or opponent
FOG|1|A thick cloud of tiny water droplets near the ground
FOX|1|A wild bushy-tailed animal related to the dog
FRY|1|To cook something in hot fat or oil
GEL|1|A thick, clear substance used to style hair
GEM|1|A precious stone, cut and polished
GIF|1|Common web image format that can display simple animation
GIN|1|A clear spirit flavored with juniper berries
GOD|1|A supreme being or object of worship
GOO|1|A soft, thick, sticky substance
GUM|1|A sticky substance chewed for flavor, not swallowed
GUN|1|A weapon that fires bullets through a barrel
GYM|1|Place equipped for physical exercise
HAM|1|Cured meat from a pig's thigh
HAT|1|A covering worn on the head
HAY|1|grass that has been cut and dried for use as animal feed
HEN|1|A female bird, especially a domestic chicken.
HID|1|Concealed something from view
HIT|1|To strike forcefully with the hand or an object
HOT|1|Having a high temperature
HUG|1|To hold someone tightly in your arms as a sign of affection
HUT|1|A small, simple shelter or cabin
ICE|1|Frozen water
ICY|1|Covered with ice.
IDS|1|Cards or documents that prove who someone is
ILL|1|Suffering from poor health
JAM|1|Sweet fruit preserve spread on toast
JAR|1|A cylindrical glass or ceramic container with a wide mouth
JAW|1|The lower part of the face.
JET|1|A fast aircraft driven by reaction engines
JOB|1|Paid work or employment
JOY|1|A feeling of great happiness
KEY|1|Metal object used to open a lock
KIT|1|A set of tools or equipment for a particular purpose
LAB|1|A room equipped for scientific experiments, for short
LAD|1|A boy or young man, especially in informal British usage
LEG|1|A limb used for standing and walking
LID|1|A cover that fits on top of a container
LIE|1|An intentionally false statement
MAP|1|A flat drawing showing roads, countries or terrain
MAT|1|A flat piece of woven fiber for wiping feet or covering a floor
MEG|1|A unit of measurement equal to one million.
MEN|1|Adult human males
MIC|1|A device that captures sound for amplification or recording
MIX|1|Combine ingredients into one mass
MOP|1|A tool with a bundle of strings or a sponge head for washing floors
MUD|1|Soft, wet earth
MUG|1|A large cup with a handle, used for hot drinks.
MUM|1|British informal word for one's mother
NAP|1|A short sleep, usually during the day
NEW|1|Recently made, created, or brought into existence
NOD|1|To lower and raise the head in agreement
NOW|1|At the present moment or time
NUN|1|A woman belonging to a religious order who lives by vows
NUT|1|A hard-shelled fruit.
OAK|1|Sturdy tree that bears acorns
ODD|1|Not divisible by two, as a number.
OLD|1|Having lived for many years.
ONS|1|Short for online services.
OWL|1|A nocturnal bird known for its large eyes and hooting call
PAL|1|A close friend.
PAW|1|The foot of an animal with claws
PEA|1|A small round green vegetable that grows in a pod
PEG|1|A small clip used to fasten washing to a line
PEN|1|A handheld instrument for writing in ink
PET|1|A tame animal kept at home for companionship
PIE|1|Baked dish with a pastry crust and a filling
PIG|1|A farmyard animal with a snout and a curly tail
PIN|1|A thin pointed piece of metal used to fasten fabric
PIT|1|A deep hole dug in the ground
POO|1|Solid bodily waste (informal term)
POT|1|Round, deep vessel used for cooking
PUP|1|A young dog
RAG|1|A piece of old cloth.
RAM|1|An adult male sheep
RAT|1|A large rodent with a long, hairless tail
RED|1|Of the color of blood or a ripe tomato
REF|1|Informal name for the official who oversees a game and enforces its rules
RIB|1|a bone in the chest.
RIM|1|The outer edge of something round, like a wheel or cup.
RIP|1|To tear roughly apart
ROD|1|A thin straight bar of metal or wood
RON|1|A male given name.
ROT|1|Gradual decay of organic matter
RUB|1|To apply pressure and friction to a surface.
RUG|1|A piece of thick fabric used to cover a floor
RUM|1|A spirit distilled from sugarcane or molasses
RUN|1|To move quickly on foot, faster than walking
RYE|1|A cereal grass used to make bread and whiskey
SAD|1|Feeling sorrow or unhappiness
SAL|1|Female given name (short for Sarah)
SAY|1|To express in words.
SEA|1|A large body of salt water
SEE|1|To perceive something with the eyes
SEW|1|To join fabric together using a needle and thread.
SIP|1|To drink slowly, taking small amounts
SIR|1|Respectful term of address for a man
SIS|1|Casual term for a female sibling
SIX|1|The number that follows five
SKI|1|A long narrow runner strapped to a boot for gliding over snow
SKY|1|The expanse of atmosphere seen overhead from the ground
SLY|1|Having or showing a cunning and deceitful nature
SOW|1|To scatter seeds over land for growing
SOY|1|Bean used to make tofu and a salty sauce
SPY|1|A person who secretly gathers information for a government or rival
SUM|1|The total obtained by adding numbers
SUN|1|The star at the center of our solar system
TAD|1|A small amount or degree
TAR|1|A thick black substance used to surface roads
TEA|1|A hot drink made by infusing dried leaves in water
TED|1|Short form of the name Theodore
TEE|1|Small peg used to support a golf ball before a stroke
TIN|1|a silvery-white metal.
TOE|1|One of the digits of the foot.
TON|1|Unit of weight equal to 2,000 pounds
TOP|1|The highest point or uppermost part of something
TOW|1|Pull a vehicle or boat using a rope or chain
TOY|1|An object for children to play with
TRY|1|To make an attempt
TUB|1|A wide, open container used for bathing or storage.
TUG|1|A sudden strong pull
UFO|1|An unidentified flying object, often linked to aliens
URL|1|A web address
USE|1|To employ for a purpose.
VET|1|Animal doctor, for short
VID|1|Clip
VIP|1|A very important person given special treatment
WAR|1|Armed conflict between nations or groups
WAX|1|A soft, moldable substance used to make candles
WED|1|To formally marry someone
WET|1|Covered or soaked with liquid
WIG|1|An artificial covering of hair worn on the head
WIN|1|To be victorious in a contest
YEN|1|The official currency of Japan
ZOO|1|Place where wild animals are kept for public viewing
ABS|2|Short for the abdominal muscles
ACT|2|A thing done; a deed.
ADS|2|Short commercial messages, informally
AGE|2|The length of time someone or something has existed
AID|2|Help or assistance, especially to those in need
AIM|2|Point a weapon toward a target
AIR|2|The invisible mixture of gases that we breathe
ALE|2|A type of beer brewed with top-fermenting yeast
AMP|2|A device that boosts electrical sound signals
APP|2|A small software program run on a phone or computer
ARE|2|Present-tense plural form of 'to be'
ARK|2|A large boat, especially the one built by Noah in the Bible
ASH|2|Powdery grey residue left after burning
ASS|2|A hoofed animal related to the horse, known for stubbornness
ATE|2|Consumed food, in the past tense
AUX|2|Short for an additional, back-up connection, as found on a stereo
AWE|2|A feeling of great wonder or admiration
BAE|2|A term of endearment for a significant other.
BAR|2|A counter or establishment where drinks are served
BAT|2|A wooden or metal stick used to strike a ball in sport
BAY|2|A broad curved recess of the sea into the land
BEG|2|To ask earnestly or humbly for something
BET|2|To stake money on an outcome
BID|2|An offer of a price, as at an auction
BIO|2|A short account of a person's life
BOG|2|Wet, spongy area of land with peat
BOT|2|An automated program that performs tasks online without human input.
BRO|2|Mate
BUD|2|A small growth on a plant that develops into a leaf or flower
BUM|2|Informal British term for the buttocks
CAN|2|To be able to do something
CON|2|A trick used to cheat someone out of money
COP|2|An informal word for a police officer
CPU|2|The central processing unit of a computer
DEN|2|A wild animal's lair.
DIN|2|a loud, unpleasant noise
DIP|2|A brief swim, or a quick downward movement
DNA|2|Molecule that carries genetic information
DOC|2|Casual term for a physician
DON|2|To put on, as a coat or hat
DRY|2|Free from moisture or wetness
DUE|2|Expected to arrive or be paid at a set time
EAT|2|Take in food through the mouth
ECO|2|Relating to or concerned with protecting the environment
ELF|2|A small mythical being from folklore, often depicted with pointed ears
ELM|2|A type of tree often planted along streets for shade
END|2|The final part of something
ETA|2|Estimated time of a plane's or vehicle's arrival, abbreviated
FAB|2|Excellent or wonderful, informally
FAN|2|A device that stirs the air to keep you cool
FAR|2|At a great distance
FAX|2|A document sent electronically over a phone line and printed at the receiving end
FBI|2|U.S. agency that investigates federal crimes
FED|2|Gave food to a person or animal
FEE|2|A sum of money charged for a service or privilege
FEW|2|Amounting to a small number
FIG|2|A soft, sweet fruit full of tiny seeds
FUN|2|Light-hearted enjoyment or amusement.
FUR|2|The short, fine hair covering the skin of animals.
GAG|2|A joke or funny remark, especially in a comedy routine
GAL|2|Informal word for a girl or young woman
GAP|2|An empty space or break between two things
GAS|2|A state of matter that is neither solid nor liquid
GAY|2|Sexually attracted to people of one's own sex
GIG|2|A job or performance, especially for musicians.
GIT|2|A popular distributed version control system
GOT|2|Past tense of get.
GPA|2|A measure of a student's academic performance.
GUT|2|The digestive tract.
GUY|2|An informal word for a man or fellow
HAD|2|Past tense of the verb meaning to own or hold
HAS|2|Possesses; third-person form of a verb of ownership
HBO|2|American premium cable and streaming television network known for prestige drama series
HIP|2|The joint connecting the leg to the pelvis
HIV|2|Retrovirus that attacks the body's immune system and can lead to AIDS
HOG|2|A domesticated pig.
HON|2|An informal term of endearment for a loved one
HOP|2|To move in short springy jumps, often on one foot
HOW|2|In what way or by what means
HUB|2|The central point of an activity, region, or network
HUE|2|A shade or variety of color
HUM|2|To make a low continuous sound.
INK|2|The colored fluid used for writing or printing
INN|2|A small establishment offering lodging and meals to travelers
ISA|2|A type of tax-advantaged savings account.
IVY|2|A climbing evergreen plant with glossy, lobed leaves
JAB|2|A quick, sharp punch
JEW|2|A person who practices or was born into Judaism
KAT|2|Short form of a common girl's name starting with K
KIN|2|One's relatives or family members, collectively
LAG|2|A period of delay between two related events
LAP|2|One full circuit around a race track
LAW|2|A rule made and enforced by a government
LAX|2|Not strict or tight.
LAY|2|To set or put down gently
LED|2|Guided a group from the front
LET|2|Allow or give permission to do something
LIL|2|Informal shortening of 'little', often used in nicknames
LIP|2|Either of the two soft fleshy edges of the mouth
LIT|2|Set aflame, or brightly illuminated
LOG|2|Running record of events kept over time
LOT|2|A large amount or number of something
LOW|2|Not high in position, amount, or level
MAC|2|A personal computer made by Apple
MAD|2|Filled with anger; or mentally unsound
MAE|2|Nickname for Mary
MAG|2|An informal, shortened term for a printed periodical with articles and photos.
MAN|2|Fellow
MAX|2|Informal shortening for the greatest possible amount
MBA|2|A graduate degree in business administration.
MET|2|Came face to face with
MIL|2|Slang term for one thousand thousand, used in finance
MIT|2|Prestigious Cambridge, Massachusetts tech university, briefly
MOB|2|A large crowd of people.
MOD|2|a user-created change to a video game or piece of software
MOM|2|Informal word for one's female parent
NAN|2|Informal British term for one's grandmother
NET|2|A meshed material used to catch fish or score in tennis
NOT|2|Word used to express negation or denial
OFF|2|Away from a place.
OIL|2|A viscous liquid used as a fuel or lubricant
OPS|2|Short informal term for military or business operations
OPT|2|To make a choice from a range of possibilities
ORE|2|Naturally occurring rock from which metal can be extracted
ORG|2|Short informal form of a word for a group formed for a shared purpose
OWE|2|To be under obligation to pay or repay
OWN|2|To possess something.
PAD|2|A soft cushion or mat.
PAN|2|A shallow metal container used for cooking
PAT|2|Tap gently with the flat of the hand
PAY|2|To give money in exchange for goods or work
PEP|2|Lively energy or enthusiasm
PEW|2|A long bench for sitting, especially in a church
PHI|2|The 21st letter of the Greek alphabet.
PIC|2|Informal word for a photograph
PIP|2|A small hard seed found in a fruit such as an apple
POD|2|A seed case of a plant such as a pea or bean.
POL|2|Informal, shortened term for an elected official
POP|2|To make a small, sharp explosive sound
PRO|2|Someone who does an activity for a living
PUB|2|A British establishment serving beer, ale, and meals
PUN|2|A form of wordplay that exploits multiple meanings.
PUT|2|To move something into a particular position
RAD|2|Totally excellent, in surfer slang
RAN|2|Moved swiftly on foot, in the past
RAP|2|A quick, sharp blow or knock
RAW|2|Not yet cooked or processed
RAY|2|A narrow line of light from the sun or a lamp
REP|2|A person who sells a company's goods, informally
ROB|2|To take property unlawfully, often by force or threat
ROE|2|The eggs of a fish, often eaten as a delicacy
ROW|2|A line of things arranged side by side
SAP|2|The fluid that circulates in a plant.
SAT|2|Rested on a chair or seat (past tense)
SAW|2|A toothed tool for cutting wood
SET|2|Put or place in a particular position
SEX|2|Either of the two main categories, male or female.
SHY|2|Nervous or reserved in the company of others
SIN|2|An immoral act that breaks a religious or moral law
SIT|2|To rest with the body supported on a seat
SOL|2|Word for 'sun' in Spanish and Italian
SOX|2|An informal spelling of foot coverings worn inside shoes
SPA|2|A resort offering therapeutic baths and treatments
SUP|2|To eat or drink something.
SUV|2|A large vehicle designed for passenger transport and off-road capability.
TAG|2|A small label attached to an item, often showing its price
TAN|2|To make leather from animal hides.
TAP|2|A device controlling the flow of liquid from a pipe
TAX|2|A compulsory charge imposed by a government
TIE|2|An equal score between contestants
TIP|2|A small sum of money given to someone for a service
TIT|2|A small, active woodland bird often seen at feeders
TOO|2|Excessively.
UNI|2|Informal short form for a place of higher learning after school
VAN|2|A covered road vehicle for carrying goods or people
VAT|2|A large container used for storing or processing liquids
VIE|2|To compete eagerly for something
VOW|2|To make a solemn promise.
WAS|2|Past tense of 'to be' for a single subject
WAY|2|A route, path, or manner of doing something
WEB|2|A spider's silken trap for catching prey
WEE|2|Very small in size
WHY|2|For what reason.
WIT|2|The ability to say clever, amusing things
WON|2|Came first in a contest, in the past
ZIP|2|To fasten with a sliding tab closure
AFT|3|Sternward
AGO|3|In the past, counting back from the present time
ARC|3|A curved line forming part of a circle
ARI|3|A short given name, often used as a nickname, of Hebrew origin meaning 'lion'
BOB|3|To move quickly up and down, as on water
BOW|3|A curved weapon used for shooting arrows
CAD|3|A man who behaves dishonorably, especially towards women
CAM|3|A rotating machine part that converts circular motion into linear movement
CHI|3|Vital life energy in traditional Eastern medicine
COD|3|A common edible fish found in cold northern waters.
COX|3|The person who steers and calls commands in a rowing boat
DIS|3|Slang for showing contempt toward or insulting someone
DUB|3|To give someone or something a nickname or title
DUN|3|A dull grayish-brown color
EGO|3|A person's sense of self-esteem.
EVE|3|The first woman, in the Book of Genesis
GET|3|To receive or come to have
GOP|3|Nickname for the U.S. Republican Party, the 'Grand Old' one
HUN|3|A member of an ancient nomadic people who invaded Europe under leaders such as Attila
INS|3|Those in power, contrasted with 'outs' politically
ION|3|An atom or molecule carrying a net electric charge
JAY|3|A noisy crow-family bird with blue plumage
JEN|3|A common short form of a longer feminine name ending in '-nifer'
JIN|3|A type of distilled alcoholic beverage.
KID|3|A young goat
LEA|3|A grassy open area; meadow.
LOU|3|Homophone of a British term for a toilet
MAJ|3|Rank abbr. above 'Capt.'
MAR|3|To spoil or disfigure the appearance of
MAS|3|Informal plural term for mothers
MID|3|Central
MMA|3|A full-contact combat sport.
NGO|3|Type of charitable organization not run by the state, such as the Red Cross
OBI|3|A wide sash worn with a kimono
OUT|3|Away from the inside, or no longer in play
PAR|3|The standard number of strokes set for a golf hole
POE|3|An American writer known for his macabre tales.
REC|3|A short informal term for a facility used for games, sports, and leisure
REG|3|British informal term for a vehicle's number plate.
REV|3|To increase the running speed of an engine
REY|3|Spanish word for 'king'
RID|3|To free or clear of something unwanted
RIG|3|Equipment or apparatus set up for a particular purpose, such as drilling
RIO|3|Brazilian coastal city famed for its Carnival
RNA|3|A molecule similar to DNA, involved in coding and expressing genes.
ROI|3|Return on investment
SAC|3|A pouch-like structure in a plant or animal, often containing fluid.
SEC|3|Informal short form for a very brief moment of time
SEO|3|The practice of optimizing web content for search engines.
SIC|3|To urge an animal, especially a dog, to attack
SON|3|Heir
SUE|3|To bring a legal claim against someone in court
TAB|3|A small projecting flap or label, or a running bill at a bar
TEL|3|mound
TOM|3|A male cat
VAL|3|A common short given name, often for a boy or girl
VIN|3|French word for wine
WAN|3|Pale and looking ill or tired
WOO|3|To try to win someone's affection or support
YET|3|Up until the present time; so far
YIN|3|The passive, dark, feminine principle in Chinese philosophy
ZEN|3|A school of Mahayana Buddhism emphasizing meditation and intuition
ALA|4|A wing-shaped anatomical structure, as of the nose or hip bone
BEN|4|A mountain or high hill, in Scottish usage.
BOP|4|A style of jazz popular in the 1940s
COL|4|A low pass between two mountain summits
EAR|4|A spike of grain, as found on a stalk of corn
EFF|4|To curse or swear, informally
EMS|4|Typographic units equal to the width of the letter M, in plural
GEN|4|Informal British term for information or facts
KEN|4|The range of one's knowledge or understanding
LAM|4|A hasty escape from the law or custody
LEE|4|The side sheltered from the wind
LEX|4|Law (as a Latin root)
MRI|4|A medical imaging technique used to visualize internal structures.
NIC|4|Abbr. for Network Interface Card
PAS|4|A document granting permission.
RAJ|4|The period of British rule in India.
RUE|4|To feel regret or remorse.
SEN|4|A member of the legislative body in the U.S.
TAT|4|Cheap, tacky merchandise (informal, chiefly British)
TOR|4|A high rocky hill or a pile of rocks.
VIS|4|A Latin word for force or power, used in older physics terms
WEN|4|A harmless cyst on the skin, especially the scalp
BEL|5|A logarithmic unit for expressing ratios of sound intensity
GIL|5|A thin membrane on the side of a fish's head.
BIZ|1|Informal word for commercial trade or a company
COT|1|A small bed, often for infants.
EEL|1|A long, slender fish
FAD|1|A trend that is popular only briefly.
FAQ|1|A list of common questions with their answers, often found on a website.
FAV|1|Informal word for someone's top pick or most-liked thing.
GMO|1|A crop or organism whose DNA has been altered by scientists
HOE|1|A long-handled garden tool used to break up soil and remove weeds
ICU|1|Hospital department for patients requiring the highest level of monitoring and care
ISP|1|A company that provides individuals and businesses with internet access
JOG|1|To run at a steady, gentle pace.
LEI|1|A garland of flowers traditionally worn in Hawaii.
LOO|1|A British term for a toilet.
MAM|1|A term of endearment for mother.
MOO|1|The low sound a cow makes
NAG|1|To pester someone repeatedly with complaints or requests
NIL|1|Zero; nothing
ORB|1|A spherical object, especially one used as a symbol of royal power.
SAG|1|To droop or sink down from weakness or pressure
TOT|1|a very young child
ADO|2|Fuss or bother, especially over something trivial
AMI|2|A friend or companion.
BOA|2|A large snake that squeezes its prey to death
COO|2|To make a soft murmuring sound.
DAB|2|A small quantity of something applied with a light touch
DEB|2|Informal term for a young woman introduced formally into society.
EAU|2|the French word for water
FAG|2|British slang for a cigarette
HEM|2|The edge of a piece of cloth folded and sewn to prevent fraying
HEX|2|A magic spell intended to cause harm; a curse.
HUI|2|A Māori social gathering or meeting
IMP|2|A mischievous sprite
IRE|2|Intense anger.
JUG|2|A container for liquids, typically with a handle.
NIP|2|A small sharp bite or pinch
ODE|2|A lyric poem expressing praise or celebration of a person or thing.
OVA|2|Female reproductive cells, more than one egg cell.
PLY|2|A layer of thickness in fabric, wood, or paper
REM|2|The sleep stage associated with vivid dreaming and rapid eye movement
SOB|2|A convulsive gasp made while crying
SOD|2|A layer of earth held together by grass and its roots
TAU|2|Greek letter shaped like a capital T
TIC|2|A sudden, repetitive muscle twitch
URN|2|A container for holding ashes after cremation.
VEG|2|greens
WOE|2|Great sorrow or distress.
ZEE|2|the American name for the alphabet's final letter
ABA|3|A loose sleeveless outer garment worn in some Arab countries
BEY|3|Title for a ruler in the Ottoman Empire
EMO|3|angsty
ETH|3|A letter in Old English and Icelandic representing a voiced 'th' sound.
FRO|3|Backward, in the traditional phrase paired with 'to'
IFS|3|Conditional possibilities or doubts raised in an argument
JUS|3|a light sauce made from meat juices
KEV|3|A unit of energy equal to a thousand electronvolts, common in nuclear physics
LAC|3|A resinous substance secreted by certain insects, used in making varnish.
LAO|3|Relating to a Southeast Asian nation whose capital is Vientiane, or its people.
LEV|3|the basic monetary unit of Bulgaria
LUX|3|Latin for 'light'
NEE|3|Used before a woman's maiden name
OFT|3|A literary word meaning many times or repeatedly
PAX|3|A term used for peace.
POM|3|Informal Australian or New Zealand term for an English person.
RYU|3|A character from a popular fighting game.
TAM|3|A soft, round Scottish cap with a bobble on top
TOD|3|British slang for being entirely by oneself
UNC|3|Abbreviated name for the North Carolina university whose team is the Tar Heels
ANI|4|Tropical black bird related to the cuckoo
ARS|4|Latin noun meaning 'art' or 'skill'.
CAO|4|Admin chief (abbr.)
DEX|4|Short for a decentralized cryptocurrency trading platform.
GIS|4|Mapping system (abbr.)
LAI|4|A short narrative or lyric poem from medieval French literature
LEW|4|An old dialect word meaning lukewarm or tepid.
PAP|4|Soft, bland food suitable for infants or invalids
RAI|4|A genre of Algerian popular music blending folk and Western styles
RAS|4|Traditional Ethiopian title for a prince or chieftain
RCA|4|Root-cause probe (abbr.)
SOM|4|The basic monetary unit of Kyrgyzstan and Uzbekistan
TAK|4|A dialect word meaning a liking or fondness for something.
TIA|4|Mini-stroke (abbr.)
ERS|5|A leguminous plant, also called bitter vetch, grown as animal feed.
FAY|5|A fairy or mythical being.
RET|5|To soak flax or hemp stalks to loosen their fibers
AMMO|1|Bullets or shells for a weapon, informally
ANTS|1|Small insects that live in highly organized colonies
ARMY|1|A nation's organized land military force
AUNT|1|Your mother's or father's sister
BABY|1|A very young child who cannot yet walk or talk
BAGS|1|Containers of paper, plastic, or cloth for carrying things
BAKE|1|To cook food using dry heat in an oven
BALD|1|Having no hair on the head
BALL|1|Round object used in many sports
BANG|1|A sudden loud noise
BANK|1|An institution that holds and lends money
BARN|1|A large building for storing farm animals.
BATH|1|A tub for washing the body, or the act of washing in it
BEAN|1|A seed used as food.
BEDS|1|Pieces of furniture for sleeping (plural)
BEEF|1|The meat of a cow
BEER|1|An alcoholic drink brewed from malt and hops
BEES|1|Insects known for producing honey.
BELL|1|A hollow metal object that rings when struck
BELT|1|Strap worn around the waist
BIKE|1|A two-wheeled vehicle driven by pedals
BIND|1|To tie or fasten tightly together
BIRD|1|A feathered animal that usually flies
BITS|1|Small pieces or fragments of something
BLUE|1|The color of a clear daytime sky
BOAT|1|A small vessel for travelling on water
BOIL|1|To heat a liquid until it bubbles
BONE|1|A hard part making up the skeleton
BOOK|1|A set of printed pages bound together for reading
BOOT|1|A sturdy shoe covering the foot and ankle
BOSS|1|The person in charge who gives the orders at work
BOTH|1|The two together.
BOWL|1|A round, deep dish for food or liquid
BOWS|1|Decorative knots with two loops, often used on gifts
BOYS|1|Young males, not yet grown to adulthood
BRIT|1|Informal term for a person from the United Kingdom
BROW|1|The forehead or area above the eyes.
BUGS|1|Insects or small creepy-crawlies.
BULL|1|Adult male of domestic cattle
BURY|1|To place a body or object in the ground and cover it.
BUSH|1|A low woody plant smaller than a tree
BUYS|1|Obtains something in exchange for money.
CAFE|1|Small establishment serving coffee and light meals
CAKE|1|A sweet baked dessert made from flour and sugar
CALF|1|The young of a cow
CANE|1|A stick used for support while walking
CANS|1|Metal containers used to store food or drinks
CARD|1|One of fifty-two in a standard playing deck
CARS|1|Road vehicles powered by an engine
CASA|1|Spanish word for house.
CASH|1|Money in the form of coins and banknotes
CATS|1|Small domesticated feline pets
CAVE|1|A natural underground hollow large enough to enter
CHAP|1|A boy or young man.
CHAT|1|An informal, friendly conversation
CHEW|1|To crush food repeatedly with the teeth before swallowing.
CHIN|1|The lowermost part of the face.
CHOP|1|To cut something into pieces with a sharp blow.
CITY|1|A large and important town
CLAP|1|To strike hands together
CLAY|1|Stiff, sticky earth used to make pottery and bricks
CLUE|1|Hint that helps solve a mystery or puzzle
COAL|1|A black mineral burned to produce heat
COAT|1|An outer garment worn for warmth
COIN|1|A small, flat, round piece of metal used as money
COLA|1|A sweet, dark, carbonated soft drink.
COLD|1|Having a low temperature
COMB|1|A toothed tool used to arrange or untangle hair
CONS|1|disadvantages weighed against the benefits of something
COOK|1|To prepare food by heating it
COOL|1|Moderately cold
COPY|1|A reproduction made to match an original
CORD|1|A long, thin piece of material.
CORK|1|A lightweight material used to stopper bottles
CORN|1|A tall cereal plant bearing yellow kernels on a cob
COST|1|The amount of money needed to buy something
COWS|1|Adult female cattle kept mainly for milk.
COZY|1|Warm, comfortable, and snug
CRAB|1|a shelled sea creature that walks sideways and has pincers
CRIB|1|A small bed with barred sides for an infant
CROW|1|A large black bird known for its harsh cawing call
CUBE|1|A three-dimensional shape with six equal square faces
CUBS|1|Young offspring of bears, lions, or wolves
CUPS|1|Small vessels used for drinking
CURE|1|A remedy that restores health
DADS|1|Informal term for fathers
DAMP|1|Slightly wet
DANE|1|A person from Denmark
DARK|1|Having little or no light
DATE|1|A particular day of the month or year.
DEAD|1|No longer alive
DEED|1|An action that is performed intentionally
DEER|1|Hoofed woodland animal, the male of which grows antlers
DENT|1|A small hollow left in a surface after a blow or impact.
DEPT|1|Abbreviated term for a division of a company, government, or university
DESK|1|A table designed for writing or working at
DIAL|1|To call a telephone number
DICE|1|small cubes marked with numbers, used in games of chance
DIES|1|Stops living
DIME|1|A small silver-colored American coin worth ten cents
DINE|1|To eat dinner
DING|1|A short ringing sound, like a bell
DISC|1|A flat, thin, round object such as a CD
DOCS|1|Informal short word for documents, or for physicians
DOGS|1|Domestic canine companions
DOLL|1|A child's toy modeled on a human figure
DOME|1|A rounded roof or ceiling shaped like half a sphere
DOOR|1|A hinged barrier at the entrance to a room or building
DORM|1|A building where students live.
DOTS|1|small round marks or points
DOVE|1|A bird often seen as a symbol of peace
DRAG|1|To pull something along the ground with effort
DRAW|1|To make a picture with a pen or pencil
DRUM|1|A percussion instrument struck with sticks or hands
DUCK|1|Web-footed waterbird with a broad, flat bill
DULL|1|Lacking sharpness, brightness, or interest
EARS|1|The pair of organs used for hearing
EAST|1|The direction in which the sun rises
EASY|1|Achieved without great effort
EATS|1|Consumes food.
EGGS|1|Oval objects laid by birds that hold developing young
EXAM|1|A formal test of knowledge or ability
EXIT|1|A way out of a building or space
EXPO|1|A large public exhibition, often of trade or technology
EYES|1|The organs of sight, considered as a pair
FACE|1|The front part of a person's head
FADE|1|To gradually lose color or brightness
FAIL|1|To be unsuccessful in an attempt
FARE|1|The price charged for a journey on public transport
FARM|1|Land used for growing crops or raising animals
FART|1|A release of gas from the digestive system.
FAST|1|Moving or able to move at high speed
FEAR|1|An unpleasant emotion caused by the threat of danger
FEED|1|To give food to a person or animal
FEET|1|The body parts at the ends of your legs
FILL|1|To make completely full
FILM|1|A story told through moving pictures shown at a cinema
FISH|1|A cold-blooded water animal that breathes through gills
FIST|1|A hand with fingers tightly curled into the palm
FIVE|1|The number that comes after four
FLAG|1|A piece of cloth used as a national or signaling emblem
FLAT|1|Having a level, even surface
FLEE|1|To run away from danger
FOAM|1|A mass of tiny bubbles formed on a liquid's surface
FOIL|1|Thin, flexible sheet of metal used for wrapping food
FOOD|1|Anything eaten to provide nourishment
FOOL|1|A silly or unwise person
FOOT|1|The body part at the end of the leg
FORK|1|A utensil with prongs used for eating.
FREE|1|Available without any charge
FROG|1|A small tailless amphibian known for jumping and croaking
FULL|1|Containing as much as possible; holding no more space
FUSS|1|Unnecessary or excessive excitement or worry over a trivial matter
GALA|1|A festive public celebration or entertainment event
GAPS|1|Empty spaces or breaks between things
GAZE|1|To look steadily and intently at something
GEEK|1|A person with an excessive enthusiasm for a particular subject.
GEMS|1|Precious or semi-precious stones, cut and polished
GIFT|1|Something given freely to another, often to celebrate an occasion
GIRL|1|A female child
GLAD|1|Feeling pleased and contented
GLEE|1|Great joy or delight, often at someone else's misfortune
GLOW|1|a soft, steady light given off by something warm
GLUE|1|A sticky substance used for joining things together
GOAL|1|An aim or desired result
GOLD|1|A precious yellow metal prized for jewelry and coins
GOOD|1|Of a high standard or quality
GOWN|1|A long, flowing garment, especially worn on formal occasions
GRAM|1|A small metric unit of mass, roughly the weight of a paperclip
GRAY|1|The color between black and white
GREY|1|A colour midway between black and white
GRIM|1|Bleak, harsh, or forbidding
GROW|1|To increase in size or amount over time
GUNS|1|Weapons that fire bullets
HAIR|1|Strands that grow from the scalp
HALF|1|One of two equal parts of something
HALT|1|A stop or pause in movement or activity
HAND|1|The body part at the end of the arm, with four fingers and a thumb
HAWK|1|A bird of prey with sharp talons
HEAR|1|To perceive sound with the ears
HEEL|1|The back part of the human foot
HERB|1|A plant used for flavoring, medicine, or scent
HERD|1|A large group of animals that live and feed together
HERE|1|In this place.
HIDE|1|To put or keep something out of sight
HIKE|1|A long walk, especially in the countryside or mountains
HILL|1|A raised area of land, lower than a mountain
HITS|1|Strikes something with force
HIVE|1|A structure in which a colony of bees lives and stores honey
HOLE|1|A hollow opening in a solid surface
HOLY|1|Regarded as divine or set apart for religion
HOME|1|The place where one lives.
HOOD|1|A covering for the head attached to a coat or jacket
HORN|1|A hard, pointed growth on an animal's head
HOSE|1|A flexible tube used to convey water
HOUR|1|A period of sixty minutes
HUGE|1|Extremely large in size or amount
HUGS|1|Warm, affectionate embraces
IDEA|1|A thought or plan formed in the mind
IDLE|1|Not active or in use; lazy
ITEM|1|A single article or unit on a list
JAIL|1|A place where people are confined as punishment
JAWS|1|The lower and upper bony structures in the mouth.
JEEP|1|A rugged four-wheel-drive vehicle often used off-road
JOEL|1|A male given name.
JOIN|1|To link or fasten two things together
JOKE|1|Something said to make people laugh
JULY|1|The seventh month of the year
JUMP|1|To push oneself off the ground with the legs
JUNE|1|The sixth month of the year
JUNK|1|Old or discarded items.
KICK|1|To strike out with the foot
KIDS|1|Young children, informally
KILL|1|To put to death
KING|1|A male ruler of a country, usually by inheritance
KISS|1|To touch with the lips as a sign of love or greeting
KITE|1|A lightweight object flown in the wind.
KITS|1|Sets of parts, tools, or equipment for assembly or use
KNEE|1|The joint connecting the thigh and the lower leg
KNIT|1|To make fabric by looping yarn together with needles
KNOB|1|A rounded handle used to open a door or drawer
LABS|1|Rooms or buildings equipped for scientific research
LADY|1|A polite or formal term for a woman
LAKE|1|Large body of water surrounded by land
LAMP|1|Device that gives out light
LAND|1|The solid part of the earth's surface.
LARA|1|A female given name.
LATE|1|Arriving after the expected time
LAVA|1|Molten rock ejected by an erupting volcano.
LAWN|1|An area of grass in a yard.
LAZY|1|Unwilling to work or exert energy
LEAF|1|A flat green part growing from the stem of a plant
LEAP|1|To jump or spring a long distance, up, or over something
LEGS|1|The limbs used for standing and walking
LEND|1|To give something temporarily, expecting it back
LENT|1|Gave something to someone for temporary use
LEVI|1|A common male given name.
LIAM|1|Common given name in Ireland
LICK|1|To pass the tongue over something
LIFE|1|The condition that distinguishes animals and plants.
LIFT|1|To raise something to a higher position
LILY|1|A tall flowering plant with large, often trumpet-shaped blooms
LIMB|1|An arm, leg, or tree branch
LIME|1|A small green citrus fruit
LINE|1|A long thin mark
LION|1|Large African big cat known as the king of beasts
LOAF|1|A single shaped and baked mass of bread
LOGS|1|Sections of a felled tree trunk
LONE|1|without others; solitary
LOOK|1|To direct one's gaze in a specified direction.
LOVE|1|An intense feeling of deep affection.
MADE|1|Past tense of make.
MAID|1|A female domestic servant
MAIL|1|Letters and parcels sent through the post
MAIN|1|Chief in size or importance
MALL|1|A large enclosed shopping centre
MAMA|1|Affectionate term for one's mother
MANY|1|A large number.
MAPS|1|Diagrams representing geographic areas
MARS|1|The red planet, fourth from the sun
MASK|1|A covering worn over part or all of the face
MATH|1|The study of numbers, quantities, and shapes
MATS|1|Flat pieces of material used on floors.
MAYO|1|A creamy condiment made from egg yolk and oil, often shortened this way
MAZE|1|A complex network of paths designed to confuse those inside it
MEAL|1|Food eaten at one sitting, such as breakfast or dinner
MEAT|1|Animal flesh used as food
MELT|1|To change from solid to liquid due to heat
MEMO|1|A short written note circulated in an office
MENU|1|A list of the dishes available in a restaurant
MESA|1|An isolated flat-topped hill with steep sides
MIKE|1|a common male given name
MILE|1|A unit of distance equal to 5,280 feet
MILK|1|White liquid produced by cows and other mammals
MINT|1|An aromatic herb used in flavoring, or a place where coins are made
MIST|1|A thin fog formed by tiny water droplets in the air
MOLE|1|A small burrowing mammal with velvety fur
MOMS|1|Informal, plural term for mothers
MONK|1|A man who lives in a religious community under vows
MOON|1|Earth's natural satellite, seen at night
MOSS|1|A small, green, flowerless plant that grows in damp habitats
MOTH|1|A nocturnal flying insect related to the butterfly, often drawn to light
MOVE|1|Change position or location
NAIL|1|A thin metal spike driven in to fasten wood
NANA|1|Informal term for one's grandmother
NEAT|1|Clean and orderly.
NECK|1|The part of the body joining the head to the shoulders
NEED|1|Require something.
NEST|1|A structure a bird builds to lay and hatch its eggs
NETS|1|Meshed devices used to catch fish or trap a ball
NEWS|1|Newly received information about recent events
NICE|1|Pleasant, agreeable, or kind
NOAH|1|Biblical figure who built an ark to survive the great flood
NOON|1|Twelve o'clock in the daytime
NOSE|1|The facial feature used for smelling and breathing
NOTE|1|A short written record or message
NOUN|1|A part of speech that represents a person, place, or thing.
NUMB|1|Lacking the ability to feel physical sensation
NUTS|1|Hard-shelled seeds eaten as snacks
OBEY|1|To comply with an order or instruction
ODOR|1|A distinctive smell, especially an unpleasant one
OILS|1|Slippery liquids used for cooking or lubrication
OKAY|1|All right; satisfactory or acceptable
OPEN|1|Not closed, shut, or blocked off
OVEN|1|Kitchen appliance for baking and roasting
OWES|1|Is under obligation to pay or repay someone
PACT|1|A formal agreement between two or more parties.
PAGE|1|One side of a sheet in a book
PAIR|1|A set of two things used together
PALS|1|Close friends.
PANS|1|Shallow metal containers used for cooking
PAPA|1|An informal word for father
PARK|1|A public green space kept for recreation
PATH|1|A narrow track for walking
PEAR|1|Round fruit with a sweet flavor
PEAS|1|Small round green seeds eaten as a vegetable
PEEK|1|To look quickly and often secretly
PEEL|1|To strip off the outer skin of a fruit or vegetable
PENS|1|Instruments used for writing with ink
PERU|1|A South American country home to Machu Picchu
PETS|1|Tame animals kept at home for company
PICK|1|To choose from a number of options
PIER|1|A structure extending into the water for docking boats
PIES|1|Baked dishes typically filled with fruit or meat.
PIGS|1|Farm animals known for their snouts.
PILE|1|A heap of things laid one on top of another
PILL|1|A small round mass of solid medicine.
PINK|1|Pale red color
PINS|1|Small sharp metal fasteners used to hold fabric together
PINT|1|A unit of volume for beer or milk, half a quart.
PIPE|1|A tube for conveying water or gas
PITS|1|Holes or hollows in the ground or a surface
PLUM|1|A round, smooth-skinned fruit.
POEM|1|A composition written in verse
POET|1|Writer of verse
POND|1|A small body of still water.
PONY|1|A small breed of horse, often ridden by children
POOL|1|Tank of water built for swimming
POOP|1|Informal word for animal or human excrement.
POOR|1|Having little money
POPS|1|Bursts suddenly with a sharp sound
POTS|1|Round containers used for cooking, storage, or growing plants
POUR|1|To make a liquid flow from a container
PREP|1|To make ready in advance of something
PROM|1|A formal high school dance
PUBS|1|Establishments serving alcoholic beverages.
PUFF|1|To blow air into something.
PULP|1|The soft, fleshy part of a fruit or vegetable.
QUIT|1|To stop doing something or leave a job
QUIZ|1|A short test of knowledge, often given informally
RACE|1|A contest to see who is fastest
RACK|1|A framework used for holding, storing, or displaying objects
RAIN|1|Water falling from the clouds
RAMP|1|A sloped surface connecting two different levels
RATS|1|Long-tailed rodents commonly found in cities and sewers
RICE|1|A staple cereal grain eaten across much of the world
RICH|1|Having a great deal of wealth
RIDE|1|A journey in a vehicle or on an animal
RING|1|A circular band worn on the finger
RIPE|1|Fully developed and ready to be harvested or eaten.
ROAD|1|A wide paved path for vehicles to travel on
ROAR|1|Loud, deep sound made by a lion
ROBE|1|A long loose garment, often worn after bathing or for ceremonies
ROCK|1|A hard solid mass of mineral matter
RODE|1|Traveled on a horse, bike, or bus (past tense)
ROOF|1|The structure forming the upper covering of a building
ROSE|1|A thorny flower often given on Valentine's Day
ROWS|1|Lines of things or people arranged side by side
RULE|1|A statement of what is allowed or required
RUNS|1|Moves swiftly on foot
RUSH|1|To move or act with urgent haste
RUST|1|The reddish-brown coating that forms on iron exposed to moisture
SACK|1|A large bag made of cloth or paper
SAFE|1|Protected from harm or risk
SAIL|1|To travel on water using a boat.
SAND|1|Fine loose grains of rock found on beaches and in deserts
SANE|1|Having a healthy, rational mind
SANK|1|Past tense meaning went down below the surface of water
SCAM|1|A fraudulent scheme to trick people out of money
SCAR|1|A mark left on skin after a wound heals
SEAS|1|Large bodies of salt water smaller than oceans
SEED|1|The small part of a plant from which a new one grows
SEES|1|Perceives with the eyes
SEXY|1|Sexually attractive or exciting.
SHIN|1|Front part of the lower leg, below the knee
SHIP|1|A large seagoing vessel
SHOE|1|An outer covering worn on the foot
SHOP|1|A place where goods are sold
SICK|1|Affected by illness; unwell
SIGH|1|To breathe out slowly and audibly, often from sadness or relief
SING|1|To make musical sounds with the voice
SINK|1|Go down beneath the surface of water
SITS|1|Rests on a seat with the body upright
SKIN|1|The outer covering of the body
SLIT|1|A narrow, straight cut or opening
SLOW|1|Moving or operating at low speed
SNOW|1|Frozen precipitation that falls from the sky as white flakes
SOAP|1|A cleansing substance lathered with water for washing
SOCK|1|A piece of clothing worn on the foot.
SODA|1|A sweet carbonated beverage.
SOFA|1|A long upholstered seat for more than one person.
SOFT|1|Yielding easily to the touch; not hard
SOIL|1|The top layer of earth in which plants grow.
SONG|1|A short piece of music with words to sing
SONS|1|Male children of a parent
SOUP|1|A liquid dish made by boiling ingredients in stock or water
SOUR|1|Having a sharp, acidic taste
SPIT|1|To forcefully eject saliva from the mouth.
STAB|1|To wound someone with a pointed weapon
STAR|1|A luminous ball of gas in the night sky
STEM|1|The main upright stalk of a plant
STEW|1|A dish of meat and vegetables cooked slowly in liquid.
STIR|1|To mix a substance by moving a spoon or utensil round
STOP|1|To cease moving or to bring to a halt
SUNS|1|Stars at the center of solar systems.
SURF|1|Foam and spray of breaking ocean waves
SWAN|1|A large, graceful waterbird known for its long curved neck, often white.
SWAP|1|To exchange one thing for another
SWIM|1|Move through water using the arms and legs
TACO|1|Folded tortilla filled with meat, cheese, and vegetables
TAGS|1|Small labels attached to items for identification or pricing
TAIL|1|The rear appendage of an animal
TAKE|1|To grasp or seize.
TALE|1|A story, especially an imaginative one
TALK|1|To express thoughts and ideas using spoken words
TALL|1|Of great or above-average height
TANK|1|A large container for holding liquid or gas
TASK|1|A piece of work to be done
TAXI|1|Hired car with a driver for short trips
TENS|1|The digit position representing groups of ten in a number system
TENT|1|A portable shelter made of fabric.
TEST|1|An examination of knowledge or ability
THIN|1|Having little thickness or width
THUG|1|A violent person, especially a criminal.
TIDY|1|Arranged in an orderly, clean manner
TILE|1|A flat, hard piece used to cover floors, walls, or roofs
TILT|1|To move or lean into a sloping position
TOES|1|The digits at the end of the foot
TOMB|1|A grave or vault for the dead
TOOL|1|A handheld implement used to carry out a task
TORE|1|Ripped forcefully, past tense
TOSS|1|To throw something lightly or carelessly
TOWN|1|A settlement larger than a village but smaller than a city
TOYS|1|Playthings for children
TRAY|1|A flat container used for carrying items
TREE|1|Tall perennial plant with a woody trunk and branches
TRIM|1|To cut away excess material to neaten something
TUBE|1|A long, hollow cylinder for carrying liquids or gases
TUNA|1|A large marine fish often used for food
TURF|1|Grass and the soil beneath it, forming a surface layer
UGLY|1|Unpleasant or repulsive in appearance
VASE|1|A decorative container used to hold cut flowers
VAST|1|Extremely large in extent or quantity
VEIL|1|A piece of fine fabric worn to cover the face or head
VEST|1|A sleeveless garment worn over a shirt
VIEW|1|A scene visible from a particular spot
VINE|1|A climbing or trailing plant with a woody stem
WAIT|1|Stay where you are until something happens
WALK|1|To move on foot at a steady pace
WAND|1|A slender rod used by a magician or fairy
WARM|1|Having a fairly high but comfortable temperature
WASH|1|Clean with water and usually soap
WEAK|1|Lacking strength or power
WEEK|1|A period of seven consecutive days
WEST|1|The compass direction where the sun sets
WIFE|1|A married woman in relation to her spouse.
WIFI|1|Wireless technology for connecting devices to the internet
WIKI|1|A website that allows collaborative editing.
WIND|1|A natural movement of air across the land
WINE|1|An alcoholic drink made from fermented grapes
WINK|1|A quick closing and opening of one eye, often as a signal
WIPE|1|To clean or dry by rubbing.
WOLF|1|Wild canine that hunts in a pack
WOOD|1|The hard fibrous material that forms a tree's trunk
WOOL|1|The soft, curly hair forming a sheep's coat
WORD|1|A single unit of language with meaning
WORK|1|To perform a task.
WORM|1|A long, thin, legless invertebrate that burrows in soil.
YEAR|1|A period of twelve months.
YELL|1|To shout loudly
YOGA|1|A discipline of postures and breathing for body and mind
ZERO|1|The figure standing for nothing
ZOOM|1|To move somewhere extremely fast
ABLE|2|Having the skill or power needed to do something
ACNE|2|A skin condition causing spots and pimples, common in teenagers
ACRE|2|A unit of land area equal to 4,840 square yards
ACTS|2|Performs on a stage, or takes action
ADDS|2|Combines numbers together to find a total
AGED|2|Having grown old over the years
AIDE|2|A person who acts as an assistant to someone important.
AIDS|2|Gives help or assistance to
AIMS|2|Goals or objectives one hopes to achieve
AIRS|2|Pretentious, affected manners meant to impress others
AKIN|2|Of similar nature or character
ALLY|2|Partner
ALMA|2|A common female name.
ALSO|2|In addition; as well
ALTO|2|A low female or high male singing voice
ANAL|2|Relating to the anus
APEX|2|The highest point or peak of something
APPS|2|Small software programs run on a phone or tablet
ARCH|2|a curved structure spanning an opening.
AREA|2|A particular region or extent of space
ARMS|2|Weapons collectively
ARSE|2|A colloquial term for the buttocks.
ARTS|2|Creative pursuits such as painting, music, and theater
ASKS|2|Requests information or a favor
ATOM|2|The smallest unit of matter that retains an element's properties
AURA|2|A distinctive atmosphere surrounding a person or place
AUTO|2|A motor vehicle, informally
AVID|2|Showing great enthusiasm or eagerness for something
AWAY|2|To or at a distance from a place
AXLE|2|A rod on which a wheel rotates
BABE|2|A very young child; an infant
BACK|2|The rear part of the human body, behind the chest
BAIT|2|Food used to attract fish or animals for capture.
BALE|2|A large bundle of material bound tightly together
BAND|2|A group of musicians who play together
BANS|2|Officially forbids something by law or rule.
BARE|2|Not covered, clothed, or concealed
BARK|2|The sharp, loud cry made by a dog.
BARS|2|Long rigid pieces of metal, or places that serve drinks
BASE|2|The lowest part on which something rests
BASH|2|To strike something with a heavy, forceful blow.
BASS|2|The lowest range of musical pitch
BATS|2|Nocturnal flying mammals that navigate using echolocation.
BEAM|2|A long, sturdy length of timber or metal used to bear weight
BEAR|2|A large heavy mammal with thick fur and claws
BEAT|2|To strike repeatedly, or a steady rhythmic pulse
BEND|2|To force something into a curved or angled shape
BENT|2|Not straight; curved.
BENZ|2|a well-known German car manufacturer
BEST|2|Of the highest quality.
BETA|2|The second letter of the Greek alphabet
BETS|2|Sums of money staked on the outcome of an uncertain event.
BIAS|2|Unfair leaning for or against a person or thing
BIDS|2|Formal offers of a price one will pay or accept
BILL|2|A statement of money owed for goods or services
BITE|2|A small mouthful, or a wound made by teeth
BLEW|2|Past tense of the verb meaning to move air
BLOG|2|A regularly updated personal website of posts
BLOW|2|To send out a current of air from the mouth
BODY|2|The whole physical structure of a person or animal
BOLD|2|Showing a willingness to take risks; confident and daring
BOLT|2|A metal pin used for fastening.
BOMB|2|A device designed to detonate and cause damage
BONG|2|A deep, resonant ringing sound, like a large bell
BOOM|2|A deep, resonant sound
BORE|2|To make someone feel weary and uninterested.
BORN|2|Brought into existence through birth
BRAG|2|To speak with excessive pride about oneself
BRED|2|Raised animals or plants to produce offspring with particular traits
BREW|2|To make a drink such as tea or beer by soaking or boiling
BROS|2|Informal term for close male friends or brothers
BUCK|2|A male deer.
BUDS|2|Small swellings on a plant that develop into leaves or flowers
BULB|2|The glass part of a lamp that glows when electric current passes through it.
BUMP|2|To hit or knock against something.
BURN|2|To be consumed or damaged by fire
BUSY|2|Having a great deal to do; fully occupied
BUZZ|2|A low, continuous humming sound
CAGE|2|An enclosure of bars or wire for keeping animals or birds
CALL|2|To telephone someone
CALM|2|Free from agitation, nervousness, or strong emotion
CAME|2|Past tense of moving toward a place
CAMP|2|A temporary site for outdoor lodging in tents
CAPS|2|Soft flat head coverings, often with a peak
CARE|2|The provision of what is needed for someone's health, welfare, or protection
CART|2|A vehicle for carrying goods.
CASE|2|An instance or example of a particular situation
CAST|2|The group of actors in a play or film
CENT|2|One hundredth of a dollar
CHEF|2|A professional in charge of a kitchen
CHIC|2|Stylish and fashionable in appearance
CITE|2|To quote or refer to as evidence or example.
CLAN|2|A group of related families.
CLAW|2|A sharp, curved appendage found on the feet of animals.
CLIP|2|A short extracted portion of a film or video
CLUB|2|An association of people united by a shared interest or activity
CODE|2|A system of symbols used to represent information secretly
COIL|2|A series of loops, as in a spring or wire
COLT|2|A young male horse.
COMA|2|A prolonged state of deep unconsciousness.
COME|2|To move toward a place.
CONE|2|A solid shape that tapers from a circular base to a point
COPE|2|To deal effectively with something difficult.
COPS|2|Slang for officers of the law
CORE|2|The central or innermost part of something
COVE|2|A small, sheltered bay along a coastline
CREW|2|A group of people who work together, as on a ship or plane
CROP|2|Plants grown and gathered as produce for food or profit
CUES|2|Signals prompting an actor or performer to act
CUFF|2|The end of a sleeve that fits around the wrist
CULT|2|A group bound by intense, often unorthodox religious devotion
CURB|2|To restrain or keep something in check
CURL|2|A spiral twist of hair or another material
CUTE|2|Charmingly attractive or pretty
CUTS|2|Reductions, as in budget or spending
DAMS|2|Barriers built across rivers to hold back water
DARE|2|To have the boldness to attempt something risky
DARN|2|To mend a hole in fabric.
DART|2|To move suddenly and quickly in a particular direction
DASH|2|To run or move quickly.
DATA|2|Facts and figures gathered for analysis
DAWN|2|The first appearance of light in the morning sky
DAYS|2|Several twenty-four-hour periods, in the plural
DEAF|2|Unable to hear.
DEAL|2|An agreement or bargain between parties
DEAN|2|The head of a university faculty or college
DEBT|2|A sum of money owed to another
DECK|2|The flat floor area of a ship where one can walk
DEEP|2|Extending far down from the top or surface
DEMO|2|A short trial version of a product or piece of software
DEMS|2|Informal short form for members of a major US political party
DENY|2|To declare untrue, or to refuse to grant
DIED|2|Ceased to live; passed away
DIET|2|The kinds of food a person habitually eats
DIRE|2|Extremely serious or urgent
DIRT|2|Loose earth or ground-in grime
DISH|2|Shallow container used for serving or cooking food
DISK|2|A flat, circular object.
DIVE|2|To plunge headfirst into water
DOCK|2|A structure where ships are loaded and unloaded.
DOES|2|To perform an action.
DONE|2|Brought to completion; finished
DOOM|2|Death, destruction, or some other terrible fate
DOPE|2|Informal word for an illegal drug
DOSE|2|A measured quantity of medicine taken at one time
DOWN|2|Toward a lower place.
DREW|2|Made a picture with a pencil, in the past
DRIP|2|To fall in drops.
DROP|2|To let something fall from your grasp
DRUG|2|A medicine or substance that affects the body
DUCT|2|A tube or channel for conveying something.
DUDE|2|An informal word for a man or fellow
DUEL|2|A formal combat between two people, often with pistols or swords
DUKE|2|A nobleman of the highest hereditary rank
DUMB|2|Lacking intelligence; foolish or silly
DUMP|2|To drop or discard something carelessly
DUST|2|Fine dry particles that settle on surfaces
DUTY|2|A moral or legal obligation
EACH|2|Every one of a group
EARN|2|To receive in return for work or service
EASE|2|Freedom from difficulty or great effort
EBAY|2|An online auction and shopping website.
ECHO|2|A sound that is reflected off a surface.
EDDY|2|A small circular current that forms a whirlpool
EDGE|2|The outer boundary or rim of a surface
EDIT|2|To correct and prepare text for publication
ENDS|2|Brings to a conclusion
ENVY|2|A feeling of discontented longing for another's advantages
EPIC|2|A long poem recounting heroic deeds and adventures
EURO|2|Money spent in France, Germany, and Spain alike
EVER|2|At any time at all
EVIL|2|Profoundly immoral and wicked
EYED|2|To look at someone or something in a particular way.
FACT|2|Something known to be true or to have actually happened
FAIR|2|Treating everyone equally and without bias
FAKE|2|Not genuine; made to deceive
FALL|2|To drop suddenly toward the ground
FAME|2|The condition of being widely known and celebrated
FANS|2|Enthusiastic admirers of a person, team, or pastime
FATS|2|Substances that provide energy and are found in food.
FAUX|2|Not genuine; imitation.
FEDS|2|Informal term for federal law enforcement agents
FEEL|2|To perceive by touch
FEES|2|Amounts of money paid for services or membership
FELL|2|Dropped suddenly to the ground, in the past
FELT|2|Experienced a sensation or emotion (past tense)
FEST|2|An informal, lively gathering or celebration
FEUD|2|A prolonged, bitter quarrel between two parties
FILE|2|Folder or collection of related documents
FIND|2|To discover something.
FINE|2|Of high quality; very good
FINN|2|A native or inhabitant of a Nordic country whose capital is Helsinki
FIRE|2|Combustion that produces heat, light, and flames.
FIRM|2|Solid and resistant to pressure
FLAP|2|A flat piece attached at one edge, that hinges or hangs loosely
FLAW|2|A defect or imperfection.
FLEW|2|Traveled through the air, in the past
FLEX|2|To bend a limb or joint, or to show off assertively (slang)
FLIP|2|To turn over quickly with a sudden movement
FLOP|2|To fail completely.
FLOW|2|The steady, continuous movement of a liquid
FLUX|2|A state of continuous change.
FOLD|2|To bend something over on itself
FOLK|2|Ordinary people, especially of a community
FOND|2|Having strong affection or liking for something
FONT|2|A particular style or set of printed or displayed type
FORM|2|The shape or structure of something.
FOUL|2|Offensive to the senses; disgusting
FUEL|2|Material burned to produce heat or power
FUND|2|A sum of money set aside for a purpose
FUNK|2|A rhythmic dance-music style built on strong bass grooves and syncopation
FURY|2|Wild or fierce anger
FUSE|2|A safety device that breaks an electrical circuit when overloaded
GAIN|2|To obtain or acquire something of value
GALE|2|A very strong wind, more powerful than an ordinary storm
GAME|2|An activity with rules for play
GANG|2|An organized group of criminals
GATE|2|A hinged barrier set in a fence or wall
GAVE|2|Handed something over to another in the past
GAYS|2|People who are attracted to others of the same sex
GEAR|2|The equipment needed for a particular activity
GETS|2|Obtains or receives, in the third person
GIGS|2|Short-term jobs or performances.
GILL|2|The respiratory organ of a fish
GINA|2|A common feminine given name, sometimes short for Virginia
GIVE|2|To present something to someone
GOAT|2|A domesticated animal often raised for its milk.
GOES|2|Moves or travels, in the third-person singular.
GOLF|2|A sport played with clubs and a small ball on a course of holes
GONE|2|No longer present or available
GORE|2|Blood that has been shed, especially from a violent wound
GRAB|2|Seize suddenly with the hand
GRAD|2|A person who has completed a degree.
GREW|2|Increased in size or amount over time
GRID|2|A network of evenly spaced horizontal and vertical lines
GRIN|2|To smile broadly.
GRIP|2|A firm hold or grasp on something
GULF|2|Large coastal inlet of an ocean reaching into the land
GURU|2|A spiritual teacher, especially in Hinduism or Sikhism
GUTS|2|Courage and determination in a difficult situation
GUYS|2|An informal way to address a group of people
HAIL|2|Small pellets of ice that fall as precipitation during storms
HALL|2|A large room or building used for public gatherings
HALO|2|A ring of light depicted around the head of a holy figure
HANG|2|To suspend so as to hold from above
HANK|2|A common nickname for the name Henry
HARD|2|Solid and firm to the touch; not soft
HARE|2|A fast, long-eared mammal larger than a rabbit
HARM|2|Physical injury or other hurt caused to someone
HASH|2|A dish made of chopped meat, potatoes, and onions fried together
HATE|2|To dislike intensely
HATH|2|Archaic third-person singular form of 'have'
HATS|2|Items worn on the head.
HAUL|2|A quantity of something obtained, especially by illicit means.
HAVE|2|To own or possess
HEAD|2|The part of the body that contains the brain
HEAL|2|Cure
HEAP|2|A collection of things piled up.
HEAT|2|The quality of being hot; high temperature
HEIR|2|A person entitled to inherit property or a title
HELD|2|Kept or grasped firmly in the past
HELL|2|A place of punishment for the wicked in the afterlife
HELM|2|The wheel or tiller used to steer a ship
HELP|2|To assist someone.
HERO|2|A person admired for brave or noble deeds
HIGH|2|At a great vertical distance.
HIND|2|Situated at the back, especially of an animal's legs
HINT|2|A slight, indirect indication or helpful pointer
HIPS|2|Bony protrusions on either side of the waist
HIRE|2|To take someone on for paid work
HOAX|2|A deception designed to trick people into believing something false.
HOLD|2|To grasp and keep in one's hand
HOOK|2|A curved piece of metal for catching or hanging things
HOPE|2|A feeling of expectation that something desired will happen
HOST|2|One who entertains guests or presents a show
HULK|2|A large, bulky person, animal, or object
HULL|2|The main body or frame of a ship
HUNG|2|Suspended something from above; the past tense of hang
HUNT|2|To chase and kill wild animals for food or sport
HURT|2|To cause physical pain or damage to someone
HUSH|2|A state of complete silence or calm
HYMN|2|A religious song or poem of praise.
HYPE|2|Exaggerated publicity or promotion.
ICED|2|Made very cold by chilling, as a drink
ICON|2|A small clickable image on a computer screen
IDOL|2|An object of extreme devotion or worship
IMAM|2|A Muslim worship leader who leads prayers in a mosque
INCH|2|A small unit of length, one twelfth of a foot
INDY|2|A term often used to describe independent films.
INFO|2|Casual word for facts and details about something
IRAQ|2|Middle Eastern nation whose capital is Baghdad
IRIS|2|The colored part of the eye surrounding the pupil
IRON|2|A strong magnetic metal used to make steel
ISLE|2|A small island, often used in poetic or literary contexts
JACK|2|A device used to lift a heavy object such as a car
JADE|2|A hard, often green gemstone used in carvings and jewelry
JAVA|2|A type of coffee.
JAYS|2|Colorful, noisy birds related to crows and magpies
JAZZ|2|An improvisational music genre born in New Orleans
JETS|2|Fast aircraft driven by turbine engines
JEWS|2|People who practice Judaism, considered collectively
JOAN|2|A common female given name.
JOBS|2|Paid positions of regular employment
JOEY|2|A baby kangaroo
JURY|2|A group sworn to deliver a verdict in a court case
KARA|2|A female given name.
KEEN|2|Eager and full of enthusiasm
KEEP|2|To retain possession of something
KEPT|2|Retained possession of; did not give away
KEYS|2|Small shaped metal objects used to open locks
KIND|2|Considerate, generous, and friendly toward others
KIRK|2|A Scottish word for church
KNEW|2|Had awareness or understanding of, in the past
KNOT|2|A fastening made by looping and tightening rope or string
KNOW|2|To be aware of something through observation or information
LACE|2|A delicate fabric made of a patterned, open weave of thread
LACK|2|A deficiency or absence of something needed
LADS|2|Informal British term for boys or young men
LAMA|2|A Tibetan Buddhist spiritual teacher or monk
LAMB|2|A young sheep.
LAME|2|Unable to walk normally due to an injury to the leg or foot
LANE|2|Narrow road or marked division of a track
LAPS|2|Circuits of a racetrack completed during a race
LAST|2|Coming after all others in time or order.
LAWS|2|Rules created and enforced by a government
LEAD|2|To guide others or be out in front
LEAK|2|An unintended escape of liquid or gas through a gap
LEAN|2|To bend or incline from an upright position
LEFT|2|On the side opposite to the right
LENS|2|A curved piece of glass that focuses light
LESS|2|A smaller amount
LETS|2|Allows or gives permission for something to happen
LEVY|2|A tax or other charge imposed by authority
LIED|2|Told a deliberate untruth
LIES|2|Deliberate untrue statements
LIMA|2|The capital city of Peru.
LINK|2|A single ring forming part of a chain
LIPS|2|The two fleshy edges of the mouth
LIST|2|A number of items written down one after another
LITE|2|Describing a version of a product with fewer calories or reduced features.
LOAD|2|A heavy weight or quantity carried or supported
LOAN|2|A sum of money borrowed and repaid, often with interest
LOCK|2|A device for keeping a door or container securely closed
LOFT|2|A room or space under a roof, used for storage or living
LOGO|2|Symbol or design that identifies a company or brand
LONG|2|Measuring a great distance from end to end.
LOOP|2|A shape made by a line or curve that crosses itself
LOOT|2|Valuables seized by force, especially during war or crime
LORD|2|A titled nobleman, master, or ruler
LOSE|2|To fail to keep or be deprived of something
LOSS|2|The state of no longer having something
LOST|2|Unable to find one's way
LOTS|2|Great amounts or large numbers
LOUD|2|Producing a great amount of sound
LUCK|2|Success or failure brought by chance rather than effort
LUMP|2|A compact mass of material with no definite shape.
LUNG|2|One of the pair of organs used for breathing
LURE|2|Bait or something designed to tempt a person or animal
LUSH|2|Rich and abundant, often in reference to vegetation.
LUST|2|A strong feeling of desire, especially sexual desire
MAKE|2|To build, form, or bring into being
MALE|2|Of the sex that fathers offspring
MARE|2|An adult female horse.
MARK|2|A visible spot or impression on a surface
MART|2|A place where goods are bought and sold
MASH|2|To crush something into a soft, pulpy mixture
MAST|2|A tall upright pole that supports a ship's sails
MATE|2|A friend or partner
MEDS|2|Informal term for medications.
MEET|2|To come together with someone by arrangement or chance
MEGA|2|Extremely large or great.
MEME|2|an image, video, or idea that spreads rapidly online
MESH|2|A material of woven or knitted strands with open spaces
MESS|2|A state of untidy disorder
META|2|Parent company of Facebook and Instagram
METH|2|A highly addictive stimulant drug used illegally as a street drug
METS|2|New York's National League baseball team
MICE|2|Small rodents with pointed snouts and long tails
MILD|2|Not severe, harsh, or extreme
MILL|2|A building or device for grinding grain into flour
MIND|2|The seat of thought, memory, and imagination
MINE|2|Underground excavation for extracting coal or ore
MISS|2|To fail to hit, reach, or catch something.
MOCK|2|To tease or ridicule someone
MODE|2|A particular way or manner of doing something
MOOD|2|A temporary state of mind or feeling
MUSK|2|A strong, earthy scent used as a base note in many perfumes
MUTE|2|Refraining from speech; silent
MYTH|2|A traditional story explaining natural or social phenomena
NAME|2|The word by which a person or thing is known
NAVY|2|A nation's seagoing armed force
NAZI|2|Member of Hitler's fascist German party
NEAR|2|At only a short distance away
NEON|2|A chemical element used in glowing signs
NERD|2|A person single-mindedly devoted to intellectual or technical pursuits
NEXT|2|Following in time or order
NICK|2|A small cut or chip in a surface
NOEL|2|A word for Christmas, often sung in carols
NORM|2|A standard or pattern regarded as typical
NUDE|2|Without clothing.
NUNS|2|Women belonging to a religious order, often living in a convent
OAKS|2|Trees known for their strength and acorns.
OATH|2|A solemn formal promise, often sworn on something sacred
ODDS|2|The likelihood of an outcome, often given as a ratio
ONCE|2|On a single occasion; one time only
ONLY|2|And no one or nothing more besides
ORAL|2|Spoken rather than written
OSLO|2|The capital city of Norway
OUTS|2|In baseball, the retirements of a batter or base runner
OVAL|2|Having an elongated circular shape.
OWED|2|Was under obligation to pay back
OWNS|2|Holds as personal property
PACK|2|To fill a bag or case with belongings for a trip
PADS|2|Cushioned protective coverings worn for support
PAID|2|Settled a bill or debt (past tense)
PAIN|2|An unpleasant physical sensation caused by injury or illness
PALE|2|Lacking strong colour; light in shade
PALM|2|The inner surface of the hand between wrist and fingers
PART|2|A portion of a whole.
PASS|2|To move ahead of or go by something
PAST|2|The time that has gone before the present
PAWN|2|The least valuable piece in chess
PAYS|2|Hands over money for goods or work
PEAK|2|The pointed top of a mountain
PEER|2|To look closely or intently at something
PEST|2|A destructive insect or animal that damages crops or spreads disease
PICS|2|Informal word for photographs
PINE|2|Evergreen coniferous tree with needle-like leaves
PING|2|A short, high-pitched ringing sound
PITY|2|A feeling of sorrow for someone else's misfortune.
PLAN|2|A detailed proposal for doing something
PLAY|2|Engage in an activity for enjoyment or recreation
PLEA|2|An urgent and emotional request
PLOT|2|The main sequence of events in a novel, film, or play
PLUG|2|The fitting on the end of a cable that joins to a socket
POKE|2|To jab or prod with a finger.
POLE|2|A long, slender, rounded rod or post
POLO|2|A team sport played on horseback using mallets and a ball
POPE|2|The head of the Roman Catholic Church
PORK|2|Meat from a pig.
PORT|2|A coastal place where ships load and unload
POSE|2|To hold a particular position, as for a photograph
PRAY|2|To address a deity in worship or supplication
PREY|2|An animal hunted for food.
PROF|2|A university teacher, informally
PROP|2|An object used to support something, or an item used on stage
PROS|2|The favorable points in an argument, or skilled professionals
PUCK|2|A hard rubber disc used in ice hockey
PULL|2|To draw something toward oneself using force
PUMP|2|A device for forcing liquid or gas through pipes
PUNK|2|A loud, fast, rebellious style of rock music from the mid-1970s
PUNT|2|To kick a dropped football before it touches the ground.
PURE|2|Free from contamination or mixture
PUSH|2|To press against something to move it away
PUTS|2|Moves something into a particular position
QUAD|2|Open square courtyard at a school or college
RAGE|2|Violent, uncontrollable anger
RAID|2|Sudden surprise attack by police or soldiers
RAIL|2|A bar fixed to give support or form a barrier
RANG|2|Produced a clear resonant sound, in the past
RANK|2|A position within a hierarchy or scale of seniority
RANT|2|To speak or complain loudly and at length, often angrily.
RARE|2|Seldom occurring; not often found
RASH|2|Acting with excessive haste and without careful thought.
RAVE|2|To talk with wild enthusiasm about something
RAYS|2|Lines of light or energy.
READ|2|To look at and take in the meaning of written words
REAL|2|Actually existing, not imagined or invented
REAP|2|To cut and gather a crop, or to receive a reward for effort
REAR|2|The hindmost part of something
REEF|2|A ridge of rock, coral, or sand near the ocean's surface
REEL|2|A cylindrical device used to wind thread, film, or fishing line.
REFS|2|Officials who enforce the rules in a sports match.
RELY|2|Depend on with confidence
RENT|2|A regular payment made for the use of property or land
REPS|2|Short for repetitions in exercise.
REST|2|A period of relaxation or freedom from activity.
RIBS|2|Curved bones forming the chest cage
RIFT|2|A crack or split, especially in the earth or in a relationship
RIOT|2|A violent public disturbance by an unruly crowd
RISE|2|To move upward or increase in level
RISK|2|Exposure to the chance of danger or loss
RITE|2|A ceremonial act, especially one of religious character
RODS|2|long, thin, straight pieces.
ROLE|2|A character portrayed by an actor
ROLL|2|To move along by turning over and over
ROOM|2|An area within a building enclosed by walls
ROOT|2|The part of a plant that grows underground
ROPE|2|A strong, thick line made of twisted fibers or strands
RUBY|2|A red gemstone.
RUDE|2|Showing a lack of good manners or respect
RUIN|2|To damage something so badly it cannot be repaired
SAGA|2|A long, involved story or series of events, often recounting heroic deeds.
SAID|2|Past tense of 'say'; uttered aloud
SALE|2|The exchange of goods or services for money
SALT|2|White crystalline seasoning used to flavor food
SAME|2|Identical; not different.
SANG|2|Produced musical sounds with the voice, in the past
SAVE|2|To set aside money for future use
SCAN|2|To look over quickly, or to examine with a device
SCUM|2|A layer of dirt or froth on the surface of a liquid
SEAL|2|A sleek marine mammal that lives near coasts
SEAT|2|A place provided for a person to sit
SECT|2|Faction
SEEK|2|Try to find or obtain
SEEM|2|To give the impression of being
SELL|2|Exchange goods for money
SEND|2|Cause to go or be delivered to a destination
SENT|2|Caused to go or be delivered, in the past tense
SHED|2|A small storage building in a garden
SHOT|2|An attempt to score by kicking, throwing, or striking a ball
SHOW|2|To display or present
SHUT|2|To move something into a closed position
SIDE|2|One of the surfaces or edges of an object
SIGN|2|A board displaying information or directions
SILK|2|A soft, smooth fabric spun by a certain caterpillar
SIMS|2|A popular life-simulation video game series
SINS|2|Acts considered wrong or immoral.
SITE|2|A particular place where something is located or takes place
SIZE|2|The overall dimensions or magnitude of something
SKIP|2|Pass over or leave out
SLAB|2|A flat, thick piece of stone or concrete
SLAM|2|To shut something forcefully.
SLAP|2|To hit with an open hand.
SLID|2|Moved smoothly along a surface.
SLIM|2|Gracefully thin in build
SLIP|2|To slide accidentally and lose one's footing
SLOT|2|A narrow opening for inserting something
SNAP|2|Break suddenly with a sharp cracking sound
SOAK|2|To immerse in liquid.
SOLD|2|Exchanged for money, in the past
SOLO|2|Done by one person alone
SOON|2|In or after a short time from now
SORE|2|Painful or tender.
SORT|2|To arrange items in groups according to type
SOUL|2|The spiritual or immaterial part of a person
SPAM|2|Unwanted junk messages sent in bulk over email
SPEC|2|A detailed description of a design or requirement.
SPIN|2|To turn quickly around a central point
SPOT|2|A small round mark or stain
SPUN|2|Rotated rapidly around an axis
SPUR|2|A spiked device worn on a rider's boot heel to urge a horse forward
STAY|2|To remain in one place
STEP|2|A single movement of the foot in walking
SUBS|2|Short for underwater warships
SUCH|2|Of the type previously mentioned.
SUCK|2|To draw liquid into the mouth using the lips and tongue
SUED|2|Took legal action against someone
SUIT|2|A matching jacket and trousers worn together
SUMS|2|Totals obtained by adding numbers together
SUNG|2|Performed vocally, past participle of a musical verb
SUNK|2|Gone down below the surface of water; past participle of sink
SURE|2|Confident and free from doubt
SWAY|2|To move slowly and rhythmically back and forth
SYNC|2|To coordinate so events happen at the same time
TABS|2|Small labels or markers for identification or organization.
TAME|2|To domesticate or subdue.
TANG|2|A sharp taste or smell.
TAPE|2|A long narrow strip used for binding, sealing, or recording
TAPS|2|A device for controlling the flow of liquid.
TEAM|2|A group working together toward a common goal
TEAR|2|A drop of salty liquid that falls from the eye
TECH|2|Informal word for advanced electronic gadgets and methods
TELL|2|To make known to someone with words
TEMP|2|A worker hired for a limited period
TEXT|2|The written words of a book or document
THAI|2|Of or relating to a Southeast Asian kingdom once called Siam
TICK|2|A small blood-feeding arachnid found on animals
TIDE|2|The rise and fall of sea levels.
TIED|2|Fastened or knotted securely
TIES|2|Strips of neckwear worn with formal shirts
TINY|2|Extremely small in size
TIPS|2|Small pieces of practical or helpful advice
TIRE|2|To exhaust or weary.
TONE|2|A particular quality or pitch of a sound
TOOK|2|Past tense of grasp or seize
TOPS|2|The uppermost parts or surfaces.
TORN|2|Ripped or pulled apart
TOUR|2|A journey visiting several places in turn
TRAP|2|A device for catching animals
TREK|2|A long, arduous journey, especially on foot
TRIO|2|A group of three, especially musicians
TRIP|2|A short excursion to a place and back
TRUE|2|In accordance with fact or reality
TUCK|2|To fold something neatly.
TUNE|2|A pleasing succession of musical notes
TURN|2|To rotate or change direction.
TWIN|2|One of two children born at the same birth
TYPE|2|A category of things sharing common characteristics
TYRE|2|A rubber covering fitted around the rim of a wheel
UNDO|2|To reverse an action.
USED|2|No longer new.
USER|2|A person who operates a device or program
USES|2|Employs something for a purpose
UTAH|2|Beehive State of the American West, home to Salt Lake City
VAIN|2|Having excessive pride in one's appearance or achievements
VANS|2|Vehicles used for transporting goods or people.
VARY|2|To change or be different from one case to another
VEIN|2|A blood vessel that carries blood back toward the heart.
VENT|2|An opening that allows air or gas to escape
VERB|2|A word that describes an action, state, or occurrence
VERY|2|To a high degree; greatly
VETO|2|The power to reject a decision or proposal made by others
VETS|2|Professionals who treat animals.
VIBE|2|The general atmosphere or feeling of a place
VILE|2|Extremely unpleasant or morally repugnant
VISA|2|Official passport endorsement permitting entry to a country
VOID|2|A completely empty space.
VOTE|2|A formal expression of choice in an election
VOWS|2|Solemn promises, especially those made during a wedding ceremony
WAGE|2|Regular payment received for work, often calculated by the hour
WAKE|2|To stop sleeping and become conscious
WALL|2|A vertical structure forming the side of a room or enclosing an area
WANT|2|To wish or long for something
WARE|2|Articles or goods for sale.
WARN|2|To inform someone of a danger.
WARP|2|To bend or twist out of the original shape
WARS|2|Armed struggles between nations or groups
WARY|2|Cautious and alert to danger.
WATT|2|The SI unit used to measure electrical power
WAVE|2|A moving ridge on the surface of water
WAYS|2|Methods or manners of doing things
WEAR|2|To have clothing on one's body
WEED|2|A wild plant growing where it is not wanted
WEIR|2|A low dam built across a river to raise the water level or control its flow
WENT|2|Past tense of travel or depart
WERE|2|Past tense of 'to be', used with plural subjects
WHEN|2|At what time
WHIP|2|To strike with a flexible instrument.
WIDE|2|Measuring a large distance from one side to the other
WILD|2|Living in nature; untamed
WING|2|The limb a bird uses to fly
WINS|2|Achieves victory in a contest (third person)
WIRE|2|A thin, flexible strand of metal
WISE|2|Showing good judgment born of experience
WISH|2|A strong longing for something to happen
WOKE|2|Stopped sleeping; became conscious again
WOMB|2|The organ in which a fetus develops before birth
WORE|2|Had a garment on the body, in the past
WORN|2|Damaged or made thin by long use
WRAP|2|Cover an object by folding material around it
YARD|2|A ground area beside a building, or a unit of length of three feet
YARN|2|A long strand of fiber used for knitting.
YUAN|2|The basic unit of currency in China
ZEUS|2|The king of the gods in ancient Greek mythology
ZINC|2|A bluish-white metallic element used to coat steel against rust
ZONE|2|A region marked off for a particular purpose
ACID|3|A sour chemical substance with a pH below seven
ADHD|3|A neurodevelopmental condition marked by inattention and hyperactivity (abbr.)
AGES|3|Very long periods of time
ALPS|3|A major mountain range in Europe.
ARAB|3|Member of a Semitic people of the Middle East
ASAP|3|Urgently
AXIS|3|an imaginary line around which an object rotates.
BAIL|3|To release someone from custody.
BART|3|San Francisco's rail transit system, familiarly
BEAU|3|A man who is the romantic partner of a woman.
BECK|3|A summoning gesture, as in a common idiom with 'call'
BEEN|3|Past participle of 'to be'
BLUR|3|To make unclear or indistinct.
BOND|3|A close connection between people
BOUT|3|A short spell of illness or activity; a boxing match
BRAD|3|A thin nail with a small head, used in finishing carpentry
BUFF|3|a person who is very interested in a particular subject
BULK|3|The large size or mass of something
BUST|3|To break open or apart.
BUTT|3|The thicker, blunt end of a tool or weapon
CAIN|3|A biblical figure known for committing the first murder.
CAPE|3|A sleeveless garment draped over the shoulders
CELL|3|The basic structural unit of all living organisms
CHAR|3|To burn something so its surface turns black
CHIP|3|A small fragment, or a tiny silicon circuit in a computer
CLAD|3|Dressed or covered.
COMP|3|A free ticket or service given as a courtesy
CORY|3|A common name, often used as a given name.
COUP|3|A sudden, violent, and illegal seizure of power.
CRAP|3|Worthless or low-quality material
DAME|3|A title of respect for a woman, equivalent to 'Sir' for a man.
DEAR|3|Greatly loved or cherished; also meaning costly
DELL|3|A small wooded valley.
DONG|3|The basic monetary unit of Vietnam
DUAL|3|Made up of two parts or having two aspects
DUNK|3|Basketball shot through the hoop
EARL|3|A British nobleman ranking below a marquess
ELSE|3|In addition; besides what has been mentioned
ERIE|3|A large lake in North America.
EVEN|3|Flat and smooth; or divisible by two
FATE|3|The course of events held to be beyond human control
FEAT|3|An achievement that requires great courage, skill, or strength.
FIAT|3|An official order given by someone in authority
FITS|3|Sudden short bursts of activity or emotion
FLED|3|Ran away from danger, in the past
FORD|3|A shallow spot where a river can be waded across
FORE|3|Situated at or toward the front part of something
FORT|3|Stronghold
GAGA|3|Extremely enthusiastic or excited.
GENE|3|A unit of heredity passed from parent to offspring
GLEN|3|A narrow valley, especially in Scotland
GODS|3|Supernatural beings worshipped as ruling over nature
GOIN|3|Casual, dropped-g way to say someone is currently traveling or departing
HACK|3|Break into a computer system illegally
HART|3|A male deer, especially a stag.
IONS|3|Charged particles created when atoms gain or lose electrons
ISIS|3|Ancient Egyptian goddess of motherhood and magic
JERK|3|To move suddenly.
JOSH|3|To tease someone in a playful way
JUST|3|Exactly, or only a moment ago
KHAN|3|Historic title for a Mongol or Central Asian ruler
LAID|3|Set down gently; past tense of a verb meaning to place
LAYS|3|Puts something down in a flat position (third person singular)
LIAR|3|One who tells falsehoods.
LIKE|3|To find agreeable, or having a similar quality to
LIVE|3|Reside
LORE|3|Traditional knowledge or beliefs.
MACK|3|British slang for a raincoat
MANS|3|Staffs or operates, as a post or station
MASS|3|A large body of matter with no definite shape
ACTOR|1|Person who performs in plays or films
ADMIN|1|Routine office paperwork and organizational tasks, informally
ADORE|1|To love and admire deeply
ADULT|1|a fully grown person
AIDED|1|Helped someone achieve something
ALARM|1|A device that warns of danger or wakes you up
ALIEN|1|A being from another world
ALIVE|1|Having life; not dead
ALLEY|1|A narrow passage between or behind buildings
ALLOW|1|To give permission for something to happen
ALOUD|1|Spoken so as to be heard, rather than silently
ANNOY|1|To irritate or bother someone repeatedly
APPLE|1|Round, crisp orchard fruit, often red or green
APRIL|1|The fourth month of the year
ARROW|1|A pointed shaft shot from a bow
ASHES|1|The grey powder that remains after something has burned.
ATTIC|1|A space or room just below a building's roof
AWAIT|1|To anticipate the arrival of something or someone
AWAKE|1|Not asleep; alert and conscious
AWFUL|1|Extremely bad or unpleasant
BACON|1|Cured meat from the back or sides of a pig
BAKED|1|Cooked in an oven using dry heat
BAKER|1|Person whose job is to make bread and cakes
BALLS|1|Round objects used in many sports
BATHS|1|Tubs filled with water for washing
BEACH|1|Sandy shore where the land meets the sea
BEADS|1|Small decorative balls with holes, strung together to make jewelry.
BEARD|1|Hair grown on a man's chin and cheeks
BEAST|1|A large or dangerous wild animal
BEERS|1|Alcoholic drinks made from fermented malt and hops
BELLS|1|Hollow metal instruments that ring when struck
BELLY|1|The front part of the body below the chest; the stomach
BELTS|1|Bands of leather or fabric worn around the waist
BENCH|1|A long seat for two or more people
BIBLE|1|The sacred scriptures of Christianity
BIKES|1|Two-wheeled pedal-powered vehicles.
BINGO|1|A game of chance played with numbered cards
BIRDS|1|Feathered, winged creatures
BLACK|1|The darkest of colors, like coal or soot
BLAND|1|Lacking strong flavor, spice, or personality
BLAZE|1|A large, intense fire.
BLEED|1|To lose blood from a wound
BLEND|1|To combine smoothly into a single mixture
BLIND|1|Lacking the sense of sight
BLINK|1|To close and open the eyes quickly
BLOOD|1|The red fluid that circulates through the body
BLOOM|1|A flower, or the state of flowering.
BLUNT|1|Not sharp; having a dull edge or point
BOARD|1|A long flat piece of sawn wood
BOATS|1|Small vessels for traveling on water
BONES|1|The hard parts that form a skeleton
BOOKS|1|Bound printed works, more than one
BOOTS|1|Sturdy footwear covering the ankle
BOOZE|1|Alcoholic drink, in informal speech
BORED|1|Feeling weary and restless through lack of interest
BOWLS|1|Round, deep dishes used for holding food
BOXES|1|Square containers used for storing or shipping things
BRAKE|1|A device that slows or stops a vehicle
BRAVE|1|Showing courage in the face of danger
BREAD|1|A staple food baked from flour and water
BREAK|1|A short rest from work
BRICK|1|A rectangular block of baked clay used in building
BRIDE|1|A woman on the day of her wedding
BRITS|1|Informal, casual term for citizens of the United Kingdom
BROOK|1|A small, natural stream of fresh water
BROWN|1|The color of chocolate or rich soil
BUDDY|1|A close friend or companion
BUILD|1|To construct something by assembling its parts
BULLY|1|A person who habitually intimidates or mistreats weaker people
BUNNY|1|Small furry animal often associated with Easter
BUSES|1|Large vehicles for public transport.
CAKES|1|Sweet baked desserts made from flour, sugar, and eggs.
CAMEL|1|A desert animal with one or two humps
CANDY|1|A sweet confection made mostly of sugar
CANOE|1|A narrow lightweight boat propelled with a paddle
CARTS|1|Small wheeled vehicles used to transport goods
CAVES|1|Natural underground hollows, often with stalactites
CHAIN|1|A series of connected metal links
CHAIR|1|A seat for one person, usually with a back and legs
CHALK|1|A soft white rock, or the stick made from it for writing
CHASE|1|To pursue in order to catch
CHEAP|1|Costing very little money
CHEEK|1|The fleshy part of the face below the eye.
CHEFS|1|Professional cooks who lead a kitchen
CHESS|1|A strategy board game played with kings, queens, and knights
CHILD|1|A young human being below the age of puberty.
CHILI|1|Spicy pepper used to add heat to dishes
CHOIR|1|Organized group of singers who perform together
CHUNK|1|A thick, solid piece of something
CIDER|1|A drink made from fermented apple juice
CLANS|1|Large family groups, especially in Scottish Highland tradition
CLASS|1|A group of students taught together
CLEAN|1|Free from dirt or stains
CLEAR|1|Easy to see through or to understand
CLICK|1|To press and release a mouse button
CLOCK|1|A device that measures and displays the time
CLOSE|1|To shut something that was open
CLOUD|1|A visible mass of water vapor floating in the sky
CLOWN|1|A comic entertainer known for bright makeup and silly antics.
COATS|1|Outer garments worn for warmth or protection
COCOA|1|A powder made from roasted cacao beans, used in chocolate
COINS|1|Small flat pieces of metal used as money
COMFY|1|Informal term for cozy and relaxing
COOKS|1|People who prepare meals professionally
CORES|1|The central or innermost parts of things
COUGH|1|A sudden, sharp release of air from the lungs
COUNT|1|To name numbers in order
CRASH|1|To collide violently or smash to pieces
CRATE|1|A large sturdy box used for transporting goods
CRAWL|1|To move slowly with the body close to the ground
CREAM|1|The rich fatty layer that rises to the top of milk
CREEP|1|To move slowly and quietly
CRIES|1|Sheds tears, usually from sadness or pain.
CRISP|1|Firm, dry, and brittle in texture
CROWD|1|A large number of people gathered together
CROWN|1|Ornamental headgear worn by a monarch
CRUST|1|The hard outer layer of something, such as bread or the earth
CURLY|1|Having tight coils or ringlets, as hair
DADDY|1|An affectionate word a child uses for their father
DAILY|1|Happening once each day
DANCE|1|Move rhythmically to music
DEEDS|1|Actions performed, especially notable ones
DEMON|1|An evil spirit or devil
DIARY|1|A book for recording daily events and private thoughts
DIETS|1|Restricted eating regimens, or the food one habitually eats
DIGIT|1|A whole number from 0 to 9
DINER|1|A small, casual restaurant serving simple meals
DOLLS|1|Small models of human figures, often given to children as toys
DONOR|1|A person who gives something, such as blood or money
DOORS|1|Hinged or sliding panels that close off entrances to rooms
DORIS|1|A common female given name.
DOUGH|1|A soft, thick mixture of flour and liquid used for baking
DOZEN|1|A set of twelve items
DRAKE|1|A male duck.
DRANK|1|Swallowed a liquid, in the past tense.
DRESS|1|A one-piece garment with a skirt, typically worn by women
DRIED|1|Having had moisture removed.
DRILL|1|A power tool for boring holes
DRINK|1|To swallow a liquid
DRIVE|1|To operate and steer a motor vehicle
DROWN|1|To die from being unable to breathe underwater
DRUMS|1|Cylindrical percussion instruments
DRUNK|1|Intoxicated by alcohol
DRYER|1|Appliance for drying clothes
DUCKS|1|Web-footed swimming birds often found on ponds
DUDES|1|An informal, slang term for men or people.
DUSTY|1|Covered with fine particles of dirt
DWARF|1|A being of unusually small stature in folklore
EAGER|1|Having a strong desire or interest.
EAGLE|1|A large bird of prey known for sharp eyesight
EARTH|1|The third planet from the sun
EBOOK|1|A digital publication read on an electronic device
EIGHT|1|The number that comes after seven
ELBOW|1|The joint between the forearm and upper arm
EMAIL|1|An electronic message sent over the internet
EMPTY|1|Containing nothing
ENEMY|1|A person who is hostile to or opposes another
ENJOY|1|To take pleasure in something
ENTER|1|To go into a room or place
EQUIP|1|To supply someone with the items needed for a task
ERASE|1|To rub out or remove something completely
ERICA|1|A common female given name.
EVENT|1|Something notable that happens
EXAMS|1|Formal tests of knowledge.
EXITS|1|Ways out of a building
FACES|1|The fronts of people's heads
FAIRY|1|A tiny imaginary being with magical powers
FALLS|1|Drops downward under gravity
FARMS|1|Areas of land used to grow crops or raise animals
FATTY|1|Containing a lot of grease or oil
FEAST|1|A large, elaborate meal, often prepared for a celebration.
FEEDS|1|Gives food to a person or animal
FENCE|1|A barrier of posts and wire that encloses an area
FIELD|1|An open area of land used for crops or grazing
FIGHT|1|To take part in a violent struggle
FILLS|1|Makes something full by putting things into it
FIRST|1|Coming before all others in order, time, or rank
FLAGS|1|National banners flown from poles
FLASH|1|A sudden brief burst of bright light
FLOAT|1|To rest on the surface of a liquid without sinking
FLOCK|1|A group of birds or sheep
FLOOD|1|An overflow of water onto normally dry land
FLOOR|1|The lower surface of a room that one walks on
FLOUR|1|A powder made from grinding grains.
FOODS|1|Substances eaten to provide nourishment
FORKS|1|Pronged utensils used for eating
FORTY|1|The number that comes after thirty-nine
FRIES|1|Strips of potato cooked in hot oil
FROGS|1|Amphibians known for their jumping abilities.
FROST|1|A thin layer of ice crystals that forms on cold surfaces overnight
FRUIT|1|Sweet, seed-bearing produce of a plant
FUELS|1|Substances burned to produce heat or power
FURRY|1|Covered with fur.
GAMER|1|A person who plays interactive video entertainment as a hobby
GANGS|1|Organized groups of criminals
GHOST|1|The spirit of a dead person said to haunt the living
GIANT|1|An imaginary being of enormous size and strength
GIRLS|1|Young female children
GLASS|1|A hard, transparent material used in windows
GLOBE|1|Spherical model of the Earth mounted on a stand
GLOVE|1|A covering for the hand with separate sections for each finger
GOATS|1|Horned farm animals known for climbing and bleating
GOOSE|1|A large water bird, related to ducks, that honks
GRADE|1|a level of quality or rank
GRAPE|1|A small round fruit that grows in clusters on a vine
GRASS|1|The green plant that covers lawns and fields
GRAVE|1|A burial place marked by a headstone
GRAVY|1|A sauce made from meat juices, often served with roast dinners
GREEN|1|Of the color of grass and leaves
GREET|1|To welcome someone with kind words or a gesture
GRILL|1|An appliance or rack used for cooking food over direct heat
GROUP|1|A number of people or things gathered together
GROVE|1|A small group of trees, often of one kind
GROWS|1|Increases in size or develops over time
GUEST|1|A person invited to visit or stay at someone's home
GUIDE|1|Person who leads or shows the way
HAIRS|1|Thin strands that grow from the skin of most mammals
HAIRY|1|Thickly covered in fine strands growing from the skin
HALLS|1|Corridors or large rooms in a building
HANDS|1|The body parts at the ends of the arms
HANDY|1|Convenient and useful
HANGS|1|Suspends or dangles from above
HAPPY|1|Feeling or showing pleasure and contentment
HATCH|1|To emerge by breaking out of an egg
HAWKS|1|Birds of prey known for keen eyesight
HEART|1|The organ that pumps blood through the body.
HEAVY|1|Having great weight; hard to lift or move
HEDGE|1|A boundary line of closely planted shrubs or small trees
HELPS|1|Gives assistance to someone
HERBS|1|Plants used for flavoring food or in medicine
HINTS|1|Small clues or suggestions
HOBBY|1|An activity pursued for pleasure in one's spare time
HOMES|1|Places where people live
HONEY|1|Sweet, sticky substance made by bees
HOOKS|1|Curved devices used for catching or hanging things
HORSE|1|Large four-legged animal often ridden or used to pull loads
HOTEL|1|An establishment providing paid lodging for travelers
HUMID|1|Containing a high amount of moisture in the air
ICING|1|A sweet sugary coating spread on a cake
ICONS|1|Small pictorial symbols representing programs or files on a screen
IDIOT|1|A foolish or stupid person
INBOX|1|The folder where incoming email messages are received
INDIA|1|South Asian country with capital New Delhi
INTRO|1|A short opening section of a piece of writing, music, or speech
ITALY|1|Boot-shaped country jutting into the Mediterranean Sea
JAIME|1|A common given name, often male.
JANET|1|A common female given name.
JEANS|1|Casual trousers made of sturdy denim
JELLY|1|A soft, semi-solid food made from fruit juice and sugar
JENNA|1|A female given name.
JENNY|1|A common English female given name
JEWEL|1|A precious stone, often set in rings or necklaces
JOKES|1|Things said or done to provoke laughter
JOLLY|1|Full of high spirits; cheerful.
JUDGE|1|An official who decides cases in a court of law
JUICE|1|The liquid extracted from fruit or vegetables
JUICY|1|Full of moisture and flavor, like ripe fruit
JUMPS|1|Leaps or springs suddenly into the air
KATHY|1|A common female nickname
KATIE|1|A common female name.
KINGS|1|Male sovereign rulers of nations
KNIFE|1|A cutting tool with a sharp blade and a handle
KYLIE|1|A popular female name.
LABEL|1|Tag attached to an item giving information
LAKES|1|Large inland bodies of fresh water
LAMPS|1|Devices that produce light, often electric
LASER|1|Focused light used in pointers and cutting tools
LEADS|1|Guides others by going in front
LEARN|1|To gain knowledge or skill through study or experience
LEASH|1|A cord or strap used to restrain and control an animal
LEAVE|1|Go away from a place
LEMON|1|A yellow, sour citrus fruit
LEVER|1|A rigid bar pivoted on a fulcrum to lift or move loads
LIARS|1|People who tell falsehoods
LIFTS|1|Raises something to a higher position
LIGHT|1|Radiation that makes things visible to the eye
LILLY|1|A type of flowering plant.
LIMBS|1|Arms and legs of the body
LIONS|1|Large African cats, the males wearing shaggy manes
LITER|1|Metric unit of volume
LITRE|1|Metric unit of volume equal to 1,000 cubic centimeters
LOCKS|1|Devices used to fasten a door, opened with a key or combination
LOGIN|1|The credentials entered to access an online account
LUCKY|1|Having or bringing good fortune
LUNAR|1|Relating to the moon
LUNCH|1|A meal eaten in the middle of the day
MAILS|1|Sends items of correspondence through a postal system
MANGO|1|A tropical fruit with a sweet taste.
MANLY|1|Having qualities traditionally associated with men, such as strength
MAPLE|1|A tree known for its lobed leaves and sweet sap
MARSH|1|An area of low-lying land that is flooded in wet seasons
MASKS|1|Coverings worn over the face for protection, disguise, or performance
MATHS|1|The study of numbers, quantities, and shapes, informally
MEALS|1|Occasions of eating, such as breakfast and dinner
MEATS|1|The edible flesh of animals, used as food
MERGE|1|To combine or blend two or more things into one
MERRY|1|Full of cheerfulness and high spirits
MESSY|1|Untidy or disorganized
METAL|1|A hard, shiny material such as iron or gold
MILKY|1|Resembling a pale, opaque white liquid; cloudy in color
MINER|1|A person who extracts ore or coal from the ground
MOIST|1|Slightly wet; damp.
MOMMY|1|An affectionate word for one's mother
MONTH|1|One of the twelve parts of a year
MOOSE|1|A large deer with palmate antlers.
MORON|1|An offensive term for a very foolish or stupid person
MOUSE|1|Small long-tailed rodent that squeaks
MOUTH|1|Facial opening used for eating and speaking
MOVIE|1|Film
MURAL|1|A large picture painted directly onto a wall or ceiling
MUSIC|1|Arranged sounds of melody, harmony, and rhythm
NAILS|1|Thin pointed metal pins used to fasten things.
NAKED|1|Wearing no clothes
NEEDY|1|Lacking the necessities of life; poor
NICER|1|More pleasant or agreeable, comparative form
NIECE|1|Your sibling's daughter
NIGHT|1|The period of darkness between sunset and sunrise
NOISE|1|A loud or unpleasant sound
NOISY|1|Making or characterized by a lot of sound
NOSES|1|Facial organs used for smelling and breathing
NURSE|1|Person trained to care for the sick or injured
OCEAN|1|A vast expanse of salt water covering much of the globe
ONION|1|A pungent edible bulb vegetable with layered rings
PAINS|1|Physical suffering or discomfort, plural form
PAINT|1|Apply colored liquid to a surface
PALMS|1|The inner surface of the hands.
PANDA|1|A large black-and-white bear native to China that feeds mainly on bamboo
PANIC|1|Sudden, overwhelming fear
PANTS|1|A garment covering each leg separately
PAPER|1|Thin material made from pulp, used for writing
PARIS|1|The capital city of France
PARKS|1|Public areas of green space set aside for recreation
PARTY|1|A social gathering held for fun or celebration
PASTA|1|Italian food made from dough, shaped into forms like spaghetti or penne.
PEACE|1|Freedom from war or conflict
PEACH|1|A soft, fuzzy-skinned stone fruit with sweet, juicy flesh
PEAKS|1|The highest points of mountains
PEARL|1|A smooth, round gem formed inside an oyster
PEDAL|1|A foot-operated lever, as on a bicycle or piano
PEGGY|1|Common female given name
PENNY|1|A small coin of very low value
PHONE|1|Handheld device for making calls
PHOTO|1|An image captured with a camera
PIANO|1|Keyboard instrument whose hammers strike strings
PIECE|1|A portion or part separated from a whole
PILLS|1|Small tablets of medicine meant to be swallowed
PILOT|1|Person who flies an aircraft
PIPES|1|Tubes used to carry water, gas, or other fluids
PIZZA|1|Italian dish of baked dough with toppings
PLAIN|1|Simple and without decoration
PLANE|1|A powered aircraft with fixed wings
PLANK|1|a long, flat piece of sawn timber
PLATE|1|A flat dish from which food is eaten or served
PLAZA|1|An open public square in a town or city
PLEAD|1|To make an earnest and emotional appeal
PLUGS|1|Electrical connectors for devices
POETS|1|Writers of verse, plural
PONDS|1|small, still bodies of water
POOLS|1|Small bodies of still water
PORCH|1|A covered platform attached to the entrance of a house
PRANK|1|A mischievous practical joke
PRIZE|1|A reward given for victory or achievement
PUPIL|1|A student who is taught by a teacher
PUPPY|1|A young dog.
PURSE|1|A small bag used to carry money and personal items
QUEEN|1|A female ruler of a kingdom
QUEUE|1|A line of people waiting their turn
QUIET|1|Making little or no noise
RACER|1|One who competes in a speed contest
RAINS|1|Falls as water from the clouds
RAINY|1|Marked by frequent precipitation
RAISE|1|To lift to a higher position
RECAP|1|To summarize briefly
RELAX|1|Rest and become less tense
RESET|1|To restore something to its original condition
RESTS|1|Stops working or sits down to relax
RIDER|1|One who travels on a horse, bike, or similar vehicle
RIGHT|1|Correct or true.
RINSE|1|To wash something with clean water to remove soap or dirt
RISKY|1|Involving the possibility of danger or loss
RIVER|1|A large natural stream of water flowing to the sea
ROADS|1|Paved routes built for vehicles to travel between places
ROAST|1|To cook food, especially meat, using dry heat in an oven or over a fire.
ROBOT|1|A machine that can carry out tasks automatically
ROOMS|1|Spaces enclosed by walls within a building
ROOTS|1|The underground parts of a plant that absorb water
ROPES|1|Thick cords used for tying, pulling, or climbing
ROUGH|1|Having an uneven or coarse surface
ROUND|1|Shaped like a circle or ball
ROYAL|1|Relating to a king or queen
RULER|1|A flat, marked stick used for measuring or drawing straight lines
RUSTY|1|Covered with a reddish-brown corrosion from exposure to moisture
SAILS|1|Fabric sheets that catch the wind to propel a boat
SALAD|1|A cold dish of raw vegetables, often dressed
SALON|1|A business offering beauty treatments such as haircuts or manicures.
SALSA|1|A spicy tomato-based sauce often served with tortilla chips
SALTY|1|Having a briny, savory taste
SAMMY|1|A diminutive form of the name Samuel.
SANDS|1|Stretches of fine granular shore material.
SANTA|1|Jolly figure in red who delivers gifts at Christmas
SAUCE|1|A liquid or thick dressing served with food
SAVED|1|Rescued from danger, in the past
SCALP|1|The skin covering the top of the head
SCARF|1|A strip of fabric worn around the neck for warmth or style.
SCARS|1|Marks left on skin after a wound heals
SCARY|1|Causing fright or alarm
SCENT|1|A distinctive smell, especially a pleasant one
SCRAP|1|A small piece or amount left over from something
SCRUB|1|To clean a surface vigorously by rubbing
SEALS|1|Aquatic mammals with flippers that bark and bask on rocky shores.
SEATS|1|Places arranged for people to sit
SEEDS|1|Small objects from which new plants grow
SHADY|1|Sheltered from direct sunlight
SHAKY|1|Trembling or unsteady, likely to give way.
SHAPE|1|The external form or outline of something
SHARK|1|Large predatory cartilaginous fish of the sea
SHARP|1|Having a fine cutting edge or point
SHAVE|1|To remove hair close to the skin with a blade
SHEDS|1|Small outbuildings used for storage or shelter
SHEEP|1|Woolly farm animal that bleats
SHEET|1|Large rectangular piece of fabric for a bed
SHELF|1|A flat board for storing items.
SHINY|1|Reflecting light brightly; glossy
SHIPS|1|Large vessels that carry people or cargo across the sea
SHIRT|1|A garment for the upper body, often with a collar and buttons
SHOES|1|Footwear worn on the feet
SHORT|1|Of small length, height, or duration
SHOVE|1|To push roughly
SHUTS|1|Closes something firmly
SINGS|1|Produces musical sounds with the voice
SIREN|1|A loud warning signal
SKATE|1|To glide smoothly over ice or a surface on blades or wheels
SKIES|1|The upper atmosphere as seen from the ground, plural
SKILL|1|The ability to do something well.
SKIRT|1|A garment that hangs from the waist down
SLOPE|1|A surface with one end higher than the other
SMALL|1|Of little size
SMELL|1|Perceive an odor through the nose
SMILE|1|A pleased or friendly expression with upturned lips
SMOKE|1|Visible vapor rising from a fire
SNACK|1|A small amount of food eaten between main meals
SNAIL|1|A slow-moving, shelled garden mollusk
SNAKE|1|A long, legless reptile
SOBER|1|Not affected by alcohol; serious in manner
SOCKS|1|Items of clothing worn on the feet.
SOLVE|1|To find the answer to a problem or puzzle.
SONGS|1|Short musical pieces meant to be sung
SOUND|1|Something that is heard; a noise
SPAIN|1|European nation with Madrid as its capital
SPEAK|1|To say words aloud in order to convey something
SPEAR|1|A long pointed weapon meant for throwing or thrusting
SPEED|1|The rate at which something moves
SPEND|1|To pay out money on goods or services
SPICE|1|An aromatic substance used to flavor food
SPICY|1|Having a hot, pungent flavor
SPILL|1|To cause liquid to flow out of a container accidentally
SPINS|1|Turns round and round quickly
SPOIL|1|To ruin or damage something, or to indulge someone excessively.
SPOON|1|A utensil with a shallow bowl for eating or serving food
STAIN|1|A discolored mark that is hard to remove
STAND|1|To be upright on one's feet
STARE|1|To look fixedly at something for a long time
STARS|1|Distant suns that twinkle in the night sky
START|1|To begin doing or undertaking something
STAYS|1|Remains in one place
STEAK|1|A slice of meat, typically beef.
STEAM|1|Water vapour given off by boiling liquid
STEMS|1|Plant parts that support leaves and flowers
STICK|1|A thin length of wood broken from a tree
STIFF|1|Not easily bent; rigid or hard to move
STINK|1|A strong, unpleasant smell
STONE|1|A small piece of rock
STOOL|1|A simple seat without a back or armrests
STOPS|1|Brings movement or action to an end
STORM|1|Violent weather with strong winds and heavy rain
STORY|1|An account of real or imagined events told for entertainment
STOVE|1|An appliance used for cooking food
STRAP|1|A narrow band of leather or fabric used to fasten or secure something
SUGAR|1|Sweet crystalline substance used to flavor food and drinks
SUNNY|1|Characterized by bright sunlight.
SUSHI|1|A Japanese dish of vinegared rice with fish or vegetables
SWAMP|1|A low-lying wetland with soft, waterlogged ground and thick vegetation.
SWEET|1|Having the pleasant taste of sugar
SWELL|1|To increase in size or volume
SWUNG|1|Moved back and forth or in a curve, past tense
SYRUP|1|A thick, sweet liquid, often poured on pancakes
TABLE|1|Flat-topped piece of furniture supported by legs
TALKS|1|Speaks or converses with others
TAPES|1|Strips of adhesive material, or old-fashioned magnetic recordings
TASTY|1|Having an appealing, pleasant flavor.
TAXES|1|Compulsory charges a government collects on income or goods
TEDDY|1|A soft stuffed toy in the shape of a bear
TEETH|1|The hard white structures in the mouth used for biting and chewing
TENTH|1|Coming after ninth and before eleventh in a sequence.
THEFT|1|The act of stealing another's property
THIEF|1|A person who steals from others
THIGH|1|The part of the leg between the hip and the knee
THORN|1|A sharp, pointed growth on the stem of a plant.
THREE|1|The number after two.
THUMB|1|The short, thick digit on the hand.
TIDES|1|The regular rise and fall of the sea's surface, caused by the moon's gravity
TIGER|1|A large orange-and-black striped Asian cat
TILES|1|Flat pieces used to cover floors, walls, or roofs
TIRED|1|In need of rest or sleep
TOAST|1|Bread that has been browned by heat
TODAY|1|On or during this present day
TOKEN|1|A coin-like object used in place of money for games or transport
TONES|1|Sounds with a particular pitch, quality, or strength
TOOLS|1|Implements used to carry out a job, such as hammers and saws
TOOTH|1|One of the hard structures in the mouth used for chewing
TOPIC|1|The subject of a discussion or text
TOWEL|1|An absorbent cloth used for drying yourself
TOWER|1|A tall, narrow building or structure
TRAIL|1|A rough path through the countryside
TRAIN|1|A line of linked railway carriages pulled along tracks
TRAIT|1|A distinguishing quality or characteristic of a person
TRAPS|1|Devices designed to catch and hold animals
TRASH|1|Discarded material; refuse or rubbish
TREES|1|Tall woody plants with a trunk and spreading branches
TROUT|1|A freshwater fish popular with anglers
TRUCE|1|A temporary agreement to stop fighting
TRUCK|1|A large road vehicle for carrying heavy loads
TUNES|1|Melodies or songs
TUTOR|1|A private teacher who helps one student
TWINS|1|Two children born to the same mother at the same birth
TYING|1|Fastening something with a knot or securing it
TYPED|1|Entered text using a keyboard
UNCLE|1|The brother of one's mother or father
UNFIT|1|Not in suitable physical condition
UNITE|1|To join together as one
URINE|1|The liquid waste produced by the kidneys and expelled from the body.
VEGAN|1|A person who eats no meat, dairy, eggs, or other animal products
VISIT|1|To go and spend time with a person or at a place
VIVID|1|Producing powerful feelings or clear images in the mind
VODKA|1|A clear spirit often distilled from grain or potatoes
VOICE|1|The sound produced when a person speaks or sings
VOMIT|1|To expel stomach contents through the mouth
WAGON|1|Four-wheeled vehicle for hauling loads
WAIST|1|The narrow part of the body between the ribs and hips
WAITS|1|Stays in one place until something expected happens
WAKES|1|Rouses from sleep
WALKS|1|Moves along on foot, or paths for strolling
WANTS|1|Has a desire for
WARNS|1|Alerts someone in advance of a danger or problem
WATCH|1|Look at attentively for a period of time
WATER|1|The clear liquid that fills rivers and oceans
WAVED|1|Moved a hand from side to side as a greeting
WAVES|1|Moving ridges of water on the surface of the sea
WEEDS|1|Unwanted wild plants growing among garden flowers or crops
WEEKS|1|Periods of seven days each
WHEAT|1|A cereal grain used for flour.
WHEEL|1|A circular object that rotates on an axle
WHITE|1|The color of fresh snow
WINES|1|Alcoholic beverages made from fermented grapes
WINGS|1|The limbs or surfaces that birds and planes use to fly
WIRES|1|Thin strands of metal used to conduct electricity
WITCH|1|A woman believed to have magical powers, often pictured on a broomstick
WOMAN|1|An adult female person
WOODY|1|Resembling or composed of a hard fibrous plant material
WORDS|1|More than one unit of language
WORMS|1|Small legless invertebrates that burrow in soil
WRIST|1|The joint connecting the hand and forearm.
WRITE|1|To form letters or words on a surface
WRONG|1|Not in accordance with truth or fact
YACHT|1|A medium-sized sailing or motor vessel used for racing or pleasure cruising
YELLS|1|Shouts loudly
YOUNG|1|Having lived for only a short time; not old
YUMMY|1|Very pleasant to taste
ABBEY|2|A building occupied by a community of monks or nuns
ABUSE|2|Cruel or violent treatment of a person
ACIDS|2|Substances with a sour taste that react with bases
ACRES|2|Units of land area, each about 4,047 square metres
ACTED|2|Took steps to deal with a situation
ACUTE|2|Having a sharp angle.
ADAPT|2|To adjust to new conditions.
ADDED|2|Included as an extra amount
ADMIT|2|To acknowledge that something is true or that one is at fault
ADOBE|2|A sun-dried brick made of clay and straw
ADOPT|2|Take on as one's own, such as a child or an idea
AGENT|2|A person who acts on behalf of another
AGING|2|The process of becoming older.
AGNES|2|A female given name.
AGONY|2|Extreme physical or mental suffering.
AGREE|2|Share the same opinion
AHEAD|2|In or toward the front; further on
AIMED|2|Pointed a weapon toward a target
AIRED|2|Broadcast on television or radio
AISLE|2|A passageway between rows of seats or shelves
ALBUM|2|A collection of musical recordings released as one item
ALERT|2|Quick to notice and respond; watchful
ALIAS|2|A false or assumed name
ALIGN|2|To arrange in a straight line or bring into agreement
ALIKE|2|Similar to one another; in the same way
ALLOY|2|A blend formed by combining two or more metallic elements
ALONE|2|Without any other people present
ALTAR|2|A table used for religious ceremonies
AMEND|2|To make changes to something.
AMPLE|2|More than enough; plentiful
ANGEL|2|A spiritual being acting as an attendant or messenger of God
ANGER|2|A strong feeling of annoyance or displeasure
ANGLE|2|The space between two intersecting lines, measured in degrees
ANGRY|2|Feeling or showing strong displeasure
ANIME|2|A style of Japanese cartoon film and television
ANKLE|2|the joint connecting the foot and leg
ANNEX|2|An extension added onto an existing building
ANNIE|2|A common affectionate diminutive of a woman's name
ANTON|2|A common male given name.
APART|2|Separated by distance, space, or time
APPLY|2|To make a formal request, such as for a job
AREAS|2|Particular spaces or zones, more than one
ARENA|2|An enclosed venue for sports or performances
ARGUE|2|To exchange opposing views, often heatedly
ARIEL|2|A character in Shakespeare's play 'The Tempest'.
ARISE|2|To come into being or start to exist.
ARMED|2|Carrying or equipped with weapons
ASIAN|2|Relating to the world's largest continent or its peoples
ASKED|2|Posed a question or made a request, in the past.
ASSES|2|Domesticated hoofed mammals related to horses, known for stubbornness
ASSET|2|A useful or valuable thing, person, or property that is owned
ATLAS|2|A book of maps
ATOMS|2|The smallest units of a chemical element
AUDIO|2|Relating to recorded or transmitted sound
AVAIL|2|to make use of something
AVOID|2|To keep away from or prevent from happening
AWARD|2|A prize given to recognize an achievement
AWARE|2|Having knowledge or perception of something
BADGE|2|a symbol of authority or membership.
BADLY|2|In a poor or unsatisfactory manner
BANDS|2|Groups of musicians who play together
BANGS|2|Hair trimmed short and combed forward over the forehead
BANKS|2|Institutions that hold and lend money (plural)
BARGE|2|A flat-bottomed vessel used to haul cargo along canals or rivers
BARON|2|A member of the lowest rank of nobility
BASIC|2|Forming an essential foundation; elementary
BASIL|2|An aromatic herb popular in Italian and Thai cooking
BASIN|2|A shallow open bowl for holding liquid
BATCH|2|A quantity of something produced at one time
BATON|2|A stick passed between runners in a relay, or used to lead an orchestra
BEAMS|2|Horizontal structural supports in a building
BEANS|2|Edible seeds of certain leguminous plants
BEARS|2|Large furry mammals that hibernate through winter
BEATS|2|Strikes repeatedly, or defeats in a contest
BEGAN|2|Set in motion; got under way (past tense)
BEGIN|2|To set about doing something
BEING|2|Existence; a living entity.
BELLE|2|A beautiful and admired woman, especially the most attractive at an event
BERRY|2|a small, juicy fruit
BERTH|2|A fixed bunk on a ship or train
BILLS|2|Statements listing money that is owed
BIRCH|2|A tree with thin, pale, peeling bark
BIRTH|2|The emergence of a baby from its mother
BITES|2|Small pieces of food taken in one mouthful, or wounds inflicted by teeth
BLADE|2|The cutting edge of a knife or sword
BLAME|2|To hold responsible for a fault or wrong
BLANK|2|Without any marks, writing, or content
BLAST|2|A powerful explosion
BLESS|2|To invoke divine favour upon someone
BLISS|2|Perfect happiness; joy
BLOCK|2|A solid piece of hard material with flat sides
BLOGS|2|Frequently updated personal websites with dated entries
BLOKE|2|A man, often used informally.
BLOND|2|Having light-colored hair.
BLOWS|2|To move air with force.
BLUSH|2|To become red in the face.
BOAST|2|To speak with excessive pride about oneself or one's achievements
BOLTS|2|Threaded metal fasteners used together with nuts
BOMBS|2|Explosive devices designed to detonate on impact or by timer
BONDS|2|Close connections or ties between people
BONUS|2|An extra payment or benefit beyond what is expected
BOOST|2|An increase, push, or helpful lift
BOOTH|2|A small enclosed compartment, as for voting or phoning
BOWIE|2|A famous British musician known for his unique style.
BOXER|2|An athlete who fights with fists in a ring
BRACE|2|To prepare oneself for something difficult or unpleasant
BRAIN|2|The organ within the skull that controls thought and movement
BRAND|2|A maker's trademark identifying a product
BRAWL|2|a rough, disorderly fight among a group of people
BRIBE|2|Money or a gift offered to influence someone dishonestly
BRIEF|2|Lasting only a short time
BRING|2|To carry or convey something toward a place
BRINK|2|The edge or verge of a steep place, or the point just before something happens
BROAD|2|Large in extent from side to side
BRUSH|2|A bristled tool used for painting or grooming
BUCKS|2|Informal word for dollars
BUILT|2|Put together from parts or materials (past tense)
BULBS|2|Round underground storage organs of plants.
BULLS|2|Male cattle.
BUMPS|2|Small raised areas on a surface.
BUNCH|2|A number of things grouped or growing together
BURNS|2|Is on fire, or injures the skin with heat
BURNT|2|Damaged by fire or heat.
BURST|2|To break open or apart suddenly and violently
BUTTS|2|the targets set up at the end of an archery or shooting range
BUYER|2|A person who purchases goods.
CABIN|2|A small wooden shelter, or the seating area of an aircraft
CABLE|2|A thick rope of wire, or a bundle of insulated electrical wires
CACHE|2|A hidden store of things, or a temporary storage area for data
CALLS|2|Telephones or cries out to someone, in the present
CAMEO|2|A brief appearance by a famous performer in a film or show
CAMPS|2|Temporary outdoor lodging sites with tents
CANAL|2|Artificial waterway dug for boats or irrigation
CARDS|2|Stiff rectangular pieces of paper used in games or greetings
CARED|2|Felt concern for, or looked after
CARES|2|Feels concern for, or looks after, someone
CARGO|2|Goods carried by a ship, plane, or truck
CAROL|2|A song sung during the holiday season.
CARRY|2|To hold and move something from one place to another
CASES|2|Particular instances or situations under study
CASTS|2|To throw or direct something.
CATCH|2|To seize or capture something in motion
CATER|2|To provide food and service for an event.
CATHY|2|A common female given name.
CAUSE|2|The motive or grounds behind an action
CEDAR|2|An evergreen coniferous tree known for its fragrant wood
CENTS|2|Small coins each worth a hundredth of a dollar
CHAMP|2|Informal name for a title-holder in a competition
CHAOS|2|Complete disorder and confusion
CHARM|2|The power to delight or attract people
CHART|2|A diagram displaying data or information
CHECK|2|To examine something for accuracy or condition.
CHEER|2|To shout in joy or to encourage.
CHEST|2|The front part of the body between neck and stomach
CHICK|2|A young bird, especially of the domestic fowl
CHIEF|2|The head of a tribe or organization
CHILL|2|To make cold, as a drink in the fridge
CHIPS|2|Fried strips or thin slices of potato
CHOKE|2|To struggle to breathe because of a blocked throat
CHORD|2|A group of musical notes sounded together
CHOSE|2|Picked out from several alternatives, in the past
CIGAR|2|A rolled bundle of tobacco.
CLAMP|2|A tool that grips and holds objects firmly in place
CLAWS|2|Sharp, pointed nails of animals.
CLERK|2|A person who handles administrative tasks.
CLIFF|2|A steep rock face, especially at the edge of the sea
CLIMB|2|Ascend, especially using the hands and feet
CLING|2|To hold on tightly or stick closely to
CLIPS|2|Fasteners used to hold things together.
CLOAK|2|A type of outer garment.
CLOTH|2|Fabric material.
CLUBS|2|Associations of people with shared interests
CLUES|2|Hints that help solve a puzzle or mystery
COACH|2|A person who trains an athlete or sports team
COAST|2|The land bordering the edge of the sea
COBRA|2|A venomous hooded snake native to Asia and Africa
COCKS|2|Adult male chickens
CODED|2|Written in a secret or disguised form
CODES|2|Systems of symbols used for secret or compact communication
COLOR|2|A visual property such as red, blue, or green
COLTS|2|Young male horses.
COMBO|2|Fast-food deal that bundles a burger, fries, and a drink together
COMES|2|Moves toward or arrives at a place
COMET|2|An icy space object that develops a glowing tail near the sun
COMIC|2|Causing laughter; humorous
CONDO|2|A privately owned unit within a larger residential building
CORAL|2|A hard skeletal deposit produced by marine polyps, forming reefs.
COURT|2|A place where legal cases are heard and decided
COVER|2|To place something over in order to protect or conceal
CRACK|2|A narrow break, split, or fissure in a surface
CRANE|2|A tall machine with a pulley used to hoist heavy loads
CRANK|2|To turn a handle to operate a machine.
CRAVE|2|To want something very badly
CREED|2|A set of beliefs or guiding principles
CREEK|2|A small, narrow stream of water
CREST|2|The top of a hill, wave, or helmet
CREWS|2|Groups of people working together on a ship or project
CRIED|2|Shed tears, in the past
CRIME|2|An act forbidden and punishable by law
CROPS|2|Plants grown by farmers for gathering
CROSS|2|To move from one side of something to the other
CROWS|2|Large black birds known for their harsh call
CRUDE|2|In a raw or unrefined state.
CRUEL|2|Willfully causing pain or suffering to others
CRUSH|2|To press or squeeze with force until broken or deformed
CUBAN|2|Relating to the Caribbean island nation whose capital is Havana.
CUBIC|2|Relating to the measurement of volume in three dimensions
CURED|2|Restored to health after an illness.
CURRY|2|A dish of meat or vegetables cooked in a spicy sauce.
CURSE|2|A profane word, or a spell invoked to bring misfortune
CURVE|2|A smoothly bending line or arc
DAIRY|2|A place where milk is processed into butter and cheese
DAISY|2|A common flower with white petals around a yellow center
DARED|2|Had the courage to do something risky
DATES|2|Particular days marked on a calendar
DEALS|2|Business agreements or favorable bargains
DEALT|2|Distributed cards to the players
DEATH|2|The permanent end of life
DEBIT|2|A record of money taken out of an account
DECAY|2|The gradual decline into a worse or disintegrated state
DECKS|2|Flat surfaces for walking or standing.
DECOR|2|The furnishing and ornamental style of an interior space
DELAY|2|A period of waiting before something proceeds
DELHI|2|Capital territory of India, on the Yamuna river
DELTA|2|The fourth letter of the Greek alphabet
DENIM|2|A sturdy cotton twill fabric used for jeans
DEPOT|2|A building used for storing goods or housing vehicles, often near a railway.
DEPTH|2|The measurement from top to bottom or front to back
DETER|2|To discourage someone from an action through fear of consequences
DEVIL|2|An evil spirit, or the supreme power of wickedness
DIRTY|2|Filthy
DISCO|2|A genre of dance music popular in the 1970s
DISCS|2|Flat, circular objects used for storage or games.
DITCH|2|To abandon or get rid of something
DODGE|2|To avoid by moving quickly aside
DOING|2|Carrying out or performing an action
DOSES|2|Specific measured quantities of a medicine to be taken
DOUBT|2|A feeling of being unsure or unconvinced
DOVER|2|A town in England known for its white cliffs.
DOWNS|2|Rolling grassy hills, especially in southern England
DRAFT|2|A preliminary version of a written work
DRAIN|2|To cause liquid to flow away and empty out
DRAMA|2|A serious play, or an emotionally charged situation
DRAWS|2|Makes a picture with a pencil or pen; also pulls along
DREAD|2|Great fear or apprehension about something that may happen
DREAM|2|A series of images and feelings experienced during sleep
DRIFT|2|To move slowly, carried along by wind or water
DROPS|2|Small rounded portions of a liquid
DROVE|2|Operated a motor vehicle (past tense)
DRUGS|2|Medicinal or narcotic substances
DUMMY|2|A model of a human body, often used for display or testing
DUTCH|2|Relating to the Netherlands or its people
DYING|2|Nearing the end of life
EARLY|2|Happening before the usual or expected time
EARNS|2|To receive payment for work.
EATEN|2|Having been consumed as food
EDGES|2|The outer borders or rims of things
EDITH|2|A common female given name.
ELDER|2|A senior or respected older member of a community
ELECT|2|To choose by voting.
ENDED|2|Brought or came to a finish
ENTRY|2|A point of access, or an item recorded in a list
EQUAL|2|The same in amount, value, or status
ERECT|2|To build or put up a structure
ERROR|2|A flaw or inaccuracy in something
ESSAY|2|A short piece of writing on a particular subject
EUROS|2|The banknotes and coins used as currency across much of the EU
EVERY|2|Each one without exception.
EXACT|2|Precise and accurate in every detail
EXCEL|2|Surpass
EXILE|2|Enforced removal from one's native country
EXIST|2|To have actual being; to be real
EXTRA|2|More than is usual, expected, or necessary
FACED|2|Confronted or dealt with something difficult
FACTS|2|Items of information known to be true
FADED|2|Having lost brightness, color, or strength over time
FAILS|2|Is unsuccessful in achieving a desired goal
FAINT|2|Barely perceptible or lacking strength and clarity
FAITH|2|Complete trust or confidence in someone or something
FALSE|2|Not in accordance with fact or truth
FANCY|2|Elaborate or decorative rather than plain
FARES|2|Charges for transportation.
FAULT|2|A flaw or imperfection
FAUNA|2|The animals of a particular region or time period
FAVOR|2|A helpful act done for someone out of goodwill
FEARS|2|Feelings of dread about possible danger (plural)
FEELS|2|Experiences a particular emotion or sensation
FELLA|2|Informal word for a man or boyfriend
FERRY|2|A boat that carries people across water.
FETCH|2|Go and bring something back
FEVER|2|An abnormally high body temperature
FIBER|2|A thin thread or filament, or roughage in one's diet
FIBRE|2|A thread-like strand, or dietary roughage
FIFTH|2|Next in order right after the fourth
FILED|2|Submitted a document officially
FILES|2|Folders holding documents or computer data
FILMS|2|Motion pictures shown in cinemas
FINAL|2|Coming at the end of a series
FINCH|2|A small songbird.
FINDS|2|Discovers or locates something
FINED|2|Made to pay a monetary penalty
FINES|2|Sums of money ordered to be paid as punishment
FIRED|2|Dismissed from a job
FIRES|2|Instances of burning that give off heat and flame (plural)
FIRMS|2|Business companies, especially professional partnerships
FIXED|2|Firmly secured in place and not moving
FIXES|2|To repair or mend something.
FLAIR|2|talent
FLAME|2|The glowing, flickering part of a burning fire
FLANK|2|The side of something, especially a body or a military formation
FLARE|2|A sudden burst of bright flame or light, or a signal device that produces one
FLATS|2|Apartments occupying part of a single building
FLAWS|2|Imperfections or defects in something
FLEET|2|A group of ships or vehicles under one control
FLESH|2|The soft tissue of the body between skin and bone
FLICK|2|To move something with a quick, light movement
FLIES|2|Buzzing insects, or moves swiftly through the air
FLINT|2|A hard gray stone that sparks when struck against steel
FLIRT|2|To behave playfully in a romantic or teasing way
FLORA|2|The plant life of a particular region or period
FLOWN|2|Having traveled through the air, especially by aircraft.
FLOWS|2|Moves steadily and continuously, as a river does
FLUID|2|A substance, liquid or gas, that flows freely
FLUSH|2|To cleanse by a rapid flow of water
FLUTE|2|A high-pitched woodwind instrument played by blowing across a hole
FLYER|2|A printed advertisement.
FOLKS|2|People in general, often of a family or community
FOOLS|2|Simpletons
FORCE|2|Physical power or strength exerted on something
FORGE|2|To shape metal by heating and hammering it
FORMS|2|Printed documents with blank spaces to fill in
FORUM|2|A medium or venue for open public discussion
FRAME|2|A rigid surround that holds and supports a picture
FRAUD|2|Deliberate deception carried out for unfair gain
FREED|2|Released from captivity or restriction
FRESH|2|Newly made or obtained; not stale
FRIED|2|Cooked in hot oil or fat
FRONT|2|The most forward part or surface of something
FULLY|2|To the greatest possible extent
FUNDS|2|A sum of money set aside for a purpose
FUNKY|2|Having a strong, rhythmic style, often used to describe music
FUNNY|2|Causing laughter or light-hearted enjoyment
FUZZY|2|Covered with fine, soft, indistinct texture; blurred
GAINS|2|Increases in amount, value, or advantage
GAMES|2|Competitive activities played according to rules
GAMMA|2|The third letter of the Greek alphabet
GASES|2|Substances that expand to fill their container, unlike liquids or solids
GATES|2|Hinged barriers that close openings in walls or fences
GEARS|2|Toothed wheels that transmit motion in a machine
GENES|2|Units of heredity passed from parents to offspring
GENRE|2|A category of artistic work marked by a particular style
GHANA|2|West African country whose capital is Accra
GIFTS|2|Things given freely without expecting payment
GIVES|2|Hands something over to another, freely and without payment
GLENN|2|A common male given name.
GLORY|2|Great honour and renown won through notable achievements
GLOSS|2|A shiny smoothness on a surface
GOALS|2|Aims or desired results one works toward
GOING|2|Moving from one place to another.
GOODS|2|Merchandise or wares offered for sale
GOOFY|2|Silly or foolish.
GRABS|2|Seizes suddenly and forcibly
GRAIN|2|A single small seed of a cereal like wheat or rice
GRAMS|2|Small units of mass in the metric system, often used for food
GRAND|2|Impressive in size or appearance; magnificent
GRANT|2|To formally give or allow something requested
GRAPH|2|Diagram showing the relation between variables
GRASP|2|To seize or hold firmly.
GREAT|2|Of an extent, amount, or intensity considerably above the normal.
GREED|2|An excessive desire for wealth or possessions
GREEK|2|Relating to the country of Athens and its ancient culture
GRIEF|2|Deep sorrow, especially following a loss
GRIND|2|To crush into small particles by friction
GRIPS|2|Holds something firmly
GROOM|2|A man about to be or newly married
GROWN|2|Having reached full size or maturity
GUARD|2|A person who keeps watch or defends a place
GUESS|2|To form an opinion without certain knowledge
GUILD|2|An association of craftsmen or merchants
GUILT|2|A troubled feeling of having done wrong
HABIT|2|A settled, regular tendency that is hard to give up
HACKS|2|Clever shortcuts or tricks used to solve a problem
HARDY|2|Capable of enduring difficult conditions
HARSH|2|Unpleasantly rough, severe, or cruel
HATED|2|Felt an intense dislike or loathing toward
HATES|2|Feels intense dislike or hostility toward
HAUNT|2|To visit frequently.
HAVEN|2|A place of safety or shelter
HAVOC|2|Widespread destruction or disorder
HAZEL|2|A tree or shrub known for its nuts.
HEADS|2|The side of a coin opposite tails
HEARS|2|Becomes aware of a sound or piece of news
HEATH|2|Open, uncultivated land covered with wild shrubs and gorse
HEELS|2|The rounded back parts of the feet
HEIRS|2|People legally entitled to inherit property or a title
HIDES|2|Puts out of sight to avoid detection
HILLS|2|Natural rises of land, lower than mountains
HINDU|2|Relating to a major religion originating in India
HIRED|2|Engaged someone for paid work
HIRES|2|Employs someone for wages or engages a service temporarily
HOLDS|2|Grasps and keeps in the hand
HOLES|2|Hollow openings or gaps in a surface
HOLLY|2|An evergreen shrub with spiky leaves and red berries, linked to Christmas.
HONOR|2|High respect or great esteem
HOOPS|2|Circular rings, as used in basketball or worn as earrings
HOPED|2|Wished for something with expectation, in the past
HORNS|2|Hard pointed growths on the heads of cattle or goats
HOUSE|2|A building for living in
HUMAN|2|A member of our own species
HUMOR|2|The quality of being amusing or comic
HURRY|2|To move or act with great haste
HURTS|2|Causes physical or emotional pain
HYPED|2|Excited or enthusiastic.
HYPER|2|Extremely energetic or overexcited
IDEAS|2|Concepts or plans formed in the mind
IDOLS|2|Objects of worship, or people who are greatly admired
IMAGE|2|A visual representation of a person or thing
IMPLY|2|To suggest something without stating it directly
INDEX|2|Alphabetical guide at the back of a book
INLET|2|A narrow strip of water extending from a sea or lake into the land
INNER|2|Located on the inside or closer to the center
IRAQI|2|Relating to the Middle Eastern country whose capital is Baghdad
IRISH|2|Relating to the people or culture of a certain Atlantic island nation
ISAAC|2|Biblical son of Abraham and Sarah
ISLES|2|Small land masses surrounded by water.
ISSUE|2|An important topic or problem up for debate
ITEMS|2|Individual articles or units in a list or collection
IVORY|2|The hard white material from elephant tusks
JAPAN|2|Island nation often called the Land of the Rising Sun
JOHNS|2|Slang term for toilets, in plural form
JOINS|2|To connect or unite.
JOINT|2|Place where two bones meet
JOKER|2|A playing card that can represent any other card, often depicting a jester
JONAH|2|Old Testament prophet who spent three days inside a great fish.
KAPPA|2|Tenth letter of the Greek alphabet, symbol κ
KARMA|2|The idea that one's actions determine future fortune
KEEPS|2|Holds on to or continues to possess
KENYA|2|East African country whose capital is Nairobi
KERRY|2|An Irish county known for its rugged coastline and lakes
KICKS|2|Strikes something forcefully with the foot
KILLS|2|Deprives of life
KINDS|2|Different sorts, types, or varieties of things
KITTY|2|A young cat.
KNEES|2|The joints connecting the thighs to the lower legs
KNOCK|2|To strike a surface to attract attention
KNOTS|2|Tangled loops formed by tying rope or string together.
KNOWN|2|Recognized or established as fact by many
KNOWS|2|Is certain of as a fact (third person singular)
KUDOS|2|Praise or credit for an achievement
LABOR|2|Hard physical or mental work
LACKS|2|Is without something needed or wanted
LADEN|2|Heavily loaded or weighed down with something
LAGOS|2|Nigeria's largest city and former capital
LANCE|2|A long wooden spear once carried by knights on horseback
LANDS|2|Touches down after a flight
LANES|2|Narrow roads or paths.
LAPSE|2|A brief, temporary failure of memory, judgment, or standards
LARGE|2|Of considerable size or extent
LASTS|2|Continues to exist or function over time
LATER|2|At a time after the present
LATIN|2|The ancient language of Rome
LAUGH|2|Make sounds and movements expressing amusement
LAURA|2|A common female given name
LAYER|2|A single thickness of material spread over a surface
LEAKS|2|Escapes through a crack or hole, as liquid or gas does
LEASE|2|A contract renting property for a set period
LEAST|2|Smallest in amount, extent, or degree
LEGAL|2|Permitted or recognized by law
LEGIT|2|Conforming to the rules; valid.
LEVEL|2|A flat, even surface with no high or low spots
LIKED|2|Regarded with fondness or approval
LIKES|2|Finds agreeable or pleasant
LIMIT|2|The greatest amount or extent that is allowed
LINEN|2|Fabric made from the flax plant.
LINER|2|A large passenger ship that travels a regular route
LINES|2|Long thin marks drawn on a surface
LINKS|2|Connections between two or more things
LINUX|2|An open-source operating system.
LISTS|2|Series of items written one after another
LIVED|2|Resided in a place at some point
LIVER|2|The large internal organ that filters blood and makes bile
LOADS|2|Heavy burdens carried or supported
LOANS|2|Sums of money that are borrowed and must be repaid
LOBBY|2|An entrance hall or waiting area.
LOCAL|2|Relating to a particular nearby area or neighborhood
LOCKE|2|English philosopher known for ideas on natural rights and empiricism.
LODGE|2|A small house or cabin, often on an estate or in the countryside
LOGAN|2|A common given name for boys.
LOGOS|2|Distinctive symbols or emblems used to identify a brand.
LOOKS|2|Directs the eyes in order to see
LOOPS|2|Curved shapes that bend around and cross over themselves
LOOSE|2|Not firmly fixed in place; slack
LORDS|2|Men of noble rank or high office
LOSER|2|A person who is unsuccessful.
LOTUS|2|An aquatic flowering plant symbolizing purity in many cultures
LOVED|2|Felt deep affection or fondness for
LOVER|2|A person in a romantic relationship with another
LOVES|2|Feels deep affection or strong liking for
LOWER|2|To let something down to a smaller height
LOYAL|2|Steadfastly devoted to a person or cause
LUNGS|2|Organs used for breathing.
LYING|2|Resting flat, or telling deliberate untruths
LYRIC|2|A single line or verse from the words of a song.
MADAM|2|A polite term of address for a woman.
MAFIA|2|An organized crime syndicate, especially one of Italian origin
MAGIC|2|The art of producing illusions or supernatural effects
MAINS|2|Primary pipes or cables supplying gas, water, or electricity to a building
MAJOR|2|Greater in importance, size, or rank.
MAKER|2|One who creates or manufactures something
MANGA|2|Japanese comic books or graphic novels.
MANOR|2|A large house with land, historically owned by a lord
MARCH|2|The third month of the year
MARRY|2|To join together as husband and wife
MASON|2|A worker skilled in building with stone or brick
MATCH|2|A sporting contest between two sides
MATES|2|Friends or companions.
MATTE|2|Having a dull, non-shiny surface finish.
MAYBE|2|Possibly, but not certainly
MAYOR|2|The elected head of a town or city council
MEDAL|2|A metal disc given as an award for an achievement
MEDIA|2|Channels of mass communication, taken collectively
MEETS|2|Comes together with someone at a particular place or time
MEMES|2|Humorous images or ideas that spread rapidly online
MERCY|2|Compassion shown toward an offender or enemy
METER|2|A metric unit of length just over three feet
METRO|2|An urban underground railway system
MIDST|2|The middle part or central point of something
MILES|2|Units of distance, each equal to 1,760 yards
MIMIC|2|To copy someone's speech or actions, often for comic effect
MINES|2|Underground excavations from which ore or coal is dug
MINOR|2|Of little importance or seriousness
MIXED|2|Blended together and not uniform
MIXER|2|A machine or appliance used to blend ingredients
MIXES|2|Combines different things together thoroughly.
MODEL|2|A small-scale representation of an object
MODES|2|Ways or manners of doing something
MONEY|2|A medium of exchange used to buy goods and services
MONKS|2|Men who have devoted their lives to religious duties, often living in an abbey
MOODY|2|Given to sudden, unpredictable shifts in temper
MOTEL|2|A roadside hotel.
MOTOR|2|A machine that supplies power to drive a vehicle
MOTTO|2|A short sentence or phrase expressing a guiding principle
MOULD|2|Fungal growth that forms on damp or decaying matter
MOUND|2|A raised area of earth or soil.
MOVES|2|Changes position; also a dancer's steps
MUDDY|2|Covered with or full of mud.
MUMMY|2|A preserved body from ancient Egypt.
MYTHS|2|Legends
NAIVE|2|Showing a lack of experience, wisdom, or judgment
NAMED|2|Gave a particular title or designation to
NAMES|2|Words by which people or things are known
NANNY|2|A person employed to care for children.
NASAL|2|Relating to or affecting the nose
NASTY|2|Highly unpleasant, spiteful, or offensive
NAVAL|2|Relating to a country's warships and fleet
NAZIS|2|Members of the fascist party that ruled Germany under Hitler
NEEDS|2|Requires something as essential
NERVE|2|Fiber that carries impulses between the brain and body
NEVER|2|Not at any time.
NEWER|2|More recently made or created, compared to another
NEWLY|2|Only just; not long ago.
NINJA|2|A highly trained covert operative from feudal Japan
NOBLE|2|Having high moral qualities or fine ideals
NODES|2|Points where lines, paths, or connections intersect
NORMS|2|Standard or accepted patterns of behavior within a group
NORTH|2|The direction toward the top of most maps
NOTCH|2|A V-shaped cut or indentation in an edge or surface
NOTES|2|Brief written records, or single musical tones
NOVEL|2|A long written work of fiction
OASIS|2|A fertile spot in a desert where water is found.
OBESE|2|Having excessive body fat
OCCUR|2|To happen or take place
ODDLY|2|In a strange or unusual manner.
OFFER|2|To present something for acceptance or refusal
OFTEN|2|On many occasions; again and again
OLDER|2|Greater in age than someone or something else
OLIVE|2|A small oval fruit pressed for its oil
OMEGA|2|The last letter of the Greek alphabet
ONSET|2|The beginning or start of something, especially something unpleasant
OPENS|2|Unfastens or makes accessible
OPERA|2|A dramatic work in which the words are sung to music
OPIUM|2|an addictive drug derived from poppy sap
OPTED|2|Made a choice in favor of something
ORDER|2|A direction or command given by someone in authority
ORGAN|2|A body part with a specific function, such as the heart
OTHER|2|Different from or not the one already mentioned
OUNCE|2|A unit of weight equal to one sixteenth of a pound
OUTER|2|Situated on the outside; furthest from the center
OWING|2|Still to be paid; due as a debt.
OWNED|2|Held legal possession of something
OWNER|2|Person who holds legal title to a piece of property
PACED|2|Moved at a steady speed.
PACKS|2|Groups of wild animals, such as wolves, that hunt together
PADDY|2|A flooded field used for growing rice
PAGES|2|Sheets of a book, each side numbered
PAIRS|2|Sets of two matching things
PARTS|2|Separate components that make up a whole
PASTE|2|A soft, moist, sticky mixture
PATCH|2|A small piece of material used to cover a hole
PATHS|2|Routes or ways to follow.
PATTY|2|A small flat cake of ground meat or vegetables.
PAUSE|2|To temporarily stop.
PAVED|2|Covered with a hard, smooth surface for walking or driving
PEERS|2|Individuals of similar status or age.
PENCE|2|British coins worth one hundredth of a pound
PENIS|2|The male organ of reproduction and urination
PERKS|2|Extra benefits given with a job besides salary
PHASE|2|A distinct stage in a process or cycle
PICKS|2|Selects or chooses from a group
PIERS|2|Structures built out over water, used for docking boats or strolling
PILES|2|A collection of things stacked together.
PINCH|2|A small amount of something, especially a seasoning, taken between finger and thumb
PITCH|2|Throw of a ball toward the batter
PIVOT|2|The central point on which a mechanism turns
PIXEL|2|The smallest single point of color in a digital image
PLACE|2|A position or location
PLANS|2|Detailed proposals for achieving something
PLANT|2|A living organism that grows in soil and makes its own food
PLAYS|2|Takes part in a game, or performs on an instrument
PLEAS|2|Urgent and emotional requests for something
POEMS|2|Pieces of writing arranged in rhythmic lines
POINT|2|A sharp tip, or a single item on a list
POKER|2|A card game often played for money.
POLAR|2|Relating to the very cold regions at the top and bottom of the Earth
POLES|2|Long, slender rods often used for support or skiing
POLLS|2|Surveys sampling public opinion
POPPY|2|A flowering plant often associated with remembrance.
PORTS|2|Coastal towns where ships load and unload
POSED|2|Presented in a particular stance, especially for a picture
POSES|2|Presents or creates, as with a problem or question
POSTS|2|Upright stakes driven into the ground
POWER|2|The ability to act, or the energy that runs machines
PRESS|2|To push firmly against a surface
PRICE|2|The amount of money required to buy something.
PRICK|2|To pierce or make a small hole.
PRIDE|2|A feeling of deep satisfaction in one's achievements
PRIME|2|Of the first importance or best quality
PRINT|2|To produce text or images on paper using a machine
PRIVY|2|Having secret or confidential knowledge of something
PROMO|2|A short advertisement used to publicize a product or event
PRONE|2|Lying flat, face downward
PROOF|2|Evidence that establishes the truth of something
PROPS|2|Objects used by actors on a stage or film set
PROSE|2|Ordinary written or spoken language, as opposed to verse
PROUD|2|Feeling deep satisfaction in one's own achievements
PROVE|2|To demonstrate the truth of something with evidence
PSYCH|2|To mentally prepare oneself for something difficult or intimidating (informal).
PULLS|2|To exert force to move something towards oneself.
PULSE|2|The rhythmic beat of the arteries as the heart pumps blood
PUMPS|2|Low, slip-on shoes with a low heel
PUNCH|2|A blow delivered with a closed fist
PURGE|2|Remove unwanted elements
QUEER|2|Strange or odd in character
QUERY|2|A question, especially one expressing doubt
QUEST|2|A long and determined search for something
QUICK|2|Moving or done with speed
QUOTA|2|A fixed minimum or maximum amount allowed or required
QUOTE|2|Repeat words taken from a text or speaker
QURAN|2|The central religious text of Islam
RABBI|2|A Jewish scholar or religious leader
RACED|2|competed in speed.
RACES|2|Contests to determine who is fastest
RADAR|2|A system that uses radio waves to detect the position of distant objects
RADIO|2|A device for receiving broadcast sound transmissions
RAIDS|2|Sudden attacks or surprise incursions
RAILS|2|Parallel metal bars that guide a train
RALLY|2|A mass meeting held in support of a cause
RANCH|2|A large farm for raising livestock.
RANGE|2|The extent or scope between two limits
RAPID|2|Happening or moving with great speed
RAVEN|2|A large, glossy black bird known for its intelligence
RAZOR|2|A sharp-edged tool used for shaving hair
REACH|2|To stretch out so as to touch or grasp
REACT|2|To behave in a particular way in response to something
READS|2|Looks at and understands written words
READY|2|In a fit state for action or use
REBEL|2|One who rises against established authority
REFER|2|To mention or allude to something
REHAB|2|A program to recover from addiction or injury
RELAY|2|A race in which team members take turns covering part of the distance
RENEW|2|To extend or reactivate something for a further period
RENTS|2|Payments made periodically for the use of property.
REPAY|2|To give back money that was previously borrowed.
REPLY|2|To respond to a message or question
RETRO|2|Imitating a style or fashion from the recent past
RHYME|2|Correspondence of sound between words.
RIDES|2|Journeys on a vehicle or animal; also fairground attractions
RIDGE|2|A long, narrow crest of a hill or mountain
RIFLE|2|A long-barrelled firearm fired from the shoulder
RIGID|2|Not able to bend or be forced out of shape; stiff
RINGS|2|Circular bands of metal worn on the fingers
RIOTS|2|Violent public disturbances involving crowds of people.
RISEN|2|Having moved upward or increased
RISES|2|Moves upward or gets to one's feet
RIVAL|2|A competitor striving to outdo another
ROBIN|2|A small songbird known for its red or orange breast
ROCKS|2|Large stones or masses of mineral
ROCKY|2|Full of stones or boulders
RODEO|2|A competitive event featuring bronco riding and roping
ROGUE|2|A dishonest or unprincipled person; a scoundrel
ROLES|2|The parts actors play in a film or stage production
ROLLS|2|Moves along by turning over and over
ROMAN|2|Relating to ancient Rome or its empire
ROOFS|2|The upper covering of a building.
ROSES|2|A type of flowering plant often associated with love.
ROUGE|2|A red cosmetic powder applied to the cheeks
ROUTE|2|The course taken to get from one place to another
RUGBY|2|Team sport played with an oval ball and scrums
RUINS|2|Remains of something destroyed or decayed.
RULES|2|Official regulations that govern conduct or play
RUMOR|2|Unverified information spread from person to person
RURAL|2|Relating to the countryside rather than the city
SACKS|2|large bags.
SADLY|2|In a manner full of sorrow; regrettably
SAINT|2|A holy person formally recognized by the church
SALES|2|Exchanges of goods or services for money
SANDY|2|Covered with or full of fine beach grains
SAVES|2|Rescues from harm, or sets money aside for later
SCANS|2|Examines something quickly and systematically
SCARE|2|To cause sudden fear in someone
SCENE|2|A single section of a play or film
SCOOP|2|A shovel-shaped utensil used for serving food
SCOPE|2|The extent or range of a subject or activity
SCORE|2|The number of points earned in a game
SCOTS|2|The people native to the northern nation famous for kilts and bagpipes
SCOUT|2|To explore an area to gather information.
SCREW|2|A threaded metal pin used to join materials
SEARS|2|Burns the surface of quickly with high heat
SEDAN|2|A type of car with a separate trunk.
SEEKS|2|Looks for or tries to obtain
SEEMS|2|Gives the impression of being
SEIZE|2|To grab suddenly and forcibly
SELLS|2|Exchanges goods for money
SENDS|2|Causes to go or be delivered to a destination
SENSE|2|A faculty such as sight, smell, or hearing
SEOUL|2|Capital city of South Korea
SERVE|2|To provide food or assistance to others
SETUP|2|The way equipment or things are arranged
SEWER|2|An underground pipe or channel that carries away wastewater
SHAFT|2|A long vertical or sloped passage inside a building or mine
SHAKE|2|To move quickly back and forth or up and down
SHARE|2|To divide something and give portions to others
SHELL|2|The hard protective outer covering of an egg, nut, or sea creature
SHINE|2|To give out or reflect bright light
SHIRE|2|A British county, or a large breed of draft horse
SHOCK|2|A sudden upsetting or surprising event
SHOOK|2|Trembled or moved rapidly back and forth (past tense)
SHOOT|2|To launch a projectile from a weapon
SHOPS|2|Retail establishments where goods are sold
SHORE|2|The strip of land along the edge of a sea or lake
SHOTS|2|Attempts to score, or small measures of strong drink
SHOUT|2|To call out loudly with the voice
SHOWS|2|Theatrical or televised performances.
SIDED|2|Took a position in support of one party in a dispute
SIDES|2|The left and right edges or surfaces of an object
SIGHT|2|The faculty or power of seeing
SIGNS|2|Boards displaying information or directions
SILLY|2|Lacking good sense; absurd or ridiculous
SINAI|2|A peninsula in Egypt linking the continents of Africa and Asia.
SINKS|2|Goes down below the surface, as a ship might
SITES|2|Places where buildings stand or events take place
SIXTH|2|Coming after fifth in a sequence
SIZES|2|Measurements indicating how big or small things are
SKINS|2|Outer coverings of fruits or animals
SKULL|2|The bony framework enclosing the brain
SLACK|2|Not tight or taut; loose
SLAMS|2|Shuts something forcefully and loudly
SLANG|2|Informal language often used in specific groups.
SLASH|2|To cut with a sweeping stroke of a blade
SLAVE|2|A person owned by another and forced to work without pay
SLEEP|2|Natural state of rest with reduced consciousness
SLEPT|2|Rested in unconsciousness, as through the night
SLICE|2|To cut into thin pieces.
SLICK|2|Smooth, glossy, and often cleverly skillful
SLIDE|2|To move smoothly along a surface
SLIPS|2|To slide unintentionally.
SLOTS|2|Narrow openings for inserting something, such as coins
SMACK|2|A sharp slap delivered with the palm of the hand
SMART|2|Showing quick intelligence
SMASH|2|To break something violently into pieces
SMEAR|2|To spread a soft, sticky, or greasy substance across a surface
SNAPS|2|Breaks suddenly with a sharp cracking sound
SNOWY|2|Covered with frozen white flakes falling from the sky
SOILS|2|The upper layer of earth.
SOLAR|2|Relating to or powered by the sun
SOLID|2|Firm and stable in form; neither liquid nor gas
SORRY|2|Feeling regret or remorse over something
SORTS|2|Arranges items into groups or categories
SOULS|2|The spiritual parts of people, said to outlast the body
SOUTH|2|The direction opposite to north
SPACE|2|The boundless region beyond Earth's atmosphere.
SPANS|2|Extends across or covers a distance or period of time
SPARE|2|Kept in reserve for future use
SPECS|2|Detailed technical requirements for a product, or an informal word for eyeglasses
SPELL|2|An incantation believed to have magical power
SPERM|2|The male reproductive cell in animals
SPIES|2|People who secretly gather information for a government
SPIKE|2|A sharp pointed object, or a sudden sharp increase
SPINE|2|The column of bones running down the back
SPLIT|2|Break or separate into parts
SPOKE|2|Uttered words aloud, in the past
SPORT|2|A competitive physical activity governed by rules
SPOTS|2|Small round marks differing in color from their surroundings
SPRAY|2|A fine mist of liquid droplets driven through the air
SQUAD|2|A small group organized for sport or military action
SQUAT|2|To lower the body by bending the knees while keeping the back straight.
STACK|2|A pile of objects.
STAFF|2|The people employed by an organization
STAGE|2|A raised platform for performances, or a phase in a process
STAKE|2|A pointed post driven into the ground as a support or marker
STALL|2|To delay or put off deliberately
STAMP|2|A small adhesive label showing postage has been paid
STASH|2|A hidden supply of something, or to hide it away
STATE|2|A condition or situation.
STEAL|2|To take something without permission or right
STEEL|2|Strong alloy of iron and carbon
STEEP|2|Having a sharp incline.
STEER|2|To guide the direction of a vehicle or vessel
STEPS|2|A flight of stairs, or actions taken in sequence
STERN|2|Strict, serious, and uncompromising in manner
STILL|2|Up to and including the present time.
STING|2|To cause a sharp, burning pain
STOKE|2|To feed and stir up a fire
STOLE|2|Took something without permission
STOOD|2|Was upright on one's feet (past tense)
STORE|2|A place where goods are sold to the public
STOUT|2|Solidly built and thickset in body.
STRAW|2|Dried stalks of grain.
STRAY|2|Having wandered away from home or the right path
STUCK|2|Unable to move or be moved from a position
STUDY|2|To learn about a subject by reading and thinking
STUFF|2|Unspecified material, objects, or belongings
STUMP|2|The base of a tree trunk left standing after the rest is cut down
STUNT|2|A dangerous feat performed to impress or entertain
STYLE|2|A distinctive manner of doing or expressing something
SUDAN|2|African country whose capital is Khartoum
SUING|2|Taking legal action against someone
SUITE|2|A connected set of rooms in a hotel
SUNNI|2|Relating to the largest branch of Islam.
SUPER|2|Excellent or first-rate
SURGE|2|A sudden powerful increase or forward movement
SWEAT|2|Moisture released through the skin when hot or anxious
SWEEP|2|To clean a surface by brushing away dirt.
SWEPT|2|Used a broom to clean a surface
SWIFT|2|Moving or able to move at great speed
SWINE|2|A pig, or a contemptible person
SWING|2|A hanging seat that children push back and forth
SWIPE|2|To take something quickly.
SWISS|2|Of the Alpine country famed for watches and chocolate
SWORD|2|A weapon with a long metal blade and a hilt
SWORE|2|Made a solemn promise or took an oath
SWORN|2|Bound by a solemn oath
TABOO|2|A subject avoided due to social or cultural convention
TAILS|2|The rear, moving parts of animals used for balance or signaling
TALES|2|Imaginative stories, especially ones told aloud
TALLY|2|A current count or score of something
TANGO|2|A passionate dance originating from Argentina.
TANKS|2|Armored military combat vehicles that move on tracks
TAPED|2|Fastened with an adhesive strip, or recorded for later playback
TASKS|2|Pieces of work to be completed
TASTE|2|The sensation of flavour perceived on the tongue
TAXED|2|Had a compulsory financial charge imposed on it
TEACH|2|To impart knowledge or skill to someone
TEAMS|2|Groups of people working or playing together (plural)
TEARS|2|Drops of salty liquid that flow from the eyes
TEASE|2|To make fun of or provoke in a playful way.
TEENS|2|Adolescents
TELLS|2|Communicates information to someone by speaking
TEMPO|2|The speed or pace at which a piece of music is played
TENSE|2|Feeling or showing nervous strain
TENTS|2|Portable shelters made of fabric.
TESTS|2|Procedures used to assess knowledge or quality
TEXAS|2|The Lone Star State of the USA
TEXTS|2|Written works or printed documents
THANK|2|To express gratitude to a person
THEME|2|The central subject of a work or discussion
THERE|2|In or at that place
THICK|2|Having a large distance between opposite surfaces
THING|2|An object or matter
THINK|2|To use the mind to reason or reflect
THIRD|2|Next in sequence after the runner-up
THROW|2|Hurl
TIDAL|2|Relating to the regular rise and fall of the sea
TIGHT|2|Firmly fixed or fastened; not loose
TIMED|2|Measured how long an event took
TIMER|2|Stopwatch
TIMES|2|Multiplied by, in arithmetic
TIRES|2|rubber coverings for wheels.
TITLE|2|The name of a book or film, or a championship held by a winner
TONED|2|Having firm, well-defined muscles from exercise
TORCH|2|A portable light powered by a flame or battery
TOTAL|2|The whole amount reached by adding numbers together
TOUCH|2|To make physical contact with something
TOUGH|2|Hard to break, cut, or chew; durable and resilient
TOWNS|2|Built-up places larger than villages but smaller than cities
TOXIC|2|Harmful or deadly, like a dangerous chemical
TRACK|2|A marked course for running or racing
TRADE|2|The buying and selling of goods
TREAD|2|To walk or step in a particular manner
TREND|2|A general direction of change or popularity
TRIAL|2|A formal examination of evidence before a judge
TRIBE|2|A social group sharing customs, language, and ancestry
TRICK|2|A cunning act intended to deceive
TRIES|2|Makes an attempt to do something
TRIPS|2|Journeys to and from a place
TROOP|2|A group of soldiers, especially a cavalry unit
TRUNK|2|the main stem of a tree.
TRUST|2|To rely on the honesty or ability of someone
TRUTH|2|That which is in accordance with fact or reality
TUBES|2|Hollow cylinders used to convey liquids or gases
TUNED|2|Adjusted to the correct musical pitch or frequency.
TURNS|2|Opportunities to act taken one after another in sequence
TWEET|2|A short message posted on a certain social network
TWICE|2|On two separate occasions
TWIST|2|To turn or bend something out of its natural shape
TYPES|2|Categories or varieties of things
TYRES|2|Rubber coverings fitted around a wheel's rim
TYSON|2|Former heavyweight boxing champion nicknamed 'Iron Mike'
UNION|2|An organized association of workers
UPPER|2|Higher in position, rank, or place
URBAN|2|Relating to a city or town
URGED|2|To strongly encourage someone to do something.
URGES|2|Strong desires or impulses driving one to act
USAGE|2|The way in which something is employed
USERS|2|People who operate a product or service
USHER|2|To guide someone to a place.
USING|2|Employing something to serve a purpose
USUAL|2|Happening or done most of the time
UTTER|2|Complete and total, with no exception
VAGUE|2|Not clearly expressed or defined
VALUE|2|The importance or usefulness of something
VALVE|2|Device that regulates the flow of gas or liquid through a pipe
ABSORB|1|To take in or soak up a liquid or substance.
ACTORS|1|Performers who play roles on stage or screen
ADULTS|1|Fully grown people
AFRAID|1|Feeling fear or anxiety about something
AGEING|1|Growing old or showing the effects of getting older
AIDING|1|Giving help or support to someone
AMAZED|1|Filled with great surprise or wonder
AMUSED|1|Found something funny or entertaining
ANGELA|1|a common female name.
ANGELS|1|Winged heavenly messengers of religious tradition
ANIMAL|1|A living creature that is neither plant nor human
ANKLES|1|The joints connecting the foot to the leg
ANSWER|1|A response given to a question
ANYHOW|1|In any case, regardless of other considerations
APPLES|1|Round fruits that grow on trees, often red or green
ARABIC|1|The language spoken across the Middle East and North Africa
ARCHER|1|A person who shoots with a bow and arrow.
ARMIES|1|Large organized bodies of soldiers trained for war
ARMOUR|1|Protective covering worn to prevent injury in combat
ARRIVE|1|To reach a destination at the end of a journey
ARROWS|1|Pointed sticks shot from a bow
ASLEEP|1|In a state of sleep
ATHENS|1|Capital city of Greece
ATTACH|1|To fasten or join one thing to another
ATTEND|1|To be present at an event or gathering
AUGUST|1|The eighth month of the year
AUTHOR|1|The person who wrote a book or article
AUTUMN|1|The season of falling leaves between summer and winter
AVOIDS|1|Keeps away from or steers clear of
BABIES|1|Very young children who cannot yet walk or talk
BADGES|1|Emblems worn to show identity, rank, or achievement
BAKERY|1|A shop that makes and sells bread and cakes
BAKING|1|Cooking process used to make bread and cakes
BANANA|1|A long, yellow tropical fruit.
BANGED|1|Struck something loudly and forcefully
BANKER|1|A person who manages money at a financial institution
BANTER|1|Playful, teasing conversation between friends
BARBER|1|A person who cuts men's hair and shaves beards for a living.
BASICS|1|The fundamental facts or principles of a subject.
BASKET|1|A container woven from cane, wire, or other material
BATMAN|1|Caped crusader who protects Gotham City
BEASTS|1|Large, often dangerous, wild animals.
BEWARE|1|To be cautious of potential danger.
BIDDER|1|A person who offers a price at an auction
BIKING|1|Riding a two-wheeled pedal vehicle
BIKINI|1|A women's two-piece swimsuit.
BIRTHS|1|The events of babies being born
BLOODY|1|Covered in or stained with the red fluid of veins
BOSSES|1|People in charge of workers; supervisors
BOTTLE|1|A narrow-necked container, often for liquids
BOTTOM|1|The lowest part of something
BOUNCE|1|To spring back after hitting a surface
BOXERS|1|Athletes who fight with their fists
BOXING|1|Combat sport fought with gloved fists
BRAKES|1|Devices used to slow or stop a moving vehicle
BRANCH|1|A woody limb growing out from the trunk of a tree
BREEZE|1|A light, gentle wind.
BRICKS|1|Rectangular blocks of baked clay used in building.
BROKEN|1|No longer in working order
BRUNCH|1|A late-morning meal combining breakfast and lunch
BUCKET|1|A round open container with a handle for carrying liquids
BUILDS|1|Constructs, piece by piece
BULLET|1|A small metal projectile fired from a gun
BUMPER|1|A protective bar at the front or back of a vehicle.
BUNDLE|1|A group of items tied or wrapped together.
BUNKER|1|An underground shelter, often for protection
BURIAL|1|The act of placing a dead body in a grave
BUSHES|1|Shrubs or small trees.
BUTTER|1|A dairy spread churned from cream
BUTTON|1|A small disc that fastens clothing, or a knob you press to operate something
CABINS|1|Small, simple dwellings, often made of wood.
CACTUS|1|A spiny desert plant that stores water in its stem
CAMERA|1|A device for taking photographs
CANALS|1|Man-made waterways for boats or irrigation
CANARY|1|A small yellow songbird often kept as a pet
CANDLE|1|Wax stick with a wick, burned for light
CANNED|1|Preserved by sealing inside an airtight metal container
CARPET|1|A thick woven covering for a floor
CARROT|1|A long orange root vegetable
CATTLE|1|Domesticated bovine animals raised for milk and beef
CEMENT|1|A powdery substance mixed with water to bind building materials
CENTER|1|The middle point of something
CEREAL|1|A grain-based food commonly eaten with milk at breakfast
CHAINS|1|Series of connected metal links
CHAIRS|1|Seats typically with four legs.
CHANGE|1|To make or become different
CHASED|1|Pursued quickly in order to catch
CHEEKS|1|The soft, rounded parts of the face on either side of the nose and mouth.
CHEEKY|1|Showing playful disrespect or impudence
CHEESE|1|A dairy food made from curdled milk
CHERRY|1|Small round red fruit with a central stone
CHICKS|1|Baby birds, particularly of the domestic hen
CHILLY|1|Uncomfortably cold
CHORES|1|Daily household tasks
CHORUS|1|The repeated part of a song, sung after each verse
CHROME|1|A popular web browser developed by Google
CHUBBY|1|Pleasantly plump, especially describing a child
CHUNKS|1|Thick, irregular pieces of something
CHURCH|1|A building used for Christian worship
CINEMA|1|A building where films are shown
CIRCLE|1|A perfectly round closed curve
CITIES|1|Large towns with many inhabitants
CLEVER|1|Quick to understand, learn, or devise
CLICKS|1|Makes a short, sharp sound
CLIMBS|1|Ascends using hands and feet or effort
CLOCKS|1|Devices used to measure and indicate time.
CLOSED|1|Not open for business or entry
CLOSES|1|To shut something.
CLOUDY|1|Overcast, with the sky largely hidden by moisture in the air
CLOWNS|1|Comic performers who entertain with jokes and silly tricks, often in costume
COARSE|1|Rough or harsh in texture
COATED|1|Covered with a layer of a substance
CODING|1|The activity of writing instructions for a computer
COFFEE|1|Hot drink brewed from roasted ground beans
COFFIN|1|Box in which a dead body is buried or cremated
COLDER|1|Less warm
COLORS|1|Hues such as red, green, and blue
COLOUR|1|A property such as red, blue, or green
COOKED|1|Prepared food by applying heat
COOLED|1|Became lower in temperature
COPIED|1|Made an identical version of something
CORNER|1|Point where two walls or two streets meet
CORPSE|1|a dead body
COSTLY|1|Expensive; requiring a great deal of money.
COTTON|1|A soft white plant fibre used to make cloth
COUPON|1|A voucher entitling the holder to a discount.
COUSIN|1|The child of one's aunt or uncle
COVERT|1|Secret
COWARD|1|A person who lacks courage to face danger or pain.
COWBOY|1|A man who herds cattle on a ranch, often on horseback
CRADLE|1|A small bed for a baby, often on rockers
CRAFTS|1|Skilled activities involving making things by hand
CREAMY|1|Having a smooth, thick, and rich texture
CROWDS|1|Large groups of people gathered together
CUDDLE|1|Hold closely and affectionately
CURVED|1|Having a smoothly bent shape rather than a straight line
CURVES|1|Smoothly bending lines or shapes.
DAGGER|1|Pointed weapon
DANCED|1|Moved rhythmically to music, in the past tense
DANCER|1|One who moves rhythmically to music
DANCES|1|Moves rhythmically to music
DANGER|1|Exposure to possible harm or risk
DARING|1|Bold and willing to take risks
DARKER|1|More lacking in light
DEFECT|1|A flaw or imperfection in something
DELETE|1|Remove or wipe out text or data
DEPART|1|To leave a place, especially to start a journey.
DEVICE|1|A piece of equipment made for a particular purpose
DEVILS|1|Evil spirits or demons
DIALOG|1|A conversation between two or more people
DIAPER|1|Absorbent garment worn by an infant
DIGITS|1|Numerical symbols from 0 to 9
DINNER|1|The main meal of the day, often eaten in the evening
DIPPED|1|Plunged briefly into liquid
DISHES|1|Plates and bowls left to be washed after a meal
DOCTOR|1|A person trained and licensed to treat the sick
DOLLAR|1|The main unit of currency in the United States
DONKEY|1|A domesticated hoofed animal related to the horse, known for its long ears
DONUTS|1|Ring-shaped deep-fried pastries, often glazed
DRAGON|1|A mythical fire-breathing winged reptile
DREAMS|1|Images and stories the mind experiences during sleep
DRIVER|1|One who operates a motor vehicle
DRYING|1|Removing moisture from something.
EATING|1|Taking in food through the mouth
ECHOED|1|Repeated a sound by reflection
EDIBLE|1|Safe and suitable for eating
ELBOWS|1|Joints between the upper and lower arm
ELDERS|1|Older, respected members of a community or tribe
ELDEST|1|Being the oldest among siblings
EMBARK|1|To begin a journey or project
ENJOYS|1|Takes pleasure in something
ENROLL|1|To register officially as a member or participant
ERASED|1|Removed all trace of, as with a rubber or delete key
ERRORS|1|Mistakes or inaccuracies
ESCAPE|1|To break free from confinement
EUROPE|1|The continent lying west of Asia
EXPAND|1|To become or make larger in size or scope
EXPIRE|1|Come to an end
FAILED|1|Did not succeed
FALCON|1|A fast diving bird of prey with pointed wings, often trained for hunting
FAMILY|1|Parents and their children, considered as a group
FAMOUS|1|Known about by very many people
FARMER|1|A person who grows crops or raises animals for a living
FATHER|1|A male parent
FAULTY|1|Having defects or flaws
FEARED|1|Felt afraid of someone or something
FELLAS|1|An informal word for men or friends
FIDDLE|1|An informal name for a violin
FILTHY|1|Extremely dirty
FINGER|1|One of the digits on a hand
FIXING|1|Repairing or mending something broken
FLOATS|1|Remains buoyant on the surface of a liquid
FLOODS|1|Overflows of water that submerge normally dry land
FLOORS|1|The lower surface of a room.
FLORAL|1|Relating to or decorated with flowers
FLOWER|1|The colorful reproductive part of a plant
FLYING|1|Moving through the air
FOLDER|1|A cover used to store and organize loose sheets of paper
FOLLOW|1|To go or come after someone or something
FOREST|1|A large area thickly covered with trees
FORGET|1|Fail to remember
FORGOT|1|Failed to remember
FRIDGE|1|An appliance for keeping food cold.
FRIEND|1|A person you know well and are fond of
FRYING|1|Cooking food in hot oil or fat
FUNNEL|1|A tube wide at the top and narrow at the bottom, used for pouring liquids
FUTURE|1|The time that is yet to come
GADGET|1|A small mechanical or electronic device
GALLON|1|A unit of liquid measure equal to about 3.8 liters in the US
GARAGE|1|Building where a car is kept
GARDEN|1|A plot where flowers or vegetables are grown
GARLIC|1|A pungent bulb used as a seasoning in cooking
GENTLE|1|Mild and kind in manner or touch
GHOSTS|1|Spirits of the dead said to haunt the living.
GINGER|1|Pungent spicy root used in cooking and tea
GLANCE|1|A brief or quick look
GLITCH|1|A minor malfunction or error, often in software
GLOSSY|1|Having a smooth, shiny surface
GLOVES|1|Hand coverings made of fabric or leather.
GOALIE|1|The player who guards the net in hockey or soccer
GRAPES|1|Small round fruits that grow in clusters on vines
GRAVEL|1|Small stones often used to cover paths or driveways
GRAVES|1|Places where the dead are buried
GREASY|1|Covered in or containing a lot of fat or oil
GREEDY|1|Having an excessive desire for wealth or food
GREENS|1|Leafy vegetables eaten as food
GROUND|1|The solid surface of the earth
GRUMPY|1|Easily irritated and bad-tempered
GUESTS|1|People invited to a home or event
GUILTY|1|Responsible for a crime or wrongdoing
GUITAR|1|A stringed instrument played by strumming or plucking
HALTED|1|Brought abruptly to a stop
HAMMER|1|Tool for driving nails into wood
HANDLE|1|The part of a door, cup, or tool you grip
HARMED|1|Caused injury or damage to someone or something
HATING|1|Feeling intense dislike for something
HEALED|1|Became whole and sound again after injury or illness
HEALTH|1|The state of being free from illness or injury
HEARTS|1|Red suit in a standard deck of cards
HELPED|1|Gave assistance to
HELPER|1|A person who assists another with a task
HEROIC|1|Showing great courage and bravery in the face of danger
HIKING|1|The activity of walking long distances in the countryside
HOCKEY|1|A team sport played with sticks and a puck or ball
HOLLOW|1|Having an empty space inside; not solid
HOODIE|1|A casual sweatshirt with a fabric covering for the head
HORSES|1|Large hoofed animals often ridden or used to pull carts
HOURLY|1|Occurring or measured once every sixty minutes
HOUSES|1|Buildings that people live in
HUGGED|1|Held closely in one's arms as a sign of affection
HUMOUR|1|The quality of being amusing or comic.
HUNGRY|1|Feeling a strong need or desire to eat
INDOOR|1|Situated or done inside a building
INFANT|1|A very young child.
INSULT|1|To speak to or treat disrespectfully.
INVENT|1|To create or design something new.
INVITE|1|To ask someone to come to an event
IPHONE|1|Apple's flagship handset
ISLAND|1|A piece of land surrounded by water
JACKET|1|A short coat worn on the upper body
JAGUAR|1|A large spotted wild cat native to the Americas
JEWELS|1|Precious stones or gems, often set in fine adornments
JUDGES|1|Officials who preside over courts of law
JUICES|1|Liquids extracted from fruits or vegetables
KETTLE|1|A container for boiling water.
KINDLE|1|To set alight or start burning
KINDLY|1|Warm-hearted and considerate
KISSED|1|Touched with the lips as a sign of affection or greeting
KISSES|1|Touches someone with the lips as a greeting or expression of love
KITTEN|1|A young cat
KNIVES|1|Plural of a bladed cutting tool
LADIES|1|Polite term for a group of women
LAWFUL|1|Permitted or recognized by law
LAWYER|1|A professional who advises clients on legal matters
LEADER|1|A person who guides or commands a group
LEANED|1|Tilted or bent from an upright position.
LEARNS|1|Gains knowledge or skill through study, experience, or teaching
LEAVES|1|The flat green parts that grow on tree branches
LENDER|1|A person or institution that provides loans
LETTER|1|A written message sent by mail
LIGHTS|1|Devices that provide illumination
LISTEN|1|Give attention to a sound or to someone speaking
LITTER|1|Rubbish or trash left lying around in a public place.
LIVELY|1|Full of energy and enthusiasm
LIZARD|1|A reptile typically with four legs, a long tail, and scaly skin.
LOCKED|1|Secured with a key or bolt
LOCKER|1|A small compartment, often in a school or gym, secured with a key or combination
LOSERS|1|People who fail to win or succeed
LOTION|1|Creamy liquid applied to soothe or moisturize skin
LOUDER|1|Producing a greater volume of sound
LOUNGE|1|A comfortable room for relaxing or waiting
MAGNET|1|An object that attracts iron and other metals.
MARKET|1|A place where goods are bought and sold
MASCOT|1|A person, animal, or object thought to bring good luck to a group
MAYORS|1|Elected heads of city or town governments
MELODY|1|A pleasing sequence of musical notes forming a tune
MELTED|1|Changed from a solid into a liquid through heat
MEMBER|1|One belonging to a group or club
METALS|1|Hard, shiny materials such as iron, silver, and copper
METEOR|1|A small body from space that enters the Earth's atmosphere.
MIDDLE|1|The central point or part
MIDWAY|1|At or near the halfway point of a distance, process, or period of time.
MINORS|1|People who are under the legal age of adulthood.
MINUTE|1|A span of sixty seconds
MIRROR|1|Polished surface that reflects your image
MISERY|1|A state of great distress or unhappiness
MISTER|1|A title used to address a man.
MISUSE|1|To use something improperly or incorrectly
MOCKED|1|Made fun of in a scornful or contemptuous way
MODERN|1|Relating to the present or most recent times
MOMENT|1|A very brief period of time
MONDAY|1|the first day of the week
MONKEY|1|A long-tailed primate that swings through the trees
MOSQUE|1|A building used for Muslim worship
MOTHER|1|A female parent
MOUTHS|1|The openings through which humans and animals take in food
MOVIES|1|Motion pictures shown in cinemas
MUSEUM|1|Building where artifacts and art are displayed
NEATLY|1|In a tidy, orderly, or careful manner
NEEDLE|1|A slender tool used for sewing.
NEWEST|1|Most recent in time.
NODDED|1|Moved the head up and down in agreement
NOISES|1|Sounds, especially loud or unpleasant ones
NOODLE|1|A long, thin strip of pasta, often served in soup
NOTIFY|1|To inform someone of something officially.
NOVICE|1|A person new to a skill or activity
NURSES|1|People trained to care for the sick and injured
OCCUPY|1|To take up space, time, or a position
OCEANS|1|Vast bodies of salt water covering most of Earth's surface
ONIONS|1|Edible bulbs with a strong smell that often bring tears when chopped
ONLINE|1|Connected to the internet
OPPOSE|1|To disagree with or resist a plan, policy, or person
ORANGE|1|Round citrus fruit with a thick rind
ORGANS|1|Body parts such as the heart or liver
OUTING|1|A short trip or excursion, often for pleasure
OUTSET|1|The very beginning or start of something
OWNERS|1|People who possess something
OXYGEN|1|Gas essential for human respiration
OYSTER|1|A bivalve mollusk that can produce pearls
PACKET|1|A small parcel or bundle
PADDLE|1|A short oar used without a fixed support, held in both hands
PAINTS|1|Applies color to a surface using a brush or roller
PAPERS|1|Written or printed documents
PARADE|1|A public procession celebrating an occasion
PARCEL|1|A package wrapped for mailing or carrying
PARENT|1|A person's mother or father
PARKED|1|Brought a vehicle to a stop and left it standing
PARROT|1|A brightly colored tropical bird capable of mimicking speech
PASTRY|1|Dough made with flour, fat, and water, used for pies and tarts
PEANUT|1|An edible seed that grows underground, often roasted and salted
PEARLS|1|Hard, lustrous spheres formed inside oyster shells, often used in jewelry
PENCIL|1|A writing instrument with a graphite core encased in wood
PEOPLE|1|Human beings considered collectively
PEPPER|1|A pungent spice ground from dried berries, often paired with salt
PERSON|1|An individual human being
PETALS|1|the colored leaf-like parts surrounding a flower's center
PETROL|1|gasoline
PHONES|1|Handheld devices used to make and receive calls
PICKUP|1|A small open-bed truck used for hauling cargo
PICNIC|1|An outdoor meal eaten on a blanket or at a park
PIERCE|1|To make a hole in something with a sharp point
PILLOW|1|A soft cushion for resting the head while sleeping
PILOTS|1|Trained crew who fly aircraft
PISTOL|1|A small handgun designed to be held in one hand
PLAINS|1|Large areas of flat land with few trees
PLANES|1|Flying aircraft, informally
PLATES|1|Flat round items from which meals are eaten
PLAYER|1|One who takes part in a game
POCKET|1|A small pouch sewn into a garment
PODIUM|1|A small raised platform for a speaker or award winner
POLICE|1|The civil force responsible for enforcing the law
POLITE|1|Having or showing good manners.
POPPED|1|Made a short, sharp bursting sound
POSTAL|1|Relating to the mail delivery system
POSTER|1|A large printed notice displayed on a wall
POURED|1|Flowed or made a liquid flow from a container
PRICES|1|Amounts of money charged for goods
PRINCE|1|A male member of a royal family, often a monarch's son
PUNISH|1|To impose a penalty on someone for wrongdoing
PUPPET|1|A doll or figure moved by strings or a hand placed inside it
PUSHES|1|Applies force to move something away
PUZZLE|1|A game or problem designed to test cleverness
RABBIT|1|A long-eared burrowing mammal known for hopping
RADIOS|1|Devices that receive broadcast sound signals
RANGER|1|A person who patrols and protects a park or forest
REBOOT|1|To turn a device off and on again to fix issues
RECESS|1|A break from work or school activities
RECIPE|1|A set of instructions for preparing a particular dish
REFUGE|1|A place offering shelter or protection from danger
REFUND|1|Money returned for a purchase
REFUSE|1|To say that you will not do or accept something
RENTED|1|Paid to use something temporarily belonging to someone else
RESCUE|1|To save from danger or harm
RESTED|1|took a break.
RETURN|1|To come back to a place
REWARD|1|Something given in recognition of service, effort, or achievement
RIBBON|1|A long, narrow strip of fabric used for decoration or tying
RICHER|1|Having more wealth than another
RICHES|1|Great wealth
RIPPLE|1|A small wave or series of waves on the surface of water
RIVALS|1|People or teams competing against each other
RIVERS|1|Large natural streams of flowing water
ROCKET|1|Vehicle propelled by burning fuel, used for space flight
ROTTEN|1|Decayed and foul-smelling.
RULERS|1|People who govern a country
RUNWAY|1|A strip of ground where aircraft take off and land.
SADDLE|1|A seat for a rider on a horse or bicycle
SAFARI|1|An expedition to observe wild animals, especially in Africa
SAHARA|1|The largest hot desert in the world, spanning North Africa
SAILOR|1|A person who works as a crew member on a ship
SCARED|1|Filled with fear
SCENIC|1|Providing beautiful natural views
SCORES|1|Points earned by teams in a game
SCRAPE|1|To drag a hard or sharp object across a surface
SEATED|1|In a sitting position
SEEKER|1|A person who is searching for something
SELDOM|1|Not often; rarely
SELECT|1|To pick out from a larger group
SELFIE|1|A photograph someone takes of their own face, typically with a smartphone
SHADES|1|Dark glasses worn to protect the eyes.
SHADOW|1|A dark shape cast when an object blocks the light
SHAVED|1|Removed facial hair closely with a blade
SHELLS|1|Hard protective outer coverings of eggs, nuts, or sea creatures
SHORTS|1|Casual pants that end above the knee
SHOUTS|1|Cries out loudly
SHOVED|1|Pushed roughly
SHOVEL|1|A tool with a broad blade used for digging or moving loose material
SHRIMP|1|A small, edible crustacean
SHRINK|1|To become smaller in size
SIGHTS|1|Places or things worth seeing
SILENT|1|Making or accompanied by no sound
SILVER|1|A shiny grey precious metal
SIMPLE|1|Easily done or understood
SINGER|1|Person who performs songs with their voice
SIRENS|1|Devices that emit a loud wailing sound as a warning
SISTER|1|A female sibling
SKIING|1|Traveling downhill on snow using two long runners and poles
SLEEPS|1|Rests in a state of unconsciousness
SLEEPY|1|Feeling drowsy and wanting to rest
SLEEVE|1|The part of a garment that covers the arm
SLICES|1|Cuts something into thin flat pieces
SLIDES|1|Playground equipment children climb up and slip down
SLOWED|1|Reduced in speed or pace
SLOWLY|1|At an unhurried pace
SMELLS|1|To perceive odors.
SMILED|1|Formed a happy expression with the mouth
SMILES|1|Expressions of happiness on a face, plural
SMILEY|1|Habitually cheerful, showing happiness on one's face
SMOKES|1|Inhales and exhales the fumes of burning tobacco.
SMOOTH|1|Having an even surface, free from roughness
SNACKS|1|Small amounts of food eaten between meals
SNAKES|1|Long limbless reptiles that slither on the ground
SNEAKY|1|Acting in a secretive or deceitful manner
SOAKED|1|Thoroughly wet through
SOCCER|1|A team sport in which a ball is kicked into a goal
SOCKET|1|An electrical outlet designed to receive a plug
SOFTER|1|Less firm or hard; more gentle
SPARKS|1|Small fiery particles thrown off by burning or friction
SPEEDY|1|Moving or done quickly
SPENDS|1|Pays out money in exchange for goods or services
SPHERE|1|A perfectly round three-dimensional shape
SPIDER|1|An eight-legged creature that spins webs
SPINAL|1|Relating to the backbone.
SPIRAL|1|A curve that winds continuously around a center point.
SPLASH|1|The sound or act of liquid striking a surface.
SPONGE|1|A porous material used for cleaning or absorbing.
SPOOKY|1|Eerie and unsettling, as if haunted
SPORTS|1|Competitive physical games and activities
SPOUSE|1|A husband or wife
SPRINT|1|To run at full speed over a short distance
SQUADS|1|Small groups of people organized to work together, as in sports or the military
SQUARE|1|A shape with four equal sides and four right angles
SQUASH|1|A vegetable such as a zucchini or pumpkin
STACKS|1|Piles of objects arranged one on top of another
STAINS|1|Discolored marks left behind on a surface or fabric
STAIRS|1|A set of steps leading from one floor to another
STAMPS|1|Small adhesive labels used to pay for postage, plural
STARVE|1|To suffer or die from lack of food
STICKY|1|Tending to adhere to surfaces
STORED|1|Put away and kept for later use
STORMS|1|Violent disturbances of the atmosphere with strong winds and rain
STORMY|1|Characterized by strong winds, heavy rain, or turbulent weather
STREET|1|A public way lined with buildings in a town
STRING|1|Thin cord used for tying or fastening
STRIPE|1|A narrow band of colour, often one of several
STROLL|1|To walk in a slow, relaxed manner
STRONG|1|Having great physical power or force
STUDIO|1|A room where an artist or musician works
STURDY|1|Strongly built and unlikely to break
SUFFER|1|To experience pain, hardship, or distress
SUMMER|1|The warmest season of the year.
SUMMIT|1|The highest point of a mountain
SUNDAY|1|The weekend day traditionally set aside for rest
SUPPER|1|The evening meal of the day
SWEETS|1|Small pieces of confectionery, especially in British English
SWINGS|1|Playground seats that move back and forth on chains
SWORDS|1|Bladed weapons with a hilt, used for cutting or thrusting
SYLVIA|1|A female given name.
TABLET|1|A flat touchscreen computer
TALLER|1|Greater in height than another
TASTED|1|Tried a small amount of food or drink to check its flavor
TELLER|1|A bank employee who handles customer transactions
TEMPLE|1|A building used for religious worship
TERROR|1|Intense, overpowering fear
TEXTED|1|Sent a written message using a mobile phone
THIRST|1|A feeling of needing to drink
THREAD|1|A thin strand of cotton or silk used in sewing
THROAT|1|The passage at the back of the mouth leading to the stomach and lungs
TIPPED|1|Gave extra money to a waiter or driver for good service
TOMATO|1|A red, round fruit commonly used in salads and sauces.
TOSSED|1|Threw something lightly
TOTALS|1|Sums arrived at by adding a set of numbers
TOWELS|1|Absorbent cloths used for drying the body after bathing
TRAINS|1|Connected railway carriages pulled by an engine
TRAVEL|1|To make a journey from one place to another
TRENDY|1|Fashionable or in vogue at the moment
TRIVIA|1|Unimportant facts or details, often used in quiz games
TROPHY|1|A cup or figure awarded as a prize for victory
TRUCKS|1|Large road vehicles used for carrying goods
TUMBLE|1|To fall suddenly and awkwardly
TUNNEL|1|Underground passage dug through a hill or beneath a river
TURKEY|1|A large bird traditionally eaten at Thanksgiving
TURTLE|1|A reptile with a hard protective shell, often living near water
TWENTY|1|Two times ten
TYPING|1|The action of entering text using a keyboard.
UNFAIR|1|Not based on justice or equal treatment
UNLOCK|1|To open something using a key
UNPAID|1|Without receiving any compensation
UNSAFE|1|Likely to cause harm or injury
UNSURE|1|Not certain about something
UNTRUE|1|Not in accordance with fact; false
UPWARD|1|Moving toward a higher position
VALLEY|1|A low stretch of land lying between hills or mountains
VENDOR|1|A person or company that sells goods or services
VENICE|1|Italian city built on a lagoon, famous for its canals
VERIFY|1|To check that something is true or accurate
VERSES|1|Lines of poetry or sections of a song or poem
VICTOR|1|The winner of a battle or contest
VIEWER|1|A person who watches television or other visual media.
VIOLET|1|A small flower with purple-blue petals
VIOLIN|1|A four-stringed instrument played with a bow
VOYAGE|1|A long journey, especially by sea or in space
WAGONS|1|Four-wheeled vehicles used for hauling goods or passengers
WALKED|1|Moved along on foot, in the past
WALLET|1|A small folding case for carrying money and cards
WANDER|1|To walk around without a fixed destination
WARMED|1|Made something less cold
WAVING|1|Moving a hand back and forth as a greeting or signal
WEAKEN|1|To make or become less strong or powerful
WEAKER|1|Having less strength or power; comparative form
WEBCAM|1|A small camera used for video calls over the internet
WEIGHT|1|A measure of how heavy something is
WHALES|1|Large marine mammals that breathe air through a blowhole.
WHEELS|1|Round parts that turn to let a vehicle roll along
WHISKY|1|A distilled alcoholic spirit made from fermented grain mash
WINDOW|1|Glass-filled opening in a wall
WINNER|1|One who comes first in a contest
WINTER|1|The coldest season of the year
WIPING|1|Cleaning a surface by rubbing it
WIZARD|1|A person who practices magic
WOODEN|1|Made from timber
WORKER|1|A person who is employed to do a job
WRISTS|1|The joints linking the hands to the forearms
YEARLY|1|Happening once every twelve months
YELLED|1|Shouted loudly
YELLOW|1|The color of lemons and sunflowers
YOGURT|1|A creamy food made by fermenting milk with live cultures
YOUTHS|1|Young people, especially in their teens.
ZOMBIE|1|A reanimated corpse in horror fiction
ZONING|1|Government regulation dividing land into areas for different types of use
ABOARD|2|On or onto a ship, train, or plane
ABROAD|2|In or to a foreign country
ABSENT|2|Not present in a place.
ABSURD|2|So unreasonable as to be laughable
ABUSES|2|Instances of improper or excessive use of something, especially power
ACCENT|2|A distinctive way of pronouncing a language
ACCEPT|2|To agree to receive or take what is offered
ACCESS|2|The means or right to enter or make use of something
ACCUSE|2|To charge someone with wrongdoing
ACROSS|2|From one side to the other
ACTION|2|The process of doing something to achieve an aim
ADDING|2|Combining numbers or things to make a greater total
ADIDAS|2|A popular sportswear brand.
ADJUST|2|To alter slightly to achieve a better fit or result
ADMIRE|2|to regard with respect or warm approval
ADMITS|2|Confesses to something
ADVENT|2|The arrival or coming into being of something notable
ADVERT|2|A public notice promoting a product or service
ADVICE|2|Guidance offered as a recommendation about what to do
ADVISE|2|To offer guidance or recommendations to someone
AERIAL|2|Existing or happening in the air
AFFORD|2|To have enough money or means to pay for
AFGHAN|2|A knitted or crocheted blanket, often used as a throw
AFRICA|2|The world's second-largest continent
AGENTS|2|Representatives who act or negotiate on behalf of others
AGREED|2|Reached the same opinion as another
AGREES|2|Holds the same opinion or gives consent
AIMING|2|Pointing a weapon or effort toward a target.
AIRING|2|The act of broadcasting something
ALARMS|2|Devices that signal danger.
ALBUMS|2|Collections of recorded songs released together
ALERTS|2|To notify or warn someone.
ALICIA|2|A female name
ALLIES|2|Nations or people united for a common purpose
ALLOWS|2|Lets someone do something or have something
ALMOND|2|A pale, oval nut often used in baking and confectionery
ALMOST|2|Very nearly but not completely
ALPINE|2|Relating to high, snow-capped mountain ranges
ALWAYS|2|At all times.
AMAZON|2|The world's largest river by volume, in South America
AMELIA|2|A female given name.
AMOUNT|2|A total sum or quantity of something
ANCHOR|2|a heavy object used to moor a vessel.
ANDREA|2|A common feminine given name of Greek origin
ANGLES|2|The spaces between two intersecting lines, measured in degrees
ANNUAL|2|Happening once every year
ANTHEM|2|A rousing song of loyalty, often national
APPEAR|2|To come into sight or become visible
ARCADE|2|A venue with coin-operated games, or a covered passageway lined with shops
ARCHES|2|Curved structures supporting weight above an opening
ARCHIE|2|A popular male name, often associated with comics.
ARCTIC|2|Relating to the North Pole.
ARGUED|2|Exchanged opposing views in a heated way (past tense)
ARGUES|2|To present reasons for or against something.
ARISES|2|Comes about or begins to exist
AROUND|2|In a circular direction.
ARREST|2|To seize and hold by legal authority
ARTERY|2|A vessel that carries blood away from the heart
ARTIST|2|a person who creates art
ASCENT|2|The act of climbing or rising upward
ASHORE|2|Onto or on the land, coming from the sea
ASIANS|2|People native to the world's largest and most populous continent
ASKING|2|Putting a question to someone
ASPIRE|2|To have a strong ambition to achieve something
ASSERT|2|To state a fact or belief confidently and forcefully
ASSIGN|2|To give a specific task or duty to someone.
ASSIST|2|To give support or aid to someone
ASSURE|2|To guarantee or promise.
ASTHMA|2|A chronic condition causing difficulty breathing due to narrowed airways
ATOMIC|2|Relating to a nucleus and its particles
ATTACK|2|To take aggressive action against, or such an act of aggression
ATTAIN|2|To achieve or reach a goal.
ATTIRE|2|Clothes, especially fine or formal ones
AUBURN|2|A reddish-brown color, often used to describe hair
AUDREY|2|A female given name, often associated with elegance.
AURORA|2|A natural light display in the sky, typically seen near polar regions
AUSSIE|2|An informal term for an Australian.
AVATAR|2|A digital image or icon representing a person online.
AVENUE|2|A broad street, often lined with trees
AWARDS|2|Prizes given to recognize achievement
AWHILE|2|For a short period of time.
BACKUP|2|A spare copy or extra source of support
BADGER|2|A burrowing mammal with a black-and-white striped face
BALLAD|2|A slow, sentimental song that often tells a story
BALLET|2|A formal dance performed on pointe to classical music
BALLOT|2|A process of voting.
BAMBOO|2|A tall, fast-growing tropical grass with hollow, woody stems
BANNED|2|Officially prohibited or forbidden
BANNER|2|A long strip of cloth bearing a slogan or design
BARBIE|2|A popular fashion doll.
BARELY|2|Only just; by the smallest margin
BARLEY|2|A cereal grain used in bread, animal feed, and brewing
BARNEY|2|A popular children's television character.
BARRED|2|Prevented from entering or participating
BARREL|2|A cylindrical wooden container for wine or oil
BARREN|2|Too poor or dry to support the growth of plants.
BATTER|2|To hit repeatedly.
BATTLE|2|A sustained fight between opposing armed forces
BEACON|2|A light or fire used to warn or guide travelers
BEARER|2|A person who carries or holds something
BEAUTY|2|The quality of being very pleasing to the senses
BEAVER|2|A large rodent famous for building dams from wood and mud
BECAME|2|Came to be, in the past
BEETLE|2|an insect with hardened forewings that protect its flying wings
BEFORE|2|Prior to a certain time.
BEGGED|2|To ask earnestly or desperately.
BEGINS|2|Sets out on or commences a course of action
BEHAVE|2|To act in a particular way.
BEIRUT|2|The capital city of Lebanon.
BELIEF|2|Acceptance that something is true or real
BELONG|2|To be a member of, or be the rightful property of
BETRAY|2|To be disloyal to someone who trusts you
BETTER|2|Of superior quality.
BIASED|2|Showing unfair favor toward one side
BIGGER|2|Larger in size than another
BILLED|2|to send a statement of charges
BINARY|2|Based on just two values or states
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
BOASTS|2|Talks with excessive pride about one's own abilities
BODIES|2|The physical structures of humans or animals
BODILY|2|Relating to the physical form of a person
BOEING|2|American aerospace and defense company that builds passenger jets
BOILED|2|Cooked in bubbling hot water until done
BOILER|2|A container that heats water to produce steam or hot water
BOMBED|2|Attacked a target with explosives dropped from the air
BOMBER|2|Aircraft designed to drop explosives
BONDED|2|Joined firmly together, often by an adhesive
BOOKED|2|Arranged in advance, as a table or ticket
BOOSTS|2|Increases or gives a lift to something
BORDER|2|A line separating two countries or areas
BORING|2|Dull and tedious; lacking any interest
BORROW|2|To take something temporarily with the intention of returning it.
BOSTON|2|Massachusetts capital famous for a historic harbor tea protest
BOTHER|2|To trouble or annoy someone
BOUGHT|2|Acquired in exchange for money, in the past
BOUNDS|2|Limits that cannot be exceeded
BOWLER|2|A cricket player who delivers the ball toward the batsman
BOWMAN|2|A skilled archer who shoots arrows
BRAINS|2|Intellect or cleverness; the organs of thought, plural
BRANDS|2|Trademarked product names
BRANDY|2|A strong spirit distilled from wine or fermented fruit juice
BREAKS|2|Shatters or splits into pieces
BREAST|2|The upper front part of the human torso
BREATH|2|Air drawn into and pushed out of the lungs
BREEDS|2|Distinct types of domesticated animals within a species
BREWER|2|A person who makes beer.
BRIDAL|2|Relating to a wedding or marriage ceremony
BRIDGE|2|A structure built to span a river, road, or gap
BRIGHT|2|Giving off or filled with a lot of light
BRINGS|2|Carries or conveys something to a place
BRONZE|2|An alloy of copper and tin
BROWNS|2|Turns a toasty color when cooked in a pan, as meat or onions.
BROWSE|2|to look through casually
BUBBLE|2|A thin film of liquid enclosing a pocket of air
BUCKLE|2|A clasp used to fasten a belt or strap
BUDGET|2|A plan for spending money over a set period
BUFFER|2|Something that reduces shock or protects against impact
BUFFET|2|A meal where guests serve themselves.
BUMPED|2|Knocked against something by accident
BUREAU|2|A chest of drawers for clothing
BURGER|2|A patty of ground meat served in a bun
BURIED|2|Placed underground and covered over
BURNED|2|Damaged or consumed by fire
BURNER|2|A device for producing a flame or heat.
BURSTS|2|Breaks open suddenly and violently
BUSTED|2|Informally, caught in the act of doing something wrong.
BUTLER|2|The chief male servant of a large household
BUYING|2|Obtaining something by paying money for it
BUZZER|2|A small electronic device that emits a sharp sound when triggered
BYPASS|2|A road built to let traffic avoid a town center
CABLES|2|Thick strong ropes or wires used to support or transmit something
CAESAR|2|Title used by ancient Roman emperors, from a famous family name
CALLED|2|Gave a name to, or summoned aloud
CALLER|2|Someone who telephones another person
CALMLY|2|In a peaceful or relaxed manner.
CAMPUS|2|The grounds of a college or university
CANCEL|2|To call off a planned event or arrangement
CANCER|2|A disease caused by uncontrolled cell growth
CANDID|2|Honest and straightforward, without holding back
CANOPY|2|An overhead covering, such as over a bed or a forest's treetops
CANVAS|2|A strong fabric used for painting or making tents.
CANYON|2|A deep gorge, typically one with a river flowing through it.
CAPPED|2|Set an upper limit on something
CARBON|2|Chemical element with symbol C, the basis of organic life
CARDIO|2|Exercise that raises the heart rate for fitness
CARING|2|Displaying kindness and concern for others
CARVED|2|Cut or shaped from a solid material
CASINO|2|An establishment for gambling
CASTLE|2|A large fortified building dating from the medieval period
CATCHY|2|Easy to remember and pleasant to hear, like a tune
CAUGHT|2|Seized or grabbed, as a thrown ball in mid-air
CAUSES|2|Reasons or origins that produce an effect
CAVITY|2|An empty space within a solid object.
CEASED|2|Came to an end; stopped happening
CELLAR|2|A room below ground level used for storage.
CELTIC|2|Relating to the peoples of Ireland, Scotland, and Wales
CENSUS|2|An official count of the people living in a country
CENTRE|2|The point at the very middle of something
CHAMPS|2|Winners of a competition.
CHANCE|2|An opportunity to do something
CHANTS|2|Repeated rhythmic phrases sung or shouted, often in unison
CHARGE|2|To demand a sum of money for goods or services
CHARMS|2|Enchanting qualities
CHEATS|2|Acts dishonestly to gain an advantage
CHEESY|2|Of poor quality or overly sentimental.
CHEQUE|2|A written order to a bank to pay a stated sum
CHIEFS|2|Leaders or heads of a group, plural
CHILLS|2|Sudden feelings of coldness or fear running through the body
CHOICE|2|An act of selecting between possibilities
CHOKED|2|struggled to breathe because of a blocked windpipe
CHOOSE|2|To pick one thing from several options
CHORDS|2|Groups of musical notes played together in harmony
CHOSEN|2|Picked out from a number of options
CIRCUS|2|A traveling company of performers.
CITING|2|Quoting as evidence or example
CITRUS|2|Fruits like oranges and lemons.
CLASSY|2|Having a stylish, high-quality appearance
CLAUSE|2|A group of words containing a subject and a predicate.
CLEARS|2|to make free from confusion or ambiguity
CLIENT|2|A person who pays for the services of a professional
CLIFFS|2|Steep, high rock faces, often found along a coastline.
CLINIC|2|Place where outpatients receive medical treatment or advice
CLONES|2|Genetically identical copies of a living organism
CLOSER|2|At a smaller distance away
CLOSET|2|A small room or cupboard used for storing clothes
CLOUDS|2|Visible masses of condensed vapor floating in the sky
CLUMSY|2|Prone to dropping or bumping into things due to lack of coordination
COINED|2|Invented a new word or phrase.
COLLAR|2|A band around the neck of a shirt.
COLONY|2|A territory settled and controlled by a distant country
COLUMN|2|An upright pillar supporting a structure
COMBAT|2|Fighting between armed forces; also, to fight against something
COMEDY|2|Entertainment meant to make an audience laugh
COMICS|2|Stories told through sequential drawn panels
COMMON|2|Occurring frequently; ordinary and widespread
CONDOM|2|A protective sheath used during intercourse.
CONVEY|2|To communicate or make something known
CONVOY|2|A group of vehicles or ships traveling together for protection
COOKIE|2|A small, flat, sweet baked treat, often studded with chocolate chips
COOLER|2|Lower in temperature.
COPIES|2|Duplicates made to match an original
COPING|2|Dealing effectively with something difficult
COPPER|2|A reddish-brown metallic element used in wiring
COSMOS|2|The universe regarded as an orderly, harmonious system
COUNTS|2|Adds up a total, item by item
COUPLE|2|Two people or things considered together
COURSE|2|A set of classes or lessons on a particular subject
COURTS|2|Marked areas where tennis or basketball is played
COVERS|2|Places something over so as to protect or conceal it
CRACKS|2|Narrow fissures or splits in a surface
CRAPPY|2|Of very poor quality
CRATER|2|A bowl-shaped depression formed by volcanic activity or impact.
CREATE|2|To bring something into existence
CREEPY|2|Causing an unpleasant feeling of fear.
CRIMES|2|Acts that are punishable by law
CRINGE|2|To feel embarrassed
CRISIS|2|A time of intense difficulty or danger
CRITIC|2|A person who evaluates and judges the quality of books, films, or art.
CROWNS|2|Ornamental headpieces worn by monarchs
CRUISE|2|A pleasure voyage taken aboard a ship
CRYING|2|Shedding tears, often from sadness
CRYPTO|2|Informal short form for digital currency
CURSED|2|Afflicted by a supposed evil spell
CUTTER|2|A tool or blade designed for slicing material
CYCLES|2|Repeating series of events
DAMAGE|2|Physical injury that reduces value or usefulness
DANISH|2|Relating to Denmark or its people
DATING|2|Being romantically involved with someone over time
DEALER|2|A person who buys and sells particular goods
DEARLY|2|With deep affection or fondness
DEBATE|2|A formal discussion of opposing arguments
DEBRIS|2|Scattered fragments of something broken or destroyed
DEBUTS|2|First public appearances or performances
DECADE|2|A span of ten years
DECIDE|2|To make a final choice after weighing the options
DEFEAT|2|To win a victory over an opponent in a contest
DEFEND|2|To protect from attack or harm
DEFINE|2|To state the exact meaning of a word or term
DELAYS|2|Postpone or hold up.
DELUXE|2|Of a superior and more expensive kind
DEMAND|2|To ask for forcefully or insist upon
DENIES|2|States that something is not true
DENTAL|2|Relating to the teeth
DEPEND|2|To rely on for support or to be determined by
DEPICT|2|To show or represent something in a picture or story
DEPLOY|2|To move troops or resources into position for action
DEPUTY|2|A second-in-command or appointed substitute
DERIVE|2|To obtain something from a specified source
DESERT|2|A dry, barren region with very little rainfall
DESIGN|2|A plan or drawing showing how something is to be made
DETAIL|2|A small individual fact or feature
DETECT|2|To notice or sense the presence of something
DEVOID|2|Completely lacking or without
DEVOTE|2|To give one's time or resources wholly to a purpose
DIESEL|2|A heavy oil fuel used in some engines
DIFFER|2|To be unlike or distinct.
DIGEST|2|To break down food in the stomach and intestines
DINING|2|The activity of eating a meal, especially a formal one
DIVERT|2|To turn something aside from its course
DIVIDE|2|To separate something into parts or shares
DIVING|2|Jumping into water headfirst.
DONATE|2|To give something, especially to charity.
DONORS|2|People who give money, blood, or organs to help others.
DOOMED|2|Destined to fail or suffer a grim fate
DORSAL|2|Relating to the back of an animal's body
DOTTED|2|Marked with small spots or points
DOUBLE|2|Twice the usual amount or size
DOUBTS|2|Feelings of uncertainty about whether something is true or right.
DOZENS|2|Large numbers; groups of twelve
DRAINS|2|Pipes that carry away water or waste.
DRAMAS|2|Plays or films that deal with serious topics.
DRAWER|2|A box-like compartment that slides in and out of furniture
DRILLS|2|To perform repetitive exercises.
DRINKS|2|Beverages, especially the alcoholic kind
DRIVES|2|Operates and steers a motor vehicle
DRONES|2|Remote-controlled or autonomous flying aircraft
DUMPED|2|Got rid of something in a careless or abrupt way
DUTIES|2|Tasks or responsibilities required by a job or role
EAGLES|2|Large birds of prey known for keen eyesight
EASIER|2|Requiring less effort than before
EASILY|2|Without difficulty or effort
ECHOES|2|Reverberations of sound.
EDITED|2|Revised and corrected text for publication
EDITOR|2|Person who prepares and corrects text for publication
EFFORT|2|A vigorous attempt or exertion of strength
EIGHTH|2|Coming right after the seventh in a sequence
ELAINE|2|A common female name.
ELITES|2|Groups considered the best or most powerful in a society
EMAILS|2|Electronic messages sent from one computer user to another
EMERGE|2|To come out from a hidden or enclosed place
EMPIRE|2|A group of nations or peoples ruled by one supreme authority
EMPLOY|2|To hire someone for work.
ENABLE|2|To make something possible or feasible
ENCORE|2|An extra performance demanded by an audience
ENDING|2|The final part of a story or event
ENDURE|2|To suffer through something difficult without giving up
ENERGY|2|The capacity to do work or stay active
ENGINE|2|Machine that converts fuel into motion
ENTERS|2|To go into a place.
ENTIRE|2|Whole and complete, with no part left out
ENTITY|2|A thing that exists as a single, distinct unit
EQUALS|2|Is the same in value or amount as
EROTIC|2|Relating to or arousing sexual desire
ESCORT|2|To accompany someone.
ESSAYS|2|Short pieces of writing on particular subjects
ESTATE|2|A large area of land with a grand house
ESTEEM|2|Respect and admiration felt for someone
ETHNIC|2|Relating to a particular cultural or population group
EVELYN|2|A female given name.
EVENLY|2|In equal parts or amounts
EVENTS|2|Things that happen, especially notable ones
EVOLVE|2|To develop gradually over time
EXCEED|2|To go beyond a limit, expectation, or amount
EXCESS|2|An amount beyond what is needed or normal
EXCUSE|2|A reason offered to justify a fault or offense
EXODUS|2|A mass departure of people
EXOTIC|2|Strikingly unusual or foreign in appearance
EXPECT|2|To regard something as likely to happen
EXPERT|2|A person with great knowledge or skill in a field
EXPORT|2|To send goods to another country for sale
EXPOSE|2|Make something visible or known.
EXTEND|2|To make longer or larger; to stretch out
EXTENT|2|The range or degree to which something reaches
EXTRAS|2|Additional items or people.
FABRIC|2|Woven or knitted cloth
FACTOR|2|One element that contributes to a result
FADING|2|Becoming less visible.
FAIRLY|2|In a just and reasonable way
FAKING|2|Pretending to have or feel something that isn't real
FALLEN|2|Having dropped to the ground; no longer standing
FANDOM|2|The community of enthusiastic followers of a particular thing
FASTER|2|At a greater speed
FAULTS|2|Defects or mistakes
FAVORS|2|Shows preference for one option over others
FAVOUR|2|A kind or helpful act done for someone
FEEDER|2|A device that supplies food, often for birds
FELLOW|2|A man or boy; informally, a chap or companion
FELONY|2|A serious crime typically punishable by a long prison term
FEMALE|2|Of the sex that can bear offspring or lay eggs
FENCES|2|Structures that enclose an area.
FENDER|2|A protective panel covering a car's wheel arch
FIANCE|2|A man who is engaged to be married
FIBERS|2|Thread-like strands that make up a natural or synthetic material
FIELDS|2|Open stretches of land used for crops or pasture
FIERCE|2|Having a violent, aggressive, or intense nature
FIGHTS|2|Engages in combat or struggles against something
FIGURE|2|A written symbol for a number; a digit
FILING|2|A document submitted to an official record
FILLED|2|Made full or occupied completely
FILMED|2|Recorded moving images with a camera
FILTER|2|Device that removes unwanted particles from a liquid or gas
FINALE|2|The last part of a performance.
FINALS|2|The last, decisive rounds of a tournament
FINELY|2|In a delicate, precise, or thin manner
FINEST|2|Of the very highest quality; the best of all
FINISH|2|To bring a task to its end
FINITE|2|Having limits or bounds; not unlimited
FIRING|2|Discharging a gun
FIRMLY|2|In a strong or resolute manner.
FISHES|2|Catches aquatic creatures with a rod, net, or line
FITTED|2|Shaped to sit closely, as a tailored garment
FLAMES|2|Hot glowing bodies of ignited gas.
FLAVOR|2|The distinctive taste of a food or drink.
FLAWED|2|Having an imperfection or weakness
FLIGHT|2|A journey made through the air in an aircraft
FLUENT|2|Able to speak or write smoothly and with ease
FLUFFY|2|Light and airy in texture.
FLUIDS|2|Substances, such as liquids or gases, that can flow
FLYERS|2|Printed sheets handed out to advertise something
FOLDED|2|Bent something over on itself so the parts overlap
FORBID|2|To officially refuse to allow something
FORCED|2|Made to do something against one's will
FORMAL|2|Following established convention or proper etiquette
FORUMS|2|Places or online platforms for public discussion
FOSSIL|2|The remains of a prehistoric organism.
FOUGHT|2|Struggled against an opponent in the past
FOURTH|2|Coming after third in a sequence
FRANCE|2|A western European country whose capital is Paris
FREAKY|2|Strange or bizarre in an unsettling way
FREEZE|2|To turn to ice; or to stop moving suddenly
FRENCH|2|Relating to France, its people, or the language spoken in Paris
FRENZY|2|A state of wild excitement or uncontrolled activity
FRIDAY|2|The weekday that comes right before the weekend
FRONTS|2|The foremost part or surface.
FROZEN|2|Turned to ice or made extremely cold
FRUITS|2|The sweet, seed-bearing parts of plants, eaten as food
FUELED|2|Supplied with energy or power.
FUNDED|2|Provided with money to support a project
FUNGUS|2|A mushroom, mold, or yeast-like organism
GALAXY|2|Enormous gravitationally bound system of stars, gas, and dust
GAMBLE|2|A risky action taken in hope of a desired outcome
GAMERS|2|Players
GAMING|2|The activity of playing video or computer games
GATHER|2|To bring or come together in one place
GENDER|2|The state of being male, female, or another identity
GENIUS|2|Exceptional natural intellectual or creative ability
GENRES|2|Categories of artistic work, such as types of music or film
GENTLY|2|In a soft, careful, or mild manner
GERMAN|2|Relating to the country whose capital is Berlin
GETTIN|2|Informal spelling of 'obtaining', dropping the final letter
GHETTO|2|A part of a city occupied by a minority group, often due to poverty
GIANTS|2|Mythical beings of enormous size and strength
GIBSON|2|American brand of electric guitars, maker of the Les Paul
GIFTED|2|Having exceptional talent or ability
GIVING|2|Handing something over freely; generous
GLADLY|2|In a willing and happy manner
GLOBAL|2|Relating to or covering the whole world
GLUTEN|2|A protein found in wheat and other grains
GOLDEN|2|Resembling or made of a precious yellow metal
GOOGLE|2|To look something up using a web search engine
GOSSIP|2|Casual talk or rumors about other people's private lives.
GOVERN|2|To rule or control the affairs of a country or organization
GRADED|2|Assessed and assigned a mark or rank
GRADES|2|Marks awarded to students for their schoolwork
GRAINS|2|Small hard seeds of cereal plants, such as wheat or rice
GRAMMY|2|An annual award for outstanding achievement in the music industry
GRAPHS|2|Diagrams representing data.
GREASE|2|A thick oily substance used for lubrication
GREECE|2|Mediterranean nation often called the cradle of democracy
GREEKS|2|Citizens of a Mediterranean country famed for ancient philosophy and myth
GROOVE|2|A long, narrow channel or track cut into a surface
GROUPS|2|Collections of people or things gathered together
GROVES|2|Small clusters of trees, often cultivated
GROWTH|2|The process of increasing in size or amount
GUARDS|2|People who watch over and protect a place or person
GUIDED|2|Led or directed along a route
GUIDES|2|To direct or influence the course of.
GUTTED|2|Feeling extremely disappointed or upset
HABITS|2|Regular behaviors that become hard to give up
HACKER|2|Someone who breaks into computer systems without permission
HAILED|2|Greeted or acclaimed with great enthusiasm
HALVES|2|Two equal parts that together make a whole
HAMLET|2|A small village, especially one without its own church
HANDED|2|Passed or gave something directly to another person
HANGED|2|Suspended by the neck until dead.
HAPPEN|2|To occur or take place
HARBOR|2|A sheltered stretch of water where ships anchor safely
HARDEN|2|To become or make firm and rigid
HARDER|2|More difficult to do or endure
HASSLE|2|An annoying inconvenience.
HATERS|2|People who express excessive criticism or negativity toward someone
HATRED|2|Intense feeling of hostility or dislike
HAULED|2|Pulled or dragged with great effort
HAVING|2|Possessing or holding something
HEATED|2|Made warm, or charged with anger
HEATER|2|A device for warming air or water.
HEAVEN|2|The dwelling place of God and the blessed in many religions
HEBREW|2|the ancient Semitic language in which the Torah was written
HEIGHT|2|Measurement from base to top
HELIUM|2|A light, inert gas often used to fill balloons
HELMET|2|A protective headgear.
HEREBY|2|By this means or method.
HEROES|2|People admired for courage or noble deeds
HEROIN|2|A highly addictive opioid drug derived from morphine
HIDING|2|Keeping out of sight or concealing oneself
HIGHER|2|Greater in elevation or amount
HINDUS|2|Followers of a major religion originating in the Indian subcontinent
HINTED|2|Suggested something without stating it directly
HIRING|2|Taking someone on to do a job for pay
HITTER|2|A baseball player who is currently batting
HOLDER|2|A device or container that keeps something in place
HONEST|2|Free from deceit; telling the truth
HONORS|2|Special recognitions given for achievement
HONOUR|2|High respect or great esteem
HOOKED|2|Bent like a curve, or strongly addicted to something
HOPING|2|Wanting something to happen and expecting it might
HORROR|2|Intense feeling of fear or disgust
HOSTED|2|Acted as the organizer or entertainer for guests or an event
HOSTEL|2|A cheap, supervised lodging place, often for young travelers
HOTELS|2|Establishments offering paid lodging to travelers
HOTTER|2|Having a higher temperature.
HOUSED|2|Given a place to live or be kept
HUGELY|2|To a very great extent
HUMANE|2|Showing compassion or benevolence towards others
HUMANS|2|Members of the species Homo sapiens
HUNGER|2|A strong need or craving for food
HUNTED|2|To pursue and capture animals.
HUNTER|2|A person who chases and kills wild animals
HURDLE|2|An obstacle that must be overcome.
HUSTLE|2|Energetic activity or busy movement
HYBRID|2|The offspring of two different species or varieties
IGNORE|2|To deliberately take no notice of
IMAGES|2|Visual representations or pictures
IMMUNE|2|Protected against a disease; not susceptible
IMPACT|2|A forceful collision or a marked effect
IMPOSE|2|To force something unwelcome on someone
INCHES|2|Small units of length, twelve to a foot
INCOME|2|Money received regularly from work or investments
INDIAN|2|Relating to a large nation in South Asia
INDUCE|2|To bring about or give rise to.
INFLUX|2|An arrival or flowing in of a large number of things or people
INFORM|2|To give someone knowledge of a fact or situation
INJECT|2|To force a liquid into something using a syringe or similar device
INJURY|2|Physical harm or damage done to the body
INLAND|2|Situated away from the coast, toward the interior
INNATE|2|Existing in someone from birth rather than learned
INNING|2|A division of play in baseball during which each team bats once
INPUTS|2|Data or resources fed into a system or process.
INSECT|2|A small arthropod with six legs and three body parts
INSERT|2|To put something into something else.
INSIDE|2|Within the interior of something
INSIST|2|To demand something forcefully.
INSURE|2|To arrange financial compensation against future loss or damage
INTACT|2|Not damaged or altered.
INTAKE|2|Amount of something consumed or absorbed
INTEND|2|To plan or mean to do something
INTERN|2|A student or recent graduate gaining supervised work experience
INVEST|2|To put money into something in hope of a profit
ISAIAH|2|A major prophet in the Hebrew Bible.
ISSUES|2|Problems or matters of concern
ITUNES|2|Apple's digital media store and player, launched in 2001
JACKIE|2|A common female given name.
JAILED|2|To confine someone in a prison.
JERSEY|2|A knitted pullover or sports shirt worn by a team
JEWISH|2|Relating to Judaism or its people
JOCKEY|2|A person who rides horses in races.
JOINED|2|Became a member of, or linked together
JOINTS|2|Points in the body where two bones meet
JOKING|2|Making a humorous remark.
JOSEPH|2|Husband of Mary in the Nativity story
JOYFUL|2|Full of happiness and delight
JUDGED|2|Formed an opinion or conclusion about.
JULIET|2|A character from Shakespeare's play.
JUMPED|2|Pushed off the ground into the air (past tense)
JUMPER|2|British term for a knitted sweater
JUNGLE|2|Dense, tangled tropical forest
JUNIOR|2|Lower in rank, age, or seniority
JURORS|2|Members of a panel who decide a legal verdict
KANSAS|2|Sunflower State of the American Midwest
KARATE|2|A martial art developed in Japan.
KEEPER|2|A person who guards or protects.
KENYAN|2|East African
KERALA|2|A state on India's southwestern coast, known for its backwaters.
KERNEL|2|The edible part of a seed.
KICKED|2|Struck something with the foot
KICKER|2|In American football, the player who attempts field goals and extra points.
KIDNAP|2|To seize and hold a person unlawfully, often for ransom
KILLED|2|Caused the death of, at an earlier time.
KILLER|2|A person or thing that takes a life
KNICKS|2|NBA team based at Madison Square Garden
KNIGHT|2|Medieval armored warrior who fought on horseback
KNOCKS|2|To strike a surface to make a sound.
KOREAN|2|Relating to the people or language of a divided East Asian peninsula
KUWAIT|2|Small oil-rich nation on the Persian Gulf, invaded by Iraq in 1990
LABELS|2|Small tags attached to objects to give information about them
LABOUR|2|Hard physical work or effort
LACKED|2|Did not have enough of something needed
LADDER|2|A structure for climbing up or down.
LAGOON|2|A stretch of salt water separated from the sea by a sandbank or reef
LAKERS|2|Los Angeles's NBA basketball franchise
LANDED|2|Came down to the ground, as an aircraft
LAPTOP|2|A portable computer that folds shut for carrying
LARGER|2|Greater in size or amount
LASHES|2|The hairs that grow along the edge of the eyelid
LASTLY|2|Used to introduce the final point
LATELY|2|In the recent past; not long ago
LATEST|2|Most recent or up to date
LAUGHS|2|Makes sounds and movements that express amusement
LAVISH|2|Sumptuously rich, elaborate, or luxurious
LAWSON|2|Family name.
LAYERS|2|Sheets or thicknesses laid one over another
LAYING|2|Placing something down flat or in position
LAYOUT|2|The way in which something is arranged or set out
LEAGUE|2|An organized group of sports teams that compete against one another
LEARNT|2|Gained knowledge or skill through study or experience (British past tense)
LEASED|2|Rented property for a set period under a formal contract
LEASES|2|Legal contracts granting use of property for a set period in exchange for payment.
LEDGER|2|A book or digital record used for tracking financial transactions
LEGACY|2|Something handed down from a predecessor
LENGTH|2|The measurement of something from end to end
LENSES|2|Curved pieces of glass or plastic that focus light
LESSER|2|Smaller in size or importance than another
LESSON|2|A period of teaching, or something learned by experience
LETHAL|2|Sufficient to cause death
LIBYAN|2|Relating to the North African nation whose capital is Tripoli
LIFTED|2|Raised to a higher position
LIKELY|2|Expected to happen; probable
LIKING|2|A preference or fondness.
LIMITS|2|Boundaries beyond which something may not pass
LINEUP|2|A list of items or people arranged in order.
LINING|2|A layer of material covering the inner surface of something
LIQUID|2|A flowing substance that takes the shape of its container, like water
LITTLE|2|Small in size or amount.
LOADED|2|Filled with cargo, ammunition, or a heavy amount
LOCALS|2|People who live in a particular area.
LOCATE|2|To discover the exact place or position of something
LOGGED|2|Recorded formally in a book, file, or system
LONELY|2|Feeling sad because of isolation or lack of company
LONGER|2|Of greater length than something else
LOOKED|2|Directed one's eyes toward something
LOSING|2|Failing to win, as in a contest
LOUDLY|2|Noisily
LOVELY|2|Exquisitely beautiful or delightful
LOVERS|2|Two people in a romantic or intimate relationship
LOVING|2|Feeling or showing deep tenderness toward someone
LOWEST|2|Least high or smallest in amount of all
LUMBER|2|Wood that has been processed for use in construction.
LYRICS|2|The words that make up a song
MADAME|2|A French title of respect used before a married woman's name
MADDEN|2|To make someone extremely angry
MADRID|2|Capital city of Spain
MAIDEN|2|A young, unmarried woman, in older or literary usage
MAILED|2|Sent through the postal system
MAINLY|2|For the most part; chiefly
MAJORS|2|Military officers ranking above captains, in the plural
MAKERS|2|Those who create or manufacture things
MAKEUP|2|Cosmetics applied to the face
MAKING|2|The process of creating or producing something
MANAGE|2|To be in charge of or in control of
MANNED|2|Operated or staffed by a human crew, as opposed to automated
MANTRA|2|A word or phrase repeated during meditation
MANUAL|2|A book of instructions for using something
MAPPED|2|Plotted the layout of an area on paper
MARBLE|2|A type of stone used in sculpture and architecture.
MARGIN|2|The blank border around the text on a page
MARINA|2|A harbor specifically for small pleasure boats and yachts
MARINE|2|Relating to the sea
MARKER|2|An object used to indicate a position or boundary
MARROW|2|The soft fatty substance inside bones
MARVEL|2|A wonderful or astonishing thing
MASKED|2|Wearing a covering over the face for disguise or protection
MASSES|2|Large numbers of people, especially the ordinary population
MATING|2|The pairing of animals to reproduce
MATRIX|2|A rectangular array of numbers arranged in rows and columns
MATURE|2|Fully grown or developed
MAYHEM|2|Violent chaos or extreme disorder
MEADOW|2|A field of grass and wildflowers.
MEDALS|2|Awards given for achievement.
MEMOIR|2|A written account of one's own life
MEMORY|2|The faculty of recalling past events
MENTOR|2|An experienced advisor who guides a less experienced person
MERELY|2|Just that and nothing more
MERGED|2|Combined or united into a single entity
MESSED|2|To make a mistake or create disorder.
METERS|2|Metric units of length, or devices that measure amounts
METHOD|2|Technique
METRIC|2|A standard of measurement used to assess performance or quantity
MIGHTY|2|Possessing great power, strength, or size
MILDLY|2|To a moderate or gentle degree
MINERS|2|People who work extracting ore or coal from the ground
MINING|2|The extraction of coal or minerals from the ground
MISSED|2|Failed to hit, catch, or reach
MISSES|2|Fails to hit, reach, or catch something
MOBILE|2|Able to move or be moved freely
MODELS|2|Small-scale representations of larger objects
MODIFY|2|To change something slightly, often to improve it
MODULE|2|A self-contained component of a larger system
MONTHS|2|The twelve divisions of the calendar year
MORALE|2|The confidence and enthusiasm of a group at a given time
MORALS|2|Principles of right and wrong behavior
MORONS|2|Stupid or foolish people, in blunt slang.
MORTAL|2|human
MORTAR|2|A bowl in which substances are ground with a pestle
MOTION|2|The act or process of moving
MOTIVE|2|A reason that drives a person to act in a particular way
MOTORS|2|Machines that convert electrical energy into mechanical motion.
MOUNTS|2|Climbs up onto something, such as a horse.
MOZART|2|Famous Austrian composer of the Classical era
MURDER|2|The unlawful, deliberate killing of a person
MUSCLE|2|Body tissue that contracts to produce movement
MUSLIM|2|A follower of the religion of Islam
MUSTER|2|To summon up or gather together, especially with effort
MUTANT|2|A living being with an unusual genetic change
MUTUAL|2|Felt or held in common by two or more parties
NAILED|2|Fixed something in place with a pointed metal fastener
NAMING|2|The act of giving something a specific title or label
NARROW|2|Of small width in relation to length
NATION|2|A people united under one government
NATURE|2|The physical world and its living things
NAUSEA|2|A feeling of sickness with an urge to vomit
NEARBY|2|A short distance away
NEARLY|2|Almost but not quite
NEEDED|2|Required or called for
NEPHEW|2|The son of one's sibling.
NERVES|2|Fibers that transmit signals in the body.
NEURAL|2|Relating to nerves or the nervous system
NEVADA|2|A U.S. state known for its desert landscapes.
NICELY|2|In a pleasant or satisfactory manner
NICEST|2|Most pleasant or kind, superlative form.
NICKEL|2|A silvery-white metallic element
NIGHTS|2|The dark hours between sunset and sunrise
NIPPLE|2|Small protrusion on the breast through which milk is released
NOBLES|2|People of aristocratic rank
NORDIC|2|Relating to Scandinavia and its peoples.
NORMAL|2|Conforming to the usual standard or type
NORWAY|2|A Scandinavian country famous for its fjords
NOTICE|2|To become aware of something
NOVELS|2|Book-length works of prose fiction
NUMBER|2|A symbol or word used in counting
OBJECT|2|A material thing that can be seen or touched
OBTAIN|2|To get hold of or come to possess
OCCURS|2|Takes place or comes about
OFFEND|2|To cause someone to feel upset or annoyed.
OFFERS|2|Presents something for acceptance or refusal
OFFICE|2|A room or building where business or clerical work is done
OLDEST|2|Most advanced in age
ONWARD|2|continuing to move forward in space or time
OPENED|2|Unfastened or made accessible, in the past
OPENER|2|The first item or event in a sequence
OPTION|2|a choice or alternative
ORACLE|2|A person or shrine believed to deliver wise, prophetic answers
ORDEAL|2|Severe trial or test
ORDERS|2|Authoritative instructions that must be obeyed
OREGON|2|Pacific Northwest U.S. state with capital Salem
ORGASM|2|The climax of sexual excitement
ORIENT|2|To align or position oneself in relation to one's surroundings
ORIGIN|2|The point at which something begins
ORPHAN|2|A child whose parents are deceased.
OSCARS|2|Annual awards for cinematic achievements.
OSWALD|2|A male given name, also borne by an early animated rabbit character
OUNCES|2|Units of weight, sixteen of which make a pound
OUTFIT|2|A set of clothes worn together for a particular occasion
OUTLAW|2|A person who has committed a crime and is evading capture
OUTLET|2|A place to sell goods.
OUTPUT|2|Amount produced by a process or machine
OVERLY|2|To an excessive degree; too much so
OWNING|2|Having legal possession of something
PACKED|2|Filled to capacity; tightly crowded
PAIRED|2|Matched together in twos
PALACE|2|A large, grand residence of a monarch or ruler
PAMELA|2|A common female given name.
PANELS|2|Flat rectangular sections that form part of a door, wall, or device
PARDON|2|An official forgiveness for a crime
PARODY|2|A comic imitation of a serious work
PARTED|2|Separated or divided, as when two people go their own ways
PASSED|2|Went by, or succeeded in an examination
PASTOR|2|Minister in charge of a church congregation
PATROL|2|To keep watch by moving regularly around an area
PAVING|2|A hard surface material used for roads or paths
PAYDAY|2|The day when a person receives their salary
PEAKED|2|Reached the highest point or maximum level
PERIOD|2|A length or portion of time
PERMIT|2|To officially let something happen or be done
PETITE|2|Small and slim in build, typically describing a woman
PHARMA|2|Informal term for the drug-manufacturing industry
PHASES|2|Distinct stages in a process of change or development
PHELPS|2|A famous American swimmer.
PHOTOS|2|Images captured with a camera
PHRASE|2|A small group of words forming a unit of meaning
PICKED|2|Chose or selected from a group
PIECES|2|Separate parts of a whole
PIGEON|2|A common city bird with a cooing sound
PILLAR|2|A tall vertical structure used to support a building
PINNED|2|Fixed something in place with a small pointed fastener.
PIPING|2|A system of tubes used to carry liquid, gas, or sound
PIRACY|2|Robbery committed at sea, or illegal copying of copyrighted material
PIRATE|2|A criminal who attacks and robs ships at sea
PISTON|2|Cylindrical part that moves in an engine
PIXELS|2|The smallest individual elements of a digital image
PLACED|2|Set in a particular position
PLACES|2|Particular spots or locations
PLAGUE|2|A contagious disease that spreads rapidly causing many deaths
PLANET|2|A large body that orbits a star
PLANTS|2|Living organisms that grow in soil and photosynthesize
PLAQUE|2|A flat commemorative plate fixed to a wall
PLASMA|2|The fourth state of matter, consisting of ionized gas
PLATED|2|Coated with a thin layer of metal such as gold or silver
PLAYED|2|Took part in a game or sport, at an earlier time.
PLENTY|2|A large or more than sufficient amount
PLIGHT|2|a difficult or dangerous situation someone is in
PLUNGE|2|To dive or fall suddenly into water or another substance
PLURAL|2|Referring to more than one.
POETIC|2|Having the rhythm, imagery, or beauty of verse
POETRY|2|Literary writing arranged in metrical verse
POINTS|2|Units used to keep score in a game or contest.
POISED|2|Calm, composed, and self-assured
POISON|2|A substance that causes illness or death when taken in
POKING|2|Prodding someone or something with a finger or sharp object
POLISH|2|Make smooth and shiny by rubbing
POLLEN|2|Fine powder produced by plants for reproduction
POORER|2|Having less wealth or resources.
POORLY|2|In an inadequate or unsatisfactory manner
PORTER|2|A person employed to carry luggage.
POTATO|2|A starchy tuber eaten as a vegetable
POTENT|2|Having great power, force, or effect
POUNDS|2|Units of weight or of British currency
POWDER|2|A dry substance made of finely ground particles
PRAISE|2|An expression of approval or admiration
PRAYED|2|Spoke to a deity in worship or petition
PRAYER|2|A solemn appeal or words addressed to a deity.
PREACH|2|To deliver a religious or moral message publicly
PREFER|2|To like one thing better than another
PRETTY|2|Pleasing to look at in a delicate way
PRICED|2|Marked with a cost.
PRIEST|2|An ordained member of the clergy who performs religious rites
PRIMER|2|A basic introductory textbook on a subject
PRISON|2|a place for confinement of criminals
PRIZES|2|Awards given for achievement.
PROBES|2|Investigates or explores thoroughly
PROFIT|2|Financial gain remaining after costs are paid
PROMPT|2|Done quickly and without delay
PROPER|2|Correct
PROTON|2|Positively charged particle found in an atomic nucleus
PROVED|2|Demonstrated the truth of by evidence
PSEUDO|2|False or not genuine
PSYCHO|2|Informal term for a mentally disturbed or dangerously unstable person
PUBLIC|2|Relating to or open to the people as a whole
PUERTO|2|Spanish term for a port or harbor.
PULLED|2|Drew something toward oneself, in the past
PUMPED|2|Filled with excitement or energy
PUPILS|2|Children being taught at a school
PURITY|2|The state of being free from contamination or moral corruption
PURPLE|2|Of a color midway between red and blue
PURSUE|2|To follow in order to catch or overtake
PUSHED|2|Pressed forward with force
PYTHON|2|A large non-venomous constricting snake
QUARTZ|2|Hard crystalline mineral often used in jewelry and clocks
QUEBEC|2|A province in Canada.
QUEENS|2|Female monarchs; also a borough of New York City
QUIRKY|2|Characterized by peculiar or unusual traits
QUOTED|2|Repeated someone's exact words
RACING|2|The sport of competing in contests of speed
RACISM|2|Prejudice or discrimination based on ethnicity
RADIUS|2|The distance from the center of a circle to its edge
RAGING|2|Extremely violent or intense
RAIDED|2|Attacked suddenly to steal or search
RAISED|2|Lifted to a higher position
RAISES|2|Lifts something to a higher level or position
RANSOM|2|A sum of money demanded for the release of a captive.
RAPIDS|2|Fast-flowing, turbulent stretches of a river
RAPIST|2|A person convicted of committing a serious sexual assault crime
RAPPER|2|A musician who performs rhythmic spoken lyrics
RARELY|2|Not often; on very few occasions.
RATING|2|A score or classification based on quality or popularity
RATIOS|2|Quantitative relationships between two or more amounts
RAVENS|2|Large black corvids famed for intelligence and appearing in Poe's poetry.
REACTS|2|Respond to a stimulus
READER|2|One who peruses written material
REALLY|2|In fact; truly.
REALMS|2|Kingdoms or domains
REASON|2|A cause or explanation for an action or event
RECALL|2|To bring a past event back to mind
RECENT|2|Having happened only a short time ago
RECKON|2|To think or believe something is true
RECORD|2|The best performance or most extreme achievement ever attained
REDEEM|2|To exchange for something of value, or make amends for a fault
REDUCE|2|To make smaller in size, amount, or degree
REFLEX|2|An automatic, involuntary response of the body to a stimulus
REGAIN|2|To get something back after having lost it
REGGAE|2|Jamaican music genre with an offbeat rhythm
REGGIE|2|A common male given name.
REGION|2|An area of land with particular characteristics
REGRET|2|Feel sorrow or remorse over something done
REIGNS|2|Holds royal power and rules as monarch
RELICS|2|Objects surviving from an earlier time
RELIED|2|Depended on someone or something with trust
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
REOPEN|2|To begin operating again following a closure
REPAIR|2|To fix or mend something that is broken
REPEAL|2|To officially cancel a law or act.
REPEAT|2|Do or say something again
REPLAY|2|To show a recorded moment again, especially in sports
REPORT|2|An account giving information about an event or matter
RESIDE|2|To have one's permanent home in a particular place.
RESIGN|2|To give up a position or office.
RESIST|2|To withstand or refuse to give in to something
RESORT|2|Vacation destination with hotels and amenities
RESULT|2|The consequence or effect of an action or process
RESUME|2|To begin again after an interruption
RETIRE|2|To stop working for good, usually in later life
REVEAL|2|To make a secret or hidden thing known
REVIEW|2|A critical evaluation of a book or film
REVISE|2|To change or amend something, especially a piece of writing
REVIVE|2|To bring back to life, consciousness, or vigor.
REVOLT|2|To rise up in rebellion against authority
RHYMES|2|Matches another word in end sound
RHYTHM|2|A regular, repeated pattern of beats in music or movement
RIDDEN|2|Having been traveled on, as a horse or a bicycle
RIDDLE|2|A puzzling question posed as a game, with a clever answer
RIDERS|2|People who travel on a vehicle.
ACCEPTS|1|Agrees to receive or take something offered
ACTRESS|1|A woman who performs in plays or films
ADMIRED|1|Regarded with respect or approval
ADVISER|1|A person who gives expert guidance
AIRLINE|1|A company that provides air transport services.
AIRPORT|1|Place where planes take off and land
ALARMED|1|Filled with sudden fear or anxiety
AMUSING|1|Causing laughter or light entertainment
ANALYZE|1|To examine something in detail
ANIMALS|1|Living creatures other than plants or people
ANNOYED|1|Made mildly angry
ANTENNA|1|Device that sends or receives radio signals.
APPLAUD|1|To express approval by clapping
AQUATIC|1|Relating to or living in water
ARRIVES|1|Reaches a destination
ARTISTS|1|People who create paintings, music, or other creative works
ASPHALT|1|A dark, sticky substance used for surfacing roads
ATHLETE|1|A person trained to compete in sports
ATLEAST|1|Not less than a specified amount.
AUTHORS|1|Writers of books or articles
AWFULLY|1|Very or extremely, in informal speech
BAGGAGE|1|Bags and suitcases carried by a traveler
BALCONY|1|A platform projecting from a building's wall
BALLOON|1|A rubber bag inflated with air or gas, used as decoration or for flight
BANANAS|1|Long curved tropical fruits with soft yellow flesh.
BARGAIN|1|Something bought for less than its usual worth
BARKING|1|Making the sharp, loud sound a dog makes
BARRELS|1|Large cylindrical containers for storing liquids
BASKETS|1|Woven containers used for holding or carrying things
BATHING|1|Washing or soaking oneself in water
BATTING|1|The act of striking a ball in cricket or baseball
BEACHES|1|Sandy or pebbly shores by a body of water.
BEDDING|1|Sheets, blankets, and pillows used to make up where you sleep.
BEDROOM|1|A room used mainly for sleeping
BENCHES|1|Long seats for several people, often found in parks
BERNARD|1|a common male name.
BICYCLE|1|A vehicle with two wheels powered by pedaling.
BIOLOGY|1|The scientific study of living organisms
BISCUIT|1|A small, flat baked good, often eaten with tea
BITCHES|1|Female dogs
BLANKET|1|A large piece of woven fabric used for warmth in bed
BLAZING|1|Burning fiercely and brightly
BLENDED|1|Mixed thoroughly together into a smooth combination
BLINDED|1|Made unable to see
BLOGGER|1|Someone who publishes regular online journal entries.
BLOSSOM|1|A flower, especially one on a fruit tree
BLURRED|1|Made unclear or indistinct
BOILING|1|Heating a liquid until it bubbles and turns to vapour
BONUSES|1|Extra sums of money or rewards given in addition to what is expected
BOOKLET|1|pamphlet
BOOSTED|1|Increased or improved the level of something
BOREDOM|1|A feeling of weariness caused by lack of interest
BOULDER|1|A large detached rock lying on the ground
BOUQUET|1|A bunch of flowers arranged for beauty
BRITISH|1|Relating to the United Kingdom
BRUISED|1|Marked with a discolored area of skin from an impact.
BRUSHES|1|Tools used for painting or cleaning.
BUBBLES|1|Small spheres of gas enclosed in a thin film of liquid
BUCKETS|1|Cylindrical containers with a handle, used to carry liquids
BUDDIES|1|Close friends or companions.
BUILDER|1|A person whose job is to construct houses and other structures.
BULLDOG|1|A short, stocky canine breed known for its wrinkled, jowly face
BUNDLES|1|Groups of things tied, wrapped, or fastened together
BURGERS|1|Ground-meat patties served in a bun
BUTCHER|1|A person who sells meat
CABBAGE|1|A leafy green vegetable.
CAMERAS|1|Devices used to take photographs
CANDLES|1|Wax cylinders with a central wick, burned to give light.
CAPTAIN|1|The leader of a team or commander of a ship
CARAMEL|1|A chewy, golden-brown confection made from heated sugar
CARPETS|1|Thick fabric coverings for floors.
CARROTS|1|Orange root vegetables often eaten raw or cooked
CASHIER|1|An employee handling transactions.
CASINOS|1|Establishments where people gamble at games of chance
CASTLES|1|Large fortified buildings, often medieval residences of royalty
CEILING|1|The overhead surface of a room
CHAOTIC|1|In a state of complete disorder
CHAPTER|1|A main division of a book
CHARGER|1|A device that supplies power to a battery
CHASSIS|1|Vehicle frame structure
CHEAPER|1|Lower in price than the alternative
CHEATED|1|Acted dishonestly to gain an advantage
CHEERED|1|Shouted encouragement or approval
CHEMIST|1|A scientist who studies the properties of substances
CHERISH|1|To hold dear and care for tenderly
CHEWING|1|Biting and grinding food repeatedly with the teeth
CHICKEN|1|A common farm bird raised for eggs and meat
CHIMNEY|1|A structure for venting smoke from a fireplace.
CHOPPED|1|Cut into pieces with a sharp tool
CHUCKLE|1|To laugh quietly or to oneself
CLARITY|1|The quality of being clear and easy to understand
CLEANER|1|A person employed to tidy and sanitize a building
CLEANSE|1|To rid something of dirt, germs, or impurities
CLIMBED|1|Ascended using hands and feet
CLOTHES|1|Items worn to cover the body
COASTER|1|A small mat placed under a glass to protect a table
COCONUT|1|Large brown tropical fruit with a hard shell and white flesh
COLLECT|1|To gather things together in one place
COLOURS|1|Hues such as red, green and blue
COMEDIC|1|Relating to humor on stage or screen; funny in style
COMMENT|1|A spoken or written remark
COMPANY|1|A commercial business organization
COMPASS|1|An instrument with a magnetic needle that shows direction.
COMPUTE|1|To calculate a result mathematically
CONCERT|1|A live public performance of music
CONFESS|1|To admit that one has done something wrong
CONFUSE|1|To make someone unable to think clearly.
CONNECT|1|To join or link two things together
COOKIES|1|Small, flat, sweet baked treats
COOKING|1|The art or practice of preparing food with heat
COPYING|1|Reproducing something exactly
CORNERS|1|The points where two lines meet.
CORPSES|1|Dead bodies, especially of humans
COUNTRY|1|A nation with its own land and government
COURIER|1|A person who delivers messages or packages
COUSINS|1|Children of one's aunt or uncle.
CROOKED|1|Bent or twisted out of shape; not straight
CROSSES|1|Moves from one side of something to the other.
CURTAIN|1|A piece of fabric hung to cover a window or stage.
CUSHION|1|A soft bag filled with material for comfort.
DANCERS|1|People who move rhythmically to music, often performing
DANCING|1|Moving the body rhythmically to music
DANGERS|1|Possibilities of harm or injury
DAYTIME|1|The hours between sunrise and sunset
DELIVER|1|To bring and hand over to a recipient
DENTIST|1|A medical professional who treats teeth and gums.
DESCEND|1|To move from a higher place to a lower one
DESKTOP|1|A computer designed to sit on a table, not a laptop
DESSERT|1|A sweet course eaten at the end of a meal
DIAGRAM|1|A simplified drawing showing the structure of something
DIAPERS|1|Absorbent garments worn by babies, American term
DINNERS|1|The main evening meals of the day
DIPLOMA|1|a certificate awarded for completing a course of study
DISLIKE|1|To feel distaste or hostility toward something
DIVIDES|1|Splits something into separate parts
DOCTORS|1|Qualified medical practitioners
DOLPHIN|1|A highly intelligent marine mammal known for its playful behavior.
DOORWAY|1|An entrance to a room or building
DREAMED|1|Experienced imagery and stories while asleep
DRESSES|1|Women's one-piece garments
DRUMMER|1|A musician who plays percussion instruments
DUMBEST|1|Least intelligent; the most foolish (superlative)
EASIEST|1|Requiring the least effort or difficulty
ELEVATE|1|To raise something to a higher position
EMAILED|1|Sent a message electronically over the internet
EMPRESS|1|A female ruler of an empire
ENGLISH|1|The main language spoken in Britain and America
EVENING|1|The period of the day between afternoon and night
EXPLODE|1|To burst suddenly and violently
EXTINCT|1|No longer existing; having died out completely
FAILURE|1|A lack of success
FARMERS|1|People who grow crops and raise livestock
FARMING|1|The activity of growing crops and raising livestock
FATHERS|1|Male parents
FATIGUE|1|Extreme tiredness resulting from exertion
FEATHER|1|One of the light growths covering a bird's body
FESTIVE|1|Full of holiday cheer and celebration
FINGERS|1|The slender parts at the end of the hand
FISHING|1|The activity of catching creatures from the water
FITNESS|1|The state of being physically healthy and strong
FLAMING|1|On fire or blazing brightly
FLAVOUR|1|The distinctive taste of a food or drink
FLIGHTS|1|Journeys made through the air aboard planes
FLOATED|1|Rested or moved gently on the surface of a liquid
FLOODED|1|Covered or filled with an overflow of water
FLOWERS|1|Colorful blossoms of plants
FOLDING|1|Bending something over on itself
FOOLISH|1|Lacking good sense or judgment
FORGETS|1|Fails to remember something
FRAGILE|1|Easily broken or damaged
FREEZER|1|An appliance used to keep food at a very low, frozen temperature
FRIDAYS|1|The days of the week before Saturdays
FRIENDS|1|People you know well and like, but are not related to
FUNNIER|1|More amusing or comical than something else
FURNACE|1|An enclosed structure for burning fuel to generate heat
GALLONS|1|Units of liquid volume, each equal to four quarts
GARBAGE|1|Waste material that is thrown away
GEOLOGY|1|The scientific study of the Earth's structure and rocks
GESTURE|1|A movement of the body, especially the hands, to express meaning
GETAWAY|1|A short vacation or an escape from routine
GLITTER|1|To shine with a bright, shimmering, reflected light.
GORILLA|1|A large ape native to the forests of central Africa
GRANDPA|1|An affectionate, informal name for one's father's or mother's father
GRAVITY|1|The force that pulls objects toward the earth
GREETED|1|Welcomed someone with friendly words or a gesture
GRILLED|1|Cooked on a metal grid over direct heat
GROUPED|1|Arranged together into sets or categories
GUNFIRE|1|The repeated firing of guns
GUNSHOT|1|The firing of a firearm, or the loud sound it makes
HAIRCUT|1|The result of a visit to a barber or salon
HALLWAY|1|A passage inside a building connecting rooms
HANDING|1|Passing an object to someone directly
HATEFUL|1|Showing or provoking intense dislike
HAZARDS|1|Dangers or risks
HEADSET|1|A device worn on the ears, often with a microphone, for listening and speaking
HEALTHY|1|In good physical condition and free from illness
HEAVIER|1|Of greater weight
HELPFUL|1|Giving useful assistance
HIGHWAY|1|A main public road connecting towns and cities
HOPPING|1|Moving by jumping on one or both feet
HORRORS|1|Intense feelings of shock, dread, or disgust
HOSTAGE|1|A person seized and held captive to secure demands
HOTTEST|1|Having the highest temperature of all
HUNDRED|1|Ten times ten
HUNTERS|1|People who pursue and kill animals for food or sport
ILLNESS|1|A disease or period of being unwell
IMPRESS|1|To evoke admiration or respect in someone
IMPROVE|1|To make or become better
INCOMES|1|Money earned or received regularly
INDOORS|1|Inside a building.
INFANCY|1|The earliest stage of life or development
INFANTS|1|Very young children, especially babies
INFORMS|1|Gives someone facts or knowledge about something
INQUIRE|1|To seek information by asking
INSPECT|1|To examine closely, typically to check quality or condition.
INVADED|1|Entered a country or place by force with hostile intent
IPHONES|1|Popular touchscreen smartphones made by a California tech giant
ISLANDS|1|Bodies of land entirely surrounded by water
JACKETS|1|Short outer garments with sleeves
JACKPOT|1|A large cash prize in a lottery or game
JANUARY|1|The first month of the year
JERSEYS|1|Knitted pullover garments, often worn by sports teams
JEWELRY|1|Decorative items worn on the body, such as rings and necklaces
JOGGING|1|Running at an easy, steady pace for fitness
JOURNEY|1|An act of travelling from one place to another
KARAOKE|1|A form of entertainment where people sing along to recorded music
KENDALL|1|A name often used for both genders.
KETCHUP|1|Tomato-based condiment often paired with fries
KICKOFF|1|The start of a football match
KITCHEN|1|Room where meals are prepared
KITTENS|1|Young domestic cats
LANTERN|1|A portable light source.
LAUNDRY|1|Clothes and linens that need washing
LEAKING|1|Allowing liquid or gas to escape through a hole
LEISURE|1|Free time not occupied by work
LENGTHY|1|Very long in duration or extent
LETTERS|1|The individual symbols that make up the alphabet
LETTUCE|1|A leafy green vegetable often used in salads.
LIBRARY|1|A place where books are kept for reading or borrowing
LICKING|1|Passing the tongue over something
LINDSEY|1|A common given name.
LOBSTER|1|A large marine crustacean with prominent claws, prized as seafood
LOCKING|1|Securing a door or object so it cannot be opened
LOOSELY|1|In a relaxed, not-tight manner
LOWERED|1|Moved something down to a reduced height or position
LUCKILY|1|Fortunately, by good chance
LUGGAGE|1|Bags and suitcases used for traveling
LUNATIC|1|A person regarded as wildly foolish or insane
LUNCHES|1|Meals eaten around midday.
MAGNETS|1|Objects that create a field attracting iron and similar metals
MANNERS|1|Polite behavior observed in social situations
MANUALS|1|Reference books that give instructions on how to use something
MARKERS|1|Felt-tipped pens used for writing or drawing
MARKETS|1|Places where goods are bought and sold
MEASURE|1|Determine the size or amount of something
MEETING|1|A gathering of people for discussion
MERMAID|1|Mythical sea creature with a human upper body
MESSAGE|1|A piece of information sent from one person to another
MESSING|1|Making things untidy or disorganized
MIGRANT|1|A person who moves from one place to another, often for work
MIGRATE|1|To move from one region or habitat to another
MINDSET|1|A fixed way of thinking or attitude
MIRRORS|1|Surfaces that reflect an image
MISTAKE|1|An error in action, judgment, or belief
MONARCH|1|A hereditary ruler of a kingdom or empire, such as a king or queen.
MONDAYS|1|The days of the week that follow Sunday, plural form
MONKEYS|1|Playful tree-dwelling primates
MORNING|1|The early part of the day, before noon
MOSQUES|1|Islamic places of worship
MOTHERS|1|Female parents
MUSCLES|1|Bands of body tissue that contract to produce movement
MUSEUMS|1|Buildings where historical or artistic objects are displayed
MUSTARD|1|A pungent yellow condiment made from the ground seeds of a certain plant.
NAUGHTY|1|Badly behaved, especially said of a child
NEEDLES|1|Thin, pointed tools used for sewing
NEVILLE|1|Name
NOODLES|1|Long, thin strips of pasta
NOTICES|1|Public announcements or signs displayed for information
NURSERY|1|A room in a house set aside for young children
OBESITY|1|The condition of having excessive body fat
OCTOBER|1|The tenth month of the year
OCTOPUS|1|eight-armed marine creature famed for its intelligence
OFFLINE|1|Not connected to the internet
ONSTAGE|1|Performing on a stage
ORANGES|1|Round citrus fruits with a bright peel.
ORDERLY|1|Arranged in a neat, tidy, or methodical way
ORPHANS|1|Children whose parents have both died
OUTFITS|1|Sets of clothes worn together
OUTRAGE|1|Extreme anger or indignation
PACKAGE|1|A wrapped parcel prepared for sending
PACKETS|1|Small parcels or bundles containing items like sugar or seeds
PAINFUL|1|Causing physical or emotional hurt
PAINTER|1|An artist who creates pictures with pigments and a brush
PALETTE|1|A board on which an artist mixes colors
PARENTS|1|A person's mother and father
PATHWAY|1|A trail or route for walking
PEACHES|1|Sweet, fuzzy-skinned stone fruits with a large pit
PEACOCK|1|A large, colorful bird known for its iridescent, fan-shaped tail
PEANUTS|1|Legume seeds often roasted and salted as a snack
PENCILS|1|Thin sticks of graphite encased in wood, used for writing or drawing
PENGUIN|1|A flightless black-and-white seabird
PEPPERS|1|Vegetables that come in bell-shaped or fiery chili varieties
PERFECT|1|Having no flaws or errors at all
PHANTOM|1|A ghost or apparition
PICTURE|1|A painting, drawing, or photograph of something
PILGRIM|1|A person who travels to a sacred place for religious devotion
PILLARS|1|Tall vertical structures that support a building
PILLOWS|1|Soft cushions used to support the head while sleeping
PISTOLS|1|small firearms designed to be held in one hand
PITCHER|1|A container with a handle and spout, used for pouring liquids
PLANNER|1|A person or notebook used for organizing schedules
PLAYFUL|1|Full of fun and high spirits
POPCORN|1|A puffy snack made from heated maize kernels
POPPING|1|Making a short, sharp bursting sound
POPULAR|1|Admired or enjoyed by many people
POSTAGE|1|The fee required to send a letter or package through the mail
POTTERY|1|Craft of shaping and firing objects from clay
POULTRY|1|Domestic birds kept for eggs or meat
PRAIRIE|1|Large expanse of flat grassland, especially in North America
PRESSES|1|Applies steady force against something
PRINTER|1|A device that produces a paper copy of a computer document
PRISONS|1|Buildings where people are confined as punishment for crimes
PROTEST|1|A public demonstration objecting to something
PROUDLY|1|In a manner showing satisfaction and dignity.
PUDDING|1|A soft, sweet dessert
PUMPKIN|1|A large round orange squash often carved at Halloween
PUPPETS|1|Figures moved by strings or a hand to entertain
PUPPIES|1|Young dogs, typically playful and small.
PURSUED|1|Followed in order to catch or attain
QUARTER|1|One of four equal parts of a whole
QUARTET|1|A musical ensemble of four performers
QUICKLY|1|At a fast pace; without delay
RABBITS|1|Small, long-eared mammals known for rapid breeding.
RAILWAY|1|A track and system on which trains run
RAINING|1|Falling as water drops from the clouds
REBUILD|1|To construct something again after it has been damaged or destroyed
RECEIPT|1|A written or printed proof that money has been paid for goods or services.
RECIPES|1|Instructions for preparing food.
RECRUIT|1|A newly enlisted member of an organization, especially the military
REDDISH|1|Somewhat rosy or ruddy in hue
REFEREE|1|An official who enforces the rules in a sports match
REFRESH|1|To reload or update something to its latest state
REGIONS|1|Distinct areas or divisions of a country or the world
REJOICE|1|To feel or show great joy
RELEASE|1|To set free or let go
RENAMED|1|Given a different name than before
RENTING|1|Paying to use property owned by someone else
REPLIED|1|Answered or responded, especially in words
REPLIES|1|Responds to something said or written
RESCUED|1|Saved from danger or harm
RESTART|1|To begin again after a pause or interruption.
RESTING|1|Taking a break to relax or recover
RETHINK|1|To reconsider a plan or idea
REWRITE|1|To write something again in a different way
RICHEST|1|Having the greatest wealth of all
ROBBERS|1|People who steal from others, often using force or threats
RUBBISH|1|Waste material that is thrown away; trash.
RUNNERS|1|Athletes who compete in races
RUSHING|1|Moving or acting with great haste
SADNESS|1|A feeling of unhappiness or sorrow
SANDALS|1|Open shoes with straps, often worn in summer
SAUSAGE|1|Ground meat stuffed in a casing
SCENERY|1|The natural features of a landscape considered in terms of appearance.
SCRATCH|1|A shallow cut or mark on a surface
SCREAMS|1|Cries out in a loud, piercing voice
SEAFOOD|1|Fish and shellfish eaten as food
SEASIDE|1|The area adjacent to the sea.
SECONDS|1|Brief units of time, sixty to a minute
SELFIES|1|Photographs someone takes of themselves, typically with a smartphone
SELLERS|1|People or businesses that offer goods for sale
SENIORS|1|Older people, or students in their final year
SEVENTY|1|The whole number that comes right after sixty-nine
SEYMOUR|1|A male given name.
SHAVING|1|Removing hair close to the skin with a blade
SHELVES|1|Flat surfaces used for storing or displaying objects
SHORTEN|1|Make something less long in length or duration
SHOUTED|1|Spoke or called out very loudly
SHOWERS|1|Brief periods of rain
SHUFFLE|1|To mix a deck of cards
SILENCE|1|Complete absence of sound
SINGERS|1|People who perform music with their voices.
SINGING|1|Producing musical sounds with the voice
SISTERS|1|Female siblings of the same parents
SKATING|1|Gliding smoothly over ice or a hard surface on blades or wheels
SKYLINE|1|A city's building outline against the horizon
SLAPPED|1|Struck sharply with an open hand
SLEEVES|1|Parts of a garment that cover the arms
SMARTER|1|More intelligent or quick-witted, comparative form
SMASHED|1|Broke violently into pieces
SMELLED|1|Detected an odor using the nose
SMILING|1|Showing a happy expression by curving the mouth upward
SMOKERS|1|People who habitually use tobacco
SOARING|1|Rising rapidly and dramatically
SOBBING|1|Crying with short, gasping breaths
SOLDIER|1|A person who serves in an army
SPARKLE|1|To shine with small flashes of light
SPARROW|1|A small, common brown bird often found in gardens
SPEAKER|1|Person who addresses an audience
SPHERES|1|Round, ball-shaped three-dimensional objects
SPIDERS|1|Eight-legged creatures that spin webs
SPILLED|1|Let liquid escape from its container by accident
SPINACH|1|A dark leafy green vegetable rich in iron.
SPOUSES|1|Marriage partners, husbands or wives
SQUARES|1|Shapes with four equal sides and right angles
SQUEEZE|1|To press firmly from opposite sides
STABLES|1|Buildings where horses are kept and fed
STADIUM|1|A large sports arena with tiered seating for spectators
STERILE|1|Free from germs or infection
STICKER|1|A small adhesive label or picture
STIRRED|1|Mixed a substance using a circular motion
STOMACH|1|The organ where digestion of food begins.
STOPPED|1|Came to a halt; ceased moving
STREETS|1|Public roads running through a town or city
STRIPED|1|Marked with parallel bands of contrasting color
STRIPES|1|Bands of color or pattern running across a surface
STUDENT|1|Pupil
STUMBLE|1|To trip and nearly fall while walking
STYLISH|1|Fashionable and elegant in appearance
STYLIST|1|A professional who cuts, colors, and shapes hair for clients
SUMMERS|1|The warmest seasons of the year
SUNDAYS|1|The first or last days of the week, often a day of rest
SUNRISE|1|The moment daylight first appears over the horizon
SURFING|1|The sport of riding ocean waves while standing on a board
SURNAME|1|A family name shared by relatives
SWEATER|1|A knitted garment worn on the upper body for warmth
SWIMMER|1|A person who moves through water using their limbs
SYMPTOM|1|A physical or mental sign indicating a condition or disease
TABLETS|1|Flat touchscreen computers, plural
TAPPING|1|Striking something lightly and repeatedly
TATTOOS|1|Permanent designs created by inserting ink into the skin.
TEACHER|1|One who instructs students
TEACHES|1|Gives instruction or lessons to someone
TEMPLES|1|Buildings used for worship
TENANTS|1|People who pay rent to occupy a property
TERRACE|1|A flat paved area next to a house, used for sitting outside
TESTIFY|1|To give a formal statement of evidence, especially in court.
TEXTING|1|Sending written messages via mobile phone
THANKED|1|Expressed gratitude to someone
THEATER|1|Building where plays and films are presented to an audience
THIEVES|1|People who steal from others
THIRSTY|1|Feeling a need to drink
THREADS|1|Thin strands of fiber used for sewing or weaving.
THUNDER|1|The loud rumble that follows a flash of lightning
TIGHTEN|1|To make firmer, stricter, or less loose
TISSUES|1|Soft paper sheets used for blowing one's nose
TODDLER|1|A young child who has just learned to walk
TOILETS|1|Bathroom fixtures used for flushing away waste
TORNADO|1|A violently rotating column of air extending from a storm cloud to the ground
TOSSING|1|Throwing something lightly or carelessly
TOURIST|1|A person who travels for pleasure or sightseeing
TRACKER|1|A device or person that follows and monitors movement
TRACTOR|1|A powerful farm vehicle used for pulling machinery
TREASON|1|The crime of betraying one's own country, especially by aiding an enemy.
TRICKED|1|Deceived by a clever or dishonest scheme
TRIPPED|1|Stumbled and nearly fell
TRIVIAL|1|Of very little importance or value
TSUNAMI|1|A huge ocean wave caused by an underwater earthquake
TUESDAY|1|The day of the week that follows Monday
TUNNELS|1|Underground passages that allow travel through or under an obstacle
TURBINE|1|A machine that converts fluid flow into rotational energy
TURTLES|1|Reptiles with a hard shell that can retract their head and legs
TWELFTH|1|Coming next after eleventh in a sequence
UNARMED|1|Without a weapon
UNCLEAR|1|Not easy to understand or see clearly
UNICORN|1|A mythical horse-like creature with a single horn
UNLUCKY|1|Having or bringing bad fortune
UPWARDS|1|Toward a higher place or position
VACCINE|1|A substance used to stimulate the immune system.
VALERIE|1|A common female given name
VALLEYS|1|Low areas of land lying between hills or mountains
VANILLA|1|A flavoring made from the pods of a tropical orchid, common in desserts.
VEGGIES|1|Informal word for plant-based food items eaten as sides
VENDORS|1|People or companies that sell goods or services.
VILLAGE|1|A small rural settlement, smaller than a town
VILLAIN|1|The main evil character in a story or film
VINEGAR|1|A sour liquid used for flavoring or preserving food
VISIBLE|1|Able to be seen by the eye
VISIBLY|1|In a way that can be easily seen or noticed
VOLCANO|1|A mountain with an opening through which lava, ash, and gases erupt
WALKERS|1|People who travel on foot, often for exercise
WALKING|1|Moving on foot at an easy pace
WEALTHY|1|Having a great deal of money or assets
WEBSITE|1|A set of related pages accessed over the internet
WEDDING|1|A ceremony that unites two people in marriage
WEEKEND|1|Saturday and Sunday taken together
WEEPING|1|Shedding tears; crying
WHISKEY|1|A distilled alcoholic spirit made from fermented grain mash
WHISPER|1|To speak very softly using breath rather than the voice
WHISTLE|1|A small device that makes a high-pitched sound when blown
WINDOWS|1|Glazed openings in a wall that let in light and air
WINNERS|1|Those who come first in a contest
ABANDON|2|to leave behind.
ABILITY|2|The power or skill to do something
ABOLISH|2|To formally end a law, system, or practice
ABSENCE|2|State of being away or not present
ABUSING|2|Treating someone or something cruelly or improperly
ABUSIVE|2|Using cruel, insulting, or violent language or behavior
ACCENTS|2|Distinctive modes of pronunciation.
ACCOUNT|2|A record of money received and paid out by a bank or business
ACCUSED|2|Charged with having done wrong
ACCUSES|2|Formally charges someone with wrongdoing
ACHIEVE|2|To bring about or reach by effort
ACQUIRE|2|To come to possess or obtain something
ACRONYM|2|A word formed from the first letters of a longer phrase
ACRYLIC|2|A synthetic resin used in paints, fibers, and plastics
ACTIONS|2|Things that are done; deeds
ADAPTED|2|Changed to suit new conditions or a new medium
ADAPTER|2|A device that allows compatibility between different systems.
ADDRESS|2|The details of where someone lives or works
ADORNED|2|Decorated or made more beautiful
ADVANCE|2|To move forward or make progress
ADVISES|2|Offers suggestions about the best course of action
ADVISOR|2|A person who gives expert guidance
AFFECTS|2|Has an influence on or produces a change in something
AFRICAN|2|Relating to the world's second-largest continent
AIRWAYS|2|The passages carrying oxygen from the nose to the lungs
ALBERTA|2|A province in western Canada, capital Edmonton
ALCOHOL|2|Intoxicating ingredient in beer and wine
ALGEBRA|2|Branch of mathematics that uses letters and symbols to represent numbers in equations.
ALIGNED|2|Arranged in a straight line
ALLERGY|2|A condition in which the immune system reacts abnormally to a substance.
ALLOWED|2|Gave permission for something to happen
ALRIGHT|2|Satisfactory, though not especially good
AMATEUR|2|One who does something for love rather than pay
AMAZING|2|Causing great surprise or wonder; astonishing
AMENDED|2|Changed for the better; revised
AMERICA|2|Either continent of the Western Hemisphere, or the U.S. informally.
AMOUNTS|2|Quantities or sums of something
ANALOGY|2|A comparison between two things to explain or clarify
ANALYSE|2|To examine something methodically in detail
ANARCHY|2|A state of society with no government or law
ANATOMY|2|The bodily structure of an organism
ANCHORS|2|Heavy devices used to moor a ship to the seabed
ANCIENT|2|Belonging to the very distant past
ANDROID|2|A robot built to resemble a human being
ANGUISH|2|Severe mental or physical suffering.
ANGULAR|2|Having sharp corners; lean and bony in shape
ANOMALY|2|Something that deviates from what is standard or expected
ANOTHER|2|One more; an additional.
ANSWERS|2|Responses given to questions
ANTIQUE|2|Valued because of its considerable age
ANXIETY|2|A feeling of worry or unease about an uncertain outcome
ANXIOUS|2|Feeling worried, nervous, or uneasy about something
APOLOGY|2|An expression of regret for a wrong or offence
APOSTLE|2|One of the twelve original followers chosen by Jesus
APPAREL|2|Clothing, especially fine or formal wear
APPEARS|2|Comes into sight or becomes visible
APPLIED|2|Made a formal request, such as for a job or place
APPOINT|2|To formally choose someone for a job or role
APPROVE|2|To officially accept or sanction something
ARABIAN|2|Relating to the Middle Eastern peninsula bordered by the Red Sea and Persian Gulf
ARGUING|2|Exchanging opposing views, often heatedly
ARMORED|2|Covered or protected with defensive metal plating
ARRANGE|2|To put things in a proper order.
ARRESTS|2|Acts of officially detaining someone suspected of a crime
ARRIVAL|2|The act of reaching a destination
ARRIVED|2|Reached a destination
ARTICLE|2|A piece of writing in a newspaper, or a grammatical word like 'a' or 'the'
ARTWORK|2|Illustrations and images in a book or magazine
ASSAULT|2|A violent physical attack on a person or place
ASSISTS|2|To help or aid.
ASSUMES|2|Takes something to be true without proof
ATHEISM|2|Disbelief in the existence of God or gods
ATHEIST|2|A person who does not believe in the existence of a god
ATTEMPT|2|An effort made to achieve something
ATTENDS|2|Is present at an event or place
ATTRACT|2|To draw in or pull toward by some quality or force
AUCTION|2|A public sale where goods go to the highest bidder
AUDIBLE|2|Loud enough to be heard
AUSTRIA|2|A landlocked Alpine country whose capital is Vienna
AVENUES|2|Broad, often tree-lined city streets
AVOCADO|2|A pear-shaped fruit with rich green flesh and a large single seed
AVOIDED|2|Kept away from or prevented from happening
AWAITED|2|To wait for something to happen
AWARDED|2|Given officially as a prize, honor, or payment
AWESOME|2|Inspiring great admiration or awe
BAHRAIN|2|a small island nation in the Persian Gulf
BALANCE|2|An even distribution that keeps something steady and upright
BALLOTS|2|Papers or tickets used to cast a vote in an election
BANDITS|2|Armed robbers who typically operate in gangs, often in remote areas
BANGING|2|Making a series of loud, repeated knocks
BANKERS|2|People who manage money, loans, and accounts for a financial institution.
BANKING|2|The industry of institutions that hold and lend money
BANNERS|2|Large pieces of cloth with a message.
BANNING|2|Officially forbidding something
BANQUET|2|a formal meal for a large number of people
BARRIER|2|An obstacle that blocks movement or access
BASHING|2|Harsh, aggressive criticism of someone or something
BATSMAN|2|A cricket player whose job is to hit the ball with a wooden implement.
BATTERY|2|A portable source of stored electrical power
BATTLES|2|Sustained fights between opposing armed forces
BEATING|2|A severe physical thrashing or pummeling
BEATLES|2|A famous British rock band from Liverpool formed in the 1960s
BEDTIME|2|The time at which one goes to bed.
BEGGING|2|Asking urgently and humbly for something, especially money or food.
BEHAVED|2|conducting oneself in a proper manner
BEIJING|2|The capital city of China
BELFAST|2|Capital city of Northern Ireland
BELGIAN|2|Relating to a small Western European country famous for chocolate and waffles.
BELGIUM|2|Western European nation famous for waffles, chocolate and Brussels
BELIEFS|2|Things one accepts as true
BELIEVE|2|To accept something as true or real
BELONGS|2|Is owned by someone, or rightly fits in a place
BELOVED|2|Dearly loved; cherished above all others
BENDING|2|Curving or flexing something away from its straight form
BENEFIT|2|An advantage or profit gained from something
BENGALS|2|An NFL football team based in Cincinnati, Ohio
BERRIES|2|Small, juicy fruits.
BIDDING|2|The act of offering a price, especially at an auction.
BIGGEST|2|Greatest of all in size
BILLING|2|the process of invoicing customers
BIPOLAR|2|Marked by two opposite extremes or moods
BISHOPS|2|Senior clergy members in a church
BLADDER|2|The organ that stores urine before it leaves the body
BLAMING|2|Holding someone responsible for a fault
BLASTED|2|Destroyed or damaged by an explosion
BLATANT|2|Completely obvious and done without any attempt at concealment
BLENDER|2|A kitchen appliance used to mix or puree food
BLOCKED|2|Obstructed so nothing can pass through
BLOWING|2|Moving or being driven along by a current of air
BOARDED|2|Got onto a vehicle such as a ship or plane
BOMBING|2|An attack using explosive devices dropped or planted
BONDAGE|2|The condition of being enslaved or held captive
BOOKING|2|A reservation made in advance.
BOOMERS|2|People born in the population surge after World War II
BOOMING|2|Growing rapidly and successfully, as an economy or business
BORDERS|2|The dividing lines between two countries or regions
BOROUGH|2|An administrative district of a city, as in New York
BOTHERS|2|To disturb or annoy someone.
BOTTLED|2|Sealed a liquid inside a glass or plastic container
BOTTLES|2|Narrow-necked containers for holding liquids
BOTTOMS|2|the lower halves of a two-piece garment
BOUNCED|2|Moved up or away abruptly after striking a surface
BOUNDED|2|Moved forward with energetic leaps or jumps
BOWLING|2|A game of rolling a ball to knock down pins
BOYCOTT|2|To refuse to buy or participate in something as a form of protest.
BRACKET|2|A support projecting from a wall
BRAKING|2|Slowing or bringing a moving vehicle to a stop.
BRANDED|2|Marked with a hot iron to show ownership
BRAVERY|2|the quality of being courageous
BREADTH|2|The distance or extent from side to side
BREAKUP|2|The ending of a romantic relationship
BREASTS|2|The chest area of a female body
BREATHE|2|To draw air into the lungs and let it out again
BREWERS|2|People who make beer for a living
BREWERY|2|A facility where beer is produced.
BREWING|2|Making a drink such as beer or tea through steeping and boiling
BRIBERY|2|The crime of giving money or gifts to influence someone dishonestly
BRIDGES|2|Structures built to span rivers, roads, or valleys
BRIEFLY|2|For a short time; in few words
BRIGADE|2|A large military unit made up of several battalions
BROADLY|2|In a general way, without focusing on the details.
BROKERS|2|People who arrange deals between buyers and sellers
BRONCOS|2|Denver's NFL football team
BROTHER|2|A male child of the same parents
BROWSER|2|An application used to navigate and view pages on the internet.
BRUISES|2|Discolored marks on the skin caused by an impact
BUDGETS|2|Plans for how money will be spent over a period of time
BUFFALO|2|A large wild ox of Africa or North America
BUILDUP|2|A gradual increase or accumulation of something over time.
BULLETS|2|Projectiles fired from a gun.
BULLIED|2|Used strength or influence to intimidate someone weaker.
BULLIES|2|People who habitually intimidate weaker people
BURNING|2|On fire or giving off flames
BUSIEST|2|Having the most activity or work of all
BUSTING|2|Breaking apart or smashing something
BUTTONS|2|Small fasteners used to close clothing.
BUZZING|2|Making a continuous humming or vibrating sound
CABINET|2|A piece of furniture with shelves or drawers
CALCIUM|2|A chemical element essential for strong bones and teeth.
CALORIE|2|a unit of energy provided by food
CAMPING|2|The activity of staying in a tent or outdoors.
CANNONS|2|Large mounted guns that fire heavy projectiles
CANUCKS|2|Informal nickname for Canadians.
CAPITAL|2|The city that serves as the seat of a government
CAPSULE|2|A small soluble shell enclosing a dose of medicine.
CAPTION|2|A brief text describing an image or illustration
CAPTIVE|2|A person or animal held prisoner or confined.
CAPTURE|2|To take prisoner or catch by force
CARAVAN|2|A group of vehicles, or travelers, journeying together
CARDIAC|2|Relating to the heart
CARDIFF|2|Capital city of Wales
CAREFUL|2|Taking pains to avoid mistakes or harm
CARRIER|2|A person or thing that transports something
CARTOON|2|A humorous drawing or an animated film
CARVING|2|Cutting material such as wood or stone to create a design or shape
CASCADE|2|A small waterfall, often one of a series
CASTING|2|Choosing actors to fill roles in a film or play
CATALOG|2|A systematic list of items, often for sale
CATCHER|2|The baseball player positioned behind home plate
CATCHES|2|Takes hold of something moving through the air, typically with the hands.
CAUTION|2|Care taken to avoid danger or mistakes.
CAVALRY|2|Soldiers who fight on horseback
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
CHARITY|2|An organization set up to help those in need
CHASING|2|Running after someone or something in order to catch it
CHATTER|2|Rapid, informal talk about trivial matters
CHECKED|2|Examined something to confirm its accuracy or condition
CHIEFLY|2|For the most part; mainly
CHILLED|2|Made cold, as a drink or dish
CHINESE|2|Relating to the world's most populous nation
CHOICES|2|Options available for selection
CHOOSES|2|Picks one option from several available
CINEMAS|2|Places where films are shown.
CIRCLES|2|Round shapes, or groups of people with shared interests
CITIZEN|2|A legally recognized national of a country
CLARIFY|2|To make a statement or situation less confusing and more precise.
CLASHES|2|Violent disagreements or conflicts between opposing sides
CLASSES|2|Groups of pupils taught together, or distinct social ranks
CLEANED|2|Made free of dirt.
CLEANUP|2|The act of tidying or removing mess
CLEARED|2|Removed obstacles from, or declared free of blame
CLEARER|2|More easily seen, heard, or understood
CLEARLY|2|In a way that is easy to see or understand
CLICKED|2|made a short, sharp sound
CLIENTS|2|People who use the services of a professional or business
CLIMATE|2|The typical weather conditions of a region over time
CLINICS|2|Places where outpatients receive medical treatment or advice
CLOSEST|2|Nearest in distance or relationship
CLOSING|2|Bringing to an end or shutting up
CLUSTER|2|A group of similar things or people positioned closely together.
COACHED|2|Trained or instructed in a specific skill.
COACHES|2|People who train and direct athletes or teams
COASTAL|2|Located on or near the shore of the sea
COATING|2|A layer of a substance spread over a surface
COLBERT|2|Stephen ___, American late-night talk show host and satirist
COLLEGE|2|An institution for higher or professional learning
COLOGNE|2|A scented liquid for personal fragrance.
COLORED|2|Having been given a particular hue or tint
COLUMNS|2|Vertical sections in a table or a series of articles.
COMBINE|2|To join or merge two or more things into one
COMFORT|2|A state of physical ease and freedom from pain
COMMAND|2|An authoritative order to be obeyed
COMMITS|2|Pledges or promises to do something
COMMUTE|2|to travel regularly to and from a place
COMPACT|2|Closely packed together.
COMPARE|2|To examine two things to note similarities and differences
COMPETE|2|To strive against others for a prize or goal
COMPILE|2|To collect and assemble information from various sources
COMPOSE|2|To create or write, especially music or text
CONCEAL|2|To hide something from sight or knowledge
CONCEDE|2|To admit that something is true, often reluctantly
CONCERN|2|A feeling of worry or anxiety
CONCISE|2|Giving information clearly in few words
CONDEMN|2|To express strong disapproval of
CONDOMS|2|Protective sheaths used during intercourse.
CONFIRM|2|To establish the truth or correctness of something
CONFORM|2|To comply with rules, standards, or expectations
CONQUER|2|To overcome or take control of by force
CONSENT|2|Permission for something to take place
CONSIST|2|To be made up of specified parts
CONSOLE|2|To offer comfort to someone in grief
CONSULT|2|To seek information or advice from someone
CONSUME|2|To eat, drink, or use up
CONTACT|2|To get in touch with someone
CONTAIN|2|To have or hold within itself
CONTEST|2|A competition in which people try to win
CONTEXT|2|The circumstances that surround an event or statement
CONTROL|2|The power to direct or manage something
CONVENT|2|A building where a community of nuns lives
CONVERT|2|To change something into a different form or use
CORONER|2|An official who investigates the cause of unexplained deaths
CORRECT|2|Free from error; accurate
CORRUPT|2|Dishonest and willing to act illegally for personal gain
COSPLAY|2|The practice of dressing as a character from fiction
COSTUME|2|A set of clothes worn to look like someone or something else
COTTAGE|2|A small house, usually in the countryside.
COUNCIL|2|An assembly of people convened to advise or govern
COUNTED|2|To determine the total number of.
COUNTER|2|A flat surface in a shop or kitchen where business is done or food prepared
COUPLES|2|Pairs of people joined as romantic partners
COUPONS|2|Vouchers that entitle the holder to a discount
COURAGE|2|The ability to face danger without fear
COURSES|2|Programs of study at a college
COVERED|2|Placed something over to hide or protect
COWBOYS|2|Ranch workers known for herding cattle.
CRACKED|2|Having a break or fissure.
CRACKER|2|A thin, crisp biscuit, often eaten with cheese
CRAFTED|2|Made or built with skill
CRASHES|2|Violent collisions, especially involving vehicles
CRAVING|2|a strong desire for something
CREATED|2|Brought into existence
CREATES|2|Brings something new into existence
CREATOR|2|One who brings something into existence
CREDITS|2|The list of contributors shown at the end of a film
CRICKET|2|Bat-and-ball game played between two teams of eleven
CRIMSON|2|A deep red color.
CRITICS|2|People who review films, books, or art professionally
CROSSED|2|Moved from one side of something to the other
CROWDED|2|Filled with too many people or things.
CROWNED|2|Formally invested with a royal headpiece
CRUELTY|2|the quality of being deliberately harmful or causing suffering
CRUISER|2|A fast warship, or a car designed for relaxed long-distance travel
CRUISES|2|Travels by sea for pleasure
CRUSHED|2|Pressed or squeezed with force.
CUISINE|2|A style or method of cooking associated with a place
CULPRIT|2|The person responsible for an offense
CUNNING|2|Skilled at deception or trickery
CURATOR|2|A person in charge of a museum or collection.
CURIOUS|2|Eager to know or learn something
CURLING|2|A winter sport in which players slide stones across ice toward a target
CUTTING|2|Using a sharp tool to divide something
CYCLING|2|Biking
CYCLIST|2|biker
CYCLONE|2|A large storm system with winds rotating around a center of low pressure
DAMAGED|2|Harmed so as to reduce value or function
DARKEST|2|Having the least light.
DARLING|2|A dearly loved or cherished person
DEALERS|2|Individuals who sell goods.
DEAREST|2|Most beloved or precious
DEBATED|2|To discuss a subject in a formal manner.
DEBATES|2|Discuss opposing viewpoints.
DEBUTED|2|Made a first public appearance
DECADES|2|Periods of ten years each
DECEIVE|2|To mislead someone by deliberately making them believe something false
DECENCY|2|Behavior conforming to accepted standards of morality
DECIDED|2|Reached a conclusion or resolution about something
DECLARE|2|To state openly or officially
DEEPEST|2|Extending furthest down or inward; most profound
DEFEATS|2|Overcomes an opponent in a contest
DEFECTS|2|Flaws or imperfections in something
DEFENCE|2|The action of protecting something against attack
DEFENDS|2|Protects someone or something from attack or criticism
DEFENSE|2|The act of protecting against attack
DEFICIT|2|The amount by which spending exceeds income
DEFINES|2|States the precise meaning of a word or concept.
DEGREES|2|Units used to measure temperature or angles
DELAYED|2|Made later than expected; held up
DELETED|2|Removed or erased, especially from a document or file
DELIGHT|2|A feeling of great pleasure.
DENMARK|2|A Scandinavian country known for its Viking history.
DENYING|2|Refusing to admit that something is true.
DEPICTS|2|Shows or represents in a picture or story
DEPOSIT|2|A sum of money paid into an account or held as security
DESCENT|2|A movement from a higher to a lower place
DESERVE|2|To be worthy of or entitled to
DESIGNS|2|Plans or drawings showing how something is to be made
DESPAIR|2|A complete loss of hope
DESPISE|2|To feel intense dislike or contempt for
DESTROY|2|To ruin or wreck completely
DETAILS|2|The small individual facts or parts of something
DEVELOP|2|To grow or bring into being gradually
DEVICES|2|Pieces of equipment built for a particular purpose
DIALECT|2|Regional language variation
DIAMOND|2|The hardest natural gemstone
DIARIES|2|Books for recording daily events.
DIETARY|2|Relating to the food and drink a person consumes
DIFFERS|2|Is not the same as another
DIGGING|2|To break up and move earth or other material.
DILEMMA|2|A situation requiring a choice between equally undesirable options
DILUTED|2|Made less concentrated by adding a liquid
DIPPING|2|Putting something briefly into liquid
DIRECTS|2|To manage or guide something.
DISABLE|2|To turn off or prevent something from working
DISCORD|2|Disagreement or lack of harmony
DISCUSS|2|To talk about something in detail
DISEASE|2|A disorder of the body that impairs normal function
DISGUST|2|A strong feeling of dislike.
DISMISS|2|To send away or reject from consideration
DISPLAY|2|To show something prominently for others to see
DISPOSE|2|To get rid of something no longer needed
DISPUTE|2|A disagreement or heated argument
DISTANT|2|Far away in space or time
DISTURB|2|to interfere with the normal arrangement or functioning
DIVIDED|2|Separated into parts or groups
DIVORCE|2|The legal dissolution of a marriage
DODGERS|2|People who cleverly avoid something, like taxes or duties
DOLLARS|2|Units of U.S. currency, each worth one hundred cents
DONATED|2|Gave money or goods, especially to a good cause
DOUBLED|2|Made twice as large or numerous
DOUBLES|2|A tennis match with two players per side
DOUBTED|2|Felt uncertain about the truth of something
DOWNING|2|Swallowing a drink quickly and completely
DRAFTED|2|Conscripted for military service
DRAGGED|2|To pull along the ground.
DRAGONS|2|Mythical fire-breathing winged reptiles
DRAINED|2|Emptied of liquid, or extremely exhausted
DRASTIC|2|Extreme and having a sudden, serious effect
DRAWERS|2|Sliding storage compartments found in furniture
DRAWING|2|A picture made with pencil, pen, or crayon
DRESSED|2|Wearing clothes; attired
DRIFTED|2|Moved slowly, carried along by a current of air or water
DRILLED|2|Bored a hole into something, or trained through repeated practice
DRIVERS|2|People who operate vehicles
DRIVING|2|Operating and steering a motor vehicle
DROPPED|2|Let fall, often by accident
DROUGHT|2|A long period of abnormally low rainfall
DROWNED|2|Died from being unable to breathe underwater.
DRUNKEN|2|Affected by or characteristic of alcohol intoxication
DUCHESS|2|A noblewoman who is either married to a duke or holds that rank in her own right
DUMPING|2|Disposing of something in a careless or bulk manner
DURABLE|2|Able to withstand wear and last a long time
DYNASTY|2|A line of hereditary rulers
EAGERLY|2|In a way that shows enthusiasm or keen interest
EARLIER|2|At a time before the present moment
EARNEST|2|Showing sincere and serious intention
EARNING|2|Receiving money in return for work done
EASTERN|2|Situated in or facing the direction where the sun rises
ECLIPSE|2|An event where one celestial body blocks the light of another
ECOLOGY|2|The scientific study of organisms and their environment.
EDITION|2|a particular version of a publication
EDITORS|2|People who prepare written material for publication.
EDUCATE|2|To give intellectual or moral instruction to someone
EFFECTS|2|Results or consequences of an action
ELASTIC|2|Able to stretch and return to original shape.
ELDERLY|2|Advanced in years; rather old
ELECTED|2|Chosen for an office by vote
ELEGANT|2|Graceful and stylish in appearance or manner.
EMBASSY|2|The official residence and offices of an ambassador abroad
EMERALD|2|A green precious stone.
EMERGES|2|To come into view.
EMINENT|2|Famous and respected within a particular sphere.
EMOTION|2|A strong feeling such as joy, fear, or anger
EMPATHY|2|The ability to understand and share the feelings of another
EMPEROR|2|Sovereign ruler of an empire
EMPIRES|2|Extensive groups of states under one supreme authority
EMPLOYS|2|Gives paid work to; makes use of
EMPOWER|2|To give someone the authority or confidence to do something
ENABLED|2|Made something possible or gave the means to do it
ENABLES|2|Gives someone the means or authority to do something
ENDINGS|2|Concluding parts of a story
ENDLESS|2|Having or seeming to have no limit or finish
ENDORSE|2|To publicly express approval or support for something
ENGAGED|2|Having formally agreed to be married
ENGAGES|2|Occupies or attracts someone's attention
ENGINES|2|Machines that turn fuel or energy into motion
ENGLAND|2|The largest country of the United Kingdom
ENHANCE|2|To improve the quality or value of something.
ENJOYED|2|Took pleasure or delight in something
ENQUIRY|2|A formal request for information or an investigation
ENSURED|2|secured
ENSURES|2|To make certain that something will happen.
ENTERED|2|Came or went into a place (past tense)
EPISODE|2|A single installment of a TV or radio series
EQUALLY|2|To the same degree or extent
ERECTED|2|Built or put up, especially a structure
EROSION|2|The gradual wearing away of land or rock by wind, water, or ice
ERUPTED|2|Burst out suddenly and violently
ESCAPED|2|Broke free or got away from confinement
ESCAPES|2|Break free from confinement.
ESCORTS|2|Accompanies or guards someone during travel
ESTATES|2|Large properties with expansive grounds, often historic mansions.
ETHANOL|2|A type of alcohol used in fuel and beverages
ETHICAL|2|Conforming to accepted principles of right conduct
EVIDENT|2|Clearly seen or understood.
EVOLVED|2|Developed gradually over a long period
EXAMINE|2|To inspect closely and carefully
EXCERPT|2|A short extract taken from a piece of writing or music
EXCITED|2|Feeling great enthusiasm and eagerness
EXCLUDE|2|To leave out or keep from being included
EXCUSES|2|Reasons offered to justify a fault or explain away a mistake.
EXECUTE|2|To carry out or put a plan into effect.
EXHAUST|2|To use up all of one's energy or resources
EXHIBIT|2|An item put on public display in a gallery or museum
EXPANDS|2|To increase in size or volume.
EXPECTS|2|Regards something as likely to happen
EXPERTS|2|People with great skill or knowledge in a field
EXPIRED|2|No longer valid, having passed its end date
EXPIRES|2|Comes to an end or ceases to be valid
EXPLAIN|2|Make something clear by describing it in detail
EXPLORE|2|To travel through an unfamiliar place to learn about it
EXPORTS|2|Goods sold and shipped to another country
EXPOSES|2|Reveals something hidden or secret
EXTENDS|2|To increase in length or duration.
EXTREME|2|Reaching the highest or most severe degree
FABRICS|2|Materials made from fibers.
FACTORS|2|Whole numbers that divide evenly into another
FACTUAL|2|Accurate
FACULTY|2|The teaching staff of a school or college
FALCONS|2|Birds known for their speed and hunting skills.
FALLING|2|Moving downward, typically rapidly
FASHION|2|The prevailing style of clothing at a given time
FASTEST|2|Quickest of all
FAVORED|2|Preferred or given a special advantage over others
FEARFUL|2|Feeling afraid or anxious.
FEARING|2|To be afraid of something.
FEEDING|2|Giving food to a person or animal
FEELING|2|An emotional state or reaction
FEMALES|2|Individuals of the sex that can bear offspring
FENCING|2|A sport involving sword fighting.
FERTILE|2|Capable of producing abundant crops or offspring
FICTION|2|Literature describing imaginary events and people
FIGHTER|2|One who takes part in combat or boxing
FIGURED|2|Worked out by reasoning or calculation
FIGURES|2|Numerical symbols or written amounts
FILLING|2|The edible mixture enclosed inside a pie or sandwich
FILMING|2|The process of recording moving images with a camera
FILTERS|2|Removes impurities or unwanted elements, as a machine does to water or air.
FINALLY|2|After a long delay; at last
FINANCE|2|The management of money and investments
FINNISH|2|Relating to Finland or its people
FIREARM|2|A weapon that shoots bullets or shells
FIREFOX|2|A free, open-source web browser developed by Mozilla
FIRSTLY|2|Used to introduce the initial point in a list or argument
FIXTURE|2|A permanent fitting, or a scheduled sporting event
FLASHES|2|To appear suddenly and briefly.
FLAVORS|2|Distinct tastes.
FLEEING|2|Running away from danger or pursuit
FLIPPED|2|Turned over quickly with a sudden motion
FLOWING|2|Moving smoothly and continuously.
FOCUSED|2|Concentrating intently on a single thing
FOLIAGE|2|The leaves of plants, considered collectively
FOLLOWS|2|Comes after another in sequence or pursuit
FOOTING|2|A secure grip or balance while standing
FORCING|2|Compelling someone to do something against their will
FOREIGN|2|Belonging to a country other than one's own
FOREMAN|2|A person in charge of a group of workers.
FORESTS|2|Large areas densely covered with trees
FOREVER|2|For all future time, without ending
FORGIVE|2|To stop feeling resentment toward someone who has wronged you
FORMATS|2|Particular arrangements or layouts in which something is presented
FORMING|2|Bringing into being or shaping into a structure
FORMULA|2|A rule or relationship expressed in symbols
FORTUNE|2|A very large amount of money or wealth
FORWARD|2|Toward the front or in advance
FOSSILS|2|Preserved remains of ancient organisms
FOUNDED|2|Set up or brought into being, as an institution
FREAKED|2|Reacted with sudden alarm or panic
FREEING|2|Releasing someone or something from captivity
FREEWAY|2|A major highway.
FRONTAL|2|Relating to or located at the forehead or facing side
FULFILL|2|To carry out or achieve a duty or promise
FULLEST|2|Most complete or maximum in extent
FUNDING|2|Money supplied to support a project or program
FUNERAL|2|A ceremony held to honour a person who has died
FURIOUS|2|Extremely angry.
GADGETS|2|Small mechanical or electronic devices.
GALLERY|2|A room or building used for displaying works of art
GARDENS|2|Cultivated plots where flowers or vegetables grow
GARLAND|2|A decorative wreath of flowers or leaves
GARMENT|2|An item of clothing.
GATEWAY|2|An entrance or means of access to a place.
GAZETTE|2|A newspaper or official publication.
GENITAL|2|Relating to the reproductive organs
GENUINE|2|Truly what it is said to be; not fake
GETTING|2|Obtaining or coming to have something
GLACIAL|2|Relating to ice, or extremely cold
GLACIER|2|A large mass of ice moving slowly.
GLAMOUR|2|An alluring and exciting quality
GLASSES|2|A pair of lenses worn to aid or correct vision
GLIMPSE|2|A brief or partial view of something
GLOWING|2|Emitting a steady light without flame
GLUCOSE|2|A simple sugar that is a key energy source in living organisms
GOODIES|2|Attractive or desirable items, especially treats or gifts
GRABBED|2|Seized suddenly and roughly with the hand
GRADERS|2|Heavy machines used to level and smooth road surfaces
GRADING|2|The process of assessing and scoring work
GRADUAL|2|Happening slowly over time, in stages
GRAMMAR|2|The system of rules governing a language
GRANDMA|2|The mother of one's mother or father, informally
GRANITE|2|A hard, speckled igneous rock used in construction
GRANTED|2|Formally given or bestowed
GRAZING|2|Feeding on growing grass in a field
GREATLY|2|To a very large degree or extent
GRENADE|2|A small explosive device thrown or launched by hand
GRIFFIN|2|Mythical creature with an eagle's head and wings on a lion's body
GROCERY|2|Of or relating to a store selling food and household goods
GROUNDS|2|Solid residue left after brewing coffee
GROWERS|2|People or businesses that cultivate crops or plants
GROWING|2|Increasing in size or amount over time
GUARDED|2|Cautious and reluctant to reveal information
GUESSED|2|Estimated an answer without being certain
GUIDING|2|Showing the way or providing direction
GUITARS|2|Six-stringed musical instruments played by strumming or plucking
HACKERS|2|People who gain unauthorized access to computer systems
HACKING|2|The act of gaining unauthorized access to computer systems
HALFWAY|2|At or near the midpoint between two places
HANDBAG|2|A case usually carried by women for holding daily essentials
HANDFUL|2|As much as the palm can hold
HANDLED|2|Dealt with or managed a situation
HANDLER|2|A person who trains or manages an animal or a public figure
HANDLES|2|Deals with or manages a situation
HAPPIER|2|In a more contented or joyful state than before
HAPPILY|2|In a cheerful and contented manner
HARBOUR|2|A sheltered body of water where ships dock.
HARDEST|2|Most difficult of all
HARMFUL|2|Causing or capable of causing damage.
HARNESS|2|A set of straps for controlling or securing something
HARVARD|2|Ivy League university in Cambridge, Massachusetts
HARVEST|2|To gather crops from the fields.
HASHTAG|2|A word or phrase preceded by the # symbol used to categorize online posts
HAUNTED|2|Frequented by a ghost
HEADING|2|A word or phrase set at the top of a section
HEATHER|2|A purple-flowering shrub common on moorland
HEATING|2|System that keeps a building warm in winter
HEAVENS|2|The sky, especially as seen at night
HEIGHTS|2|High places or elevated positions
HELMETS|2|Protective headgear.
HEROINE|2|A woman admired for exceptional courage or achievements.
HERRING|2|A small silvery fish often smoked or pickled
HIDEOUS|2|Extremely ugly or unpleasant to look at
HIGHEST|2|Greatest in elevation, rank, or degree
HISTORY|2|The study of past events, especially in human affairs
HITTING|2|Striking something with force
HOBBIES|2|Activities done for pleasure during free time.
HOLDERS|2|Items used to support or contain something.
HOLIDAY|2|A day of festivity or recreation when no work is done
HONESTY|2|The quality of being truthful.
HONOURS|2|Special awards or recognitions given for achievement
HOPEFUL|2|Feeling or showing optimism about the future
HORIZON|2|The line at which the earth's surface and the sky appear to meet
HORMONE|2|A regulatory chemical released by a gland into the bloodstream
HOSPICE|2|A residential facility offering comfort care to the terminally ill
HOSTILE|2|Unfriendly and openly antagonistic
HOSTING|2|Acting as the one who entertains guests
HOTLINE|2|A direct telephone link for emergencies or urgent inquiries
HUGGING|2|Wrapping one's arms around someone affectionately
HUNTING|2|The activity of pursuing and killing wild animals
HURDLES|2|Obstacles in a race.
HURTING|2|Experiencing or causing physical pain
HUSBAND|2|A married man, in relation to his spouse
HYGIENE|2|The practice of maintaining health through cleanliness
IDEALLY|2|In a perfect or most desirable situation
IGNORED|2|Refused to take any notice of
IGNORES|2|To pay no attention to.
ILLEGAL|2|Forbidden by law
IMAGINE|2|Form a mental picture of something not present
IMAGING|2|The process of producing a visual representation, as in medicine
IMMENSE|2|Extremely large in size, extent, or degree.
IMPLANT|2|A device surgically inserted into the body
IMPORTS|2|Goods or services brought into a country from abroad for sale.
IMPULSE|2|A sudden strong urge to act without thinking
INCLUDE|2|To contain or comprise as part of a whole
INDIANS|2|People native to the subcontinent of South Asia
INHERIT|2|To receive money, property, or a title from someone who has died
INITIAL|2|Occurring at the very beginning; first
INJURED|2|Having suffered physical harm or damage to the body
INMATES|2|People confined in a prison or institution
INQUIRY|2|An official investigation into a matter
INSECTS|2|Small arthropods with six legs.
INSIDER|2|A person with privileged access to private information
INSIGHT|2|A deep and accurate understanding of a person or situation
INSPIRE|2|To fill someone with the urge to do something.
INSTALL|2|To put equipment or software in place ready for use
INSTANT|2|A precise moment of time; also, happening immediately
INSTEAD|2|As an alternative or substitute
INSULIN|2|Hormone that regulates blood sugar levels
INSURED|2|Protected financially against loss or damage
INSURER|2|A company that provides financial protection against loss or damage.
INTEGER|2|A whole number, positive, negative, or zero
INTENDS|2|Plans or means to do something
INTENSE|2|Extreme in degree, strength, or force
INTERIM|2|A temporary arrangement or period.
INVITES|2|Asks someone politely to attend an event or function
IRANIAN|2|Relating to a country whose capital is Tehran
ITALIAN|2|Relating to a southern European nation famed for pasta, opera, and Renaissance art
JAKARTA|2|Capital and largest city of Indonesia
JEALOUS|2|Resentful of another's success or advantages
JOINTLY|2|In combination or together with another, sharing responsibility
JOURNAL|2|A daily personal record of events; a diary
JUBILEE|2|A special anniversary celebration, often marking 25 or 50 years
JUDGING|2|Forming an opinion or evaluation
JUMPING|2|Pushing off the ground into the air
JUNIORS|2|People who are younger or lower in rank than others
JUPITER|2|The largest planet in our solar system
JUSTICE|2|Fair and lawful treatment of people
KEEPERS|2|People or things worth retaining
KEEPING|2|Retaining possession of, or continuing to have, something
KEYNOTE|2|The main theme or the principal address at a conference
KICKING|2|Striking out with the foot
KIDDING|2|Speaking in jest rather than seriously
KIDNEYS|2|Paired organs that filter waste from the bloodstream
KILLERS|2|people who unlawfully take the lives of others
KILLING|2|The act of causing death
KISSING|2|Touching with the lips.
KNIGHTS|2|Medieval mounted warriors in armor
KNOCKED|2|Struck with a sharp blow, as on a door
KOREANS|2|Natives or citizens of a divided East Asian peninsula nation
LABELED|2|marked with a descriptive tag or name
LAPTOPS|2|Portable personal computers.
LARGELY|2|For the most part; mainly
LARGEST|2|Of the greatest size within a group
LATERAL|2|Relating to the side rather than the front or back
LAUGHED|2|Showed amusement with audible sounds
LAWSUIT|2|A claim brought before a court for resolution
LAWYERS|2|Trained professionals who advise clients and argue cases in court
LAYERED|2|Arranged in overlapping levels
LEADERS|2|Those who guide or command others
LEADING|2|Most important or foremost in its field
LEAGUES|2|Organized groups of teams that compete in a sport
LEANING|2|A tendency or inclination toward a particular belief
LEASING|2|To rent something, especially property.
LEATHER|2|Durable material made from treated animal hide
LEAVING|2|Going away from a place
LECTURE|2|A formal spoken presentation given to teach an audience
LEGALLY|2|In a manner permitted by law
LEGENDS|2|Traditional stories regarded as historical but unverified; also greatly admired people
ABNORMAL|1|Deviating from what is normal or usual
ADHESIVE|1|A substance used for sticking objects together
ADVISORS|1|People who provide expert guidance or counsel
AGITATED|1|Feeling troubled, nervous, or worked up.
AGREEING|1|Having the same opinion as someone else
AIRCRAFT|1|A machine built for flight, such as a plane or helicopter
AIRPLANE|1|A powered flying vehicle with fixed wings
ALPHABET|1|The set of letters used to write a language
ALTITUDE|1|Height above sea level
AMBITION|1|A strong desire to achieve success or a particular goal
ANSWERED|1|Responded to a question
ANTIQUES|1|Old objects valued for their age or craftsmanship
APPENDIX|1|A section of supplementary material at the end of a book or document
APPLAUSE|1|Approval expressed by clapping
ARRIVALS|1|People or things that have just reached a destination
ASSEMBLE|1|To gather people or things together, or fit parts into a whole
ATTRACTS|1|Draws interest, attention, or something toward itself
BACKPACK|1|A bag carried on the shoulders
BACKYARD|1|The area of land behind a house
BALLOONS|1|Inflatable rubber decorations often filled with air or helium.
BALLROOM|1|A large room used for formal dancing
BAPTIZED|1|Initiated into a church through a ceremony involving water
BARBECUE|1|An outdoor meal cooked over an open fire or grill
BAREFOOT|1|Not wearing any shoes or socks
BASEBALL|1|A bat-and-ball game played by two teams of nine players
BASEMENT|1|A floor or room below ground level
BATHROOM|1|A room with a toilet and washing facilities
BEGINNER|1|A person just starting to learn a skill
BEVERAGE|1|A drink of any kind, especially other than plain water.
BIBLICAL|1|Relating to or found in Christian and Jewish scripture
BICYCLES|1|Two-wheeled vehicles propelled by pedaling.
BIRTHDAY|1|The yearly anniversary of the day one was born
BLANKETS|1|Warm coverings used on a bed
BLENDING|1|Mixing different things together so they combine smoothly
BLOGGERS|1|People who regularly publish posts on personal websites
BLOGGING|1|Writing and publishing entries on a personal website
BORROWED|1|Took something with the intention of returning it
BRACELET|1|An ornamental band or chain worn around the wrist.
BRIGHTLY|1|In a way that gives off a strong, vivid light
BROCCOLI|1|A green vegetable with tightly clustered edible flower buds
BROTHERS|1|Male siblings sharing the same parents
BRUNETTE|1|A woman with dark brown hair
BUILDERS|1|People who construct houses or other structures
BUILDING|1|A structure with walls and a roof
CABINETS|1|Storage cupboards with doors and shelves
CAFFEINE|1|A natural compound in coffee that boosts alertness
CALORIES|1|Units measuring the energy in food
CANCELED|1|Called off or annulled an event
CARNIVAL|1|A festive public celebration, often with parades and rides.
CARTOONS|1|Humorous drawings or animated films
CASSETTE|1|A small plastic case containing magnetic tape for recording sound
CAUTIOUS|1|Careful to avoid potential problems or dangers
CEILINGS|1|The overhead interior surfaces of rooms
CEMETERY|1|A place where dead people are buried
CHAMPION|1|The overall winner of a competition or contest
CHAPTERS|1|Numbered divisions of a book
CHARGERS|1|Devices that supply power to batteries
CHATTING|1|Talking casually and informally with someone.
CHEAPEST|1|Lowest in price
CHEERING|1|Shouting in approval or encouragement
CHICKENS|1|Domesticated fowl kept for their eggs and meat.
CHILDISH|1|Immature or silly, like a young kid
CINNAMON|1|A warm, sweet spice made from the bark of a tropical tree.
CLAPPING|1|Striking hands together to show approval
CLEANERS|1|People or products used for removing dirt
CLEANING|1|The act of removing dirt or mess
CLOTHING|1|Garments worn on the body
COLLEGES|1|Institutions of higher education
COLORFUL|1|Full of bright hues and variety
COLORING|1|The act of adding hue to something.
COLOURED|1|Having a particular hue; not plain black or white
COMPETED|1|Took part in a contest against rivals
COMPOSER|1|A person who writes music
COMPUTER|1|Electronic device for processing data
CONCLUDE|1|To bring something to an end; to finish
CONFIRMS|1|Establishes the truth of something
CONNECTS|1|Joins or links two or more things together
CONSUMED|1|Ate, drank, or used up completely
CONTESTS|1|Competitions or struggles for victory
CONTINUE|1|To keep doing something without stopping
COOKBOOK|1|A book filled with recipes
CORRIDOR|1|A long passage in a building connecting rooms
COSTUMES|1|Sets of clothes worn to represent a particular character or period.
COTTAGES|1|Small, cozy houses, often found in the countryside
COUGHING|1|Expelling air from the lungs with a sudden sharp sound
CRAFTING|1|Making or shaping something skillfully by hand
CRIMINAL|1|Person who has broken the law
CUCUMBER|1|A long green salad vegetable, also pickled to make gherkins
CUPBOARD|1|A small closet used to store dishes, food, or supplies
CUPCAKES|1|Small individual cakes, often topped with frosting
CURTAINS|1|Pieces of fabric hung to cover a window
CYCLISTS|1|People who ride bicycles
DAUGHTER|1|A female child in relation to her parents
DAYLIGHT|1|Natural light from the sun
DECEMBER|1|The twelfth and final month of the year
DECORATE|1|To make something more attractive by adding ornaments
DEDICATE|1|To devote time or resources wholly to a purpose
DEFERRED|1|Postponed
DELETING|1|Removing text, files, or data permanently
DELIVERS|1|Brings and hands over goods to a recipient.
DESERTED|1|Empty and abandoned by people
DESTROYS|1|Ends the existence of something by damaging it beyond repair.
DINOSAUR|1|An extinct reptile that once dominated the Earth
DIPLOMAT|1|An official who represents a country abroad
DISCOUNT|1|A reduction from the usual price
DISCOVER|1|To find or learn of something for the first time
DISTRUST|1|A lack of confidence in someone
DOLPHINS|1|Intelligent marine mammals known for their playful leaps.
DOORSTEP|1|A step leading up to the outer door of a house
DOWNHILL|1|Sloping toward the bottom, or in a declining direction
DREADFUL|1|Extremely bad or unpleasant
DREAMING|1|Having thoughts and images while asleep
DRILLING|1|Making a hole using a rotating tool
DRIVEWAY|1|A private road leading from a street to a house or garage
DROPPING|1|Letting something fall to the ground
DROWNING|1|Dying from being submerged in water
DUMPSTER|1|A large metal container used for holding waste
EARRINGS|1|Pieces of jewelry worn on the lobe or edge of the ear
EDUCATOR|1|A person who teaches or trains others, especially professionally
EIGHTEEN|1|The number after seventeen
ELEPHANT|1|Large grey mammal with a trunk and tusks
ELEVATOR|1|A platform or compartment that carries people between floors of a building.
EMBRACES|1|Hugs someone tightly
EMPLOYEE|1|A person hired to work for a company
ENERGIES|1|Capacity for physical or mental exertion
ENTRANCE|1|A door or passage by which one enters
ENVELOPE|1|A flat paper container for a letter
ESPRESSO|1|Strong coffee brewed by forcing steam through fine grounds
EXERCISE|1|Physical activity done to stay fit
EXPLAINS|1|Makes something clear or easy to understand
EXPLODED|1|Burst apart violently, often with a loud noise
EXPLODES|1|Bursts apart suddenly and violently
EXPLORER|1|A person who travels to discover unknown places
EYEBROWS|1|Hairy arches above each eye that show expression
FAREWELL|1|An expression of good wishes when parting
FARMLAND|1|Area used for growing crops or raising livestock
FEATHERS|1|The light, flat growths covering a bird's body
FEBRUARY|1|The second month of the year
FINALIST|1|A competitor who reaches the last round of a contest
FLAVORED|1|Given a distinctive taste by adding an ingredient
FLAVOURS|1|Distinctive tastes of different foods or drinks
FOOTBALL|1|A popular team sport played with a ball
FOREHEAD|1|The part of the face above the eyebrows
FORTRESS|1|A large stronghold built for defense
FORWARDS|1|In a direction that is ahead
FOURTEEN|1|The whole number that comes right after thirteen.
FREEDOMS|1|Rights to act, speak, or think without restraint
FRIENDLY|1|Kind and pleasant toward others
GARDENER|1|A person who tends and cultivates plants
GASOLINE|1|Fuel used to power most cars
GIGANTIC|1|Extremely large in size
GRABBING|1|Seizing or taking hold of something suddenly
GRACEFUL|1|Having elegance or beauty of movement
GRANDSON|1|The son of your son or daughter
GRAPHITE|1|A soft form of carbon used in pencil leads
GREATEST|1|The very best of all
GREETING|1|A word or gesture of welcome
GUARDING|1|Protecting or watching over something
GUESSING|1|Estimating an answer without certain knowledge
HALFTIME|1|The break in the middle of a game, dividing it into two periods
HANDBOOK|1|A small reference guide with instructions
HANDMADE|1|Made by hand rather than by machine
HARMLESS|1|Not able or likely to cause injury or damage
HEADLINE|1|Bold title at the top of a news story
HELPLESS|1|Unable to defend or take care of oneself
HELSINKI|1|The capital city of Finland
HIGHLAND|1|Mountainous area, especially in Scotland
HIGHWAYS|1|Major public roads connecting cities and towns.
HOMEMADE|1|Crafted personally rather than bought in a store
HOMEPAGE|1|The default introductory screen of a website
HOMETOWN|1|the town or city where a person was born or raised
HOMEWORK|1|School assignments to be completed outside of class
HONDURAS|1|A Central American country bordered by Guatemala and Nicaragua.
HORRIBLY|1|In a very unpleasant or terrible way
HOSPITAL|1|Place where the sick and injured are treated
HUMIDITY|1|The amount of moisture present in the air.
HUSBANDS|1|Married men, in relation to their spouses
IDENTITY|1|Who a particular person is
IMMATURE|1|Not fully grown or developed
IMPROVES|1|Makes or becomes better in quality
INCOMING|1|Arriving or about to arrive
INFORMAL|1|Relaxed and casual, not following strict rules or conventions
INSERTED|1|Placed or put something into something else
INSOMNIA|1|A habitual inability to fall or stay asleep
INTERNET|1|The global network linking computers worldwide
INTERVAL|1|A pause or break between events
ITALIANS|1|People from a Mediterranean boot-shaped country
JEALOUSY|1|A feeling of resentment against someone because of their success or advantages
JOURNEYS|1|Trips from one place to another
KANGAROO|1|A large hopping marsupial native to Australia
KATHLEEN|1|A common female given name.
KINDNESS|1|The quality of being friendly, generous, and considerate
KITCHENS|1|Rooms in a home used for preparing meals
KNITTING|1|Craft of making fabric from yarn with two needles
LANDLORD|1|A person who rents out property to tenants
LAUGHING|1|Expressing amusement with sound and a smile
LAUGHTER|1|The sound or act of expressing amusement
LEARNERS|1|People who are acquiring knowledge or a new skill
LEFTOVER|1|Remaining after the rest has been used
LEMONADE|1|A sweet drink made from citrus juice, water, and sugar
LISTENER|1|A person who pays close attention to sound or speech
LITERACY|1|The ability to read and write
LOCATING|1|Finding the exact position of something
MAGICIAN|1|A performer of conjuring tricks and illusions
MAINTAIN|1|Keep something in good condition
MATERNAL|1|Relating to a mother
MATTRESS|1|A large padded surface used for sleeping on a bed
MEDICINE|1|A substance taken to treat or prevent illness
MISCHIEF|1|Playful troublemaking that causes minor harm
MISSILES|1|Weapons that are fired or thrown at a target
MOISTURE|1|Water or other liquid present in small quantities, often in the air
MONARCHY|1|A form of government headed by a king or queen
MONITORS|1|Screens that display computer output
MONSTERS|1|Large, frightening imaginary creatures
MONUMENT|1|A structure built to commemorate a notable person or event
MORNINGS|1|The early parts of days, before noon
MOSQUITO|1|A small flying insect known for biting.
MOUNTAIN|1|A large natural elevation of the earth's surface
MULTIPLY|1|To increase greatly in number or amount
MURDERER|1|A person who unlawfully kills another
MUSCULAR|1|Having a strong, well-toned physique
MUSHROOM|1|A fungus with a cap-and-stem shape, some varieties edible
MUSTACHE|1|Hair grown above the upper lip
NARRATOR|1|The person who tells the story in a book, film, or play
NECKLACE|1|A piece of jewelry worn around the throat
NEWCOMER|1|A person who has recently arrived somewhere
NICKNAME|1|An informal name used instead of someone's real one
NINETEEN|1|The number after eighteen.
NOTEBOOK|1|A pad of blank or ruled pages for writing
NOVELIST|1|A person who writes long works of fiction
NOVEMBER|1|The eleventh month of the year
OBSTACLE|1|Something that blocks progress or achievement
OPTIMISM|1|Hopefulness and confidence about the future
OPTIONAL|1|Available as a choice rather than compulsory
ORGANISE|1|To arrange systematically or put into order
OUTDATED|1|No longer in current use or fashion
OUTDOORS|1|In the open air, not inside a building.
PACKAGES|1|Parcels wrapped for mailing or delivery
PAINTERS|1|Artists who create pictures using pigments and a brush
PANCAKES|1|Flat cakes made from batter and cooked on a griddle.
PANICKED|1|Overwhelmed by sudden, uncontrollable fear
PARENTAL|1|Relating to a mother or father
PAYCHECK|1|A sum of money given regularly to an employee for work performed
PEACEFUL|1|Free from disturbance; calm and quiet
PENGUINS|1|Flightless, tuxedo-colored birds found mostly in Antarctica
PHARMACY|1|A store that sells prescription medicines
PODCASTS|1|Digital audio programs available for streaming or download.
POLITELY|1|In a courteous or respectful manner
POSTCARD|1|A piece of mail sent without an envelope, usually with a picture on the front
POSTPONE|1|To delay an event to a later time.
POWERFUL|1|Having great strength or influence
PREACHED|1|Delivered a religious or moral message publicly
PREVENTS|1|Stops something from happening
PRINCESS|1|Daughter of a king or queen
PRINTERS|1|Machines that produce text or images on paper
PROBLEMS|1|Difficulties needing a solution
PROMPTLY|1|Without delay, immediately
PROTECTS|1|Keeps someone or something safe from harm
PUNCHING|1|Striking something with a closed fist
QUANTITY|1|An amount or number of something
QUITTING|1|Giving up or resigning from something
REACTING|1|Responding to a stimulus or event
RECHARGE|1|To restore energy or power to something
RELAXING|1|Calming and reducing tension or stress
RELIEVED|1|Feeling reassured after anxiety or distress has passed
RELOCATE|1|To move to a new place, especially for work or business
REMINDER|1|Something that helps you remember
REPLACES|1|Takes the place of something else
RESTROOM|1|A public toilet facility
REVIEWER|1|A person who critiques books, films, or products
SALARIES|1|Fixed regular payments made by an employer to an employee
SALESMAN|1|A man whose job is to sell products or services
SANDWICH|1|Food made of a filling between two slices of bread
SANITARY|1|Relating to conditions that affect health, especially cleanliness
SATURDAY|1|The day of the week between Friday and Sunday
SCISSORS|1|A tool used for cutting.
SCORPION|1|A desert arachnid with a venomous stinger on its tail
SCREAMED|1|Cried out in a loud, high-pitched voice
SEARCHES|1|Looks thoroughly in order to find something
SHOPPING|1|The activity of buying goods from stores
SHORTAGE|1|A state of not having enough of something
SHOULDER|1|The joint connecting the arm to the torso
SHUTTING|1|Closing something, such as a door or lid
SIBLINGS|1|One's brothers or sisters
SICKNESS|1|The state of being ill
SIDEWALK|1|A paved path for pedestrians alongside a street
SIMPLIFY|1|To make something easier to understand or do
SKELETON|1|The bony framework of a body
SLIPPERS|1|Soft, comfortable shoes worn indoors
SLIPPING|1|Losing one's footing and sliding
SMARTEST|1|Having the most intelligence or cleverness
SNEAKERS|1|Casual shoes designed for sport, comfort, or everyday wear
SOOTHING|1|Having a gentle, calming effect.
SOUVENIR|1|An object kept as a reminder of a place, event, or person
SPILLING|1|Accidentally letting liquid pour out of its container
SPITTING|1|Forcefully ejecting saliva from the mouth
SPONSORS|1|People or companies that fund an event or activity, plural
SPRAYING|1|Applying a liquid in fine droplets over a surface
SPRINKLE|1|To scatter small drops or particles over something
SQUIRREL|1|Small bushy-tailed rodent that hoards nuts
STADIUMS|1|Large venues with tiered seating for sports events
STARVING|1|Extremely hungry
STATIONS|1|Places where trains or buses stop for passengers
STICKERS|1|Adhesive labels or decorations
STRANGER|1|A person one does not know
STUBBORN|1|Refusing to change one's mind despite good reasons
STUDENTS|1|People who attend a school or college to learn
STUFFING|1|A mixture used to fill something, such as a turkey before roasting
SUCCEEDS|1|Achieves a desired aim or result
SUNLIGHT|1|Natural daytime illumination coming from outdoors
SUNSHINE|1|Direct light from the sun
SUPPLIER|1|A business or person that provides goods or materials to others.
SWEATING|1|Perspiring heavily from heat, exertion, or nerves
SWIMMERS|1|People who propel themselves through water using their limbs
SWITCHES|1|Devices used to turn electrical circuits on or off.
TEACHERS|1|People who instruct students in a school
TEAMMATE|1|A person who plays on the same side as you in a sport or activity.
TEAMWORK|1|Combined, coordinated effort by a group.
TEENAGER|1|A young person between the ages of thirteen and nineteen
TERRIBLE|1|Extremely bad or unpleasant
TERRIBLY|1|In a very bad or severe way
TERRIFIC|1|Extremely good or impressive
TEXTBOOK|1|A book used for studying a particular subject, especially in schools.
THANKFUL|1|Feeling or expressing gratitude
THANKING|1|Expressing gratitude toward someone
THEATERS|1|Buildings where plays, films, or performances are staged.
THEATRES|1|Buildings where plays and live performances are staged
THIRTEEN|1|One more than a dozen
THOUSAND|1|The number equal to ten hundreds
THRILLED|1|Filled with excitement or pleasure
THURSDAY|1|The day of the week following Wednesday
TODDLERS|1|Young children who have recently learned to walk
TOLERATE|1|To accept or endure something unpleasant without complaint.
TOMATOES|1|Red, juicy fruits often used in salads and sauces
TOMORROW|1|The day following today
TOURISTS|1|People traveling for pleasure and sightseeing
TRAVELED|1|Journeyed from one place to another
TREASURE|1|A store of valuable objects, gold, or wealth
TRIANGLE|1|A shape with three sides and three angles
TRIPPING|1|Stumbling or losing one's balance while walking
TROPHIES|1|Prizes awarded for winning a competition
TRUSTEES|1|People appointed to manage property or funds on behalf of others.
TRUTHFUL|1|Inclined to speak honestly at all times
TUTORIAL|1|An instructional guide or lesson
TWEETING|1|Posting short messages on a social media platform
TWILIGHT|1|The soft glowing light in the sky after sunset or before sunrise
UMBRELLA|1|A folding device carried for protection from rain
UNIFORMS|1|Matching outfits worn by members of a group or organization
UNLOCKED|1|Freed from a fastened, secured state
UNWANTED|1|Not desired or welcome
UPSTAIRS|1|On or to a higher floor of a building
VANISHED|1|Disappeared suddenly and completely
VILLAGES|1|Small rural communities, larger than hamlets but smaller than towns
VILLAINS|1|Characters who represent evil or wrongdoing in a story
VINEYARD|1|A plot of land planted with grapes for making wine
VISITORS|1|People who come to see a place or person
VLADIMIR|1|A common Russian male given name
VOCALIST|1|A person who sings, especially in a band
WAITRESS|1|A woman who serves food in a restaurant.
WARDROBE|1|A large cabinet for storing clothes
WARNINGS|1|Statements or signs alerting someone to possible danger
WARRANTY|1|A written guarantee promising repair or replacement
WATERING|1|Supplying land or plants with moisture to help them grow
WEAKENED|1|Made less strong or powerful
WEAPONRY|1|Military arms and equipment collectively.
WEDDINGS|1|Ceremonies where two people are married
WEEKENDS|1|Saturdays and Sundays, taken together
WOODLAND|1|An area of land covered with trees
WORKOUTS|1|Sessions of physical exercise.
WRECKING|1|Destroying or badly damaging something
WRESTLER|1|An athlete who competes in a sport involving grappling and throwing opponents
YEARBOOK|1|An annual publication recording a school's events and graduates
ABSOLUTE|2|Total and complete, with no exceptions or limits
ABSORBED|2|Fully engrossed or deeply engaged in something
ABUNDANT|2|Existing or available in large quantities
ACADEMIA|2|The environment or community concerned with education.
ACCEPTED|2|Received or agreed to something willingly
ACCESSED|2|Gained entry to or retrieved data or a place.
ACCIDENT|2|An unfortunate event happening by chance
ACCOUNTS|2|Statements of money received and paid out
ACCURATE|2|Correct in every detail; free from error
ACCUSING|2|Suggesting that someone has done something wrong
ACHIEVED|2|Successfully reached or attained a goal
ACTIVATE|2|To make something operational or functional.
ACTIVISM|2|The use of vigorous campaigning to bring about social or political change
ACTIVIST|2|One who campaigns for social or political change
ACTIVITY|2|Something a person does for interest or recreation
ADAPTING|2|Adjusting to new conditions.
ADAPTIVE|2|Capable of changing to suit new circumstances
ADDICTED|2|Unable to stop doing something habitually, or physically dependent on a substance.
ADDITION|2|The act of combining numbers to make a sum
ADEQUATE|2|Enough in quantity or good enough for a purpose
ADJUSTED|2|Altered slightly to achieve a better fit or result
ADMITTED|2|Acknowledged something as true, often reluctantly
ADOPTING|2|Legally taking a child as one's own
ADORABLE|2|Inspiring great affection; delightfully charming
ADVISERS|2|People who provide guidance or recommendations.
ADVOCACY|2|Public support for a particular cause or policy
AFFECTED|2|Had an impact on; made a difference to
AFFLUENT|2|Having a great deal of money or wealth
AFFORDED|2|Had enough money to pay for something
AFRICANS|2|People native to or living on the world's second-largest continent
AIRBORNE|2|Flying or floating in the atmosphere
AIRLINES|2|Companies that operate passenger flights
AIRPORTS|2|Facilities where aircraft take off and land, with terminals for passengers.
ALARMING|2|Causing fear or anxiety about a possible danger
ALLEGING|2|Claiming that something is true without offering proof
ALLERGIC|2|Having a bad physical reaction to a particular substance
ALLIANCE|2|A union formed for mutual benefit, especially between nations
ALMIGHTY|2|Having absolute power over everything
ALUMINUM|2|A lightweight silvery metal used in cans and foil
AMATEURS|2|People who take part in an activity for pleasure rather than pay.
AMERICAN|2|Relating to the United States
AMERICAS|2|The landmasses of the Western Hemisphere, north and south combined
ANALYSED|2|Examined something closely to understand it, in British spelling
ANALYSTS|2|People who examine data or information in detail
ANALYZED|2|Studied something carefully to understand its parts or meaning
ANCESTOR|2|A person from whom one is descended
ANCESTRY|2|One's family or ethnic descent.
ANCHORED|2|Held firmly in place by a heavy device dropped to the seabed
ANIMATED|2|Full of spirit and movement
ANNOUNCE|2|To make something known publicly and formally
ANNOYING|2|Causing slight anger or mild exasperation
ANNUALLY|2|Once each year; on a yearly basis
ANYWHERE|2|In or to any place at all
APERTURE|2|An opening, especially one controlling light into a camera
APOSTLES|2|The twelve chief followers of Jesus Christ
APPARENT|2|Clearly visible or obvious
APPEALED|2|Made an earnest request
APPEARED|2|Came into view
APPETITE|2|A natural desire to satisfy a bodily need, especially for food
APPROVAL|2|Official agreement that something is acceptable
APPROVED|2|Officially accepted or sanctioned
APPROVES|2|Officially agrees to or sanctions something
ARCHIVED|2|Placed into long-term storage as a historical record.
ARCHIVES|2|A collection of preserved historical documents or records
ARGUMENT|2|A heated disagreement, or a reason offered in support of an idea
ARRANGED|2|Put in order, or planned in advance
ARRESTED|2|Seized by the police, or brought to a sudden stop
ARRIVING|2|Reaching a destination
ARROGANT|2|Having an exaggerated sense of one's own importance
ARTERIES|2|Blood vessels that carry oxygenated blood away from the heart
ARTICLES|2|Written pieces published in a newspaper or magazine
ARTIFACT|2|An object made by a human, especially one of historical interest
ARTISTIC|2|Showing natural skill or taste in the arts
ARTWORKS|2|Creative visual pieces such as paintings or sculptures
ASSASSIN|2|A person who murders a prominent figure, often for hire or political motive.
ASSAULTS|2|Violent physical attacks on a person
ASSESSED|2|Judged the value, quality, or extent of something
ASSIGNED|2|Allocated to a particular person or purpose
ASSISTED|2|Gave support or aid to someone
ATHLETES|2|People trained to compete in physical sports
ATTACHED|2|Joined or fastened to something else
ATTACKED|2|Took violent or aggressive action against a target
ATTEMPTS|2|Efforts made to accomplish something
ATTENDED|2|Was present at an event or gathering
ATTITUDE|2|A settled way of thinking or feeling about something
AUCTIONS|2|Public sales where items go to the highest bidder
AUDIENCE|2|The people gathered to watch or listen to a performance
AUDITION|2|A short performance given to test a performer's suitability for a role.
AUSTRIAN|2|Relating to a country whose capital is Vienna
AUTISTIC|2|Relating to a developmental condition affecting social communication and behavior
AVIATION|2|The design, building, and flying of aircraft
AVOIDING|2|Keeping away from something
AWAITING|2|Anticipating the arrival of someone or something
AWARDING|2|Officially giving someone a prize, honor, or sum of money.
BACKBONE|2|the spine, or the main support of something
BACKDROP|2|A large image or scene placed behind actors on a stage.
BACKWARD|2|Directed toward the rear or the past
BACTERIA|2|Microscopic single-celled organisms, some causing disease
BALANCED|2|Having weight or elements evenly distributed
BALANCES|2|Keeps something steady and level (said of one person)
BANISHED|2|Officially expelled from a country or place as punishment
BANKRUPT|2|Legally declared unable to pay one's debts
BARRACKS|2|Buildings used to house soldiers
BARRIERS|2|Obstacles that block movement or progress
BARTLETT|2|A juicy, sweet variety of pear popular in North America.
BATTERED|2|Damaged by repeated hard blows or rough treatment
BATTLING|2|Fighting hard against an opponent or difficulty.
BEAUTIES|2|Attractive or lovely people or things, plural.
BEDROOMS|2|Private spaces in a home used mainly for sleeping
BEHAVING|2|Acting or conducting oneself in a particular way
BELIEVER|2|A person who has faith in something
BELIEVES|2|Holds something to be true or real
BELONGED|2|Was the property of, or was a member of
BENEFITS|2|Helpful or favorable outcomes
BESTOWED|2|Gave or granted something as an honor or gift.
BETRAYED|2|Was disloyal to someone who trusted you
BISCUITS|2|Small baked goods, often flaky.
BISEXUAL|2|Attracted to both men and women.
BITCOINS|2|Units of a decentralized digital cryptocurrency
BLEEDING|2|The loss of blood from a wound or injury
BLIZZARD|2|a violent snowstorm with strong winds and poor visibility
BOARDING|2|The act of getting on a vehicle or ship.
BOMBINGS|2|Attacks in which explosive devices are detonated
BOOSTING|2|Increasing the strength, value, or amount of something
BOTHERED|2|Feeling disturbed or troubled.
BOUNDARY|2|A line marking the limit of an area
BOUTIQUE|2|A small shop selling fashionable clothes.
BRACKETS|2|symbols used to enclose text or numbers
BRAGGING|2|Talking with excessive pride about one's own achievements
BRANCHES|2|Limbs that grow outward from a tree's trunk
BRANDING|2|The marketing practice of creating a distinctive identity for a product or company.
BREACHED|2|Broke through a barrier or violated an agreement
BREAKERS|2|Large waves that crash into foam near the shore
BREAKOUT|2|A sudden escape from a prison or confined place
BRIEFING|2|A meeting held to give instructions or information before a task
BRIGHTER|2|More full of light or more vivid in color
BRISBANE|2|The capital city of Queensland, Australia.
BROCHURE|2|A small printed booklet giving information about a product or place.
BROWNING|2|Turning a rich golden hue when cooked
BROWSING|2|Looking through something casually.
BRUSHING|2|Cleaning teeth, hair, or a surface using bristles
BUDAPEST|2|Capital city of Hungary.
BUDDHISM|2|A religion based on the teachings of Siddhartha Gautama
BUDDHIST|2|A follower of the teachings of Siddhartha Gautama.
BULLDOGS|2|Stocky canines known for their wrinkled faces and pushed-in noses
BULLETIN|2|A short official statement or news update
BURGLARY|2|The crime of illegally entering a building to steal
BURGUNDY|2|A deep purplish-red color, or a French wine region
BUSINESS|2|A commercial enterprise or the activity of trading
CALENDAR|2|A chart showing the days, weeks, and months of a year
CAMPUSES|2|Places where students attend classes.
CANADIAN|2|Relating to the country whose capital is Ottawa
CANNABIS|2|Plant yielding marijuana and hemp
CAPITALS|2|Uppercase letters, or the chief cities of countries
CAPTAINS|2|Leaders of sports teams, or commanders of ships
CAPTURED|2|Took into custody or seized by force
CAPTURES|2|Takes control of something by force or skill
CARDINAL|2|A high-ranking official of the Catholic Church, next below the Pope
CARELESS|2|Not giving sufficient attention to avoiding harm.
CARRYING|2|Holding and moving something from place to place
CASUALLY|2|In a relaxed and informal way.
CASUALTY|2|A person injured or killed in an accident.
CATERING|2|The business of providing food for events
CATHOLIC|2|Relating to the Christian church led by the Pope in Rome
CENSORED|2|Suppressed or edited material considered unsuitable
CERAMICS|2|Pottery and clay objects shaped and hardened by heat
CEREMONY|2|A formal event marking an occasion
CHAIRMAN|2|the head of a meeting or organization
CHANGING|2|Becoming different over time; not staying the same
CHANNELS|2|Television stations, or narrow passages for water
CHANTING|2|Repeating words or phrases aloud in a rhythmic way
CHAPLAIN|2|A member of the clergy attached to a military unit, hospital, or prison
CHARCOAL|2|A black material made from burning wood.
CHARGING|2|Rushing forward in an attack
CHARMING|2|Pleasant and attractive in manner
CHEATING|2|Acting dishonestly to gain an unfair advantage
CHECKING|2|Examining something to confirm it is correct
CHECKOUT|2|The counter where you pay for purchases in a store
CHEERFUL|2|Noticeably happy and optimistic.
CHEMICAL|2|A compound used in or made by a reaction
CHESHIRE|2|A county in northwest England known for its dairy products
CHESTNUT|2|A glossy brown edible nut from a certain tree
CHILDREN|2|Young human beings, given as a plural
CHILLING|2|Extremely frightening or disturbing
CHLORINE|2|A pungent greenish-yellow gas, symbol Cl, used to purify water
CHOOSING|2|In the act of picking one option from several
CHOPPING|2|Cutting something into smaller pieces with repeated blows
CHURCHES|2|Buildings used for Christian worship
CIRCUITS|2|Closed paths through which electric current flows.
CIRCULAR|2|Having the shape of a circle.
CITATION|2|A formal reference to a source used in academic writing.
CLASSIFY|2|To arrange or categorize according to shared qualities.
CLERICAL|2|Relating to routine office tasks such as filing and typing
CLICKING|2|Making a short, sharp, repeated sound
CLIMBING|2|The activity of ascending steep rocks, mountains, or surfaces
CLINGING|2|Holding on tightly and refusing to let go
CLIPPERS|2|Tools used for cutting hair or nails.
CLOSURES|2|Instances of something being shut down permanently
CLUELESS|2|Having no idea or understanding; ignorant
CLUSTERS|2|Groups of similar things gathered closely together
COACHING|2|The act of training or instructing a person or team
COATINGS|2|Thin protective or decorative layers applied to a surface
COCKTAIL|2|A mixed alcoholic drink, often with fruit juice or other flavors.
COLLAPSE|2|To fall down or cave in suddenly
COLLECTS|2|To gather together from various sources.
COLONIES|2|Territories under the political control of a distant power
COLORADO|2|A Rocky Mountain state with capital Denver
COLOSSAL|2|Extremely large in size, extent, or degree
COMBINES|2|Joins or merges two or more things into one
COMEBACK|2|A return to success or popularity after a decline
COMEDIAN|2|A person who entertains others by making them laugh.
COMMENCE|2|To begin or start.
COMMENTS|2|Spoken or written remarks expressing opinions
COMMERCE|2|The buying and selling of goods on a large scale
COMMONLY|2|In a frequent or usual manner
COMMUNAL|2|Shared by all members of a group, rather than owned individually
COMMUTER|2|A person who travels regularly between home and work
COMPARES|2|Examines two or more things to note similarities and differences
COMPILED|2|Put together in a structured form.
COMPLETE|2|Having all the necessary parts; whole
CONCEIVE|2|To form an idea or plan in the mind
CONCERNS|2|Matters that cause worry or interest
CONCERTS|2|Live performances of music.
CONCRETE|2|A hard building material made of cement, sand, and gravel
CONDUCTS|2|Carries out or organizes an activity
CONFLICT|2|A serious clash or struggle between opposing forces
CONFRONT|2|To face or challenge someone directly
CONFUSED|2|Unable to think clearly; bewildered
CONGRESS|2|A nation's chief law-making assembly
CONQUEST|2|The act of overcoming or taking control of a place by force
CONSERVE|2|To protect something from being wasted or damaged
CONSIDER|2|To think carefully about something before deciding
CONSOLES|2|Offers comfort
CONSTANT|2|Happening continuously over time; not changing
CONSUMER|2|A person who buys goods or services for personal use
CONTACTS|2|Useful people one knows; also, thin lenses worn on the eye
CONTAINS|2|Holds or has within itself
CONTENTS|2|The things held inside a container
CONTRACT|2|A legally binding agreement between parties
CONTRAST|2|A striking difference between things
CONTROLS|2|The switches and levers used to operate a machine
CONVENED|2|Came together formally for a meeting
CONVERSE|2|To engage in talk or discussion with another person
CONVEYED|2|Communicated or made known
CONVINCE|2|Cause someone to believe firmly that something is true
CORONARY|2|Relating to the arteries that supply blood to the heart
CORPORAL|2|A military rank above private, below sergeant
COSMETIC|2|Relating to treatments intended to beautify the appearance
COUNCILS|2|Groups of people elected to manage local affairs
COUNTERS|2|Items used in games
COUNTING|2|Reciting numbers in their proper order
COURTESY|2|Polite behavior and good manners toward others
COVERING|2|A layer that lies over or conceals something
COWARDLY|2|Lacking courage; showing fear when facing danger
CRAWLING|2|To move on hands and knees.
CREATING|2|Bringing something new into existence
CREATION|2|The act of bringing something into existence
CREATIVE|2|Showing imagination and original ideas
CREATORS|2|People who bring something into existence
CREATURE|2|A living being, especially an animal
CREDIBLE|2|Able to be believed; convincing
CREEPING|2|Moving slowly and quietly.
CRIPPLED|2|Severely disabled or damaged
CROSSING|2|A place where a road or railway may be traversed
CRUISING|2|Traveling at a steady, relaxed pace, often by ship or car
CRYSTALS|2|Clear, solid mineral formations with a symmetrical atomic structure
CULTURAL|2|Relating to the arts and customs of a society
CULTURES|2|The customs, arts, and beliefs of particular societies
CURRENCY|2|The system of money used in a particular country
CURRENTS|2|Continuous flows of water, air, or electricity in one direction
CUSTOMER|2|A person who buys goods or services
DAMAGING|2|Causing harm or injury
DARKNESS|2|The total absence of light
DATABASE|2|An organized electronic store of information
DAUNTING|2|Seeming difficult and intimidating to deal with
DAZZLING|2|Extremely impressive, bright, or skillful
DEADLINE|2|The latest time by which a task must be completed
DEALINGS|2|Business interactions
DEBATING|2|Discussing opposing views formally
DECEIVED|2|Made someone believe something that is not true
DECISION|2|A conclusion or choice reached after consideration
DECISIVE|2|Firmly determined and not hesitant
DECLARED|2|Announced openly or formally, in the past
DECLARES|2|States something officially or emphatically
DECLINES|2|Politely refuses an offer or invitation
DECREASE|2|To grow, or make, smaller in size or amount
DEFEATED|2|Beaten in a contest or battle
DEFENCES|2|Structures or measures built to protect against attack
DEFENDED|2|Protected from attack or harm
DEFENDER|2|One who protects a person, place, or cause
DEFENSES|2|Measures taken to protect against attack
DEFIANCE|2|Bold resistance to an opposing force or authority
DEFICITS|2|Amounts by which something, especially money, falls short
DEFINITE|2|Clearly established and not likely to change
DELAYING|2|Making something happen later than planned
DELEGATE|2|To entrust a task or responsibility to someone else
DELICATE|2|Easily broken or damaged; requiring careful handling
DELIVERY|2|The act of bringing goods to a destination
DELUSION|2|A false belief held despite evidence to the contrary
DEMENTIA|2|a progressive decline in memory and cognitive ability
DEMOCRAT|2|Member of one of the two major U.S. political parties
DEPARTED|2|Went away from a place, especially to begin a trip
DEPENDED|2|Relied on someone or something for support or supply
DEPICTED|2|Represented or portrayed in a picture or words
DEPLETED|2|Reduced in quantity, especially of a resource
DEPOSITS|2|Sums of money placed into a bank account
DEPRIVED|2|Lacking basic necessities or comforts
DEPUTIES|2|People appointed to act as substitutes or assistants to an official
DESCRIBE|2|To give an account of something in words
DESIGNER|2|One who plans the look of clothing or products
DESTINED|2|Certain to happen or become something in the future
DETACHED|2|Not emotionally involved; separated or standing apart
DETAINED|2|Kept in official custody, or held back
DETECTED|2|Discovered or identified the presence of something
DETECTOR|2|A device used to discover the presence of something
DEVELOPS|2|Grows or matures over time
DEVOTION|2|Great love and loyalty, especially to a cause, person, or activity
DIABETES|2|A disorder marked by too much sugar in the blood
DIABETIC|2|Relating to a chronic condition involving abnormal blood-sugar levels
DIAGNOSE|2|To identify a disease or problem from its symptoms
DIAGONAL|2|Running from one corner to the opposite corner
DIAGRAMS|2|Simplified drawings explaining how something works
DIALOGUE|2|An exchange of speech between two or more people, especially in a play or book
DIAMONDS|2|Extremely hard, brilliant gemstones prized for jewelry
DIARRHEA|2|Frequent and watery bowel movements.
DICTATED|2|Said aloud for someone else to transcribe
DICTATOR|2|A ruler with absolute power, often unelected
DIMINISH|2|To make or become smaller or less
DIRECTOR|2|Person who supervises the making of a film or play
DISABLED|2|Having a condition that limits movement, senses, or activities
DISAGREE|2|To hold or express a different opinion
DISASTER|2|A sudden event causing great destruction or suffering
DISCIPLE|2|A follower and student of a teacher, leader, or philosophy
DISCLOSE|2|To make secret information known
DISGUISE|2|A costume or appearance used to conceal one's identity
DISLIKED|2|Regarded with distaste or aversion
DISPATCH|2|to send off promptly to a destination
DISPLAYS|2|Presents or exhibits for people to see
DISPUTED|2|argued about or challenged as being true or valid
DISPUTES|2|Disagreements or arguments between parties.
DISSOLVE|2|To become absorbed into a liquid and form a solution
DISTANCE|2|The amount of space between two points
DISTRACT|2|To draw someone's attention away from what they are doing
DISTRESS|2|Extreme anxiety, sorrow, or suffering.
DISTRICT|2|An administrative division of a city or region
DIVERTED|2|Caused something to change course or direction
DIVIDING|2|Separating something into parts
DIVISION|2|The act of separating into parts
DIVORCED|2|Having legally ended a marriage
DOCTORAL|2|Relating to the highest academic degree awarded by a university
DOCUMENT|2|A written or printed paper giving information
DOMINATE|2|To have controlling power over
DONATING|2|To give something for a charitable purpose.
DONATION|2|A gift, especially of money, to a cause
DOPAMINE|2|A neurotransmitter associated with pleasure and reward
DOUBLING|2|To make twice as much.
DOUBTFUL|2|Uncertain about whether something is true
DOWNFALL|2|Sudden decline or collapse
DOWNLOAD|2|Transfer a file from a server to your own device
DOWNSIDE|2|drawback
DOWNTOWN|2|The central business district of a city
DOWNWARD|2|Moving or pointing from a higher level to a lower one
DRAFTING|2|Composing a preliminary version of a document or plan
DRAGGING|2|Pulling something heavy along the ground
DRAINAGE|2|A system for removing excess water from an area
DRAMATIC|2|Sudden, striking, and full of emotion or action
DRAWINGS|2|Pictures made with a pencil, pen, or crayon
DRESSING|2|A sauce poured over a salad
DRINKING|2|Taking liquid into the mouth and swallowing it
DRIPPING|2|Falling in small drops
DURATION|2|The length of time something continues
DWELLING|2|A house or other place where someone lives.
EARNINGS|2|Money received in return for work
ECSTATIC|2|Feeling or expressing overwhelming happiness
EDUCATED|2|Having gained knowledge or training through schooling
EGYPTIAN|2|Relating to the ancient land of the pharaohs and the Nile
EINSTEIN|2|Physicist famous for developing the theory of relativity
ELECTION|2|A formal process of choosing a person for office by voting
ELECTRIC|2|Powered by or producing a flow of charged current
ELECTRON|2|A subatomic particle with a negative charge
ELEGANCE|2|Refined gracefulness in style or manner
ELEVATED|2|Raised to a higher level or position
ELEVENTH|2|Coming after the tenth in order
EMBARKED|2|Began a journey or a new venture
EMBRACED|2|Accepted an idea willingly and enthusiastically
EMISSION|2|The release of something, especially gas or radiation, into the air
EMOTIONS|2|Strong feelings such as joy, fear, or anger
EMPLOYED|2|Having a paid job; in work
EMPLOYER|2|A person or company that hires and pays workers
ENCLOSED|2|Surrounded on all sides; shut in
ENDORSED|2|Publicly approved or supported
ENDURING|2|Lasting over a long period of time
ENFORCED|2|Made sure a rule or law was obeyed
ENGINEER|2|A person who designs and builds machines or structures
ENGRAVED|2|Cut or carved a design into a hard surface
ENHANCED|2|Made greater in quality, value, or power
ENJOYING|2|Taking pleasure in something
ENLARGED|2|Made bigger in size or scope
ENLISTED|2|Joined the armed forces voluntarily
ENORMOUS|2|Extremely large in size or amount
ENRICHED|2|Made greater in quality, value, or nutritional content
ENROLLED|2|Officially registered as a member of a course or institution
ENSEMBLE|2|A group of musicians or performers who work together
ENTERING|2|Going into a place
ENTIRETY|2|The whole of something, without exception
EPIDEMIC|2|A widespread occurrence of an infectious disease in a community
EQUALITY|2|The state of having the same rights, status, and opportunities
ERUPTION|2|A sudden, violent burst, as from a volcano
ESCALATE|2|Increase rapidly in intensity
ESCAPING|2|Getting free from confinement or danger
ESCORTED|2|Accompanied somewhere, often for protection or courtesy
ESTIMATE|2|A rough calculation of value, size, amount, or cost
ESTROGEN|2|A key hormone in the female reproductive system
ETERNITY|2|Infinite or unending time
EUROPEAN|2|Relating to the continent lying between Asia and the Atlantic
EVACUATE|2|To remove people from a place of danger
EVALUATE|2|To judge the value or quality of something
EVENINGS|2|The periods of the day between afternoon and night
EVENTUAL|2|Occurring at the end of a process or period of time
EVICTION|2|The legal process of removing a tenant from a rented property
EVIDENCE|2|Facts or signs indicating that something is true
EVOLVING|2|Gradually developing or changing over time
EXAMINED|2|Inspected or scrutinized closely
EXAMINER|2|A person who officially tests or inspects something
EXAMINES|2|To inspect or investigate closely.
EXAMPLES|2|Instances cited to illustrate a point
EXCEEDED|2|Went beyond a limit, expectation, or amount
EXCERPTS|2|Short passages taken from a longer piece of writing
ABOLITION|1|The act of officially ending or getting rid of a system or practice
ACCESSORY|1|An additional item that complements a main outfit or object
ACCIDENTS|1|Unexpected events that cause damage or injury
ACCOMPANY|1|To go along with someone as a companion.
ADVENTURE|1|An exciting or daring experience
AFFECTION|1|A gentle feeling of fondness or liking
AFTERNOON|1|The time of day between midday and evening
AFTERWARD|1|At a later time; subsequently
AIRPLANES|1|Powered flying vehicles with fixed wings
AMBULANCE|1|A vehicle that carries sick or injured people to hospital
ANNOUNCES|1|Makes a public declaration of
APARTMENT|1|A set of rooms for living in, within a larger building
APOLOGIES|1|Expressions of regret for having done something wrong.
APPLIANCE|1|device
ARGENTINA|1|Home country of football star Lionel Messi
ASSISTING|1|Helping someone by sharing a task or providing support
ASTRONOMY|1|The scientific study of stars, planets, and space
ATTENDEES|1|People who are present at an event
BARTENDER|1|A person employed to mix and serve drinks at a pub or club
BATHROOMS|1|Rooms containing a toilet and sink
BEGINNERS|1|People who are new to a skill or activity
BIOLOGIST|1|A scientist who specializes in the study of living organisms.
BIRTHDAYS|1|Annual anniversaries of one's date of birth
BLINDNESS|1|The condition of being unable to see
BLUEPRINT|1|A detailed technical plan or design for a project
BODYGUARD|1|A person employed to protect someone from physical harm
BOOKSTORE|1|A shop that sells reading material
BORROWING|1|Taking something with the intention of returning it
BOYFRIEND|1|A male romantic partner
BRACELETS|1|Decorative bands worn around the wrist.
BREAKFAST|1|The first meal of the day
BUILDINGS|1|Permanent structures with walls and a roof
BUTTERFLY|1|An insect with large, colorful wings that develops from a caterpillar.
CAFETERIA|1|A self-service dining hall in a school or workplace
CARDBOARD|1|Stiff, thick paper material used to make boxes.
CARPENTER|1|A skilled worker who builds and repairs things made of wood
CELEBRITY|1|A famous person, especially in entertainment
CELLPHONE|1|A portable telephone that operates over a wireless network
CHAMPAGNE|1|A sparkling white wine from a specific region of France
CHARITIES|1|Organizations that raise money to help those in need
CHEMISTRY|1|The science of substances and how they react
CHILDCARE|1|Supervision and care provided for young kids while parents work
CHOCOLATE|1|A sweet brown food made from cacao beans
CHRISTMAS|1|The festival celebrating the birth of Jesus, held on December 25
CIGARETTE|1|A thin roll of tobacco wrapped in paper for smoking
CLASSROOM|1|A room in a school where lessons are taught
COASTLINE|1|The outline of land where it meets the sea
COMBINING|1|Joining or merging two or more things together
COMPANIES|1|Business organizations
COMPLAINS|1|Expresses dissatisfaction or annoyance about something
COMPLETES|1|Finishes or brings something to an end
COMPOSERS|1|People who write musical works
COMPUTERS|1|Electronic machines that store and process data
CONCLUDES|1|comes to an end
CONTAINER|1|Box or vessel used to hold something
COOPERATE|1|To work together toward a common goal
CORRIDORS|1|Long passageways connecting rooms in a building
COSMETICS|1|Products applied to the face to enhance appearance, such as lipstick or foundation.
COUNTDOWN|1|A backward numerical sequence leading up to an event's start
COURTYARD|1|An open space enclosed by walls or buildings
COWORKERS|1|People who share your job at the same company
CROCODILE|1|Large reptile with a long snout, found in rivers and swamps
DASHBOARD|1|The panel in front of a driver showing gauges and controls
DEADLINES|1|Times or dates by which something must be completed
DENTISTRY|1|The branch of medicine concerned with teeth and gums
DETECTORS|1|Devices used to discover the presence of something
DIFFERENT|1|Not the same as another or each other
DINOSAURS|1|Extinct reptiles that dominated the Earth millions of years ago
DISASTERS|1|sudden events that cause great damage or suffering
DISCOUNTS|1|Reductions in the usual price of something
DISCUSSES|1|Talks about a topic in detail
DISHONEST|1|Not truthful or trustworthy
DISTURBED|1|Troubled or agitated in mind
DOCTORATE|1|The highest degree awarded by a university
DOMINATES|1|Has controlling power over something
DOWNLOADS|1|Files transferred from the internet onto a device
DWELLINGS|1|Places where people live; houses or homes
EDUCATORS|1|People whose job is to teach
ELEPHANTS|1|Large mammals with trunks, found in Africa and Asia
ELEVATORS|1|Lifts that carry people between floors
ENJOYABLE|1|Giving pleasure; pleasant
ENTERTAIN|1|To provide amusement or enjoyment for someone.
ENVELOPES|1|Paper coverings used to enclose and mail letters
EQUIPMENT|1|Tools or gear needed for a task
ETHIOPIAN|1|Of or from a nation in East Africa whose capital is Addis Ababa
EXERCISES|1|Physical activities done to stay fit
EXPENSIVE|1|Costing a great deal of money
FACTORIES|1|Large buildings where goods are manufactured.
FESTIVALS|1|Special occasions of public celebration
FICTIONAL|1|Invented or imaginary, not based on real events
FILMMAKER|1|A person who produces or directs movies
FIREPLACE|1|Structure for burning wood indoors
FIREWORKS|1|Explosive devices that produce colorful displays in the sky.
FISHERMAN|1|A person who catches aquatic creatures from the sea or river for a living
FLOWERING|1|Producing blossoms; in bloom
FOOTPRINT|1|The impression left behind on the ground by someone's shoe or bare sole
FOOTSTEPS|1|The sounds or marks made by walking
FOREIGNER|1|A person from a country other than one's own
FRAGMENTS|1|Small broken pieces of something larger
FRAGRANCE|1|A pleasant, sweet smell
FRENCHMAN|1|A man from France
FURNITURE|1|Movable household items such as chairs and tables
GARDENING|1|The activity of cultivating plants and flowers outdoors
GOVERNORS|1|Elected heads of U.S. states
GRATITUDE|1|The quality of being thankful
GRAVEYARD|1|A place where the dead are buried.
GREETINGS|1|Words of welcome exchanged upon meeting someone
GROCERIES|1|Food and household items bought at a store
GUITARIST|1|A person who plays a stringed instrument with frets, plucked or strummed
HAMBURGER|1|A cooked patty of ground beef served in a bun
HANDSHAKE|1|A greeting where two people grasp and shake each other's hands
HAPPINESS|1|The state of feeling joy or contentment
HARVESTED|1|Gathered a crop from the fields
HEADACHES|1|Pains felt in the skull
HEARTBEAT|1|The rhythmic pulse of the organ that pumps blood through the body
HISTORIAN|1|One who studies and writes about past events
HISTORIES|1|Written accounts of past events
HONEYMOON|1|A vacation taken by a newly married couple
ILLNESSES|1|Diseases or periods of sickness
IMPERFECT|1|Having flaws or shortcomings; not flawless
INCORRECT|1|Not accurate or true
INSPECTED|1|Examined closely for faults or quality
IRRITATED|1|Feeling annoyed or impatient
JEWELLERY|1|Ornamental items such as rings, necklaces, and bracelets
KEYBOARDS|1|Panels of buttons used for typing on computers and phones
LANGUAGES|1|Systems of words and grammar used for communication
LEFTOVERS|1|Food remaining after a meal, kept for later
LIBRARIAN|1|A person who manages or works in a book-lending institution
LIGHTNING|1|A bright flash of electricity in the sky during a storm
MAGICALLY|1|In a way that seems to use supernatural power
MARVELOUS|1|Causing great wonder; extremely good
MEDICINES|1|Drugs used to treat illness
MESSENGER|1|A person who carries and delivers messages
MICROWAVE|1|A kitchen appliance that cooks or reheats food quickly using radiation
MINIATURE|1|Very small in scale compared to the usual size
MONUMENTS|1|Structures built to commemorate a person or event.
MOUNTAINS|1|Very large natural elevations rising above the land
MUSHROOMS|1|Fungi with a stem and cap, some varieties of which are edible.
MUSICIANS|1|People who play instruments or compose songs
MYSTERIES|1|Things that are difficult or impossible to understand or explain.
NEIGHBORS|1|People who live next door or close by
NEIGHBOUR|1|A person who lives next door or in a nearby house.
NEWSPAPER|1|A printed publication carrying daily or weekly news
NIGHTCLUB|1|A venue offering music, dancing, and drinks late in the evening
NIGHTMARE|1|A frightening or deeply unpleasant dream
NORWEGIAN|1|Relating to Norway or its people
OBSTACLES|1|Things that block or hinder progress
ORGANISMS|1|Individual living things, such as plants or animals
ORNAMENTS|1|Decorative objects used to beautify something
ORPHANAGE|1|An institution that cares for children whose parents are dead or unable to look after them
OVERSIZED|1|Bigger than what is typical or needed
PAPERBACK|1|A book with a flexible, inexpensive cover instead of a rigid one
PAPERWORK|1|Routine administrative documents and forms
PARACHUTE|1|A folding device used to slow a person's fall through the air
PARENTING|1|The activity of raising and caring for a child
PASSPORTS|1|Official documents that permit international travel
PERFORMER|1|A person who entertains an audience on stage
PLEASURES|1|Feelings of happy satisfaction and enjoyment
POINTLESS|1|Having no purpose or meaning
POLICEMAN|1|A male law-enforcement officer
POLICEMEN|1|Male officers whose job is to enforce the law
POSTPONED|1|Delayed or rescheduled to a later date
PRACTICED|1|Performed an activity repeatedly to improve skill
PRESCHOOL|1|An educational setting for young children not yet old enough for kindergarten
PRESENTER|1|A person who introduces or hosts a show
PROFESSOR|1|A senior university teacher
PROTECTOR|1|A person or thing that keeps someone or something safe from harm.
RAILROADS|1|American term for railway lines
RASPBERRY|1|A small, tart red or purplish-black edible fruit that grows in clusters on thorny bushes
RECYCLING|1|The process of converting waste into reusable material
REHEARSAL|1|A practice session held in preparation for a public performance.
RELATIVES|1|People connected to you by blood or marriage
RELIGIONS|1|Systems of belief and worship in a higher power
REMEMBERS|1|Recalls something from the past to mind
REMINDERS|1|Notes or signals meant to help someone remember something important.
REPEATING|1|Saying or doing something again
REVIEWERS|1|People who evaluate and critique creative works
ROOMMATES|1|People who share a place to live
SATURDAYS|1|Days of the week following Friday.
SCRATCHED|1|Rubbed or marked with something sharp
SCRATCHES|1|Marks made by something sharp
SEPTEMBER|1|The ninth month of the year
SEVENTEEN|1|The number equal to 10 plus 7.
SHRINKING|1|Becoming smaller in size
SINCERELY|1|In a genuine and heartfelt manner
SINCERITY|1|The quality of being free from pretense or deceit
SIXTEENTH|1|The ordinal number equal to 16
SPACESHIP|1|A vehicle designed to carry astronauts beyond Earth's atmosphere
SPAGHETTI|1|Long, thin strands of pasta
SPECIALTY|1|An area of particular skill or expertise
SQUEEZING|1|Pressing something firmly from opposite sides to compress it
SQUIRRELS|1|Small, bushy-tailed rodents that gather nuts
STATISTIC|1|A single item of numerical data.
STRANGELY|1|In a way that is odd or unusual
STRANGERS|1|People whom one does not know
STRONGEST|1|Having the most power or physical force
SUBTITLES|1|Captions at the bottom of a screen translating or transcribing dialogue.
SUNFLOWER|1|A tall garden plant with a large golden bloom that turns toward the sun
SUPERHERO|1|A fictional character with extraordinary powers who fights evil.
SUPERSTAR|1|An extremely famous, wildly successful performer
SUPPORTER|1|A person who backs a cause, team, or candidate
SURPRISES|1|Unexpected events or pieces of information
SWALLOWED|1|Made food or drink pass down the throat
SWEETNESS|1|The quality of tasting like sugar.
SYNTHESIS|1|The combination of separate parts or elements to form a coherent whole.
TAIWANESE|1|Of or relating to the island democracy off the southeastern coast of China
TEENAGERS|1|Young people between thirteen and nineteen years old
TELEPHONE|1|A device used to speak to someone over a distance
TERRIFIED|1|Extremely frightened
TEXTBOOKS|1|Books used for the formal study of a school subject
TIMETABLE|1|A schedule showing when events are planned to occur
TRAVELERS|1|People who journey from one place to another, especially over long distances.
TRAVELLER|1|A person who journeys from one place to another
TREADMILL|1|Exercise machine with a moving belt for walking or running
UNCHANGED|1|Remaining exactly the same
UNDERWEAR|1|Garments worn next to the skin beneath other clothing
UNHEALTHY|1|Damaging to one's physical wellbeing
UNMARRIED|1|Not currently having a spouse
UNNOTICED|1|Not observed or detected by anyone
UNPOPULAR|1|Not liked or supported by most people
UNTOUCHED|1|Not altered, damaged, or affected in any way
UPLOADING|1|Sending data from a device to the internet
VACATIONS|1|Periods of time spent away from work for leisure.
VEGETABLE|1|An edible part of a plant, often eaten as part of a savory dish
VILLAGERS|1|People who live in a small rural settlement
VOLCANOES|1|Mountains that can erupt with lava and ash
WATERFALL|1|A natural cascade where a river drops over a cliff or ledge
WEDNESDAY|1|The day of the week between Tuesday and Thursday
WELLBEING|1|The state of being comfortable, healthy, and content
WHISPERED|1|Spoke very softly using breath rather than the voice
WIKIPEDIA|1|A free online encyclopedia that anyone can edit
WONDERFUL|1|Extremely good or delightful
WORKPLACE|1|The office or site where one is employed
WORTHLESS|1|Having no real value or use
WRESTLING|1|Combat sport in which opponents grapple and try to pin each other
YESTERDAY|1|The day immediately before today
ABANDONED|2|Left behind and no longer used or cared for
ABDUCTION|2|The crime of taking someone away by force
ABORTIONS|2|Medical procedures that end pregnancies
ABSORBING|2|Engaging or interesting.
ABUNDANCE|2|A very large quantity of something
ACADEMICS|2|People who teach or conduct research at a university
ACADEMIES|2|Institutions for education or training in a specific field
ACCESSING|2|Gaining entry to or retrieving data from
ACCLAIMED|2|Publicly praised or celebrated for achievement
ACHIEVING|2|Successfully reaching a desired goal
ACQUIRING|2|Gaining possession of something
ACTIVATED|2|Switched on or set into motion
ACTIVISTS|2|People who campaign vigorously for a cause
ACTRESSES|2|Women who perform roles in films, TV, or theatre
ADDICTIVE|2|Tending to make someone dependent on it
ADDITIONS|2|Extra items included with something
ADDRESSES|2|Deals with or attends to a matter; also, locations of residences
ADJECTIVE|2|Word that describes a noun
ADJOURNED|2|Postponed to a later time
ADJUSTING|2|Altering slightly to achieve a desired fit or result
ADMIRABLE|2|Deserving great respect and approval
ADMITTING|2|Confessing that something is true
ADULTHOOD|2|The state of being an adult.
ADVANCING|2|Moving forward or progressing
ADVANTAGE|2|A favorable position or benefit
ADVERTISE|2|To promote a product or service publicly
AFTERLIFE|2|Existence some believe follows death
AFTERMATH|2|The period or state following a harmful or unpleasant event
ALCOHOLIC|2|Containing or affected by strong drink
ALGORITHM|2|A step-by-step procedure for solving a problem, especially by computer
ALIGNMENT|2|The proper positioning or arrangement in a line
ALLERGIES|2|Abnormal immune reactions to certain substances
ALLEVIATE|2|To make pain or difficulty less severe
ALLOCATED|2|Distributed for a specific purpose
ALLOWANCE|2|A sum of money given regularly, especially to a child.
ALUMINIUM|2|A lightweight, silvery-white metallic element
AMAZINGLY|2|In a way that causes great wonder or surprise
AMBIGUITY|2|The quality of having more than one possible meaning.
AMBITIONS|2|Strong desires to achieve success or a particular goal
AMENDMENT|2|A formal change or addition to a law or document
AMENITIES|2|Desirable or useful features of a place, such as pools or gyms
AMERICANS|2|Citizens of the United States
AMPLIFIER|2|A device that increases the strength of a signal or sound
AMUSEMENT|2|The state of finding something funny or entertaining
ANALYTICS|2|Systematic examination of data to uncover patterns and insights.
ANALYZING|2|Examining something in detail to understand it
ANCESTORS|2|People from whom one is descended
ANCESTRAL|2|Relating to one's family's past generations
ANECDOTES|2|Short, entertaining accounts of a real incident
ANIMATION|2|The art of making films from a sequence of drawings
ANNOYANCE|2|A feeling of mild anger caused by a nuisance
ANONYMITY|2|The condition of being unidentified or unnamed
ANONYMOUS|2|Having an identity that is unknown or withheld
ANSWERING|2|Responding to a question or call
ANTHOLOGY|2|A collection of poems, stories or songs by different writers
ANTIQUITY|2|The distant past, especially of ancient civilizations
APOLOGISE|2|To express regret for a mistake
APOLOGIZE|2|To express regret for a fault or wrongdoing
APPALLING|2|Causing shock, horror, or dismay
APPARATUS|2|A complex piece of equipment for a particular purpose
APPEALING|2|Attractive or interesting
APPEARING|2|Coming into view or becoming visible
APPLICANT|2|A person who formally requests a job, place, or membership
APPRAISAL|2|An assessment of the value, quality, or worth of something
APPROVING|2|favorable
ARCHITECT|2|A person who designs buildings and oversees their construction
ARGUMENTS|2|Heated disagreements or disputes
ARTHRITIS|2|A medical condition marked by painful inflammation of the joints
ARTIFACTS|2|Objects made by human hands, especially of historical interest
ARTILLERY|2|Large-caliber mounted guns used in warfare
ASSAULTED|2|Attacked physically or verbally
ASSEMBLED|2|Gathered together, or fitted into a finished whole
ASSERTING|2|Stating something confidently and forcefully as true.
ASSERTION|2|A confident statement of fact or belief
ASSESSING|2|Evaluating or judging the quality, value, or extent of something
ASSISTANT|2|A person who helps another in their work
ASSURANCE|2|A positive declaration intended to give confidence.
ASTROLOGY|2|The study of how star and planet positions supposedly influence human affairs
ASTRONAUT|2|A person trained to travel in space.
ATHLETICS|2|Physical sports and contests such as running, jumping, and throwing.
ATTACKERS|2|People who launch an assault on someone or something
ATTEMPTED|2|Made an effort to do something
ATTENDANT|2|A person who is present at an event.
ATTENDING|2|Being present at an event
ATTENTION|2|Mental focus directed at something
ATTORNEYS|2|Legal professionals who represent clients in court
ATTRIBUTE|2|A quality or characteristic belonging to a person or thing.
AUDIENCES|2|Groups of people who gather to watch or listen to performances
AUDITIONS|2|Tryout performances used to judge a performer's suitability for a role.
AUGMENTED|2|Made greater in size, amount, or degree
AUSTRALIA|2|Island nation and continent whose capital is Canberra
AUTHENTIC|2|Genuine and not a copy or imitation
AUTHORIZE|2|Give official permission for something to happen
AUTOGRAPH|2|A celebrity's signature given as a keepsake
AUTOMATED|2|Operated by machines with little human control
AUTOMATIC|2|Working by itself without direct human control
AVAILABLE|2|Able to be obtained or used
AVALANCHE|2|A large mass of snow and ice sliding rapidly down a mountain
AWAKENING|2|A moment of becoming suddenly aware of something
BACKWARDS|2|Toward the rear; in reverse order
BACTERIAL|2|Relating to microscopic single-celled microbes
BALANCING|2|Keeping something steady and even
BANDWIDTH|2|The data-transfer capacity of a network connection
BARRISTER|2|A lawyer qualified to argue cases in higher courts.
BATTERIES|2|Portable devices that store and supply electrical power
BEAUTIFUL|2|Pleasing the senses or mind aesthetically.
BEGINNING|2|The point at which something starts
BEHAVIORS|2|The ways in which a person or animal acts or conducts themselves.
BEHAVIOUR|2|The way in which a person conducts themselves
BELIEVERS|2|People who hold a particular religious or ideological faith.
BELIEVING|2|Accepting something as true or real
BENEFITED|2|Gained an advantage from something
BEVERAGES|2|Drinks, especially non-alcoholic.
BILINGUAL|2|Able to speak two languages fluently
BILLBOARD|2|A large outdoor advertising sign
BIOGRAPHY|2|A written account of another person's life.
BLACKMAIL|2|The crime of demanding money by threatening to reveal a secret
BLACKPOOL|2|A seaside resort town in Lancashire, England, famous for its illuminations.
BLESSINGS|2|Things that bring happiness or welfare
BOLLYWOOD|2|The Indian film industry based in Mumbai.
BORROWERS|2|People who take something, especially money, with the intention of returning it
BOTANICAL|2|Relating to plants and their study
BOTHERING|2|Causing annoyance or trouble to someone
BOULEVARD|2|A broad, tree-lined city street.
BRAZILIAN|2|Of or relating to South America's largest nation
BREAKDOWN|2|A sudden mechanical failure or collapse
BREATHING|2|The act of drawing air in and out of the lungs
BRIGHTEST|2|Most luminous or full of light.
BRILLIANT|2|Exceptionally clever, talented, or impressive
BROADBAND|2|A technology providing fast, always-on internet access.
BROADCAST|2|To transmit a programme by radio or television
BULGARIAN|2|Relating to a nation on the Black Sea, once part of the Ottoman Empire
CALCULATE|2|To determine something by mathematical or logical methods
CAMPAIGNS|2|Organized series of actions pursuing a particular goal
CANADIANS|2|People native to or inhabitants of a North American country bordering the U.S.
CANCELLED|2|Called off or annulled before it could happen
CANDIDACY|2|The status of seeking an elected position
CANDIDATE|2|A person who applies for a job or stands for office
CAPTURING|2|Taking control of something by force
CARDINALS|2|Senior clergy members of the Catholic Church who elect the pope.
CAREFULLY|2|In a cautious and attentive manner
CARETAKER|2|Someone responsible for looking after a building or person
CARIBBEAN|2|The warm tropical sea and island region east of Central America
CARRIAGES|2|Wheeled vehicles, often pulled by horses, used to carry passengers.
CATALOGUE|2|A complete list of items, typically with descriptions
CATHEDRAL|2|The principal church of a diocese, containing a bishop's throne
CATHOLICS|2|Followers of the Pope and the Church of Rome
CELEBRATE|2|To mark a happy occasion with festivities
CELESTIAL|2|relating to the sky or the heavens
CENTENARY|2|The hundredth anniversary of an event.
CENTRALLY|2|In a location near the middle
CENTURIES|2|Periods of one hundred years each
CERTAINTY|2|Total confidence that something is true, without any doubt.
CHALLENGE|2|A demanding task or call to compete
CHAMPIONS|2|Those who win first place in a contest
CHARACTER|2|A person portrayed in a novel or play
CHECKLIST|2|A set of items to be verified or completed one by one
CHEMICALS|2|Substances made or used in reactions of matter
CHERISHED|2|Held dear and cared for deeply
CHILDHOOD|2|The period of life when one is young
CHRISTIAN|2|Following the teachings of Jesus
CINEMATIC|2|Having the dramatic visual quality of a movie
CIVILIZED|2|Having a well-developed, organized society and culture
CLARIFIED|2|Made something easier to understand
CLASSMATE|2|Person who attends the same class or school
CLUBHOUSE|2|A building where team members relax and meet
COCKTAILS|2|Mixed alcoholic drinks.
COINCIDED|2|Happened at the same time as something else
COLLAPSED|2|Fell down or caved in suddenly
COLLAPSES|2|Suddenly falls down or breaks apart
COLLEAGUE|2|A person one works with, especially in a profession
COLLECTED|2|Brought together into one place
COLLECTOR|2|A person who gathers and keeps items of a particular kind as a hobby
COLLISION|2|A crash in which two moving objects strike each other
COLONISTS|2|People who settle in and establish control over a new territory
COLOURFUL|2|Full of color; vibrant.
COLUMNIST|2|A writer who regularly contributes to a publication.
COMEDIANS|2|People who perform to make audiences laugh
COMMANDED|2|Gave an order to; had authority over
COMMANDER|2|Officer in charge of a military unit
COMMUNISM|2|Political and economic system in which property is owned collectively by the state
COMMUNITY|2|A group of people living together in one area
COMPANION|2|A person with whom one spends time; a comrade
COMPARING|2|Examining things to note their similarities and differences
COMPELLED|2|Forced or obliged to do something
COMPETENT|2|Having the skill or knowledge needed to do something well
COMPETING|2|Taking part in a contest or striving against rivals
COMPLAINT|2|A formal expression of dissatisfaction
COMPLETED|2|Brought entirely to an end; fully finished
COMPLEXES|2|Groups of related buildings, or sets of repressed psychological issues
COMPONENT|2|An individual part of a larger whole
COMPOSING|2|Creating an original piece of music
COMPOSITE|2|Made up of several distinct parts
CONCEALED|2|Kept from being seen or known
CONCEIVED|2|Formed an idea or plan in the mind
CONCLUDED|2|Brought to an end or final settlement
CONDENSED|2|Reduced in volume or made more concentrated
CONDUCTOR|2|Person who leads an orchestra with a baton
CONFERRED|2|Granted or bestowed, as an honor or degree
CONFESSED|2|Admitted to having done something wrong
CONFIDENT|2|Feeling sure of oneself and one's abilities
CONFLICTS|2|Serious disagreements or clashes
CONFUSING|2|Hard to understand; bewildering
CONFUSION|2|A state of bewilderment or lack of clarity
CONNECTOR|2|A device or part that joins two things together
CONQUERED|2|Defeated and took control of by force
CONSIDERS|2|Thinks carefully about before deciding
CONSTABLE|2|A police officer of the lowest rank
CONSTRUCT|2|To form by assembling parts
CONSULTED|2|Sought information or advice from someone
CONSUMERS|2|People who buy and use goods or services
CONTACTED|2|Got in touch with someone
CONTAINED|2|Held or enclosed within set limits
CONTENDER|2|A person or group competing with others for a prize.
CONTINENT|2|One of Earth's major landmasses
CONTINUAL|2|Happening repeatedly over a period of time, often with pauses
CONTINUES|2|Keeps going without stopping
CONTRACTS|2|Legally binding agreements between parties
CONTRASTS|2|Differences or oppositions between things being compared
CONVERTER|2|A device that changes something into another form
CONVICTED|2|Found guilty of a crime in a court of law
COPYRIGHT|2|Legal right giving an author control over their original work
CORPORATE|2|Relating to a large company or business
CORRECTED|2|Set right or removed the errors from something
CORRECTLY|2|In an accurate or proper manner
CORROSION|2|Gradual destruction of metal caused by a chemical reaction
COUNSELOR|2|A person who gives guidance or advice, especially on personal matters
COUNTLESS|2|Too numerous to be counted
COUNTRIES|2|Distinct territories with their own governments
COURTROOM|2|A room where legal cases are heard.
CRACKDOWN|2|A strict set of measures taken to stop illegal or unwanted activity
CREATIONS|2|Things that have been made or brought into existence
CREATURES|2|Living beings, especially animals
CRIMINALS|2|People who have broken the law
CRITICIZE|2|To point out the faults of someone or something
CROSSINGS|2|Places where roads, paths, or rail lines intersect
CULTIVATE|2|To prepare land and grow crops
CURIOSITY|2|A strong desire to know or learn something
CURRENTLY|2|At the present time
CUSTOMARY|2|In keeping with long-established habits or tradition
CUSTOMERS|2|People who buy goods or services from a business
CYLINDERS|2|Solid shapes with straight parallel sides and circular ends
DANGEROUS|2|Likely to cause harm or injury
DATABASES|2|Organized collections of structured information stored electronically
DAUGHTERS|2|Female children, taken together
DECEPTION|2|The act of deliberately misleading someone
DECEPTIVE|2|Giving a misleading impression
DECLINING|2|Becoming smaller, weaker, or worse over time
DECORATED|2|Adorned with ornamental additions
DECREASED|2|Became smaller in size or amount
DECREASES|2|Becomes smaller or fewer in number
DEFEATING|2|Winning a victory over an opponent
DEFENDANT|2|A person sued or on trial in a court of law
DEFENDERS|2|Players positioned to stop the opposing team from scoring.
DEFENDING|2|Protecting against attack or criticism
DEFENSIVE|2|Serving to protect or guard against attack
DEGRADING|2|Causing someone to feel a loss of dignity or self-respect
DELEGATES|2|Assigns a task or responsibility to someone else
DELICIOUS|2|Highly pleasing to the taste or smell
DELIGHTED|2|Feeling or showing great pleasure and joy
DELIVERED|2|Brought and handed over to the intended recipient
DEMANDING|2|Requiring much effort, skill, or attention
DEMOCRACY|2|A system of government by the whole population through elected representatives
DEMOCRATS|2|Members of a major United States political party
DEPARTING|2|leaving a place, especially to start a journey
DEPARTURE|2|The act of leaving or setting off from a place
DEPICTING|2|Showing visually
DEPICTION|2|A representation of something in words or images
DEPOSITED|2|Placed something somewhere, especially money into an account
DEPRESSED|2|Feeling very sad and low in spirits
DESCENDED|2|Moved downward from a higher place.
DESERVING|2|Worthy of something.
DESIGNATE|2|To officially choose someone or something for a role
DESIGNERS|2|People who plan the look and function of products
DESIGNING|2|Creating a plan or drawing for something to be made
DESIRABLE|2|Worth having or wanting
DESPERATE|2|Feeling hopeless and ready to do anything
DESTROYED|2|Completely ruined or demolished
DESTROYER|2|A fast, agile warship built to escort larger vessels
DETECTIVE|2|Investigator who solves crimes and gathers evidence
DETENTION|2|The state of being officially held in custody
DEVELOPER|2|A person who writes software or builds on land
DEVIATION|2|A departure from an established course or standard
DIAGNOSED|2|Identified the nature of an illness after examination
DIAGNOSIS|2|The identification of an illness from its symptoms
DIFFICULT|2|Needing much effort or skill to accomplish
DIFFUSION|2|The spreading of something more widely
DIGESTIVE|2|Relating to the breakdown of food in the body
DIGITALLY|2|Using computer-based or electronic methods
DIPLOMATS|2|Officials who represent their country abroad
DIRECTING|2|Guiding or supervising the making of a film, play, or project
DIRECTION|2|The course along which something moves
DIRECTORS|2|People who oversee a film, play, or company
DIRECTORY|2|A listing of names, addresses, or computer files
DISAGREED|2|Held a differing opinion from someone else
DISAPPEAR|2|To cease to be visible; to pass out of sight
DISBELIEF|2|A refusal or inability to accept something as true
DISCARDED|2|To throw away or get rid of something.
DISCHARGE|2|The act of releasing someone from duty or care
DISCIPLES|2|Followers who spread the teachings of a leader or faith
DISCLOSED|2|Made known; revealed to others
DISCOVERS|2|Finds out or becomes aware of something for the first time
DISCOVERY|2|The act of finding or learning something for the first time
DISCUSSED|2|Talked about in detail with others
DISGUSTED|2|Feeling revulsion or strong disapproval.
DISMISSAL|2|The act of removing someone from a job
DISMISSED|2|Sent away, or rejected as unimportant
DISPERSED|2|Spread out or scattered over a wide area
DISPLACED|2|Forced to leave one's usual place or position
DISPLAYED|2|Put on show for others to see
DISREGARD|2|To pay no attention to something and treat it as unimportant
DISRUPTED|2|Threw into disorder, breaking the normal flow
DISSOLVED|2|Broke down into a solution
DISTANCES|2|The amounts of space between two points.
DIVERSION|2|Something that distracts attention or provides entertainment
DIVERSITY|2|The state of being made up of many different kinds
DIVISIONS|2|Separate sections or units of an organization
DOCUMENTS|2|Official papers, or records something in writing
DONATIONS|2|Gifts of money or goods given to a cause
DOWNRIGHT|2|Utter and complete, without any qualification
ECONOMIES|2|Systems of trade and industry in countries or regions
ECONOMIST|2|An expert in the study of production and wealth
ECOSYSTEM|2|A biological community of interacting organisms and their environment
EDUCATING|2|Imparting knowledge or skills.
EDUCATION|2|The process of gaining knowledge through teaching and study
EFFECTIVE|2|Producing the intended result
EFFICIENT|2|Working well with little waste of time or effort
EGYPTIANS|2|Natives of the land of pharaohs and pyramids
ELECTIONS|2|Formal votes held to choose officials
ELECTRONS|2|Negatively charged subatomic particles orbiting an atomic nucleus
ELEVATION|2|The height of a place above sea level
ELIMINATE|2|To completely remove or get rid of
ELONGATED|2|Stretched out in length
EMBARRASS|2|To cause someone to feel awkward or ashamed
EMBRACING|2|Accepting something willingly and enthusiastically
EMERGENCE|2|The process of coming into being or becoming visible
EMERGENCY|2|A serious situation demanding immediate action
EMOTIONAL|2|Relating to or showing strong feelings
EMPHASIZE|2|To give special importance to something
EMPLOYEES|2|People who are paid to work for a company
EMPLOYERS|2|People or firms that hire and pay workers
EMPLOYING|2|Making use of someone or something; giving work to
ENCHANTED|2|Filled with delight, as if under a magic spell
ENCOUNTER|2|An unexpected or casual meeting with someone
ENCOURAGE|2|To give support, confidence, or hope to someone
ENDEAVOUR|2|A serious attempt or effort to achieve something
ENDLESSLY|2|In a way that never stops or finishes
ENDURANCE|2|The ability to withstand prolonged hardship or stress
ENERGETIC|2|Full of vigor and enthusiasm; very active
ENGINEERS|2|People who design and build machines or structures
ENHANCING|2|Improving the quality, value, or attractiveness of something
ENJOYMENT|2|The state of getting satisfaction or delight from something
ENQUIRIES|2|Requests for information; investigations
ENTRUSTED|2|Given responsibility for something to someone
EQUATIONS|2|Mathematical statements asserting that two expressions are equal
EQUITABLE|2|Fair and impartial in treatment
ESCALATED|2|Increased rapidly in scale or seriousness
ESPIONAGE|2|The practice of spying to obtain secret information
ESSENTIAL|2|Absolutely necessary or indispensable
ESTIMATED|2|Roughly calculated the size, value, or amount of
ETHNICITY|2|The fact of belonging to a social group with a shared cultural or national tradition
ETIQUETTE|2|The customary code of polite behavior in society
EUROPEANS|2|People native to a continent between the Atlantic and Asia
EVACUATED|2|Removed people from a dangerous place to safety
EVERGREEN|2|Describing a plant that keeps its leaves all year round
EVERYTIME|2|At all times; on each occasion
EVIDENTLY|2|Clearly; obviously.
EVOLUTION|2|The gradual development of living things over generations
EXAMINING|2|Inspecting closely
EXCELLENT|2|Extremely good; of the highest quality
EXCEPTION|2|A case left out of a general rule or statement
EXCESSIVE|2|Going far beyond what is normal or necessary
EXCHANGED|2|Gave one thing and received another in return
EXCHANGES|2|Acts of giving and receiving something in return.
EXCLUSION|2|The act of keeping someone or something out
EXCURSION|2|A short trip or journey, especially for pleasure
EXEMPLARY|2|Serving as a desirable model; outstandingly good
EXERCISED|2|Trained the body through physical activity
EXHAUSTED|2|Extremely tired, with no energy left
EXHIBITED|2|Displayed publicly for others to view
EXPANDING|2|Growing larger in size or scope
EXPANSION|2|The process of becoming larger or more extensive
EXPANSIVE|2|Covering a wide area; extensive in scope
EXPECTING|2|Anticipating that something will happen
EXPERTISE|2|Specialist skill or knowledge in a particular field
EXPLAINED|2|Made something clear by describing it in detail
EXPLODING|2|Bursting apart violently and noisily
EXPLOITED|2|Used unfairly for personal gain
EXPLORERS|2|People who travel to unfamiliar places to learn about them
EXPLORING|2|Traveling through an unfamiliar area to learn about it
EXPLOSION|2|A violent bursting accompanied by a loud noise
EXPLOSIVE|2|Likely to burst or detonate with great force
EXPORTING|2|Sending goods or services to another country for sale
EXPRESSES|2|To convey a thought or feeling.
EXTENDING|2|Making longer or stretching further out
EXTRACTED|2|Pulled out, often with effort
EXTREMELY|2|To a very great degree
EXTREMIST|2|A person holding radical or fanatical views
FANTASIES|2|Imaginative or fanciful ideas far removed from reality
FANTASTIC|2|Extraordinarily good or impressive
FARMHOUSE|2|A rustic dwelling on cultivated land where those who work it live
FASHIONED|2|Made or shaped by hand or effort
FAVORABLE|2|Expressing approval or working to one's advantage
FAVORITES|2|Things or people preferred above all others
FAVOURITE|2|The one preferred above all the rest
FINALISTS|2|Competitors who reach the last stage.
FINANCIAL|2|Relating to money or banking matters
FINISHING|2|Bringing a task to its completion
FISHERMEN|2|People whose occupation is catching aquatic creatures for a living
FLASHBACK|2|A sudden vivid memory of a past event
FLATTENED|2|Made level or smooth by pressing down
FOLLOWERS|2|Devotees or supporters of a leader or cause
FORBIDDEN|2|Not permitted by rule or law
FORECASTS|2|To predict or estimate future events.
FOREFRONT|2|The leading or most prominent position
FORGIVING|2|Willing to pardon faults or mistakes; tolerant of error
FORGOTTEN|2|No longer remembered or recalled
FORTIFIED|2|Strengthened against attack, or enriched with nutrients
FORTNIGHT|2|A period of fourteen days
FORTUNATE|2|Favored by good luck or happy circumstance
FORWARDED|2|Sent on to a further destination
FRACTURED|2|Broken or cracked, as a bone
FRACTURES|2|Breaks or cracks, often in a bone
FRAMEWORK|2|A basic supporting structure underlying a system or idea
FREELANCE|2|Self-employed and hired for individual jobs
FREESTYLE|2|An unstructured style of performance or competition, as in swimming or rap
FRIEDRICH|2|Common German given name
FRONTLINE|2|The foremost position of a military force facing the enemy
FULFILLED|2|Satisfied a requirement, wish, or purpose
FUNCTIONS|2|Formal social gatherings or ceremonial events
FURNISHED|2|Equipped with tables, chairs, and other household items
GALLERIES|2|Rooms or buildings used for displaying art
GATHERING|2|An assembly of people in one place
GENEALOGY|2|The study of family lineage and history
GENERALLY|2|In most cases; as a rule
GENERATES|2|Produces or brings something into existence
GENERATOR|2|A machine that converts mechanical energy into electricity
GENTLEMAN|2|A chivalrous, well-mannered man
GENTLEMEN|2|Polite, well-mannered men
GEOGRAPHY|2|The study of Earth's physical features and human populations
GLAMOROUS|2|Having an attractive quality of excitement and elegance
GODFATHER|2|A male sponsor at a baptism, responsible for a child's religious upbringing
GRADUALLY|2|In a slow and steady manner over a period of time
GRADUATED|2|Completed a course of study and earned a degree
GRADUATES|2|People who have successfully completed a course of study
GRAPHICAL|2|Relating to visual diagrams, drawings, or images
GREATNESS|2|The quality of being exceptionally distinguished or eminent
GUARDIANS|2|People who protect or have legal custody of someone
HARASSING|2|Subjecting someone to persistent, aggressive pressure or intimidation
HAZARDOUS|2|Risky or dangerous, especially to health or safety
HEADLINES|2|the bold titles printed atop news stories
HEALTHIER|2|More free from illness; in better physical condition
HEARTFELT|2|Expressed with genuine, deep emotion
HEPATITIS|2|A disease marked by inflammation of the liver
HIGHLANDS|2|A mountainous region, especially of Scotland
HIGHLIGHT|2|The best or most memorable part of an event
HILARIOUS|2|Extremely funny or amusing
HINDSIGHT|2|Understanding of an event only after it occurs
HISPANICS|2|People of Spanish-speaking Latin American descent
HOLLYWOOD|2|Los Angeles district synonymous with the American film industry
HOLOCAUST|2|Mass destruction, especially the genocide of Jews by the Nazis in World War II
HOMESTEAD|2|A house and the land around it, especially a farm
HONORABLE|2|Deserving respect or high esteem
HORRIFIED|2|Feeling extreme fear, shock, or disgust
HORSEBACK|2|Astride a mounted animal, as when touring a ranch in the saddle
HOSPITALS|2|Institutions where sick or injured people receive medical care
HOUSEHOLD|2|All the people living together in one home
HOUSEWIFE|2|A married woman who manages the domestic affairs of her home
HURRICANE|2|A violent tropical storm with very strong winds
HYDRAULIC|2|Operated by the pressure of a liquid moved through pipes
IDENTICAL|2|Exactly the same in every detail
IGNORANCE|2|Lack of knowledge or awareness
ILLEGALLY|2|In a manner contrary to or forbidden by law
ILLUSIONS|2|False perceptions or beliefs that misrepresent reality
IMAGINING|2|Forming a mental picture of something not currently present
IMBALANCE|2|A lack of proportion between things
IMITATION|2|A copy of something original, often made to deceive
IMMEDIATE|2|Happening at once, without delay
IMMIGRANT|2|A person who comes to live permanently in a foreign country
IMPARTIAL|2|Treating all sides equally, without bias
IMPATIENT|2|Eager to act without delay.
IMPENDING|2|About to happen soon; imminent.
IMPLEMENT|2|Put a plan or decision into effect
IMPORTANT|2|Of great significance or value
IMPORTING|2|Bringing goods or services into a country from abroad
IMPRESSED|2|Filled with admiration or respect for something
IMPROVING|2|Becoming better in quality or condition
INABILITY|2|Lack of the power or capacity to do something
INCAPABLE|2|Not having the ability or means to do something
INCENTIVE|2|A thing that encourages or spurs someone to act
INCIDENTS|2|Individual events or occurrences, often notable or troublesome
INCLUSION|2|The act of making someone or something part of a group
INCLUSIVE|2|Not excluding any group or section of society
INDICATES|2|Points out or shows, as a sign does
INDICATOR|2|A sign or signal that shows a condition or trend
INDONESIA|2|Southeast Asian archipelago nation whose capital is Jakarta
INFIRMARY|2|A room or place providing care for the sick, especially at a school or institution
INFLATION|2|A general rise in prices over time
INFLICTED|2|Caused someone to suffer something unpleasant
INFLUENZA|2|A contagious viral infection causing fever, aches, and respiratory symptoms
INFORMING|2|Giving someone knowledge or facts about something
INGENIOUS|2|Cleverly inventive or resourceful
INHABITED|2|Lived in by people or animals
INHERITED|2|received money, property, or a trait from someone after their death
INITIATED|2|Set in motion or caused to begin
INJECTION|2|The act of forcing a fluid, especially medicine, into the body with a needle
INJUSTICE|2|A violation of someone's rights; unfairness
INNOCENCE|2|The state of being blameless or free of guilt
INQUIRIES|2|Formal requests for information
INSERTION|2|The act of putting something into something else
INSISTING|2|To demand something forcefully.
INSPECTOR|2|An official who examines things to ensure standards are met
INSPIRING|2|Filling one with the urge to do or feel something creative or worthwhile
INSTINCTS|2|Innate patterns of behavior triggered by certain stimuli, not learned.
INSULTING|2|Rude and offensive in manner
INSURANCE|2|A contract giving financial protection against loss
INTELLECT|2|The capacity for rational thought and understanding
INTENDING|2|Planning or meaning to do something in the future
INTENSELY|2|In a very strong or extreme manner
INTENTION|2|An aim or plan that one means to carry out
INTERESTS|2|Activities or subjects one enjoys
INTERFACE|2|The point of interaction between a user and a computer
INTERFERE|2|To become involved in a situation in an unwanted or intrusive way.
INTERIORS|2|The inside parts or spaces of buildings or vehicles
INTERPRET|2|To explain or clarify the meaning of something
INTERRUPT|2|To break the continuity of something.
INTERVENE|2|To become involved in a situation in order to alter its outcome
INTERVIEW|2|A formal meeting to question or assess a candidate
INTRIGUED|2|Filled with curiosity or fascination
INTRODUCE|2|Bring into use or practice for the first time
INTRUSION|2|The act of entering a place or situation without invitation
INTUITIVE|2|Based on instinctive feeling rather than conscious reasoning.
INVENTION|2|Something newly created through original thought or design
INVISIBLE|2|Unable to be seen by the eye
IRREGULAR|2|Not following the usual pattern or rule
ISLANDERS|2|Residents of a piece of land surrounded by water
ISOLATION|2|The state of being separated from others
JEFFERSON|2|Third president of the United States and primary author of the Declaration of Independence
JERUSALEM|2|Ancient holy city sacred to three major religions
JUDGEMENT|2|The ability to make considered decisions
JUDGMENTS|2|Formal decisions made by a court
KIDNAPPED|2|Seized and held a person unlawfully, often for ransom
KNOWINGLY|2|In a way that shows awareness of what one is doing
KNOWLEDGE|2|Facts and information gained through experience or study
LANDLORDS|2|Individuals who own and rent out property.
LANDMARKS|2|Notable structures or features that help identify a location
LANDSCAPE|2|All the visible features of an area of countryside
LAUNCHING|2|Setting in motion or sending forth, as a rocket or a new product
LAWMAKERS|2|Legislators who create and pass laws
LEGENDARY|2|Remarkably famous or celebrated in stories told over generations
LIBERATED|2|Set free from restriction, control, or oppression.
LIBRARIES|2|Buildings holding collections of books to borrow
LIFESTYLE|2|The habits and manner in which a person lives
LIMESTONE|2|A sedimentary rock composed mainly of calcium carbonate
LINGERING|2|Remaining or persisting longer than expected
LISTENERS|2|People who tune in to hear a broadcast, speech, or podcast.
LISTENING|2|Giving attention to a sound or to someone speaking
LIVERPOOL|2|English port city on the River Mersey
LIVESTOCK|2|Animals raised on a farm for food, milk, or labor
LOCATIONS|2|Particular places or positions
LOGICALLY|2|In a way that follows sound reasoning
LUDICROUS|2|So absurd as to be laughable
MACHINERY|2|Powered mechanical devices considered collectively
MAGAZINES|2|Periodical publications full of articles and pictures
ABANDONING|1|Leaving something or someone behind permanently, without intending to return
ACCOUNTANT|1|A person who keeps or inspects financial records for a living.
ANTARCTICA|1|The icy continent surrounding the South Pole
ANTIBIOTIC|1|A medicine that destroys or inhibits harmful bacteria
APOLOGIZED|1|Expressed regret for a mistake or offense
APPLIANCES|1|Devices or machines designed for household tasks
ARITHMETIC|1|The branch of mathematics dealing with basic operations on numbers.
ASTRONAUTS|1|People trained to travel and work in outer space
BASKETBALL|1|A team sport in which players score by throwing a ball through a raised hoop
BIRTHPLACE|1|The location where someone was born.
BOYFRIENDS|1|Male partners in a romantic, non-marital relationship
CALCULATOR|1|A device used to perform arithmetic quickly and accurately
CELEBRATES|1|Marks an important occasion with festivities
CHECKPOINT|1|A place where travelers or vehicles are stopped for inspection.
CHILDBIRTH|1|The act or process of giving birth to a baby
CHOCOLATES|1|Sweet treats made from cocoa, often given as gifts
CINDERELLA|1|A fairy-tale girl who attends a ball in a magical gown
CLASSROOMS|1|Rooms where students are taught lessons.
COLLEAGUES|1|People one works with, especially in a profession
COMPANIONS|1|People who accompany or spend time with you
COMPETITOR|1|A person or company that competes against another
CONTAINERS|1|Objects used to hold or transport goods.
CONTESTANT|1|A participant in a competition or game show
CORONATION|1|The ceremony of crowning a monarch
CORRECTING|1|Fixing mistakes or errors in something
COUNCILLOR|1|An elected representative serving on a local governing body
CROSSROADS|1|A place where two or more streets meet
DECORATION|1|An object added to make something look more attractive
DECORATIVE|1|Serving to make something look more attractive
DECREASING|1|Becoming smaller or fewer over time
DELIGHTFUL|1|Causing great pleasure or joy; charming
DICTIONARY|1|A reference book listing words and their meanings
DISAPPEARS|1|Ceases to be visible; vanishes.
DISASTROUS|1|Causing great damage or harm
DISCOMFORT|1|A slight feeling of pain or unease
DISPLAYING|1|Showing something openly for others to see
DOWNLOADED|1|Copied data from the internet or a network onto a device.
DOWNSTAIRS|1|On or to a lower floor of a building
EARTHQUAKE|1|A sudden violent shaking of the ground
EVACUATION|1|The process of removing people from a place of danger
EXERCISING|1|Engaging in physical activity to improve fitness
EXHIBITING|1|Publicly showing or displaying something
EXPLOSIONS|1|Sudden violent bursts, as of a bomb
EXTINCTION|1|The state of a species having died out completely
FILMMAKERS|1|People who produce or direct movies
FLASHLIGHT|1|A portable battery-powered light source
FOOTBALLER|1|A person who plays soccer professionally
FOREIGNERS|1|People from another country
FORGETTING|1|Failing to remember something
FOUNDATION|1|The solid base on which a building stands
FRIGHTENED|1|Filled with fear; scared
GATHERINGS|1|Occasions when people come together in groups
GENEROSITY|1|The quality of being willing to give freely
GIRLFRIEND|1|A female romantic partner
GOALKEEPER|1|The player who defends the goal in football or hockey
GOVERNMENT|1|The governing authority of a nation or state
GRADUATING|1|Completing a course of study and receiving a degree or diploma
GREENHOUSE|1|A glass structure used to grow plants in a controlled climate
HARVESTING|1|Gathering a crop from the fields
HEADPHONES|1|A pair of small speakers worn over the ears for private listening.
HELICOPTER|1|An aircraft that flies using horizontal rotating blades
HORIZONTAL|1|Level and parallel to the ground
INACCURATE|1|Not correct or precise
INCOMPLETE|1|Not finished or whole
INGREDIENT|1|A component that forms part of a mixture, especially in cooking
INSTRUCTOR|1|A person who teaches a skill or subject
IRRITATION|1|A feeling of annoyance or slight anger
KILOMETERS|1|Metric units of distance, each equal to one thousand meters
LANDSCAPES|1|Broad views of scenery, or paintings of such views
LIBERALISM|1|A political philosophy favoring individual rights and free markets
LOCOMOTIVE|1|A powered railway vehicle that pulls train carriages
MARVELLOUS|1|Extremely good or pleasing
MICROPHONE|1|A device that converts sound into an electrical signal
MICROSCOPE|1|Instrument that magnifies tiny objects for viewing
MISFORTUNE|1|Bad luck or an unlucky happening
MOTHERHOOD|1|The state of being a female parent
MOTORCYCLE|1|Two-wheeled vehicle driven by an engine
NEIGHBOURS|1|People who live in the house or area next to yours
NIGHTMARES|1|Frightening or unpleasant dreams.
NINETEENTH|1|Coming next after the eighteenth in a sequence
OBJECTIONS|1|Expressions of disapproval or opposition to something.
OPTIMISTIC|1|Expecting good things to happen
ORGANIZERS|1|People responsible for planning and arranging an event
OVERWEIGHT|1|Having more body mass than considered healthy
PEACEFULLY|1|In a calm way, free from disturbance or violence
PERFORMERS|1|People who entertain an audience by acting, singing, or dancing
PHARMACIST|1|A person qualified to prepare and dispense medicinal drugs
PHOTOGRAPH|1|An image captured with a camera
PLAYGROUND|1|An outdoor area equipped with swings, slides, and other equipment for children
PLEASANTLY|1|In a manner that is agreeable or enjoyable
PRINCIPALS|1|Heads of schools or colleges
RAINFOREST|1|A dense, tropical woodland with heavy rainfall
REDUCTIONS|1|Decreases in size, amount, or price
REFRESHING|1|Pleasantly cool and invigorating
RELAXATION|1|The state of being free from tension and anxiety.
REPETITION|1|The act of doing or saying something again.
REPETITIVE|1|Done or occurring many times in the same way
RESTAURANT|1|A place where meals are prepared and served to customers
SANDWICHES|1|Food items made with fillings between slices of bread
SIMPLIFIED|1|Made easier to understand or do
SMARTPHONE|1|A mobile handset that runs apps and connects to the internet
SONGWRITER|1|A person who writes lyrics and melodies
SPECTATORS|1|People who watch an event without taking part
STATIONARY|1|Not moving; fixed in one place
STRAWBERRY|1|Sweet red fruit with tiny seeds on its skin
STRETCHING|1|Extending the muscles or a material to increase its length.
SUBMARINES|1|Vessels designed to operate underwater, especially naval warships
SUNGLASSES|1|Tinted eyewear worn to protect eyes from bright light
SWALLOWING|1|Moving food or drink from the mouth down into the stomach
TELEVISION|1|A device for watching broadcast programs
TOOTHBRUSH|1|Small device with bristles, used to clean one's teeth
TOOTHPASTE|1|A substance used with a brush to clean your teeth
TRIANGULAR|1|Having three sides and three angles
UNEMPLOYED|1|Without a paying job
UNFAMILIAR|1|Not previously known or encountered
UNFINISHED|1|Not brought to completion
VEGETABLES|1|Edible plants such as carrots, peas, and beans
VEGETARIAN|1|A person who does not eat meat
VOCABULARY|1|The body of words used in a particular language or by a person
VOLLEYBALL|1|Team sport played with a net and an inflated ball
WATERMELON|1|Large green fruit with sweet red flesh and black seeds
WHEELCHAIR|1|A seat on rollers used by people who cannot walk
WINDSHIELD|1|The front window of a car that protects occupants from the weather
WONDERLAND|1|A magical or fantastical imaginary place
ACCELERATE|2|To increase in speed
ACCEPTABLE|2|Adequate enough to be allowed or approved
ACCEPTANCE|2|The act of agreeing to or receiving something offered
ACCIDENTAL|2|Happening by chance, not on purpose
ACCOMPLISH|2|To succeed in doing or completing something
ACCUMULATE|2|To gradually gather an increasing amount of something
ACCURATELY|2|In a manner free from error; correctly
ACCUSATION|2|A claim that someone has done something illegal or wrong.
ACCUSTOMED|2|Familiar with something through habit or repeated experience
ACQUAINTED|2|Having personal knowledge of someone or something through prior meeting or experience
ACTIVATION|2|The process of making something operational or turning it on
ADEQUATELY|2|In a manner that is sufficient for a purpose
ADJUSTABLE|2|Capable of being changed or altered.
ADJUSTMENT|2|A small change made to improve accuracy or fit
ADMIRATION|2|A feeling of respect and approval.
ADMISSIONS|2|Fees required to enter a venue or event
ADRENALINE|2|A hormone released in response to stress or excitement
ADVANTAGES|2|Beneficial features or favorable circumstances
ADVENTURES|2|Exciting or risky experiences
ADVERTISED|2|Promoted a product or service publicly
ADVERTISER|2|A person or company that pays to promote products publicly
ADVOCATING|2|Publicly supporting or recommending a policy or cause
AFFORDABLE|2|Reasonably priced; within one's means
AFTERWARDS|2|At a time following an event
AGGRAVATED|2|Made worse, more serious, or more severe
AGGRESSION|2|Hostile or violent behavior or attitude
AGGRESSIVE|2|Ready to attack or confront
AGREEMENTS|2|Formal arrangements settled between two or more parties
ALCOHOLISM|2|A chronic inability to control the urge to drink intoxicating beverages
ALLOWANCES|2|Sums of money given regularly for a specific purpose
ALTERATION|2|A change made to something, often a garment
AMENDMENTS|2|Formal changes made to a law, document, or constitution
AMMUNITION|2|Bullets and shells fired from weapons
ANESTHESIA|2|A medically induced loss of sensation used during surgery
ANIMATIONS|2|Sequences of images that create the illusion of movement
ANNOUNCING|2|Making a public statement about something
ANTICIPATE|2|To expect or predict something before it happens
APARTMENTS|2|Self-contained residential units within a larger building
APPOINTING|2|Choosing someone for a job or role
APPRENTICE|2|Someone learning a trade under a skilled worker.
APPROACHES|2|Comes closer to
ARCHITECTS|2|People who design buildings and oversee their construction
ARTICULATE|2|To express an idea clearly and effectively.
ARTIFICIAL|2|Made by humans rather than occurring in nature
ASSAULTING|2|Physically attacking someone
ASSEMBLIES|2|Gatherings of people for a common purpose, such as a school meeting
ASSEMBLING|2|Fitting parts together to build something
ASSESSMENT|2|An evaluation or appraisal of something
ASSIGNMENT|2|A task or piece of work given to someone
ASSISTANCE|2|Help or support given to someone
ASSISTANTS|2|People who help with tasks or duties
ASSOCIATES|2|Business partners or work colleagues
ASTOUNDING|2|Extremely surprising or impressive
ATMOSPHERE|2|The envelope of gases surrounding a planet
ATTACHMENT|2|A feeling of affection or emotional connection
ATTEMPTING|2|Making an effort to achieve something
ATTENDANCE|2|The number of people present at an event
ATTRACTING|2|Drawing something or someone closer by appeal or interest.
ATTRACTION|2|A feature or site that draws visitors to a place
ATTRACTIVE|2|Pleasing to look at or appealing
AUDITORIUM|2|A large room where audiences gather for performances or speeches
AUSTRALIAN|2|Relating to the country down under
AUTHORISED|2|Given official permission or approval
AUTOMATION|2|The use of machines to do work without human control
AUTOMOBILE|2|A road vehicle powered by an engine and carrying a few passengers
AUTOMOTIVE|2|Relating to motor vehicles
BANKRUPTCY|2|The legal state of being unable to repay one's debts
BEFOREHAND|2|In advance; ahead of a particular time
BEGINNINGS|2|The starting points or origins of something
BEHAVIORAL|2|Relating to the way a person or animal acts
BEHAVIOURS|2|The ways in which a person or animal acts
BENEVOLENT|2|Well-meaning and kindly
BESTSELLER|2|A book or product that sells in large quantities
BIOLOGICAL|2|Relating to living organisms and the science of life
BIOMEDICAL|2|Relating to biology as applied to medical research
BIPARTISAN|2|Supported by both major political parties.
BITTERNESS|2|A sharp, unpleasant flavor, or deep resentment
BLACKBERRY|2|A dark, edible fruit that grows on a thorny bramble
BLACKHAWKS|2|Professional ice hockey team from Chicago
BOUNDARIES|2|Lines marking the limits of an area
BRILLIANCE|2|Exceptional talent, intelligence, or skill.
BROADCASTS|2|Radio or television programs transmitted to the public
BUSINESSES|2|Commercial enterprises or trading companies
CALIFORNIA|2|US state on the Pacific coast, capital Sacramento
CAMOUFLAGE|2|Disguise that blends something into its surroundings
CAMPAIGNED|2|Took part in a series of actions to achieve a political or social goal.
CANDIDATES|2|People who apply for a job or stand for election
CAPITALIZE|2|Use something to advantage
CARTRIDGES|2|Containers holding ammunition, ink, or film
CASUALTIES|2|People killed or injured in war or accidents
CENTENNIAL|2|Relating to a hundredth anniversary
CEREMONIES|2|Formal events held to mark significant occasions
CHALLENGER|2|A person who competes for a title held by another
CHALLENGES|2|Demanding tasks that test one's abilities
CHARACTERS|2|People portrayed in a story or play
CHARITABLE|2|Generous in giving help to those in need
CHESAPEAKE|2|Largest estuary on the Atlantic coast of the U.S.
CHRISTIANS|2|Followers of the teachings of Jesus
CHROMOSOME|2|A thread-like structure of DNA that carries genetic information
CIGARETTES|2|Thin paper cylinders of tobacco for smoking
CLASSMATES|2|Fellow students who share your lessons and school year
COLLAPSING|2|Falling down or caving in suddenly
COLLECTING|2|Gathering items together, often as a hobby
COLLECTION|2|A group of objects gathered together
COLLECTORS|2|People who gather and keep items as a hobby
COLLEGIATE|2|Relating to universities and their students
COLLISIONS|2|Instances of objects violently coming together
COMFORTING|2|Providing consolation or solace.
COMMANDERS|2|Officers who lead and direct military forces.
COMMANDING|2|Having an air of authority
COMMENTING|2|Making remarks or observations about something
COMMITTEES|2|Groups appointed to perform specific functions
COMMITTING|2|Carrying out or performing an act, often a crime
COMMUNISTS|2|People who support common ownership of property and the means of production
COMPASSION|2|Sympathetic concern for the suffering of others
COMPENSATE|2|To give something to make up for a loss or damage
COMPLAINED|2|Expressed dissatisfaction or annoyance about something
COMPLETING|2|Bringing something to a finish, or making it whole
COMPLETION|2|The act of finishing something fully
COMPLIMENT|2|An expression of praise or admiration
COMPREHEND|2|To understand the meaning of something fully.
COMPRESSED|2|Squeezed or condensed into a smaller space
COMPULSORY|2|Required by law, rule, or regulation
CONCEPTION|2|The forming of an idea or plan in the mind
CONCLUDING|2|Final
CONCLUSION|2|The final part of something, or a decision reached
CONDUCTORS|2|People who direct orchestras, or materials that carry electric current
CONFERENCE|2|A formal meeting held for discussion
CONFESSION|2|A formal admission of guilt or wrongdoing
CONFIDENCE|2|A feeling of self-assurance and certainty
CONFIRMING|2|Establishing the truth or correctness of something.
CONFRONTED|2|Faced up to a difficult situation or person
CONGESTION|2|Overcrowding that causes a blockage, especially of traffic.
CONNECTION|2|A relationship or join between two things
CONSCIENCE|2|Inner sense of what is right and wrong
CONSIDERED|2|Thought about carefully
CONSTANTLY|2|Happening all the time without stopping
CONSULTANT|2|An expert who provides professional advice for a fee
CONTACTING|2|Reaching out to someone.
CONTAGIOUS|2|Able to be transmitted from one person to another.
CONTENDERS|2|People competing for a title or prize
CONTINENTS|2|Large landmasses on Earth.
CONTRADICT|2|To assert the opposite of what someone has said
CONTRIBUTE|2|To give money, help, or ideas toward a shared cause
CONTROLLED|2|Kept in check or carefully regulated
CONTROLLER|2|A device or person that regulates or directs something
CONVENIENT|2|Easy to use or well suited to one's needs
CONVERSION|2|The act of changing something into a different form
CONVERTING|2|Changing something from one form, use, or system to another
COORDINATE|2|To organize people or things so they work together effectively
COPENHAGEN|2|The capital city of Denmark.
CORRECTION|2|A change that puts right an error
CORRESPOND|2|To match or be equivalent to something else
CORRUPTION|2|Dishonest conduct by those in positions of power
COUNSELING|2|Professional guidance for personal or emotional problems
COUNSELORS|2|People who give guidance or advice
COURAGEOUS|2|Having the ability to confront fear or adversity.
CRAIGSLIST|2|Popular website for local classified ads
CREATIVITY|2|The ability to produce original and imaginative ideas
CRITICISED|2|Expressed disapproval of someone or something
CRITICISMS|2|Expressions of disapproval based on perceived faults
CRITICIZED|2|Found fault with; judged harshly
CURRENCIES|2|Systems of money in general use in particular countries
CURRICULUM|2|The full set of subjects that make up a course of study
CUSTOMIZED|2|Modified to suit an individual's specific needs
DEALERSHIP|2|A business that sells new or used vehicles
DECORATING|2|Making a space more attractive with ornaments or furnishings
DEDICATION|2|Wholehearted devotion to a task or purpose
DEFENDANTS|2|People accused of a crime in a court of law
DEFICIENCY|2|A lack or shortage of something needed
DELIVERIES|2|Acts of transporting goods to a destination
DELIVERING|2|Bringing and handing over goods to a destination
DELUSIONAL|2|Believing things that are not true, often stubbornly
DEMOCRATIC|2|Relating to government by the whole population
DEMOLISHED|2|Completely destroyed a building or structure
DEMOLITION|2|The action of destroying a building deliberately
DEPARTMENT|2|A division of a large organization or store
DEPENDENCE|2|The state of relying on something or someone
DEPRESSING|2|Causing feelings of sadness or hopelessness
DESCENDING|2|Moving or arranged from higher to lower
DESPICABLE|2|Deserving hatred and contempt
DESTROYING|2|Ruining or wiping out something completely
DETECTIVES|2|People, often police officers, who investigate crimes.
DEVASTATED|2|Overwhelmed with shock or grief
DEVELOPERS|2|People who create software or build property
DIFFERENCE|2|The way in which two things are not alike
DIFFICULTY|2|The state of being hard to do or understand
DIMENSIONS|2|Measurable extents such as length, width, and height
DIMINISHED|2|Made smaller, weaker, or less in degree.
DISAPPOINT|2|To fail to meet someone's hopes or expectations.
DISCHARGED|2|released or allowed to leave, as from hospital or duty
DISCONNECT|2|To separate or break the link between two things
DISCONTENT|2|A feeling of dissatisfaction with one's circumstances
DISCOURAGE|2|To cause someone to lose confidence.
DISCUSSION|2|The action of talking something over
DISNEYLAND|2|Famous California theme park opened in 1955
DISRESPECT|2|Lack of respect or courtesy shown toward someone
DISRUPTIVE|2|Causing disorder or interruption to a process
DISTRACTED|2|Unable to concentrate because attention is diverted elsewhere
DISTRIBUTE|2|To give out shares of something to several recipients
DOMINATING|2|Having control or influence over something.
DOMINATION|2|The exercise of control or power over others
DOWNSTREAM|2|In the direction that a current or river flows
DURABILITY|2|The ability to withstand wear and last a long time
ECOLOGICAL|2|Relating to the relationships between living things and their environment
ECONOMISTS|2|Experts who study the production, distribution and consumption of goods and services
EIGHTEENTH|2|Coming after the seventeenth in order
ELECTORATE|2|All the people in a country or area who are entitled to vote
ELECTRICAL|2|Relating to power that flows through wires
ELEMENTARY|2|Concerned with the simplest or most basic aspects
ELIMINATED|2|Completely removed or got rid of
ELIMINATES|2|Removes or gets rid of something completely
EMPLOYMENT|2|The state of having paid work
ENCOURAGED|2|Gave someone confidence, support, or hope
ENCOURAGES|2|Gives support or confidence to someone
ENDANGERED|2|At risk of extinction
ENGAGEMENT|2|A formal agreement to be married
ENGLISHMAN|2|A male native or citizen of England
ENORMOUSLY|2|To a very great extent
ENTHUSIASM|2|Intense and eager enjoyment or interest
ENTHUSIAST|2|A person who is very interested in a particular activity
ENVISIONED|2|Imagined something as a future possibility
ESSENTIALS|2|Basic items necessary for living.
ESTIMATING|2|Roughly calculating the value, size, or cost of something
ESTIMATION|2|An approximate calculation or judgment of value
EVALUATING|2|Assessing the value or quality of something
EVALUATION|2|A careful assessment of worth, quality, or performance
EVENTUALLY|2|In the end, after some time
EVERYWHERE|2|In or to all places
EXCAVATION|2|The process of digging to uncover buried objects
EXCEPTIONS|2|Cases that do not follow the general rule
EXCHANGING|2|Giving one thing and receiving another in return
EXCITEMENT|2|A feeling of great enthusiasm and eager anticipation
EXECUTIVES|2|Senior managers who run a company
EXHAUSTION|2|Extreme tiredness or depletion of energy
EXHIBITION|2|A public display of art or objects of interest
EXPEDITION|2|An organized journey undertaken for a particular purpose, often exploration
EXPERIMENT|2|A controlled test carried out to discover or prove something
EXPLOSIVES|2|Substances capable of causing a sudden violent blast
EXPRESSIVE|2|Effectively conveying thought or feeling
EXTENSIONS|2|Parts added to something to make it longer or larger
EXTREMISTS|2|People holding radical or fanatical views
FABRICATED|2|Invented or made up in order to deceive
FACILITATE|2|To make an action or process easier
FATALITIES|2|Deaths resulting from an accident or disaster
FAVOURABLE|2|Advantageous or beneficial to a situation
FAVOURITES|2|The people or things that someone likes best
FERTILIZER|2|A substance added to soil to help plants grow
FLASHBACKS|2|Sudden, vivid memories of past events that interrupt the present
FLATTERING|2|Making someone appear more attractive than they really are
FORMATIONS|2|Arrangements of people or things in a particular pattern
FOURTEENTH|2|Coming after the thirteenth in a sequence
FRESHWATER|2|Relating to lakes, rivers, or other non-salty sources
FRIENDSHIP|2|The warm bond shared by people who like and trust each other
FUTURISTIC|2|Having a very modern, advanced, ahead-of-its-time style
GENERATING|2|Producing or bringing something into existence
GENERATORS|2|Machines that convert mechanical energy into electrical power
GEOGRAPHIC|2|Relating to the physical features of the earth's surface
GRADUATION|2|The ceremony of receiving an academic diploma
GUARANTEED|2|Promised with full certainty or assurance
GUARANTEES|2|Formal promises that something will be done or is true.
GUIDELINES|2|Recommended rules or principles for conduct
HEALTHCARE|2|The organized provision of medical services
HEARTBREAK|2|Overwhelming sorrow or grief
HEMISPHERE|2|One half of the Earth, usually divided by the equator or a meridian
HIGHLIGHTS|2|The most memorable or outstanding parts of an event
HIGHSCHOOL|2|An educational institution for teenagers, typically grades nine through twelve
HISTORIANS|2|People who study and write about the past
HOMOPHOBIA|2|Prejudice or hostility toward gay people
HOMOPHOBIC|2|Showing prejudice or hostility toward gay people
HOMOSEXUAL|2|Attracted romantically to people of the same gender
HONOURABLE|2|Deserving great respect for moral integrity
HORRENDOUS|2|Extremely unpleasant, dreadful, or shocking
HORRIFYING|2|Causing intense shock, fear, or disgust
HORSEPOWER|2|A unit used to measure an engine's output
HOUSEWIVES|2|Married women who run the domestic affairs of their homes
HUMANITIES|2|Academic disciplines studying human culture, like literature and philosophy
HUMILIATED|2|Made to feel ashamed or foolish in front of others.
HYPOTHESIS|2|Theory
IDENTIFIES|2|Establishes or indicates exactly who or what someone or something is
ILLITERATE|2|Unable to read or write
ILLUSTRATE|2|To make clear or explain by using examples, pictures, or diagrams
IMMACULATE|2|Perfectly clean and tidy, without any flaws
IMMIGRANTS|2|People who come to settle permanently in a new country
IMPLEMENTS|2|Puts a plan or decision into effect
IMPORTANCE|2|The state of having great significance or value
IMPOSSIBLE|2|Not able to happen, exist, or be done
IMPRESSIVE|2|Evoking admiration through scale, skill, or quality
IMPROPERLY|2|In a manner not in accordance with accepted standards
IMPROVISED|2|Made or performed spontaneously, without preparation
INADEQUATE|2|Not enough or not good enough for a particular purpose
INCENTIVES|2|Rewards or benefits that motivate someone to take action.
INCREDIBLE|2|So extraordinary as to seem impossible
INDEFINITE|2|Not fixed or precisely determined.
INDICATION|2|A sign or piece of information that suggests something
INDICATORS|2|Signs or measurements that show the state of something
INDIVIDUAL|2|A single person regarded separately from a group
INDONESIAN|2|Of or relating to a Southeast Asian nation made up of thousands of islands
INDUSTRIAL|2|Relating to manufacturing or factories
INDUSTRIES|2|Branches of economic activity, such as manufacturing sectors
INEQUALITY|2|A lack of fairness or of equal treatment
INEVITABLY|2|In a way that is certain to happen
INFECTIOUS|2|Capable of spreading disease from one person to another
INFINITELY|2|To an extremely great extent or without limit
INFLUENCED|2|Had an effect on someone's behavior or opinions
INITIATING|2|Setting something in motion for the first time
INJECTIONS|2|Doses of liquid medicine forced into the body with a needle
INNOVATION|2|A new method, idea, or product
INNOVATIVE|2|Featuring new methods or original ideas
INSIGHTFUL|2|Showing a deep understanding of a situation.
INSPECTION|2|A careful official review or check
INSPECTORS|2|People whose job is to examine something officially.
INSTALLING|2|Putting equipment or software in place for use
INSTITUTED|2|Established or put into effect
INSTITUTES|2|Organizations set up for research, education, or a professional purpose
INSTRUCTED|2|Given directions or orders to do something
INSTRUMENT|2|A tool or device used for delicate or scientific work
INSULATION|2|Material that prevents heat, sound, or electricity from passing through
INTERESTED|2|Showing curiosity or attention toward something
INTERFACES|2|Points where two systems, devices, or people meet and interact
INTERNALLY|2|On the inside; within a body or organization
INTERNSHIP|2|A temporary position with training.
INTERVIEWS|2|Formal sessions in which a person is questioned, often for a job
INTRODUCES|2|Presents someone to another person for the first time
INVALUABLE|2|Extremely useful or indispensable.
INVARIABLY|2|Always, in every case without exception
INVENTIONS|2|The act of creating something new.
INVESTMENT|2|Money put into something to earn a return
INVINCIBLE|2|Too powerful to be defeated or overcome
INVITATION|2|A spoken or written request to attend an event
IRRELEVANT|2|Not connected with or important to the matter at hand
IRRITATING|2|Causing annoyance or discomfort.
JAVASCRIPT|2|A programming language widely used for web development
JOURNALISM|2|The activity of gathering and reporting the news
JOURNALIST|2|A person who writes news for papers or broadcasts
KAZAKHSTAN|2|A country located in Central Asia.
KIDNAPPING|2|The crime of abducting someone and holding them against their will
KILOMETRES|2|Units used to measure distance in the metric system, roughly 0.62 miles each
LABORATORY|2|A room equipped for scientific experiments and research
LIBERATION|2|the act of setting a person or place free
LIGHTHOUSE|2|A tower with a light used for navigation.
LIKELIHOOD|2|the chance that something will happen
LIMITATION|2|A restriction on the size, extent, or scope of something.
LINEBACKER|2|A defensive player in American football positioned just behind the front row
LINGUISTIC|2|Relating to language or the study of language.
LITERATURE|2|Written works such as novels and poetry valued as art
LIVELIHOOD|2|A means of securing the necessities of life, typically through work
LOCALITIES|2|Particular areas, neighborhoods, or districts.
LONELINESS|2|The sad feeling of being alone or without companionship
MANAGEABLE|2|Able to be handled or controlled without excessive difficulty
MANAGEMENT|2|The people who control and direct a business
MANAGERIAL|2|Relating to the running or organizing of a business or team
MASTERMIND|2|A person who plans and directs a complex scheme
MATERIALLY|2|In a way that relates to physical substance or matter
MEANINGFUL|2|Having real importance, purpose, or value
MECHANICAL|2|Relating to or operated by machines or machinery
MEDICATION|2|A drug or substance used to treat an illness
MELANCHOLY|2|A deep, pensive sadness or gloom
MEMBERSHIP|2|The state of belonging to a club, group, or organization
MEMORANDUM|2|A short written message or note, often used in business for internal communication
MENTIONING|2|Referring to something briefly in speech or writing
MIDFIELDER|2|Soccer player who links defense and attack in open play
MILESTONES|2|Significant events or points marking progress
MILLENNIUM|2|A period of one thousand years
MIRACULOUS|2|Remarkable and seemingly impossible to explain
MISCONDUCT|2|Unacceptable or improper behavior, especially by a professional
MISLEADING|2|Giving a false impression
MISSIONARY|2|A person sent abroad to promote a religious faith
MISTAKENLY|2|In a way that is based on an error
MODERATION|2|Restraint in behavior or expression
MONUMENTAL|2|Of great size, importance, or lasting significance
MOSQUITOES|2|Small flying insects known for itchy, disease-carrying bites
MOTIVATING|2|Providing a reason or incentive to act
NATIONALLY|2|Throughout an entire country
NATIONWIDE|2|Extending throughout an entire country
NAVIGATION|2|The act of plotting and steering a course
NEGATIVELY|2|In a way that expresses denial, disapproval, or an unfavorable attitude.
NEGATIVITY|2|A tendency toward pessimism or a downbeat outlook
NEGLIGENCE|2|Failure to take proper care over something
NETWORKING|2|Building professional relationships to advance a career
NEUTRALITY|2|The state of not taking sides in a dispute
NEWSLETTER|2|A regularly distributed publication with updates for subscribers
NEWSPAPERS|2|Printed publications reporting current events, issued daily or weekly
NOMINATION|2|The act of proposing someone for an award or office
NOTEWORTHY|2|Worth paying attention to; remarkable
NOTICEABLE|2|Easily seen or evident
NOTICEABLY|2|In a manner that is easy to observe or detect; evidently.
OBLIGATION|2|A duty or commitment one is bound to fulfill
OBLIGATORY|2|Required by rule or law
OCCASIONAL|2|Happening from time to time rather than regularly
OCCUPATION|2|A person's regular job or profession
OCCURRENCE|2|An event or incident that takes place
OPPRESSIVE|2|Harsh and cruel in exerting authority or power
ORGANISING|2|Arranging elements into a structured, coordinated system
ORGANIZING|2|Putting into a structured or ordered arrangement
ORIGINATED|2|Came into being; started from a particular point
ORNAMENTAL|2|Serving as decoration rather than practical use
OVERLOOKED|2|Failed to notice or consider
OVERSEEING|2|Supervising or managing a task or process
OVERTURNED|2|Flipped upside down, or reversed by a higher authority
PANCREATIC|2|Relating to the organ that regulates blood sugar and aids digestion
PARAGRAPHS|2|Sections of text that contain a group of sentences.
PARENTHOOD|2|The state of raising and caring for one's own child or children
PARLIAMENT|2|A national legislative assembly that makes laws
PARTNERING|2|Joining with another person or group in a joint activity
PASSENGERS|2|People traveling in a vehicle but not operating it
PASSIONATE|2|Showing or driven by intense emotion or enthusiasm
PEDESTRIAN|2|A person traveling on foot.
PERCENTAGE|2|A rate or amount expressed in hundredths
PERCUSSION|2|Musical instruments played by striking, shaking, or scraping
PERFECTION|2|The state of being complete and without flaws
PERIPHERAL|2|Relating to the outer edge or area, away from the center.
PERMISSION|2|Official consent allowing someone to do something
PERMITTING|2|allowing something to take place
PERSISTENT|2|Continuing firmly despite difficulty or opposition
PERSUASIVE|2|Able to convince others through effective argument
PESTICIDES|2|Chemical substances used to kill insects and other pests
PHENOMENAL|2|Remarkable or extraordinary; highly exceptional
PHILIPPINE|2|Relating to a Southeast Asian island nation whose capital is Manila
PILGRIMAGE|2|A journey to a sacred place made out of religious devotion
PIONEERING|2|Involving new ideas or methods; groundbreaking
PLANTATION|2|A large estate where crops like cotton or sugar are grown
PLAYWRIGHT|2|A person who writes scripts for theatrical performances
POLITICIAN|2|A person who holds or seeks elected office
POPULATION|2|The total number of inhabitants of a place
PORTUGUESE|2|Relating to the country whose capital is Lisbon, or its language
POSITIONED|2|Placed in a particular location
POSITIVELY|2|In a way that expresses affirmation or certainty
POSTSEASON|2|the playoff period that follows a sport's regular schedule
POWERHOUSE|2|A person or organization with great strength, energy, or influence
PRACTICING|2|Repeatedly performing an activity to improve a skill
PRACTISING|2|Repeating an activity to improve a skill
PRECAUTION|2|An action taken in advance to prevent harm
PREDICTING|2|Stating what will happen before it occurs
PREDICTION|2|A statement about what will happen in the future
PREDICTIVE|2|Relating to or able to forecast future events
PREFERABLE|2|More desirable or suitable than an alternative
PREFERENCE|2|A greater liking for one option over another
PRESCRIBED|2|Recommended or ordered as medical treatment
PRESERVING|2|Keeping something in its original state or protecting it from decay
PRESIDENTS|2|Elected heads of a republic
PRETENDING|2|Acting so as to make something appear true when it isn't
PREVENTING|2|Stopping something from happening
PREVENTION|2|The act of stopping something from happening
PREVENTIVE|2|Intended to stop something undesirable from happening
PREVIOUSLY|2|At an earlier time
PRIVILEGES|2|Special rights or advantages granted to a particular person or group
PROCEDURES|2|Established or official ways of carrying out a task
PROCLAIMED|2|Announced officially and publicly
PRODUCTION|2|The process of making or growing goods in quantity
PRODUCTIVE|2|Achieving or yielding a significant amount of results
PROFESSORS|2|Senior teachers at a university
PROFITABLE|2|Yielding financial gain or advantage
PROGRAMMED|2|Gave a computer instructions to perform tasks.
PROGRESSED|2|Moved forward or developed over time
PROGRESSES|2|Moves forward or develops over time
PROHIBITED|2|Formally forbidden by a law or rule
PROMOTIONS|2|Advancements to a higher rank or position
PROPERTIES|2|Distinctive qualities or characteristics of a substance
PROPULSION|2|The force that drives something forward
PROSECUTOR|2|Lawyer who conducts the case against a defendant
PROSPERITY|2|The condition of thriving and being successful
PROSPEROUS|2|Having success or wealth.
PROTECTION|2|The act of keeping someone or something safe
PROTESTERS|2|People who publicly demonstrate their objection to something
PROTESTING|2|Expressing strong objection or disagreement publicly
PROTESTORS|2|People publicly objecting to something
PSYCHIATRY|2|The branch of medicine dealing with mental disorders.
PSYCHOLOGY|2|The scientific study of the mind and behaviour
PUBLISHERS|2|Firms that produce and distribute books or newspapers
PUNISHMENT|2|A penalty imposed for an offense or wrongdoing
PURCHASING|2|The act of acquiring goods or services in exchange for money
QUANTITIES|2|Countable amounts or measures of something
QUARANTINE|2|A period of isolation imposed to prevent the spread of disease
QUESTIONED|2|Asked someone things in order to get information
RANDOMIZED|2|Arranged or selected without a predictable pattern, often for fairness in a test
REASONABLE|2|Fair, moderate, and not excessive
REASSURING|2|Serving to restore confidence and dispel fear
REBELLIOUS|2|Resisting authority or defying control, often used to describe defiant behavior.
REBUILDING|2|Constructing something again after damage or destruction.
RECIPIENTS|2|People who receive something, such as a gift or award
RECOGNISED|2|Identified as something previously known (British spelling)
RECOGNIZES|2|Identifies someone or something from previous knowledge
RECOMMENDS|2|Suggests something as being good or suitable
RECONSIDER|2|To think about a decision again, possibly changing it
RECORDINGS|2|Captured audio or video saved for future playback
RECOVERING|2|Returning to health or a normal state
RECREATION|2|Activity done for enjoyment when one is not working
RECRUITING|2|Enlisting new members or employees
REFERENCED|2|Mentioned or cited as a source of information.
REFLECTING|2|Throwing back light or heat from a surface
REFLECTION|2|An image thrown back from a mirror or shiny surface
REFLECTIVE|2|Thinking deeply or showing careful thought
REGULATION|2|An official rule made by an authority
REHEARSALS|2|Practice sessions held in preparation for a performance
REMEMBERED|2|Brought back to mind something from the past
RENOVATION|2|The act of restoring something to a former better condition
REPEATEDLY|2|Again and again
REPOSITORY|2|A place where things are stored
REPRODUCED|2|Made a copy of something
REQUESTING|2|Asking formally for something
RESEARCHED|2|Investigated thoroughly.
RESEARCHER|2|One who conducts systematic study to discover facts
RESEMBLING|2|Having a similar appearance or quality to something else
RESERVOIRS|2|Large natural or artificial lakes used to store water
RESIDENCES|2|Places, especially formal or official ones, where people live
RESPECTFUL|2|Showing deference and esteem toward someone
RESPONDING|2|Reacting or replying to something
RESPONSIVE|2|Reacting quickly and favorably to something
RESTRAINED|2|Kept under control; not displaying strong emotion
RESTRICTED|2|Confined in extent, number, or access
RETIREMENT|2|The period of life after one stops working permanently
SACRIFICED|2|Gave up something valuable for the sake of another
SACRIFICES|2|Things given up for the sake of a greater cause
SAFEGUARDS|2|Measures taken to protect against harm
SATELLITES|2|Man-made objects that orbit a planet
SCHEDULING|2|Arranging events to occur at particular times
SCIENTISTS|2|People who carry out research in a field of knowledge
SCRATCHING|2|To rub the surface with something sharp.
SCREENINGS|2|Organized showings of a film to an audience
SCREENPLAY|2|The written text of a film, including dialogue and scene directions
SCREENSHOT|2|A digital image capturing exactly what currently appears on a computer or phone display
SCRIPTURES|2|Sacred religious writings, such as the Bible or Quran
SCULPTURES|2|Three-dimensional works of art.
SELECTIONS|2|Items chosen from a larger group of possibilities.
SEMIFINALS|2|The penultimate stage of a knockout tournament, one step from the championship match
SEPARATING|2|Dividing something into distinct parts
SEQUENCING|2|Arranging things in a particular order
SETTLEMENT|2|A small community where people make their homes
SHOWCASING|2|Displaying something to its best advantage
SIGNALLING|2|Communicating or indicating something with a gesture or sign
SIGNATURES|2|autographs
SIMPLICITY|2|The quality of being easy to understand
SIMULATION|2|A computer-generated imitation of a real process
SKEPTICISM|2|An attitude of doubt or disbelief toward claims
SOLICITORS|2|Lawyers who advise clients and prepare legal documents, especially in the UK
SOLIDARITY|2|Unity or agreement of feeling among a group
SOUNDTRACK|2|The recorded music that accompanies a film
SPACECRAFT|2|A vehicle built to travel and operate beyond Earth's atmosphere
SPECIALIST|2|An expert devoted to one branch of a field
SPECULATED|2|Formed a theory or guess without firm evidence
SPONSORING|2|Providing financial support for an event or activity
STAGGERING|2|Astonishingly large or impressive; hard to believe
STARVATION|2|Suffering or death caused by extreme lack of food
STEREOTYPE|2|A widely held but oversimplified idea about a type of person or thing
STIMULATED|2|Encouraged increased activity, interest, or growth in something
STRENGTHEN|2|To make or become more powerful or robust
STRONGHOLD|2|A fortress or place of security
STRUCTURES|2|Buildings or engineered frameworks
SUBSCRIBED|2|Arranged to receive a publication or service regularly
SUBSCRIBER|2|A person who pays for regular access to a service or publication
SUBSIDIZED|2|Supported financially, often by a government, to reduce cost
SUBSTITUTE|2|A person or thing that acts in place of another
SUCCEEDING|2|Achieving a desired aim or result
SUCCESSFUL|2|Achieving a desired aim or result
SUCCESSIVE|2|Following one after another without interruption.
SUCCESSORS|2|People who take over a role or position after others
SUFFICIENT|2|Enough to meet a need or purpose
SUGGESTION|2|An idea put forward for consideration
SUMMARIZED|2|Gave a brief statement of the main points
SUPERVISED|2|To oversee or manage activities.
SUPERVISOR|2|A person who oversees the work of others
SUPPORTERS|2|People who back a cause, team, or person
SUPPORTIVE|2|Providing encouragement or emotional help
SURPRISING|2|Causing astonishment because it was not expected
SURROUNDED|2|Enclosed on every side
SUSPICIONS|2|Feelings or thoughts that something is wrong without proof
SWEETHEART|2|A person one loves romantically; a darling
SYSTEMATIC|2|Done according to a fixed plan or system; methodical.
TECHNICIAN|2|A person skilled in the practical application of a science
TECHNOLOGY|2|The application of scientific knowledge for practical purposes
TEMPTATION|2|A strong urge to do something unwise or forbidden
TERRIFYING|2|Causing extreme fear
THANKFULLY|2|Fortunately; expressing relief
THEATRICAL|2|Relating to acting, drama, or the stage
THERAPISTS|2|Professionals who help treat mental or physical conditions
THIRTEENTH|2|Coming next after the twelfth in a numbered sequence
THOUGHTFUL|2|Showing careful consideration for others' feelings
TOUCHDOWNS|2|A scoring play in American football.
TOURNAMENT|2|A series of contests between many competitors
TRADITIONS|2|Long-established customs handed down through generations
TRANSCRIPT|2|A written copy of spoken words, such as a trial or interview
TRANSFORMS|2|Changes greatly in appearance, form, or nature
TRANSLATED|2|Converted words from one language into another
TRANSLATES|2|Converts words into another language
TRANSLATOR|2|A person who converts text or speech into another language
TRANSPLANT|2|The transfer of an organ or tissue from one body to another
TRAVELLERS|2|People journeying from one place to another
TRAVELLING|2|Going from one place to another, especially over a distance
TREATMENTS|2|Medical procedures or therapies given to cure an illness
TREMENDOUS|2|Extremely great in scale, amount, or intensity
TRIUMPHANT|2|Having achieved a great success or victory
ULTRASOUND|2|A medical imaging technique using sound waves.
UNAFFECTED|2|Not influenced or changed by something
UNDEFEATED|2|Having never lost a game or match
UNDENIABLE|2|Impossible to deny or dispute
UNDERGOING|2|Experiencing or being subjected to something
UNDERNEATH|2|In a position directly beneath something
UNDERSTAND|2|To grasp the meaning of something
UNDERSTOOD|2|Grasped the meaning of something
UNDERWATER|2|Located or happening beneath the surface of the sea
UNEXPECTED|2|Not anticipated or foreseen
UNIVERSITY|2|An institution of higher learning and research
UNOFFICIAL|2|Not sanctioned or authorized by any formal authority
UNPLEASANT|2|Causing discomfort or irritation
UNRELIABLE|2|Not able to be trusted or depended on
UPBRINGING|2|The way a child is raised and taught values
VEGETATION|2|Plant life collectively found in a particular area.
VENEZUELAN|2|Relating to a South American country whose capital is Caracas
VERTICALLY|2|In an up-and-down direction
VETERINARY|2|Relating to the medical treatment of animals
VIBRATIONS|2|Rapid back-and-forth movements of an object
VICTORIOUS|2|Having won a victory.
VIETNAMESE|2|Relating to a Southeast Asian nation known for pho and ao dai
VIGOROUSLY|2|In a strong, forceful, and energetic manner
VIOLATIONS|2|Acts of breaking a law, rule, or agreement
VISIBILITY|2|The distance one can see clearly under given conditions
VISITATION|2|An official or formal call, often made for inspection or blessing
VOLUNTEERS|2|People who give their time and effort without pay
VULNERABLE|2|Exposed to the possibility of being attacked or harmed
WAREHOUSES|2|Large buildings used for storing goods
WASTEWATER|2|Used liquid runoff from homes and industry that must be treated before disposal or reuse.
WEAKNESSES|2|Faults or vulnerabilities in a person's character
WHISPERING|2|Speaking very softly using breath rather than the vocal cords
WITCHCRAFT|2|The practice of magic using spells and rituals
WITNESSING|2|To see an event take place.
WORTHWHILE|2|Deserving of the time, money, or effort spent
YOUNGSTERS|2|Children or young people.
ABORIGINAL|3|Relating to the first known inhabitants of a region, especially Australia
ABSOLUTELY|3|Completely and without any qualification
ABSORPTION|3|The process of taking in a substance, such as liquid or gas
ACCESSIBLE|3|Able to be reached, entered, or easily understood
ACCORDANCE|3|The state of agreeing or conforming, as with a rule
ACCOUNTING|3|The practice of recording and reporting financial transactions
ACCREDITED|3|Officially recognized as meeting a required standard
ACTIVITIES|3|Things done for a purpose or for enjoyment
ADAPTATION|3|The process of adjusting to new conditions
ADDITIONAL|3|Added on; more than what already exists
ADDRESSING|3|Dealing with a matter, or writing delivery details on an envelope
ADMINISTER|3|To manage or oversee.
ADOLESCENT|3|A young person in the teenage years
AFFILIATED|3|Officially attached or connected to a larger organization
AFFILIATES|3|Organizations that are connected with a larger organization.
ALGORITHMS|3|Step-by-step procedures for solving problems or performing computations.
ALLEGATION|3|A claim or assertion made without proof.
ALLEGIANCE|3|Loyalty or commitment to a group, cause, or leader.
ALLOCATION|3|The process of distributing resources for a particular purpose
ALTOGETHER|3|Wholly, or taking everything into account
AMBASSADOR|3|Envoy
ANALYTICAL|3|Relating to or using logical reasoning and detailed examination
APOCALYPSE|3|An event causing total devastation or the end of the world
APPARENTLY|3|as far as one knows or can see
APPEARANCE|3|The way that someone or something looks to others
APPLICABLE|3|Relevant or appropriate to a particular situation
APPLICANTS|3|People who formally request a job, place, or grant
APPRECIATE|3|To recognize the full value or worth of something
APPROACHED|3|Came closer to in space or time
ARCHBISHOP|3|The senior church leader who oversees an entire province of dioceses.
ASSOCIATED|3|Linked or related to something else
ASSUMPTION|3|A thing accepted as true without proof
ATROCITIES|3|extremely wicked or cruel acts, often committed during war
ATTRIBUTED|3|Regarded as being caused by or the work of someone
ATTRIBUTES|3|Qualities regarded as characteristic of a person or thing
AUTHORIZED|3|Gave official permission or sanction for something
AUTONOMOUS|3|Having the freedom to govern itself or act independently.
BACKGROUND|3|The part of a scene that lies behind the main subject
BARGAINING|3|The act of negotiating terms before reaching an agreement
BELONGINGS|3|Personal items or possessions.
BENEFICIAL|3|Producing good results or a favorable effect
BORDERLINE|3|On or near the border
BRIGHTNESS|3|The quality of being bright.
CALCULATED|3|Worked out mathematically, or done with deliberate intent
CAPABILITY|3|The capacity or power to perform a task
CAPACITIES|3|The maximum amounts something can contain or hold
CAPITALISM|3|An economic system based on private ownership and profit
CAPITALIST|3|A person who invests money in business ventures for profit
"""
}
