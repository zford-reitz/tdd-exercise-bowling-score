 * How do we know when the game is finished?
  * When the final frame is finished!
  * How do we know that it's the final frame? -> Tenth frame is always the final frame

 * How do we know when a frame is finished?
  * 10th frame: three rolls or two with no bonus rolls

 * We're tracking the score in Game, but Frame also seems to need to track how many pins were knocked down (to know whether it's complete). Maybe the Frames could keep track of their score (and the game just queries the frames for their scores)?