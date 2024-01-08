import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_consents_raw_ok_body import PostPaymentsConsentsRawOKBody  # noqa: E501
from openapi_server.models.post_payments_consents_raw_params_body import PostPaymentsConsentsRawParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPIConsentsRawController(BaseTestCase):
    """PIConsentsRawController integration test stubs"""

    def test_payments_consents_raw_post(self):
        """Test case for payments_consents_raw_post

        Extracts the original raw consent given by the aspsp
        """
        body = openapi_server.PostPaymentsConsentsRawParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/consents/raw',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
