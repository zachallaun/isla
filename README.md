# Isla

A programming language for young children.

## Language guide

https://github.com/maryrosecook/isla/blob/master/languageguide.md

## Story writing guide

https://github.com/maryrosecook/isla/blob/master/storyenvironmentguide.md

## Quick start

### Setup

Check out the Isla source code from: `https://github.com/maryrosecook/isla`

Install Leiningen: `https://github.com/technomancy/leiningen/`

### Start the server

    $ lein run

### View the site

Navigate to `http://localhost:8801`.

### Play through a story

Navigate to `http://localhost:8801/storytime`

Enter `hear hallway` to play the default story.

Valid story commands, so far:

    look
    look at myself
    go into garden

### Write your own story in the Isla language

Refer to the dedicated guide: https://github.com/maryrosecook/isla/blob/master/storyenvironmentguide.md

### Isla REPL:

Navigate to `http://localhost:8801/code`

Enter commands into the REPL.  Valid expressions, so far:

    age is 1
    garden is a room
    garden summary is 'A bird chirrups.'

### Run the tests

    $ cd path/to/isla/root/
    $ lein test

## License

Open source, under the MIT license.
