from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Tip(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, amount=None, currency=None):  # noqa: E501
        """Tip - a model defined in OpenAPI

        :param amount: The amount of this Tip.  # noqa: E501
        :type amount: int
        :param currency: The currency of this Tip.  # noqa: E501
        :type currency: str
        """
        self.openapi_types = {
            'amount': int,
            'currency': str
        }

        self.attribute_map = {
            'amount': 'amount',
            'currency': 'currency'
        }

        self._amount = amount
        self._currency = currency

    @classmethod
    def from_dict(cls, dikt) -> 'Tip':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Tip of this Tip.  # noqa: E501
        :rtype: Tip
        """
        return util.deserialize_model(dikt, cls)

    @property
    def amount(self) -> int:
        """Gets the amount of this Tip.

        A tip for the driver in cents. To be charged to the user's default charge account.  # noqa: E501

        :return: The amount of this Tip.
        :rtype: int
        """
        return self._amount

    @amount.setter
    def amount(self, amount: int):
        """Sets the amount of this Tip.

        A tip for the driver in cents. To be charged to the user's default charge account.  # noqa: E501

        :param amount: The amount of this Tip.
        :type amount: int
        """
        if amount is not None and amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._amount = amount

    @property
    def currency(self) -> str:
        """Gets the currency of this Tip.

        The currency in which you want to tip. e.g. USD  # noqa: E501

        :return: The currency of this Tip.
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency: str):
        """Sets the currency of this Tip.

        The currency in which you want to tip. e.g. USD  # noqa: E501

        :param currency: The currency of this Tip.
        :type currency: str
        """

        self._currency = currency