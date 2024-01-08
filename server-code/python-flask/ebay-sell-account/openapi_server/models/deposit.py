from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.amount import Amount
from openapi_server.models.payment_method import PaymentMethod
from openapi_server.models.time_duration import TimeDuration
from openapi_server import util

from openapi_server.models.amount import Amount  # noqa: E501
from openapi_server.models.payment_method import PaymentMethod  # noqa: E501
from openapi_server.models.time_duration import TimeDuration  # noqa: E501

class Deposit(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, amount=None, due_in=None, payment_methods=None):  # noqa: E501
        """Deposit - a model defined in OpenAPI

        :param amount: The amount of this Deposit.  # noqa: E501
        :type amount: Amount
        :param due_in: The due_in of this Deposit.  # noqa: E501
        :type due_in: TimeDuration
        :param payment_methods: The payment_methods of this Deposit.  # noqa: E501
        :type payment_methods: List[PaymentMethod]
        """
        self.openapi_types = {
            'amount': Amount,
            'due_in': TimeDuration,
            'payment_methods': List[PaymentMethod]
        }

        self.attribute_map = {
            'amount': 'amount',
            'due_in': 'dueIn',
            'payment_methods': 'paymentMethods'
        }

        self._amount = amount
        self._due_in = due_in
        self._payment_methods = payment_methods

    @classmethod
    def from_dict(cls, dikt) -> 'Deposit':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Deposit of this Deposit.  # noqa: E501
        :rtype: Deposit
        """
        return util.deserialize_model(dikt, cls)

    @property
    def amount(self) -> Amount:
        """Gets the amount of this Deposit.


        :return: The amount of this Deposit.
        :rtype: Amount
        """
        return self._amount

    @amount.setter
    def amount(self, amount: Amount):
        """Sets the amount of this Deposit.


        :param amount: The amount of this Deposit.
        :type amount: Amount
        """

        self._amount = amount

    @property
    def due_in(self) -> TimeDuration:
        """Gets the due_in of this Deposit.


        :return: The due_in of this Deposit.
        :rtype: TimeDuration
        """
        return self._due_in

    @due_in.setter
    def due_in(self, due_in: TimeDuration):
        """Sets the due_in of this Deposit.


        :param due_in: The due_in of this Deposit.
        :type due_in: TimeDuration
        """

        self._due_in = due_in

    @property
    def payment_methods(self) -> List[PaymentMethod]:
        """Gets the payment_methods of this Deposit.

        This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.  # noqa: E501

        :return: The payment_methods of this Deposit.
        :rtype: List[PaymentMethod]
        """
        return self._payment_methods

    @payment_methods.setter
    def payment_methods(self, payment_methods: List[PaymentMethod]):
        """Sets the payment_methods of this Deposit.

        This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.  # noqa: E501

        :param payment_methods: The payment_methods of this Deposit.
        :type payment_methods: List[PaymentMethod]
        """

        self._payment_methods = payment_methods
