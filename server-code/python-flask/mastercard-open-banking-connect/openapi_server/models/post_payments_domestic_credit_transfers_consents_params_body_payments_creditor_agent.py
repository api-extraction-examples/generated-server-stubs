from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, clearing_system_identification=None, member_identification=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent - a model defined in OpenAPI

        :param clearing_system_identification: The clearing_system_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.  # noqa: E501
        :type clearing_system_identification: str
        :param member_identification: The member_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.  # noqa: E501
        :type member_identification: str
        """
        self.openapi_types = {
            'clearing_system_identification': str,
            'member_identification': str
        }

        self.attribute_map = {
            'clearing_system_identification': 'clearingSystemIdentification',
            'member_identification': 'memberIdentification'
        }

        self._clearing_system_identification = clearing_system_identification
        self._member_identification = member_identification

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def clearing_system_identification(self) -> str:
        """Gets the clearing_system_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.

        System identification:   * 'UK.SortCode' - UK FPS   # noqa: E501

        :return: The clearing_system_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.
        :rtype: str
        """
        return self._clearing_system_identification

    @clearing_system_identification.setter
    def clearing_system_identification(self, clearing_system_identification: str):
        """Sets the clearing_system_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.

        System identification:   * 'UK.SortCode' - UK FPS   # noqa: E501

        :param clearing_system_identification: The clearing_system_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.
        :type clearing_system_identification: str
        """
        allowed_values = ["UK.SortCode"]  # noqa: E501
        if clearing_system_identification not in allowed_values:
            raise ValueError(
                "Invalid value for `clearing_system_identification` ({0}), must be one of {1}"
                .format(clearing_system_identification, allowed_values)
            )

        self._clearing_system_identification = clearing_system_identification

    @property
    def member_identification(self) -> str:
        """Gets the member_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.

        Sort code  # noqa: E501

        :return: The member_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.
        :rtype: str
        """
        return self._member_identification

    @member_identification.setter
    def member_identification(self, member_identification: str):
        """Sets the member_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.

        Sort code  # noqa: E501

        :param member_identification: The member_identification of this PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.
        :type member_identification: str
        """
        if member_identification is None:
            raise ValueError("Invalid value for `member_identification`, must not be `None`")  # noqa: E501
        if member_identification is not None and len(member_identification) > 256:
            raise ValueError("Invalid value for `member_identification`, length must be less than or equal to `256`")  # noqa: E501
        if member_identification is not None and len(member_identification) < 1:
            raise ValueError("Invalid value for `member_identification`, length must be greater than or equal to `1`")  # noqa: E501

        self._member_identification = member_identification
