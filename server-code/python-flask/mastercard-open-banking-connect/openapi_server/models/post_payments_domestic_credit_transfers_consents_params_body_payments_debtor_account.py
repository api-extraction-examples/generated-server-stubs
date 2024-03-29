from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, identification=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount - a model defined in OpenAPI

        :param identification: The identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.  # noqa: E501
        :type identification: str
        """
        self.openapi_types = {
            'identification': str
        }

        self.attribute_map = {
            'identification': 'identification'
        }

        self._identification = identification

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments_debtorAccount of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
        """
        return util.deserialize_model(dikt, cls)

    @property
    def identification(self) -> str:
        """Gets the identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.

        Debtor account identification, If localInstrument = 'UK.FasterPayments' and debtorAgent was specified then this needs to be a UK Account number (8 digits)  # noqa: E501

        :return: The identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.
        :rtype: str
        """
        return self._identification

    @identification.setter
    def identification(self, identification: str):
        """Sets the identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.

        Debtor account identification, If localInstrument = 'UK.FasterPayments' and debtorAgent was specified then this needs to be a UK Account number (8 digits)  # noqa: E501

        :param identification: The identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.
        :type identification: str
        """
        if identification is None:
            raise ValueError("Invalid value for `identification`, must not be `None`")  # noqa: E501
        if identification is not None and len(identification) > 256:
            raise ValueError("Invalid value for `identification`, length must be less than or equal to `256`")  # noqa: E501
        if identification is not None and len(identification) < 1:
            raise ValueError("Invalid value for `identification`, length must be greater than or equal to `1`")  # noqa: E501

        self._identification = identification
