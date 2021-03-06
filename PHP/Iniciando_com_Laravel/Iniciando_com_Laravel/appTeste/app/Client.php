<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Client extends Model
{
    protected $fillable = ['name','lastname'];

    public function phones(){

        return $this->hasMany('App\Phone');
    }
}
