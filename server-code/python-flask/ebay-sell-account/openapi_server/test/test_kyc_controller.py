import unittest

from flask import json

from openapi_server.models.kyc_response import KycResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestKycController(BaseTestCase):
    """KycController integration test stubs"""

    def test_get_kyc(self):
        """Test case for get_kyc

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/kyc',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
