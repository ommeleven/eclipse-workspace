################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/Basic\ Syntax;If.cpp 

OBJS += \
./src/Basic\ Syntax;If.o 

CPP_DEPS += \
./src/Basic\ Syntax;If.d 


# Each subdirectory must supply rules for building sources it contributes
src/Basic\ Syntax;If.o: ../src/Basic\ Syntax;If.cpp src/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"src/Basic Syntax;If.d" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


