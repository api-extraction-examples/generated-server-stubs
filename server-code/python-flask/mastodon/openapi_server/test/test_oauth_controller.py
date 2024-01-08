import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.oauth_revoke_post_request import OauthRevokePostRequest  # noqa: E501
from openapi_server.models.oauth_token_post200_response import OauthTokenPost200Response  # noqa: E501
from openapi_server.models.oauth_token_post_request import OauthTokenPostRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestOauthController(BaseTestCase):
    """OauthController integration test stubs"""

    def test_oauth_authorize_get(self):
        """Test case for oauth_authorize_get

        
        """
        query_string = [('response_type', 'response_type_example'),
                        ('client_id', 'client_id_example'),
                        ('redirect_uri', 'redirect_uri_example'),
                        ('scope', 'scope_example'),
                        ('force_login', True)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/oauth/authorize',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_oauth_revoke_post(self):
        """Test case for oauth_revoke_post

        
        """
        oauth_revoke_post_request = openapi_server.OauthRevokePostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
        }
        response = self.client.open(
            '/oauth/revoke',
            method='POST',
            headers=headers,
            data=json.dumps(oauth_revoke_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_oauth_token_post(self):
        """Test case for oauth_token_post

        
        """
        oauth_token_post_request = openapi_server.OauthTokenPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
        }
        response = self.client.open(
            '/oauth/token',
            method='POST',
            headers=headers,
            data=json.dumps(oauth_token_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
