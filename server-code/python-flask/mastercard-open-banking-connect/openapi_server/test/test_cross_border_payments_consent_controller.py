import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_ok_body import PostPaymentsCrossBorderCreditTransfersConsentsOKBody  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body import PostPaymentsCrossBorderCreditTransfersConsentsParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCrossBorderPaymentsConsentController(BaseTestCase):
    """CrossBorderPaymentsConsentController integration test stubs"""

    def test_payments_cross_border_credit_transfers_consents_post(self):
        """Test case for payments_cross_border_credit_transfers_consents_post

        Request consent initiation via redirect
        """
        body = openapi_server.PostPaymentsCrossBorderCreditTransfersConsentsParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/cross-border-credit-transfers/consents',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
