import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_payment_status_ok_body import PostPaymentsSepaCreditTransfersPaymentStatusOKBody  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_payment_status_params_body import PostPaymentsSepaCreditTransfersPaymentStatusParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSEPAPaymentsStatusController(BaseTestCase):
    """SEPAPaymentsStatusController integration test stubs"""

    def test_payments_sepa_credit_transfers_payment_status_post(self):
        """Test case for payments_sepa_credit_transfers_payment_status_post

        Get payment status
        """
        body = openapi_server.PostPaymentsSepaCreditTransfersPaymentStatusParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/sepa-credit-transfers/payment-status',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
