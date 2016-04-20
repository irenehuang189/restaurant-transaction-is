<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Carbon\Carbon;

class Pesanan extends Model
{
    protected $table = 'pesanan';
    protected $primaryKey = 'pesanan_id';

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'pesanan_id', 'nomor_meja', 'jumlah', 'status', 'waktu'
    ];
}
