import unittest

from flask import json

from openapi_server.models.transfer import Transfer  # noqa: E501
from openapi_server.test import BaseTestCase


class Test3TransferController(BaseTestCase):
    """3TransferController integration test stubs"""

    def test_trasnfer(self):
        """Test case for trasnfer

        
        """
        body = openapi_server.Transfer()
        headers = { 
            'Content-Type': 'application/json',
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/transfer',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
