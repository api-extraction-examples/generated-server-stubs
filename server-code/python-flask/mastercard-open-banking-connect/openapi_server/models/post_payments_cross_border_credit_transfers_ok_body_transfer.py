from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PostPaymentsCrossBorderCreditTransfersOKBodyTransfer(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, payment_id=None, status_reason_code=None, transaction_status=None):  # noqa: E501
        """PostPaymentsCrossBorderCreditTransfersOKBodyTransfer - a model defined in OpenAPI

        :param payment_id: The payment_id of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.  # noqa: E501
        :type payment_id: str
        :param status_reason_code: The status_reason_code of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.  # noqa: E501
        :type status_reason_code: str
        :param transaction_status: The transaction_status of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.  # noqa: E501
        :type transaction_status: str
        """
        self.openapi_types = {
            'payment_id': str,
            'status_reason_code': str,
            'transaction_status': str
        }

        self.attribute_map = {
            'payment_id': 'paymentId',
            'status_reason_code': 'statusReasonCode',
            'transaction_status': 'transactionStatus'
        }

        self._payment_id = payment_id
        self._status_reason_code = status_reason_code
        self._transaction_status = transaction_status

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsCrossBorderCreditTransfersOKBodyTransfer':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsCrossBorderCreditTransfersOKBodyTransfer of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.  # noqa: E501
        :rtype: PostPaymentsCrossBorderCreditTransfersOKBodyTransfer
        """
        return util.deserialize_model(dikt, cls)

    @property
    def payment_id(self) -> str:
        """Gets the payment_id of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        PI / Transfer identification  # noqa: E501

        :return: The payment_id of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :rtype: str
        """
        return self._payment_id

    @payment_id.setter
    def payment_id(self, payment_id: str):
        """Sets the payment_id of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        PI / Transfer identification  # noqa: E501

        :param payment_id: The payment_id of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :type payment_id: str
        """

        self._payment_id = payment_id

    @property
    def status_reason_code(self) -> str:
        """Gets the status_reason_code of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        Rejection reson code  # noqa: E501

        :return: The status_reason_code of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :rtype: str
        """
        return self._status_reason_code

    @status_reason_code.setter
    def status_reason_code(self, status_reason_code: str):
        """Sets the status_reason_code of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        Rejection reson code  # noqa: E501

        :param status_reason_code: The status_reason_code of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :type status_reason_code: str
        """

        self._status_reason_code = status_reason_code

    @property
    def transaction_status(self) -> str:
        """Gets the transaction_status of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        Status of the payment  # noqa: E501

        :return: The transaction_status of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :rtype: str
        """
        return self._transaction_status

    @transaction_status.setter
    def transaction_status(self, transaction_status: str):
        """Sets the transaction_status of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.

        Status of the payment  # noqa: E501

        :param transaction_status: The transaction_status of this PostPaymentsCrossBorderCreditTransfersOKBodyTransfer.
        :type transaction_status: str
        """
        allowed_values = ["ACCP", "ACSC", "ACSP", "ACTC", "ACWC", "ACWP", "PDNG", "RCVD", "RJCT"]  # noqa: E501
        if transaction_status not in allowed_values:
            raise ValueError(
                "Invalid value for `transaction_status` ({0}), must be one of {1}"
                .format(transaction_status, allowed_values)
            )

        self._transaction_status = transaction_status
