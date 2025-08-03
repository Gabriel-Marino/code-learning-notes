## Have the objective to offer a more precise way to position, align and distribute the space between containers, even if their sizes are unknown or dynamics.

## The idea is is to give to the container the hability to change height and width of the itens inside him to better fill the availabre space.

## flexbox don't suppose a direction, instead of block which is vertical and inline which is horizontal.

## properties:
* **main axis:** the main axis of the flexbox, don't have a defined direction, the direction will depend in the way the items are distributed.
* **main-start | main-end:** the limits of the flexbox, the flex items are dipossed in the direction of the main axis from the main start to the main end.
* **main size:** the size of the flexbox in the direction of the of the main axis.
* **cross axis:** the perpendicular axis to the main axis.
* **cross-start | cross-end:** the direction where the items are distributed in the corss axis.
* **cross size:** the size of the cross axis. (if the main axis are horizontal, then the cross axis is vetical so the cross size will be the width).

## css properties - parent:
* **display: flex | inline-flex | block-flex;** define the container as flexbox.
* **flex-direction: row | row-reverse | column | column-reverse;** define the direction of the main axis.
* **flex-wrap: nowrap | wrap | wrap-reverse;** by standard flex itens will be forced to be in one line, this can modify how this act, to distributed in more lines.
* **flex-flow: &lt;flex-direction option&gt; &lt;flex-wrap option&gt;;** combine flex-direction and flex-wrap properties.
* **justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly;** define the align in the direction of the mais axis.
* **align-items: stretch | flex-start | flex-end | center | baseline;** define how the flex items are align inside each line along the cross axis.
* **align-content: stretch | flex-start | flex-end | center | space-between | space-around;** define how each line are align along the cross axis.
* **gap, row-gap, column-gap: &lt;size&gt;:** define the distance between each flex items, don't affect border and margin. 
