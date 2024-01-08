import unittest

from flask import json

from openapi_server.models.create_env_vars_request_inner import CreateEnvVarsRequestInner  # noqa: E501
from openapi_server.models.env_var import EnvVar  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.set_env_var_value_request import SetEnvVarValueRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEnvironmentVariablesController(BaseTestCase):
    """EnvironmentVariablesController integration test stubs"""

    def test_create_env_vars(self):
        """Test case for create_env_vars

        
        """
        env_vars = [openapi_server.CreateEnvVarsRequestInner()]
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env'.format(account_id='account_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(env_vars),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_env_var(self):
        """Test case for delete_env_var

        
        """
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env/{key}'.format(account_id='account_id_example', key='key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_env_var_value(self):
        """Test case for delete_env_var_value

        
        """
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env/{key}/value/{id}'.format(account_id='account_id_example', id='id_example', key='key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_env_var(self):
        """Test case for get_env_var

        
        """
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env/{key}'.format(account_id='account_id_example', key='key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_env_vars(self):
        """Test case for get_env_vars

        
        """
        query_string = [('context_name', 'context_name_example'),
                        ('scope', 'scope_example'),
                        ('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env'.format(account_id='account_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_env_var_value(self):
        """Test case for set_env_var_value

        
        """
        env_var = openapi_server.SetEnvVarValueRequest()
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env/{key}'.format(account_id='account_id_example', key='key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(env_var),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_env_var(self):
        """Test case for update_env_var

        
        """
        env_var = openapi_server.CreateEnvVarsRequestInner()
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{account_id}/env/{key}'.format(account_id='account_id_example', key='key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(env_var),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
