package com.app.appauladsm.viewModel

import com.app.appauladsm.roomDB.Pessoa
import com.app.appauladsm.roomDB.PessoaDatabase

class Repository(val db: PessoaDatabase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa) {
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoas() {
        db.pessoaDao().getAllPessoas()
    }
}
