<?php   
class MiClase {
    public const MY_PLUBIC = 'public';
    protected const MY_PROTECTED = 'protected';
    private const MY_PRIVATE = 'private';
    
    public function foo(){
        echo self::MY_PLUBIC;
        echo self::MY_PROTECTED;
        echo self::MY_PRIVATE;
    }
}
