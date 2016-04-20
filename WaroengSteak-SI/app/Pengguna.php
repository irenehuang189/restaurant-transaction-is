<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Carbon\Carbon;

class Pengguna extends Model
{
    protected $table = 'pengguna';
    protected $primaryKey = 'pengguna_id';

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'pengguna_id', 'nama', 'jabatan', 'username', 'password'
    ];
}
