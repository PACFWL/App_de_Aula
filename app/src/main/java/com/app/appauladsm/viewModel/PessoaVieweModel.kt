package com.app.appauladsm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.appauladsm.roomDB.Pessoa
import kotlinx.coroutines.launch

class PessoaVieweModel(private val repository: Repository): ViewModel() {
    fun upsertPessoa(pessoa: Pessoa) {
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }
}