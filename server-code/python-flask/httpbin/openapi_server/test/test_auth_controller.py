import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestAuthController(BaseTestCase):
    """AuthController integration test stubs"""

    def test_basic_auth_user_passwd_get(self):
        """Test case for basic_auth_user_passwd_get

        Prompts the user for authorization using HTTP Basic Auth.
        """
        headers = { 
        }
        response = self.client.open(
            '/basic-auth/{user}/{passwd}'.format(user='user_example', passwd='passwd_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bearer_get(self):
        """Test case for bearer_get

        Prompts the user for authorization using bearer authentication.
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/bearer',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_digest_auth_qop_user_passwd_algorithm_get(self):
        """Test case for digest_auth_qop_user_passwd_algorithm_get

        Prompts the user for authorization using Digest Auth + Algorithm.
        """
        headers = { 
        }
        response = self.client.open(
            '/digest-auth/{qop}/{user}/{passwd}/{algorithm}'.format(qop='qop_example', user='user_example', passwd='passwd_example', algorithm='MD5'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_digest_auth_qop_user_passwd_algorithm_stale_after_get(self):
        """Test case for digest_auth_qop_user_passwd_algorithm_stale_after_get

        Prompts the user for authorization using Digest Auth + Algorithm.
        """
        headers = { 
        }
        response = self.client.open(
            '/digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after}'.format(qop='qop_example', user='user_example', passwd='passwd_example', algorithm='MD5', stale_after='never'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_digest_auth_qop_user_passwd_get(self):
        """Test case for digest_auth_qop_user_passwd_get

        Prompts the user for authorization using Digest Auth.
        """
        headers = { 
        }
        response = self.client.open(
            '/digest-auth/{qop}/{user}/{passwd}'.format(qop='qop_example', user='user_example', passwd='passwd_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_hidden_basic_auth_user_passwd_get(self):
        """Test case for hidden_basic_auth_user_passwd_get

        Prompts the user for authorization using HTTP Basic Auth.
        """
        headers = { 
        }
        response = self.client.open(
            '/hidden-basic-auth/{user}/{passwd}'.format(user='user_example', passwd='passwd_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
