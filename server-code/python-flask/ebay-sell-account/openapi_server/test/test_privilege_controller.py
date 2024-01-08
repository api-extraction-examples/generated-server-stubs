import unittest

from flask import json

from openapi_server.models.selling_privileges import SellingPrivileges  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPrivilegeController(BaseTestCase):
    """PrivilegeController integration test stubs"""

    def test_get_privileges(self):
        """Test case for get_privileges

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/privilege',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
