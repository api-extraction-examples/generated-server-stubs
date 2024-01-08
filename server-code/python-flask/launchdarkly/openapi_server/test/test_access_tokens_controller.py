import unittest

from flask import json

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_token_request import PostTokenRequest  # noqa: E501
from openapi_server.models.token import Token  # noqa: E501
from openapi_server.models.tokens import Tokens  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAccessTokensController(BaseTestCase):
    """AccessTokensController integration test stubs"""

    def test_delete_token(self):
        """Test case for delete_token

        Delete an access token by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens/{token_id}'.format(token_id='token_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_token(self):
        """Test case for get_token

        Get a single access token by ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens/{token_id}'.format(token_id='token_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tokens(self):
        """Test case for get_tokens

        Returns a list of tokens in the account.
        """
        query_string = [('showAll', True)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_token(self):
        """Test case for patch_token

        Modify an access token by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens/{token_id}'.format(token_id='token_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_token(self):
        """Test case for post_token

        Create a new token.
        """
        token_body = openapi_server.PostTokenRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens',
            method='POST',
            headers=headers,
            data=json.dumps(token_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_token(self):
        """Test case for reset_token

        Reset an access token's secret key with an optional expiry time for the old key.
        """
        query_string = [('expiry', 56)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/tokens/{token_id}/reset'.format(token_id='token_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
