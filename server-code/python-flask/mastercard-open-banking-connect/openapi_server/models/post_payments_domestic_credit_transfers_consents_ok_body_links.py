from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, sca_redirect=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks - a model defined in OpenAPI

        :param sca_redirect: The sca_redirect of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.  # noqa: E501
        :type sca_redirect: str
        """
        self.openapi_types = {
            'sca_redirect': str
        }

        self.attribute_map = {
            'sca_redirect': 'scaRedirect'
        }

        self._sca_redirect = sca_redirect

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersConsentsOKBodyLinks of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def sca_redirect(self) -> str:
        """Gets the sca_redirect of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.

        Redirect URL for SCA  # noqa: E501

        :return: The sca_redirect of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.
        :rtype: str
        """
        return self._sca_redirect

    @sca_redirect.setter
    def sca_redirect(self, sca_redirect: str):
        """Sets the sca_redirect of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.

        Redirect URL for SCA  # noqa: E501

        :param sca_redirect: The sca_redirect of this PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks.
        :type sca_redirect: str
        """

        self._sca_redirect = sca_redirect