<?php
const MAX_ITERATIONS = 20;
$i = 1;

while ($i < MAX_ITERATIONS) {
    echo "<p> $i </p>";
    $buffer = ob_get_contents();
    $i++;
}
echo "<p> \$i vale $i</p>";