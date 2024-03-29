from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.payments_program_onboarding_steps import PaymentsProgramOnboardingSteps
from openapi_server import util

from openapi_server.models.payments_program_onboarding_steps import PaymentsProgramOnboardingSteps  # noqa: E501

class PaymentsProgramOnboardingResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, onboarding_status=None, steps=None):  # noqa: E501
        """PaymentsProgramOnboardingResponse - a model defined in OpenAPI

        :param onboarding_status: The onboarding_status of this PaymentsProgramOnboardingResponse.  # noqa: E501
        :type onboarding_status: str
        :param steps: The steps of this PaymentsProgramOnboardingResponse.  # noqa: E501
        :type steps: List[PaymentsProgramOnboardingSteps]
        """
        self.openapi_types = {
            'onboarding_status': str,
            'steps': List[PaymentsProgramOnboardingSteps]
        }

        self.attribute_map = {
            'onboarding_status': 'onboardingStatus',
            'steps': 'steps'
        }

        self._onboarding_status = onboarding_status
        self._steps = steps

    @classmethod
    def from_dict(cls, dikt) -> 'PaymentsProgramOnboardingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PaymentsProgramOnboardingResponse of this PaymentsProgramOnboardingResponse.  # noqa: E501
        :rtype: PaymentsProgramOnboardingResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def onboarding_status(self) -> str:
        """Gets the onboarding_status of this PaymentsProgramOnboardingResponse.

        This enumeration value indicates the eligibility of payment onboarding for the registered site. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStatus'>eBay API documentation</a>  # noqa: E501

        :return: The onboarding_status of this PaymentsProgramOnboardingResponse.
        :rtype: str
        """
        return self._onboarding_status

    @onboarding_status.setter
    def onboarding_status(self, onboarding_status: str):
        """Sets the onboarding_status of this PaymentsProgramOnboardingResponse.

        This enumeration value indicates the eligibility of payment onboarding for the registered site. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStatus'>eBay API documentation</a>  # noqa: E501

        :param onboarding_status: The onboarding_status of this PaymentsProgramOnboardingResponse.
        :type onboarding_status: str
        """

        self._onboarding_status = onboarding_status

    @property
    def steps(self) -> List[PaymentsProgramOnboardingSteps]:
        """Gets the steps of this PaymentsProgramOnboardingResponse.

        An array of the active process steps for payment onboarding and the status of each step. This array includes the step <strong>name</strong>, step <strong>status</strong>, and a <strong>webUrl</strong> to the <code>IN_PROGRESS</code> step. The step names are returned in sequential order.   # noqa: E501

        :return: The steps of this PaymentsProgramOnboardingResponse.
        :rtype: List[PaymentsProgramOnboardingSteps]
        """
        return self._steps

    @steps.setter
    def steps(self, steps: List[PaymentsProgramOnboardingSteps]):
        """Sets the steps of this PaymentsProgramOnboardingResponse.

        An array of the active process steps for payment onboarding and the status of each step. This array includes the step <strong>name</strong>, step <strong>status</strong>, and a <strong>webUrl</strong> to the <code>IN_PROGRESS</code> step. The step names are returned in sequential order.   # noqa: E501

        :param steps: The steps of this PaymentsProgramOnboardingResponse.
        :type steps: List[PaymentsProgramOnboardingSteps]
        """

        self._steps = steps
