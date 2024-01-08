import unittest

from flask import json

from openapi_server.models.api_v1_accounts_post_request import ApiV1AccountsPostRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTODOSecurityController(BaseTestCase):
    """TODOSecurityController integration test stubs"""

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_post(self):
        """Test case for api_v1_accounts_post

        
        """
        api_v1_accounts_post_request = openapi_server.ApiV1AccountsPostRequest()
        headers = { 
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_accounts_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
