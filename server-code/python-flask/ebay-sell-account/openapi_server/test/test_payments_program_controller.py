import unittest

from flask import json

from openapi_server.models.payments_program_response import PaymentsProgramResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPaymentsProgramController(BaseTestCase):
    """PaymentsProgramController integration test stubs"""

    def test_get_payments_program(self):
        """Test case for get_payments_program

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payments_program/{marketplace_id}/{payments_program_type}'.format(marketplace_id='marketplace_id_example', payments_program_type='payments_program_type_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
