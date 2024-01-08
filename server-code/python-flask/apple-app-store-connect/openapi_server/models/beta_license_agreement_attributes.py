from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BetaLicenseAgreementAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, agreement_text=None):  # noqa: E501
        """BetaLicenseAgreementAttributes - a model defined in OpenAPI

        :param agreement_text: The agreement_text of this BetaLicenseAgreementAttributes.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'BetaLicenseAgreementAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaLicenseAgreement_attributes of this BetaLicenseAgreementAttributes.  # noqa: E501
        :rtype: BetaLicenseAgreementAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def agreement_text(self) -> str:
        """Gets the agreement_text of this BetaLicenseAgreementAttributes.


        :return: The agreement_text of this BetaLicenseAgreementAttributes.
        :rtype: str
        """
        return self._agreement_text

    @agreement_text.setter
    def agreement_text(self, agreement_text: str):
        """Sets the agreement_text of this BetaLicenseAgreementAttributes.


        :param agreement_text: The agreement_text of this BetaLicenseAgreementAttributes.
        :type agreement_text: str
        """

        self._agreement_text = agreement_text