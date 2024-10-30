package com.app.appauladsm.viewModel

import com.app.appauladsm.roomDB.Pessoa
import com.app.appauladsm.roomDB.PessoaDatabase
import kotlinx.coroutines.flow.Flow

class Repository(val db: PessoaDatabase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa) {
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoas(): Flow<List<Pessoa>> =  db.pessoaDao().getAllPessoas()
}