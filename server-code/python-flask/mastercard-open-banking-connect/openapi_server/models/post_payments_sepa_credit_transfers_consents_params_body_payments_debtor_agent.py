from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bicfi=None):  # noqa: E501
        """PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent - a model defined in OpenAPI

        :param bicfi: The bicfi of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.  # noqa: E501
        :type bicfi: str
        """
        self.openapi_types = {
            'bicfi': str
        }

        self.attribute_map = {
            'bicfi': 'bicfi'
        }

        self._bicfi = bicfi

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsSepaCreditTransfersConsentsParamsBodyPayments_debtorAgent of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.  # noqa: E501
        :rtype: PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bicfi(self) -> str:
        """Gets the bicfi of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.

        Debtor FI  # noqa: E501

        :return: The bicfi of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.
        :rtype: str
        """
        return self._bicfi

    @bicfi.setter
    def bicfi(self, bicfi: str):
        """Sets the bicfi of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.

        Debtor FI  # noqa: E501

        :param bicfi: The bicfi of this PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.
        :type bicfi: str
        """
        if bicfi is None:
            raise ValueError("Invalid value for `bicfi`, must not be `None`")  # noqa: E501
        if bicfi is not None and len(bicfi) > 256:
            raise ValueError("Invalid value for `bicfi`, length must be less than or equal to `256`")  # noqa: E501
        if bicfi is not None and len(bicfi) < 1:
            raise ValueError("Invalid value for `bicfi`, length must be greater than or equal to `1`")  # noqa: E501

        self._bicfi = bicfi
