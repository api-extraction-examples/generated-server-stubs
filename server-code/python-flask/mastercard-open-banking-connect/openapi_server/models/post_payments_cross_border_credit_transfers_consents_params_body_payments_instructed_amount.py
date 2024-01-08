from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
import re
from openapi_server import util

import re  # noqa: E501

class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, amount=None, currency=None):  # noqa: E501
        """PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount - a model defined in OpenAPI

        :param amount: The amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.  # noqa: E501
        :type amount: float
        :param currency: The currency of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.  # noqa: E501
        :type currency: str
        """
        self.openapi_types = {
            'amount': float,
            'currency': str
        }

        self.attribute_map = {
            'amount': 'amount',
            'currency': 'currency'
        }

        self._amount = amount
        self._currency = currency

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.  # noqa: E501
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
        """
        return util.deserialize_model(dikt, cls)

    @property
    def amount(self) -> float:
        """Gets the amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.

        amount value  # noqa: E501

        :return: The amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount: float):
        """Sets the amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.

        amount value  # noqa: E501

        :param amount: The amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.
        :type amount: float
        """
        if amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501
        if amount is not None and amount <= 0:  # noqa: E501
            raise ValueError("Invalid value for `amount`, must be a value greater than `0`")  # noqa: E501

        self._amount = amount

    @property
    def currency(self) -> str:
        """Gets the currency of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.

        Currency code  # noqa: E501

        :return: The currency of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency: str):
        """Sets the currency of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.

        Currency code  # noqa: E501

        :param currency: The currency of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.
        :type currency: str
        """
        if currency is None:
            raise ValueError("Invalid value for `currency`, must not be `None`")  # noqa: E501
        if currency is not None and not re.search(r'^[A-Z]{3}$', currency):  # noqa: E501
            raise ValueError("Invalid value for `currency`, must be a follow pattern or equal to `/^[A-Z]{3}$/`")  # noqa: E501

        self._currency = currency
