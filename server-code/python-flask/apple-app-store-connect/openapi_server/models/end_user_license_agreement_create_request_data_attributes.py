from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EndUserLicenseAgreementCreateRequestDataAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, agreement_text=None):  # noqa: E501
        """EndUserLicenseAgreementCreateRequestDataAttributes - a model defined in OpenAPI

        :param agreement_text: The agreement_text of this EndUserLicenseAgreementCreateRequestDataAttributes.  # noqa: E501
        :type agreement_text: str
        """
        self.openapi_types = {
            'agreement_text': str
        }

        self.attribute_map = {
            'agreement_text': 'agreementText'
        }

        self._agreement_text = agreement_text

    @classmethod
    def from_dict(cls, dikt) -> 'EndUserLicenseAgreementCreateRequestDataAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndUserLicenseAgreementCreateRequest_data_attributes of this EndUserLicenseAgreementCreateRequestDataAttributes.  # noqa: E501
        :rtype: EndUserLicenseAgreementCreateRequestDataAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def agreement_text(self) -> str:
        """Gets the agreement_text of this EndUserLicenseAgreementCreateRequestDataAttributes.


        :return: The agreement_text of this EndUserLicenseAgreementCreateRequestDataAttributes.
        :rtype: str
        """
        return self._agreement_text

    @agreement_text.setter
    def agreement_text(self, agreement_text: str):
        """Sets the agreement_text of this EndUserLicenseAgreementCreateRequestDataAttributes.


        :param agreement_text: The agreement_text of this EndUserLicenseAgreementCreateRequestDataAttributes.
        :type agreement_text: str
        """
        if agreement_text is None:
            raise ValueError("Invalid value for `agreement_text`, must not be `None`")  # noqa: E501

        self._agreement_text = agreement_text
