<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Carbon\Carbon;

class Dipesan extends Model
{
    protected $table = 'dipesan';
    protected $primaryKey = 'dipesan_id';

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'dipesan_id', 'menu_id', 'pesanan_id'
    ];
}
