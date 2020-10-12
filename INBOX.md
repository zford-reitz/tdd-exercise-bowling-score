 * Handle scoring for bonus rolls!
 * We're tracking the score in Game, but Frame also seems to need to track how many pins were knocked down (to know whether it's complete). Maybe the Frames could keep track of their score (and the game just queries the frames for their scores)?

 
 * Tried to make a roll() loop in a game test (while game is not complete, roll). Infinite loop. We need to know when the game (not just the final frame) is over!