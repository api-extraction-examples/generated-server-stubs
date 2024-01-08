import unittest

from flask import json

from openapi_server.models.account_type import AccountType  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAccountTypeController(BaseTestCase):
    """AccountTypeController integration test stubs"""

    def test_list_account_types_for_user(self):
        """Test case for list_account_types_for_user

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
