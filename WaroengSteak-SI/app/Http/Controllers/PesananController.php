<?php

namespace App\Http\Controllers;

use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Routing\Controller as BaseController;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesResources;

use App\Pesanan;

class PesananController extends Controller {
  private $cookingStatus = 'Sedang diproses';
  private $eatingStatus = 'Sudah dihidangkan';
  private $payingStatus = 'Sudah dibayar';

  /*
   * Memberikan seluruh pesanan pada basis data
   * untuk staf bagian depan
   */
  public function showDepan() {
    $menu = Menu::select('*')->where('status', '<>', $payingStatus
          ->join('Dipesan', 'Pesanan.pesanan_id', '=', 'Dipesan.pesanan_id')
          ->join('Menu', 'Menu.menu_id', '=', 'Dipesan.menu_id')
          ->orderBy('waktu')->get();
    return $menu;
  }

  /*
   * Memberikan seluruh pesanan pada basis data 
   * untuk staf bagian dapur dan minuman
   */
  public function showDapur() {
    $menu = Menu::select('*')->where('status', '<>', $payingStatus
          ->join('Dipesan', 'Pesanan.pesanan_id', '=', 'Dipesan.pesanan_id')
          ->join('Menu', 'Menu.menu_id', '=', 'Dipesan.menu_id')
          ->orderBy('waktu')->get();
    return $menu;
  }

  /*
   * Memberikan seluruh pesanan pada basis data
   * untuk staf kasir
   */
  public function showKasir() {
    $menu = Menu::select('*')->where('status', $eatingStatus
          ->join('Dipesan', 'Pesanan.pesanan_id', '=', 'Dipesan.pesanan_id')
          ->join('Menu', 'Menu.menu_id', '=', 'Dipesan.menu_id')
          ->orderBy('waktu')->get();
    return $menu;
  }

  /*
   * Menyimpan pesanan baru
   */
  public function store(Request $request) {
    // TODO: Lengkapi
    $pesanan = new Pesanan();
    return 0;
  }
}
