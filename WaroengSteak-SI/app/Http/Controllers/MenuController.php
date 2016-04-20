<?php

namespace App\Http\Controllers;

use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Routing\Controller as BaseController;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesResources;

use App\Menu;

class MenuController extends Controller {
  private $noneStatus = 0;

  /* 
   * Memberikan seluruh daftar menu
   */
  public function show() {
    $menu = Menu::select('*')->orderBy('nama')->get();
    return $menu;
  }

  /* 
   * Memberikan seluruh daftar menu yang belum habis
   */
  public function show() {
    $menu = Menu::select('*')->where('status', $noneStatus)->orderBy('nama')->get();
    return $menu;
  }  
}
