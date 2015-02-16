Project: Step Sequencer [app name TBD]
Team: Araumabe

Ultimate goals:
Create a fun, user-friendly musical instrument based on a step-sequencer style of notation
Have the application produce its own sounds, and potentially export tracks. 
Product vision:
We will build a mobile application that enables the user (musically inclined or not) to create a melodic sequence of notes.  While the initial product will be rather simple (1 instrument, fixed length of sequence), it is our goal to add as much musical complexity as possible while still maintaining the intuitiveness and user-friendly setup of the step sequencer. 
Audience for May launch:
While this app will primarily be tested among macalester students, the goal of this application is to have as broad an appeal as possible.  It may be helpful to share this application with music students as well as non-music students
Risks:
May take a bit to learn how to program audio playback and queuing.
Step sequencers are a fairly common technology, one challenge of this project will be implementing a design process that works well for us instead of borrowing from others. 
Maybe some memory constraints (not sure if we will be using csound to synthesize sounds (less memory, more cpu), or use them to access .wav files (more memory, less cpu)).


Phases & timeline: 
MVP - The app is just one page, containing a play/stop button, and a 16*16 grid of selectable notes (dimensions are 2 octaves of a scale by 2 bars of music)
Initially we will start with one instrument (synthesizer), at one tempo, in one scale (C Minor)
Include a settings page where the user can select tempo, scale, and volume
Add drum programming (This will be a new instrument that plays alongside the synthesizer, giving the song a backing beat)
Add multiple synthesizers for the user to choose from. 
add a save feature

Resources: 
Audio Engine: We will most likely be programming our sounds through Csound, an objective-C based audio programming application
http://www.csounds.com/
Java sound engine
http://technet.weblineindia.com/web/change-the-pitch-of-audio-using-java-sound-api/










Figure out how to make sounds
How to make a “sensitive” grid (individual 

