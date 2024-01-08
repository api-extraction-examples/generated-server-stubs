import unittest

from flask import json

from openapi_server.test import BaseTestCase


class Test6LogoutController(BaseTestCase):
    """6LogoutController integration test stubs"""

    def test_do_log_out(self):
        """Test case for do_log_out

        
        """
        headers = { 
        }
        response = self.client.open(
            '/api/logout',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
