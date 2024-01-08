import unittest

from flask import json

from openapi_server.models.credential_enum_push_service import CredentialEnumPushService  # noqa: E501
from openapi_server.models.list_credential_response import ListCredentialResponse  # noqa: E501
from openapi_server.models.notify_v1_credential import NotifyV1Credential  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotifyV1CredentialController(BaseTestCase):
    """NotifyV1CredentialController integration test stubs"""

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_create_credential(self):
        """Test case for create_credential

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(api_key='api_key_example',
                    certificate='certificate_example',
                    friendly_name='friendly_name_example',
                    private_key='private_key_example',
                    sandbox=True,
                    secret='secret_example',
                    type=openapi_server.CredentialEnumPushService())
        response = self.client.open(
            '/v1/Credentials',
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_credential(self):
        """Test case for delete_credential

        
        """
        headers = { 
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Credentials/{sid}'.format(sid='sid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_credential(self):
        """Test case for fetch_credential

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Credentials/{sid}'.format(sid='sid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_credential(self):
        """Test case for list_credential

        
        """
        query_string = [('PageSize', 56),
                        ('Page', 56),
                        ('PageToken', 'page_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/v1/Credentials',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_update_credential(self):
        """Test case for update_credential

        
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        data = dict(api_key='api_key_example',
                    certificate='certificate_example',
                    friendly_name='friendly_name_example',
                    private_key='private_key_example',
                    sandbox=True,
                    secret='secret_example')
        response = self.client.open(
            '/v1/Credentials/{sid}'.format(sid='sid_example'),
            method='POST',
            headers=headers,
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
