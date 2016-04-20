<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Carbon\Carbon;

class Menu extends Model
{
    protected $table = 'menu';
    protected $primaryKey = 'menu_id';

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'menu_id', 'nama', 'status', 'jenis', 'harga'
    ];
}
