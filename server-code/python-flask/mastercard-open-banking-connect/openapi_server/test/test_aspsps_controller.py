import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_aspsps_ok_body import PostAspspsOKBody  # noqa: E501
from openapi_server.models.post_aspsps_params_body import PostAspspsParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestASPSPsController(BaseTestCase):
    """ASPSPsController integration test stubs"""

    def test_payments_aspsps_post(self):
        """Test case for payments_aspsps_post

        Get list of ASPSPs
        """
        body = openapi_server.PostAspspsParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/aspsps',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
