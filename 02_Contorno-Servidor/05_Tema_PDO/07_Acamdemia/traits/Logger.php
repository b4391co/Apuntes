<?php
namespace traits\Logger;
class Logger {
    public function log(string $msg)
    {
        $info = [
            "__CLASS__" => __CLASS__,
            " get_class()" => get_class(),
            "get_called_class()" => get_called_class(),
        ];
        echo '<pre style="color:red">';
        print_r($info);
        echo date('Y-m-d h:i:s') . ':' . $msg . '<br/>';
        echo '</pre>';
    }
}